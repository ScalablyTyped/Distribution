package typings
package baseuiLib.inputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseInputOverrides extends js.Object {
  var After: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Before: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Input: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var InputContainer: js.UndefOr[baseuiLib.Override[_]] = js.undefined
}

object BaseInputOverrides {
  @scala.inline
  def apply(
    After: baseuiLib.Override[_] = null,
    Before: baseuiLib.Override[_] = null,
    Input: baseuiLib.Override[_] = null,
    InputContainer: baseuiLib.Override[_] = null
  ): BaseInputOverrides = {
    val __obj = js.Dynamic.literal()
    if (After != null) __obj.updateDynamic("After")(After.asInstanceOf[js.Any])
    if (Before != null) __obj.updateDynamic("Before")(Before.asInstanceOf[js.Any])
    if (Input != null) __obj.updateDynamic("Input")(Input.asInstanceOf[js.Any])
    if (InputContainer != null) __obj.updateDynamic("InputContainer")(InputContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseInputOverrides]
  }
}

