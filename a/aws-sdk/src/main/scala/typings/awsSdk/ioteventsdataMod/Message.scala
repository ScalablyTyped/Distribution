package typings.awsSdk.ioteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends js.Object {
  /**
    * The name of the input into which the message payload is transformed.
    */
  var inputName: InputName = js.native
  /**
    * The ID to assign to the message. Within each batch sent, each "messageId" must be unique.
    */
  var messageId: MessageId = js.native
  /**
    * The payload of the message. This can be a JSON string or a Base-64-encoded string representing binary data (in which case you must decode it).
    */
  var payload: Payload = js.native
}

object Message {
  @scala.inline
  def apply(inputName: InputName, messageId: MessageId, payload: Payload): Message = {
    val __obj = js.Dynamic.literal(inputName = inputName.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
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
    def setInputName(value: InputName): Self = this.set("inputName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageId(value: MessageId): Self = this.set("messageId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayload(value: Payload): Self = this.set("payload", value.asInstanceOf[js.Any])
  }
  
}

