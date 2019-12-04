package typings.baseui.accordionMod

import typings.baseui.Anon_ExpandedBoolean
import typings.baseui.baseuiStrings.expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedStatefulPanelContainerProps extends js.Object {
  var initialState: js.UndefOr[PanelState] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* args */ Anon_ExpandedBoolean, _]] = js.undefined
  var stateReducer: js.UndefOr[StateReducer[PanelState]] = js.undefined
}

object SharedStatefulPanelContainerProps {
  @scala.inline
  def apply(
    initialState: PanelState = null,
    onChange: /* args */ Anon_ExpandedBoolean => _ = null,
    stateReducer: (expand, PanelState, PanelState) => PanelState = null
  ): SharedStatefulPanelContainerProps = {
    val __obj = js.Dynamic.literal()
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3(stateReducer))
    __obj.asInstanceOf[SharedStatefulPanelContainerProps]
  }
}

