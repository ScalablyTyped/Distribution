package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputeBindingLocation extends StObject {
  
  var binding: Double
  
  var group: Double
}
object ComputeBindingLocation {
  
  inline def apply(binding: Double, group: Double): ComputeBindingLocation = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeBindingLocation]
  }
  
  extension [Self <: ComputeBindingLocation](x: Self) {
    
    inline def setBinding(value: Double): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: Double): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
  }
}
