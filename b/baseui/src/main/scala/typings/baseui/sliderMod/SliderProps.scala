package typings.baseui.sliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ State, _]] = js.undefined
  var onFinalChange: js.UndefOr[js.Function1[/* e */ State, _]] = js.undefined
  var overrides: js.UndefOr[SliderOverrides] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var value: js.Array[Double]
}

object SliderProps {
  @scala.inline
  def apply(
    value: js.Array[Double],
    disabled: js.UndefOr[Boolean] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    onChange: /* e */ State => _ = null,
    onFinalChange: /* e */ State => _ = null,
    overrides: SliderOverrides = null,
    step: js.UndefOr[Double] = js.undefined
  ): SliderProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFinalChange != null) __obj.updateDynamic("onFinalChange")(js.Any.fromFunction1(onFinalChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderProps]
  }
}

