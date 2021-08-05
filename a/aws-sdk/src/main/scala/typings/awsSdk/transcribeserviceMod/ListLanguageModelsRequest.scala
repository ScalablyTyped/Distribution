package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLanguageModelsRequest extends StObject {
  
  /**
    * The maximum number of language models to return in the response. If there are fewer results in the list, the response contains only the actual results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.transcribeserviceMod.MaxResults] = js.undefined
  
  /**
    * When specified, the custom language model names returned contain the substring you've specified.
    */
  var NameContains: js.UndefOr[ModelName] = js.undefined
  
  /**
    * When included, fetches the next set of jobs if the result of the previous request was truncated.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transcribeserviceMod.NextToken] = js.undefined
  
  /**
    * When specified, returns only custom language models with the specified status. Language models are ordered by creation date, with the newest models first. If you don't specify a status, Amazon Transcribe returns all custom language models ordered by date.
    */
  var StatusEquals: js.UndefOr[ModelStatus] = js.undefined
}
object ListLanguageModelsRequest {
  
  inline def apply(): ListLanguageModelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLanguageModelsRequest]
  }
  
  extension [Self <: ListLanguageModelsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNameContains(value: ModelName): Self = StObject.set(x, "NameContains", value.asInstanceOf[js.Any])
    
    inline def setNameContainsUndefined: Self = StObject.set(x, "NameContains", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStatusEquals(value: ModelStatus): Self = StObject.set(x, "StatusEquals", value.asInstanceOf[js.Any])
    
    inline def setStatusEqualsUndefined: Self = StObject.set(x, "StatusEquals", js.undefined)
  }
}
