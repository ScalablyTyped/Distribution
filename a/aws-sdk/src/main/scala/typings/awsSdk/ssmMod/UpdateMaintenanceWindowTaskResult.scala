package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMaintenanceWindowTaskResult extends js.Object {
  /**
    * The updated task description.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.native
  /**
    * The updated logging information in Amazon S3.   LoggingInfo has been deprecated. To specify an S3 bucket to contain logs, instead use the OutputS3BucketName and OutputS3KeyPrefix options in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters. 
    */
  var LoggingInfo: js.UndefOr[typings.awsSdk.ssmMod.LoggingInfo] = js.native
  /**
    * The updated MaxConcurrency value.
    */
  var MaxConcurrency: js.UndefOr[typings.awsSdk.ssmMod.MaxConcurrency] = js.native
  /**
    * The updated MaxErrors value.
    */
  var MaxErrors: js.UndefOr[typings.awsSdk.ssmMod.MaxErrors] = js.native
  /**
    * The updated task name.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.native
  /**
    * The updated priority value.
    */
  var Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.native
  /**
    * The ARN of the IAM service role to use to publish Amazon Simple Notification Service (Amazon SNS) notifications for maintenance window Run Command tasks.
    */
  var ServiceRoleArn: js.UndefOr[ServiceRole] = js.native
  /**
    * The updated target values.
    */
  var Targets: js.UndefOr[typings.awsSdk.ssmMod.Targets] = js.native
  /**
    * The updated task ARN value.
    */
  var TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.native
  /**
    * The updated parameter values.
    */
  var TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters] = js.native
  /**
    * The updated parameter values.   TaskParameters has been deprecated. To specify parameters to pass to a task when it runs, instead use the Parameters option in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters. 
    */
  var TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.native
  /**
    * The ID of the maintenance window that was updated.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.native
  /**
    * The task ID of the maintenance window that was updated.
    */
  var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.native
}

object UpdateMaintenanceWindowTaskResult {
  @scala.inline
  def apply(
    Description: MaintenanceWindowDescription = null,
    LoggingInfo: LoggingInfo = null,
    MaxConcurrency: MaxConcurrency = null,
    MaxErrors: MaxErrors = null,
    Name: MaintenanceWindowName = null,
    Priority: Int | Double = null,
    ServiceRoleArn: ServiceRole = null,
    Targets: Targets = null,
    TaskArn: MaintenanceWindowTaskArn = null,
    TaskInvocationParameters: MaintenanceWindowTaskInvocationParameters = null,
    TaskParameters: MaintenanceWindowTaskParameters = null,
    WindowId: MaintenanceWindowId = null,
    WindowTaskId: MaintenanceWindowTaskId = null
  ): UpdateMaintenanceWindowTaskResult = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (LoggingInfo != null) __obj.updateDynamic("LoggingInfo")(LoggingInfo.asInstanceOf[js.Any])
    if (MaxConcurrency != null) __obj.updateDynamic("MaxConcurrency")(MaxConcurrency.asInstanceOf[js.Any])
    if (MaxErrors != null) __obj.updateDynamic("MaxErrors")(MaxErrors.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Priority != null) __obj.updateDynamic("Priority")(Priority.asInstanceOf[js.Any])
    if (ServiceRoleArn != null) __obj.updateDynamic("ServiceRoleArn")(ServiceRoleArn.asInstanceOf[js.Any])
    if (Targets != null) __obj.updateDynamic("Targets")(Targets.asInstanceOf[js.Any])
    if (TaskArn != null) __obj.updateDynamic("TaskArn")(TaskArn.asInstanceOf[js.Any])
    if (TaskInvocationParameters != null) __obj.updateDynamic("TaskInvocationParameters")(TaskInvocationParameters.asInstanceOf[js.Any])
    if (TaskParameters != null) __obj.updateDynamic("TaskParameters")(TaskParameters.asInstanceOf[js.Any])
    if (WindowId != null) __obj.updateDynamic("WindowId")(WindowId.asInstanceOf[js.Any])
    if (WindowTaskId != null) __obj.updateDynamic("WindowTaskId")(WindowTaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMaintenanceWindowTaskResult]
  }
}

