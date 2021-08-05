package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVocabularyFiltersRequest extends StObject {
  
  /**
    * The maximum number of filters to return in the response. If there are fewer results in the list, this response contains only the actual results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.transcribeserviceMod.MaxResults] = js.undefined
  
  /**
    * Filters the response so that it only contains vocabulary filters whose name contains the specified string.
    */
  var NameContains: js.UndefOr[VocabularyFilterName] = js.undefined
  
  /**
    * If the result of the previous request to ListVocabularyFilters was truncated, include the NextToken to fetch the next set of collections.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transcribeserviceMod.NextToken] = js.undefined
}
object ListVocabularyFiltersRequest {
  
  inline def apply(): ListVocabularyFiltersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVocabularyFiltersRequest]
  }
  
  extension [Self <: ListVocabularyFiltersRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNameContains(value: VocabularyFilterName): Self = StObject.set(x, "NameContains", value.asInstanceOf[js.Any])
    
    inline def setNameContainsUndefined: Self = StObject.set(x, "NameContains", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
