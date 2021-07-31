package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateChannelResponse extends StObject {
  
  var channel: js.UndefOr[Channel] = js.undefined
  
  var streamKey: js.UndefOr[StreamKey] = js.undefined
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
    def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    @scala.inline
    def setStreamKey(value: StreamKey): Self = StObject.set(x, "streamKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamKeyUndefined: Self = StObject.set(x, "streamKey", js.undefined)
  }
}
