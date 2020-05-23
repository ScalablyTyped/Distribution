package typings.blueprintjsCore.sliderMod

import typings.blueprintjsCore.intentMod.Intent
import typings.blueprintjsCore.multiSliderMod.ISliderBaseProps
import typings.react.mod.global.JSX.Element
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
    initialValue: js.UndefOr[Double] = js.undefined,
    intent: Intent = null,
    labelPrecision: js.UndefOr[Double] = js.undefined,
    labelRenderer: Boolean | (js.Function1[/* value */ Double, String | Element]) = null,
    labelStepSize: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    onChange: /* value */ Double => Unit = null,
    onRelease: /* value */ Double => Unit = null,
    showTrackFill: js.UndefOr[Boolean] = js.undefined,
    stepSize: js.UndefOr[Double] = js.undefined,
    value: js.UndefOr[Double] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): ISliderProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialValue)) __obj.updateDynamic("initialValue")(initialValue.get.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (!js.isUndefined(labelPrecision)) __obj.updateDynamic("labelPrecision")(labelPrecision.get.asInstanceOf[js.Any])
    if (labelRenderer != null) __obj.updateDynamic("labelRenderer")(labelRenderer.asInstanceOf[js.Any])
    if (!js.isUndefined(labelStepSize)) __obj.updateDynamic("labelStepSize")(labelStepSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onRelease != null) __obj.updateDynamic("onRelease")(js.Any.fromFunction1(onRelease))
    if (!js.isUndefined(showTrackFill)) __obj.updateDynamic("showTrackFill")(showTrackFill.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stepSize)) __obj.updateDynamic("stepSize")(stepSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISliderProps]
  }
}

