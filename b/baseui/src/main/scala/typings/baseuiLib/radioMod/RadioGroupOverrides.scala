package typings
package baseuiLib.radioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioGroupOverrides extends js.Object {
  var RadioGroupRoot: js.UndefOr[baseuiLib.Override[_]] = js.undefined
}

object RadioGroupOverrides {
  @scala.inline
  def apply(RadioGroupRoot: baseuiLib.Override[_] = null): RadioGroupOverrides = {
    val __obj = js.Dynamic.literal()
    if (RadioGroupRoot != null) __obj.updateDynamic("RadioGroupRoot")(RadioGroupRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioGroupOverrides]
  }
}

