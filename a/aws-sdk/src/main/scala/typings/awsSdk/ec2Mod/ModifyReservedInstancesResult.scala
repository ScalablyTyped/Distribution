package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyReservedInstancesResult extends StObject {
  
  /**
    * The ID for the modification.
    */
  var ReservedInstancesModificationId: js.UndefOr[String] = js.undefined
}
object ModifyReservedInstancesResult {
  
  inline def apply(): ModifyReservedInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyReservedInstancesResult]
  }
  
  extension [Self <: ModifyReservedInstancesResult](x: Self) {
    
    inline def setReservedInstancesModificationId(value: String): Self = StObject.set(x, "ReservedInstancesModificationId", value.asInstanceOf[js.Any])
    
    inline def setReservedInstancesModificationIdUndefined: Self = StObject.set(x, "ReservedInstancesModificationId", js.undefined)
  }
}
