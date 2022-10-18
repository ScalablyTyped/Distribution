package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVocabulariesResponse extends StObject {
  
  /**
    * If NextToken is present in your response, it indicates that not all results are displayed. To view the next set of results, copy the string associated with the NextToken parameter in your results output, then run your request again including NextToken with the value of the copied string. Repeat as needed to view all your results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.NextToken] = js.undefined
  
  /**
    * Lists all custom vocabularies that have the status specified in your request. Vocabularies are ordered by creation date, with the newest vocabulary first.
    */
  var Status: js.UndefOr[VocabularyState] = js.undefined
  
  /**
    * Provides information about the custom vocabularies that match the criteria specified in your request.
    */
  var Vocabularies: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.Vocabularies] = js.undefined
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
    
    inline def setVocabulariesVarargs(value: VocabularyInfo*): Self = StObject.set(x, "Vocabularies", js.Array(value*))
  }
}
