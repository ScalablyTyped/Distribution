package typings
package baseuiLib.buttonDashGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonGroupOverrides extends js.Object {
  var Root: js.UndefOr[baseuiLib.Override[_]] = js.undefined
}

object ButtonGroupOverrides {
  @scala.inline
  def apply(Root: baseuiLib.Override[_] = null): ButtonGroupOverrides = {
    val __obj = js.Dynamic.literal()
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonGroupOverrides]
  }
}

