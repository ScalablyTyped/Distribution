package typings
package baseuiLib.progressDashBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBarOverrides extends js.Object {
  var Bar: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var BarProgress: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Label: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Root: js.UndefOr[baseuiLib.Override[_]] = js.undefined
}

object ProgressBarOverrides {
  @scala.inline
  def apply(
    Bar: baseuiLib.Override[_] = null,
    BarProgress: baseuiLib.Override[_] = null,
    Label: baseuiLib.Override[_] = null,
    Root: baseuiLib.Override[_] = null
  ): ProgressBarOverrides = {
    val __obj = js.Dynamic.literal()
    if (Bar != null) __obj.updateDynamic("Bar")(Bar.asInstanceOf[js.Any])
    if (BarProgress != null) __obj.updateDynamic("BarProgress")(BarProgress.asInstanceOf[js.Any])
    if (Label != null) __obj.updateDynamic("Label")(Label.asInstanceOf[js.Any])
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarOverrides]
  }
}

