package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUBindGroupEntry extends StObject {
  
  var binding: GPUIndex32
  
  var resource: GPUBindingResource
}
object GPUBindGroupEntry {
  
  inline def apply(binding: GPUIndex32, resource: GPUBindingResource): GPUBindGroupEntry = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUBindGroupEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUBindGroupEntry] (val x: Self) extends AnyVal {
    
    inline def setBinding(value: GPUIndex32): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
    
    inline def setResource(value: GPUBindingResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
