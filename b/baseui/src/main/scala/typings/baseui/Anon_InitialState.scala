package typings.baseui

import typings.baseui.selectMod.State
import typings.baseui.selectMod.StateReducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InitialState extends js.Object {
  var initialState: js.UndefOr[State] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}

object Anon_InitialState {
  @scala.inline
  def apply(
    initialState: State = null,
    stateReducer: (/* stateType */ String, /* nextState */ State, /* currentState */ State) => State = null
  ): Anon_InitialState = {
    val __obj = js.Dynamic.literal()
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3(stateReducer))
    __obj.asInstanceOf[Anon_InitialState]
  }
}

