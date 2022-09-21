package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RightsizingRecommendationSummary extends StObject {
  
  /**
    * The estimated total savings resulting from modifications, on a monthly basis.
    */
  var EstimatedTotalMonthlySavingsAmount: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The currency code that Amazon Web Services used to calculate the savings.
    */
  var SavingsCurrencyCode: js.UndefOr[GenericString] = js.undefined
  
  /**
    *  The savings percentage based on the recommended modifications. It's relative to the total On-Demand costs that are associated with these instances.
    */
  var SavingsPercentage: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The total number of instance recommendations.
    */
  var TotalRecommendationCount: js.UndefOr[GenericString] = js.undefined
}
object RightsizingRecommendationSummary {
  
  inline def apply(): RightsizingRecommendationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RightsizingRecommendationSummary]
  }
  
  extension [Self <: RightsizingRecommendationSummary](x: Self) {
    
    inline def setEstimatedTotalMonthlySavingsAmount(value: GenericString): Self = StObject.set(x, "EstimatedTotalMonthlySavingsAmount", value.asInstanceOf[js.Any])
    
    inline def setEstimatedTotalMonthlySavingsAmountUndefined: Self = StObject.set(x, "EstimatedTotalMonthlySavingsAmount", js.undefined)
    
    inline def setSavingsCurrencyCode(value: GenericString): Self = StObject.set(x, "SavingsCurrencyCode", value.asInstanceOf[js.Any])
    
    inline def setSavingsCurrencyCodeUndefined: Self = StObject.set(x, "SavingsCurrencyCode", js.undefined)
    
    inline def setSavingsPercentage(value: GenericString): Self = StObject.set(x, "SavingsPercentage", value.asInstanceOf[js.Any])
    
    inline def setSavingsPercentageUndefined: Self = StObject.set(x, "SavingsPercentage", js.undefined)
    
    inline def setTotalRecommendationCount(value: GenericString): Self = StObject.set(x, "TotalRecommendationCount", value.asInstanceOf[js.Any])
    
    inline def setTotalRecommendationCountUndefined: Self = StObject.set(x, "TotalRecommendationCount", js.undefined)
  }
}
