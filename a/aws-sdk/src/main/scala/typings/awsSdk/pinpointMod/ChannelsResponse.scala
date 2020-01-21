package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

