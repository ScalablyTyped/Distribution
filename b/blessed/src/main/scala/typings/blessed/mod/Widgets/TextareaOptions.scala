package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A box which allows multiline text input.
  */
trait TextareaOptions
  extends StObject
     with BoxOptions {
  
  /**
    * Call readInput() when the element is focused. Automatically unfocus.
    */
  var inputOnFocus: js.UndefOr[Boolean] = js.undefined
}
object TextareaOptions {
  
  inline def apply(): TextareaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextareaOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextareaOptions] (val x: Self) extends AnyVal {
    
    inline def setInputOnFocus(value: Boolean): Self = StObject.set(x, "inputOnFocus", value.asInstanceOf[js.Any])
    
    inline def setInputOnFocusUndefined: Self = StObject.set(x, "inputOnFocus", js.undefined)
  }
}
