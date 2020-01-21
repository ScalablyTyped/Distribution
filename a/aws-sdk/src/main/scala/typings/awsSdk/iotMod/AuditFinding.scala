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
  def apply(
    checkName: AuditCheckName = null,
    findingId: FindingId = null,
    findingTime: Timestamp = null,
    nonCompliantResource: NonCompliantResource = null,
    reasonForNonCompliance: ReasonForNonCompliance = null,
    reasonForNonComplianceCode: ReasonForNonComplianceCode = null,
    relatedResources: RelatedResources = null,
    severity: AuditFindingSeverity = null,
    taskId: AuditTaskId = null,
    taskStartTime: Timestamp = null
  ): AuditFinding = {
    val __obj = js.Dynamic.literal()
    if (checkName != null) __obj.updateDynamic("checkName")(checkName.asInstanceOf[js.Any])
    if (findingId != null) __obj.updateDynamic("findingId")(findingId.asInstanceOf[js.Any])
    if (findingTime != null) __obj.updateDynamic("findingTime")(findingTime.asInstanceOf[js.Any])
    if (nonCompliantResource != null) __obj.updateDynamic("nonCompliantResource")(nonCompliantResource.asInstanceOf[js.Any])
    if (reasonForNonCompliance != null) __obj.updateDynamic("reasonForNonCompliance")(reasonForNonCompliance.asInstanceOf[js.Any])
    if (reasonForNonComplianceCode != null) __obj.updateDynamic("reasonForNonComplianceCode")(reasonForNonComplianceCode.asInstanceOf[js.Any])
    if (relatedResources != null) __obj.updateDynamic("relatedResources")(relatedResources.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (taskId != null) __obj.updateDynamic("taskId")(taskId.asInstanceOf[js.Any])
    if (taskStartTime != null) __obj.updateDynamic("taskStartTime")(taskStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditFinding]
  }
}

