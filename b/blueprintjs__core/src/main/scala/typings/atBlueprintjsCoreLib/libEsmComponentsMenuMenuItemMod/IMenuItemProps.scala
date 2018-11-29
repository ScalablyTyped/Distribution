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
  var tagName: js.UndefOr[/* LimitUnionLength: was union type with length 170 */java.lang.String] = js.undefined
  /** Item text, required for usability. */
  @JSName("text")
  var text_IMenuItemProps: reactLib.reactMod.ReactNs.ReactNode
}

