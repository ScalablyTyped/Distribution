package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMaintenanceWindowExecutionTaskInvocationsRequest extends js.Object {
  /**
    * Optional filters used to scope down the returned task invocations. The supported filter key is STATUS with the corresponding values PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING, and CANCELLED.
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
    * The ID of the specific task in the maintenance window task that should be retrieved.
    */
  var TaskId: MaintenanceWindowExecutionTaskId = js.native
  /**
    * The ID of the maintenance window execution the task is part of.
    */
  var WindowExecutionId: MaintenanceWindowExecutionId = js.native
}

object DescribeMaintenanceWindowExecutionTaskInvocationsRequest {
  @scala.inline
  def apply(
    TaskId: MaintenanceWindowExecutionTaskId,
    WindowExecutionId: MaintenanceWindowExecutionId,
    Filters: MaintenanceWindowFilterList = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): DescribeMaintenanceWindowExecutionTaskInvocationsRequest = {
    val __obj = js.Dynamic.literal(TaskId = TaskId.asInstanceOf[js.Any], WindowExecutionId = WindowExecutionId.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMaintenanceWindowExecutionTaskInvocationsRequest]
  }
}

