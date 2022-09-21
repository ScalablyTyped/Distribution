package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPURenderPassDepthStencilAttachment extends StObject {
  
  var depthClearValue: js.UndefOr[Double] = js.undefined
  
  var depthLoadOp: GPULoadOp
  
  var depthReadOnly: js.UndefOr[Boolean] = js.undefined
  
  var depthStoreOp: GPUStoreOp
  
  var stencilClearValue: js.UndefOr[GPUStencilValue] = js.undefined
  
  var stencilLoadOp: js.UndefOr[GPULoadOp] = js.undefined
  
  var stencilReadOnly: js.UndefOr[Boolean] = js.undefined
  
  var stencilStoreOp: js.UndefOr[GPUStoreOp] = js.undefined
  
  var view: GPUTextureView
}
object GPURenderPassDepthStencilAttachment {
  
  inline def apply(depthLoadOp: GPULoadOp, depthStoreOp: GPUStoreOp, view: GPUTextureView): GPURenderPassDepthStencilAttachment = {
    val __obj = js.Dynamic.literal(depthLoadOp = depthLoadOp.asInstanceOf[js.Any], depthStoreOp = depthStoreOp.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPURenderPassDepthStencilAttachment]
  }
  
  extension [Self <: GPURenderPassDepthStencilAttachment](x: Self) {
    
    inline def setDepthClearValue(value: Double): Self = StObject.set(x, "depthClearValue", value.asInstanceOf[js.Any])
    
    inline def setDepthClearValueUndefined: Self = StObject.set(x, "depthClearValue", js.undefined)
    
    inline def setDepthLoadOp(value: GPULoadOp): Self = StObject.set(x, "depthLoadOp", value.asInstanceOf[js.Any])
    
    inline def setDepthReadOnly(value: Boolean): Self = StObject.set(x, "depthReadOnly", value.asInstanceOf[js.Any])
    
    inline def setDepthReadOnlyUndefined: Self = StObject.set(x, "depthReadOnly", js.undefined)
    
    inline def setDepthStoreOp(value: GPUStoreOp): Self = StObject.set(x, "depthStoreOp", value.asInstanceOf[js.Any])
    
    inline def setStencilClearValue(value: GPUStencilValue): Self = StObject.set(x, "stencilClearValue", value.asInstanceOf[js.Any])
    
    inline def setStencilClearValueUndefined: Self = StObject.set(x, "stencilClearValue", js.undefined)
    
    inline def setStencilLoadOp(value: GPULoadOp): Self = StObject.set(x, "stencilLoadOp", value.asInstanceOf[js.Any])
    
    inline def setStencilLoadOpUndefined: Self = StObject.set(x, "stencilLoadOp", js.undefined)
    
    inline def setStencilReadOnly(value: Boolean): Self = StObject.set(x, "stencilReadOnly", value.asInstanceOf[js.Any])
    
    inline def setStencilReadOnlyUndefined: Self = StObject.set(x, "stencilReadOnly", js.undefined)
    
    inline def setStencilStoreOp(value: GPUStoreOp): Self = StObject.set(x, "stencilStoreOp", value.asInstanceOf[js.Any])
    
    inline def setStencilStoreOpUndefined: Self = StObject.set(x, "stencilStoreOp", js.undefined)
    
    inline def setView(value: GPUTextureView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
