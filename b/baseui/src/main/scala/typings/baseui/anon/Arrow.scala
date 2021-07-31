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
  
  @scala.inline
  def apply(popper: PopperOffset): Arrow = {
    val __obj = js.Dynamic.literal(popper = popper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arrow]
  }
  
  @scala.inline
  implicit class ArrowMutableBuilder[Self <: Arrow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrow(value: PopperOffset): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    
    @scala.inline
    def setPopper(value: PopperOffset): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
  }
}
