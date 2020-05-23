package typings.blueprintjsCore.multiSliderMod

import typings.blueprintjsCore.intentMod.Intent
import typings.blueprintjsCore.propsMod.IIntentProps
import typings.blueprintjsCore.propsMod.IProps
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISliderBaseProps
  extends IProps
     with IIntentProps {
  /**
    * Whether the slider is non-interactive.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Number of decimal places to use when rendering label value. Default value is the number of
    * decimals used in the `stepSize` prop. This prop has _no effect_ if you supply a custom
    * `labelRenderer` callback.
    * @default inferred from stepSize
    */
  var labelPrecision: js.UndefOr[Double] = js.undefined
  /**
    * Callback to render a single label. Useful for formatting numbers as currency or percentages.
    * If `true`, labels will use number value formatted to `labelPrecision` decimal places.
    * If `false`, labels will not be shown.
    * @default true
    */
  var labelRenderer: js.UndefOr[Boolean | (js.Function1[/* value */ Double, String | Element])] = js.undefined
  /**
    * Increment between successive labels. Must be greater than zero.
    * @default 1
    */
  var labelStepSize: js.UndefOr[Double] = js.undefined
  /**
    * Maximum value of the slider.
    * @default 10
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * Minimum value of the slider.
    * @default 0
    */
  var min: js.UndefOr[Double] = js.undefined
  /**
    * Whether a solid bar should be rendered on the track between current and initial values,
    * or between handles for `RangeSlider`.
    * @default true
    */
  var showTrackFill: js.UndefOr[Boolean] = js.undefined
  /**
    * Increment between successive values; amount by which the handle moves. Must be greater than zero.
    * @default 1
    */
  var stepSize: js.UndefOr[Double] = js.undefined
  /**
    * Whether to show the slider in a vertical orientation.
    * @default false
    */
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object ISliderBaseProps {
  @scala.inline
  def apply(
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    intent: Intent = null,
    labelPrecision: js.UndefOr[Double] = js.undefined,
    labelRenderer: Boolean | (js.Function1[/* value */ Double, String | Element]) = null,
    labelStepSize: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    showTrackFill: js.UndefOr[Boolean] = js.undefined,
    stepSize: js.UndefOr[Double] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): ISliderBaseProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (!js.isUndefined(labelPrecision)) __obj.updateDynamic("labelPrecision")(labelPrecision.get.asInstanceOf[js.Any])
    if (labelRenderer != null) __obj.updateDynamic("labelRenderer")(labelRenderer.asInstanceOf[js.Any])
    if (!js.isUndefined(labelStepSize)) __obj.updateDynamic("labelStepSize")(labelStepSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTrackFill)) __obj.updateDynamic("showTrackFill")(showTrackFill.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stepSize)) __obj.updateDynamic("stepSize")(stepSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISliderBaseProps]
  }
}

