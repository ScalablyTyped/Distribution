package typings.baseui

import typings.baseui.baseuiStrings.change_
import typings.baseui.tabsMod.State
import typings.baseui.tabsMod.StateReducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InitialStateRenderAll extends js.Object {
  var initialState: js.UndefOr[State] = js.undefined
  var renderAll: js.UndefOr[Boolean] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}

object Anon_InitialStateRenderAll {
  @scala.inline
  def apply(
    initialState: State = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    stateReducer: (change_, /* nextState */ State, /* currentState */ State) => State = null
  ): Anon_InitialStateRenderAll = {
    val __obj = js.Dynamic.literal()
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3(stateReducer))
    __obj.asInstanceOf[Anon_InitialStateRenderAll]
  }
}

