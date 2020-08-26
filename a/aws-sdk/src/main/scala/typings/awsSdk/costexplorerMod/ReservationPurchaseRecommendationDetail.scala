package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservationPurchaseRecommendationDetail extends js.Object {
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
  implicit class ReservationPurchaseRecommendationDetailOps[Self <: ReservationPurchaseRecommendationDetail] (val x: Self) extends AnyVal {
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
    def setAccountId(value: GenericString): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    @scala.inline
    def setAverageNormalizedUnitsUsedPerHour(value: GenericString): Self = this.set("AverageNormalizedUnitsUsedPerHour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAverageNormalizedUnitsUsedPerHour: Self = this.set("AverageNormalizedUnitsUsedPerHour", js.undefined)
    @scala.inline
    def setAverageNumberOfInstancesUsedPerHour(value: GenericString): Self = this.set("AverageNumberOfInstancesUsedPerHour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAverageNumberOfInstancesUsedPerHour: Self = this.set("AverageNumberOfInstancesUsedPerHour", js.undefined)
    @scala.inline
    def setAverageUtilization(value: GenericString): Self = this.set("AverageUtilization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAverageUtilization: Self = this.set("AverageUtilization", js.undefined)
    @scala.inline
    def setCurrencyCode(value: GenericString): Self = this.set("CurrencyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencyCode: Self = this.set("CurrencyCode", js.undefined)
    @scala.inline
    def setEstimatedBreakEvenInMonths(value: GenericString): Self = this.set("EstimatedBreakEvenInMonths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedBreakEvenInMonths: Self = this.set("EstimatedBreakEvenInMonths", js.undefined)
    @scala.inline
    def setEstimatedMonthlyOnDemandCost(value: GenericString): Self = this.set("EstimatedMonthlyOnDemandCost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedMonthlyOnDemandCost: Self = this.set("EstimatedMonthlyOnDemandCost", js.undefined)
    @scala.inline
    def setEstimatedMonthlySavingsAmount(value: GenericString): Self = this.set("EstimatedMonthlySavingsAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedMonthlySavingsAmount: Self = this.set("EstimatedMonthlySavingsAmount", js.undefined)
    @scala.inline
    def setEstimatedMonthlySavingsPercentage(value: GenericString): Self = this.set("EstimatedMonthlySavingsPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedMonthlySavingsPercentage: Self = this.set("EstimatedMonthlySavingsPercentage", js.undefined)
    @scala.inline
    def setEstimatedReservationCostForLookbackPeriod(value: GenericString): Self = this.set("EstimatedReservationCostForLookbackPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedReservationCostForLookbackPeriod: Self = this.set("EstimatedReservationCostForLookbackPeriod", js.undefined)
    @scala.inline
    def setInstanceDetails(value: InstanceDetails): Self = this.set("InstanceDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceDetails: Self = this.set("InstanceDetails", js.undefined)
    @scala.inline
    def setMaximumNormalizedUnitsUsedPerHour(value: GenericString): Self = this.set("MaximumNormalizedUnitsUsedPerHour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumNormalizedUnitsUsedPerHour: Self = this.set("MaximumNormalizedUnitsUsedPerHour", js.undefined)
    @scala.inline
    def setMaximumNumberOfInstancesUsedPerHour(value: GenericString): Self = this.set("MaximumNumberOfInstancesUsedPerHour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumNumberOfInstancesUsedPerHour: Self = this.set("MaximumNumberOfInstancesUsedPerHour", js.undefined)
    @scala.inline
    def setMinimumNormalizedUnitsUsedPerHour(value: GenericString): Self = this.set("MinimumNormalizedUnitsUsedPerHour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumNormalizedUnitsUsedPerHour: Self = this.set("MinimumNormalizedUnitsUsedPerHour", js.undefined)
    @scala.inline
    def setMinimumNumberOfInstancesUsedPerHour(value: GenericString): Self = this.set("MinimumNumberOfInstancesUsedPerHour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumNumberOfInstancesUsedPerHour: Self = this.set("MinimumNumberOfInstancesUsedPerHour", js.undefined)
    @scala.inline
    def setRecommendedNormalizedUnitsToPurchase(value: GenericString): Self = this.set("RecommendedNormalizedUnitsToPurchase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecommendedNormalizedUnitsToPurchase: Self = this.set("RecommendedNormalizedUnitsToPurchase", js.undefined)
    @scala.inline
    def setRecommendedNumberOfInstancesToPurchase(value: GenericString): Self = this.set("RecommendedNumberOfInstancesToPurchase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecommendedNumberOfInstancesToPurchase: Self = this.set("RecommendedNumberOfInstancesToPurchase", js.undefined)
    @scala.inline
    def setRecurringStandardMonthlyCost(value: GenericString): Self = this.set("RecurringStandardMonthlyCost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecurringStandardMonthlyCost: Self = this.set("RecurringStandardMonthlyCost", js.undefined)
    @scala.inline
    def setUpfrontCost(value: GenericString): Self = this.set("UpfrontCost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpfrontCost: Self = this.set("UpfrontCost", js.undefined)
  }
  
}

