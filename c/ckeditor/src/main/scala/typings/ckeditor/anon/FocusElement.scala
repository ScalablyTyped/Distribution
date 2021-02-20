package typings.ckeditor.anon

import typings.ckeditor.CKEDITOR.dom.element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FocusElement extends StObject {
  
  var focusElement: js.UndefOr[element | Boolean] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
}
object FocusElement {
  
  @scala.inline
  def apply(): FocusElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusElement]
  }
  
  @scala.inline
  implicit class FocusElementMutableBuilder[Self <: FocusElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFocusElement(value: element | Boolean): Self = StObject.set(x, "focusElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusElementUndefined: Self = StObject.set(x, "focusElement", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
