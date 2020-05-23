package typings.baseui.dndListMod

import typings.baseui.anon.NewIndex
import typings.baseui.baseuiStrings.change_
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/dnd-list.StatefulListProps & {  initialState ? :baseui.baseui/dnd-list.State,   children  :react.react.ReactNode} */
trait StatefulComponentContainerProps extends js.Object {
  var children: ReactNode
  var initialState: js.UndefOr[State] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* params */ NewIndex, _]] = js.undefined
  var overrides: js.UndefOr[ListOverrides] = js.undefined
  var removable: js.UndefOr[Boolean] = js.undefined
  var removableByMove: js.UndefOr[Boolean] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}

object StatefulComponentContainerProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    initialState: State = null,
    onChange: /* params */ NewIndex => _ = null,
    overrides: ListOverrides = null,
    removable: js.UndefOr[Boolean] = js.undefined,
    removableByMove: js.UndefOr[Boolean] = js.undefined,
    stateReducer: (change_, /* nextState */ State, /* currentState */ State) => State = null
  ): StatefulComponentContainerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(removable)) __obj.updateDynamic("removable")(removable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removableByMove)) __obj.updateDynamic("removableByMove")(removableByMove.get.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3(stateReducer))
    __obj.asInstanceOf[StatefulComponentContainerProps]
  }
}

