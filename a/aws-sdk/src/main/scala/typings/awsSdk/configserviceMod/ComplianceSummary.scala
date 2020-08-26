package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplianceSummary extends js.Object {
  /**
    * The time that AWS Config created the compliance summary.
    */
  var ComplianceSummaryTimestamp: js.UndefOr[Date] = js.native
  /**
    * The number of AWS Config rules or AWS resources that are compliant, up to a maximum of 25 for rules and 100 for resources.
    */
  var CompliantResourceCount: js.UndefOr[ComplianceContributorCount] = js.native
  /**
    * The number of AWS Config rules or AWS resources that are noncompliant, up to a maximum of 25 for rules and 100 for resources.
    */
  var NonCompliantResourceCount: js.UndefOr[ComplianceContributorCount] = js.native
}

object ComplianceSummary {
  @scala.inline
  def apply(): ComplianceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceSummary]
  }
  @scala.inline
  implicit class ComplianceSummaryOps[Self <: ComplianceSummary] (val x: Self) extends AnyVal {
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
    def setComplianceSummaryTimestamp(value: Date): Self = this.set("ComplianceSummaryTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplianceSummaryTimestamp: Self = this.set("ComplianceSummaryTimestamp", js.undefined)
    @scala.inline
    def setCompliantResourceCount(value: ComplianceContributorCount): Self = this.set("CompliantResourceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompliantResourceCount: Self = this.set("CompliantResourceCount", js.undefined)
    @scala.inline
    def setNonCompliantResourceCount(value: ComplianceContributorCount): Self = this.set("NonCompliantResourceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonCompliantResourceCount: Self = this.set("NonCompliantResourceCount", js.undefined)
  }
  
}

