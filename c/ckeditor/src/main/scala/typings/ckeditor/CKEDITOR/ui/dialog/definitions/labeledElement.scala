package typings.ckeditor.CKEDITOR.ui.dialog.definitions

import typings.ckeditor.ckeditorStrings.horizontal
import typings.ckeditor.ckeditorStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait labeledElement extends js.Object {
  var includeLabel: js.UndefOr[Boolean] = js.undefined
  var label: String
  var labelLayout: js.UndefOr[horizontal | vertical] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var widths: js.UndefOr[js.Tuple2[String, String]] = js.undefined
}

object labeledElement {
  @scala.inline
  def apply(
    label: String,
    includeLabel: js.UndefOr[Boolean] = js.undefined,
    labelLayout: horizontal | vertical = null,
    role: String = null,
    widths: js.Tuple2[String, String] = null
  ): labeledElement = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (!js.isUndefined(includeLabel)) __obj.updateDynamic("includeLabel")(includeLabel.get.asInstanceOf[js.Any])
    if (labelLayout != null) __obj.updateDynamic("labelLayout")(labelLayout.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (widths != null) __obj.updateDynamic("widths")(widths.asInstanceOf[js.Any])
    __obj.asInstanceOf[labeledElement]
  }
}

