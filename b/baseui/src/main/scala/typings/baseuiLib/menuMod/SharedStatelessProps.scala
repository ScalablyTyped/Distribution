package typings
package baseuiLib.menuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedStatelessProps extends js.Object {
  var activedescendantId: js.UndefOr[java.lang.String] = js.undefined
  var focusMenu: js.UndefOr[
    js.Function1[/* event */ stdLib.FocusEvent | stdLib.MouseEvent | stdLib.KeyboardEvent, _]
  ] = js.undefined
  var getRequiredItemProps: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ scala.Double, RenderItemProps]] = js.undefined
  var highlightedIndex: js.UndefOr[scala.Double] = js.undefined
  var items: js.Array[_]
  var noResultsMsg: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var onBlur: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.FocusEventHandler[stdLib.HTMLElement], _]
  ] = js.undefined
  var onFocus: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.FocusEventHandler[stdLib.HTMLElement], _]
  ] = js.undefined
  var rootRef: js.UndefOr[reactLib.reactMod.Ref[_]] = js.undefined
  var unfocusMenu: js.UndefOr[js.Function0[_]] = js.undefined
}

object SharedStatelessProps {
  @scala.inline
  def apply(
    items: js.Array[_],
    activedescendantId: java.lang.String = null,
    focusMenu: /* event */ stdLib.FocusEvent | stdLib.MouseEvent | stdLib.KeyboardEvent => _ = null,
    getRequiredItemProps: (/* item */ js.Any, /* index */ scala.Double) => RenderItemProps = null,
    highlightedIndex: scala.Int | scala.Double = null,
    noResultsMsg: reactLib.reactMod.ReactNode = null,
    onBlur: /* event */ reactLib.reactMod.FocusEventHandler[stdLib.HTMLElement] => _ = null,
    onFocus: /* event */ reactLib.reactMod.FocusEventHandler[stdLib.HTMLElement] => _ = null,
    rootRef: reactLib.reactMod.Ref[_] = null,
    unfocusMenu: () => _ = null
  ): SharedStatelessProps = {
    val __obj = js.Dynamic.literal(items = items)
    if (activedescendantId != null) __obj.updateDynamic("activedescendantId")(activedescendantId)
    if (focusMenu != null) __obj.updateDynamic("focusMenu")(js.Any.fromFunction1(focusMenu))
    if (getRequiredItemProps != null) __obj.updateDynamic("getRequiredItemProps")(js.Any.fromFunction2(getRequiredItemProps))
    if (highlightedIndex != null) __obj.updateDynamic("highlightedIndex")(highlightedIndex.asInstanceOf[js.Any])
    if (noResultsMsg != null) __obj.updateDynamic("noResultsMsg")(noResultsMsg.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (rootRef != null) __obj.updateDynamic("rootRef")(rootRef.asInstanceOf[js.Any])
    if (unfocusMenu != null) __obj.updateDynamic("unfocusMenu")(js.Any.fromFunction0(unfocusMenu))
    __obj.asInstanceOf[SharedStatelessProps]
  }
}

