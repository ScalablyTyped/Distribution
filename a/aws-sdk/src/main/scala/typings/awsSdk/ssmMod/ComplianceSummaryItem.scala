package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplianceSummaryItem extends js.Object {
  /**
    * The type of compliance item. For example, the compliance type can be Association, Patch, or Custom:string.
    */
  var ComplianceType: js.UndefOr[ComplianceTypeName] = js.native
  /**
    * A list of COMPLIANT items for the specified compliance type.
    */
  var CompliantSummary: js.UndefOr[typings.awsSdk.ssmMod.CompliantSummary] = js.native
  /**
    * A list of NON_COMPLIANT items for the specified compliance type.
    */
  var NonCompliantSummary: js.UndefOr[typings.awsSdk.ssmMod.NonCompliantSummary] = js.native
}

object ComplianceSummaryItem {
  @scala.inline
  def apply(): ComplianceSummaryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceSummaryItem]
  }
  @scala.inline
  implicit class ComplianceSummaryItemOps[Self <: ComplianceSummaryItem] (val x: Self) extends AnyVal {
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
    def setNonCompliantSummary(value: NonCompliantSummary): Self = this.set("NonCompliantSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonCompliantSummary: Self = this.set("NonCompliantSummary", js.undefined)
  }
  
}

