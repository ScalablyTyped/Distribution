package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVoiceChannelResponse extends js.Object {
  var VoiceChannelResponse: typings.awsSdk.pinpointMod.VoiceChannelResponse = js.native
}

object DeleteVoiceChannelResponse {
  @scala.inline
  def apply(VoiceChannelResponse: VoiceChannelResponse): DeleteVoiceChannelResponse = {
    val __obj = js.Dynamic.literal(VoiceChannelResponse = VoiceChannelResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteVoiceChannelResponse]
  }
}

