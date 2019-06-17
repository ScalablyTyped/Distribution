package typings
package baseuiLib.toastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToasterOverrides extends js.Object {
  var Root: js.UndefOr[baseuiLib.Override[ToasterSharedStylePropsArg]] = js.undefined
  var ToastBody: js.UndefOr[baseuiLib.Override[SharedStylePropsArg]] = js.undefined
  var ToastCloseIcon: js.UndefOr[baseuiLib.Override[SharedStylePropsArg]] = js.undefined
}

object ToasterOverrides {
  @scala.inline
  def apply(
    Root: baseuiLib.Override[ToasterSharedStylePropsArg] = null,
    ToastBody: baseuiLib.Override[SharedStylePropsArg] = null,
    ToastCloseIcon: baseuiLib.Override[SharedStylePropsArg] = null
  ): ToasterOverrides = {
    val __obj = js.Dynamic.literal()
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    if (ToastBody != null) __obj.updateDynamic("ToastBody")(ToastBody.asInstanceOf[js.Any])
    if (ToastCloseIcon != null) __obj.updateDynamic("ToastCloseIcon")(ToastCloseIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToasterOverrides]
  }
}

