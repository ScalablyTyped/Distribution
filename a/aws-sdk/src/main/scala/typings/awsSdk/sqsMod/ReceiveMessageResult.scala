package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiveMessageResult extends js.Object {
  /**
    * A list of messages.
    */
  var Messages: js.UndefOr[MessageList] = js.native
}

object ReceiveMessageResult {
  @scala.inline
  def apply(): ReceiveMessageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReceiveMessageResult]
  }
  @scala.inline
  implicit class ReceiveMessageResultOps[Self <: ReceiveMessageResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMessagesVarargs(value: Message*): Self = this.set("Messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: MessageList): Self = this.set("Messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("Messages", js.undefined)
  }
  
}

