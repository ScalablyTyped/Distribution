package typings.ckeditor.CKEDITOR.ui.dialog.definitions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait vbox extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var expand: js.UndefOr[Boolean] = js.undefined
  var heights: js.UndefOr[js.Array[String]] = js.undefined
  var padding: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object vbox {
  @scala.inline
  def apply(
    align: String = null,
    expand: js.UndefOr[Boolean] = js.undefined,
    heights: js.Array[String] = null,
    padding: String = null,
    width: String = null
  ): vbox = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (heights != null) __obj.updateDynamic("heights")(heights.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[vbox]
  }
}

