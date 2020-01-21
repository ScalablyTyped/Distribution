package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregateComplianceCount extends js.Object {
  /**
    * The number of compliant and noncompliant AWS Config rules.
    */
  var ComplianceSummary: js.UndefOr[typings.awsSdk.configserviceMod.ComplianceSummary] = js.native
  /**
    * The 12-digit account ID or region based on the GroupByKey value.
    */
  var GroupName: js.UndefOr[StringWithCharLimit256] = js.native
}

object AggregateComplianceCount {
  @scala.inline
  def apply(ComplianceSummary: ComplianceSummary = null, GroupName: StringWithCharLimit256 = null): AggregateComplianceCount = {
    val __obj = js.Dynamic.literal()
    if (ComplianceSummary != null) __obj.updateDynamic("ComplianceSummary")(ComplianceSummary.asInstanceOf[js.Any])
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateComplianceCount]
  }
}

