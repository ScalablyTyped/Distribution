package typings.baseui.menuMod

import typings.baseui.anon.EventItem
import typings.baseui.baseuiStrings.click
import typings.baseui.baseuiStrings.focus
import typings.baseui.baseuiStrings.mouseEnter
import typings.baseui.baseuiStrings.moveDown
import typings.baseui.baseuiStrings.moveUp
import typings.baseui.baseuiStrings.reset
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatefulContainerProps extends js.Object {
  var addMenuToNesting: js.UndefOr[js.Function1[/* ref */ Ref[HTMLElement], Unit]] = js.native
  var children: js.UndefOr[js.Function1[/* args */ RenderProps, ReactNode]] = js.native
  var getChildMenu: js.UndefOr[js.Function1[/* ref */ Ref[HTMLElement], Unit]] = js.native
  var getParentMenu: js.UndefOr[js.Function1[/* ref */ Ref[HTMLElement], Unit]] = js.native
  var getRequiredItemProps: js.UndefOr[GetRequiredItemProps] = js.native
  var initialState: js.UndefOr[StatefulContainerState] = js.native
  var items: ItemsT = js.native
  var onActiveDescendantChange: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.native
  var onItemSelect: js.UndefOr[OnItemSelect] = js.native
  var removeMenuFromNesting: js.UndefOr[js.Function1[/* ref */ Ref[HTMLElement], Unit]] = js.native
  var rootRef: js.UndefOr[Ref[_]] = js.native
  var stateReducer: js.UndefOr[StateReducer] = js.native
}

object StatefulContainerProps {
  @scala.inline
  def apply(items: ItemsT): StatefulContainerProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulContainerProps]
  }
  @scala.inline
  implicit class StatefulContainerPropsOps[Self <: StatefulContainerProps] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: ItemT*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: ItemsT): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddMenuToNesting(value: /* ref */ Ref[HTMLElement] => Unit): Self = this.set("addMenuToNesting", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddMenuToNesting: Self = this.set("addMenuToNesting", js.undefined)
    @scala.inline
    def setChildren(value: /* args */ RenderProps => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setGetChildMenu(value: /* ref */ Ref[HTMLElement] => Unit): Self = this.set("getChildMenu", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetChildMenu: Self = this.set("getChildMenu", js.undefined)
    @scala.inline
    def setGetParentMenu(value: /* ref */ Ref[HTMLElement] => Unit): Self = this.set("getParentMenu", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetParentMenu: Self = this.set("getParentMenu", js.undefined)
    @scala.inline
    def setGetRequiredItemProps(value: (/* item */ js.Any, /* index */ Double) => RenderItemProps): Self = this.set("getRequiredItemProps", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetRequiredItemProps: Self = this.set("getRequiredItemProps", js.undefined)
    @scala.inline
    def setInitialState(value: StatefulContainerState): Self = this.set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    @scala.inline
    def setOnActiveDescendantChange(value: /* id */ js.UndefOr[String] => Unit): Self = this.set("onActiveDescendantChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnActiveDescendantChange: Self = this.set("onActiveDescendantChange", js.undefined)
    @scala.inline
    def setOnItemSelect(value: /* args */ EventItem => js.Any): Self = this.set("onItemSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnItemSelect: Self = this.set("onItemSelect", js.undefined)
    @scala.inline
    def setRemoveMenuFromNesting(value: /* ref */ Ref[HTMLElement] => Unit): Self = this.set("removeMenuFromNesting", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveMenuFromNesting: Self = this.set("removeMenuFromNesting", js.undefined)
    @scala.inline
    def setRootRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("rootRef", js.Any.fromFunction1(value))
    @scala.inline
    def setRootRef(value: Ref[_]): Self = this.set("rootRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootRef: Self = this.set("rootRef", js.undefined)
    @scala.inline
    def setRootRefNull: Self = this.set("rootRef", null)
    @scala.inline
    def setStateReducer(
      value: (/* changeType */ moveDown | moveUp | reset | click | focus | mouseEnter, /* changes */ StatefulContainerState, /* currentState */ StatefulContainerState) => StatefulContainerState
    ): Self = this.set("stateReducer", js.Any.fromFunction3(value))
    @scala.inline
    def deleteStateReducer: Self = this.set("stateReducer", js.undefined)
  }
  
}

