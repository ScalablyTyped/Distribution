package typings
package baseuiLib.progressDashBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBarProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var getProgressLabel: js.UndefOr[
    js.Function2[
      /* value */ scala.Double, 
      /* successValue */ scala.Double, 
      reactLib.reactMod.ReactNode
    ]
  ] = js.undefined
  var overrides: js.UndefOr[ProgressBarOverrides] = js.undefined
  var showLabel: js.UndefOr[scala.Boolean] = js.undefined
  var successValue: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object ProgressBarProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    getProgressLabel: (/* value */ scala.Double, /* successValue */ scala.Double) => reactLib.reactMod.ReactNode = null,
    overrides: ProgressBarOverrides = null,
    showLabel: js.UndefOr[scala.Boolean] = js.undefined,
    successValue: scala.Int | scala.Double = null,
    value: scala.Int | scala.Double = null
  ): ProgressBarProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (getProgressLabel != null) __obj.updateDynamic("getProgressLabel")(js.Any.fromFunction2(getProgressLabel))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (!js.isUndefined(showLabel)) __obj.updateDynamic("showLabel")(showLabel)
    if (successValue != null) __obj.updateDynamic("successValue")(successValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarProps]
  }
}

