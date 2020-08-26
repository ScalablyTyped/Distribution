package typings.baseui.tabsMotionMod

import typings.baseui.anon.ActiveKey
import typings.react.mod.Key
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/tabs-motion.TabsProps & {  initialState :baseui.baseui/tabs-motion.State | undefined,   stateReducer :baseui.baseui/tabs-motion.StateReducer | undefined} */
@js.native
trait StatefulTabsProps extends js.Object {
  var activateOnFocus: js.UndefOr[Boolean] = js.native
  var activeKey: js.UndefOr[Key] = js.native
  var children: ReactNode = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var fill: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: baseui.baseui/tabs-motion.FILL[keyof baseui.baseui/tabs-motion.FILL] */ js.Any
  ] = js.native
  var initialState: js.UndefOr[State] = js.native
  var onChange: js.UndefOr[js.Function1[/* params */ ActiveKey, Unit]] = js.native
  var orientation: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: baseui.baseui/tabs-motion.ORIENTATION[keyof baseui.baseui/tabs-motion.ORIENTATION] */ js.Any
  ] = js.native
  var overrides: js.UndefOr[TabsOverrides] = js.native
  var renderAll: js.UndefOr[Boolean] = js.native
  var stateReducer: js.UndefOr[StateReducer] = js.native
}

object StatefulTabsProps {
  @scala.inline
  def apply(): StatefulTabsProps = {
    val __obj = js.Dynamic.literal()
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
    def setActivateOnFocus(value: Boolean): Self = this.set("activateOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivateOnFocus: Self = this.set("activateOnFocus", js.undefined)
    @scala.inline
    def setActiveKey(value: Key): Self = this.set("activeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveKey: Self = this.set("activeKey", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFill(
      value: /* import warning: importer.ImportType#apply Failed type conversion: baseui.baseui/tabs-motion.FILL[keyof baseui.baseui/tabs-motion.FILL] */ js.Any
    ): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setInitialState(value: State): Self = this.set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    @scala.inline
    def setOnChange(value: /* params */ ActiveKey => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOrientation(
      value: /* import warning: importer.ImportType#apply Failed type conversion: baseui.baseui/tabs-motion.ORIENTATION[keyof baseui.baseui/tabs-motion.ORIENTATION] */ js.Any
    ): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setOverrides(value: TabsOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    @scala.inline
    def setRenderAll(value: Boolean): Self = this.set("renderAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderAll: Self = this.set("renderAll", js.undefined)
    @scala.inline
    def setStateReducer(value: (/* state */ State, /* action */ Action) => State): Self = this.set("stateReducer", js.Any.fromFunction2(value))
    @scala.inline
    def deleteStateReducer: Self = this.set("stateReducer", js.undefined)
  }
  
}

