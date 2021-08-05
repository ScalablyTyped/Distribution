package typings.bootbox

import typings.jquery.JQuery
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Bootbox options available for custom modals */
trait BootboxDialogOptions[T]
  extends StObject
     with BootboxBaseOptions[T] {
  
  var centerVertical: js.UndefOr[Boolean] = js.undefined
  
  var message: JQuery[HTMLElement] | js.Array[js.Any] | Element | DocumentFragment | Text | String | (js.Function2[/* index */ Double, /* html */ String, String | Element | JQuery[HTMLElement]])
  
  var swapButtonOrder: js.UndefOr[Boolean] = js.undefined
}
object BootboxDialogOptions {
  
  inline def apply[T](
    message: JQuery[HTMLElement] | js.Array[js.Any] | Element | DocumentFragment | Text | String | (js.Function2[/* index */ Double, /* html */ String, String | Element | JQuery[HTMLElement]])
  ): BootboxDialogOptions[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootboxDialogOptions[T]]
  }
  
  extension [Self <: BootboxDialogOptions[?], T](x: Self & BootboxDialogOptions[T]) {
    
    inline def setCenterVertical(value: Boolean): Self = StObject.set(x, "centerVertical", value.asInstanceOf[js.Any])
    
    inline def setCenterVerticalUndefined: Self = StObject.set(x, "centerVertical", js.undefined)
    
    inline def setMessage(
      value: JQuery[HTMLElement] | js.Array[js.Any] | Element | DocumentFragment | Text | String | (js.Function2[/* index */ Double, /* html */ String, String | Element | JQuery[HTMLElement]])
    ): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageFunction2(value: (/* index */ Double, /* html */ String) => String | Element | JQuery[HTMLElement]): Self = StObject.set(x, "message", js.Any.fromFunction2(value))
    
    inline def setMessageVarargs(value: js.Any*): Self = StObject.set(x, "message", js.Array(value :_*))
    
    inline def setSwapButtonOrder(value: Boolean): Self = StObject.set(x, "swapButtonOrder", value.asInstanceOf[js.Any])
    
    inline def setSwapButtonOrderUndefined: Self = StObject.set(x, "swapButtonOrder", js.undefined)
  }
}
