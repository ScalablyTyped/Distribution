package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends js.Object {
  /**
    * The ID you wish to assign to the message. Each "messageId" must be unique within each batch sent.
    */
  var messageId: MessageId = js.native
  /**
    * The payload of the message. This may be a JSON string or a Base64-encoded string representing binary data (in which case you must decode it by means of a pipeline activity).
    */
  var payload: MessagePayload = js.native
}

object Message {
  @scala.inline
  def apply(messageId: MessageId, payload: MessagePayload): Message = {
    val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
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
    def setMessageId(value: MessageId): Self = this.set("messageId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayload(value: MessagePayload): Self = this.set("payload", value.asInstanceOf[js.Any])
  }
  
}

