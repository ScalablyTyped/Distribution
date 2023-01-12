package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckboxOptions
  extends StObject
     with BoxOptions {
  
  /**
    * whether the element is checked or not.
    */
  var checked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * enable mouse support.
    */
  @JSName("mouse")
  var mouse_CheckboxOptions: js.UndefOr[Boolean] = js.undefined
}
object CheckboxOptions {
  
  inline def apply(): CheckboxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckboxOptions] (val x: Self) extends AnyVal {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setMouse(value: Boolean): Self = StObject.set(x, "mouse", value.asInstanceOf[js.Any])
    
    inline def setMouseUndefined: Self = StObject.set(x, "mouse", js.undefined)
  }
}
