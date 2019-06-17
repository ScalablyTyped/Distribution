package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InitialState extends js.Object {
  var initialState: js.UndefOr[baseuiLib.selectMod.State] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* params */ baseuiLib.selectMod.OnChangeParams, _]] = js.undefined
  var stateReducer: js.UndefOr[baseuiLib.selectMod.StateReducer] = js.undefined
}

object Anon_InitialState {
  @scala.inline
  def apply(
    initialState: baseuiLib.selectMod.State = null,
    onChange: /* params */ baseuiLib.selectMod.OnChangeParams => _ = null,
    stateReducer: baseuiLib.selectMod.StateReducer = null
  ): Anon_InitialState = {
    val __obj = js.Dynamic.literal()
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(stateReducer)
    __obj.asInstanceOf[Anon_InitialState]
  }
}

