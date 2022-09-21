package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMonitoredResourcesRequest extends StObject {
  
  /**
    *  Filters to determine which monitored resources you want to retrieve. You can filter by resource type or resource permission status. 
    */
  var Filters: ListMonitoredResourcesFilters
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[ListMonitoredResourcesMaxResults] = js.undefined
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[UuidNextToken] = js.undefined
}
object ListMonitoredResourcesRequest {
  
  inline def apply(Filters: ListMonitoredResourcesFilters): ListMonitoredResourcesRequest = {
    val __obj = js.Dynamic.literal(Filters = Filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMonitoredResourcesRequest]
  }
  
  extension [Self <: ListMonitoredResourcesRequest](x: Self) {
    
    inline def setFilters(value: ListMonitoredResourcesFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: ListMonitoredResourcesMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: UuidNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
