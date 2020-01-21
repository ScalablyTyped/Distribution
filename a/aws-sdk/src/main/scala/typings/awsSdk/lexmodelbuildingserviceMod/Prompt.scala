package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Prompt extends js.Object {
  /**
    * The number of times to prompt the user for information.
    */
  var maxAttempts: PromptMaxAttempts = js.native
  /**
    * An array of objects, each of which provides a message string and its type. You can specify the message string in plain text or in Speech Synthesis Markup Language (SSML).
    */
  var messages: MessageList = js.native
  /**
    * A response card. Amazon Lex uses this prompt at runtime, in the PostText API response. It substitutes session attributes and slot values for placeholders in the response card. For more information, see ex-resp-card. 
    */
  var responseCard: js.UndefOr[ResponseCard] = js.native
}

object Prompt {
  @scala.inline
  def apply(maxAttempts: PromptMaxAttempts, messages: MessageList, responseCard: ResponseCard = null): Prompt = {
    val __obj = js.Dynamic.literal(maxAttempts = maxAttempts.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prompt]
  }
}

