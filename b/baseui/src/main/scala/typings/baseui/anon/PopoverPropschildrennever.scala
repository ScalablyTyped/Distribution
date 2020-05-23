package typings.baseui.anon

import typings.baseui.baseuiStrings.auto
import typings.baseui.baseuiStrings.bottom
import typings.baseui.baseuiStrings.bottomLeft
import typings.baseui.baseuiStrings.bottomRight
import typings.baseui.baseuiStrings.click
import typings.baseui.baseuiStrings.hover
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.leftBottom
import typings.baseui.baseuiStrings.leftTop
import typings.baseui.baseuiStrings.menu
import typings.baseui.baseuiStrings.none
import typings.baseui.baseuiStrings.right
import typings.baseui.baseuiStrings.rightBottom
import typings.baseui.baseuiStrings.rightTop
import typings.baseui.baseuiStrings.tooltip
import typings.baseui.baseuiStrings.top
import typings.baseui.baseuiStrings.topLeft
import typings.baseui.baseuiStrings.topRight
import typings.baseui.popoverMod.Overrides
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/popover.PopoverProps & {  children  :never} */
trait PopoverPropschildrennever extends js.Object {
  var accessibilityType: js.UndefOr[none | menu | tooltip] = js.undefined
  var animateOutTime: js.UndefOr[Double] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var children: ReactNode
  var content: ReactNode | js.Function0[ReactNode]
  var `data-baseweb`: js.UndefOr[String] = js.undefined
  var focusLock: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var ignoreBoundary: js.UndefOr[Boolean] = js.undefined
  var isOpen: Boolean
  var mountNode: js.UndefOr[HTMLElement] = js.undefined
  var onBlur: js.UndefOr[js.Function0[_]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* e */ typings.std.Event, _]] = js.undefined
  var onClickOutside: js.UndefOr[js.Function1[/* event */ MouseEvent, _]] = js.undefined
  var onEsc: js.UndefOr[js.Function0[_]] = js.undefined
  var onFocus: js.UndefOr[js.Function0[_]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function0[_]] = js.undefined
  var onMouseEnterDelay: js.UndefOr[Double] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function0[_]] = js.undefined
  var onMouseLeaveDelay: js.UndefOr[Double] = js.undefined
  var overrides: js.UndefOr[Overrides] = js.undefined
  var placement: js.UndefOr[
    topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
  ] = js.undefined
  var popperOptions: js.UndefOr[js.Any] = js.undefined
  var renderAll: js.UndefOr[Boolean] = js.undefined
  var returnFocus: js.UndefOr[Boolean] = js.undefined
  var showArrow: js.UndefOr[Boolean] = js.undefined
  var triggerType: js.UndefOr[click | hover] = js.undefined
}

object PopoverPropschildrennever {
  @scala.inline
  def apply(
    isOpen: Boolean,
    accessibilityType: none | menu | tooltip = null,
    animateOutTime: js.UndefOr[Double] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    content: ReactNode | js.Function0[ReactNode] = null,
    `data-baseweb`: String = null,
    focusLock: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    ignoreBoundary: js.UndefOr[Boolean] = js.undefined,
    mountNode: HTMLElement = null,
    onBlur: () => _ = null,
    onClick: /* e */ typings.std.Event => _ = null,
    onClickOutside: /* event */ MouseEvent => _ = null,
    onEsc: () => _ = null,
    onFocus: () => _ = null,
    onMouseEnter: () => _ = null,
    onMouseEnterDelay: js.UndefOr[Double] = js.undefined,
    onMouseLeave: () => _ = null,
    onMouseLeaveDelay: js.UndefOr[Double] = js.undefined,
    overrides: Overrides = null,
    placement: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top = null,
    popperOptions: js.Any = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    returnFocus: js.UndefOr[Boolean] = js.undefined,
    showArrow: js.UndefOr[Boolean] = js.undefined,
    triggerType: click | hover = null
  ): PopoverPropschildrennever = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    if (accessibilityType != null) __obj.updateDynamic("accessibilityType")(accessibilityType.asInstanceOf[js.Any])
    if (!js.isUndefined(animateOutTime)) __obj.updateDynamic("animateOutTime")(animateOutTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (`data-baseweb` != null) __obj.updateDynamic("data-baseweb")(`data-baseweb`.asInstanceOf[js.Any])
    if (!js.isUndefined(focusLock)) __obj.updateDynamic("focusLock")(focusLock.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreBoundary)) __obj.updateDynamic("ignoreBoundary")(ignoreBoundary.get.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onClickOutside != null) __obj.updateDynamic("onClickOutside")(js.Any.fromFunction1(onClickOutside))
    if (onEsc != null) __obj.updateDynamic("onEsc")(js.Any.fromFunction0(onEsc))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction0(onMouseEnter))
    if (!js.isUndefined(onMouseEnterDelay)) __obj.updateDynamic("onMouseEnterDelay")(onMouseEnterDelay.get.asInstanceOf[js.Any])
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction0(onMouseLeave))
    if (!js.isUndefined(onMouseLeaveDelay)) __obj.updateDynamic("onMouseLeaveDelay")(onMouseLeaveDelay.get.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (popperOptions != null) __obj.updateDynamic("popperOptions")(popperOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(returnFocus)) __obj.updateDynamic("returnFocus")(returnFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow.get.asInstanceOf[js.Any])
    if (triggerType != null) __obj.updateDynamic("triggerType")(triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverPropschildrennever]
  }
}

