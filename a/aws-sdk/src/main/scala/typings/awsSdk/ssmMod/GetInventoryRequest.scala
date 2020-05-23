package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInventoryRequest extends js.Object {
  /**
    * Returns counts of inventory types based on one or more expressions. For example, if you aggregate by using an expression that uses the AWS:InstanceInformation.PlatformType type, you can see a count of how many Windows and Linux instances exist in your inventoried fleet.
    */
  var Aggregators: js.UndefOr[InventoryAggregatorList] = js.native
  /**
    * One or more filters. Use a filter to return a more specific list of results.
    */
  var Filters: js.UndefOr[InventoryFilterList] = js.native
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ssmMod.MaxResults] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * The list of inventory item types to return.
    */
  var ResultAttributes: js.UndefOr[ResultAttributeList] = js.native
}

object GetInventoryRequest {
  @scala.inline
  def apply(
    Aggregators: InventoryAggregatorList = null,
    Filters: InventoryFilterList = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    ResultAttributes: ResultAttributeList = null
  ): GetInventoryRequest = {
    val __obj = js.Dynamic.literal()
    if (Aggregators != null) __obj.updateDynamic("Aggregators")(Aggregators.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ResultAttributes != null) __obj.updateDynamic("ResultAttributes")(ResultAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInventoryRequest]
  }
}

