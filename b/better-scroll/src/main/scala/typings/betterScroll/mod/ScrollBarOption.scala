package typings.betterScroll.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollBarOption extends StObject {
  
  var fade: Boolean = js.native
}
object ScrollBarOption {
  
  @scala.inline
  def apply(fade: Boolean): ScrollBarOption = {
    val __obj = js.Dynamic.literal(fade = fade.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollBarOption]
  }
  
  @scala.inline
  implicit class ScrollBarOptionMutableBuilder[Self <: ScrollBarOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFade(value: Boolean): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
  }
}
