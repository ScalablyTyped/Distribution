package typings.atBlueprintjsCore.libEsmComponentsTooltipTooltipMod

import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.`hover-target`
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.hover
import typings.atBlueprintjsCore.libEsmCommonIntentMod.Intent
import typings.atBlueprintjsCore.libEsmCommonPropsMod.IIntentProps
import typings.atBlueprintjsCore.libEsmComponentsPopoverPopoverSharedPropsMod.IPopoverSharedProps
import typings.atBlueprintjsCore.libEsmComponentsPopoverPopoverSharedPropsMod.PopoverPosition
import typings.popperDotJs.popperDotJsMod.Boundary
import typings.popperDotJs.popperDotJsMod.Modifiers
import typings.react.Event
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.SyntheticEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipProps
  extends IPopoverSharedProps
     with IIntentProps {
  /**
    * The content that will be displayed inside of the tooltip.
    */
  var content: Element | String
  /**
    * The kind of hover interaction that triggers the display of the tooltip.
    * Tooltips do not support click interactions.
    * @default PopoverInteractionKind.HOVER_TARGET_ONLY
    */
  var interactionKind: js.UndefOr[hover | `hover-target`] = js.undefined
}

object ITooltipProps {
  @scala.inline
  def apply(
    content: Element | String,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    boundary: Boundary = null,
    canEscapeKeyClose: js.UndefOr[Boolean] = js.undefined,
    captureDismiss: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    defaultIsOpen: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    enforceFocus: js.UndefOr[Boolean] = js.undefined,
    hoverCloseDelay: Int | Double = null,
    hoverOpenDelay: Int | Double = null,
    inheritDarkTheme: js.UndefOr[Boolean] = js.undefined,
    intent: Intent = null,
    interactionKind: hover | `hover-target` = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    modifiers: Modifiers = null,
    onClose: /* event */ js.UndefOr[SyntheticEvent[HTMLElement, Event]] => Unit = null,
    onClosed: /* node */ HTMLElement => Unit = null,
    onClosing: /* node */ HTMLElement => Unit = null,
    onInteraction: (/* nextOpenState */ Boolean, /* e */ js.UndefOr[SyntheticEvent[HTMLElement, Event]]) => Unit = null,
    onOpened: /* node */ HTMLElement => Unit = null,
    onOpening: /* node */ HTMLElement => Unit = null,
    openOnTargetFocus: js.UndefOr[Boolean] = js.undefined,
    popoverClassName: String = null,
    portalClassName: String = null,
    portalContainer: HTMLElement = null,
    position: PopoverPosition = null,
    targetClassName: String = null,
    targetProps: HTMLAttributes[HTMLElement] = null,
    targetTagName: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 175 */ js.Any = null,
    transitionDuration: Int | Double = null,
    usePortal: js.UndefOr[Boolean] = js.undefined,
    wrapperTagName: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 175 */ js.Any = null
  ): ITooltipProps = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (boundary != null) __obj.updateDynamic("boundary")(boundary)
    if (!js.isUndefined(canEscapeKeyClose)) __obj.updateDynamic("canEscapeKeyClose")(canEscapeKeyClose)
    if (!js.isUndefined(captureDismiss)) __obj.updateDynamic("captureDismiss")(captureDismiss)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(defaultIsOpen)) __obj.updateDynamic("defaultIsOpen")(defaultIsOpen)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(enforceFocus)) __obj.updateDynamic("enforceFocus")(enforceFocus)
    if (hoverCloseDelay != null) __obj.updateDynamic("hoverCloseDelay")(hoverCloseDelay.asInstanceOf[js.Any])
    if (hoverOpenDelay != null) __obj.updateDynamic("hoverOpenDelay")(hoverOpenDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(inheritDarkTheme)) __obj.updateDynamic("inheritDarkTheme")(inheritDarkTheme)
    if (intent != null) __obj.updateDynamic("intent")(intent)
    if (interactionKind != null) __obj.updateDynamic("interactionKind")(interactionKind.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onClosed != null) __obj.updateDynamic("onClosed")(js.Any.fromFunction1(onClosed))
    if (onClosing != null) __obj.updateDynamic("onClosing")(js.Any.fromFunction1(onClosing))
    if (onInteraction != null) __obj.updateDynamic("onInteraction")(js.Any.fromFunction2(onInteraction))
    if (onOpened != null) __obj.updateDynamic("onOpened")(js.Any.fromFunction1(onOpened))
    if (onOpening != null) __obj.updateDynamic("onOpening")(js.Any.fromFunction1(onOpening))
    if (!js.isUndefined(openOnTargetFocus)) __obj.updateDynamic("openOnTargetFocus")(openOnTargetFocus)
    if (popoverClassName != null) __obj.updateDynamic("popoverClassName")(popoverClassName)
    if (portalClassName != null) __obj.updateDynamic("portalClassName")(portalClassName)
    if (portalContainer != null) __obj.updateDynamic("portalContainer")(portalContainer)
    if (position != null) __obj.updateDynamic("position")(position)
    if (targetClassName != null) __obj.updateDynamic("targetClassName")(targetClassName)
    if (targetProps != null) __obj.updateDynamic("targetProps")(targetProps)
    if (targetTagName != null) __obj.updateDynamic("targetTagName")(targetTagName)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(usePortal)) __obj.updateDynamic("usePortal")(usePortal)
    if (wrapperTagName != null) __obj.updateDynamic("wrapperTagName")(wrapperTagName)
    __obj.asInstanceOf[ITooltipProps]
  }
}

