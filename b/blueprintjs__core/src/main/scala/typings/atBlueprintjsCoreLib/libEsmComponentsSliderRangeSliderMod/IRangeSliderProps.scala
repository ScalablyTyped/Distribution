package typings
package atBlueprintjsCoreLib.libEsmComponentsSliderRangeSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRangeSliderProps
  extends atBlueprintjsCoreLib.libEsmComponentsSliderMultiSliderMod.ISliderBaseProps {
  /** Callback invoked when the range value changes. */
  var onChange: js.UndefOr[js.Function1[/* value */ NumberRange, scala.Unit]] = js.undefined
  /** Callback invoked when a handle is released. */
  var onRelease: js.UndefOr[js.Function1[/* value */ NumberRange, scala.Unit]] = js.undefined
  /**
    * Range value of slider. Handles will be rendered at each position in the range.
    * @default [0, 10]
    */
  var value: js.UndefOr[NumberRange] = js.undefined
}

object IRangeSliderProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    labelPrecision: scala.Int | scala.Double = null,
    labelRenderer: scala.Boolean | (js.Function1[
      /* value */ scala.Double, 
      java.lang.String | reactLib.reactMod.Global.JSXNs.Element
    ]) = null,
    labelStepSize: scala.Int | scala.Double = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    onChange: js.Function1[/* value */ NumberRange, scala.Unit] = null,
    onRelease: js.Function1[/* value */ NumberRange, scala.Unit] = null,
    showTrackFill: js.UndefOr[scala.Boolean] = js.undefined,
    stepSize: scala.Int | scala.Double = null,
    value: NumberRange = null,
    vertical: js.UndefOr[scala.Boolean] = js.undefined
  ): IRangeSliderProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (labelPrecision != null) __obj.updateDynamic("labelPrecision")(labelPrecision.asInstanceOf[js.Any])
    if (labelRenderer != null) __obj.updateDynamic("labelRenderer")(labelRenderer.asInstanceOf[js.Any])
    if (labelStepSize != null) __obj.updateDynamic("labelStepSize")(labelStepSize.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onRelease != null) __obj.updateDynamic("onRelease")(onRelease)
    if (!js.isUndefined(showTrackFill)) __obj.updateDynamic("showTrackFill")(showTrackFill)
    if (stepSize != null) __obj.updateDynamic("stepSize")(stepSize.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[IRangeSliderProps]
  }
}

