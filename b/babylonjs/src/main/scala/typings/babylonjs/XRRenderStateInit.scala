package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://immersive-web.github.io/webxr/#dictdef-xrrenderstateinit
trait XRRenderStateInit extends StObject {
  
  var baseLayer: js.UndefOr[XRWebGLLayer] = js.undefined
  
  var depthFar: Double
  
  var depthNear: Double
  
  var inlineVerticalFieldOfView: js.UndefOr[Double] = js.undefined
  
  var layers: js.UndefOr[js.Array[XRLayer]] = js.undefined
}
object XRRenderStateInit {
  
  inline def apply(depthFar: Double, depthNear: Double): XRRenderStateInit = {
    val __obj = js.Dynamic.literal(depthFar = depthFar.asInstanceOf[js.Any], depthNear = depthNear.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRRenderStateInit]
  }
  
  extension [Self <: XRRenderStateInit](x: Self) {
    
    inline def setBaseLayer(value: XRWebGLLayer): Self = StObject.set(x, "baseLayer", value.asInstanceOf[js.Any])
    
    inline def setBaseLayerUndefined: Self = StObject.set(x, "baseLayer", js.undefined)
    
    inline def setDepthFar(value: Double): Self = StObject.set(x, "depthFar", value.asInstanceOf[js.Any])
    
    inline def setDepthNear(value: Double): Self = StObject.set(x, "depthNear", value.asInstanceOf[js.Any])
    
    inline def setInlineVerticalFieldOfView(value: Double): Self = StObject.set(x, "inlineVerticalFieldOfView", value.asInstanceOf[js.Any])
    
    inline def setInlineVerticalFieldOfViewUndefined: Self = StObject.set(x, "inlineVerticalFieldOfView", js.undefined)
    
    inline def setLayers(value: js.Array[XRLayer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: XRLayer*): Self = StObject.set(x, "layers", js.Array(value*))
  }
}
