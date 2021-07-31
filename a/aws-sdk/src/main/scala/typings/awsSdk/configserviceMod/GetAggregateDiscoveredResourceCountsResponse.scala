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
  
  @scala.inline
  def apply(TotalDiscoveredResources: Long): GetAggregateDiscoveredResourceCountsResponse = {
    val __obj = js.Dynamic.literal(TotalDiscoveredResources = TotalDiscoveredResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAggregateDiscoveredResourceCountsResponse]
  }
  
  @scala.inline
  implicit class GetAggregateDiscoveredResourceCountsResponseMutableBuilder[Self <: GetAggregateDiscoveredResourceCountsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupByKey(value: StringWithCharLimit256): Self = StObject.set(x, "GroupByKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByKeyUndefined: Self = StObject.set(x, "GroupByKey", js.undefined)
    
    @scala.inline
    def setGroupedResourceCounts(value: GroupedResourceCountList): Self = StObject.set(x, "GroupedResourceCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupedResourceCountsUndefined: Self = StObject.set(x, "GroupedResourceCounts", js.undefined)
    
    @scala.inline
    def setGroupedResourceCountsVarargs(value: GroupedResourceCount*): Self = StObject.set(x, "GroupedResourceCounts", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTotalDiscoveredResources(value: Long): Self = StObject.set(x, "TotalDiscoveredResources", value.asInstanceOf[js.Any])
  }
}
