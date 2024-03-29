package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusVisible extends StObject {
  
  @JSName("$fill")
  var $fill: js.UndefOr[typings.baseui.tabsMotionTypesMod.Fill] = js.undefined
  
  @JSName("$focusVisible")
  var $focusVisible: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$isActive")
  var $isActive: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$orientation")
  var $orientation: js.UndefOr[typings.baseui.tabsMotionTypesMod.Orientation] = js.undefined
}
object FocusVisible {
  
  inline def apply(): FocusVisible = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusVisible]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FocusVisible] (val x: Self) extends AnyVal {
    
    inline def set$fill(value: typings.baseui.tabsMotionTypesMod.Fill): Self = StObject.set(x, "$fill", value.asInstanceOf[js.Any])
    
    inline def set$fillUndefined: Self = StObject.set(x, "$fill", js.undefined)
    
    inline def set$focusVisible(value: Boolean): Self = StObject.set(x, "$focusVisible", value.asInstanceOf[js.Any])
    
    inline def set$focusVisibleUndefined: Self = StObject.set(x, "$focusVisible", js.undefined)
    
    inline def set$isActive(value: Boolean): Self = StObject.set(x, "$isActive", value.asInstanceOf[js.Any])
    
    inline def set$isActiveUndefined: Self = StObject.set(x, "$isActive", js.undefined)
    
    inline def set$orientation(value: typings.baseui.tabsMotionTypesMod.Orientation): Self = StObject.set(x, "$orientation", value.asInstanceOf[js.Any])
    
    inline def set$orientationUndefined: Self = StObject.set(x, "$orientation", js.undefined)
  }
}
