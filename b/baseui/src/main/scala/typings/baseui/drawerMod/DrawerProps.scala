package typings.baseui.drawerMod

import typings.baseui.AnonBackdrop
import typings.baseui.baseuiStrings.auto
import typings.baseui.baseuiStrings.bottom
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.full
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.right
import typings.baseui.baseuiStrings.top
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerProps extends js.Object {
  var anchor: js.UndefOr[left | right | top | bottom | String] = js.undefined
  var animate: js.UndefOr[Boolean] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var closeable: js.UndefOr[Boolean] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var mountNode: js.UndefOr[HTMLElement] = js.undefined
  var onBackdropClick: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], _]] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* args */ AnonBackdrop, _]] = js.undefined
  var onEscapeKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent[HTMLElement], _]] = js.undefined
  var overrides: js.UndefOr[DrawerOverrides] = js.undefined
  var renderAll: js.UndefOr[Boolean] = js.undefined
  var showBackdrop: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[default_ | full | auto | String] = js.undefined
}

object DrawerProps {
  @scala.inline
  def apply(
    anchor: left | right | top | bottom | String = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    closeable: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    mountNode: HTMLElement = null,
    onBackdropClick: /* event */ MouseEvent[HTMLElement, NativeMouseEvent] => _ = null,
    onClose: /* args */ AnonBackdrop => _ = null,
    onEscapeKeyDown: /* event */ KeyboardEvent[HTMLElement] => _ = null,
    overrides: DrawerOverrides = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    showBackdrop: js.UndefOr[Boolean] = js.undefined,
    size: default_ | full | auto | String = null
  ): DrawerProps = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(closeable)) __obj.updateDynamic("closeable")(closeable.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    if (onBackdropClick != null) __obj.updateDynamic("onBackdropClick")(js.Any.fromFunction1(onBackdropClick))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onEscapeKeyDown != null) __obj.updateDynamic("onEscapeKeyDown")(js.Any.fromFunction1(onEscapeKeyDown))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    if (!js.isUndefined(showBackdrop)) __obj.updateDynamic("showBackdrop")(showBackdrop.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerProps]
  }
}

