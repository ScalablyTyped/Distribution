package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimateUnderline extends StObject {
  
  @JSName("$isAnimateUnderline")
  var $isAnimateUnderline: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$isFocusVisible")
  var $isFocusVisible: js.UndefOr[Boolean] = js.undefined
  
  var animateUnderline: js.UndefOr[Boolean] = js.undefined
}
object AnimateUnderline {
  
  inline def apply(): AnimateUnderline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimateUnderline]
  }
  
  extension [Self <: AnimateUnderline](x: Self) {
    
    inline def set$isAnimateUnderline(value: Boolean): Self = StObject.set(x, "$isAnimateUnderline", value.asInstanceOf[js.Any])
    
    inline def set$isAnimateUnderlineUndefined: Self = StObject.set(x, "$isAnimateUnderline", js.undefined)
    
    inline def set$isFocusVisible(value: Boolean): Self = StObject.set(x, "$isFocusVisible", value.asInstanceOf[js.Any])
    
    inline def set$isFocusVisibleUndefined: Self = StObject.set(x, "$isFocusVisible", js.undefined)
    
    inline def setAnimateUnderline(value: Boolean): Self = StObject.set(x, "animateUnderline", value.asInstanceOf[js.Any])
    
    inline def setAnimateUnderlineUndefined: Self = StObject.set(x, "animateUnderline", js.undefined)
  }
}
