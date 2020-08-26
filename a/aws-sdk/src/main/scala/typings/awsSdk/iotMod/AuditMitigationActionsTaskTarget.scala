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
  def apply(): AuditMitigationActionsTaskTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditMitigationActionsTaskTarget]
  }
  @scala.inline
  implicit class AuditMitigationActionsTaskTargetOps[Self <: AuditMitigationActionsTaskTarget] (val x: Self) extends AnyVal {
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
    def setAuditCheckToReasonCodeFilter(value: AuditCheckToReasonCodeFilter): Self = this.set("auditCheckToReasonCodeFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuditCheckToReasonCodeFilter: Self = this.set("auditCheckToReasonCodeFilter", js.undefined)
    @scala.inline
    def setAuditTaskId(value: AuditTaskId): Self = this.set("auditTaskId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuditTaskId: Self = this.set("auditTaskId", js.undefined)
    @scala.inline
    def setFindingIdsVarargs(value: FindingId*): Self = this.set("findingIds", js.Array(value :_*))
    @scala.inline
    def setFindingIds(value: FindingIds): Self = this.set("findingIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindingIds: Self = this.set("findingIds", js.undefined)
  }
  
}

