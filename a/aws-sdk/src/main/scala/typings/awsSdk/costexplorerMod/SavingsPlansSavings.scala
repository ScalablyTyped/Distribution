package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlansSavings extends js.Object {
  /**
    * The savings amount that you are accumulating for the usage that is covered by a Savings Plans, when compared to the On-Demand equivalent of the same usage.
    */
  var NetSavings: js.UndefOr[GenericString] = js.native
  /**
    * How much the amount that the usage would have cost if it was accrued at the On-Demand rate.
    */
  var OnDemandCostEquivalent: js.UndefOr[GenericString] = js.native
}

object SavingsPlansSavings {
  @scala.inline
  def apply(): SavingsPlansSavings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansSavings]
  }
  @scala.inline
  implicit class SavingsPlansSavingsOps[Self <: SavingsPlansSavings] (val x: Self) extends AnyVal {
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
    def setNetSavings(value: GenericString): Self = this.set("NetSavings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetSavings: Self = this.set("NetSavings", js.undefined)
    @scala.inline
    def setOnDemandCostEquivalent(value: GenericString): Self = this.set("OnDemandCostEquivalent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDemandCostEquivalent: Self = this.set("OnDemandCostEquivalent", js.undefined)
  }
  
}

