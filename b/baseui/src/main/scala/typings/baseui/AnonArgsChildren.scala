package typings.baseui

import typings.baseui.baseuiStrings.close
import typings.baseui.baseuiStrings.open
import typings.baseui.popoverMod.State
import typings.baseui.popoverMod.StateReducer
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgsChildren extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var content: js.UndefOr[ReactNode | (js.Function1[/* args */ AnonClose, ReactNode])] = js.undefined
  var dismissOnClickOutside: js.UndefOr[Boolean] = js.undefined
  var dismissOnEsc: js.UndefOr[Boolean] = js.undefined
  var initialState: js.UndefOr[State] = js.undefined
  var onClose: js.UndefOr[js.Function0[_]] = js.undefined
  var onOpen: js.UndefOr[js.Function0[_]] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}

object AnonArgsChildren {
  @scala.inline
  def apply(
    children: ReactNode = null,
    content: ReactNode | (js.Function1[/* args */ AnonClose, ReactNode]) = null,
    dismissOnClickOutside: js.UndefOr[Boolean] = js.undefined,
    dismissOnEsc: js.UndefOr[Boolean] = js.undefined,
    initialState: State = null,
    onClose: () => _ = null,
    onOpen: () => _ = null,
    stateReducer: (/* stateChangeType */ open | close, /* nextState */ State, /* currentState */ State) => State = null
  ): AnonArgsChildren = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissOnClickOutside)) __obj.updateDynamic("dismissOnClickOutside")(dismissOnClickOutside.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissOnEsc)) __obj.updateDynamic("dismissOnEsc")(dismissOnEsc.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3(stateReducer))
    __obj.asInstanceOf[AnonArgsChildren]
  }
}

