package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartChannelRequest extends StObject {
  
  /**
    * A request to start a channel
    */
  var ChannelId: string = js.native
}
object StartChannelRequest {
  
  @scala.inline
  def apply(ChannelId: string): StartChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartChannelRequest]
  }
  
  @scala.inline
  implicit class StartChannelRequestMutableBuilder[Self <: StartChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelId(value: string): Self = StObject.set(x, "ChannelId", value.asInstanceOf[js.Any])
  }
}
