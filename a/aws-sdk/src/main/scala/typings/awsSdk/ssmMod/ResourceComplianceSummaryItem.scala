package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceComplianceSummaryItem extends js.Object {
  /**
    * The compliance type.
    */
  var ComplianceType: js.UndefOr[ComplianceTypeName] = js.native
  /**
    * A list of items that are compliant for the resource.
    */
  var CompliantSummary: js.UndefOr[typings.awsSdk.ssmMod.CompliantSummary] = js.native
  /**
    * Information about the execution.
    */
  var ExecutionSummary: js.UndefOr[ComplianceExecutionSummary] = js.native
  /**
    * A list of items that aren't compliant for the resource.
    */
  var NonCompliantSummary: js.UndefOr[typings.awsSdk.ssmMod.NonCompliantSummary] = js.native
  /**
    * The highest severity item found for the resource. The resource is compliant for this item.
    */
  var OverallSeverity: js.UndefOr[ComplianceSeverity] = js.native
  /**
    * The resource ID.
    */
  var ResourceId: js.UndefOr[ComplianceResourceId] = js.native
  /**
    * The resource type.
    */
  var ResourceType: js.UndefOr[ComplianceResourceType] = js.native
  /**
    * The compliance status for the resource.
    */
  var Status: js.UndefOr[ComplianceStatus] = js.native
}

object ResourceComplianceSummaryItem {
  @scala.inline
  def apply(
    ComplianceType: ComplianceTypeName = null,
    CompliantSummary: CompliantSummary = null,
    ExecutionSummary: ComplianceExecutionSummary = null,
    NonCompliantSummary: NonCompliantSummary = null,
    OverallSeverity: ComplianceSeverity = null,
    ResourceId: ComplianceResourceId = null,
    ResourceType: ComplianceResourceType = null,
    Status: ComplianceStatus = null
  ): ResourceComplianceSummaryItem = {
    val __obj = js.Dynamic.literal()
    if (ComplianceType != null) __obj.updateDynamic("ComplianceType")(ComplianceType.asInstanceOf[js.Any])
    if (CompliantSummary != null) __obj.updateDynamic("CompliantSummary")(CompliantSummary.asInstanceOf[js.Any])
    if (ExecutionSummary != null) __obj.updateDynamic("ExecutionSummary")(ExecutionSummary.asInstanceOf[js.Any])
    if (NonCompliantSummary != null) __obj.updateDynamic("NonCompliantSummary")(NonCompliantSummary.asInstanceOf[js.Any])
    if (OverallSeverity != null) __obj.updateDynamic("OverallSeverity")(OverallSeverity.asInstanceOf[js.Any])
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceComplianceSummaryItem]
  }
}

