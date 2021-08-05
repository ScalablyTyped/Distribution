package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservationPurchaseRecommendationSummary extends StObject {
  
  /**
    * The currency code used for this recommendation.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The total amount that AWS estimates that this recommendation could save you in a month.
    */
  var TotalEstimatedMonthlySavingsAmount: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The total amount that AWS estimates that this recommendation could save you in a month, as a percentage of your costs.
    */
  var TotalEstimatedMonthlySavingsPercentage: js.UndefOr[GenericString] = js.undefined
}
object ReservationPurchaseRecommendationSummary {
  
  inline def apply(): ReservationPurchaseRecommendationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationPurchaseRecommendationSummary]
  }
  
  extension [Self <: ReservationPurchaseRecommendationSummary](x: Self) {
    
    inline def setCurrencyCode(value: GenericString): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    inline def setTotalEstimatedMonthlySavingsAmount(value: GenericString): Self = StObject.set(x, "TotalEstimatedMonthlySavingsAmount", value.asInstanceOf[js.Any])
    
    inline def setTotalEstimatedMonthlySavingsAmountUndefined: Self = StObject.set(x, "TotalEstimatedMonthlySavingsAmount", js.undefined)
    
    inline def setTotalEstimatedMonthlySavingsPercentage(value: GenericString): Self = StObject.set(x, "TotalEstimatedMonthlySavingsPercentage", value.asInstanceOf[js.Any])
    
    inline def setTotalEstimatedMonthlySavingsPercentageUndefined: Self = StObject.set(x, "TotalEstimatedMonthlySavingsPercentage", js.undefined)
  }
}
