package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVocabularyFiltersResponse extends StObject {
  
  /**
    * If NextToken is present in your response, it indicates that not all results are displayed. To view the next set of results, copy the string associated with the NextToken parameter in your results output, then run your request again including NextToken with the value of the copied string. Repeat as needed to view all your results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.NextToken] = js.undefined
  
  /**
    * Provides information about the custom vocabulary filters that match the criteria specified in your request.
    */
  var VocabularyFilters: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.VocabularyFilters] = js.undefined
}
object ListVocabularyFiltersResponse {
  
  inline def apply(): ListVocabularyFiltersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVocabularyFiltersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListVocabularyFiltersResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVocabularyFilters(value: VocabularyFilters): Self = StObject.set(x, "VocabularyFilters", value.asInstanceOf[js.Any])
    
    inline def setVocabularyFiltersUndefined: Self = StObject.set(x, "VocabularyFilters", js.undefined)
    
    inline def setVocabularyFiltersVarargs(value: VocabularyFilterInfo*): Self = StObject.set(x, "VocabularyFilters", js.Array(value*))
  }
}
