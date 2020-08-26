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
  def apply(): AuditTaskMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditTaskMetadata]
  }
  @scala.inline
  implicit class AuditTaskMetadataOps[Self <: AuditTaskMetadata] (val x: Self) extends AnyVal {
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
    def setTaskId(value: AuditTaskId): Self = this.set("taskId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskId: Self = this.set("taskId", js.undefined)
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

