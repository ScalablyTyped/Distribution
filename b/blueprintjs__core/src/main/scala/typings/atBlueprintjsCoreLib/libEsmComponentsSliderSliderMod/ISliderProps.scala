package typings
package atBlueprintjsCoreLib.libEsmComponentsSliderSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISliderProps
  extends atBlueprintjsCoreLib.libEsmComponentsSliderMultiSliderMod.ISliderBaseProps {
  /**
    * Initial value of the slider. This determines the other end of the
    * track fill: from `initialValue` to `value`.
    * @default 0
    */
  var initialValue: js.UndefOr[scala.Double] = js.undefined
  /** Callback invoked when the value changes. */
  var onChange: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  /** Callback invoked when the handle is released. */
  var onRelease: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  /**
    * Value of slider.
    * @default 0
    */
  var value: js.UndefOr[scala.Double] = js.undefined
}

object ISliderProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    initialValue: scala.Int | scala.Double = null,
    labelPrecision: scala.Int | scala.Double = null,
    labelRenderer: scala.Boolean | (js.Function1[
      /* value */ scala.Double, 
      java.lang.String | reactLib.reactMod.Global.JSXNs.Element
    ]) = null,
    labelStepSize: scala.Int | scala.Double = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    onChange: js.Function1[/* value */ scala.Double, scala.Unit] = null,
    onRelease: js.Function1[/* value */ scala.Double, scala.Unit] = null,
    showTrackFill: js.UndefOr[scala.Boolean] = js.undefined,
    stepSize: scala.Int | scala.Double = null,
    value: scala.Int | scala.Double = null,
    vertical: js.UndefOr[scala.Boolean] = js.undefined
  ): ISliderProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue.asInstanceOf[js.Any])
    if (labelPrecision != null) __obj.updateDynamic("labelPrecision")(labelPrecision.asInstanceOf[js.Any])
    if (labelRenderer != null) __obj.updateDynamic("labelRenderer")(labelRenderer.asInstanceOf[js.Any])
    if (labelStepSize != null) __obj.updateDynamic("labelStepSize")(labelStepSize.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onRelease != null) __obj.updateDynamic("onRelease")(onRelease)
    if (!js.isUndefined(showTrackFill)) __obj.updateDynamic("showTrackFill")(showTrackFill)
    if (stepSize != null) __obj.updateDynamic("stepSize")(stepSize.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[ISliderProps]
  }
}

