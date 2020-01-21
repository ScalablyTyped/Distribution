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
  def apply(messages: MessageList, responseCard: ResponseCard = null): Statement = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
}

