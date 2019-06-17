package typings
package baseuiLib.menuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulContainerProps extends js.Object {
  var addMenuToNesting: js.UndefOr[js.Function1[/* ref */ reactLib.reactMod.Ref[stdLib.HTMLElement], scala.Unit]] = js.undefined
  var children: js.UndefOr[js.Function1[/* args */ RenderProps, reactLib.reactMod.ReactNode]] = js.undefined
  var getChildMenu: js.UndefOr[js.Function1[/* ref */ reactLib.reactMod.Ref[stdLib.HTMLElement], scala.Unit]] = js.undefined
  var getParentMenu: js.UndefOr[js.Function1[/* ref */ reactLib.reactMod.Ref[stdLib.HTMLElement], scala.Unit]] = js.undefined
  var getRequiredItemProps: js.UndefOr[GetRequiredItemProps] = js.undefined
  var initialState: js.UndefOr[StatefulContainerState] = js.undefined
  var items: js.Array[_]
  var onItemSelect: js.UndefOr[OnItemSelect] = js.undefined
  var removeMenuFromNesting: js.UndefOr[js.Function1[/* ref */ reactLib.reactMod.Ref[stdLib.HTMLElement], scala.Unit]] = js.undefined
  var rootRef: js.UndefOr[reactLib.reactMod.Ref[_]] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}

object StatefulContainerProps {
  @scala.inline
  def apply(
    items: js.Array[_],
    addMenuToNesting: /* ref */ reactLib.reactMod.Ref[stdLib.HTMLElement] => scala.Unit = null,
    children: /* args */ RenderProps => reactLib.reactMod.ReactNode = null,
    getChildMenu: /* ref */ reactLib.reactMod.Ref[stdLib.HTMLElement] => scala.Unit = null,
    getParentMenu: /* ref */ reactLib.reactMod.Ref[stdLib.HTMLElement] => scala.Unit = null,
    getRequiredItemProps: GetRequiredItemProps = null,
    initialState: StatefulContainerState = null,
    onItemSelect: OnItemSelect = null,
    removeMenuFromNesting: /* ref */ reactLib.reactMod.Ref[stdLib.HTMLElement] => scala.Unit = null,
    rootRef: reactLib.reactMod.Ref[_] = null,
    stateReducer: StateReducer = null
  ): StatefulContainerProps = {
    val __obj = js.Dynamic.literal(items = items)
    if (addMenuToNesting != null) __obj.updateDynamic("addMenuToNesting")(js.Any.fromFunction1(addMenuToNesting))
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (getChildMenu != null) __obj.updateDynamic("getChildMenu")(js.Any.fromFunction1(getChildMenu))
    if (getParentMenu != null) __obj.updateDynamic("getParentMenu")(js.Any.fromFunction1(getParentMenu))
    if (getRequiredItemProps != null) __obj.updateDynamic("getRequiredItemProps")(getRequiredItemProps)
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    if (onItemSelect != null) __obj.updateDynamic("onItemSelect")(onItemSelect)
    if (removeMenuFromNesting != null) __obj.updateDynamic("removeMenuFromNesting")(js.Any.fromFunction1(removeMenuFromNesting))
    if (rootRef != null) __obj.updateDynamic("rootRef")(rootRef.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(stateReducer)
    __obj.asInstanceOf[StatefulContainerProps]
  }
}

