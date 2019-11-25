package typings.ckeditor.CKEDITOR.ui.dialog.definitions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fileButton extends js.Object {
  var `for`: String
  var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
}

object fileButton {
  @scala.inline
  def apply(`for`: String, validate: () => Boolean = null): fileButton = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("for")(`for`.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction0(validate))
    __obj.asInstanceOf[fileButton]
  }
}

