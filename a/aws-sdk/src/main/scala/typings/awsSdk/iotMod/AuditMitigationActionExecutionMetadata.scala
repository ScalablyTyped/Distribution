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
  def apply(
    actionId: MitigationActionId = null,
    actionName: MitigationActionName = null,
    endTime: Timestamp = null,
    errorCode: ErrorCode = null,
    findingId: FindingId = null,
    message: ErrorMessage = null,
    startTime: Timestamp = null,
    status: AuditMitigationActionsExecutionStatus = null,
    taskId: AuditMitigationActionsTaskId = null
  ): AuditMitigationActionExecutionMetadata = {
    val __obj = js.Dynamic.literal()
    if (actionId != null) __obj.updateDynamic("actionId")(actionId.asInstanceOf[js.Any])
    if (actionName != null) __obj.updateDynamic("actionName")(actionName.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (findingId != null) __obj.updateDynamic("findingId")(findingId.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (taskId != null) __obj.updateDynamic("taskId")(taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditMitigationActionExecutionMetadata]
  }
}

