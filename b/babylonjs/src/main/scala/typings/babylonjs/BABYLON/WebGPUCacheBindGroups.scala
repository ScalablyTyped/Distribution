package typings.babylonjs.BABYLON

import typings.babylonjs.GPUBindGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGPUCacheBindGroups extends StObject {
  
  /* private */ var _cacheSampler: Any
  
  /* private */ var _device: Any
  
  /* private */ var _engine: Any
  
  var disabled: Boolean
  
  def endFrame(): Unit
  
  /**
    * Cache is currently based on the uniform/storage buffers, samplers and textures used by the binding groups.
    * Note that all uniform buffers have an offset of 0 in Babylon and we don't have a use case where we would have the same buffer used with different capacity values:
    * that means we don't need to factor in the offset/size of the buffer in the cache, only the id
    * @param webgpuPipelineContext
    * @param drawContext
    * @param materialContext
    */
  def getBindGroups(
    webgpuPipelineContext: WebGPUPipelineContext,
    drawContext: WebGPUDrawContext,
    materialContext: WebGPUMaterialContext
  ): js.Array[GPUBindGroup]
}
object WebGPUCacheBindGroups {
  
  inline def apply(
    _cacheSampler: Any,
    _device: Any,
    _engine: Any,
    disabled: Boolean,
    endFrame: () => Unit,
    getBindGroups: (WebGPUPipelineContext, WebGPUDrawContext, WebGPUMaterialContext) => js.Array[GPUBindGroup]
  ): WebGPUCacheBindGroups = {
    val __obj = js.Dynamic.literal(_cacheSampler = _cacheSampler.asInstanceOf[js.Any], _device = _device.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], endFrame = js.Any.fromFunction0(endFrame), getBindGroups = js.Any.fromFunction3(getBindGroups))
    __obj.asInstanceOf[WebGPUCacheBindGroups]
  }
  
  extension [Self <: WebGPUCacheBindGroups](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setEndFrame(value: () => Unit): Self = StObject.set(x, "endFrame", js.Any.fromFunction0(value))
    
    inline def setGetBindGroups(value: (WebGPUPipelineContext, WebGPUDrawContext, WebGPUMaterialContext) => js.Array[GPUBindGroup]): Self = StObject.set(x, "getBindGroups", js.Any.fromFunction3(value))
    
    inline def set_cacheSampler(value: Any): Self = StObject.set(x, "_cacheSampler", value.asInstanceOf[js.Any])
    
    inline def set_device(value: Any): Self = StObject.set(x, "_device", value.asInstanceOf[js.Any])
    
    inline def set_engine(value: Any): Self = StObject.set(x, "_engine", value.asInstanceOf[js.Any])
  }
}
