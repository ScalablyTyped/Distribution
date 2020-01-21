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
  def apply(
    auditDetails: AuditDetails = null,
    scheduledAuditName: ScheduledAuditName = null,
    taskStartTime: Timestamp = null,
    taskStatistics: TaskStatistics = null,
    taskStatus: AuditTaskStatus = null,
    taskType: AuditTaskType = null
  ): DescribeAuditTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (auditDetails != null) __obj.updateDynamic("auditDetails")(auditDetails.asInstanceOf[js.Any])
    if (scheduledAuditName != null) __obj.updateDynamic("scheduledAuditName")(scheduledAuditName.asInstanceOf[js.Any])
    if (taskStartTime != null) __obj.updateDynamic("taskStartTime")(taskStartTime.asInstanceOf[js.Any])
    if (taskStatistics != null) __obj.updateDynamic("taskStatistics")(taskStatistics.asInstanceOf[js.Any])
    if (taskStatus != null) __obj.updateDynamic("taskStatus")(taskStatus.asInstanceOf[js.Any])
    if (taskType != null) __obj.updateDynamic("taskType")(taskType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAuditTaskResponse]
  }
}

