package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PurchaseReservedInstancesOfferingResult extends StObject {
  
  /**
    * The IDs of the purchased Reserved Instances.
    */
  var ReservedInstancesId: js.UndefOr[String] = js.native
}
object PurchaseReservedInstancesOfferingResult {
  
  @scala.inline
  def apply(): PurchaseReservedInstancesOfferingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseReservedInstancesOfferingResult]
  }
  
  @scala.inline
  implicit class PurchaseReservedInstancesOfferingResultMutableBuilder[Self <: PurchaseReservedInstancesOfferingResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReservedInstancesId(value: String): Self = StObject.set(x, "ReservedInstancesId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedInstancesIdUndefined: Self = StObject.set(x, "ReservedInstancesId", js.undefined)
  }
}
