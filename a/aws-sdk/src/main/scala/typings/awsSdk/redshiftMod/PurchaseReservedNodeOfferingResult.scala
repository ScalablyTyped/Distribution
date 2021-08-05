package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseReservedNodeOfferingResult extends StObject {
  
  var ReservedNode: js.UndefOr[typings.awsSdk.redshiftMod.ReservedNode] = js.undefined
}
object PurchaseReservedNodeOfferingResult {
  
  inline def apply(): PurchaseReservedNodeOfferingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseReservedNodeOfferingResult]
  }
  
  extension [Self <: PurchaseReservedNodeOfferingResult](x: Self) {
    
    inline def setReservedNode(value: ReservedNode): Self = StObject.set(x, "ReservedNode", value.asInstanceOf[js.Any])
    
    inline def setReservedNodeUndefined: Self = StObject.set(x, "ReservedNode", js.undefined)
  }
}
