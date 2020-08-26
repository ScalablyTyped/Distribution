package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAuditTaskResponse extends js.Object {
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
  implicit class DescribeAuditTaskResponseOps[Self <: DescribeAuditTaskResponse] (val x: Self) extends AnyVal {
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
    def setAuditDetails(value: AuditDetails): Self = this.set("auditDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuditDetails: Self = this.set("auditDetails", js.undefined)
    @scala.inline
    def setScheduledAuditName(value: ScheduledAuditName): Self = this.set("scheduledAuditName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduledAuditName: Self = this.set("scheduledAuditName", js.undefined)
    @scala.inline
    def setTaskStartTime(value: Timestamp): Self = this.set("taskStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskStartTime: Self = this.set("taskStartTime", js.undefined)
    @scala.inline
    def setTaskStatistics(value: TaskStatistics): Self = this.set("taskStatistics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskStatistics: Self = this.set("taskStatistics", js.undefined)
    @scala.inline
    def setTaskStatus(value: AuditTaskStatus): Self = this.set("taskStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskStatus: Self = this.set("taskStatus", js.undefined)
    @scala.inline
    def setTaskType(value: AuditTaskType): Self = this.set("taskType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskType: Self = this.set("taskType", js.undefined)
  }
  
}

