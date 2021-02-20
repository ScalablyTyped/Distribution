package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMaintenanceWindowExecutionTaskInvocationResult extends StObject {
  
  /**
    * The time that the task finished running on the target.
    */
  var EndTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The execution ID.
    */
  var ExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskExecutionId] = js.native
  
  /**
    * The invocation ID.
    */
  var InvocationId: js.UndefOr[MaintenanceWindowExecutionTaskInvocationId] = js.native
  
  /**
    * User-provided value to be included in any CloudWatch events raised while running tasks for these targets in this maintenance window. 
    */
  var OwnerInformation: js.UndefOr[typings.awsSdk.ssmMod.OwnerInformation] = js.native
  
  /**
    * The parameters used at the time that the task ran.
    */
  var Parameters: js.UndefOr[MaintenanceWindowExecutionTaskInvocationParameters] = js.native
  
  /**
    * The time that the task started running on the target.
    */
  var StartTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The task status for an invocation.
    */
  var Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.native
  
  /**
    * The details explaining the status. Details are only available for certain status values.
    */
  var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.native
  
  /**
    * The task execution ID.
    */
  var TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.native
  
  /**
    * Retrieves the task type for a maintenance window. Task types include the following: LAMBDA, STEP_FUNCTIONS, AUTOMATION, RUN_COMMAND.
    */
  var TaskType: js.UndefOr[MaintenanceWindowTaskType] = js.native
  
  /**
    * The maintenance window execution ID.
    */
  var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.native
  
  /**
    * The maintenance window target ID.
    */
  var WindowTargetId: js.UndefOr[MaintenanceWindowTaskTargetId] = js.native
}
object GetMaintenanceWindowExecutionTaskInvocationResult {
  
  @scala.inline
  def apply(): GetMaintenanceWindowExecutionTaskInvocationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMaintenanceWindowExecutionTaskInvocationResult]
  }
  
  @scala.inline
  implicit class GetMaintenanceWindowExecutionTaskInvocationResultMutableBuilder[Self <: GetMaintenanceWindowExecutionTaskInvocationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: DateTime): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setExecutionId(value: MaintenanceWindowExecutionTaskExecutionId): Self = StObject.set(x, "ExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionIdUndefined: Self = StObject.set(x, "ExecutionId", js.undefined)
    
    @scala.inline
    def setInvocationId(value: MaintenanceWindowExecutionTaskInvocationId): Self = StObject.set(x, "InvocationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvocationIdUndefined: Self = StObject.set(x, "InvocationId", js.undefined)
    
    @scala.inline
    def setOwnerInformation(value: OwnerInformation): Self = StObject.set(x, "OwnerInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerInformationUndefined: Self = StObject.set(x, "OwnerInformation", js.undefined)
    
    @scala.inline
    def setParameters(value: MaintenanceWindowExecutionTaskInvocationParameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
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
    def setTaskExecutionId(value: MaintenanceWindowExecutionTaskId): Self = StObject.set(x, "TaskExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskExecutionIdUndefined: Self = StObject.set(x, "TaskExecutionId", js.undefined)
    
    @scala.inline
    def setTaskType(value: MaintenanceWindowTaskType): Self = StObject.set(x, "TaskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskTypeUndefined: Self = StObject.set(x, "TaskType", js.undefined)
    
    @scala.inline
    def setWindowExecutionId(value: MaintenanceWindowExecutionId): Self = StObject.set(x, "WindowExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowExecutionIdUndefined: Self = StObject.set(x, "WindowExecutionId", js.undefined)
    
    @scala.inline
    def setWindowTargetId(value: MaintenanceWindowTaskTargetId): Self = StObject.set(x, "WindowTargetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowTargetIdUndefined: Self = StObject.set(x, "WindowTargetId", js.undefined)
  }
}
