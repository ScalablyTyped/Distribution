package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAcceleratorResponse extends StObject {
  
  /**
    * The accelerator that is created by specifying a listener and the supported IP address types.
    */
  var Accelerator: js.UndefOr[typings.awsSdk.globalacceleratorMod.Accelerator] = js.undefined
}
object CreateAcceleratorResponse {
  
  inline def apply(): CreateAcceleratorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAcceleratorResponse]
  }
  
  extension [Self <: CreateAcceleratorResponse](x: Self) {
    
    inline def setAccelerator(value: Accelerator): Self = StObject.set(x, "Accelerator", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorUndefined: Self = StObject.set(x, "Accelerator", js.undefined)
  }
}
