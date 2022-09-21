package typings.bootbox

import typings.jquery.JQuery
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Bootbox options available when setting defaults for modals */
trait BootboxDefaultOptions extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var backdrop: js.UndefOr[Boolean] = js.undefined
  
  var centerVertical: js.UndefOr[Boolean] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var closeButton: js.UndefOr[Boolean] = js.undefined
  
  var container: js.UndefOr[String | Element | JQuery[HTMLElement]] = js.undefined
  
  var inputType: js.UndefOr[BootboxInputType] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  var reusable: js.UndefOr[Boolean] = js.undefined
  
  var scrollable: js.UndefOr[Boolean] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
  
  var swapButtonOrder: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[String | Double | js.Array[String]] = js.undefined
}
object BootboxDefaultOptions {
  
  inline def apply(): BootboxDefaultOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BootboxDefaultOptions]
  }
  
  extension [Self <: BootboxDefaultOptions](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setBackdrop(value: Boolean): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
    
    inline def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
    
    inline def setCenterVertical(value: Boolean): Self = StObject.set(x, "centerVertical", value.asInstanceOf[js.Any])
    
    inline def setCenterVerticalUndefined: Self = StObject.set(x, "centerVertical", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    inline def setContainer(value: String | Element | JQuery[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setInputType(value: BootboxInputType): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
    
    inline def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setReusable(value: Boolean): Self = StObject.set(x, "reusable", value.asInstanceOf[js.Any])
    
    inline def setReusableUndefined: Self = StObject.set(x, "reusable", js.undefined)
    
    inline def setScrollable(value: Boolean): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
    
    inline def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setSwapButtonOrder(value: Boolean): Self = StObject.set(x, "swapButtonOrder", value.asInstanceOf[js.Any])
    
    inline def setSwapButtonOrderUndefined: Self = StObject.set(x, "swapButtonOrder", js.undefined)
    
    inline def setValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
