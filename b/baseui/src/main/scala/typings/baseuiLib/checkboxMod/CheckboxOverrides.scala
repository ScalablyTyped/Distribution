package typings
package baseuiLib.checkboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxOverrides extends js.Object {
  var Checkmark: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Input: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Label: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Root: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Toggle: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var ToggleInner: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var ToggleTrack: js.UndefOr[baseuiLib.Override[_]] = js.undefined
}

object CheckboxOverrides {
  @scala.inline
  def apply(
    Checkmark: baseuiLib.Override[_] = null,
    Input: baseuiLib.Override[_] = null,
    Label: baseuiLib.Override[_] = null,
    Root: baseuiLib.Override[_] = null,
    Toggle: baseuiLib.Override[_] = null,
    ToggleInner: baseuiLib.Override[_] = null,
    ToggleTrack: baseuiLib.Override[_] = null
  ): CheckboxOverrides = {
    val __obj = js.Dynamic.literal()
    if (Checkmark != null) __obj.updateDynamic("Checkmark")(Checkmark.asInstanceOf[js.Any])
    if (Input != null) __obj.updateDynamic("Input")(Input.asInstanceOf[js.Any])
    if (Label != null) __obj.updateDynamic("Label")(Label.asInstanceOf[js.Any])
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    if (Toggle != null) __obj.updateDynamic("Toggle")(Toggle.asInstanceOf[js.Any])
    if (ToggleInner != null) __obj.updateDynamic("ToggleInner")(ToggleInner.asInstanceOf[js.Any])
    if (ToggleTrack != null) __obj.updateDynamic("ToggleTrack")(ToggleTrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxOverrides]
  }
}

