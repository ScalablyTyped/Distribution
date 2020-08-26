package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVoiceChannelResponse extends js.Object {
  var VoiceChannelResponse: typings.awsSdk.pinpointMod.VoiceChannelResponse = js.native
}

object UpdateVoiceChannelResponse {
  @scala.inline
  def apply(VoiceChannelResponse: VoiceChannelResponse): UpdateVoiceChannelResponse = {
    val __obj = js.Dynamic.literal(VoiceChannelResponse = VoiceChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVoiceChannelResponse]
  }
  @scala.inline
  implicit class UpdateVoiceChannelResponseOps[Self <: UpdateVoiceChannelResponse] (val x: Self) extends AnyVal {
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
    def setVoiceChannelResponse(value: VoiceChannelResponse): Self = this.set("VoiceChannelResponse", value.asInstanceOf[js.Any])
  }
  
}

