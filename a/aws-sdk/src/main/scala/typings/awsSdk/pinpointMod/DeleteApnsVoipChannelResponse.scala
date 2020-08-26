package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApnsVoipChannelResponse extends js.Object {
  var APNSVoipChannelResponse: typings.awsSdk.pinpointMod.APNSVoipChannelResponse = js.native
}

object DeleteApnsVoipChannelResponse {
  @scala.inline
  def apply(APNSVoipChannelResponse: APNSVoipChannelResponse): DeleteApnsVoipChannelResponse = {
    val __obj = js.Dynamic.literal(APNSVoipChannelResponse = APNSVoipChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApnsVoipChannelResponse]
  }
  @scala.inline
  implicit class DeleteApnsVoipChannelResponseOps[Self <: DeleteApnsVoipChannelResponse] (val x: Self) extends AnyVal {
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
    def setAPNSVoipChannelResponse(value: APNSVoipChannelResponse): Self = this.set("APNSVoipChannelResponse", value.asInstanceOf[js.Any])
  }
  
}

