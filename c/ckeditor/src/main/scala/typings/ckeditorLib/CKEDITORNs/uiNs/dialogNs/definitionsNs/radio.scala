package typings
package ckeditorLib.CKEDITORNs.uiNs.dialogNs.definitionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait radio extends js.Object {
  var default: js.Any
  var items: js.Array[(js.Tuple2[java.lang.String, java.lang.String]) | js.Array[java.lang.String]]
  var validate: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
}

object radio {
  @scala.inline
  def apply(
    default: js.Any,
    items: js.Array[(js.Tuple2[java.lang.String, java.lang.String]) | js.Array[java.lang.String]],
    validate: js.Function0[scala.Boolean] = null
  ): radio = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("default")(default)
    __obj.updateDynamic("items")(items)
    if (validate != null) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[radio]
  }
}

