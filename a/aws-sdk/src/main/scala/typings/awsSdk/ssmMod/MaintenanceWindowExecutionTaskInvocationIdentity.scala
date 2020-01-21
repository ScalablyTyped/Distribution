package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowExecutionTaskInvocationIdentity extends js.Object {
  /**
    * The time the invocation finished.
    */
  var EndTime: js.UndefOr[DateTime] = js.native
  /**
    * The ID of the action performed in the service that actually handled the task invocation. If the task type is RUN_COMMAND, this value is the command ID.
    */
  var ExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskExecutionId] = js.native
  /**
    * The ID of the task invocation.
    */
  var InvocationId: js.UndefOr[MaintenanceWindowExecutionTaskInvocationId] = js.native
  /**
    * User-provided value that was specified when the target was registered with the maintenance window. This was also included in any CloudWatch events raised during the task invocation.
    */
  var OwnerInformation: js.UndefOr[typings.awsSdk.ssmMod.OwnerInformation] = js.native
  /**
    * The parameters that were provided for the invocation when it was run.
    */
  var Parameters: js.UndefOr[MaintenanceWindowExecutionTaskInvocationParameters] = js.native
  /**
    * The time the invocation started.
    */
  var StartTime: js.UndefOr[DateTime] = js.native
  /**
    * The status of the task invocation.
    */
  var Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.native
  /**
    * The details explaining the status of the task invocation. Only available for certain Status values. 
    */
  var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.native
  /**
    * The ID of the specific task execution in the maintenance window execution.
    */
  var TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.native
  /**
    * The task type.
    */
  var TaskType: js.UndefOr[MaintenanceWindowTaskType] = js.native
  /**
    * The ID of the maintenance window execution that ran the task.
    */
  var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.native
  /**
    * The ID of the target definition in this maintenance window the invocation was performed for.
    */
  var WindowTargetId: js.UndefOr[MaintenanceWindowTaskTargetId] = js.native
}

object MaintenanceWindowExecutionTaskInvocationIdentity {
  @scala.inline
  def apply(
    EndTime: DateTime = null,
    ExecutionId: MaintenanceWindowExecutionTaskExecutionId = null,
    InvocationId: MaintenanceWindowExecutionTaskInvocationId = null,
    OwnerInformation: OwnerInformation = null,
    Parameters: MaintenanceWindowExecutionTaskInvocationParameters = null,
    StartTime: DateTime = null,
    Status: MaintenanceWindowExecutionStatus = null,
    StatusDetails: MaintenanceWindowExecutionStatusDetails = null,
    TaskExecutionId: MaintenanceWindowExecutionTaskId = null,
    TaskType: MaintenanceWindowTaskType = null,
    WindowExecutionId: MaintenanceWindowExecutionId = null,
    WindowTargetId: MaintenanceWindowTaskTargetId = null
  ): MaintenanceWindowExecutionTaskInvocationIdentity = {
    val __obj = js.Dynamic.literal()
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (ExecutionId != null) __obj.updateDynamic("ExecutionId")(ExecutionId.asInstanceOf[js.Any])
    if (InvocationId != null) __obj.updateDynamic("InvocationId")(InvocationId.asInstanceOf[js.Any])
    if (OwnerInformation != null) __obj.updateDynamic("OwnerInformation")(OwnerInformation.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusDetails != null) __obj.updateDynamic("StatusDetails")(StatusDetails.asInstanceOf[js.Any])
    if (TaskExecutionId != null) __obj.updateDynamic("TaskExecutionId")(TaskExecutionId.asInstanceOf[js.Any])
    if (TaskType != null) __obj.updateDynamic("TaskType")(TaskType.asInstanceOf[js.Any])
    if (WindowExecutionId != null) __obj.updateDynamic("WindowExecutionId")(WindowExecutionId.asInstanceOf[js.Any])
    if (WindowTargetId != null) __obj.updateDynamic("WindowTargetId")(WindowTargetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowExecutionTaskInvocationIdentity]
  }
}

