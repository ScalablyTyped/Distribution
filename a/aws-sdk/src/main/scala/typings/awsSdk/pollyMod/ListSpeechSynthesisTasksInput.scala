package typings.awsSdk.pollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSpeechSynthesisTasksInput extends StObject {
  
  /**
    * Maximum number of speech synthesis tasks returned in a List operation.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.pollyMod.MaxResults] = js.undefined
  
  /**
    * The pagination token to use in the next request to continue the listing of speech synthesis tasks. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.pollyMod.NextToken] = js.undefined
  
  /**
    * Status of the speech synthesis tasks returned in a List operation
    */
  var Status: js.UndefOr[TaskStatus] = js.undefined
}
object ListSpeechSynthesisTasksInput {
  
  @scala.inline
  def apply(): ListSpeechSynthesisTasksInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSpeechSynthesisTasksInput]
  }
  
  @scala.inline
  implicit class ListSpeechSynthesisTasksInputMutableBuilder[Self <: ListSpeechSynthesisTasksInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStatus(value: TaskStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
