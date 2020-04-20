package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FollowUpPrompt extends js.Object {
  /**
    * Prompts for information from the user. 
    */
  var prompt: Prompt = js.native
  /**
    * If the user answers "no" to the question defined in the prompt field, Amazon Lex responds with this statement to acknowledge that the intent was canceled. 
    */
  var rejectionStatement: Statement = js.native
}

object FollowUpPrompt {
  @scala.inline
  def apply(prompt: Prompt, rejectionStatement: Statement): FollowUpPrompt = {
    val __obj = js.Dynamic.literal(prompt = prompt.asInstanceOf[js.Any], rejectionStatement = rejectionStatement.asInstanceOf[js.Any])
    __obj.asInstanceOf[FollowUpPrompt]
  }
}

