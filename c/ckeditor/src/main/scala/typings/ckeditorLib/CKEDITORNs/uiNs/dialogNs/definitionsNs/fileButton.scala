package typings
package ckeditorLib.CKEDITORNs.uiNs.dialogNs.definitionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fileButton extends js.Object {
  var `for`: java.lang.String
  var validate: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
}

object fileButton {
  @scala.inline
  def apply(`for`: java.lang.String, validate: js.Function0[scala.Boolean] = null): fileButton = {
    val __obj = js.Dynamic.literal(`for` = `for`)
    if (validate != null) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[fileButton]
  }
}

