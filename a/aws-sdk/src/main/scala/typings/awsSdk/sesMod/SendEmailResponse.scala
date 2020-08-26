package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendEmailResponse extends js.Object {
  /**
    * The unique message identifier returned from the SendEmail action. 
    */
  var MessageId: typings.awsSdk.sesMod.MessageId = js.native
}

object SendEmailResponse {
  @scala.inline
  def apply(MessageId: MessageId): SendEmailResponse = {
    val __obj = js.Dynamic.literal(MessageId = MessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendEmailResponse]
  }
  @scala.inline
  implicit class SendEmailResponseOps[Self <: SendEmailResponse] (val x: Self) extends AnyVal {
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
    def setMessageId(value: MessageId): Self = this.set("MessageId", value.asInstanceOf[js.Any])
  }
  
}

