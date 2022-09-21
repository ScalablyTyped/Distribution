package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUTextureDescriptor
  extends StObject
     with GPUObjectDescriptorBase {
  
  var dimension: js.UndefOr[GPUTextureDimension] = js.undefined
  
  var format: GPUTextureFormat
  
  var mipLevelCount: js.UndefOr[GPUIntegerCoordinate] = js.undefined
  
  var sampleCount: js.UndefOr[GPUSize32] = js.undefined
  
  var size: GPUExtent3D
  
  var usage: GPUTextureUsageFlags
  
  var viewFormats: js.UndefOr[js.Array[GPUTextureFormat]] = js.undefined
}
object GPUTextureDescriptor {
  
  inline def apply(format: GPUTextureFormat, size: GPUExtent3D, usage: GPUTextureUsageFlags): GPUTextureDescriptor = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUTextureDescriptor]
  }
  
  extension [Self <: GPUTextureDescriptor](x: Self) {
    
    inline def setDimension(value: GPUTextureDimension): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    inline def setFormat(value: GPUTextureFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setMipLevelCount(value: GPUIntegerCoordinate): Self = StObject.set(x, "mipLevelCount", value.asInstanceOf[js.Any])
    
    inline def setMipLevelCountUndefined: Self = StObject.set(x, "mipLevelCount", js.undefined)
    
    inline def setSampleCount(value: GPUSize32): Self = StObject.set(x, "sampleCount", value.asInstanceOf[js.Any])
    
    inline def setSampleCountUndefined: Self = StObject.set(x, "sampleCount", js.undefined)
    
    inline def setSize(value: GPUExtent3D): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setUsage(value: GPUTextureUsageFlags): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setViewFormats(value: js.Array[GPUTextureFormat]): Self = StObject.set(x, "viewFormats", value.asInstanceOf[js.Any])
    
    inline def setViewFormatsUndefined: Self = StObject.set(x, "viewFormats", js.undefined)
    
    inline def setViewFormatsVarargs(value: GPUTextureFormat*): Self = StObject.set(x, "viewFormats", js.Array(value*))
  }
}
