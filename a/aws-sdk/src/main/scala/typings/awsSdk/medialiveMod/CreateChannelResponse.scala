package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateChannelResponse extends StObject {
  
  var Channel: js.UndefOr[typings.awsSdk.medialiveMod.Channel] = js.undefined
}
object CreateChannelResponse {
  
  @scala.inline
  def apply(): CreateChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateChannelResponse]
  }
  
  @scala.inline
  implicit class CreateChannelResponseMutableBuilder[Self <: CreateChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: Channel): Self = StObject.set(x, "Channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelUndefined: Self = StObject.set(x, "Channel", js.undefined)
  }
}
