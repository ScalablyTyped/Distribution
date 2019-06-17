package typings
package baseuiLib.formDashControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormControlOverrides extends js.Object {
  var Caption: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var ControlContainer: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Label: js.UndefOr[baseuiLib.Override[_]] = js.undefined
}

object FormControlOverrides {
  @scala.inline
  def apply(
    Caption: baseuiLib.Override[_] = null,
    ControlContainer: baseuiLib.Override[_] = null,
    Label: baseuiLib.Override[_] = null
  ): FormControlOverrides = {
    val __obj = js.Dynamic.literal()
    if (Caption != null) __obj.updateDynamic("Caption")(Caption.asInstanceOf[js.Any])
    if (ControlContainer != null) __obj.updateDynamic("ControlContainer")(ControlContainer.asInstanceOf[js.Any])
    if (Label != null) __obj.updateDynamic("Label")(Label.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormControlOverrides]
  }
}

