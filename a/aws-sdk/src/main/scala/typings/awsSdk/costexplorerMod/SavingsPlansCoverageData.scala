package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlansCoverageData extends js.Object {
  /**
    * The percentage of your existing Savings Plans covered usage, divided by all of your eligible Savings Plans usage in an account(or set of accounts).
    */
  var CoveragePercentage: js.UndefOr[GenericString] = js.native
  /**
    * The cost of your Amazon Web Services usage at the public On-Demand rate.
    */
  var OnDemandCost: js.UndefOr[GenericString] = js.native
  /**
    * The amount of your Amazon Web Services usage that is covered by a Savings Plans.
    */
  var SpendCoveredBySavingsPlans: js.UndefOr[GenericString] = js.native
  /**
    * The total cost of your Amazon Web Services usage, regardless of your purchase option.
    */
  var TotalCost: js.UndefOr[GenericString] = js.native
}

object SavingsPlansCoverageData {
  @scala.inline
  def apply(): SavingsPlansCoverageData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansCoverageData]
  }
  @scala.inline
  implicit class SavingsPlansCoverageDataOps[Self <: SavingsPlansCoverageData] (val x: Self) extends AnyVal {
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
    def setCoveragePercentage(value: GenericString): Self = this.set("CoveragePercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoveragePercentage: Self = this.set("CoveragePercentage", js.undefined)
    @scala.inline
    def setOnDemandCost(value: GenericString): Self = this.set("OnDemandCost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDemandCost: Self = this.set("OnDemandCost", js.undefined)
    @scala.inline
    def setSpendCoveredBySavingsPlans(value: GenericString): Self = this.set("SpendCoveredBySavingsPlans", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpendCoveredBySavingsPlans: Self = this.set("SpendCoveredBySavingsPlans", js.undefined)
    @scala.inline
    def setTotalCost(value: GenericString): Self = this.set("TotalCost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalCost: Self = this.set("TotalCost", js.undefined)
  }
  
}

