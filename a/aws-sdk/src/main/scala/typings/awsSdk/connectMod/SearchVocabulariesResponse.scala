package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchVocabulariesResponse extends StObject {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[VocabularyNextToken] = js.undefined
  
  /**
    * The list of the available custom vocabularies.
    */
  var VocabularySummaryList: js.UndefOr[typings.awsSdk.connectMod.VocabularySummaryList] = js.undefined
}
object SearchVocabulariesResponse {
  
  inline def apply(): SearchVocabulariesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchVocabulariesResponse]
  }
  
  extension [Self <: SearchVocabulariesResponse](x: Self) {
    
    inline def setNextToken(value: VocabularyNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVocabularySummaryList(value: VocabularySummaryList): Self = StObject.set(x, "VocabularySummaryList", value.asInstanceOf[js.Any])
    
    inline def setVocabularySummaryListUndefined: Self = StObject.set(x, "VocabularySummaryList", js.undefined)
    
    inline def setVocabularySummaryListVarargs(value: VocabularySummary*): Self = StObject.set(x, "VocabularySummaryList", js.Array(value*))
  }
}
