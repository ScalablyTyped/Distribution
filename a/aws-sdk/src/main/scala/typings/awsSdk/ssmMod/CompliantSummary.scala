package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompliantSummary extends js.Object {
  /**
    * The total number of resources that are compliant.
    */
  var CompliantCount: js.UndefOr[ComplianceSummaryCount] = js.native
  /**
    * A summary of the compliance severity by compliance type.
    */
  var SeveritySummary: js.UndefOr[typings.awsSdk.ssmMod.SeveritySummary] = js.native
}

object CompliantSummary {
  @scala.inline
  def apply(
    CompliantCount: js.UndefOr[ComplianceSummaryCount] = js.undefined,
    SeveritySummary: SeveritySummary = null
  ): CompliantSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CompliantCount)) __obj.updateDynamic("CompliantCount")(CompliantCount.get.asInstanceOf[js.Any])
    if (SeveritySummary != null) __obj.updateDynamic("SeveritySummary")(SeveritySummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompliantSummary]
  }
}

