package typings
package ckeditorLib.CKEDITORNs.uiNs.dialogNs.definitionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait select extends js.Object {
  var default: js.Any
  var items: js.Array[(js.Tuple2[java.lang.String, java.lang.String]) | js.Array[java.lang.String]]
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var validate: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
}

object select {
  @scala.inline
  def apply(
    default: js.Any,
    items: js.Array[(js.Tuple2[java.lang.String, java.lang.String]) | js.Array[java.lang.String]],
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    size: scala.Int | scala.Double = null,
    validate: js.Function0[scala.Boolean] = null
  ): select = {
    val __obj = js.Dynamic.literal(default = default, items = items)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[select]
  }
}

