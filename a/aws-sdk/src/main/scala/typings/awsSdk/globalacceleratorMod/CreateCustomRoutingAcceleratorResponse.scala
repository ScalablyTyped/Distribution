package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomRoutingAcceleratorResponse extends StObject {
  
  /**
    * The accelerator that is created.
    */
  var Accelerator: js.UndefOr[CustomRoutingAccelerator] = js.undefined
}
object CreateCustomRoutingAcceleratorResponse {
  
  inline def apply(): CreateCustomRoutingAcceleratorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCustomRoutingAcceleratorResponse]
  }
  
  extension [Self <: CreateCustomRoutingAcceleratorResponse](x: Self) {
    
    inline def setAccelerator(value: CustomRoutingAccelerator): Self = StObject.set(x, "Accelerator", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorUndefined: Self = StObject.set(x, "Accelerator", js.undefined)
  }
}
