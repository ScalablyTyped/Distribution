package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FollowUpPrompt extends StObject {
  
  /**
    * Prompts for information from the user. 
    */
  var prompt: Prompt
  
  /**
    * If the user answers "no" to the question defined in the prompt field, Amazon Lex responds with this statement to acknowledge that the intent was canceled. 
    */
  var rejectionStatement: Statement
}
object FollowUpPrompt {
  
  inline def apply(prompt: Prompt, rejectionStatement: Statement): FollowUpPrompt = {
    val __obj = js.Dynamic.literal(prompt = prompt.asInstanceOf[js.Any], rejectionStatement = rejectionStatement.asInstanceOf[js.Any])
    __obj.asInstanceOf[FollowUpPrompt]
  }
  
  extension [Self <: FollowUpPrompt](x: Self) {
    
    inline def setPrompt(value: Prompt): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    inline def setRejectionStatement(value: Statement): Self = StObject.set(x, "rejectionStatement", value.asInstanceOf[js.Any])
  }
}
