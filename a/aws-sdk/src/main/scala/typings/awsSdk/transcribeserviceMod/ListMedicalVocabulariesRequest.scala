package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMedicalVocabulariesRequest extends StObject {
  
  /**
    * The maximum number of vocabularies to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.transcribeserviceMod.MaxResults] = js.native
  
  /**
    * Returns vocabularies whose names contain the specified string. The search is not case sensitive. ListMedicalVocabularies returns both "vocabularyname" and "VocabularyName".
    */
  var NameContains: js.UndefOr[VocabularyName] = js.native
  
  /**
    * If the result of your previous request to ListMedicalVocabularies was truncated, include the NextToken to fetch the next set of vocabularies.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transcribeserviceMod.NextToken] = js.native
  
  /**
    * When specified, returns only vocabularies with the VocabularyState equal to the specified vocabulary state. Use this field to see which vocabularies are ready for your medical transcription jobs.
    */
  var StateEquals: js.UndefOr[VocabularyState] = js.native
}
object ListMedicalVocabulariesRequest {
  
  @scala.inline
  def apply(): ListMedicalVocabulariesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMedicalVocabulariesRequest]
  }
  
  @scala.inline
  implicit class ListMedicalVocabulariesRequestMutableBuilder[Self <: ListMedicalVocabulariesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNameContains(value: VocabularyName): Self = StObject.set(x, "NameContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameContainsUndefined: Self = StObject.set(x, "NameContains", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStateEquals(value: VocabularyState): Self = StObject.set(x, "StateEquals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateEqualsUndefined: Self = StObject.set(x, "StateEquals", js.undefined)
  }
}
