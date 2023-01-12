package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fill extends StObject {
  
  @JSName("$fill")
  var $fill: js.UndefOr[typings.baseui.tabsMotionTypesMod.Fill] = js.undefined
  
  @JSName("$orientation")
  var $orientation: js.UndefOr[typings.baseui.tabsMotionTypesMod.Orientation] = js.undefined
}
object Fill {
  
  inline def apply(): Fill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fill]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fill] (val x: Self) extends AnyVal {
    
    inline def set$fill(value: typings.baseui.tabsMotionTypesMod.Fill): Self = StObject.set(x, "$fill", value.asInstanceOf[js.Any])
    
    inline def set$fillUndefined: Self = StObject.set(x, "$fill", js.undefined)
    
    inline def set$orientation(value: typings.baseui.tabsMotionTypesMod.Orientation): Self = StObject.set(x, "$orientation", value.asInstanceOf[js.Any])
    
    inline def set$orientationUndefined: Self = StObject.set(x, "$orientation", js.undefined)
  }
}
