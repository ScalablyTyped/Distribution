package typings.babylonjs.BABYLON

import typings.babylonjs.GPUTextureSampleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGPUTextureDescription extends StObject {
  
  var autoBindSampler: js.UndefOr[Boolean] = js.undefined
  
  var isStorageTexture: Boolean
  
  var isTextureArray: Boolean
  
  var sampleType: js.UndefOr[GPUTextureSampleType] = js.undefined
  
  var textures: js.Array[WebGPUBindingInfo]
}
object WebGPUTextureDescription {
  
  inline def apply(isStorageTexture: Boolean, isTextureArray: Boolean, textures: js.Array[WebGPUBindingInfo]): WebGPUTextureDescription = {
    val __obj = js.Dynamic.literal(isStorageTexture = isStorageTexture.asInstanceOf[js.Any], isTextureArray = isTextureArray.asInstanceOf[js.Any], textures = textures.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGPUTextureDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebGPUTextureDescription] (val x: Self) extends AnyVal {
    
    inline def setAutoBindSampler(value: Boolean): Self = StObject.set(x, "autoBindSampler", value.asInstanceOf[js.Any])
    
    inline def setAutoBindSamplerUndefined: Self = StObject.set(x, "autoBindSampler", js.undefined)
    
    inline def setIsStorageTexture(value: Boolean): Self = StObject.set(x, "isStorageTexture", value.asInstanceOf[js.Any])
    
    inline def setIsTextureArray(value: Boolean): Self = StObject.set(x, "isTextureArray", value.asInstanceOf[js.Any])
    
    inline def setSampleType(value: GPUTextureSampleType): Self = StObject.set(x, "sampleType", value.asInstanceOf[js.Any])
    
    inline def setSampleTypeUndefined: Self = StObject.set(x, "sampleType", js.undefined)
    
    inline def setTextures(value: js.Array[WebGPUBindingInfo]): Self = StObject.set(x, "textures", value.asInstanceOf[js.Any])
    
    inline def setTexturesVarargs(value: WebGPUBindingInfo*): Self = StObject.set(x, "textures", js.Array(value*))
  }
}
