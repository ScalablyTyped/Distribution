package typings.baseui.tabsMod

import typings.baseui.anon.ActiveKey
import typings.baseui.anon.SharedPropsactivebooleanu
import typings.baseui.baseuiStrings.change_
import typings.baseui.baseuiStrings.horizontal
import typings.baseui.baseuiStrings.vertical
import typings.react.mod.Key
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/tabs.TabsProps & {  activeKey :never | undefined,   renderAll :boolean | undefined,   initialState :baseui.baseui/tabs.State | undefined,   stateReducer :baseui.baseui/tabs.StateReducer | undefined} */
@js.native
trait StatefulTabsProps extends js.Object {
  var activeKey: js.UndefOr[Key] with js.UndefOr[scala.Nothing] = js.native
  var children: ReactNode = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var initialState: js.UndefOr[State] = js.native
  var onChange: js.UndefOr[js.Function1[/* args */ ActiveKey, _]] = js.native
  var orientation: js.UndefOr[horizontal | vertical] = js.native
  var overrides: js.UndefOr[TabsOverrides[SharedPropsactivebooleanu]] = js.native
  var renderAll: js.UndefOr[Boolean] = js.native
  var stateReducer: js.UndefOr[StateReducer] = js.native
}

object StatefulTabsProps {
  @scala.inline
  def apply(activeKey: js.UndefOr[Key] with js.UndefOr[scala.Nothing]): StatefulTabsProps = {
    val __obj = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulTabsProps]
  }
  @scala.inline
  implicit class StatefulTabsPropsOps[Self <: StatefulTabsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveKey(value: js.UndefOr[Key] with js.UndefOr[scala.Nothing]): Self = this.set("activeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setInitialState(value: State): Self = this.set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    @scala.inline
    def setOnChange(value: /* args */ ActiveKey => _): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOrientation(value: horizontal | vertical): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setOverrides(value: TabsOverrides[SharedPropsactivebooleanu]): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    @scala.inline
    def setRenderAll(value: Boolean): Self = this.set("renderAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderAll: Self = this.set("renderAll", js.undefined)
    @scala.inline
    def setStateReducer(value: (change_, /* nextState */ State, /* currentState */ State) => State): Self = this.set("stateReducer", js.Any.fromFunction3(value))
    @scala.inline
    def deleteStateReducer: Self = this.set("stateReducer", js.undefined)
  }
  
}

