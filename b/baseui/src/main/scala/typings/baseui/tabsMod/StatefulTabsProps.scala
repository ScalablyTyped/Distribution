package typings.baseui.tabsMod

import typings.baseui.AnonActiveKey
import typings.baseui.SharedPropsactiveboolean
import typings.baseui.baseuiStrings.change_
import typings.baseui.baseuiStrings.horizontal
import typings.baseui.baseuiStrings.vertical
import typings.react.mod.Key
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/tabs.TabsProps & {  activeKey ? :never,   renderAll ? :boolean,   initialState ? :baseui.baseui/tabs.State,   stateReducer ? :baseui.baseui/tabs.StateReducer} */
trait StatefulTabsProps extends js.Object {
  var activeKey: js.UndefOr[Key] = js.undefined
  var children: ReactNode
  var disabled: js.UndefOr[Boolean] = js.undefined
  var initialState: js.UndefOr[State] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* args */ AnonActiveKey, _]] = js.undefined
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  var overrides: js.UndefOr[TabsOverrides[SharedPropsactiveboolean]] = js.undefined
  var renderAll: js.UndefOr[Boolean] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}

object StatefulTabsProps {
  @scala.inline
  def apply(
    activeKey: Key = null,
    children: ReactNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    initialState: State = null,
    onChange: /* args */ AnonActiveKey => _ = null,
    orientation: horizontal | vertical = null,
    overrides: TabsOverrides[SharedPropsactiveboolean] = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    stateReducer: (change_, /* nextState */ State, /* currentState */ State) => State = null
  ): StatefulTabsProps = {
    val __obj = js.Dynamic.literal()
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3(stateReducer))
    __obj.asInstanceOf[StatefulTabsProps]
  }
}

