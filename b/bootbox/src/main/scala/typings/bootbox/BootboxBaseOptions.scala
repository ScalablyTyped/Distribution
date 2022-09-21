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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Bootbox options shared by all modal types */
trait BootboxBaseOptions[T] extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var backdrop: js.UndefOr[Boolean] = js.undefined
  
  var buttons: js.UndefOr[BootboxButtonMap] = js.undefined
  
  var callback: js.UndefOr[js.Function1[/* result */ T, Any]] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var closeButton: js.UndefOr[Boolean] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var onEscape: js.UndefOr[js.Function0[Any] | Boolean] = js.undefined
  
  // complex object where each key is of type BootboxButton
  var scrollable: js.UndefOr[Boolean] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
  
  /** All other values result in medium */
  var size: js.UndefOr[small | sm | large | lg | `extra-large` | xl] = js.undefined
  
  var title: js.UndefOr[String | Element] = js.undefined
}
object BootboxBaseOptions {
  
  inline def apply[T](): BootboxBaseOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BootboxBaseOptions[T]]
  }
  
  extension [Self <: BootboxBaseOptions[?], T](x: Self & BootboxBaseOptions[T]) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setBackdrop(value: Boolean): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
    
    inline def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
    
    inline def setButtons(value: BootboxButtonMap): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setCallback(value: /* result */ T => Any): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setOnEscape(value: js.Function0[Any] | Boolean): Self = StObject.set(x, "onEscape", value.asInstanceOf[js.Any])
    
    inline def setOnEscapeFunction0(value: () => Any): Self = StObject.set(x, "onEscape", js.Any.fromFunction0(value))
    
    inline def setOnEscapeUndefined: Self = StObject.set(x, "onEscape", js.undefined)
    
    inline def setScrollable(value: Boolean): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
    
    inline def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setSize(value: small | sm | large | lg | `extra-large` | xl): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTitle(value: String | Element): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
