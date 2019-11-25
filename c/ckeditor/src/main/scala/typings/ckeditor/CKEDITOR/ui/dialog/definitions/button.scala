package typings.ckeditor.CKEDITOR.ui.dialog.definitions

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
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[button]
  }
}

