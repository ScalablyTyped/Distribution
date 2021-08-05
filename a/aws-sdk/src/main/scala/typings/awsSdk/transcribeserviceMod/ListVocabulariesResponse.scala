package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVocabulariesResponse extends StObject {
  
  /**
    * The ListVocabularies operation returns a page of vocabularies at a time. The maximum size of the page is set in the MaxResults parameter. If there are more jobs in the list than will fit on the page, Amazon Transcribe returns the NextPage token. To return in the next page of jobs, include the token in the next request to the ListVocabularies operation.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transcribeserviceMod.NextToken] = js.undefined
  
  /**
    * The requested vocabulary state.
    */
  var Status: js.UndefOr[VocabularyState] = js.undefined
  
  /**
    * A list of objects that describe the vocabularies that match the search criteria in the request.
    */
  var Vocabularies: js.UndefOr[typings.awsSdk.transcribeserviceMod.Vocabularies] = js.undefined
}
object ListVocabulariesResponse {
  
  inline def apply(): ListVocabulariesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVocabulariesResponse]
  }
  
  extension [Self <: ListVocabulariesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStatus(value: VocabularyState): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVocabularies(value: Vocabularies): Self = StObject.set(x, "Vocabularies", value.asInstanceOf[js.Any])
    
    inline def setVocabulariesUndefined: Self = StObject.set(x, "Vocabularies", js.undefined)
    
    inline def setVocabulariesVarargs(value: VocabularyInfo*): Self = StObject.set(x, "Vocabularies", js.Array(value :_*))
  }
}
