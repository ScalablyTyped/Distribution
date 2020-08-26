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
  def apply(): UpdateMaintenanceWindowTaskResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMaintenanceWindowTaskResult]
  }
  @scala.inline
  implicit class UpdateMaintenanceWindowTaskResultOps[Self <: UpdateMaintenanceWindowTaskResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: MaintenanceWindowDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setLoggingInfo(value: LoggingInfo): Self = this.set("LoggingInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingInfo: Self = this.set("LoggingInfo", js.undefined)
    @scala.inline
    def setMaxConcurrency(value: MaxConcurrency): Self = this.set("MaxConcurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxConcurrency: Self = this.set("MaxConcurrency", js.undefined)
    @scala.inline
    def setMaxErrors(value: MaxErrors): Self = this.set("MaxErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxErrors: Self = this.set("MaxErrors", js.undefined)
    @scala.inline
    def setName(value: MaintenanceWindowName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setPriority(value: MaintenanceWindowTaskPriority): Self = this.set("Priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("Priority", js.undefined)
    @scala.inline
    def setServiceRoleArn(value: ServiceRole): Self = this.set("ServiceRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceRoleArn: Self = this.set("ServiceRoleArn", js.undefined)
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = this.set("Targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: Targets): Self = this.set("Targets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargets: Self = this.set("Targets", js.undefined)
    @scala.inline
    def setTaskArn(value: MaintenanceWindowTaskArn): Self = this.set("TaskArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskArn: Self = this.set("TaskArn", js.undefined)
    @scala.inline
    def setTaskInvocationParameters(value: MaintenanceWindowTaskInvocationParameters): Self = this.set("TaskInvocationParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskInvocationParameters: Self = this.set("TaskInvocationParameters", js.undefined)
    @scala.inline
    def setTaskParameters(value: MaintenanceWindowTaskParameters): Self = this.set("TaskParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskParameters: Self = this.set("TaskParameters", js.undefined)
    @scala.inline
    def setWindowId(value: MaintenanceWindowId): Self = this.set("WindowId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowId: Self = this.set("WindowId", js.undefined)
    @scala.inline
    def setWindowTaskId(value: MaintenanceWindowTaskId): Self = this.set("WindowTaskId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowTaskId: Self = this.set("WindowTaskId", js.undefined)
  }
  
}

