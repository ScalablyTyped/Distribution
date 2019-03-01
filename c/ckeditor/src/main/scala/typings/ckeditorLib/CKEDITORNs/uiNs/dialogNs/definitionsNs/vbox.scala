package typings
package ckeditorLib.CKEDITORNs.uiNs.dialogNs.definitionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait vbox extends js.Object {
  var align: js.UndefOr[java.lang.String] = js.undefined
  var expand: js.UndefOr[scala.Boolean] = js.undefined
  var heights: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var padding: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object vbox {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    expand: js.UndefOr[scala.Boolean] = js.undefined,
    heights: js.Array[java.lang.String] = null,
    padding: java.lang.String = null,
    width: java.lang.String = null
  ): vbox = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand)
    if (heights != null) __obj.updateDynamic("heights")(heights)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[vbox]
  }
}

