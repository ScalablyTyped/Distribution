package typings.baidumapWebSdk.BMap

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
  
  @scala.inline
  def apply(): ViewportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewportOptions]
  }
  
  @scala.inline
  implicit class ViewportOptionsMutableBuilder[Self <: ViewportOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
    
    @scala.inline
    def setMargins(value: js.Array[Double]): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginsUndefined: Self = StObject.set(x, "margins", js.undefined)
    
    @scala.inline
    def setMarginsVarargs(value: Double*): Self = StObject.set(x, "margins", js.Array(value :_*))
    
    @scala.inline
    def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomFactorUndefined: Self = StObject.set(x, "zoomFactor", js.undefined)
  }
}
