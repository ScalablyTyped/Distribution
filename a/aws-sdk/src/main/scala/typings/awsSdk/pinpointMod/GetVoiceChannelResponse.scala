package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVoiceChannelResponse extends js.Object {
  var VoiceChannelResponse: typings.awsSdk.pinpointMod.VoiceChannelResponse = js.native
}

object GetVoiceChannelResponse {
  @scala.inline
  def apply(VoiceChannelResponse: VoiceChannelResponse): GetVoiceChannelResponse = {
    val __obj = js.Dynamic.literal(VoiceChannelResponse = VoiceChannelResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetVoiceChannelResponse]
  }
}

