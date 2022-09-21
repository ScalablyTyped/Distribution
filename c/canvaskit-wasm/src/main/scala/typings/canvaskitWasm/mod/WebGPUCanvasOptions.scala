package typings.canvaskitWasm.mod

import typings.webgpuTypes.GPUCanvasAlphaMode
import typings.webgpuTypes.GPUTextureFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGPUCanvasOptions extends StObject {
  
  var alphaMode: js.UndefOr[GPUCanvasAlphaMode] = js.undefined
  
  var format: js.UndefOr[GPUTextureFormat] = js.undefined
}
object WebGPUCanvasOptions {
  
  inline def apply(): WebGPUCanvasOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebGPUCanvasOptions]
  }
  
  extension [Self <: WebGPUCanvasOptions](x: Self) {
    
    inline def setAlphaMode(value: GPUCanvasAlphaMode): Self = StObject.set(x, "alphaMode", value.asInstanceOf[js.Any])
    
    inline def setAlphaModeUndefined: Self = StObject.set(x, "alphaMode", js.undefined)
    
    inline def setFormat(value: GPUTextureFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
