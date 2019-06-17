package typings
package baseuiLib.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutosizeInputOverrides extends js.Object {
  var Input: js.UndefOr[baseuiLib.Override[_]] = js.undefined
}

object AutosizeInputOverrides {
  @scala.inline
  def apply(Input: baseuiLib.Override[_] = null): AutosizeInputOverrides = {
    val __obj = js.Dynamic.literal()
    if (Input != null) __obj.updateDynamic("Input")(Input.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutosizeInputOverrides]
  }
}

