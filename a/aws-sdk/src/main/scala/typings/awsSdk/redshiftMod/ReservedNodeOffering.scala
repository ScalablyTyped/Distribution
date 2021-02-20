package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservedNodeOffering extends StObject {
  
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
  implicit class ReservedNodeOfferingMutableBuilder[Self <: ReservedNodeOffering] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrencyCode(value: String): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    @scala.inline
    def setDuration(value: Integer): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    @scala.inline
    def setFixedPrice(value: Double): Self = StObject.set(x, "FixedPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedPriceUndefined: Self = StObject.set(x, "FixedPrice", js.undefined)
    
    @scala.inline
    def setNodeType(value: String): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeTypeUndefined: Self = StObject.set(x, "NodeType", js.undefined)
    
    @scala.inline
    def setOfferingType(value: String): Self = StObject.set(x, "OfferingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingTypeUndefined: Self = StObject.set(x, "OfferingType", js.undefined)
    
    @scala.inline
    def setRecurringCharges(value: RecurringChargeList): Self = StObject.set(x, "RecurringCharges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurringChargesUndefined: Self = StObject.set(x, "RecurringCharges", js.undefined)
    
    @scala.inline
    def setRecurringChargesVarargs(value: RecurringCharge*): Self = StObject.set(x, "RecurringCharges", js.Array(value :_*))
    
    @scala.inline
    def setReservedNodeOfferingId(value: String): Self = StObject.set(x, "ReservedNodeOfferingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedNodeOfferingIdUndefined: Self = StObject.set(x, "ReservedNodeOfferingId", js.undefined)
    
    @scala.inline
    def setReservedNodeOfferingType(value: ReservedNodeOfferingType): Self = StObject.set(x, "ReservedNodeOfferingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedNodeOfferingTypeUndefined: Self = StObject.set(x, "ReservedNodeOfferingType", js.undefined)
    
    @scala.inline
    def setUsagePrice(value: Double): Self = StObject.set(x, "UsagePrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsagePriceUndefined: Self = StObject.set(x, "UsagePrice", js.undefined)
  }
}
