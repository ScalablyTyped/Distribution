package typings.ckeditor.CKEDITOR.ui.dialog.definitions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait textarea extends js.Object {
  var cols: js.UndefOr[Double] = js.undefined
  var default: js.UndefOr[String] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
}

object textarea {
  @scala.inline
  def apply(
    cols: Int | Double = null,
    default: String = null,
    rows: Int | Double = null,
    validate: () => Boolean = null
  ): textarea = {
    val __obj = js.Dynamic.literal()
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction0(validate))
    __obj.asInstanceOf[textarea]
  }
}

