package typings
package chaynsLib

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
  var buttonType: chaynsLib.chaynsNs.dialogNs.buttonType
  var text: java.lang.String
}

object DialogButton {
  @scala.inline
  def apply(buttonType: chaynsLib.chaynsNs.dialogNs.buttonType, text: java.lang.String): DialogButton = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buttonType")(buttonType)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[DialogButton]
  }
}

