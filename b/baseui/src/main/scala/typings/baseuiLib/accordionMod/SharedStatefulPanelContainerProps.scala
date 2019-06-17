package typings
package baseuiLib.accordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedStatefulPanelContainerProps extends js.Object {
  var initialState: js.UndefOr[PanelState] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* args */ baseuiLib.Anon_ExpandedBoolean, _]] = js.undefined
  var stateReducer: js.UndefOr[StateReducer[PanelState]] = js.undefined
}

object SharedStatefulPanelContainerProps {
  @scala.inline
  def apply(
    initialState: PanelState = null,
    onChange: /* args */ baseuiLib.Anon_ExpandedBoolean => _ = null,
    stateReducer: StateReducer[PanelState] = null
  ): SharedStatefulPanelContainerProps = {
    val __obj = js.Dynamic.literal()
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(stateReducer)
    __obj.asInstanceOf[SharedStatefulPanelContainerProps]
  }
}

