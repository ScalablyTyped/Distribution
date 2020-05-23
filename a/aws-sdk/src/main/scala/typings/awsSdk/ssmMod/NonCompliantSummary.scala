package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NonCompliantSummary extends js.Object {
  /**
    * The total number of compliance items that are not compliant.
    */
  var NonCompliantCount: js.UndefOr[ComplianceSummaryCount] = js.native
  /**
    * A summary of the non-compliance severity by compliance type
    */
  var SeveritySummary: js.UndefOr[typings.awsSdk.ssmMod.SeveritySummary] = js.native
}

object NonCompliantSummary {
  @scala.inline
  def apply(
    NonCompliantCount: js.UndefOr[ComplianceSummaryCount] = js.undefined,
    SeveritySummary: SeveritySummary = null
  ): NonCompliantSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(NonCompliantCount)) __obj.updateDynamic("NonCompliantCount")(NonCompliantCount.get.asInstanceOf[js.Any])
    if (SeveritySummary != null) __obj.updateDynamic("SeveritySummary")(SeveritySummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonCompliantSummary]
  }
}

