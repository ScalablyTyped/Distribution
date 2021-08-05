package typings.bootbox

import typings.jquery.JQuery
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Bootbox options available for alert modals */
trait BootboxAlertOptions
  extends StObject
     with BootboxDialogOptions[Unit] {
  
  @JSName("buttons")
  var buttons_BootboxAlertOptions: js.UndefOr[BootboxAlertButtonMap] = js.undefined
  
  @JSName("callback")
  var callback_BootboxAlertOptions: js.UndefOr[js.Function0[js.Any]] = js.undefined
}
object BootboxAlertOptions {
  
  inline def apply(
    message: JQuery[HTMLElement] | js.Array[js.Any] | Element | DocumentFragment | Text | String | (js.Function2[/* index */ Double, /* html */ String, String | Element | JQuery[HTMLElement]])
  ): BootboxAlertOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootboxAlertOptions]
  }
  
  extension [Self <: BootboxAlertOptions](x: Self) {
    
    inline def setButtons(value: BootboxAlertButtonMap): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setCallback(value: () => js.Any): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
  }
}
