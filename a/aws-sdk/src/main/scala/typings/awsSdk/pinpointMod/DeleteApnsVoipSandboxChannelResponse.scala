package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApnsVoipSandboxChannelResponse extends js.Object {
  var APNSVoipSandboxChannelResponse: typings.awsSdk.pinpointMod.APNSVoipSandboxChannelResponse = js.native
}

object DeleteApnsVoipSandboxChannelResponse {
  @scala.inline
  def apply(APNSVoipSandboxChannelResponse: APNSVoipSandboxChannelResponse): DeleteApnsVoipSandboxChannelResponse = {
    val __obj = js.Dynamic.literal(APNSVoipSandboxChannelResponse = APNSVoipSandboxChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApnsVoipSandboxChannelResponse]
  }
  @scala.inline
  implicit class DeleteApnsVoipSandboxChannelResponseOps[Self <: DeleteApnsVoipSandboxChannelResponse] (val x: Self) extends AnyVal {
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
    def setAPNSVoipSandboxChannelResponse(value: APNSVoipSandboxChannelResponse): Self = this.set("APNSVoipSandboxChannelResponse", value.asInstanceOf[js.Any])
  }
  
}

