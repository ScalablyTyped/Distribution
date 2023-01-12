package typings.bootbox

import typings.bootbox.anon.Group
import typings.jquery.JQuery
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Bootbox options available for prompt modals */
trait BootboxPromptOptions
  extends StObject
     with BootboxBaseOptions[String] {
  
  @JSName("buttons")
  var buttons_BootboxPromptOptions: js.UndefOr[BootboxConfirmPromptButtonMap] = js.undefined
  
  @JSName("callback")
  def callback_MBootboxPromptOptions(result: String): Any
  
  var inputOptions: js.UndefOr[js.Array[Group]] = js.undefined
  
  var inputType: js.UndefOr[BootboxInputType] = js.undefined
  
  var message: js.UndefOr[
    JQuery[HTMLElement] | js.Array[Any] | Element | DocumentFragment | Text | String | (js.Function2[/* index */ Double, /* html */ String, String | Element | JQuery[HTMLElement]])
  ] = js.undefined
  
  @JSName("title")
  var title_BootboxPromptOptions: String
  
  var value: js.UndefOr[String] = js.undefined
}
object BootboxPromptOptions {
  
  inline def apply(callback: String => Any, title: String): BootboxPromptOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootboxPromptOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BootboxPromptOptions] (val x: Self) extends AnyVal {
    
    inline def setButtons(value: BootboxConfirmPromptButtonMap): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setCallback(value: String => Any): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setInputOptions(value: js.Array[Group]): Self = StObject.set(x, "inputOptions", value.asInstanceOf[js.Any])
    
    inline def setInputOptionsUndefined: Self = StObject.set(x, "inputOptions", js.undefined)
    
    inline def setInputOptionsVarargs(value: Group*): Self = StObject.set(x, "inputOptions", js.Array(value*))
    
    inline def setInputType(value: BootboxInputType): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
    
    inline def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
    
    inline def setMessage(
      value: JQuery[HTMLElement] | js.Array[Any] | Element | DocumentFragment | Text | String | (js.Function2[/* index */ Double, /* html */ String, String | Element | JQuery[HTMLElement]])
    ): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageFunction2(value: (/* index */ Double, /* html */ String) => String | Element | JQuery[HTMLElement]): Self = StObject.set(x, "message", js.Any.fromFunction2(value))
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setMessageVarargs(value: Any*): Self = StObject.set(x, "message", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
