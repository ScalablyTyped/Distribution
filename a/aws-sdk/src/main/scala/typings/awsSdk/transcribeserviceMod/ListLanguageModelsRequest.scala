package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLanguageModelsRequest extends StObject {
  
  /**
    * The maximum number of language models to return in the response. If there are fewer results in the list, the response contains only the actual results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.transcribeserviceMod.MaxResults] = js.native
  
  /**
    * When specified, the custom language model names returned contain the substring you've specified.
    */
  var NameContains: js.UndefOr[ModelName] = js.native
  
  /**
    * When included, fetches the next set of jobs if the result of the previous request was truncated.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transcribeserviceMod.NextToken] = js.native
  
  /**
    * When specified, returns only custom language models with the specified status. Language models are ordered by creation date, with the newest models first. If you don't specify a status, Amazon Transcribe returns all custom language models ordered by date.
    */
  var StatusEquals: js.UndefOr[ModelStatus] = js.native
}
object ListLanguageModelsRequest {
  
  @scala.inline
  def apply(): ListLanguageModelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLanguageModelsRequest]
  }
  
  @scala.inline
  implicit class ListLanguageModelsRequestMutableBuilder[Self <: ListLanguageModelsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNameContains(value: ModelName): Self = StObject.set(x, "NameContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameContainsUndefined: Self = StObject.set(x, "NameContains", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStatusEquals(value: ModelStatus): Self = StObject.set(x, "StatusEquals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusEqualsUndefined: Self = StObject.set(x, "StatusEquals", js.undefined)
  }
}
