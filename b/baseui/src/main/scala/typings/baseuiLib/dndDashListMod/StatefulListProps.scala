package typings
package baseuiLib.dndDashListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulListProps extends js.Object {
  var initialState: js.UndefOr[State] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* params */ baseuiLib.Anon_NewIndex, _]] = js.undefined
  var overrides: js.UndefOr[ListOverrides] = js.undefined
  var removable: js.UndefOr[scala.Boolean] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}

object StatefulListProps {
  @scala.inline
  def apply(
    initialState: State = null,
    onChange: /* params */ baseuiLib.Anon_NewIndex => _ = null,
    overrides: ListOverrides = null,
    removable: js.UndefOr[scala.Boolean] = js.undefined,
    stateReducer: StateReducer = null
  ): StatefulListProps = {
    val __obj = js.Dynamic.literal()
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (!js.isUndefined(removable)) __obj.updateDynamic("removable")(removable)
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(stateReducer)
    __obj.asInstanceOf[StatefulListProps]
  }
}

