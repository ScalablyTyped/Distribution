package typings.ckeditor.CKEDITOR.ui.dialog.definitions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait select extends js.Object {
  var default: js.Any
  var items: js.Array[(js.Tuple2[String, String]) | js.Array[String]]
  var multiple: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
}

object select {
  @scala.inline
  def apply(
    default: js.Any,
    items: js.Array[(js.Tuple2[String, String]) | js.Array[String]],
    multiple: js.UndefOr[Boolean] = js.undefined,
    size: Int | Double = null,
    validate: () => Boolean = null
  ): select = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction0(validate))
    __obj.asInstanceOf[select]
  }
}

