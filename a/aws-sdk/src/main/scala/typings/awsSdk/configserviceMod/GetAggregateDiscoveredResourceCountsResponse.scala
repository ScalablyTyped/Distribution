package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAggregateDiscoveredResourceCountsResponse extends StObject {
  
  /**
    * The key passed into the request object. If GroupByKey is not provided, the result will be empty.
    */
  var GroupByKey: js.UndefOr[StringWithCharLimit256] = js.undefined
  
  /**
    * Returns a list of GroupedResourceCount objects.
    */
  var GroupedResourceCounts: js.UndefOr[GroupedResourceCountList] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.undefined
  
  /**
    * The total number of resources that are present in an aggregator with the filters that you provide.
    */
  var TotalDiscoveredResources: Long
}
object GetAggregateDiscoveredResourceCountsResponse {
  
  inline def apply(TotalDiscoveredResources: Long): GetAggregateDiscoveredResourceCountsResponse = {
    val __obj = js.Dynamic.literal(TotalDiscoveredResources = TotalDiscoveredResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAggregateDiscoveredResourceCountsResponse]
  }
  
  extension [Self <: GetAggregateDiscoveredResourceCountsResponse](x: Self) {
    
    inline def setGroupByKey(value: StringWithCharLimit256): Self = StObject.set(x, "GroupByKey", value.asInstanceOf[js.Any])
    
    inline def setGroupByKeyUndefined: Self = StObject.set(x, "GroupByKey", js.undefined)
    
    inline def setGroupedResourceCounts(value: GroupedResourceCountList): Self = StObject.set(x, "GroupedResourceCounts", value.asInstanceOf[js.Any])
    
    inline def setGroupedResourceCountsUndefined: Self = StObject.set(x, "GroupedResourceCounts", js.undefined)
    
    inline def setGroupedResourceCountsVarargs(value: GroupedResourceCount*): Self = StObject.set(x, "GroupedResourceCounts", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTotalDiscoveredResources(value: Long): Self = StObject.set(x, "TotalDiscoveredResources", value.asInstanceOf[js.Any])
  }
}
