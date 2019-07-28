package typings.ckeditor.CKEDITORNs.uiNs.dialogNs.definitionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait checkbox extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
}

object checkbox {
  @scala.inline
  def apply(checked: js.UndefOr[Boolean] = js.undefined, label: String = null, validate: () => Boolean = null): checkbox = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (label != null) __obj.updateDynamic("label")(label)
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction0(validate))
    __obj.asInstanceOf[checkbox]
  }
}

