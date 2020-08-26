package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEmailChannelResponse extends js.Object {
  var EmailChannelResponse: typings.awsSdk.pinpointMod.EmailChannelResponse = js.native
}

object GetEmailChannelResponse {
  @scala.inline
  def apply(EmailChannelResponse: EmailChannelResponse): GetEmailChannelResponse = {
    val __obj = js.Dynamic.literal(EmailChannelResponse = EmailChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEmailChannelResponse]
  }
  @scala.inline
  implicit class GetEmailChannelResponseOps[Self <: GetEmailChannelResponse] (val x: Self) extends AnyVal {
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
    def setEmailChannelResponse(value: EmailChannelResponse): Self = this.set("EmailChannelResponse", value.asInstanceOf[js.Any])
  }
  
}

