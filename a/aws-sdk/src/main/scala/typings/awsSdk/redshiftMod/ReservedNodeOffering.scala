package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservedNodeOffering extends js.Object {
  
  /**
    * The currency code for the compute nodes offering.
    */
  var CurrencyCode: js.UndefOr[String] = js.native
  
  /**
    * The duration, in seconds, for which the offering will reserve the node.
    */
  var Duration: js.UndefOr[Integer] = js.native
  
  /**
    * The upfront fixed charge you will pay to purchase the specific reserved node offering.
    */
  var FixedPrice: js.UndefOr[Double] = js.native
  
  /**
    * The node type offered by the reserved node offering.
    */
  var NodeType: js.UndefOr[String] = js.native
  
  /**
    * The anticipated utilization of the reserved node, as defined in the reserved node offering.
    */
  var OfferingType: js.UndefOr[String] = js.native
  
  /**
    * The charge to your account regardless of whether you are creating any clusters using the node offering. Recurring charges are only in effect for heavy-utilization reserved nodes.
    */
  var RecurringCharges: js.UndefOr[RecurringChargeList] = js.native
  
  /**
    * The offering identifier.
    */
  var ReservedNodeOfferingId: js.UndefOr[String] = js.native
  
  /**
    * 
    */
  var ReservedNodeOfferingType: js.UndefOr[typings.awsSdk.redshiftMod.ReservedNodeOfferingType] = js.native
  
  /**
    * The rate you are charged for each hour the cluster that is using the offering is running.
    */
  var UsagePrice: js.UndefOr[Double] = js.native
}
object ReservedNodeOffering {
  
  @scala.inline
  def apply(): ReservedNodeOffering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedNodeOffering]
  }
  
  @scala.inline
  implicit class ReservedNodeOfferingOps[Self <: ReservedNodeOffering] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCurrencyCode(value: String): Self = this.set("CurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCode: Self = this.set("CurrencyCode", js.undefined)
    
    @scala.inline
    def setDuration(value: Integer): Self = this.set("Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("Duration", js.undefined)
    
    @scala.inline
    def setFixedPrice(value: Double): Self = this.set("FixedPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedPrice: Self = this.set("FixedPrice", js.undefined)
    
    @scala.inline
    def setNodeType(value: String): Self = this.set("NodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeType: Self = this.set("NodeType", js.undefined)
    
    @scala.inline
    def setOfferingType(value: String): Self = this.set("OfferingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferingType: Self = this.set("OfferingType", js.undefined)
    
    @scala.inline
    def setRecurringChargesVarargs(value: RecurringCharge*): Self = this.set("RecurringCharges", js.Array(value :_*))
    
    @scala.inline
    def setRecurringCharges(value: RecurringChargeList): Self = this.set("RecurringCharges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurringCharges: Self = this.set("RecurringCharges", js.undefined)
    
    @scala.inline
    def setReservedNodeOfferingId(value: String): Self = this.set("ReservedNodeOfferingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedNodeOfferingId: Self = this.set("ReservedNodeOfferingId", js.undefined)
    
    @scala.inline
    def setReservedNodeOfferingType(value: ReservedNodeOfferingType): Self = this.set("ReservedNodeOfferingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedNodeOfferingType: Self = this.set("ReservedNodeOfferingType", js.undefined)
    
    @scala.inline
    def setUsagePrice(value: Double): Self = this.set("UsagePrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsagePrice: Self = this.set("UsagePrice", js.undefined)
  }
}
