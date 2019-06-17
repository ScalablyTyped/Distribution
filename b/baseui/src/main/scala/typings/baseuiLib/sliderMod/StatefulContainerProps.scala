package typings
package baseuiLib.sliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulContainerProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var initialState: js.UndefOr[State] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ State, _]] = js.undefined
  var overrides: js.UndefOr[SliderOverrides] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
}

object StatefulContainerProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    initialState: State = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    onChange: /* e */ State => _ = null,
    overrides: SliderOverrides = null,
    stateReducer: StateReducer = null,
    step: scala.Int | scala.Double = null
  ): StatefulContainerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(stateReducer)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulContainerProps]
  }
}

