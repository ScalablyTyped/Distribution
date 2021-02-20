package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAuditTaskResponse extends StObject {
  
  /**
    * Detailed information about each check performed during this audit.
    */
  var auditDetails: js.UndefOr[AuditDetails] = js.native
  
  /**
    * The name of the scheduled audit (only if the audit was a scheduled audit).
    */
  var scheduledAuditName: js.UndefOr[ScheduledAuditName] = js.native
  
  /**
    * The time the audit started.
    */
  var taskStartTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * Statistical information about the audit.
    */
  var taskStatistics: js.UndefOr[TaskStatistics] = js.native
  
  /**
    * The status of the audit: one of "IN_PROGRESS", "COMPLETED", "FAILED", or "CANCELED".
    */
  var taskStatus: js.UndefOr[AuditTaskStatus] = js.native
  
  /**
    * The type of audit: "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
    */
  var taskType: js.UndefOr[AuditTaskType] = js.native
}
object DescribeAuditTaskResponse {
  
  @scala.inline
  def apply(): DescribeAuditTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAuditTaskResponse]
  }
  
  @scala.inline
  implicit class DescribeAuditTaskResponseMutableBuilder[Self <: DescribeAuditTaskResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuditDetails(value: AuditDetails): Self = StObject.set(x, "auditDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuditDetailsUndefined: Self = StObject.set(x, "auditDetails", js.undefined)
    
    @scala.inline
    def setScheduledAuditName(value: ScheduledAuditName): Self = StObject.set(x, "scheduledAuditName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledAuditNameUndefined: Self = StObject.set(x, "scheduledAuditName", js.undefined)
    
    @scala.inline
    def setTaskStartTime(value: Timestamp): Self = StObject.set(x, "taskStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskStartTimeUndefined: Self = StObject.set(x, "taskStartTime", js.undefined)
    
    @scala.inline
    def setTaskStatistics(value: TaskStatistics): Self = StObject.set(x, "taskStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskStatisticsUndefined: Self = StObject.set(x, "taskStatistics", js.undefined)
    
    @scala.inline
    def setTaskStatus(value: AuditTaskStatus): Self = StObject.set(x, "taskStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskStatusUndefined: Self = StObject.set(x, "taskStatus", js.undefined)
    
    @scala.inline
    def setTaskType(value: AuditTaskType): Self = StObject.set(x, "taskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskTypeUndefined: Self = StObject.set(x, "taskType", js.undefined)
  }
}
