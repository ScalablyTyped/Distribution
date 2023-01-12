package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPURenderPassLayout
  extends StObject
     with GPUObjectDescriptorBase {
  
  var colorFormats: js.Array[GPUTextureFormat | Null]
  
  var depthStencilFormat: js.UndefOr[GPUTextureFormat] = js.undefined
  
  var sampleCount: js.UndefOr[GPUSize32] = js.undefined
}
object GPURenderPassLayout {
  
  inline def apply(colorFormats: js.Array[GPUTextureFormat | Null]): GPURenderPassLayout = {
    val __obj = js.Dynamic.literal(colorFormats = colorFormats.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPURenderPassLayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPURenderPassLayout] (val x: Self) extends AnyVal {
    
    inline def setColorFormats(value: js.Array[GPUTextureFormat | Null]): Self = StObject.set(x, "colorFormats", value.asInstanceOf[js.Any])
    
    inline def setColorFormatsVarargs(value: (GPUTextureFormat | Null)*): Self = StObject.set(x, "colorFormats", js.Array(value*))
    
    inline def setDepthStencilFormat(value: GPUTextureFormat): Self = StObject.set(x, "depthStencilFormat", value.asInstanceOf[js.Any])
    
    inline def setDepthStencilFormatUndefined: Self = StObject.set(x, "depthStencilFormat", js.undefined)
    
    inline def setSampleCount(value: GPUSize32): Self = StObject.set(x, "sampleCount", value.asInstanceOf[js.Any])
    
    inline def setSampleCountUndefined: Self = StObject.set(x, "sampleCount", js.undefined)
  }
}
