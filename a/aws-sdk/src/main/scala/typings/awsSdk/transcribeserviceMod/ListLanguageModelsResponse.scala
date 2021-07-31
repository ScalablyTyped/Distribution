package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLanguageModelsResponse extends StObject {
  
  /**
    * A list of objects containing information about custom language models.
    */
  var Models: js.UndefOr[typings.awsSdk.transcribeserviceMod.Models] = js.undefined
  
  /**
    * The operation returns a page of jobs at a time. The maximum size of the list is set by the MaxResults parameter. If there are more language models in the list than the page size, Amazon Transcribe returns the NextPage token. Include the token in the next request to the operation to return the next page of language models.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transcribeserviceMod.NextToken] = js.undefined
}
object ListLanguageModelsResponse {
  
  @scala.inline
  def apply(): ListLanguageModelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLanguageModelsResponse]
  }
  
  @scala.inline
  implicit class ListLanguageModelsResponseMutableBuilder[Self <: ListLanguageModelsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModels(value: Models): Self = StObject.set(x, "Models", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelsUndefined: Self = StObject.set(x, "Models", js.undefined)
    
    @scala.inline
    def setModelsVarargs(value: LanguageModel*): Self = StObject.set(x, "Models", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
