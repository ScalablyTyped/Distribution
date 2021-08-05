package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseReservedDBInstancesOfferingResult extends StObject {
  
  var ReservedDBInstance: js.UndefOr[typings.awsSdk.rdsMod.ReservedDBInstance] = js.undefined
}
object PurchaseReservedDBInstancesOfferingResult {
  
  inline def apply(): PurchaseReservedDBInstancesOfferingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseReservedDBInstancesOfferingResult]
  }
  
  extension [Self <: PurchaseReservedDBInstancesOfferingResult](x: Self) {
    
    inline def setReservedDBInstance(value: ReservedDBInstance): Self = StObject.set(x, "ReservedDBInstance", value.asInstanceOf[js.Any])
    
    inline def setReservedDBInstanceUndefined: Self = StObject.set(x, "ReservedDBInstance", js.undefined)
  }
}
