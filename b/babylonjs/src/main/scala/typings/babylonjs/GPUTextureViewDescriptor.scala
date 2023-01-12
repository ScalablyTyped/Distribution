package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUTextureViewDescriptor
  extends StObject
     with GPUObjectDescriptorBase {
  
  var arrayLayerCount: GPUIntegerCoordinate
  
  var aspect: js.UndefOr[GPUTextureAspect] = js.undefined
  
  var baseArrayLayer: js.UndefOr[GPUIntegerCoordinate] = js.undefined
  
  var baseMipLevel: js.UndefOr[GPUIntegerCoordinate] = js.undefined
  
  var dimension: GPUTextureViewDimension
  
  var format: GPUTextureFormat
  
  var mipLevelCount: GPUIntegerCoordinate
}
object GPUTextureViewDescriptor {
  
  inline def apply(
    arrayLayerCount: GPUIntegerCoordinate,
    dimension: GPUTextureViewDimension,
    format: GPUTextureFormat,
    mipLevelCount: GPUIntegerCoordinate
  ): GPUTextureViewDescriptor = {
    val __obj = js.Dynamic.literal(arrayLayerCount = arrayLayerCount.asInstanceOf[js.Any], dimension = dimension.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], mipLevelCount = mipLevelCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUTextureViewDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUTextureViewDescriptor] (val x: Self) extends AnyVal {
    
    inline def setArrayLayerCount(value: GPUIntegerCoordinate): Self = StObject.set(x, "arrayLayerCount", value.asInstanceOf[js.Any])
    
    inline def setAspect(value: GPUTextureAspect): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
    
    inline def setAspectUndefined: Self = StObject.set(x, "aspect", js.undefined)
    
    inline def setBaseArrayLayer(value: GPUIntegerCoordinate): Self = StObject.set(x, "baseArrayLayer", value.asInstanceOf[js.Any])
    
    inline def setBaseArrayLayerUndefined: Self = StObject.set(x, "baseArrayLayer", js.undefined)
    
    inline def setBaseMipLevel(value: GPUIntegerCoordinate): Self = StObject.set(x, "baseMipLevel", value.asInstanceOf[js.Any])
    
    inline def setBaseMipLevelUndefined: Self = StObject.set(x, "baseMipLevel", js.undefined)
    
    inline def setDimension(value: GPUTextureViewDimension): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: GPUTextureFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setMipLevelCount(value: GPUIntegerCoordinate): Self = StObject.set(x, "mipLevelCount", value.asInstanceOf[js.Any])
  }
}
