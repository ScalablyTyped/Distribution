package typings.atBlueprintjsCore.libEsmComponentsSliderSliderMod

import typings.atBlueprintjsCore.libEsmComponentsSliderMultiSliderMod.ISliderBaseProps
import typings.react.reactMod.Global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISliderProps extends ISliderBaseProps {
  /**
    * Initial value of the slider. This determines the other end of the
    * track fill: from `initialValue` to `value`.
    * @default 0
    */
  var initialValue: js.UndefOr[Double] = js.undefined
  /** Callback invoked when the value changes. */
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  /** Callback invoked when the handle is released. */
  var onRelease: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  /**
    * Value of slider.
    * @default 0
    */
  var value: js.UndefOr[Double] = js.undefined
}

object ISliderProps {
  @scala.inline
  def apply(
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    initialValue: Int | Double = null,
    labelPrecision: Int | Double = null,
    labelRenderer: Boolean | (js.Function1[/* value */ Double, String | Element]) = null,
    labelStepSize: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onChange: /* value */ Double => Unit = null,
    onRelease: /* value */ Double => Unit = null,
    showTrackFill: js.UndefOr[Boolean] = js.undefined,
    stepSize: Int | Double = null,
    value: Int | Double = null,
    vertical: js.UndefOr[Boolean] = js.undefined
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
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onRelease != null) __obj.updateDynamic("onRelease")(js.Any.fromFunction1(onRelease))
    if (!js.isUndefined(showTrackFill)) __obj.updateDynamic("showTrackFill")(showTrackFill)
    if (stepSize != null) __obj.updateDynamic("stepSize")(stepSize.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[ISliderProps]
  }
}

