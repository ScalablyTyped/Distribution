package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMaintenanceWindowExecutionTaskResult extends StObject {
  
  /**
    * The time the task execution completed.
    */
  var EndTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The defined maximum number of task executions that could be run in parallel.
    */
  var MaxConcurrency: js.UndefOr[typings.awsSdk.ssmMod.MaxConcurrency] = js.undefined
  
  /**
    * The defined maximum number of task execution errors allowed before scheduling of the task execution would have been stopped.
    */
  var MaxErrors: js.UndefOr[typings.awsSdk.ssmMod.MaxErrors] = js.undefined
  
  /**
    * The priority of the task.
    */
  var Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined
  
  /**
    * The role that was assumed when running the task.
    */
  var ServiceRole: js.UndefOr[typings.awsSdk.ssmMod.ServiceRole] = js.undefined
  
  /**
    * The time the task execution started.
    */
  var StartTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The status of the task.
    */
  var Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined
  
  /**
    * The details explaining the Status. Only available for certain status values.
    */
  var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined
  
  /**
    * The ARN of the task that ran.
    */
  var TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined
  
  /**
    * The ID of the specific task execution in the maintenance window task that was retrieved.
    */
  var TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.undefined
  
  /**
    * The parameters passed to the task when it was run.   TaskParameters has been deprecated. To specify parameters to pass to a task when it runs, instead use the Parameters option in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters.  The map has the following format: Key: string, between 1 and 255 characters Value: an array of strings, each string is between 1 and 255 characters
    */
  var TaskParameters: js.UndefOr[MaintenanceWindowTaskParametersList] = js.undefined
  
  /**
    * The type of task that was run.
    */
  var Type: js.UndefOr[MaintenanceWindowTaskType] = js.undefined
  
  /**
    * The ID of the maintenance window execution that includes the task.
    */
  var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined
}
object GetMaintenanceWindowExecutionTaskResult {
  
  @scala.inline
  def apply(): GetMaintenanceWindowExecutionTaskResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMaintenanceWindowExecutionTaskResult]
  }
  
  @scala.inline
  implicit class GetMaintenanceWindowExecutionTaskResultMutableBuilder[Self <: GetMaintenanceWindowExecutionTaskResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: DateTime): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setMaxConcurrency(value: MaxConcurrency): Self = StObject.set(x, "MaxConcurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConcurrencyUndefined: Self = StObject.set(x, "MaxConcurrency", js.undefined)
    
    @scala.inline
    def setMaxErrors(value: MaxErrors): Self = StObject.set(x, "MaxErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxErrorsUndefined: Self = StObject.set(x, "MaxErrors", js.undefined)
    
    @scala.inline
    def setPriority(value: MaintenanceWindowTaskPriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    @scala.inline
    def setServiceRole(value: ServiceRole): Self = StObject.set(x, "ServiceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRoleUndefined: Self = StObject.set(x, "ServiceRole", js.undefined)
    
    @scala.inline
    def setStartTime(value: DateTime): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setStatus(value: MaintenanceWindowExecutionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusDetails(value: MaintenanceWindowExecutionStatusDetails): Self = StObject.set(x, "StatusDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusDetailsUndefined: Self = StObject.set(x, "StatusDetails", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTaskArn(value: MaintenanceWindowTaskArn): Self = StObject.set(x, "TaskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskArnUndefined: Self = StObject.set(x, "TaskArn", js.undefined)
    
    @scala.inline
    def setTaskExecutionId(value: MaintenanceWindowExecutionTaskId): Self = StObject.set(x, "TaskExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskExecutionIdUndefined: Self = StObject.set(x, "TaskExecutionId", js.undefined)
    
    @scala.inline
    def setTaskParameters(value: MaintenanceWindowTaskParametersList): Self = StObject.set(x, "TaskParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskParametersUndefined: Self = StObject.set(x, "TaskParameters", js.undefined)
    
    @scala.inline
    def setTaskParametersVarargs(value: MaintenanceWindowTaskParameters*): Self = StObject.set(x, "TaskParameters", js.Array(value :_*))
    
    @scala.inline
    def setType(value: MaintenanceWindowTaskType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setWindowExecutionId(value: MaintenanceWindowExecutionId): Self = StObject.set(x, "WindowExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowExecutionIdUndefined: Self = StObject.set(x, "WindowExecutionId", js.undefined)
  }
}
