package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOpsSummaryRequest extends js.Object {
  /**
    * Optional aggregators that return counts of OpsItems based on one or more expressions.
    */
  var Aggregators: js.UndefOr[OpsAggregatorList] = js.native
  /**
    * Optional filters used to scope down the returned OpsItems. 
    */
  var Filters: js.UndefOr[OpsFilterList] = js.native
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ssmMod.MaxResults] = js.native
  /**
    * A token to start the list. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * The OpsItem data type to return.
    */
  var ResultAttributes: js.UndefOr[OpsResultAttributeList] = js.native
  /**
    * Specify the name of a resource data sync to get.
    */
  var SyncName: js.UndefOr[ResourceDataSyncName] = js.native
}

object GetOpsSummaryRequest {
  @scala.inline
  def apply(
    Aggregators: OpsAggregatorList = null,
    Filters: OpsFilterList = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    ResultAttributes: OpsResultAttributeList = null,
    SyncName: ResourceDataSyncName = null
  ): GetOpsSummaryRequest = {
    val __obj = js.Dynamic.literal()
    if (Aggregators != null) __obj.updateDynamic("Aggregators")(Aggregators.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ResultAttributes != null) __obj.updateDynamic("ResultAttributes")(ResultAttributes.asInstanceOf[js.Any])
    if (SyncName != null) __obj.updateDynamic("SyncName")(SyncName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOpsSummaryRequest]
  }
}

