package typings.bootbox

import typings.bootbox.anon.Group
import typings.bootbox.bootboxStrings.checkbox
import typings.bootbox.bootboxStrings.date
import typings.bootbox.bootboxStrings.email
import typings.bootbox.bootboxStrings.number
import typings.bootbox.bootboxStrings.password
import typings.bootbox.bootboxStrings.radio
import typings.bootbox.bootboxStrings.range
import typings.bootbox.bootboxStrings.select
import typings.bootbox.bootboxStrings.text
import typings.bootbox.bootboxStrings.textarea
import typings.bootbox.bootboxStrings.time
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
  def callback_MBootboxPromptOptions(result: String): js.Any
  
  var inputOptions: js.UndefOr[js.Array[Group]] = js.undefined
  
  var inputType: js.UndefOr[
    text | textarea | email | select | checkbox | date | time | number | password | radio | range
  ] = js.undefined
  
  @JSName("title")
  var title_BootboxPromptOptions: String
  
  var value: js.UndefOr[String] = js.undefined
}
object BootboxPromptOptions {
  
  inline def apply(callback: String => js.Any, title: String): BootboxPromptOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootboxPromptOptions]
  }
  
  extension [Self <: BootboxPromptOptions](x: Self) {
    
    inline def setButtons(value: BootboxConfirmPromptButtonMap): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setCallback(value: String => js.Any): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setInputOptions(value: js.Array[Group]): Self = StObject.set(x, "inputOptions", value.asInstanceOf[js.Any])
    
    inline def setInputOptionsUndefined: Self = StObject.set(x, "inputOptions", js.undefined)
    
    inline def setInputOptionsVarargs(value: Group*): Self = StObject.set(x, "inputOptions", js.Array(value :_*))
    
    inline def setInputType(
      value: text | textarea | email | select | checkbox | date | time | number | password | radio | range
    ): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
    
    inline def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
