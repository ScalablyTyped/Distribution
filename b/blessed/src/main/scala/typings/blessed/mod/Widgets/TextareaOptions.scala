package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A box which allows multiline text input.
  */
@js.native
trait TextareaOptions extends BoxOptions {
  
  /**
    * Call readInput() when the element is focused. Automatically unfocus.
    */
  var inputOnFocus: js.UndefOr[Boolean] = js.native
}
object TextareaOptions {
  
  @scala.inline
  def apply(): TextareaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextareaOptions]
  }
  
  @scala.inline
  implicit class TextareaOptionsMutableBuilder[Self <: TextareaOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputOnFocus(value: Boolean): Self = StObject.set(x, "inputOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputOnFocusUndefined: Self = StObject.set(x, "inputOnFocus", js.undefined)
  }
}
