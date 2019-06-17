package typings
package baseuiLib.progressDashStepsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var isActive: js.UndefOr[scala.Boolean] = js.undefined
  var isCompleted: js.UndefOr[scala.Boolean] = js.undefined
  var isLast: js.UndefOr[scala.Boolean] = js.undefined
  var overrides: js.UndefOr[StepOverrides] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object StepProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    isActive: js.UndefOr[scala.Boolean] = js.undefined,
    isCompleted: js.UndefOr[scala.Boolean] = js.undefined,
    isLast: js.UndefOr[scala.Boolean] = js.undefined,
    overrides: StepOverrides = null,
    title: reactLib.reactMod.ReactNode = null
  ): StepProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive)
    if (!js.isUndefined(isCompleted)) __obj.updateDynamic("isCompleted")(isCompleted)
    if (!js.isUndefined(isLast)) __obj.updateDynamic("isLast")(isLast)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepProps]
  }
}

