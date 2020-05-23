package typings.baseui.progressBarMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBarProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var getProgressLabel: js.UndefOr[js.Function2[/* value */ Double, /* successValue */ Double, ReactNode]] = js.undefined
  var infinite: js.UndefOr[Boolean] = js.undefined
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
    infinite: js.UndefOr[Boolean] = js.undefined,
    overrides: ProgressBarOverrides = null,
    showLabel: js.UndefOr[Boolean] = js.undefined,
    successValue: js.UndefOr[Double] = js.undefined,
    value: js.UndefOr[Double] = js.undefined
  ): ProgressBarProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (getProgressLabel != null) __obj.updateDynamic("getProgressLabel")(js.Any.fromFunction2(getProgressLabel))
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite.get.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(showLabel)) __obj.updateDynamic("showLabel")(showLabel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(successValue)) __obj.updateDynamic("successValue")(successValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarProps]
  }
}

