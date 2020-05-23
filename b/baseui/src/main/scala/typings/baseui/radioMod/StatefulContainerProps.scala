package typings.baseui.radioMod

import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulContainerProps extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var initialState: js.UndefOr[State] = js.undefined
  var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
  var overrides: js.UndefOr[RadioOverrides with RadioGroupOverrides] = js.undefined
  var stateReducer: StateReducer
}

object StatefulContainerProps {
  @scala.inline
  def apply(
    stateReducer: (/* stateType */ String, /* nextState */ State, /* currentState */ State, /* event */ SyntheticEvent[HTMLInputElement, Event]) => State,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    initialState: State = null,
    onChange: ChangeEvent[HTMLInputElement] => Unit = null,
    overrides: RadioOverrides with RadioGroupOverrides = null
  ): StatefulContainerProps = {
    val __obj = js.Dynamic.literal(stateReducer = js.Any.fromFunction4(stateReducer))
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulContainerProps]
  }
}

