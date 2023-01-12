package typings.betterScroll.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollBarOption extends StObject {
  
  var fade: Boolean
}
object ScrollBarOption {
  
  inline def apply(fade: Boolean): ScrollBarOption = {
    val __obj = js.Dynamic.literal(fade = fade.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollBarOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollBarOption] (val x: Self) extends AnyVal {
    
    inline def setFade(value: Boolean): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
  }
}
