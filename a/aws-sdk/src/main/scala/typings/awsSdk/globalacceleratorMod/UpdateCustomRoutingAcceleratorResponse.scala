package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCustomRoutingAcceleratorResponse extends StObject {
  
  /**
    * Information about the updated custom routing accelerator.
    */
  var Accelerator: js.UndefOr[CustomRoutingAccelerator] = js.undefined
}
object UpdateCustomRoutingAcceleratorResponse {
  
  inline def apply(): UpdateCustomRoutingAcceleratorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCustomRoutingAcceleratorResponse]
  }
  
  extension [Self <: UpdateCustomRoutingAcceleratorResponse](x: Self) {
    
    inline def setAccelerator(value: CustomRoutingAccelerator): Self = StObject.set(x, "Accelerator", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorUndefined: Self = StObject.set(x, "Accelerator", js.undefined)
  }
}
