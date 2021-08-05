package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewportOptions extends StObject {
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var enableAnimation: js.UndefOr[Boolean] = js.undefined
  
  var margins: js.UndefOr[js.Array[Double]] = js.undefined
  
  var zoomFactor: js.UndefOr[Double] = js.undefined
}
object ViewportOptions {
  
  inline def apply(): ViewportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewportOptions]
  }
  
  extension [Self <: ViewportOptions](x: Self) {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
    
    inline def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
    
    inline def setMargins(value: js.Array[Double]): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
    
    inline def setMarginsUndefined: Self = StObject.set(x, "margins", js.undefined)
    
    inline def setMarginsVarargs(value: Double*): Self = StObject.set(x, "margins", js.Array(value :_*))
    
    inline def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
    
    inline def setZoomFactorUndefined: Self = StObject.set(x, "zoomFactor", js.undefined)
  }
}
