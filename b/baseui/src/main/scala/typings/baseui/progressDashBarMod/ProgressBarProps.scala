package typings.baseui.progressDashBarMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBarProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var getProgressLabel: js.UndefOr[js.Function2[/* value */ Double, /* successValue */ Double, ReactNode]] = js.undefined
  var overrides: js.UndefOr[ProgressBarOverrides] = js.undefined
  var showLabel: js.UndefOr[Boolean] = js.undefined
  var successValue: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object ProgressBarProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    getProgressLabel: (/* value */ Double, /* successValue */ Double) => ReactNode = null,
    overrides: ProgressBarOverrides = null,
    showLabel: js.UndefOr[Boolean] = js.undefined,
    successValue: Int | Double = null,
    value: Int | Double = null
  ): ProgressBarProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (getProgressLabel != null) __obj.updateDynamic("getProgressLabel")(js.Any.fromFunction2(getProgressLabel))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(showLabel)) __obj.updateDynamic("showLabel")(showLabel.asInstanceOf[js.Any])
    if (successValue != null) __obj.updateDynamic("successValue")(successValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarProps]
  }
}

