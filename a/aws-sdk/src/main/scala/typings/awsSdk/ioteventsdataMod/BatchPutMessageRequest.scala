package typings.awsSdk.ioteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchPutMessageRequest extends js.Object {
  /**
    * The list of messages to send. Each message has the following format: '{ "messageId": "string", "inputName": "string", "payload": "string"}' 
    */
  var messages: Messages = js.native
}

object BatchPutMessageRequest {
  @scala.inline
  def apply(messages: Messages): BatchPutMessageRequest = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutMessageRequest]
  }
  @scala.inline
  implicit class BatchPutMessageRequestOps[Self <: BatchPutMessageRequest] (val x: Self) extends AnyVal {
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
    def setMessagesVarargs(value: Message*): Self = this.set("messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: Messages): Self = this.set("messages", value.asInstanceOf[js.Any])
  }
  
}

