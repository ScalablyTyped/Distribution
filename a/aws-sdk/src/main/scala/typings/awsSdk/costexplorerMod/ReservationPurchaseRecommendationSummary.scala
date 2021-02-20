package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservationPurchaseRecommendationSummary extends StObject {
  
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
  implicit class ReservationPurchaseRecommendationSummaryMutableBuilder[Self <: ReservationPurchaseRecommendationSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrencyCode(value: GenericString): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    @scala.inline
    def setTotalEstimatedMonthlySavingsAmount(value: GenericString): Self = StObject.set(x, "TotalEstimatedMonthlySavingsAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalEstimatedMonthlySavingsAmountUndefined: Self = StObject.set(x, "TotalEstimatedMonthlySavingsAmount", js.undefined)
    
    @scala.inline
    def setTotalEstimatedMonthlySavingsPercentage(value: GenericString): Self = StObject.set(x, "TotalEstimatedMonthlySavingsPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalEstimatedMonthlySavingsPercentageUndefined: Self = StObject.set(x, "TotalEstimatedMonthlySavingsPercentage", js.undefined)
  }
}
