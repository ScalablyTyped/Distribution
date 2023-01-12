package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLOptions extends StObject {
  
  var alpha: js.UndefOr[Double] = js.undefined
  
  var antialias: js.UndefOr[Double] = js.undefined
  
  var depth: js.UndefOr[Double] = js.undefined
  
  var enableExtensionsByDefault: js.UndefOr[Double] = js.undefined
  
  var explicitSwapControl: js.UndefOr[Double] = js.undefined
  
  var failIfMajorPerformanceCaveat: js.UndefOr[Double] = js.undefined
  
  var majorVersion: js.UndefOr[Double] = js.undefined
  
  var minorVersion: js.UndefOr[Double] = js.undefined
  
  var preferLowPowerToHighPerformance: js.UndefOr[Double] = js.undefined
  
  var premultipliedAlpha: js.UndefOr[Double] = js.undefined
  
  var preserveDrawingBuffer: js.UndefOr[Double] = js.undefined
  
  var renderViaOffscreenBackBuffer: js.UndefOr[Double] = js.undefined
  
  var stencil: js.UndefOr[Double] = js.undefined
}
object WebGLOptions {
  
  inline def apply(): WebGLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebGLOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebGLOptions] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setAntialias(value: Double): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
    
    inline def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setEnableExtensionsByDefault(value: Double): Self = StObject.set(x, "enableExtensionsByDefault", value.asInstanceOf[js.Any])
    
    inline def setEnableExtensionsByDefaultUndefined: Self = StObject.set(x, "enableExtensionsByDefault", js.undefined)
    
    inline def setExplicitSwapControl(value: Double): Self = StObject.set(x, "explicitSwapControl", value.asInstanceOf[js.Any])
    
    inline def setExplicitSwapControlUndefined: Self = StObject.set(x, "explicitSwapControl", js.undefined)
    
    inline def setFailIfMajorPerformanceCaveat(value: Double): Self = StObject.set(x, "failIfMajorPerformanceCaveat", value.asInstanceOf[js.Any])
    
    inline def setFailIfMajorPerformanceCaveatUndefined: Self = StObject.set(x, "failIfMajorPerformanceCaveat", js.undefined)
    
    inline def setMajorVersion(value: Double): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
    
    inline def setMajorVersionUndefined: Self = StObject.set(x, "majorVersion", js.undefined)
    
    inline def setMinorVersion(value: Double): Self = StObject.set(x, "minorVersion", value.asInstanceOf[js.Any])
    
    inline def setMinorVersionUndefined: Self = StObject.set(x, "minorVersion", js.undefined)
    
    inline def setPreferLowPowerToHighPerformance(value: Double): Self = StObject.set(x, "preferLowPowerToHighPerformance", value.asInstanceOf[js.Any])
    
    inline def setPreferLowPowerToHighPerformanceUndefined: Self = StObject.set(x, "preferLowPowerToHighPerformance", js.undefined)
    
    inline def setPremultipliedAlpha(value: Double): Self = StObject.set(x, "premultipliedAlpha", value.asInstanceOf[js.Any])
    
    inline def setPremultipliedAlphaUndefined: Self = StObject.set(x, "premultipliedAlpha", js.undefined)
    
    inline def setPreserveDrawingBuffer(value: Double): Self = StObject.set(x, "preserveDrawingBuffer", value.asInstanceOf[js.Any])
    
    inline def setPreserveDrawingBufferUndefined: Self = StObject.set(x, "preserveDrawingBuffer", js.undefined)
    
    inline def setRenderViaOffscreenBackBuffer(value: Double): Self = StObject.set(x, "renderViaOffscreenBackBuffer", value.asInstanceOf[js.Any])
    
    inline def setRenderViaOffscreenBackBufferUndefined: Self = StObject.set(x, "renderViaOffscreenBackBuffer", js.undefined)
    
    inline def setStencil(value: Double): Self = StObject.set(x, "stencil", value.asInstanceOf[js.Any])
    
    inline def setStencilUndefined: Self = StObject.set(x, "stencil", js.undefined)
  }
}
