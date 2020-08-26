package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApnsSandboxChannelResponse extends js.Object {
  var APNSSandboxChannelResponse: typings.awsSdk.pinpointMod.APNSSandboxChannelResponse = js.native
}

object GetApnsSandboxChannelResponse {
  @scala.inline
  def apply(APNSSandboxChannelResponse: APNSSandboxChannelResponse): GetApnsSandboxChannelResponse = {
    val __obj = js.Dynamic.literal(APNSSandboxChannelResponse = APNSSandboxChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApnsSandboxChannelResponse]
  }
  @scala.inline
  implicit class GetApnsSandboxChannelResponseOps[Self <: GetApnsSandboxChannelResponse] (val x: Self) extends AnyVal {
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
    def setAPNSSandboxChannelResponse(value: APNSSandboxChannelResponse): Self = this.set("APNSSandboxChannelResponse", value.asInstanceOf[js.Any])
  }
  
}

