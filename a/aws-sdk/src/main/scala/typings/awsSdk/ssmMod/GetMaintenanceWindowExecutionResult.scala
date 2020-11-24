package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMaintenanceWindowExecutionResult extends js.Object {
  
  /**
    * The time the maintenance window finished running.
    */
  var EndTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The time the maintenance window started running.
    */
  var StartTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The status of the maintenance window execution.
    */
  var Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.native
  
  /**
    * The details explaining the Status. Only available for certain status values.
    */
  var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.native
  
  /**
    * The ID of the task executions from the maintenance window execution.
    */
  var TaskIds: js.UndefOr[MaintenanceWindowExecutionTaskIdList] = js.native
  
  /**
    * The ID of the maintenance window execution.
    */
  var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.native
}
object GetMaintenanceWindowExecutionResult {
  
  @scala.inline
  def apply(): GetMaintenanceWindowExecutionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMaintenanceWindowExecutionResult]
  }
  
  @scala.inline
  implicit class GetMaintenanceWindowExecutionResultOps[Self <: GetMaintenanceWindowExecutionResult] (val x: Self) extends AnyVal {
    
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
    def setEndTime(value: DateTime): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: DateTime): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    
    @scala.inline
    def setStatus(value: MaintenanceWindowExecutionStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStatusDetails(value: MaintenanceWindowExecutionStatusDetails): Self = this.set("StatusDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusDetails: Self = this.set("StatusDetails", js.undefined)
    
    @scala.inline
    def setTaskIdsVarargs(value: MaintenanceWindowExecutionTaskId*): Self = this.set("TaskIds", js.Array(value :_*))
    
    @scala.inline
    def setTaskIds(value: MaintenanceWindowExecutionTaskIdList): Self = this.set("TaskIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskIds: Self = this.set("TaskIds", js.undefined)
    
    @scala.inline
    def setWindowExecutionId(value: MaintenanceWindowExecutionId): Self = this.set("WindowExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowExecutionId: Self = this.set("WindowExecutionId", js.undefined)
  }
}
