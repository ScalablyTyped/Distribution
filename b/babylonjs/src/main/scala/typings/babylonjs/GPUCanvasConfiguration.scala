package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUCanvasConfiguration
  extends StObject
     with GPUObjectDescriptorBase {
  
  var alphaMode: js.UndefOr[GPUCanvasAlphaMode] = js.undefined
  
  var colorSpace: js.UndefOr[GPUPredefinedColorSpace] = js.undefined
  
  var device: GPUDevice
  
  var format: GPUTextureFormat
  
  var usage: js.UndefOr[GPUTextureUsageFlags] = js.undefined
  
  var viewFormats: js.UndefOr[js.Array[GPUTextureFormat]] = js.undefined
}
object GPUCanvasConfiguration {
  
  inline def apply(device: GPUDevice, format: GPUTextureFormat): GPUCanvasConfiguration = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUCanvasConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUCanvasConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAlphaMode(value: GPUCanvasAlphaMode): Self = StObject.set(x, "alphaMode", value.asInstanceOf[js.Any])
    
    inline def setAlphaModeUndefined: Self = StObject.set(x, "alphaMode", js.undefined)
    
    inline def setColorSpace(value: GPUPredefinedColorSpace): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    inline def setColorSpaceUndefined: Self = StObject.set(x, "colorSpace", js.undefined)
    
    inline def setDevice(value: GPUDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: GPUTextureFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setUsage(value: GPUTextureUsageFlags): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    
    inline def setViewFormats(value: js.Array[GPUTextureFormat]): Self = StObject.set(x, "viewFormats", value.asInstanceOf[js.Any])
    
    inline def setViewFormatsUndefined: Self = StObject.set(x, "viewFormats", js.undefined)
    
    inline def setViewFormatsVarargs(value: GPUTextureFormat*): Self = StObject.set(x, "viewFormats", js.Array(value*))
  }
}
