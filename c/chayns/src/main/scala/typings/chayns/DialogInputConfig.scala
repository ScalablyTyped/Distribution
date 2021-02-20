package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.dialog.input()
@js.native
trait DialogInputConfig extends StObject {
  
  var buttons: js.UndefOr[js.Array[DialogButton]] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var placeholderText: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var title: String = js.native
}
object DialogInputConfig {
  
  @scala.inline
  def apply(title: String): DialogInputConfig = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogInputConfig]
  }
  
  @scala.inline
  implicit class DialogInputConfigMutableBuilder[Self <: DialogInputConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtons(value: js.Array[DialogButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: DialogButton*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setPlaceholderText(value: String): Self = StObject.set(x, "placeholderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderTextUndefined: Self = StObject.set(x, "placeholderText", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
