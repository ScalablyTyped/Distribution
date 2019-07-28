package typings.ckeditor.CKEDITORNs.uiNs.dialogNs.definitionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait button extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var label: String
}

object button {
  @scala.inline
  def apply(label: String, disabled: js.UndefOr[Boolean] = js.undefined): button = {
    val __obj = js.Dynamic.literal(label = label)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[button]
  }
}

