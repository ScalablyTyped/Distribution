package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListVocabulariesResponse extends StObject {
  
  /**
    * The ListVocabularies operation returns a page of vocabularies at a time. The maximum size of the page is set in the MaxResults parameter. If there are more jobs in the list than will fit on the page, Amazon Transcribe returns the NextPage token. To return in the next page of jobs, include the token in the next request to the ListVocabularies operation.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transcribeserviceMod.NextToken] = js.native
  
  /**
    * The requested vocabulary state.
    */
  var Status: js.UndefOr[VocabularyState] = js.native
  
  /**
    * A list of objects that describe the vocabularies that match the search criteria in the request.
    */
  var Vocabularies: js.UndefOr[typings.awsSdk.transcribeserviceMod.Vocabularies] = js.native
}
object ListVocabulariesResponse {
  
  @scala.inline
  def apply(): ListVocabulariesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVocabulariesResponse]
  }
  
  @scala.inline
  implicit class ListVocabulariesResponseMutableBuilder[Self <: ListVocabulariesResponse] (val x: Self) extends AnyVal {
    
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
