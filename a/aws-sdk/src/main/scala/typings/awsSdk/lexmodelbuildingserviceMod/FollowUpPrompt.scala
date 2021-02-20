package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FollowUpPrompt extends StObject {
  
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
  implicit class FollowUpPromptMutableBuilder[Self <: FollowUpPrompt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrompt(value: Prompt): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectionStatement(value: Statement): Self = StObject.set(x, "rejectionStatement", value.asInstanceOf[js.Any])
  }
}
