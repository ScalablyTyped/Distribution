package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class FollowUpPromptOps[Self <: FollowUpPrompt] (val x: Self) extends AnyVal {
    
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
    def setPrompt(value: Prompt): Self = this.set("prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectionStatement(value: Statement): Self = this.set("rejectionStatement", value.asInstanceOf[js.Any])
  }
}
