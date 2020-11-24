package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservationPurchaseRecommendationSummary extends js.Object {
  
  /**
    * The currency code used for this recommendation.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.native
  
  /**
    * The total amount that AWS estimates that this recommendation could save you in a month.
    */
  var TotalEstimatedMonthlySavingsAmount: js.UndefOr[GenericString] = js.native
  
  /**
    * The total amount that AWS estimates that this recommendation could save you in a month, as a percentage of your costs.
    */
  var TotalEstimatedMonthlySavingsPercentage: js.UndefOr[GenericString] = js.native
}
object ReservationPurchaseRecommendationSummary {
  
  @scala.inline
  def apply(): ReservationPurchaseRecommendationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationPurchaseRecommendationSummary]
  }
  
  @scala.inline
  implicit class ReservationPurchaseRecommendationSummaryOps[Self <: ReservationPurchaseRecommendationSummary] (val x: Self) extends AnyVal {
    
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
    def setCurrencyCode(value: GenericString): Self = this.set("CurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCode: Self = this.set("CurrencyCode", js.undefined)
    
    @scala.inline
    def setTotalEstimatedMonthlySavingsAmount(value: GenericString): Self = this.set("TotalEstimatedMonthlySavingsAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalEstimatedMonthlySavingsAmount: Self = this.set("TotalEstimatedMonthlySavingsAmount", js.undefined)
    
    @scala.inline
    def setTotalEstimatedMonthlySavingsPercentage(value: GenericString): Self = this.set("TotalEstimatedMonthlySavingsPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalEstimatedMonthlySavingsPercentage: Self = this.set("TotalEstimatedMonthlySavingsPercentage", js.undefined)
  }
}
