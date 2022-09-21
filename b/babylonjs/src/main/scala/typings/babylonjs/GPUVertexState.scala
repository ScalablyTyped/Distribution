package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUVertexState
  extends StObject
     with GPUProgrammableStage {
  
  var buffers: js.UndefOr[js.Array[GPUVertexBufferLayout]] = js.undefined
}
object GPUVertexState {
  
  inline def apply(entryPoint: String | js.typedarray.Uint32Array, module: GPUShaderModule): GPUVertexState = {
    val __obj = js.Dynamic.literal(entryPoint = entryPoint.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUVertexState]
  }
  
  extension [Self <: GPUVertexState](x: Self) {
    
    inline def setBuffers(value: js.Array[GPUVertexBufferLayout]): Self = StObject.set(x, "buffers", value.asInstanceOf[js.Any])
    
    inline def setBuffersUndefined: Self = StObject.set(x, "buffers", js.undefined)
    
    inline def setBuffersVarargs(value: GPUVertexBufferLayout*): Self = StObject.set(x, "buffers", js.Array(value*))
  }
}
