package typings.chayns

import typings.chayns.chayns.dialog.buttonType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * UI Functions
  * chayns.dialog
  * interfaces
  */
// chayns.dialog.confirm()
@js.native
trait DialogButton extends StObject {
  
  var buttonType: typings.chayns.chayns.dialog.buttonType = js.native
  
  var text: String = js.native
}
object DialogButton {
  
  @scala.inline
  def apply(buttonType: buttonType, text: String): DialogButton = {
    val __obj = js.Dynamic.literal(buttonType = buttonType.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogButton]
  }
  
  @scala.inline
  implicit class DialogButtonMutableBuilder[Self <: DialogButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtonType(value: buttonType): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
