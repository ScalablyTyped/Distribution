package typings.ckeditor.CKEDITOR.ui.dialog.definitions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hbox extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[String] = js.undefined
  var padding: js.UndefOr[String] = js.undefined
  var widths: js.UndefOr[js.Array[String]] = js.undefined
}

object hbox {
  @scala.inline
  def apply(
    align: String = null,
    height: String = null,
    padding: String = null,
    widths: js.Array[String] = null
  ): hbox = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (height != null) __obj.updateDynamic("height")(height)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (widths != null) __obj.updateDynamic("widths")(widths)
    __obj.asInstanceOf[hbox]
  }
}

