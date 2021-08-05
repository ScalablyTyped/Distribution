package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAcceleratorAttributesResponse extends StObject {
  
  /**
    * Updated attributes for the accelerator.
    */
  var AcceleratorAttributes: js.UndefOr[typings.awsSdk.globalacceleratorMod.AcceleratorAttributes] = js.undefined
}
object UpdateAcceleratorAttributesResponse {
  
  inline def apply(): UpdateAcceleratorAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAcceleratorAttributesResponse]
  }
  
  extension [Self <: UpdateAcceleratorAttributesResponse](x: Self) {
    
    inline def setAcceleratorAttributes(value: AcceleratorAttributes): Self = StObject.set(x, "AcceleratorAttributes", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorAttributesUndefined: Self = StObject.set(x, "AcceleratorAttributes", js.undefined)
  }
}
