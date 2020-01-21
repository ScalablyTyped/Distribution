package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuditMitigationActionsTaskTarget extends js.Object {
  /**
    * Specifies a filter in the form of an audit check and set of reason codes that identify the findings from the audit to which the audit mitigation actions task apply.
    */
  var auditCheckToReasonCodeFilter: js.UndefOr[AuditCheckToReasonCodeFilter] = js.native
  /**
    * If the task will apply a mitigation action to findings from a specific audit, this value uniquely identifies the audit.
    */
  var auditTaskId: js.UndefOr[AuditTaskId] = js.native
  /**
    * If the task will apply a mitigation action to one or more listed findings, this value uniquely identifies those findings.
    */
  var findingIds: js.UndefOr[FindingIds] = js.native
}

object AuditMitigationActionsTaskTarget {
  @scala.inline
  def apply(
    auditCheckToReasonCodeFilter: AuditCheckToReasonCodeFilter = null,
    auditTaskId: AuditTaskId = null,
    findingIds: FindingIds = null
  ): AuditMitigationActionsTaskTarget = {
    val __obj = js.Dynamic.literal()
    if (auditCheckToReasonCodeFilter != null) __obj.updateDynamic("auditCheckToReasonCodeFilter")(auditCheckToReasonCodeFilter.asInstanceOf[js.Any])
    if (auditTaskId != null) __obj.updateDynamic("auditTaskId")(auditTaskId.asInstanceOf[js.Any])
    if (findingIds != null) __obj.updateDynamic("findingIds")(findingIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditMitigationActionsTaskTarget]
  }
}

