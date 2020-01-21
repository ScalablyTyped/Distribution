package typings.baseui.menuMod

import typings.baseui.AnonEventItem
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

trait StatefulContainerProps extends js.Object {
  var addMenuToNesting: js.UndefOr[js.Function1[/* ref */ Ref[HTMLElement], Unit]] = js.undefined
  var children: js.UndefOr[js.Function1[/* args */ RenderProps, ReactNode]] = js.undefined
  var getChildMenu: js.UndefOr[js.Function1[/* ref */ Ref[HTMLElement], Unit]] = js.undefined
  var getParentMenu: js.UndefOr[js.Function1[/* ref */ Ref[HTMLElement], Unit]] = js.undefined
  var getRequiredItemProps: js.UndefOr[GetRequiredItemProps] = js.undefined
  var initialState: js.UndefOr[StatefulContainerState] = js.undefined
  var items: ItemsT
  var onItemSelect: js.UndefOr[OnItemSelect] = js.undefined
  var removeMenuFromNesting: js.UndefOr[js.Function1[/* ref */ Ref[HTMLElement], Unit]] = js.undefined
  var rootRef: js.UndefOr[Ref[_]] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}

object StatefulContainerProps {
  @scala.inline
  def apply(
    items: ItemsT,
    addMenuToNesting: /* ref */ Ref[HTMLElement] => Unit = null,
    children: /* args */ RenderProps => ReactNode = null,
    getChildMenu: /* ref */ Ref[HTMLElement] => Unit = null,
    getParentMenu: /* ref */ Ref[HTMLElement] => Unit = null,
    getRequiredItemProps: (/* item */ js.Any, /* index */ Double) => RenderItemProps = null,
    initialState: StatefulContainerState = null,
    onItemSelect: /* args */ AnonEventItem => js.Any = null,
    removeMenuFromNesting: /* ref */ Ref[HTMLElement] => Unit = null,
    rootRef: Ref[_] = null,
    stateReducer: (/* changeType */ moveDown | moveUp | reset | click | focus | mouseEnter, /* changes */ StatefulContainerState, /* currentState */ StatefulContainerState) => StatefulContainerState = null
  ): StatefulContainerProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (addMenuToNesting != null) __obj.updateDynamic("addMenuToNesting")(js.Any.fromFunction1(addMenuToNesting))
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (getChildMenu != null) __obj.updateDynamic("getChildMenu")(js.Any.fromFunction1(getChildMenu))
    if (getParentMenu != null) __obj.updateDynamic("getParentMenu")(js.Any.fromFunction1(getParentMenu))
    if (getRequiredItemProps != null) __obj.updateDynamic("getRequiredItemProps")(js.Any.fromFunction2(getRequiredItemProps))
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onItemSelect != null) __obj.updateDynamic("onItemSelect")(js.Any.fromFunction1(onItemSelect))
    if (removeMenuFromNesting != null) __obj.updateDynamic("removeMenuFromNesting")(js.Any.fromFunction1(removeMenuFromNesting))
    if (rootRef != null) __obj.updateDynamic("rootRef")(rootRef.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3(stateReducer))
    __obj.asInstanceOf[StatefulContainerProps]
  }
}

