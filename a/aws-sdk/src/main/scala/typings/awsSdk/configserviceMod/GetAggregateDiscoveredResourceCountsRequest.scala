package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAggregateDiscoveredResourceCountsRequest extends StObject {
  
  /**
    * The name of the configuration aggregator.
    */
  var ConfigurationAggregatorName: typings.awsSdk.configserviceMod.ConfigurationAggregatorName
  
  /**
    * Filters the results based on the ResourceCountFilters object.
    */
  var Filters: js.UndefOr[ResourceCountFilters] = js.undefined
  
  /**
    * The key to group the resource counts.
    */
  var GroupByKey: js.UndefOr[ResourceCountGroupKey] = js.undefined
  
  /**
    * The maximum number of GroupedResourceCount objects returned on each page. The default is 1000. You cannot specify a number greater than 1000. If you specify 0, AWS Config uses the default.
    */
  var Limit: js.UndefOr[GroupByAPILimit] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.undefined
}
object GetAggregateDiscoveredResourceCountsRequest {
  
  @scala.inline
  def apply(ConfigurationAggregatorName: ConfigurationAggregatorName): GetAggregateDiscoveredResourceCountsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationAggregatorName = ConfigurationAggregatorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAggregateDiscoveredResourceCountsRequest]
  }
  
  @scala.inline
  implicit class GetAggregateDiscoveredResourceCountsRequestMutableBuilder[Self <: GetAggregateDiscoveredResourceCountsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationAggregatorName(value: ConfigurationAggregatorName): Self = StObject.set(x, "ConfigurationAggregatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilters(value: ResourceCountFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setGroupByKey(value: ResourceCountGroupKey): Self = StObject.set(x, "GroupByKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByKeyUndefined: Self = StObject.set(x, "GroupByKey", js.undefined)
    
    @scala.inline
    def setLimit(value: GroupByAPILimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
