package typings
package atBlueprintjsCoreLib.libEsmComponentsPopoverPopoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPopoverProps
  extends atBlueprintjsCoreLib.libEsmComponentsPopoverPopoverSharedPropsMod.IPopoverSharedProps {
  /** HTML props for the backdrop element. Can be combined with `backdropClassName`. */
  var backdropProps: js.UndefOr[reactLib.reactMod.HTMLProps[stdLib.HTMLDivElement]] = js.undefined
  /**
    * The content displayed inside the popover. This can instead be provided as
    * the _second_ element in `children` (first is `target`).
    */
  var content: js.UndefOr[java.lang.String | reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  /**
    * Whether the wrapper and target should take up the full width of their container.
    * Note that supplying `true` for this prop will force  `targetTagName="div"` and
    * `wrapperTagName="div"`.
    */
  var fill: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enables an invisible overlay beneath the popover that captures clicks and
    * prevents interaction with the rest of the document until the popover is
    * closed. This prop is only available when `interactionKind` is
    * `PopoverInteractionKind.CLICK`. When popovers with backdrop are opened,
    * they become focused.
    * @default false
    */
  var hasBackdrop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The kind of interaction that triggers the display of the popover.
    * @default PopoverInteractionKind.CLICK
    */
  var interactionKind: js.UndefOr[PopoverInteractionKind] = js.undefined
  /**
    * Whether to apply minimal styles to this popover, which includes removing
    * the arrow and adding `Classes.MINIMAL` to minimize and accelerate the
    * transitions.
    * @default false
    */
  var minimal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Ref supplied to the `Classes.POPOVER` element.
    */
  var popoverRef: js.UndefOr[js.Function1[/* ref */ stdLib.HTMLDivElement | scala.Null, scala.Unit]] = js.undefined
  /**
    * The target to which the popover content is attached. This can instead be
    * provided as the _first_ element in `children`.
    */
  var target: js.UndefOr[java.lang.String | reactLib.reactMod.Global.JSXNs.Element] = js.undefined
}

object IPopoverProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    backdropProps: reactLib.reactMod.HTMLProps[stdLib.HTMLDivElement] = null,
    boundary: popperDotJsLib.popperDotJsMod.Boundary = null,
    canEscapeKeyClose: js.UndefOr[scala.Boolean] = js.undefined,
    captureDismiss: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    content: java.lang.String | reactLib.reactMod.Global.JSXNs.Element = null,
    defaultIsOpen: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    enforceFocus: js.UndefOr[scala.Boolean] = js.undefined,
    fill: js.UndefOr[scala.Boolean] = js.undefined,
    hasBackdrop: js.UndefOr[scala.Boolean] = js.undefined,
    hoverCloseDelay: scala.Int | scala.Double = null,
    hoverOpenDelay: scala.Int | scala.Double = null,
    inheritDarkTheme: js.UndefOr[scala.Boolean] = js.undefined,
    interactionKind: PopoverInteractionKind = null,
    isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    `lazy`: js.UndefOr[scala.Boolean] = js.undefined,
    minimal: js.UndefOr[scala.Boolean] = js.undefined,
    modifiers: popperDotJsLib.popperDotJsMod.Modifiers = null,
    onClose: /* event */ js.UndefOr[reactLib.reactMod.SyntheticEvent[stdLib.HTMLElement, reactLib.Event]] => scala.Unit = null,
    onClosed: /* node */ stdLib.HTMLElement => scala.Unit = null,
    onClosing: /* node */ stdLib.HTMLElement => scala.Unit = null,
    onInteraction: (/* nextOpenState */ scala.Boolean, /* e */ js.UndefOr[reactLib.reactMod.SyntheticEvent[stdLib.HTMLElement, reactLib.Event]]) => scala.Unit = null,
    onOpened: /* node */ stdLib.HTMLElement => scala.Unit = null,
    onOpening: /* node */ stdLib.HTMLElement => scala.Unit = null,
    openOnTargetFocus: js.UndefOr[scala.Boolean] = js.undefined,
    popoverClassName: java.lang.String = null,
    popoverRef: /* ref */ stdLib.HTMLDivElement | scala.Null => scala.Unit = null,
    portalClassName: java.lang.String = null,
    portalContainer: stdLib.HTMLElement = null,
    position: atBlueprintjsCoreLib.libEsmComponentsPopoverPopoverSharedPropsMod.PopoverPosition = null,
    target: java.lang.String | reactLib.reactMod.Global.JSXNs.Element = null,
    targetClassName: java.lang.String = null,
    targetProps: reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement] = null,
    targetTagName: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 175 */ js.Any = null,
    transitionDuration: scala.Int | scala.Double = null,
    usePortal: js.UndefOr[scala.Boolean] = js.undefined,
    wrapperTagName: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 175 */ js.Any = null
  ): IPopoverProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (backdropProps != null) __obj.updateDynamic("backdropProps")(backdropProps)
    if (boundary != null) __obj.updateDynamic("boundary")(boundary)
    if (!js.isUndefined(canEscapeKeyClose)) __obj.updateDynamic("canEscapeKeyClose")(canEscapeKeyClose)
    if (!js.isUndefined(captureDismiss)) __obj.updateDynamic("captureDismiss")(captureDismiss)
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultIsOpen)) __obj.updateDynamic("defaultIsOpen")(defaultIsOpen)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(enforceFocus)) __obj.updateDynamic("enforceFocus")(enforceFocus)
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (!js.isUndefined(hasBackdrop)) __obj.updateDynamic("hasBackdrop")(hasBackdrop)
    if (hoverCloseDelay != null) __obj.updateDynamic("hoverCloseDelay")(hoverCloseDelay.asInstanceOf[js.Any])
    if (hoverOpenDelay != null) __obj.updateDynamic("hoverOpenDelay")(hoverOpenDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(inheritDarkTheme)) __obj.updateDynamic("inheritDarkTheme")(inheritDarkTheme)
    if (interactionKind != null) __obj.updateDynamic("interactionKind")(interactionKind)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (!js.isUndefined(minimal)) __obj.updateDynamic("minimal")(minimal)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onClosed != null) __obj.updateDynamic("onClosed")(js.Any.fromFunction1(onClosed))
    if (onClosing != null) __obj.updateDynamic("onClosing")(js.Any.fromFunction1(onClosing))
    if (onInteraction != null) __obj.updateDynamic("onInteraction")(js.Any.fromFunction2(onInteraction))
    if (onOpened != null) __obj.updateDynamic("onOpened")(js.Any.fromFunction1(onOpened))
    if (onOpening != null) __obj.updateDynamic("onOpening")(js.Any.fromFunction1(onOpening))
    if (!js.isUndefined(openOnTargetFocus)) __obj.updateDynamic("openOnTargetFocus")(openOnTargetFocus)
    if (popoverClassName != null) __obj.updateDynamic("popoverClassName")(popoverClassName)
    if (popoverRef != null) __obj.updateDynamic("popoverRef")(js.Any.fromFunction1(popoverRef))
    if (portalClassName != null) __obj.updateDynamic("portalClassName")(portalClassName)
    if (portalContainer != null) __obj.updateDynamic("portalContainer")(portalContainer)
    if (position != null) __obj.updateDynamic("position")(position)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetClassName != null) __obj.updateDynamic("targetClassName")(targetClassName)
    if (targetProps != null) __obj.updateDynamic("targetProps")(targetProps)
    if (targetTagName != null) __obj.updateDynamic("targetTagName")(targetTagName)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(usePortal)) __obj.updateDynamic("usePortal")(usePortal)
    if (wrapperTagName != null) __obj.updateDynamic("wrapperTagName")(wrapperTagName)
    __obj.asInstanceOf[IPopoverProps]
  }
}

