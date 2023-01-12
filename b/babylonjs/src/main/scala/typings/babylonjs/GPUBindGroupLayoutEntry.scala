package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUBindGroupLayoutEntry extends StObject {
  
  var binding: GPUIndex32
  
  var buffer: js.UndefOr[GPUBufferBindingLayout] = js.undefined
  
  var externalTexture: js.UndefOr[GPUExternalTextureBindingLayout] = js.undefined
  
  var sampler: js.UndefOr[GPUSamplerBindingLayout] = js.undefined
  
  var storageTexture: js.UndefOr[GPUStorageTextureBindingLayout] = js.undefined
  
  var texture: js.UndefOr[GPUTextureBindingLayout] = js.undefined
  
  var visibility: GPUShaderStageFlags
}
object GPUBindGroupLayoutEntry {
  
  inline def apply(binding: GPUIndex32, visibility: GPUShaderStageFlags): GPUBindGroupLayoutEntry = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUBindGroupLayoutEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUBindGroupLayoutEntry] (val x: Self) extends AnyVal {
    
    inline def setBinding(value: GPUIndex32): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
    
    inline def setBuffer(value: GPUBufferBindingLayout): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    inline def setExternalTexture(value: GPUExternalTextureBindingLayout): Self = StObject.set(x, "externalTexture", value.asInstanceOf[js.Any])
    
    inline def setExternalTextureUndefined: Self = StObject.set(x, "externalTexture", js.undefined)
    
    inline def setSampler(value: GPUSamplerBindingLayout): Self = StObject.set(x, "sampler", value.asInstanceOf[js.Any])
    
    inline def setSamplerUndefined: Self = StObject.set(x, "sampler", js.undefined)
    
    inline def setStorageTexture(value: GPUStorageTextureBindingLayout): Self = StObject.set(x, "storageTexture", value.asInstanceOf[js.Any])
    
    inline def setStorageTextureUndefined: Self = StObject.set(x, "storageTexture", js.undefined)
    
    inline def setTexture(value: GPUTextureBindingLayout): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    
    inline def setTextureUndefined: Self = StObject.set(x, "texture", js.undefined)
    
    inline def setVisibility(value: GPUShaderStageFlags): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
