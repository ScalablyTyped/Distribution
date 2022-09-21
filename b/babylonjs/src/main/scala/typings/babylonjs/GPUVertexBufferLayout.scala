package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUVertexBufferLayout extends StObject {
  
  var arrayStride: GPUSize64
  
  var attributes: js.Array[GPUVertexAttribute]
  
  var stepMode: js.UndefOr[GPUVertexStepMode] = js.undefined
}
object GPUVertexBufferLayout {
  
  inline def apply(arrayStride: GPUSize64, attributes: js.Array[GPUVertexAttribute]): GPUVertexBufferLayout = {
    val __obj = js.Dynamic.literal(arrayStride = arrayStride.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUVertexBufferLayout]
  }
  
  extension [Self <: GPUVertexBufferLayout](x: Self) {
    
    inline def setArrayStride(value: GPUSize64): Self = StObject.set(x, "arrayStride", value.asInstanceOf[js.Any])
    
    inline def setAttributes(value: js.Array[GPUVertexAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: GPUVertexAttribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setStepMode(value: GPUVertexStepMode): Self = StObject.set(x, "stepMode", value.asInstanceOf[js.Any])
    
    inline def setStepModeUndefined: Self = StObject.set(x, "stepMode", js.undefined)
  }
}
