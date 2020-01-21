package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlansCoverage extends js.Object {
  /**
    * The attribute that applies to a specific Dimension.
    */
  var Attributes: js.UndefOr[typings.awsSdk.costexplorerMod.Attributes] = js.native
  /**
    * The amount of Savings Plans eligible usage that the Savings Plans covered.
    */
  var Coverage: js.UndefOr[SavingsPlansCoverageData] = js.native
  var TimePeriod: js.UndefOr[DateInterval] = js.native
}

object SavingsPlansCoverage {
  @scala.inline
  def apply(
    Attributes: Attributes = null,
    Coverage: SavingsPlansCoverageData = null,
    TimePeriod: DateInterval = null
  ): SavingsPlansCoverage = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (Coverage != null) __obj.updateDynamic("Coverage")(Coverage.asInstanceOf[js.Any])
    if (TimePeriod != null) __obj.updateDynamic("TimePeriod")(TimePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsPlansCoverage]
  }
}

