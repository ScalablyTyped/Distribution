package typings.blueprintjsCore

import typings.blueprintjsCore.blueprintjsCoreStrings.`hover-target`
import typings.blueprintjsCore.blueprintjsCoreStrings.hover
import typings.blueprintjsCore.intentMod.Intent
import typings.blueprintjsCore.popoverSharedPropsMod.PopoverPosition
import typings.popperJs.mod.Boundary
import typings.popperJs.mod.Modifiers
import typings.react.mod.HTMLAttributes
import typings.react.mod.SyntheticEvent
import typings.react.mod._Global_.JSX.Element
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/tooltip/tooltip.ITooltipProps> */
trait PartialITooltipProps extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var boundary: js.UndefOr[Boundary] = js.undefined
  var canEscapeKeyClose: js.UndefOr[Boolean] = js.undefined
  var captureDismiss: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var content: js.UndefOr[Element | String] = js.undefined
  var defaultIsOpen: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var enforceFocus: js.UndefOr[Boolean] = js.undefined
  var hoverCloseDelay: js.UndefOr[Double] = js.undefined
  var hoverOpenDelay: js.UndefOr[Double] = js.undefined
  var inheritDarkTheme: js.UndefOr[Boolean] = js.undefined
  var intent: js.UndefOr[Intent] = js.undefined
  var interactionKind: js.UndefOr[hover | `hover-target`] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  var modifiers: js.UndefOr[Modifiers] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* event */ js.UndefOr[SyntheticEvent[HTMLElement, Event_]], Unit]] = js.undefined
  var onClosed: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  var onClosing: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  var onInteraction: js.UndefOr[
    js.Function2[
      /* nextOpenState */ Boolean, 
      /* e */ js.UndefOr[SyntheticEvent[HTMLElement, Event_]], 
      Unit
    ]
  ] = js.undefined
  var onOpened: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  var onOpening: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  var openOnTargetFocus: js.UndefOr[Boolean] = js.undefined
  var popoverClassName: js.UndefOr[String] = js.undefined
  var portalClassName: js.UndefOr[String] = js.undefined
  var portalContainer: js.UndefOr[HTMLElement] = js.undefined
  var position: js.UndefOr[PopoverPosition] = js.undefined
  var targetClassName: js.UndefOr[String] = js.undefined
  var targetProps: js.UndefOr[HTMLAttributes[HTMLElement]] = js.undefined
  var targetTagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.undefined
  var transitionDuration: js.UndefOr[Double] = js.undefined
  var usePortal: js.UndefOr[Boolean] = js.undefined
  var wrapperTagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.undefined
}

object PartialITooltipProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    boundary: Boundary = null,
    canEscapeKeyClose: js.UndefOr[Boolean] = js.undefined,
    captureDismiss: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    content: Element | String = null,
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
    onClose: /* event */ js.UndefOr[SyntheticEvent[HTMLElement, Event_]] => Unit = null,
    onClosed: /* node */ HTMLElement => Unit = null,
    onClosing: /* node */ HTMLElement => Unit = null,
    onInteraction: (/* nextOpenState */ Boolean, /* e */ js.UndefOr[SyntheticEvent[HTMLElement, Event_]]) => Unit = null,
    onOpened: /* node */ HTMLElement => Unit = null,
    onOpening: /* node */ HTMLElement => Unit = null,
    openOnTargetFocus: js.UndefOr[Boolean] = js.undefined,
    popoverClassName: String = null,
    portalClassName: String = null,
    portalContainer: HTMLElement = null,
    position: PopoverPosition = null,
    targetClassName: String = null,
    targetProps: HTMLAttributes[HTMLElement] = null,
    targetTagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any = null,
    transitionDuration: Int | Double = null,
    usePortal: js.UndefOr[Boolean] = js.undefined,
    wrapperTagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any = null
  ): PartialITooltipProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (boundary != null) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (!js.isUndefined(canEscapeKeyClose)) __obj.updateDynamic("canEscapeKeyClose")(canEscapeKeyClose.asInstanceOf[js.Any])
    if (!js.isUndefined(captureDismiss)) __obj.updateDynamic("captureDismiss")(captureDismiss.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultIsOpen)) __obj.updateDynamic("defaultIsOpen")(defaultIsOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(enforceFocus)) __obj.updateDynamic("enforceFocus")(enforceFocus.asInstanceOf[js.Any])
    if (hoverCloseDelay != null) __obj.updateDynamic("hoverCloseDelay")(hoverCloseDelay.asInstanceOf[js.Any])
    if (hoverOpenDelay != null) __obj.updateDynamic("hoverOpenDelay")(hoverOpenDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(inheritDarkTheme)) __obj.updateDynamic("inheritDarkTheme")(inheritDarkTheme.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (interactionKind != null) __obj.updateDynamic("interactionKind")(interactionKind.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onClosed != null) __obj.updateDynamic("onClosed")(js.Any.fromFunction1(onClosed))
    if (onClosing != null) __obj.updateDynamic("onClosing")(js.Any.fromFunction1(onClosing))
    if (onInteraction != null) __obj.updateDynamic("onInteraction")(js.Any.fromFunction2(onInteraction))
    if (onOpened != null) __obj.updateDynamic("onOpened")(js.Any.fromFunction1(onOpened))
    if (onOpening != null) __obj.updateDynamic("onOpening")(js.Any.fromFunction1(onOpening))
    if (!js.isUndefined(openOnTargetFocus)) __obj.updateDynamic("openOnTargetFocus")(openOnTargetFocus.asInstanceOf[js.Any])
    if (popoverClassName != null) __obj.updateDynamic("popoverClassName")(popoverClassName.asInstanceOf[js.Any])
    if (portalClassName != null) __obj.updateDynamic("portalClassName")(portalClassName.asInstanceOf[js.Any])
    if (portalContainer != null) __obj.updateDynamic("portalContainer")(portalContainer.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (targetClassName != null) __obj.updateDynamic("targetClassName")(targetClassName.asInstanceOf[js.Any])
    if (targetProps != null) __obj.updateDynamic("targetProps")(targetProps.asInstanceOf[js.Any])
    if (targetTagName != null) __obj.updateDynamic("targetTagName")(targetTagName.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(usePortal)) __obj.updateDynamic("usePortal")(usePortal.asInstanceOf[js.Any])
    if (wrapperTagName != null) __obj.updateDynamic("wrapperTagName")(wrapperTagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialITooltipProps]
  }
}

