package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPURenderPassColorAttachment extends StObject {
  
  var clearValue: js.UndefOr[GPUColor] = js.undefined
  
  var loadOp: GPULoadOp
  
  var resolveTarget: js.UndefOr[GPUTextureView] = js.undefined
  
  var storeOp: GPUStoreOp
  
  var view: GPUTextureView
}
object GPURenderPassColorAttachment {
  
  inline def apply(loadOp: GPULoadOp, storeOp: GPUStoreOp, view: GPUTextureView): GPURenderPassColorAttachment = {
    val __obj = js.Dynamic.literal(loadOp = loadOp.asInstanceOf[js.Any], storeOp = storeOp.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPURenderPassColorAttachment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPURenderPassColorAttachment] (val x: Self) extends AnyVal {
    
    inline def setClearValue(value: GPUColor): Self = StObject.set(x, "clearValue", value.asInstanceOf[js.Any])
    
    inline def setClearValueUndefined: Self = StObject.set(x, "clearValue", js.undefined)
    
    inline def setLoadOp(value: GPULoadOp): Self = StObject.set(x, "loadOp", value.asInstanceOf[js.Any])
    
    inline def setResolveTarget(value: GPUTextureView): Self = StObject.set(x, "resolveTarget", value.asInstanceOf[js.Any])
    
    inline def setResolveTargetUndefined: Self = StObject.set(x, "resolveTarget", js.undefined)
    
    inline def setStoreOp(value: GPUStoreOp): Self = StObject.set(x, "storeOp", value.asInstanceOf[js.Any])
    
    inline def setView(value: GPUTextureView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
