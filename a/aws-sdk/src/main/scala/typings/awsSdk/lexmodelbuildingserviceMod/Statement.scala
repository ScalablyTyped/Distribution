package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Statement extends js.Object {
  /**
    * A collection of message objects.
    */
  var messages: MessageList = js.native
  /**
    *  At runtime, if the client is using the PostText API, Amazon Lex includes the response card in the response. It substitutes all of the session attributes and slot values for placeholders in the response card. 
    */
  var responseCard: js.UndefOr[ResponseCard] = js.native
}

object Statement {
  @scala.inline
  def apply(messages: MessageList): Statement = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  implicit class StatementOps[Self <: Statement] (val x: Self) extends AnyVal {
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
    def setMessagesVarargs(value: Message*): Self = this.set("messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: MessageList): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseCard(value: ResponseCard): Self = this.set("responseCard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseCard: Self = this.set("responseCard", js.undefined)
  }
  
}

