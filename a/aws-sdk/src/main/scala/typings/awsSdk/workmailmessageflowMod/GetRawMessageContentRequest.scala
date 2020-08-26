package typings.awsSdk.workmailmessageflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRawMessageContentRequest extends js.Object {
  /**
    * The identifier of the email message to retrieve.
    */
  var messageId: messageIdType = js.native
}

object GetRawMessageContentRequest {
  @scala.inline
  def apply(messageId: messageIdType): GetRawMessageContentRequest = {
    val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRawMessageContentRequest]
  }
  @scala.inline
  implicit class GetRawMessageContentRequestOps[Self <: GetRawMessageContentRequest] (val x: Self) extends AnyVal {
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
    def setMessageId(value: messageIdType): Self = this.set("messageId", value.asInstanceOf[js.Any])
  }
  
}

