package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseReservedInstancesOfferingResult extends StObject {
  
  /**
    * The IDs of the purchased Reserved Instances. If your purchase crosses into a discounted pricing tier, the final Reserved Instances IDs might change. For more information, see Crossing pricing tiers in the Amazon Elastic Compute Cloud User Guide.
    */
  var ReservedInstancesId: js.UndefOr[String] = js.undefined
}
object PurchaseReservedInstancesOfferingResult {
  
  inline def apply(): PurchaseReservedInstancesOfferingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseReservedInstancesOfferingResult]
  }
  
  extension [Self <: PurchaseReservedInstancesOfferingResult](x: Self) {
    
    inline def setReservedInstancesId(value: String): Self = StObject.set(x, "ReservedInstancesId", value.asInstanceOf[js.Any])
    
    inline def setReservedInstancesIdUndefined: Self = StObject.set(x, "ReservedInstancesId", js.undefined)
  }
}
