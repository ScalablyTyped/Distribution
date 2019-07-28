package typings.chayns

import typings.chayns.chaynsNs.dialogNs.buttonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * UI Functions
  * chayns.dialog
  * interfaces
  */
// chayns.dialog.confirm()
trait DialogButton extends js.Object {
  var buttonType: typings.chayns.chaynsNs.dialogNs.buttonType
  var text: String
}

object DialogButton {
  @scala.inline
  def apply(buttonType: buttonType, text: String): DialogButton = {
    val __obj = js.Dynamic.literal(buttonType = buttonType, text = text)
  
    __obj.asInstanceOf[DialogButton]
  }
}

