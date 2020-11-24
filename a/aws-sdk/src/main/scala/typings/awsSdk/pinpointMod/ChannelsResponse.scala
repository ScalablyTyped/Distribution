package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelsResponse extends js.Object {
  
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
  implicit class ChannelsResponseOps[Self <: ChannelsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannels(value: MapOfChannelResponse): Self = this.set("Channels", value.asInstanceOf[js.Any])
  }
}
