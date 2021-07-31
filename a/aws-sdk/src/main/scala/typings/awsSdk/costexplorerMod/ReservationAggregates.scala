package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservationAggregates extends StObject {
  
  /**
    * The monthly cost of your reservation, amortized over the reservation period.
    */
  var AmortizedRecurringFee: js.UndefOr[typings.awsSdk.costexplorerMod.AmortizedRecurringFee] = js.undefined
  
  /**
    * The upfront cost of your reservation, amortized over the reservation period.
    */
  var AmortizedUpfrontFee: js.UndefOr[typings.awsSdk.costexplorerMod.AmortizedUpfrontFee] = js.undefined
  
  /**
    * How much you saved due to purchasing and utilizing reservation. AWS calculates this by subtracting TotalAmortizedFee from OnDemandCostOfRIHoursUsed.
    */
  var NetRISavings: js.UndefOr[typings.awsSdk.costexplorerMod.NetRISavings] = js.undefined
  
  /**
    * How much your reservation would cost if charged On-Demand rates.
    */
  var OnDemandCostOfRIHoursUsed: js.UndefOr[typings.awsSdk.costexplorerMod.OnDemandCostOfRIHoursUsed] = js.undefined
  
  /**
    * How many reservation hours that you purchased.
    */
  var PurchasedHours: js.UndefOr[typings.awsSdk.costexplorerMod.PurchasedHours] = js.undefined
  
  /**
    * How many Amazon EC2 reservation hours that you purchased, converted to normalized units. Normalized units are available only for Amazon EC2 usage after November 11, 2017.
    */
  var PurchasedUnits: js.UndefOr[typings.awsSdk.costexplorerMod.PurchasedUnits] = js.undefined
  
  /**
    * The total number of reservation hours that you used.
    */
  var TotalActualHours: js.UndefOr[typings.awsSdk.costexplorerMod.TotalActualHours] = js.undefined
  
  /**
    * The total number of Amazon EC2 reservation hours that you used, converted to normalized units. Normalized units are available only for Amazon EC2 usage after November 11, 2017.
    */
  var TotalActualUnits: js.UndefOr[typings.awsSdk.costexplorerMod.TotalActualUnits] = js.undefined
  
  /**
    * The total cost of your reservation, amortized over the reservation period.
    */
  var TotalAmortizedFee: js.UndefOr[typings.awsSdk.costexplorerMod.TotalAmortizedFee] = js.undefined
  
  /**
    * How much you could save if you use your entire reservation.
    */
  var TotalPotentialRISavings: js.UndefOr[typings.awsSdk.costexplorerMod.TotalPotentialRISavings] = js.undefined
  
  /**
    * The number of reservation hours that you didn't use.
    */
  var UnusedHours: js.UndefOr[typings.awsSdk.costexplorerMod.UnusedHours] = js.undefined
  
  /**
    * The number of Amazon EC2 reservation hours that you didn't use, converted to normalized units. Normalized units are available only for Amazon EC2 usage after November 11, 2017.
    */
  var UnusedUnits: js.UndefOr[typings.awsSdk.costexplorerMod.UnusedUnits] = js.undefined
  
  /**
    * The percentage of reservation time that you used.
    */
  var UtilizationPercentage: js.UndefOr[typings.awsSdk.costexplorerMod.UtilizationPercentage] = js.undefined
  
  /**
    * The percentage of Amazon EC2 reservation time that you used, converted to normalized units. Normalized units are available only for Amazon EC2 usage after November 11, 2017.
    */
  var UtilizationPercentageInUnits: js.UndefOr[typings.awsSdk.costexplorerMod.UtilizationPercentageInUnits] = js.undefined
}
object ReservationAggregates {
  
  @scala.inline
  def apply(): ReservationAggregates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationAggregates]
  }
  
  @scala.inline
  implicit class ReservationAggregatesMutableBuilder[Self <: ReservationAggregates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmortizedRecurringFee(value: AmortizedRecurringFee): Self = StObject.set(x, "AmortizedRecurringFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmortizedRecurringFeeUndefined: Self = StObject.set(x, "AmortizedRecurringFee", js.undefined)
    
    @scala.inline
    def setAmortizedUpfrontFee(value: AmortizedUpfrontFee): Self = StObject.set(x, "AmortizedUpfrontFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmortizedUpfrontFeeUndefined: Self = StObject.set(x, "AmortizedUpfrontFee", js.undefined)
    
    @scala.inline
    def setNetRISavings(value: NetRISavings): Self = StObject.set(x, "NetRISavings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetRISavingsUndefined: Self = StObject.set(x, "NetRISavings", js.undefined)
    
    @scala.inline
    def setOnDemandCostOfRIHoursUsed(value: OnDemandCostOfRIHoursUsed): Self = StObject.set(x, "OnDemandCostOfRIHoursUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDemandCostOfRIHoursUsedUndefined: Self = StObject.set(x, "OnDemandCostOfRIHoursUsed", js.undefined)
    
    @scala.inline
    def setPurchasedHours(value: PurchasedHours): Self = StObject.set(x, "PurchasedHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchasedHoursUndefined: Self = StObject.set(x, "PurchasedHours", js.undefined)
    
    @scala.inline
    def setPurchasedUnits(value: PurchasedUnits): Self = StObject.set(x, "PurchasedUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchasedUnitsUndefined: Self = StObject.set(x, "PurchasedUnits", js.undefined)
    
    @scala.inline
    def setTotalActualHours(value: TotalActualHours): Self = StObject.set(x, "TotalActualHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalActualHoursUndefined: Self = StObject.set(x, "TotalActualHours", js.undefined)
    
    @scala.inline
    def setTotalActualUnits(value: TotalActualUnits): Self = StObject.set(x, "TotalActualUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalActualUnitsUndefined: Self = StObject.set(x, "TotalActualUnits", js.undefined)
    
    @scala.inline
    def setTotalAmortizedFee(value: TotalAmortizedFee): Self = StObject.set(x, "TotalAmortizedFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalAmortizedFeeUndefined: Self = StObject.set(x, "TotalAmortizedFee", js.undefined)
    
    @scala.inline
    def setTotalPotentialRISavings(value: TotalPotentialRISavings): Self = StObject.set(x, "TotalPotentialRISavings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalPotentialRISavingsUndefined: Self = StObject.set(x, "TotalPotentialRISavings", js.undefined)
    
    @scala.inline
    def setUnusedHours(value: UnusedHours): Self = StObject.set(x, "UnusedHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnusedHoursUndefined: Self = StObject.set(x, "UnusedHours", js.undefined)
    
    @scala.inline
    def setUnusedUnits(value: UnusedUnits): Self = StObject.set(x, "UnusedUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnusedUnitsUndefined: Self = StObject.set(x, "UnusedUnits", js.undefined)
    
    @scala.inline
    def setUtilizationPercentage(value: UtilizationPercentage): Self = StObject.set(x, "UtilizationPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtilizationPercentageInUnits(value: UtilizationPercentageInUnits): Self = StObject.set(x, "UtilizationPercentageInUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtilizationPercentageInUnitsUndefined: Self = StObject.set(x, "UtilizationPercentageInUnits", js.undefined)
    
    @scala.inline
    def setUtilizationPercentageUndefined: Self = StObject.set(x, "UtilizationPercentage", js.undefined)
  }
}
