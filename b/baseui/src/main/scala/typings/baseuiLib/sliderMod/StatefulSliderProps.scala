package typings
package baseuiLib.sliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulSliderProps extends js.Object {
  var initialState: js.UndefOr[State] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ State, _]] = js.undefined
  var overrides: js.UndefOr[SliderOverrides] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
}

object StatefulSliderProps {
  @scala.inline
  def apply(
    initialState: State = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    onChange: /* e */ State => _ = null,
    overrides: SliderOverrides = null,
    step: scala.Int | scala.Double = null
  ): StatefulSliderProps = {
    val __obj = js.Dynamic.literal()
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulSliderProps]
  }
}

