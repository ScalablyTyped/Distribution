package typings
package atBlueprintjsCoreLib.libEsmComponentsTooltipTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipProps
  extends atBlueprintjsCoreLib.libEsmComponentsPopoverPopoverSharedPropsMod.IPopoverSharedProps
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IIntentProps {
  /**
    * The content that will be displayed inside of the tooltip.
    */
  var content: reactLib.reactMod.Global.JSXNs.Element | java.lang.String
  /**
    * The kind of hover interaction that triggers the display of the tooltip.
    * Tooltips do not support click interactions.
    * @default PopoverInteractionKind.HOVER_TARGET_ONLY
    */
  var interactionKind: js.UndefOr[
    atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.hover | atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.`hover-target`
  ] = js.undefined
}

object ITooltipProps {
  @scala.inline
  def apply(
    content: reactLib.reactMod.Global.JSXNs.Element | java.lang.String,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    boundary: popperDotJsLib.popperDotJsMod.Boundary = null,
    canEscapeKeyClose: js.UndefOr[scala.Boolean] = js.undefined,
    captureDismiss: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    defaultIsOpen: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    enforceFocus: js.UndefOr[scala.Boolean] = js.undefined,
    hoverCloseDelay: scala.Int | scala.Double = null,
    hoverOpenDelay: scala.Int | scala.Double = null,
    inheritDarkTheme: js.UndefOr[scala.Boolean] = js.undefined,
    intent: atBlueprintjsCoreLib.libEsmCommonIntentMod.Intent = null,
    interactionKind: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.hover | atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.`hover-target` = null,
    isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    `lazy`: js.UndefOr[scala.Boolean] = js.undefined,
    modifiers: popperDotJsLib.popperDotJsMod.Modifiers = null,
    onClose: js.Function1[
      /* event */ js.UndefOr[reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement, reactLib.Event]], 
      scala.Unit
    ] = null,
    onClosed: js.Function1[/* node */ reactLib.HTMLElement, scala.Unit] = null,
    onClosing: js.Function1[/* node */ reactLib.HTMLElement, scala.Unit] = null,
    onInteraction: js.Function2[
      /* nextOpenState */ scala.Boolean, 
      /* e */ js.UndefOr[reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement, reactLib.Event]], 
      scala.Unit
    ] = null,
    onOpened: js.Function1[/* node */ reactLib.HTMLElement, scala.Unit] = null,
    onOpening: js.Function1[/* node */ reactLib.HTMLElement, scala.Unit] = null,
    openOnTargetFocus: js.UndefOr[scala.Boolean] = js.undefined,
    popoverClassName: java.lang.String = null,
    portalClassName: java.lang.String = null,
    portalContainer: reactLib.HTMLElement = null,
    position: atBlueprintjsCoreLib.libEsmComponentsPopoverPopoverSharedPropsMod.PopoverPosition = null,
    targetClassName: java.lang.String = null,
    targetProps: reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] = null,
    targetTagName: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 172 */ js.Any = null,
    transitionDuration: scala.Int | scala.Double = null,
    usePortal: js.UndefOr[scala.Boolean] = js.undefined,
    wrapperTagName: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 172 */ js.Any = null
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
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onClosed != null) __obj.updateDynamic("onClosed")(onClosed)
    if (onClosing != null) __obj.updateDynamic("onClosing")(onClosing)
    if (onInteraction != null) __obj.updateDynamic("onInteraction")(onInteraction)
    if (onOpened != null) __obj.updateDynamic("onOpened")(onOpened)
    if (onOpening != null) __obj.updateDynamic("onOpening")(onOpening)
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

