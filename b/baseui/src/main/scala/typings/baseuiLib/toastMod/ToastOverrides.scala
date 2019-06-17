package typings
package baseuiLib.toastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastOverrides extends js.Object {
  var Body: js.UndefOr[baseuiLib.Override[SharedStylePropsArg]] = js.undefined
  var CloseIcon: js.UndefOr[baseuiLib.Override[SharedStylePropsArg]] = js.undefined
}

object ToastOverrides {
  @scala.inline
  def apply(
    Body: baseuiLib.Override[SharedStylePropsArg] = null,
    CloseIcon: baseuiLib.Override[SharedStylePropsArg] = null
  ): ToastOverrides = {
    val __obj = js.Dynamic.literal()
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (CloseIcon != null) __obj.updateDynamic("CloseIcon")(CloseIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastOverrides]
  }
}

