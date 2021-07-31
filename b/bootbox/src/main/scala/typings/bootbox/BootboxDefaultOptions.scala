package typings.bootbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Bootbox options available when setting defaults for modals */
trait BootboxDefaultOptions extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var backdrop: js.UndefOr[Boolean] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var closeButton: js.UndefOr[Boolean] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
}
object BootboxDefaultOptions {
  
  @scala.inline
  def apply(): BootboxDefaultOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BootboxDefaultOptions]
  }
  
  @scala.inline
  implicit class BootboxDefaultOptionsMutableBuilder[Self <: BootboxDefaultOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setBackdrop(value: Boolean): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
