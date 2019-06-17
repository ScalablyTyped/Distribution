package typings
package baseuiLib.modalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalOverrides extends js.Object {
  var Backdrop: js.UndefOr[baseuiLib.Override[SharedStylePropsArg]] = js.undefined
  var Close: js.UndefOr[baseuiLib.Override[SharedStylePropsArg]] = js.undefined
  var Dialog: js.UndefOr[baseuiLib.Override[SharedStylePropsArg]] = js.undefined
  var DialogContainer: js.UndefOr[baseuiLib.Override[SharedStylePropsArg]] = js.undefined
  var Root: js.UndefOr[baseuiLib.Override[SharedStylePropsArg]] = js.undefined
}

object ModalOverrides {
  @scala.inline
  def apply(
    Backdrop: baseuiLib.Override[SharedStylePropsArg] = null,
    Close: baseuiLib.Override[SharedStylePropsArg] = null,
    Dialog: baseuiLib.Override[SharedStylePropsArg] = null,
    DialogContainer: baseuiLib.Override[SharedStylePropsArg] = null,
    Root: baseuiLib.Override[SharedStylePropsArg] = null
  ): ModalOverrides = {
    val __obj = js.Dynamic.literal()
    if (Backdrop != null) __obj.updateDynamic("Backdrop")(Backdrop.asInstanceOf[js.Any])
    if (Close != null) __obj.updateDynamic("Close")(Close.asInstanceOf[js.Any])
    if (Dialog != null) __obj.updateDynamic("Dialog")(Dialog.asInstanceOf[js.Any])
    if (DialogContainer != null) __obj.updateDynamic("DialogContainer")(DialogContainer.asInstanceOf[js.Any])
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalOverrides]
  }
}

