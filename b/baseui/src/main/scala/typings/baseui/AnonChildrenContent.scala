package typings.baseui

import typings.react.mod.ReactNode
import typings.std.Event_
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenContent extends js.Object {
  var children: ReactNode
  var content: ReactNode | js.Function0[ReactNode]
  var isOpen: Boolean
  var onBlur: js.UndefOr[js.Function0[_]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* e */ Event_, _]] = js.undefined
  var onClickOutside: js.UndefOr[js.Function1[/* event */ MouseEvent, _]] = js.undefined
  var onEsc: js.UndefOr[js.Function0[_]] = js.undefined
  var onFocus: js.UndefOr[js.Function0[_]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function0[_]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function0[_]] = js.undefined
}

object AnonChildrenContent {
  @scala.inline
  def apply(
    isOpen: Boolean,
    children: ReactNode = null,
    content: ReactNode | js.Function0[ReactNode] = null,
    onBlur: () => _ = null,
    onClick: /* e */ Event_ => _ = null,
    onClickOutside: /* event */ MouseEvent => _ = null,
    onEsc: () => _ = null,
    onFocus: () => _ = null,
    onMouseEnter: () => _ = null,
    onMouseLeave: () => _ = null
  ): AnonChildrenContent = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onClickOutside != null) __obj.updateDynamic("onClickOutside")(js.Any.fromFunction1(onClickOutside))
    if (onEsc != null) __obj.updateDynamic("onEsc")(js.Any.fromFunction0(onEsc))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction0(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction0(onMouseLeave))
    __obj.asInstanceOf[AnonChildrenContent]
  }
}

