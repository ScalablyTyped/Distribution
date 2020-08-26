package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuditFinding extends js.Object {
  /**
    * The audit check that generated this result.
    */
  var checkName: js.UndefOr[AuditCheckName] = js.native
  /**
    * A unique identifier for this set of audit findings. This identifier is used to apply mitigation tasks to one or more sets of findings.
    */
  var findingId: js.UndefOr[FindingId] = js.native
  /**
    * The time the result (finding) was discovered.
    */
  var findingTime: js.UndefOr[Timestamp] = js.native
  /**
    * The resource that was found to be noncompliant with the audit check.
    */
  var nonCompliantResource: js.UndefOr[NonCompliantResource] = js.native
  /**
    * The reason the resource was noncompliant.
    */
  var reasonForNonCompliance: js.UndefOr[ReasonForNonCompliance] = js.native
  /**
    * A code that indicates the reason that the resource was noncompliant.
    */
  var reasonForNonComplianceCode: js.UndefOr[ReasonForNonComplianceCode] = js.native
  /**
    * The list of related resources.
    */
  var relatedResources: js.UndefOr[RelatedResources] = js.native
  /**
    * The severity of the result (finding).
    */
  var severity: js.UndefOr[AuditFindingSeverity] = js.native
  /**
    * The ID of the audit that generated this result (finding).
    */
  var taskId: js.UndefOr[AuditTaskId] = js.native
  /**
    * The time the audit started.
    */
  var taskStartTime: js.UndefOr[Timestamp] = js.native
}

object AuditFinding {
  @scala.inline
  def apply(): AuditFinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditFinding]
  }
  @scala.inline
  implicit class AuditFindingOps[Self <: AuditFinding] (val x: Self) extends AnyVal {
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
    def setCheckName(value: AuditCheckName): Self = this.set("checkName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckName: Self = this.set("checkName", js.undefined)
    @scala.inline
    def setFindingId(value: FindingId): Self = this.set("findingId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindingId: Self = this.set("findingId", js.undefined)
    @scala.inline
    def setFindingTime(value: Timestamp): Self = this.set("findingTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindingTime: Self = this.set("findingTime", js.undefined)
    @scala.inline
    def setNonCompliantResource(value: NonCompliantResource): Self = this.set("nonCompliantResource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonCompliantResource: Self = this.set("nonCompliantResource", js.undefined)
    @scala.inline
    def setReasonForNonCompliance(value: ReasonForNonCompliance): Self = this.set("reasonForNonCompliance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReasonForNonCompliance: Self = this.set("reasonForNonCompliance", js.undefined)
    @scala.inline
    def setReasonForNonComplianceCode(value: ReasonForNonComplianceCode): Self = this.set("reasonForNonComplianceCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReasonForNonComplianceCode: Self = this.set("reasonForNonComplianceCode", js.undefined)
    @scala.inline
    def setRelatedResourcesVarargs(value: RelatedResource*): Self = this.set("relatedResources", js.Array(value :_*))
    @scala.inline
    def setRelatedResources(value: RelatedResources): Self = this.set("relatedResources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelatedResources: Self = this.set("relatedResources", js.undefined)
    @scala.inline
    def setSeverity(value: AuditFindingSeverity): Self = this.set("severity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    @scala.inline
    def setTaskId(value: AuditTaskId): Self = this.set("taskId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskId: Self = this.set("taskId", js.undefined)
    @scala.inline
    def setTaskStartTime(value: Timestamp): Self = this.set("taskStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskStartTime: Self = this.set("taskStartTime", js.undefined)
  }
  
}

