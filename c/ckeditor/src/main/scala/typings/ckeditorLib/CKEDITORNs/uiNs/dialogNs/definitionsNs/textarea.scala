package typings
package ckeditorLib.CKEDITORNs.uiNs.dialogNs.definitionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait textarea extends js.Object {
  var cols: js.UndefOr[scala.Double] = js.undefined
  var default: js.UndefOr[java.lang.String] = js.undefined
  var rows: js.UndefOr[scala.Double] = js.undefined
  var validate: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
}

object textarea {
  @scala.inline
  def apply(
    cols: scala.Int | scala.Double = null,
    default: java.lang.String = null,
    rows: scala.Int | scala.Double = null,
    validate: js.Function0[scala.Boolean] = null
  ): textarea = {
    val __obj = js.Dynamic.literal()
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[textarea]
  }
}

