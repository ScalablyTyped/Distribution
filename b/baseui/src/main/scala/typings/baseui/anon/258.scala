package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `258` extends StObject {
  
  @JSName("$orientation")
  var $orientation: js.UndefOr[typings.baseui.tabsMotionTypesMod.Orientation] = js.undefined
}
object `258` {
  
  inline def apply(): `258` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`258`]
  }
  
  extension [Self <: `258`](x: Self) {
    
    inline def set$orientation(value: typings.baseui.tabsMotionTypesMod.Orientation): Self = StObject.set(x, "$orientation", value.asInstanceOf[js.Any])
    
    inline def set$orientationUndefined: Self = StObject.set(x, "$orientation", js.undefined)
  }
}
