package typings
package ckeditorLib.CKEDITORNs.uiNs.dialogNs.definitionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hbox extends js.Object {
  var align: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[java.lang.String] = js.undefined
  var padding: js.UndefOr[java.lang.String] = js.undefined
  var widths: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object hbox {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    height: java.lang.String = null,
    padding: java.lang.String = null,
    widths: js.Array[java.lang.String] = null
  ): hbox = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (height != null) __obj.updateDynamic("height")(height)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (widths != null) __obj.updateDynamic("widths")(widths)
    __obj.asInstanceOf[hbox]
  }
}

