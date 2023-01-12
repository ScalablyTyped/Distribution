package typings.ckeditor4.anon

import typings.ckeditor4.CKEDITOR.dom.element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusElement extends StObject {
  
  var focusElement: js.UndefOr[element | Boolean] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
}
object FocusElement {
  
  inline def apply(): FocusElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FocusElement] (val x: Self) extends AnyVal {
    
    inline def setFocusElement(value: element | Boolean): Self = StObject.set(x, "focusElement", value.asInstanceOf[js.Any])
    
    inline def setFocusElementUndefined: Self = StObject.set(x, "focusElement", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
