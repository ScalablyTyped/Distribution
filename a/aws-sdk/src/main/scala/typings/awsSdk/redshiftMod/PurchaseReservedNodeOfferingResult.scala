package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseReservedNodeOfferingResult extends StObject {
  
  var ReservedNode: js.UndefOr[typings.awsSdk.redshiftMod.ReservedNode] = js.undefined
}
object PurchaseReservedNodeOfferingResult {
  
  @scala.inline
  def apply(): PurchaseReservedNodeOfferingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseReservedNodeOfferingResult]
  }
  
  @scala.inline
  implicit class PurchaseReservedNodeOfferingResultMutableBuilder[Self <: PurchaseReservedNodeOfferingResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReservedNode(value: ReservedNode): Self = StObject.set(x, "ReservedNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedNodeUndefined: Self = StObject.set(x, "ReservedNode", js.undefined)
  }
}
