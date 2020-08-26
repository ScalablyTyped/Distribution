package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApnsChannelResponse extends js.Object {
  var APNSChannelResponse: typings.awsSdk.pinpointMod.APNSChannelResponse = js.native
}

object UpdateApnsChannelResponse {
  @scala.inline
  def apply(APNSChannelResponse: APNSChannelResponse): UpdateApnsChannelResponse = {
    val __obj = js.Dynamic.literal(APNSChannelResponse = APNSChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApnsChannelResponse]
  }
  @scala.inline
  implicit class UpdateApnsChannelResponseOps[Self <: UpdateApnsChannelResponse] (val x: Self) extends AnyVal {
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
    def setAPNSChannelResponse(value: APNSChannelResponse): Self = this.set("APNSChannelResponse", value.asInstanceOf[js.Any])
  }
  
}

