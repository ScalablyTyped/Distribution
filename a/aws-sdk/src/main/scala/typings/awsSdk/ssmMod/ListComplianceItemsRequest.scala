package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListComplianceItemsRequest extends js.Object {
  /**
    * One or more compliance filters. Use a filter to return a more specific list of results.
    */
  var Filters: js.UndefOr[ComplianceStringFilterList] = js.native
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ssmMod.MaxResults] = js.native
  /**
    * A token to start the list. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * The ID for the resources from which to get compliance information. Currently, you can only specify one resource ID.
    */
  var ResourceIds: js.UndefOr[ComplianceResourceIdList] = js.native
  /**
    * The type of resource from which to get compliance information. Currently, the only supported resource type is ManagedInstance.
    */
  var ResourceTypes: js.UndefOr[ComplianceResourceTypeList] = js.native
}

object ListComplianceItemsRequest {
  @scala.inline
  def apply(
    Filters: ComplianceStringFilterList = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    ResourceIds: ComplianceResourceIdList = null,
    ResourceTypes: ComplianceResourceTypeList = null
  ): ListComplianceItemsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ResourceIds != null) __obj.updateDynamic("ResourceIds")(ResourceIds.asInstanceOf[js.Any])
    if (ResourceTypes != null) __obj.updateDynamic("ResourceTypes")(ResourceTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListComplianceItemsRequest]
  }
}

