package typings
package atBlueprintjsTableLib.libEsmInteractionsMenusCopyCellsMenuItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICopyCellsMenuItemProps
  extends atBlueprintjsCoreLib.libEsmComponentsMenuMenuItemMod.IMenuItemProps {
  /**
    * The `IMenuContext` that launched the menu.
    */
  var context: atBlueprintjsTableLib.libEsmInteractionsMenusMenuContextMod.IMenuContext
  /**
    * If you want to do something after the copy or if you want to notify the
    * user if a copy fails, you may provide this optional callback.
    *
    * Due to browser limitations, the copy can fail. This usually occurs if
    * the selection is too large, like 20,000+ cells. The copy will also fail
    * if the browser does not support the copy method (see
    * `Clipboard.isCopySupported`).
    */
  var onCopy: js.UndefOr[js.Function1[/* success */ scala.Boolean, scala.Unit]] = js.undefined
  /**
    * A callback that returns the data for a specific cell. This need not
    * match the value displayed in the `<Cell>` component. The value will be
    * invisibly added as `textContent` into the DOM before copying.
    */
  def getCellData(row: scala.Double, col: scala.Double): js.Any
}

object ICopyCellsMenuItemProps {
  @scala.inline
  def apply(
    context: atBlueprintjsTableLib.libEsmInteractionsMenusMenuContextMod.IMenuContext,
    getCellData: (scala.Double, scala.Double) => js.Any,
    text_IMenuItemProps: reactLib.reactMod.ReactNs.ReactNode,
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
    onClick: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onCopy: /* success */ scala.Boolean => scala.Unit = null,
    popoverProps: stdLib.Partial[atBlueprintjsCoreLib.libEsmComponentsPopoverPopoverMod.IPopoverProps] = null,
    shouldDismissPopover: js.UndefOr[scala.Boolean] = js.undefined,
    tagName: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 172 */ js.Any = null,
    target: java.lang.String = null,
    text: reactLib.reactMod.ReactNs.ReactNode = null,
    textClassName: java.lang.String = null
  ): ICopyCellsMenuItemProps = {
    val __obj = js.Dynamic.literal(context = context, getCellData = js.Any.fromFunction2(getCellData))
    __obj.updateDynamic("text")(text_IMenuItemProps.asInstanceOf[js.Any])
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
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps)
    if (!js.isUndefined(shouldDismissPopover)) __obj.updateDynamic("shouldDismissPopover")(shouldDismissPopover)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    if (target != null) __obj.updateDynamic("target")(target)
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textClassName != null) __obj.updateDynamic("textClassName")(textClassName)
    __obj.asInstanceOf[ICopyCellsMenuItemProps]
  }
}

