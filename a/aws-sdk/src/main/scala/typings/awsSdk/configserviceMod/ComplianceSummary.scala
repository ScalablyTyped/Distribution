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
  def apply(
    ComplianceSummaryTimestamp: Date = null,
    CompliantResourceCount: ComplianceContributorCount = null,
    NonCompliantResourceCount: ComplianceContributorCount = null
  ): ComplianceSummary = {
    val __obj = js.Dynamic.literal()
    if (ComplianceSummaryTimestamp != null) __obj.updateDynamic("ComplianceSummaryTimestamp")(ComplianceSummaryTimestamp.asInstanceOf[js.Any])
    if (CompliantResourceCount != null) __obj.updateDynamic("CompliantResourceCount")(CompliantResourceCount.asInstanceOf[js.Any])
    if (NonCompliantResourceCount != null) __obj.updateDynamic("NonCompliantResourceCount")(NonCompliantResourceCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplianceSummary]
  }
}

