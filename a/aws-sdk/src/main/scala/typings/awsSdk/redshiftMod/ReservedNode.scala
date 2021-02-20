package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservedNode extends StObject {
  
  /**
    * The currency code for the reserved cluster.
    */
  var CurrencyCode: js.UndefOr[String] = js.native
  
  /**
    * The duration of the node reservation in seconds.
    */
  var Duration: js.UndefOr[Integer] = js.native
  
  /**
    * The fixed cost Amazon Redshift charges you for this reserved node.
    */
  var FixedPrice: js.UndefOr[Double] = js.native
  
  /**
    * The number of reserved compute nodes.
    */
  var NodeCount: js.UndefOr[Integer] = js.native
  
  /**
    * The node type of the reserved node.
    */
  var NodeType: js.UndefOr[String] = js.native
  
  /**
    * The anticipated utilization of the reserved node, as defined in the reserved node offering.
    */
  var OfferingType: js.UndefOr[String] = js.native
  
  /**
    * The recurring charges for the reserved node.
    */
  var RecurringCharges: js.UndefOr[RecurringChargeList] = js.native
  
  /**
    * The unique identifier for the reservation.
    */
  var ReservedNodeId: js.UndefOr[String] = js.native
  
  /**
    * The identifier for the reserved node offering.
    */
  var ReservedNodeOfferingId: js.UndefOr[String] = js.native
  
  /**
    * 
    */
  var ReservedNodeOfferingType: js.UndefOr[typings.awsSdk.redshiftMod.ReservedNodeOfferingType] = js.native
  
  /**
    * The time the reservation started. You purchase a reserved node offering for a duration. This is the start time of that duration.
    */
  var StartTime: js.UndefOr[TStamp] = js.native
  
  /**
    * The state of the reserved compute node. Possible Values:   pending-payment-This reserved node has recently been purchased, and the sale has been approved, but payment has not yet been confirmed.   active-This reserved node is owned by the caller and is available for use.   payment-failed-Payment failed for the purchase attempt.   retired-The reserved node is no longer available.    exchanging-The owner is exchanging the reserved node for another reserved node.  
    */
  var State: js.UndefOr[String] = js.native
  
  /**
    * The hourly rate Amazon Redshift charges you for this reserved node.
    */
  var UsagePrice: js.UndefOr[Double] = js.native
}
object ReservedNode {
  
  @scala.inline
  def apply(): ReservedNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedNode]
  }
  
  @scala.inline
  implicit class ReservedNodeMutableBuilder[Self <: ReservedNode] (val x: Self) extends AnyVal {
    
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
    def setNodeCount(value: Integer): Self = StObject.set(x, "NodeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeCountUndefined: Self = StObject.set(x, "NodeCount", js.undefined)
    
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
    def setReservedNodeId(value: String): Self = StObject.set(x, "ReservedNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedNodeIdUndefined: Self = StObject.set(x, "ReservedNodeId", js.undefined)
    
    @scala.inline
    def setReservedNodeOfferingId(value: String): Self = StObject.set(x, "ReservedNodeOfferingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedNodeOfferingIdUndefined: Self = StObject.set(x, "ReservedNodeOfferingId", js.undefined)
    
    @scala.inline
    def setReservedNodeOfferingType(value: ReservedNodeOfferingType): Self = StObject.set(x, "ReservedNodeOfferingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedNodeOfferingTypeUndefined: Self = StObject.set(x, "ReservedNodeOfferingType", js.undefined)
    
    @scala.inline
    def setStartTime(value: TStamp): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setUsagePrice(value: Double): Self = StObject.set(x, "UsagePrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsagePriceUndefined: Self = StObject.set(x, "UsagePrice", js.undefined)
  }
}
