package typings.bootbox

import typings.bootbox.bootboxStrings.`extra-large`
import typings.bootbox.bootboxStrings.large
import typings.bootbox.bootboxStrings.lg
import typings.bootbox.bootboxStrings.sm
import typings.bootbox.bootboxStrings.small
import typings.bootbox.bootboxStrings.xl
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Bootbox options shared by all modal types */
@js.native
trait BootboxBaseOptions[T] extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.native
  
  var backdrop: js.UndefOr[Boolean] = js.native
  
  var buttons: js.UndefOr[BootboxButtonMap] = js.native
  
  var callback: js.UndefOr[js.Function1[/* result */ T, _]] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var closeButton: js.UndefOr[Boolean] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var onEscape: js.UndefOr[js.Function0[_] | Boolean] = js.native
  
  // complex object where each key is of type BootboxButton
  var scrollable: js.UndefOr[Boolean] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
  /** All other values result in medium */
  var size: js.UndefOr[small | sm | large | lg | `extra-large` | xl] = js.native
  
  var title: js.UndefOr[String | Element] = js.native
}
object BootboxBaseOptions {
  
  @scala.inline
  def apply[T](): BootboxBaseOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BootboxBaseOptions[T]]
  }
  
  @scala.inline
  implicit class BootboxBaseOptionsMutableBuilder[Self <: BootboxBaseOptions[_], T] (val x: Self with BootboxBaseOptions[T]) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setBackdrop(value: Boolean): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
    
    @scala.inline
    def setButtons(value: BootboxButtonMap): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setCallback(value: /* result */ T => _): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
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
    def setOnEscape(value: js.Function0[_] | Boolean): Self = StObject.set(x, "onEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEscapeFunction0(value: () => _): Self = StObject.set(x, "onEscape", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnEscapeUndefined: Self = StObject.set(x, "onEscape", js.undefined)
    
    @scala.inline
    def setScrollable(value: Boolean): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setSize(value: small | sm | large | lg | `extra-large` | xl): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTitle(value: String | Element): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
