package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendUsersMessagesResponse extends js.Object {
  var SendUsersMessageResponse: typings.awsSdk.pinpointMod.SendUsersMessageResponse = js.native
}

object SendUsersMessagesResponse {
  @scala.inline
  def apply(SendUsersMessageResponse: SendUsersMessageResponse): SendUsersMessagesResponse = {
    val __obj = js.Dynamic.literal(SendUsersMessageResponse = SendUsersMessageResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendUsersMessagesResponse]
  }
  @scala.inline
  implicit class SendUsersMessagesResponseOps[Self <: SendUsersMessagesResponse] (val x: Self) extends AnyVal {
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
    def setSendUsersMessageResponse(value: SendUsersMessageResponse): Self = this.set("SendUsersMessageResponse", value.asInstanceOf[js.Any])
  }
  
}

