package typings.bootbox

import typings.jquery.JQuery
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Bootbox options available for confirm modals */
trait BootboxConfirmOptions
  extends StObject
     with BootboxDialogOptions[Boolean] {
  
  @JSName("buttons")
  var buttons_BootboxConfirmOptions: js.UndefOr[BootboxConfirmPromptButtonMap] = js.undefined
  
  @JSName("callback")
  def callback_MBootboxConfirmOptions(result: Boolean): Any
}
object BootboxConfirmOptions {
  
  inline def apply(
    callback: Boolean => Any,
    message: JQuery[HTMLElement] | js.Array[Any] | Element | DocumentFragment | Text | String | (js.Function2[/* index */ Double, /* html */ String, String | Element | JQuery[HTMLElement]])
  ): BootboxConfirmOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootboxConfirmOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BootboxConfirmOptions] (val x: Self) extends AnyVal {
    
    inline def setButtons(value: BootboxConfirmPromptButtonMap): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setCallback(value: Boolean => Any): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
  }
}
