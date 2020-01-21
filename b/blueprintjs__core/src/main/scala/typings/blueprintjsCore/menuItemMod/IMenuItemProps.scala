package typings.blueprintjsCore.menuItemMod

import typings.blueprintjsCore.intentMod.Intent
import typings.blueprintjsCore.popoverMod.IPopoverProps
import typings.blueprintjsCore.propsMod.IActionProps
import typings.blueprintjsCore.propsMod.ILinkProps
import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsIcons.iconNameMod.IconName
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMenuItemProps
  extends IActionProps
     with ILinkProps {
  /** Whether this menu item should appear with an active state. */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * Children of this component will be rendered in a __submenu__ that appears when hovering or
    * clicking on this menu item.
    *
    * Use `text` prop for the content of the menu item itself.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  /**
    * Right-aligned label text content, useful for displaying hotkeys.
    *
    * This prop actually supports JSX elements, but TypeScript will throw an error because
    * `HTMLAttributes` only allows strings. Use `labelElement` to supply a JSX element in TypeScript.
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * A space-delimited list of class names to pass along to the right-aligned label wrapper element.
    */
  var labelClassName: js.UndefOr[String] = js.undefined
  /**
    * Right-aligned label content, useful for displaying hotkeys.
    */
  var labelElement: js.UndefOr[ReactNode] = js.undefined
  /**
    * Whether the text should be allowed to wrap to multiple lines.
    * If `false`, text will be truncated with an ellipsis when it reaches `max-width`.
    * @default false
    */
  var multiline: js.UndefOr[Boolean] = js.undefined
  /**
    * Props to spread to `Popover`. Note that `content` and `minimal` cannot be
    * changed and `usePortal` defaults to `false` so all submenus will live in
    * the same container.
    */
  var popoverProps: js.UndefOr[Partial[IPopoverProps]] = js.undefined
  /**
    * Whether an enabled item without a submenu should automatically close its parent popover when clicked.
    * @default true
    */
  var shouldDismissPopover: js.UndefOr[Boolean] = js.undefined
  /**
    * Name of the HTML tag that wraps the MenuItem.
    * @default "a"
    */
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any
  ] = js.undefined
  /**
    * A space-delimited list of class names to pass along to the text wrapper element.
    */
  var textClassName: js.UndefOr[String] = js.undefined
  /** Item text, required for usability. */
  @JSName("text")
  var text_IMenuItemProps: ReactNode
}

object IMenuItemProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    href: String = null,
    icon: IconName | MaybeElement = null,
    intent: Intent = null,
    label: String = null,
    labelClassName: String = null,
    labelElement: ReactNode = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    onClick: /* event */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    popoverProps: Partial[IPopoverProps] = null,
    shouldDismissPopover: js.UndefOr[Boolean] = js.undefined,
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any = null,
    target: String = null,
    text: ReactNode = null,
    textClassName: String = null
  ): IMenuItemProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelClassName != null) __obj.updateDynamic("labelClassName")(labelClassName.asInstanceOf[js.Any])
    if (labelElement != null) __obj.updateDynamic("labelElement")(labelElement.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldDismissPopover)) __obj.updateDynamic("shouldDismissPopover")(shouldDismissPopover.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textClassName != null) __obj.updateDynamic("textClassName")(textClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMenuItemProps]
  }
}

