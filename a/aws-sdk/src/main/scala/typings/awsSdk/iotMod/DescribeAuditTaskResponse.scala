package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAuditTaskResponse extends StObject {
  
  /**
    * Detailed information about each check performed during this audit.
    */
  var auditDetails: js.UndefOr[AuditDetails] = js.undefined
  
  /**
    * The name of the scheduled audit (only if the audit was a scheduled audit).
    */
  var scheduledAuditName: js.UndefOr[ScheduledAuditName] = js.undefined
  
  /**
    * The time the audit started.
    */
  var taskStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Statistical information about the audit.
    */
  var taskStatistics: js.UndefOr[TaskStatistics] = js.undefined
  
  /**
    * The status of the audit: one of "IN_PROGRESS", "COMPLETED", "FAILED", or "CANCELED".
    */
  var taskStatus: js.UndefOr[AuditTaskStatus] = js.undefined
  
  /**
    * The type of audit: "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
    */
  var taskType: js.UndefOr[AuditTaskType] = js.undefined
}
object DescribeAuditTaskResponse {
  
  inline def apply(): DescribeAuditTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAuditTaskResponse]
  }
  
  extension [Self <: DescribeAuditTaskResponse](x: Self) {
    
    inline def setAuditDetails(value: AuditDetails): Self = StObject.set(x, "auditDetails", value.asInstanceOf[js.Any])
    
    inline def setAuditDetailsUndefined: Self = StObject.set(x, "auditDetails", js.undefined)
    
    inline def setScheduledAuditName(value: ScheduledAuditName): Self = StObject.set(x, "scheduledAuditName", value.asInstanceOf[js.Any])
    
    inline def setScheduledAuditNameUndefined: Self = StObject.set(x, "scheduledAuditName", js.undefined)
    
    inline def setTaskStartTime(value: js.Date): Self = StObject.set(x, "taskStartTime", value.asInstanceOf[js.Any])
    
    inline def setTaskStartTimeUndefined: Self = StObject.set(x, "taskStartTime", js.undefined)
    
    inline def setTaskStatistics(value: TaskStatistics): Self = StObject.set(x, "taskStatistics", value.asInstanceOf[js.Any])
    
    inline def setTaskStatisticsUndefined: Self = StObject.set(x, "taskStatistics", js.undefined)
    
    inline def setTaskStatus(value: AuditTaskStatus): Self = StObject.set(x, "taskStatus", value.asInstanceOf[js.Any])
    
    inline def setTaskStatusUndefined: Self = StObject.set(x, "taskStatus", js.undefined)
    
    inline def setTaskType(value: AuditTaskType): Self = StObject.set(x, "taskType", value.asInstanceOf[js.Any])
    
    inline def setTaskTypeUndefined: Self = StObject.set(x, "taskType", js.undefined)
  }
}
