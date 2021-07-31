package typings.chayns

import typings.chayns.chayns.dialog.buttonType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogInputResult extends StObject {
  
  var buttonType: typings.chayns.chayns.dialog.buttonType
  
  var text: String
}
object DialogInputResult {
  
  @scala.inline
  def apply(buttonType: buttonType, text: String): DialogInputResult = {
    val __obj = js.Dynamic.literal(buttonType = buttonType.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogInputResult]
  }
  
  @scala.inline
  implicit class DialogInputResultMutableBuilder[Self <: DialogInputResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtonType(value: buttonType): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
