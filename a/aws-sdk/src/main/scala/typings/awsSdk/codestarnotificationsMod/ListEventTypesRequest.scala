package typings.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEventTypesRequest extends StObject {
  
  /**
    * The filters to use to return information by service or resource type.
    */
  var Filters: js.UndefOr[ListEventTypesFilters] = js.undefined
  
  /**
    * A non-negative integer used to limit the number of returned results. The default number is 50. The maximum number of results that can be returned is 100.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.codestarnotificationsMod.MaxResults] = js.undefined
  
  /**
    * An enumeration token that, when provided in a request, returns the next batch of the results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.codestarnotificationsMod.NextToken] = js.undefined
}
object ListEventTypesRequest {
  
  inline def apply(): ListEventTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventTypesRequest]
  }
  
  extension [Self <: ListEventTypesRequest](x: Self) {
    
    inline def setFilters(value: ListEventTypesFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: ListEventTypesFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
