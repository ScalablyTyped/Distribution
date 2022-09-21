package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLanguageModelsRequest extends StObject {
  
  /**
    * The maximum number of custom language models to return in each page of results. If there are fewer results than the value you specify, only the actual results are returned. If you don't specify a value, a default of 5 is used.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.transcribeserviceMod.MaxResults] = js.undefined
  
  /**
    * Returns only the custom language models that contain the specified string. The search is not case sensitive.
    */
  var NameContains: js.UndefOr[ModelName] = js.undefined
  
  /**
    * If your ListLanguageModels request returns more results than can be displayed, NextToken is displayed in the response with an associated string. To get the next page of results, copy this string and repeat your request, including NextToken with the value of the copied string. Repeat as needed to view all your results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transcribeserviceMod.NextToken] = js.undefined
  
  /**
    * Returns only custom language models with the specified status. Language models are ordered by creation date, with the newest model first. If you don't include StatusEquals, all custom language models are returned.
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
