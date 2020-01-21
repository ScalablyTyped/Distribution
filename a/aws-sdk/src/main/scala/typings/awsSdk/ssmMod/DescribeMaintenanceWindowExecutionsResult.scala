package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMaintenanceWindowExecutionsResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * Information about the maintenance window executions.
    */
  var WindowExecutions: js.UndefOr[MaintenanceWindowExecutionList] = js.native
}

object DescribeMaintenanceWindowExecutionsResult {
  @scala.inline
  def apply(NextToken: NextToken = null, WindowExecutions: MaintenanceWindowExecutionList = null): DescribeMaintenanceWindowExecutionsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (WindowExecutions != null) __obj.updateDynamic("WindowExecutions")(WindowExecutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMaintenanceWindowExecutionsResult]
  }
}

