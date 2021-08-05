package typings.baseui.anon

import typings.baseui.layerMod.PopperOffset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arrow extends StObject {
  
  var arrow: js.UndefOr[PopperOffset] = js.undefined
  
  var popper: PopperOffset
}
object Arrow {
  
  inline def apply(popper: PopperOffset): Arrow = {
    val __obj = js.Dynamic.literal(popper = popper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arrow]
  }
  
  extension [Self <: Arrow](x: Self) {
    
    inline def setArrow(value: PopperOffset): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    
    inline def setPopper(value: PopperOffset): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
  }
}
