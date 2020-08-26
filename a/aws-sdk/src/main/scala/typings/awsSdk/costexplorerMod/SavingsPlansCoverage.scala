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
  def apply(): SavingsPlansCoverage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansCoverage]
  }
  @scala.inline
  implicit class SavingsPlansCoverageOps[Self <: SavingsPlansCoverage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttributes(value: Attributes): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    @scala.inline
    def setCoverage(value: SavingsPlansCoverageData): Self = this.set("Coverage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoverage: Self = this.set("Coverage", js.undefined)
    @scala.inline
    def setTimePeriod(value: DateInterval): Self = this.set("TimePeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimePeriod: Self = this.set("TimePeriod", js.undefined)
  }
  
}

