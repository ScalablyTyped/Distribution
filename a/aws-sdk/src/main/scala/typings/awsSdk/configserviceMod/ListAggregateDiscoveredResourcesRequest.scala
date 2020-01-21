package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAggregateDiscoveredResourcesRequest extends js.Object {
  /**
    * The name of the configuration aggregator. 
    */
  var ConfigurationAggregatorName: typings.awsSdk.configserviceMod.ConfigurationAggregatorName = js.native
  /**
    * Filters the results based on the ResourceFilters object.
    */
  var Filters: js.UndefOr[ResourceFilters] = js.native
  /**
    * The maximum number of resource identifiers returned on each page. The default is 100. You cannot specify a number greater than 100. If you specify 0, AWS Config uses the default.
    */
  var Limit: js.UndefOr[typings.awsSdk.configserviceMod.Limit] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
  /**
    * The type of resources that you want AWS Config to list in the response.
    */
  var ResourceType: typings.awsSdk.configserviceMod.ResourceType = js.native
}

object ListAggregateDiscoveredResourcesRequest {
  @scala.inline
  def apply(
    ConfigurationAggregatorName: ConfigurationAggregatorName,
    ResourceType: ResourceType,
    Filters: ResourceFilters = null,
    Limit: Int | Double = null,
    NextToken: NextToken = null
  ): ListAggregateDiscoveredResourcesRequest = {
    val __obj = js.Dynamic.literal(ConfigurationAggregatorName = ConfigurationAggregatorName.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAggregateDiscoveredResourcesRequest]
  }
}

