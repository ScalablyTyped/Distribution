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
  def apply(): ResourceComplianceSummaryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceComplianceSummaryItem]
  }
  @scala.inline
  implicit class ResourceComplianceSummaryItemOps[Self <: ResourceComplianceSummaryItem] (val x: Self) extends AnyVal {
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
    def setComplianceType(value: ComplianceTypeName): Self = this.set("ComplianceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplianceType: Self = this.set("ComplianceType", js.undefined)
    @scala.inline
    def setCompliantSummary(value: CompliantSummary): Self = this.set("CompliantSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompliantSummary: Self = this.set("CompliantSummary", js.undefined)
    @scala.inline
    def setExecutionSummary(value: ComplianceExecutionSummary): Self = this.set("ExecutionSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionSummary: Self = this.set("ExecutionSummary", js.undefined)
    @scala.inline
    def setNonCompliantSummary(value: NonCompliantSummary): Self = this.set("NonCompliantSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonCompliantSummary: Self = this.set("NonCompliantSummary", js.undefined)
    @scala.inline
    def setOverallSeverity(value: ComplianceSeverity): Self = this.set("OverallSeverity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverallSeverity: Self = this.set("OverallSeverity", js.undefined)
    @scala.inline
    def setResourceId(value: ComplianceResourceId): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceId: Self = this.set("ResourceId", js.undefined)
    @scala.inline
    def setResourceType(value: ComplianceResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
    @scala.inline
    def setStatus(value: ComplianceStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

