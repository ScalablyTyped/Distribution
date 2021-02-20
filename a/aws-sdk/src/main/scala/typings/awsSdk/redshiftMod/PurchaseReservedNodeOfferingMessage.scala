package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PurchaseReservedNodeOfferingMessage extends StObject {
  
  /**
    * The number of reserved nodes that you want to purchase. Default: 1 
    */
  var NodeCount: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The unique identifier of the reserved node offering you want to purchase.
    */
  var ReservedNodeOfferingId: String = js.native
}
object PurchaseReservedNodeOfferingMessage {
  
  @scala.inline
  def apply(ReservedNodeOfferingId: String): PurchaseReservedNodeOfferingMessage = {
    val __obj = js.Dynamic.literal(ReservedNodeOfferingId = ReservedNodeOfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseReservedNodeOfferingMessage]
  }
  
  @scala.inline
  implicit class PurchaseReservedNodeOfferingMessageMutableBuilder[Self <: PurchaseReservedNodeOfferingMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeCount(value: IntegerOptional): Self = StObject.set(x, "NodeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeCountUndefined: Self = StObject.set(x, "NodeCount", js.undefined)
    
    @scala.inline
    def setReservedNodeOfferingId(value: String): Self = StObject.set(x, "ReservedNodeOfferingId", value.asInstanceOf[js.Any])
  }
}
