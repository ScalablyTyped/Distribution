package typings.atBlueprintjsTable.libEsmInteractionsMenusCopyCellsMenuItemMod

import typings.atBlueprintjsCore.libEsmCommonIntentMod.Intent
import typings.atBlueprintjsCore.libEsmCommonPropsMod.MaybeElement
import typings.atBlueprintjsCore.libEsmComponentsMenuMenuItemMod.IMenuItemProps
import typings.atBlueprintjsCore.libEsmComponentsPopoverPopoverMod.IPopoverProps
import typings.atBlueprintjsIcons.libEsmIconNameMod.IconName
import typings.atBlueprintjsTable.libEsmInteractionsMenusMenuContextMod.IMenuContext
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICopyCellsMenuItemProps extends IMenuItemProps {
  /**
    * The `IMenuContext` that launched the menu.
    */
  var context: IMenuContext
  /**
    * If you want to do something after the copy or if you want to notify the
    * user if a copy fails, you may provide this optional callback.
    *
    * Due to browser limitations, the copy can fail. This usually occurs if
    * the selection is too large, like 20,000+ cells. The copy will also fail
    * if the browser does not support the copy method (see
    * `Clipboard.isCopySupported`).
    */
  var onCopy: js.UndefOr[js.Function1[/* success */ Boolean, Unit]] = js.undefined
  /**
    * A callback that returns the data for a specific cell. This need not
    * match the value displayed in the `<Cell>` component. The value will be
    * invisibly added as `textContent` into the DOM before copying.
    */
  def getCellData(row: Double, col: Double): js.Any
}

object ICopyCellsMenuItemProps {
  @scala.inline
  def apply(
    context: IMenuContext,
    getCellData: (Double, Double) => js.Any,
    text_IMenuItemProps: ReactNode,
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
    onCopy: /* success */ Boolean => Unit = null,
    popoverProps: Partial[IPopoverProps] = null,
    shouldDismissPopover: js.UndefOr[Boolean] = js.undefined,
    tagName: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 175 */ js.Any = null,
    target: String = null,
    text: ReactNode = null,
    textClassName: String = null
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

