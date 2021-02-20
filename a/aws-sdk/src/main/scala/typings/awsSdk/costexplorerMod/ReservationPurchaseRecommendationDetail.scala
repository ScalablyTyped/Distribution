package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservationPurchaseRecommendationDetail extends StObject {
  
  /**
    * The account that this RI recommendation is for.
    */
  var AccountId: js.UndefOr[GenericString] = js.native
  
  /**
    * The average number of normalized units that you used in an hour during the historical period. AWS uses this to calculate your recommended reservation purchases.
    */
  var AverageNormalizedUnitsUsedPerHour: js.UndefOr[GenericString] = js.native
  
  /**
    * The average number of instances that you used in an hour during the historical period. AWS uses this to calculate your recommended reservation purchases.
    */
  var AverageNumberOfInstancesUsedPerHour: js.UndefOr[GenericString] = js.native
  
  /**
    * The average utilization of your instances. AWS uses this to calculate your recommended reservation purchases.
    */
  var AverageUtilization: js.UndefOr[GenericString] = js.native
  
  /**
    * The currency code that AWS used to calculate the costs for this instance.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.native
  
  /**
    * How long AWS estimates that it takes for this instance to start saving you money, in months.
    */
  var EstimatedBreakEvenInMonths: js.UndefOr[GenericString] = js.native
  
  /**
    * How much AWS estimates that you spend on On-Demand Instances in a month.
    */
  var EstimatedMonthlyOnDemandCost: js.UndefOr[GenericString] = js.native
  
  /**
    * How much AWS estimates that this specific recommendation could save you in a month.
    */
  var EstimatedMonthlySavingsAmount: js.UndefOr[GenericString] = js.native
  
  /**
    * How much AWS estimates that this specific recommendation could save you in a month, as a percentage of your overall costs.
    */
  var EstimatedMonthlySavingsPercentage: js.UndefOr[GenericString] = js.native
  
  /**
    * How much AWS estimates that you would have spent for all usage during the specified historical period if you had a reservation.
    */
  var EstimatedReservationCostForLookbackPeriod: js.UndefOr[GenericString] = js.native
  
  /**
    * Details about the instances that AWS recommends that you purchase.
    */
  var InstanceDetails: js.UndefOr[typings.awsSdk.costexplorerMod.InstanceDetails] = js.native
  
  /**
    * The maximum number of normalized units that you used in an hour during the historical period. AWS uses this to calculate your recommended reservation purchases.
    */
  var MaximumNormalizedUnitsUsedPerHour: js.UndefOr[GenericString] = js.native
  
  /**
    * The maximum number of instances that you used in an hour during the historical period. AWS uses this to calculate your recommended reservation purchases.
    */
  var MaximumNumberOfInstancesUsedPerHour: js.UndefOr[GenericString] = js.native
  
  /**
    * The minimum number of normalized units that you used in an hour during the historical period. AWS uses this to calculate your recommended reservation purchases.
    */
  var MinimumNormalizedUnitsUsedPerHour: js.UndefOr[GenericString] = js.native
  
  /**
    * The minimum number of instances that you used in an hour during the historical period. AWS uses this to calculate your recommended reservation purchases.
    */
  var MinimumNumberOfInstancesUsedPerHour: js.UndefOr[GenericString] = js.native
  
  /**
    * The number of normalized units that AWS recommends that you purchase.
    */
  var RecommendedNormalizedUnitsToPurchase: js.UndefOr[GenericString] = js.native
  
  /**
    * The number of instances that AWS recommends that you purchase.
    */
  var RecommendedNumberOfInstancesToPurchase: js.UndefOr[GenericString] = js.native
  
  /**
    * How much purchasing this instance costs you on a monthly basis.
    */
  var RecurringStandardMonthlyCost: js.UndefOr[GenericString] = js.native
  
  /**
    * How much purchasing this instance costs you upfront.
    */
  var UpfrontCost: js.UndefOr[GenericString] = js.native
}
object ReservationPurchaseRecommendationDetail {
  
  @scala.inline
  def apply(): ReservationPurchaseRecommendationDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationPurchaseRecommendationDetail]
  }
  
  @scala.inline
  implicit class ReservationPurchaseRecommendationDetailMutableBuilder[Self <: ReservationPurchaseRecommendationDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: GenericString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setAverageNormalizedUnitsUsedPerHour(value: GenericString): Self = StObject.set(x, "AverageNormalizedUnitsUsedPerHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageNormalizedUnitsUsedPerHourUndefined: Self = StObject.set(x, "AverageNormalizedUnitsUsedPerHour", js.undefined)
    
    @scala.inline
    def setAverageNumberOfInstancesUsedPerHour(value: GenericString): Self = StObject.set(x, "AverageNumberOfInstancesUsedPerHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageNumberOfInstancesUsedPerHourUndefined: Self = StObject.set(x, "AverageNumberOfInstancesUsedPerHour", js.undefined)
    
    @scala.inline
    def setAverageUtilization(value: GenericString): Self = StObject.set(x, "AverageUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageUtilizationUndefined: Self = StObject.set(x, "AverageUtilization", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: GenericString): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    @scala.inline
    def setEstimatedBreakEvenInMonths(value: GenericString): Self = StObject.set(x, "EstimatedBreakEvenInMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedBreakEvenInMonthsUndefined: Self = StObject.set(x, "EstimatedBreakEvenInMonths", js.undefined)
    
    @scala.inline
    def setEstimatedMonthlyOnDemandCost(value: GenericString): Self = StObject.set(x, "EstimatedMonthlyOnDemandCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedMonthlyOnDemandCostUndefined: Self = StObject.set(x, "EstimatedMonthlyOnDemandCost", js.undefined)
    
    @scala.inline
    def setEstimatedMonthlySavingsAmount(value: GenericString): Self = StObject.set(x, "EstimatedMonthlySavingsAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedMonthlySavingsAmountUndefined: Self = StObject.set(x, "EstimatedMonthlySavingsAmount", js.undefined)
    
    @scala.inline
    def setEstimatedMonthlySavingsPercentage(value: GenericString): Self = StObject.set(x, "EstimatedMonthlySavingsPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedMonthlySavingsPercentageUndefined: Self = StObject.set(x, "EstimatedMonthlySavingsPercentage", js.undefined)
    
    @scala.inline
    def setEstimatedReservationCostForLookbackPeriod(value: GenericString): Self = StObject.set(x, "EstimatedReservationCostForLookbackPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedReservationCostForLookbackPeriodUndefined: Self = StObject.set(x, "EstimatedReservationCostForLookbackPeriod", js.undefined)
    
    @scala.inline
    def setInstanceDetails(value: InstanceDetails): Self = StObject.set(x, "InstanceDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceDetailsUndefined: Self = StObject.set(x, "InstanceDetails", js.undefined)
    
    @scala.inline
    def setMaximumNormalizedUnitsUsedPerHour(value: GenericString): Self = StObject.set(x, "MaximumNormalizedUnitsUsedPerHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumNormalizedUnitsUsedPerHourUndefined: Self = StObject.set(x, "MaximumNormalizedUnitsUsedPerHour", js.undefined)
    
    @scala.inline
    def setMaximumNumberOfInstancesUsedPerHour(value: GenericString): Self = StObject.set(x, "MaximumNumberOfInstancesUsedPerHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumNumberOfInstancesUsedPerHourUndefined: Self = StObject.set(x, "MaximumNumberOfInstancesUsedPerHour", js.undefined)
    
    @scala.inline
    def setMinimumNormalizedUnitsUsedPerHour(value: GenericString): Self = StObject.set(x, "MinimumNormalizedUnitsUsedPerHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumNormalizedUnitsUsedPerHourUndefined: Self = StObject.set(x, "MinimumNormalizedUnitsUsedPerHour", js.undefined)
    
    @scala.inline
    def setMinimumNumberOfInstancesUsedPerHour(value: GenericString): Self = StObject.set(x, "MinimumNumberOfInstancesUsedPerHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumNumberOfInstancesUsedPerHourUndefined: Self = StObject.set(x, "MinimumNumberOfInstancesUsedPerHour", js.undefined)
    
    @scala.inline
    def setRecommendedNormalizedUnitsToPurchase(value: GenericString): Self = StObject.set(x, "RecommendedNormalizedUnitsToPurchase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendedNormalizedUnitsToPurchaseUndefined: Self = StObject.set(x, "RecommendedNormalizedUnitsToPurchase", js.undefined)
    
    @scala.inline
    def setRecommendedNumberOfInstancesToPurchase(value: GenericString): Self = StObject.set(x, "RecommendedNumberOfInstancesToPurchase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendedNumberOfInstancesToPurchaseUndefined: Self = StObject.set(x, "RecommendedNumberOfInstancesToPurchase", js.undefined)
    
    @scala.inline
    def setRecurringStandardMonthlyCost(value: GenericString): Self = StObject.set(x, "RecurringStandardMonthlyCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurringStandardMonthlyCostUndefined: Self = StObject.set(x, "RecurringStandardMonthlyCost", js.undefined)
    
    @scala.inline
    def setUpfrontCost(value: GenericString): Self = StObject.set(x, "UpfrontCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpfrontCostUndefined: Self = StObject.set(x, "UpfrontCost", js.undefined)
  }
}
