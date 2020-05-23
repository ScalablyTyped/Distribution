package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowTask extends js.Object {
  /**
    * A description of the task.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.native
  /**
    * Information about an S3 bucket to write task-level logs to.   LoggingInfo has been deprecated. To specify an S3 bucket to contain logs, instead use the OutputS3BucketName and OutputS3KeyPrefix options in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters. 
    */
  var LoggingInfo: js.UndefOr[typings.awsSdk.ssmMod.LoggingInfo] = js.native
  /**
    * The maximum number of targets this task can be run for, in parallel.
    */
  var MaxConcurrency: js.UndefOr[typings.awsSdk.ssmMod.MaxConcurrency] = js.native
  /**
    * The maximum number of errors allowed before this task stops being scheduled.
    */
  var MaxErrors: js.UndefOr[typings.awsSdk.ssmMod.MaxErrors] = js.native
  /**
    * The task name.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.native
  /**
    * The priority of the task in the maintenance window. The lower the number, the higher the priority. Tasks that have the same priority are scheduled in parallel.
    */
  var Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.native
  /**
    * The ARN of the IAM service role to use to publish Amazon Simple Notification Service (Amazon SNS) notifications for maintenance window Run Command tasks.
    */
  var ServiceRoleArn: js.UndefOr[ServiceRole] = js.native
  /**
    * The targets (either instances or tags). Instances are specified using Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are specified using Key=&lt;tag name&gt;,Values=&lt;tag value&gt;.
    */
  var Targets: js.UndefOr[typings.awsSdk.ssmMod.Targets] = js.native
  /**
    * The resource that the task uses during execution. For RUN_COMMAND and AUTOMATION task types, TaskArn is the Systems Manager document name or ARN. For LAMBDA tasks, it's the function name or ARN. For STEP_FUNCTIONS tasks, it's the state machine ARN.
    */
  var TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.native
  /**
    * The parameters that should be passed to the task when it is run.   TaskParameters has been deprecated. To specify parameters to pass to a task when it runs, instead use the Parameters option in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters. 
    */
  var TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.native
  /**
    * The type of task. The type can be one of the following: RUN_COMMAND, AUTOMATION, LAMBDA, or STEP_FUNCTIONS.
    */
  var Type: js.UndefOr[MaintenanceWindowTaskType] = js.native
  /**
    * The ID of the maintenance window where the task is registered.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.native
  /**
    * The task ID.
    */
  var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.native
}

object MaintenanceWindowTask {
  @scala.inline
  def apply(
    Description: MaintenanceWindowDescription = null,
    LoggingInfo: LoggingInfo = null,
    MaxConcurrency: MaxConcurrency = null,
    MaxErrors: MaxErrors = null,
    Name: MaintenanceWindowName = null,
    Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined,
    ServiceRoleArn: ServiceRole = null,
    Targets: Targets = null,
    TaskArn: MaintenanceWindowTaskArn = null,
    TaskParameters: MaintenanceWindowTaskParameters = null,
    Type: MaintenanceWindowTaskType = null,
    WindowId: MaintenanceWindowId = null,
    WindowTaskId: MaintenanceWindowTaskId = null
  ): MaintenanceWindowTask = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (LoggingInfo != null) __obj.updateDynamic("LoggingInfo")(LoggingInfo.asInstanceOf[js.Any])
    if (MaxConcurrency != null) __obj.updateDynamic("MaxConcurrency")(MaxConcurrency.asInstanceOf[js.Any])
    if (MaxErrors != null) __obj.updateDynamic("MaxErrors")(MaxErrors.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (!js.isUndefined(Priority)) __obj.updateDynamic("Priority")(Priority.get.asInstanceOf[js.Any])
    if (ServiceRoleArn != null) __obj.updateDynamic("ServiceRoleArn")(ServiceRoleArn.asInstanceOf[js.Any])
    if (Targets != null) __obj.updateDynamic("Targets")(Targets.asInstanceOf[js.Any])
    if (TaskArn != null) __obj.updateDynamic("TaskArn")(TaskArn.asInstanceOf[js.Any])
    if (TaskParameters != null) __obj.updateDynamic("TaskParameters")(TaskParameters.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (WindowId != null) __obj.updateDynamic("WindowId")(WindowId.asInstanceOf[js.Any])
    if (WindowTaskId != null) __obj.updateDynamic("WindowTaskId")(WindowTaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowTask]
  }
}

