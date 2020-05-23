package typings.blueprintjsCore.multiSliderMod

import typings.blueprintjsCore.intentMod.Intent
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMultiSliderProps extends ISliderBaseProps {
  /** Default intent of a track segment, used only if no handle specifies `intentBefore/After`. */
  var defaultTrackIntent: js.UndefOr[Intent] = js.undefined
  /** Callback invoked when a handle value changes. Receives handle values in sorted order. */
  var onChange: js.UndefOr[js.Function1[/* values */ js.Array[Double], Unit]] = js.undefined
  /** Callback invoked when a handle is released. Receives handle values in sorted order. */
  var onRelease: js.UndefOr[js.Function1[/* values */ js.Array[Double], Unit]] = js.undefined
}

object IMultiSliderProps {
  @scala.inline
  def apply(
    className: String = null,
    defaultTrackIntent: Intent = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    intent: Intent = null,
    labelPrecision: js.UndefOr[Double] = js.undefined,
    labelRenderer: Boolean | (js.Function1[/* value */ Double, String | Element]) = null,
    labelStepSize: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    onChange: /* values */ js.Array[Double] => Unit = null,
    onRelease: /* values */ js.Array[Double] => Unit = null,
    showTrackFill: js.UndefOr[Boolean] = js.undefined,
    stepSize: js.UndefOr[Double] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): IMultiSliderProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultTrackIntent != null) __obj.updateDynamic("defaultTrackIntent")(defaultTrackIntent.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
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
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMultiSliderProps]
  }
}

