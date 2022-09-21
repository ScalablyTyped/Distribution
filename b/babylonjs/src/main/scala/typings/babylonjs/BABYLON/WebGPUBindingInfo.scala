package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGPUBindingInfo extends StObject {
  
  var bindingIndex: Double
  
  var groupIndex: Double
}
object WebGPUBindingInfo {
  
  inline def apply(bindingIndex: Double, groupIndex: Double): WebGPUBindingInfo = {
    val __obj = js.Dynamic.literal(bindingIndex = bindingIndex.asInstanceOf[js.Any], groupIndex = groupIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGPUBindingInfo]
  }
  
  extension [Self <: WebGPUBindingInfo](x: Self) {
    
    inline def setBindingIndex(value: Double): Self = StObject.set(x, "bindingIndex", value.asInstanceOf[js.Any])
    
    inline def setGroupIndex(value: Double): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
  }
}
