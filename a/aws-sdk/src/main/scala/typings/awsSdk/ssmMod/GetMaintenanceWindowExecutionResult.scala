package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMaintenanceWindowExecutionResult extends js.Object {
  /**
    * The time the maintenance window finished running.
    */
  var EndTime: js.UndefOr[DateTime] = js.native
  /**
    * The time the maintenance window started running.
    */
  var StartTime: js.UndefOr[DateTime] = js.native
  /**
    * The status of the maintenance window execution.
    */
  var Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.native
  /**
    * The details explaining the Status. Only available for certain status values.
    */
  var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.native
  /**
    * The ID of the task executions from the maintenance window execution.
    */
  var TaskIds: js.UndefOr[MaintenanceWindowExecutionTaskIdList] = js.native
  /**
    * The ID of the maintenance window execution.
    */
  var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.native
}

object GetMaintenanceWindowExecutionResult {
  @scala.inline
  def apply(
    EndTime: DateTime = null,
    StartTime: DateTime = null,
    Status: MaintenanceWindowExecutionStatus = null,
    StatusDetails: MaintenanceWindowExecutionStatusDetails = null,
    TaskIds: MaintenanceWindowExecutionTaskIdList = null,
    WindowExecutionId: MaintenanceWindowExecutionId = null
  ): GetMaintenanceWindowExecutionResult = {
    val __obj = js.Dynamic.literal()
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusDetails != null) __obj.updateDynamic("StatusDetails")(StatusDetails.asInstanceOf[js.Any])
    if (TaskIds != null) __obj.updateDynamic("TaskIds")(TaskIds.asInstanceOf[js.Any])
    if (WindowExecutionId != null) __obj.updateDynamic("WindowExecutionId")(WindowExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMaintenanceWindowExecutionResult]
  }
}

