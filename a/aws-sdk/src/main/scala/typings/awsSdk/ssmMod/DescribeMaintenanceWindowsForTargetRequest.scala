package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMaintenanceWindowsForTargetRequest extends js.Object {
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[MaintenanceWindowSearchMaxResults] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * The type of resource you want to retrieve information about. For example, "INSTANCE".
    */
  var ResourceType: MaintenanceWindowResourceType = js.native
  /**
    * The instance ID or key/value pair to retrieve information about.
    */
  var Targets: typings.awsSdk.ssmMod.Targets = js.native
}

object DescribeMaintenanceWindowsForTargetRequest {
  @scala.inline
  def apply(
    ResourceType: MaintenanceWindowResourceType,
    Targets: Targets,
    MaxResults: js.UndefOr[MaintenanceWindowSearchMaxResults] = js.undefined,
    NextToken: NextToken = null
  ): DescribeMaintenanceWindowsForTargetRequest = {
    val __obj = js.Dynamic.literal(ResourceType = ResourceType.asInstanceOf[js.Any], Targets = Targets.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMaintenanceWindowsForTargetRequest]
  }
}

