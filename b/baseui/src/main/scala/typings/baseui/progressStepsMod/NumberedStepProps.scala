package typings.baseui.progressStepsMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberedStepProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var isActive: js.UndefOr[Boolean] = js.undefined
  var isCompleted: js.UndefOr[Boolean] = js.undefined
  var isLast: js.UndefOr[Boolean] = js.undefined
  var overrides: js.UndefOr[NumberedStepOverrides] = js.undefined
  var step: js.UndefOr[ReactNode] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object NumberedStepProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    isActive: js.UndefOr[Boolean] = js.undefined,
    isCompleted: js.UndefOr[Boolean] = js.undefined,
    isLast: js.UndefOr[Boolean] = js.undefined,
    overrides: NumberedStepOverrides = null,
    step: ReactNode = null,
    title: String = null
  ): NumberedStepProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isCompleted)) __obj.updateDynamic("isCompleted")(isCompleted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isLast)) __obj.updateDynamic("isLast")(isLast.get.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberedStepProps]
  }
}

