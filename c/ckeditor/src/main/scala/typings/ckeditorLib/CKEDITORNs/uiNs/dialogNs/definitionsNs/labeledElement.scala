package typings
package ckeditorLib.CKEDITORNs.uiNs.dialogNs.definitionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait labeledElement extends js.Object {
  var includeLabel: js.UndefOr[scala.Boolean] = js.undefined
  var label: java.lang.String
  var labelLayout: js.UndefOr[
    ckeditorLib.ckeditorLibStrings.horizontal | ckeditorLib.ckeditorLibStrings.vertical
  ] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var widths: js.UndefOr[js.Tuple2[java.lang.String, java.lang.String]] = js.undefined
}

object labeledElement {
  @scala.inline
  def apply(
    label: java.lang.String,
    includeLabel: js.UndefOr[scala.Boolean] = js.undefined,
    labelLayout: ckeditorLib.ckeditorLibStrings.horizontal | ckeditorLib.ckeditorLibStrings.vertical = null,
    role: java.lang.String = null,
    widths: js.Tuple2[java.lang.String, java.lang.String] = null
  ): labeledElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("label")(label)
    if (!js.isUndefined(includeLabel)) __obj.updateDynamic("includeLabel")(includeLabel)
    if (labelLayout != null) __obj.updateDynamic("labelLayout")(labelLayout.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role)
    if (widths != null) __obj.updateDynamic("widths")(widths)
    __obj.asInstanceOf[labeledElement]
  }
}

