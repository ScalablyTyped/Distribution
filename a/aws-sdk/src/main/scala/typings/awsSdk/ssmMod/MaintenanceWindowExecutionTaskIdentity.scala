package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindowExecutionTaskIdentity extends StObject {
  
  /**
    * The time the task execution finished.
    */
  var EndTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The time the task execution started.
    */
  var StartTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The status of the task execution.
    */
  var Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.native
  
  /**
    * The details explaining the status of the task execution. Only available for certain status values.
    */
  var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.native
  
  /**
    * The ARN of the task that ran.
    */
  var TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.native
  
  /**
    * The ID of the specific task execution in the maintenance window execution.
    */
  var TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.native
  
  /**
    * The type of task that ran.
    */
  var TaskType: js.UndefOr[MaintenanceWindowTaskType] = js.native
  
  /**
    * The ID of the maintenance window execution that ran the task.
    */
  var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.native
}
object MaintenanceWindowExecutionTaskIdentity {
  
  @scala.inline
  def apply(): MaintenanceWindowExecutionTaskIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowExecutionTaskIdentity]
  }
  
  @scala.inline
  implicit class MaintenanceWindowExecutionTaskIdentityMutableBuilder[Self <: MaintenanceWindowExecutionTaskIdentity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: DateTime): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
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
    def setTaskType(value: MaintenanceWindowTaskType): Self = StObject.set(x, "TaskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskTypeUndefined: Self = StObject.set(x, "TaskType", js.undefined)
    
    @scala.inline
    def setWindowExecutionId(value: MaintenanceWindowExecutionId): Self = StObject.set(x, "WindowExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowExecutionIdUndefined: Self = StObject.set(x, "WindowExecutionId", js.undefined)
  }
}
