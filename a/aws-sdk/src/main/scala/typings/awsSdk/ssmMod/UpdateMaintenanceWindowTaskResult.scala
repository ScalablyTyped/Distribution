package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMaintenanceWindowTaskResult extends StObject {
  
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
  implicit class UpdateMaintenanceWindowTaskResultMutableBuilder[Self <: UpdateMaintenanceWindowTaskResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: MaintenanceWindowDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setLoggingInfo(value: LoggingInfo): Self = StObject.set(x, "LoggingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingInfoUndefined: Self = StObject.set(x, "LoggingInfo", js.undefined)
    
    @scala.inline
    def setMaxConcurrency(value: MaxConcurrency): Self = StObject.set(x, "MaxConcurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConcurrencyUndefined: Self = StObject.set(x, "MaxConcurrency", js.undefined)
    
    @scala.inline
    def setMaxErrors(value: MaxErrors): Self = StObject.set(x, "MaxErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxErrorsUndefined: Self = StObject.set(x, "MaxErrors", js.undefined)
    
    @scala.inline
    def setName(value: MaintenanceWindowName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setPriority(value: MaintenanceWindowTaskPriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    @scala.inline
    def setServiceRoleArn(value: ServiceRole): Self = StObject.set(x, "ServiceRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRoleArnUndefined: Self = StObject.set(x, "ServiceRoleArn", js.undefined)
    
    @scala.inline
    def setTargets(value: Targets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value :_*))
    
    @scala.inline
    def setTaskArn(value: MaintenanceWindowTaskArn): Self = StObject.set(x, "TaskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskArnUndefined: Self = StObject.set(x, "TaskArn", js.undefined)
    
    @scala.inline
    def setTaskInvocationParameters(value: MaintenanceWindowTaskInvocationParameters): Self = StObject.set(x, "TaskInvocationParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskInvocationParametersUndefined: Self = StObject.set(x, "TaskInvocationParameters", js.undefined)
    
    @scala.inline
    def setTaskParameters(value: MaintenanceWindowTaskParameters): Self = StObject.set(x, "TaskParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskParametersUndefined: Self = StObject.set(x, "TaskParameters", js.undefined)
    
    @scala.inline
    def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowIdUndefined: Self = StObject.set(x, "WindowId", js.undefined)
    
    @scala.inline
    def setWindowTaskId(value: MaintenanceWindowTaskId): Self = StObject.set(x, "WindowTaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowTaskIdUndefined: Self = StObject.set(x, "WindowTaskId", js.undefined)
  }
}
