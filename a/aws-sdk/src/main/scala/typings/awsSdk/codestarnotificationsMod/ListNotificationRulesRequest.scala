package typings.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNotificationRulesRequest extends StObject {
  
  /**
    * The filters to use to return information by service or resource type. For valid values, see ListNotificationRulesFilter.  A filter with the same name can appear more than once when used with OR statements. Filters with different names should be applied with AND statements. 
    */
  var Filters: js.UndefOr[ListNotificationRulesFilters] = js.undefined
  
  /**
    * A non-negative integer used to limit the number of returned results. The maximum number of results that can be returned is 100.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.codestarnotificationsMod.MaxResults] = js.undefined
  
  /**
    * An enumeration token that, when provided in a request, returns the next batch of the results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.codestarnotificationsMod.NextToken] = js.undefined
}
object ListNotificationRulesRequest {
  
  inline def apply(): ListNotificationRulesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNotificationRulesRequest]
  }
  
  extension [Self <: ListNotificationRulesRequest](x: Self) {
    
    inline def setFilters(value: ListNotificationRulesFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: ListNotificationRulesFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
