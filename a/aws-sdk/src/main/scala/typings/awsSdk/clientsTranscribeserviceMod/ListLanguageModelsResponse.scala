package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLanguageModelsResponse extends StObject {
  
  /**
    * Provides information about the custom language models that match the criteria specified in your request.
    */
  var Models: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.Models] = js.undefined
  
  /**
    * If NextToken is present in your response, it indicates that not all results are displayed. To view the next set of results, copy the string associated with the NextToken parameter in your results output, then run your request again including NextToken with the value of the copied string. Repeat as needed to view all your results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.NextToken] = js.undefined
}
object ListLanguageModelsResponse {
  
  inline def apply(): ListLanguageModelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLanguageModelsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListLanguageModelsResponse] (val x: Self) extends AnyVal {
    
    inline def setModels(value: Models): Self = StObject.set(x, "Models", value.asInstanceOf[js.Any])
    
    inline def setModelsUndefined: Self = StObject.set(x, "Models", js.undefined)
    
    inline def setModelsVarargs(value: LanguageModel*): Self = StObject.set(x, "Models", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
