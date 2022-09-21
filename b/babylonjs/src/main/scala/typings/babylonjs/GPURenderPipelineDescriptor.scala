package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPURenderPipelineDescriptor
  extends StObject
     with GPUPipelineDescriptorBase {
  
  var depthStencil: js.UndefOr[GPUDepthStencilState] = js.undefined
  
  var fragment: js.UndefOr[GPUFragmentState] = js.undefined
  
  var multisample: js.UndefOr[GPUMultisampleState] = js.undefined
  
  var primitive: js.UndefOr[GPUPrimitiveState] = js.undefined
  
  var vertex: GPUVertexState
}
object GPURenderPipelineDescriptor {
  
  inline def apply(vertex: GPUVertexState): GPURenderPipelineDescriptor = {
    val __obj = js.Dynamic.literal(vertex = vertex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPURenderPipelineDescriptor]
  }
  
  extension [Self <: GPURenderPipelineDescriptor](x: Self) {
    
    inline def setDepthStencil(value: GPUDepthStencilState): Self = StObject.set(x, "depthStencil", value.asInstanceOf[js.Any])
    
    inline def setDepthStencilUndefined: Self = StObject.set(x, "depthStencil", js.undefined)
    
    inline def setFragment(value: GPUFragmentState): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    inline def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
    
    inline def setMultisample(value: GPUMultisampleState): Self = StObject.set(x, "multisample", value.asInstanceOf[js.Any])
    
    inline def setMultisampleUndefined: Self = StObject.set(x, "multisample", js.undefined)
    
    inline def setPrimitive(value: GPUPrimitiveState): Self = StObject.set(x, "primitive", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveUndefined: Self = StObject.set(x, "primitive", js.undefined)
    
    inline def setVertex(value: GPUVertexState): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
  }
}
