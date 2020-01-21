package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuditTaskMetadata extends js.Object {
  /**
    * The ID of this audit.
    */
  var taskId: js.UndefOr[AuditTaskId] = js.native
  /**
    * The status of this audit. One of "IN_PROGRESS", "COMPLETED", "FAILED", or "CANCELED".
    */
  var taskStatus: js.UndefOr[AuditTaskStatus] = js.native
  /**
    * The type of this audit. One of "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
    */
  var taskType: js.UndefOr[AuditTaskType] = js.native
}

object AuditTaskMetadata {
  @scala.inline
  def apply(taskId: AuditTaskId = null, taskStatus: AuditTaskStatus = null, taskType: AuditTaskType = null): AuditTaskMetadata = {
    val __obj = js.Dynamic.literal()
    if (taskId != null) __obj.updateDynamic("taskId")(taskId.asInstanceOf[js.Any])
    if (taskStatus != null) __obj.updateDynamic("taskStatus")(taskStatus.asInstanceOf[js.Any])
    if (taskType != null) __obj.updateDynamic("taskType")(taskType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditTaskMetadata]
  }
}

