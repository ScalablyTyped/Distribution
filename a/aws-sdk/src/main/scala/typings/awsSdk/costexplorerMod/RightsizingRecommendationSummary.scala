package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RightsizingRecommendationSummary extends StObject {
  
  /**
    *  Estimated total savings resulting from modifications, on a monthly basis.
    */
  var EstimatedTotalMonthlySavingsAmount: js.UndefOr[GenericString] = js.undefined
  
  /**
    *  The currency code that AWS used to calculate the savings.
    */
  var SavingsCurrencyCode: js.UndefOr[GenericString] = js.undefined
  
  /**
    *  Savings percentage based on the recommended modifications, relative to the total On-Demand costs associated with these instances.
    */
  var SavingsPercentage: js.UndefOr[GenericString] = js.undefined
  
  /**
    *  Total number of instance recommendations.
    */
  var TotalRecommendationCount: js.UndefOr[GenericString] = js.undefined
}
object RightsizingRecommendationSummary {
  
  @scala.inline
  def apply(): RightsizingRecommendationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RightsizingRecommendationSummary]
  }
  
  @scala.inline
  implicit class RightsizingRecommendationSummaryMutableBuilder[Self <: RightsizingRecommendationSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEstimatedTotalMonthlySavingsAmount(value: GenericString): Self = StObject.set(x, "EstimatedTotalMonthlySavingsAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedTotalMonthlySavingsAmountUndefined: Self = StObject.set(x, "EstimatedTotalMonthlySavingsAmount", js.undefined)
    
    @scala.inline
    def setSavingsCurrencyCode(value: GenericString): Self = StObject.set(x, "SavingsCurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavingsCurrencyCodeUndefined: Self = StObject.set(x, "SavingsCurrencyCode", js.undefined)
    
    @scala.inline
    def setSavingsPercentage(value: GenericString): Self = StObject.set(x, "SavingsPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavingsPercentageUndefined: Self = StObject.set(x, "SavingsPercentage", js.undefined)
    
    @scala.inline
    def setTotalRecommendationCount(value: GenericString): Self = StObject.set(x, "TotalRecommendationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRecommendationCountUndefined: Self = StObject.set(x, "TotalRecommendationCount", js.undefined)
  }
}
