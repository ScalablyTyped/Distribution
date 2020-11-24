package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAggregateDiscoveredResourceCountsResponse extends js.Object {
  
  /**
    * The key passed into the request object. If GroupByKey is not provided, the result will be empty.
    */
  var GroupByKey: js.UndefOr[StringWithCharLimit256] = js.native
  
  /**
    * Returns a list of GroupedResourceCount objects.
    */
  var GroupedResourceCounts: js.UndefOr[GroupedResourceCountList] = js.native
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
  
  /**
    * The total number of resources that are present in an aggregator with the filters that you provide.
    */
  var TotalDiscoveredResources: Long = js.native
}
object GetAggregateDiscoveredResourceCountsResponse {
  
  @scala.inline
  def apply(TotalDiscoveredResources: Long): GetAggregateDiscoveredResourceCountsResponse = {
    val __obj = js.Dynamic.literal(TotalDiscoveredResources = TotalDiscoveredResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAggregateDiscoveredResourceCountsResponse]
  }
  
  @scala.inline
  implicit class GetAggregateDiscoveredResourceCountsResponseOps[Self <: GetAggregateDiscoveredResourceCountsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTotalDiscoveredResources(value: Long): Self = this.set("TotalDiscoveredResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByKey(value: StringWithCharLimit256): Self = this.set("GroupByKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupByKey: Self = this.set("GroupByKey", js.undefined)
    
    @scala.inline
    def setGroupedResourceCountsVarargs(value: GroupedResourceCount*): Self = this.set("GroupedResourceCounts", js.Array(value :_*))
    
    @scala.inline
    def setGroupedResourceCounts(value: GroupedResourceCountList): Self = this.set("GroupedResourceCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupedResourceCounts: Self = this.set("GroupedResourceCounts", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
