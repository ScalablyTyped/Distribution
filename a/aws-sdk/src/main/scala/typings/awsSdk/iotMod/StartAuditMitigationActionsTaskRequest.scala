package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartAuditMitigationActionsTaskRequest extends js.Object {
  /**
    * For an audit check, specifies which mitigation actions to apply. Those actions must be defined in your AWS account.
    */
  var auditCheckToActionsMapping: AuditCheckToActionsMapping = js.native
  /**
    * Each audit mitigation task must have a unique client request token. If you try to start a new task with the same token as a task that already exists, an exception occurs. If you omit this value, a unique client request token is generated automatically.
    */
  var clientRequestToken: ClientRequestToken = js.native
  /**
    * Specifies the audit findings to which the mitigation actions are applied. You can apply them to a type of audit check, to all findings from an audit, or to a speecific set of findings.
    */
  var target: AuditMitigationActionsTaskTarget = js.native
  /**
    * A unique identifier for the task. You can use this identifier to check the status of the task or to cancel it.
    */
  var taskId: AuditMitigationActionsTaskId = js.native
}

object StartAuditMitigationActionsTaskRequest {
  @scala.inline
  def apply(
    auditCheckToActionsMapping: AuditCheckToActionsMapping,
    clientRequestToken: ClientRequestToken,
    target: AuditMitigationActionsTaskTarget,
    taskId: AuditMitigationActionsTaskId
  ): StartAuditMitigationActionsTaskRequest = {
    val __obj = js.Dynamic.literal(auditCheckToActionsMapping = auditCheckToActionsMapping.asInstanceOf[js.Any], clientRequestToken = clientRequestToken.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartAuditMitigationActionsTaskRequest]
  }
}

