package typings
package baseuiLib.progressDashStepsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberedStepProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var isActive: js.UndefOr[scala.Boolean] = js.undefined
  var isCompleted: js.UndefOr[scala.Boolean] = js.undefined
  var isLast: js.UndefOr[scala.Boolean] = js.undefined
  var overrides: js.UndefOr[NumberedStepOverrides] = js.undefined
  var step: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object NumberedStepProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    isActive: js.UndefOr[scala.Boolean] = js.undefined,
    isCompleted: js.UndefOr[scala.Boolean] = js.undefined,
    isLast: js.UndefOr[scala.Boolean] = js.undefined,
    overrides: NumberedStepOverrides = null,
    step: reactLib.reactMod.ReactNode = null,
    title: java.lang.String = null
  ): NumberedStepProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive)
    if (!js.isUndefined(isCompleted)) __obj.updateDynamic("isCompleted")(isCompleted)
    if (!js.isUndefined(isLast)) __obj.updateDynamic("isLast")(isLast)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[NumberedStepProps]
  }
}

