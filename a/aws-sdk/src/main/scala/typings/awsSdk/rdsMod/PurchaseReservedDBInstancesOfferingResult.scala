package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseReservedDBInstancesOfferingResult extends StObject {
  
  var ReservedDBInstance: js.UndefOr[typings.awsSdk.rdsMod.ReservedDBInstance] = js.undefined
}
object PurchaseReservedDBInstancesOfferingResult {
  
  @scala.inline
  def apply(): PurchaseReservedDBInstancesOfferingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseReservedDBInstancesOfferingResult]
  }
  
  @scala.inline
  implicit class PurchaseReservedDBInstancesOfferingResultMutableBuilder[Self <: PurchaseReservedDBInstancesOfferingResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReservedDBInstance(value: ReservedDBInstance): Self = StObject.set(x, "ReservedDBInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedDBInstanceUndefined: Self = StObject.set(x, "ReservedDBInstance", js.undefined)
  }
}
