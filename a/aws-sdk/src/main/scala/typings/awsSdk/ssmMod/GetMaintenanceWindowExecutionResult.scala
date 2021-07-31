package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMaintenanceWindowExecutionResult extends StObject {
  
  /**
    * The time the maintenance window finished running.
    */
  var EndTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The time the maintenance window started running.
    */
  var StartTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The status of the maintenance window execution.
    */
  var Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined
  
  /**
    * The details explaining the Status. Only available for certain status values.
    */
  var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined
  
  /**
    * The ID of the task executions from the maintenance window execution.
    */
  var TaskIds: js.UndefOr[MaintenanceWindowExecutionTaskIdList] = js.undefined
  
  /**
    * The ID of the maintenance window execution.
    */
  var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined
}
object GetMaintenanceWindowExecutionResult {
  
  @scala.inline
  def apply(): GetMaintenanceWindowExecutionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMaintenanceWindowExecutionResult]
  }
  
  @scala.inline
  implicit class GetMaintenanceWindowExecutionResultMutableBuilder[Self <: GetMaintenanceWindowExecutionResult] (val x: Self) extends AnyVal {
    
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
    def setTaskIds(value: MaintenanceWindowExecutionTaskIdList): Self = StObject.set(x, "TaskIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskIdsUndefined: Self = StObject.set(x, "TaskIds", js.undefined)
    
    @scala.inline
    def setTaskIdsVarargs(value: MaintenanceWindowExecutionTaskId*): Self = StObject.set(x, "TaskIds", js.Array(value :_*))
    
    @scala.inline
    def setWindowExecutionId(value: MaintenanceWindowExecutionId): Self = StObject.set(x, "WindowExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowExecutionIdUndefined: Self = StObject.set(x, "WindowExecutionId", js.undefined)
  }
}
