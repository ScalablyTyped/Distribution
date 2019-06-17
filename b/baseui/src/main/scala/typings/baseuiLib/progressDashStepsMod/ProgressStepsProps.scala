package typings
package baseuiLib.progressDashStepsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressStepsProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var current: js.UndefOr[scala.Double] = js.undefined
  var overrides: js.UndefOr[ProgressStepsOverrides] = js.undefined
}

object ProgressStepsProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    current: scala.Int | scala.Double = null,
    overrides: ProgressStepsOverrides = null
  ): ProgressStepsProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    __obj.asInstanceOf[ProgressStepsProps]
  }
}

