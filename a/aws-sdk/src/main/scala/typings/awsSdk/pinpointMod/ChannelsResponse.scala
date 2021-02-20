package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelsResponse extends StObject {
  
  /**
    * A map that contains a multipart response for each channel. For each item in this object, the ChannelType is the key and the Channel is the value.
    */
  var Channels: MapOfChannelResponse = js.native
}
object ChannelsResponse {
  
  @scala.inline
  def apply(Channels: MapOfChannelResponse): ChannelsResponse = {
    val __obj = js.Dynamic.literal(Channels = Channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelsResponse]
  }
  
  @scala.inline
  implicit class ChannelsResponseMutableBuilder[Self <: ChannelsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: MapOfChannelResponse): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
  }
}
