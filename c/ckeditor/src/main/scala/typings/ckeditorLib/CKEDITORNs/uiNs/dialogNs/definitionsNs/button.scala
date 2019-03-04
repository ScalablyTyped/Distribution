package typings
package ckeditorLib.CKEDITORNs.uiNs.dialogNs.definitionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait button extends js.Object {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var label: java.lang.String
}

object button {
  @scala.inline
  def apply(label: java.lang.String, disabled: js.UndefOr[scala.Boolean] = js.undefined): button = {
    val __obj = js.Dynamic.literal(label = label)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[button]
  }
}

