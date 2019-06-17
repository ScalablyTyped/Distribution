package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsChildren extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var content: js.UndefOr[
    reactLib.reactMod.ReactNode | (js.Function1[/* args */ Anon_Close, reactLib.reactMod.ReactNode])
  ] = js.undefined
  var dismissOnClickOutside: js.UndefOr[scala.Boolean] = js.undefined
  var dismissOnEsc: js.UndefOr[scala.Boolean] = js.undefined
  var initialState: js.UndefOr[baseuiLib.popoverMod.State] = js.undefined
  var onClose: js.UndefOr[js.Function0[_]] = js.undefined
  var onOpen: js.UndefOr[js.Function0[_]] = js.undefined
  var stateReducer: js.UndefOr[baseuiLib.popoverMod.StateReducer] = js.undefined
}

object Anon_ArgsChildren {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    content: reactLib.reactMod.ReactNode | (js.Function1[/* args */ Anon_Close, reactLib.reactMod.ReactNode]) = null,
    dismissOnClickOutside: js.UndefOr[scala.Boolean] = js.undefined,
    dismissOnEsc: js.UndefOr[scala.Boolean] = js.undefined,
    initialState: baseuiLib.popoverMod.State = null,
    onClose: () => _ = null,
    onOpen: () => _ = null,
    stateReducer: baseuiLib.popoverMod.StateReducer = null
  ): Anon_ArgsChildren = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissOnClickOutside)) __obj.updateDynamic("dismissOnClickOutside")(dismissOnClickOutside)
    if (!js.isUndefined(dismissOnEsc)) __obj.updateDynamic("dismissOnEsc")(dismissOnEsc)
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(stateReducer)
    __obj.asInstanceOf[Anon_ArgsChildren]
  }
}

