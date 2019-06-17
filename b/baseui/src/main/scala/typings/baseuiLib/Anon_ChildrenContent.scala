package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenContent extends js.Object {
  var children: reactLib.reactMod.ReactNode
  var content: reactLib.reactMod.ReactNode | js.Function0[reactLib.reactMod.ReactNode]
  var isOpen: scala.Boolean
  var onBlur: js.UndefOr[js.Function0[_]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* e */ stdLib.Event, _]] = js.undefined
  var onClickOutside: js.UndefOr[js.Function1[/* event */ stdLib.MouseEvent, _]] = js.undefined
  var onEsc: js.UndefOr[js.Function0[_]] = js.undefined
  var onFocus: js.UndefOr[js.Function0[_]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function0[_]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function0[_]] = js.undefined
}

object Anon_ChildrenContent {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    content: reactLib.reactMod.ReactNode | js.Function0[reactLib.reactMod.ReactNode],
    isOpen: scala.Boolean,
    onBlur: () => _ = null,
    onClick: /* e */ stdLib.Event => _ = null,
    onClickOutside: /* event */ stdLib.MouseEvent => _ = null,
    onEsc: () => _ = null,
    onFocus: () => _ = null,
    onMouseEnter: () => _ = null,
    onMouseLeave: () => _ = null
  ): Anon_ChildrenContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], isOpen = isOpen)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onClickOutside != null) __obj.updateDynamic("onClickOutside")(js.Any.fromFunction1(onClickOutside))
    if (onEsc != null) __obj.updateDynamic("onEsc")(js.Any.fromFunction0(onEsc))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction0(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction0(onMouseLeave))
    __obj.asInstanceOf[Anon_ChildrenContent]
  }
}

