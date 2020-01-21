package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowExecution extends js.Object {
  /**
    * The time the execution finished.
    */
  var EndTime: js.UndefOr[DateTime] = js.native
  /**
    * The time the execution started.
    */
  var StartTime: js.UndefOr[DateTime] = js.native
  /**
    * The status of the execution.
    */
  var Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.native
  /**
    * The details explaining the Status. Only available for certain status values.
    */
  var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.native
  /**
    * The ID of the maintenance window execution.
    */
  var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.native
  /**
    * The ID of the maintenance window.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.native
}

object MaintenanceWindowExecution {
  @scala.inline
  def apply(
    EndTime: DateTime = null,
    StartTime: DateTime = null,
    Status: MaintenanceWindowExecutionStatus = null,
    StatusDetails: MaintenanceWindowExecutionStatusDetails = null,
    WindowExecutionId: MaintenanceWindowExecutionId = null,
    WindowId: MaintenanceWindowId = null
  ): MaintenanceWindowExecution = {
    val __obj = js.Dynamic.literal()
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusDetails != null) __obj.updateDynamic("StatusDetails")(StatusDetails.asInstanceOf[js.Any])
    if (WindowExecutionId != null) __obj.updateDynamic("WindowExecutionId")(WindowExecutionId.asInstanceOf[js.Any])
    if (WindowId != null) __obj.updateDynamic("WindowId")(WindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowExecution]
  }
}

