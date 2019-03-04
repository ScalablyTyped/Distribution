package typings
package atBlueprintjsCoreLib.libEsmComponentsMenuMenuItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMenuItemProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IActionProps
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.ILinkProps {
  /** Whether this menu item should appear with an active state. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Children of this component will be rendered in a __submenu__ that appears when hovering or
    * clicking on this menu item.
    *
    * Use `text` prop for the content of the menu item itself.
    */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Right-aligned label text content, useful for displaying hotkeys.
    *
    * This prop actually supports JSX elements, but TypeScript will throw an error because
    * `HTMLAttributes` only allows strings. Use `labelElement` to supply a JSX element in TypeScript.
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A space-delimited list of class names to pass along to the right-aligned label wrapper element.
    */
  var labelClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Right-aligned label content, useful for displaying hotkeys.
    */
  var labelElement: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Whether the text should be allowed to wrap to multiple lines.
    * If `false`, text will be truncated with an ellipsis when it reaches `max-width`.
    * @default false
    */
  var multiline: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Props to spread to `Popover`. Note that `content` and `minimal` cannot be
    * changed and `usePortal` defaults to `false` so all submenus will live in
    * the same container.
    */
  var popoverProps: js.UndefOr[
    stdLib.Partial[atBlueprintjsCoreLib.libEsmComponentsPopoverPopoverMod.IPopoverProps]
  ] = js.undefined
  /**
    * Whether an enabled item without a submenu should automatically close its parent popover when clicked.
    * @default true
    */
  var shouldDismissPopover: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Name of the HTML tag that wraps the MenuItem.
    * @default "a"
    */
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 172 */ js.Any
  ] = js.undefined
  /**
    * A space-delimited list of class names to pass along to the text wrapper element.
    */
  var textClassName: js.UndefOr[java.lang.String] = js.undefined
  /** Item text, required for usability. */
  @JSName("text")
  var text_IMenuItemProps: reactLib.reactMod.ReactNs.ReactNode
}

object IMenuItemProps {
  @scala.inline
  def apply(
    text: reactLib.reactMod.ReactNs.ReactNode,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    href: java.lang.String = null,
    icon: atBlueprintjsIconsLib.libEsmIconNameMod.IconName | atBlueprintjsCoreLib.libEsmCommonPropsMod.MaybeElement = null,
    intent: atBlueprintjsCoreLib.libEsmCommonIntentMod.Intent = null,
    label: java.lang.String = null,
    labelClassName: java.lang.String = null,
    labelElement: reactLib.reactMod.ReactNs.ReactNode = null,
    multiline: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    popoverProps: stdLib.Partial[atBlueprintjsCoreLib.libEsmComponentsPopoverPopoverMod.IPopoverProps] = null,
    shouldDismissPopover: js.UndefOr[scala.Boolean] = js.undefined,
    tagName: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 172 */ js.Any = null,
    target: java.lang.String = null,
    textClassName: java.lang.String = null
  ): IMenuItemProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (href != null) __obj.updateDynamic("href")(href)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelClassName != null) __obj.updateDynamic("labelClassName")(labelClassName)
    if (labelElement != null) __obj.updateDynamic("labelElement")(labelElement.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps)
    if (!js.isUndefined(shouldDismissPopover)) __obj.updateDynamic("shouldDismissPopover")(shouldDismissPopover)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    if (target != null) __obj.updateDynamic("target")(target)
    if (textClassName != null) __obj.updateDynamic("textClassName")(textClassName)
    __obj.asInstanceOf[IMenuItemProps]
  }
}

