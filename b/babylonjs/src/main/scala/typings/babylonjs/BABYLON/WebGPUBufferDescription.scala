package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGPUBufferDescription extends StObject {
  
  var binding: WebGPUBindingInfo
}
object WebGPUBufferDescription {
  
  inline def apply(binding: WebGPUBindingInfo): WebGPUBufferDescription = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGPUBufferDescription]
  }
  
  extension [Self <: WebGPUBufferDescription](x: Self) {
    
    inline def setBinding(value: WebGPUBindingInfo): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
  }
}
