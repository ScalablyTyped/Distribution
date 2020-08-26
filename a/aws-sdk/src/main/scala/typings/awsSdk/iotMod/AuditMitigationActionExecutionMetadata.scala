package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuditMitigationActionExecutionMetadata extends js.Object {
  /**
    * The unique identifier for the mitigation action being applied by the task.
    */
  var actionId: js.UndefOr[MitigationActionId] = js.native
  /**
    * The friendly name of the mitigation action being applied by the task.
    */
  var actionName: js.UndefOr[MitigationActionName] = js.native
  /**
    * The date and time when the task was completed or canceled. Blank if the task is still running.
    */
  var endTime: js.UndefOr[Timestamp] = js.native
  /**
    * If an error occurred, the code that indicates which type of error occurred.
    */
  var errorCode: js.UndefOr[ErrorCode] = js.native
  /**
    * The unique identifier for the findings to which the task and associated mitigation action are applied.
    */
  var findingId: js.UndefOr[FindingId] = js.native
  /**
    * If an error occurred, a message that describes the error.
    */
  var message: js.UndefOr[ErrorMessage] = js.native
  /**
    * The date and time when the task was started.
    */
  var startTime: js.UndefOr[Timestamp] = js.native
  /**
    * The current status of the task being executed.
    */
  var status: js.UndefOr[AuditMitigationActionsExecutionStatus] = js.native
  /**
    * The unique identifier for the task that applies the mitigation action.
    */
  var taskId: js.UndefOr[AuditMitigationActionsTaskId] = js.native
}

object AuditMitigationActionExecutionMetadata {
  @scala.inline
  def apply(): AuditMitigationActionExecutionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditMitigationActionExecutionMetadata]
  }
  @scala.inline
  implicit class AuditMitigationActionExecutionMetadataOps[Self <: AuditMitigationActionExecutionMetadata] (val x: Self) extends AnyVal {
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
    def setActionId(value: MitigationActionId): Self = this.set("actionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionId: Self = this.set("actionId", js.undefined)
    @scala.inline
    def setActionName(value: MitigationActionName): Self = this.set("actionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionName: Self = this.set("actionName", js.undefined)
    @scala.inline
    def setEndTime(value: Timestamp): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setErrorCode(value: ErrorCode): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
    @scala.inline
    def setFindingId(value: FindingId): Self = this.set("findingId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindingId: Self = this.set("findingId", js.undefined)
    @scala.inline
    def setMessage(value: ErrorMessage): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setStatus(value: AuditMitigationActionsExecutionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTaskId(value: AuditMitigationActionsTaskId): Self = this.set("taskId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskId: Self = this.set("taskId", js.undefined)
  }
  
}

