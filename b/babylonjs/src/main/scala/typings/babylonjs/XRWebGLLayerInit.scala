package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRWebGLLayerInit extends StObject {
  
  var alpha: js.UndefOr[Boolean] = js.undefined
  
  var antialias: js.UndefOr[Boolean] = js.undefined
  
  var depth: js.UndefOr[Boolean] = js.undefined
  
  var framebufferScaleFactor: js.UndefOr[Double] = js.undefined
  
  var ignoreDepthValues: js.UndefOr[Boolean] = js.undefined
  
  var stencil: js.UndefOr[Boolean] = js.undefined
}
object XRWebGLLayerInit {
  
  inline def apply(): XRWebGLLayerInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XRWebGLLayerInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XRWebGLLayerInit] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
    
    inline def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
    
    inline def setDepth(value: Boolean): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setFramebufferScaleFactor(value: Double): Self = StObject.set(x, "framebufferScaleFactor", value.asInstanceOf[js.Any])
    
    inline def setFramebufferScaleFactorUndefined: Self = StObject.set(x, "framebufferScaleFactor", js.undefined)
    
    inline def setIgnoreDepthValues(value: Boolean): Self = StObject.set(x, "ignoreDepthValues", value.asInstanceOf[js.Any])
    
    inline def setIgnoreDepthValuesUndefined: Self = StObject.set(x, "ignoreDepthValues", js.undefined)
    
    inline def setStencil(value: Boolean): Self = StObject.set(x, "stencil", value.asInstanceOf[js.Any])
    
    inline def setStencilUndefined: Self = StObject.set(x, "stencil", js.undefined)
  }
}
