package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMaintenanceWindowTargetsRequest extends js.Object {
  /**
    * Optional filters that can be used to narrow down the scope of the returned window targets. The supported filter keys are Type, WindowTargetId and OwnerInformation.
    */
  var Filters: js.UndefOr[MaintenanceWindowFilterList] = js.native
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * The ID of the maintenance window whose targets should be retrieved.
    */
  var WindowId: MaintenanceWindowId = js.native
}

object DescribeMaintenanceWindowTargetsRequest {
  @scala.inline
  def apply(
    WindowId: MaintenanceWindowId,
    Filters: MaintenanceWindowFilterList = null,
    MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
    NextToken: NextToken = null
  ): DescribeMaintenanceWindowTargetsRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMaintenanceWindowTargetsRequest]
  }
}

