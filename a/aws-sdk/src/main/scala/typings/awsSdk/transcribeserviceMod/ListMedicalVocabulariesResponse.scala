package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMedicalVocabulariesResponse extends StObject {
  
  /**
    * The ListMedicalVocabularies operation returns a page of vocabularies at a time. You set the maximum number of vocabularies to return on a page with the MaxResults parameter. If there are more jobs in the list will fit on a page, Amazon Transcribe Medical returns the NextPage token. To return the next page of vocabularies, include the token in the next request to the ListMedicalVocabularies operation .
    */
  var NextToken: js.UndefOr[typings.awsSdk.transcribeserviceMod.NextToken] = js.undefined
  
  /**
    * The requested vocabulary state.
    */
  var Status: js.UndefOr[VocabularyState] = js.undefined
  
  /**
    * A list of objects that describe the vocabularies that match your search criteria.
    */
  var Vocabularies: js.UndefOr[typings.awsSdk.transcribeserviceMod.Vocabularies] = js.undefined
}
object ListMedicalVocabulariesResponse {
  
  @scala.inline
  def apply(): ListMedicalVocabulariesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMedicalVocabulariesResponse]
  }
  
  @scala.inline
  implicit class ListMedicalVocabulariesResponseMutableBuilder[Self <: ListMedicalVocabulariesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStatus(value: VocabularyState): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setVocabularies(value: Vocabularies): Self = StObject.set(x, "Vocabularies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVocabulariesUndefined: Self = StObject.set(x, "Vocabularies", js.undefined)
    
    @scala.inline
    def setVocabulariesVarargs(value: VocabularyInfo*): Self = StObject.set(x, "Vocabularies", js.Array(value :_*))
  }
}
