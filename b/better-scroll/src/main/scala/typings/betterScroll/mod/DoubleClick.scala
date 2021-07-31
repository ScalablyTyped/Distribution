package typings.betterScroll.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoubleClick extends StObject {
  
  var delay: Double
}
object DoubleClick {
  
  @scala.inline
  def apply(delay: Double): DoubleClick = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoubleClick]
  }
  
  @scala.inline
  implicit class DoubleClickMutableBuilder[Self <: DoubleClick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
  }
}
