package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservationAggregates extends js.Object {
  
  /**
    * The monthly cost of your reservation, amortized over the reservation period.
    */
  var AmortizedRecurringFee: js.UndefOr[typings.awsSdk.costexplorerMod.AmortizedRecurringFee] = js.native
  
  /**
    * The upfront cost of your reservation, amortized over the reservation period.
    */
  var AmortizedUpfrontFee: js.UndefOr[typings.awsSdk.costexplorerMod.AmortizedUpfrontFee] = js.native
  
  /**
    * How much you saved due to purchasing and utilizing reservation. AWS calculates this by subtracting TotalAmortizedFee from OnDemandCostOfRIHoursUsed.
    */
  var NetRISavings: js.UndefOr[typings.awsSdk.costexplorerMod.NetRISavings] = js.native
  
  /**
    * How much your reservation would cost if charged On-Demand rates.
    */
  var OnDemandCostOfRIHoursUsed: js.UndefOr[typings.awsSdk.costexplorerMod.OnDemandCostOfRIHoursUsed] = js.native
  
  /**
    * How many reservation hours that you purchased.
    */
  var PurchasedHours: js.UndefOr[typings.awsSdk.costexplorerMod.PurchasedHours] = js.native
  
  /**
    * How many Amazon EC2 reservation hours that you purchased, converted to normalized units. Normalized units are available only for Amazon EC2 usage after November 11, 2017.
    */
  var PurchasedUnits: js.UndefOr[typings.awsSdk.costexplorerMod.PurchasedUnits] = js.native
  
  /**
    * The total number of reservation hours that you used.
    */
  var TotalActualHours: js.UndefOr[typings.awsSdk.costexplorerMod.TotalActualHours] = js.native
  
  /**
    * The total number of Amazon EC2 reservation hours that you used, converted to normalized units. Normalized units are available only for Amazon EC2 usage after November 11, 2017.
    */
  var TotalActualUnits: js.UndefOr[typings.awsSdk.costexplorerMod.TotalActualUnits] = js.native
  
  /**
    * The total cost of your reservation, amortized over the reservation period.
    */
  var TotalAmortizedFee: js.UndefOr[typings.awsSdk.costexplorerMod.TotalAmortizedFee] = js.native
  
  /**
    * How much you could save if you use your entire reservation.
    */
  var TotalPotentialRISavings: js.UndefOr[typings.awsSdk.costexplorerMod.TotalPotentialRISavings] = js.native
  
  /**
    * The number of reservation hours that you didn't use.
    */
  var UnusedHours: js.UndefOr[typings.awsSdk.costexplorerMod.UnusedHours] = js.native
  
  /**
    * The number of Amazon EC2 reservation hours that you didn't use, converted to normalized units. Normalized units are available only for Amazon EC2 usage after November 11, 2017.
    */
  var UnusedUnits: js.UndefOr[typings.awsSdk.costexplorerMod.UnusedUnits] = js.native
  
  /**
    * The percentage of reservation time that you used.
    */
  var UtilizationPercentage: js.UndefOr[typings.awsSdk.costexplorerMod.UtilizationPercentage] = js.native
  
  /**
    * The percentage of Amazon EC2 reservation time that you used, converted to normalized units. Normalized units are available only for Amazon EC2 usage after November 11, 2017.
    */
  var UtilizationPercentageInUnits: js.UndefOr[typings.awsSdk.costexplorerMod.UtilizationPercentageInUnits] = js.native
}
object ReservationAggregates {
  
  @scala.inline
  def apply(): ReservationAggregates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationAggregates]
  }
  
  @scala.inline
  implicit class ReservationAggregatesOps[Self <: ReservationAggregates] (val x: Self) extends AnyVal {
    
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
    def setAmortizedRecurringFee(value: AmortizedRecurringFee): Self = this.set("AmortizedRecurringFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmortizedRecurringFee: Self = this.set("AmortizedRecurringFee", js.undefined)
    
    @scala.inline
    def setAmortizedUpfrontFee(value: AmortizedUpfrontFee): Self = this.set("AmortizedUpfrontFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmortizedUpfrontFee: Self = this.set("AmortizedUpfrontFee", js.undefined)
    
    @scala.inline
    def setNetRISavings(value: NetRISavings): Self = this.set("NetRISavings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetRISavings: Self = this.set("NetRISavings", js.undefined)
    
    @scala.inline
    def setOnDemandCostOfRIHoursUsed(value: OnDemandCostOfRIHoursUsed): Self = this.set("OnDemandCostOfRIHoursUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDemandCostOfRIHoursUsed: Self = this.set("OnDemandCostOfRIHoursUsed", js.undefined)
    
    @scala.inline
    def setPurchasedHours(value: PurchasedHours): Self = this.set("PurchasedHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurchasedHours: Self = this.set("PurchasedHours", js.undefined)
    
    @scala.inline
    def setPurchasedUnits(value: PurchasedUnits): Self = this.set("PurchasedUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurchasedUnits: Self = this.set("PurchasedUnits", js.undefined)
    
    @scala.inline
    def setTotalActualHours(value: TotalActualHours): Self = this.set("TotalActualHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalActualHours: Self = this.set("TotalActualHours", js.undefined)
    
    @scala.inline
    def setTotalActualUnits(value: TotalActualUnits): Self = this.set("TotalActualUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalActualUnits: Self = this.set("TotalActualUnits", js.undefined)
    
    @scala.inline
    def setTotalAmortizedFee(value: TotalAmortizedFee): Self = this.set("TotalAmortizedFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalAmortizedFee: Self = this.set("TotalAmortizedFee", js.undefined)
    
    @scala.inline
    def setTotalPotentialRISavings(value: TotalPotentialRISavings): Self = this.set("TotalPotentialRISavings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalPotentialRISavings: Self = this.set("TotalPotentialRISavings", js.undefined)
    
    @scala.inline
    def setUnusedHours(value: UnusedHours): Self = this.set("UnusedHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnusedHours: Self = this.set("UnusedHours", js.undefined)
    
    @scala.inline
    def setUnusedUnits(value: UnusedUnits): Self = this.set("UnusedUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnusedUnits: Self = this.set("UnusedUnits", js.undefined)
    
    @scala.inline
    def setUtilizationPercentage(value: UtilizationPercentage): Self = this.set("UtilizationPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUtilizationPercentage: Self = this.set("UtilizationPercentage", js.undefined)
    
    @scala.inline
    def setUtilizationPercentageInUnits(value: UtilizationPercentageInUnits): Self = this.set("UtilizationPercentageInUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUtilizationPercentageInUnits: Self = this.set("UtilizationPercentageInUnits", js.undefined)
  }
}
