package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopChannelRequest extends StObject {
  
  /**
    * A request to stop a running channel
    */
  var ChannelId: string = js.native
}
object StopChannelRequest {
  
  @scala.inline
  def apply(ChannelId: string): StopChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopChannelRequest]
  }
  
  @scala.inline
  implicit class StopChannelRequestMutableBuilder[Self <: StopChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelId(value: string): Self = StObject.set(x, "ChannelId", value.asInstanceOf[js.Any])
  }
}
