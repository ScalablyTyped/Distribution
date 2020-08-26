package typings.awsSdk.workmailmessageflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRawMessageContentResponse extends js.Object {
  /**
    * The raw content of the email message, in MIME format.
    */
  var messageContent: messageContentBlob = js.native
}

object GetRawMessageContentResponse {
  @scala.inline
  def apply(messageContent: messageContentBlob): GetRawMessageContentResponse = {
    val __obj = js.Dynamic.literal(messageContent = messageContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRawMessageContentResponse]
  }
  @scala.inline
  implicit class GetRawMessageContentResponseOps[Self <: GetRawMessageContentResponse] (val x: Self) extends AnyVal {
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
    def setMessageContent(value: messageContentBlob): Self = this.set("messageContent", value.asInstanceOf[js.Any])
  }
  
}

