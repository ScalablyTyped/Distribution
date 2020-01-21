package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMaintenanceWindowExecutionTasksResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * Information about the task executions.
    */
  var WindowExecutionTaskIdentities: js.UndefOr[MaintenanceWindowExecutionTaskIdentityList] = js.native
}

object DescribeMaintenanceWindowExecutionTasksResult {
  @scala.inline
  def apply(
    NextToken: NextToken = null,
    WindowExecutionTaskIdentities: MaintenanceWindowExecutionTaskIdentityList = null
  ): DescribeMaintenanceWindowExecutionTasksResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (WindowExecutionTaskIdentities != null) __obj.updateDynamic("WindowExecutionTaskIdentities")(WindowExecutionTaskIdentities.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMaintenanceWindowExecutionTasksResult]
  }
}

