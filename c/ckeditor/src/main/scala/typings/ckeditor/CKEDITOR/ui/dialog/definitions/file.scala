package typings.ckeditor.CKEDITOR.ui.dialog.definitions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait file extends js.Object {
  var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
}

object file {
  @scala.inline
  def apply(validate: () => Boolean = null): file = {
    val __obj = js.Dynamic.literal()
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction0(validate))
    __obj.asInstanceOf[file]
  }
}

