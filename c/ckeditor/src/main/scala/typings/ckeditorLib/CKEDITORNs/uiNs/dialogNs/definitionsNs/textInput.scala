package typings
package ckeditorLib.CKEDITORNs.uiNs.dialogNs.definitionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait textInput extends js.Object {
  var default: js.UndefOr[java.lang.String] = js.undefined
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var validate: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
}

object textInput {
  @scala.inline
  def apply(
    default: java.lang.String = null,
    maxLength: scala.Int | scala.Double = null,
    size: java.lang.String = null,
    validate: js.Function0[scala.Boolean] = null
  ): textInput = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    if (validate != null) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[textInput]
  }
}

