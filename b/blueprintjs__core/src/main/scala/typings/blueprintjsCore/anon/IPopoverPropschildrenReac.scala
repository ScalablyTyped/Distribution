package typings.blueprintjsCore.anon

import typings.blueprintjsCore.popoverMod.PopoverInteractionKind
import typings.blueprintjsCore.popoverSharedPropsMod.PopoverPosition
import typings.popperJs.mod.Boundary
import typings.popperJs.mod.Modifiers
import typings.react.mod.HTMLAttributes
import typings.react.mod.HTMLProps
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @blueprintjs/core.@blueprintjs/core/lib/esm/components/popover/popover.IPopoverProps & {  children :react.react.ReactNode | undefined} */
@js.native
trait IPopoverPropschildrenReac extends js.Object {
  /**
    * Whether the overlay should acquire application focus when it first opens.
    * @default true
    */
  var autoFocus: js.UndefOr[Boolean] = js.native
  /** HTML props for the backdrop element. Can be combined with `backdropClassName`. */
  var backdropProps: js.UndefOr[HTMLProps[HTMLDivElement]] = js.native
  /**
    * Determines the boundary element used by Popper for its `flip` and
    * `preventOverflow` modifiers. Three shorthand keywords are supported;
    * Popper will find the correct DOM element itself.
    * @default "scrollParent"
    */
  var boundary: js.UndefOr[Boundary] = js.native
  /**
    * Whether pressing the `esc` key should invoke `onClose`.
    * @default true
    */
  var canEscapeKeyClose: js.UndefOr[Boolean] = js.native
  /**
    * When enabled, `preventDefault()` is invoked on `click` events that close
    * this popover, which will prevent those clicks from closing outer
    * popovers. When disabled, clicking inside a `Classes.POPOVER_DISMISS`
    * element will close the parent popover.
    *
    * See http://blueprintjs.com/docs/#core/components/popover.closing-on-click
    * @default false
    */
  var captureDismiss: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  /** A space-delimited list of class names to pass along to a child element. */
  var className: js.UndefOr[String] = js.native
  /**
    * The content displayed inside the popover. This can instead be provided as
    * the _second_ element in `children` (first is `target`).
    */
  var content: js.UndefOr[String | Element] = js.native
  /**
    * Initial opened state when uncontrolled.
    * @default false
    */
  var defaultIsOpen: js.UndefOr[Boolean] = js.native
  /**
    * Prevents the popover from appearing when `true`.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the overlay should prevent focus from leaving itself. That is, if the user attempts
    * to focus an element outside the overlay and this prop is enabled, then the overlay will
    * immediately bring focus back to itself. If you are nesting overlay components, either disable
    * this prop on the "outermost" overlays or mark the nested ones `usePortal={false}`.
    * @default true
    */
  var enforceFocus: js.UndefOr[Boolean] = js.native
  /**
    * Whether the wrapper and target should take up the full width of their container.
    * Note that supplying `true` for this prop will force  `targetTagName="div"` and
    * `wrapperTagName="div"`.
    */
  var fill: js.UndefOr[Boolean] = js.native
  /**
    * Enables an invisible overlay beneath the popover that captures clicks and
    * prevents interaction with the rest of the document until the popover is
    * closed. This prop is only available when `interactionKind` is
    * `PopoverInteractionKind.CLICK`. When popovers with backdrop are opened,
    * they become focused.
    * @default false
    */
  var hasBackdrop: js.UndefOr[Boolean] = js.native
  /**
    * The amount of time in milliseconds the popover should remain open after
    * the user hovers off the trigger. The timer is canceled if the user mouses
    * over the target before it expires.
    * @default 300
    */
  var hoverCloseDelay: js.UndefOr[Double] = js.native
  /**
    * The amount of time in milliseconds the popover should wait before opening
    * after the user hovers over the trigger. The timer is canceled if the user
    * mouses away from the target before it expires.
    * @default 150
    */
  var hoverOpenDelay: js.UndefOr[Double] = js.native
  /**
    * Whether a popover that uses a `Portal` should automatically inherit the
    * dark theme from its parent.
    * @default true
    */
  var inheritDarkTheme: js.UndefOr[Boolean] = js.native
  /**
    * The kind of interaction that triggers the display of the popover.
    * @default PopoverInteractionKind.CLICK
    */
  var interactionKind: js.UndefOr[PopoverInteractionKind] = js.native
  /**
    * Whether the popover is visible. Passing this prop puts the popover in
    * controlled mode, where the only way to change visibility is by updating
    * this property. If `disabled={true}`, this prop will be ignored, and the
    * popover will remain closed.
    * @default undefined
    */
  var isOpen: js.UndefOr[Boolean] = js.native
  /**
    * If `true` and `usePortal={true}`, the `Portal` containing the children is created and attached
    * to the DOM when the overlay is opened for the first time; otherwise this happens when the
    * component mounts. Lazy mounting provides noticeable performance improvements if you have lots
    * of overlays at once, such as on each row of a table.
    * @default true
    */
  var `lazy`: js.UndefOr[Boolean] = js.native
  /**
    * Whether to apply minimal styles to this popover, which includes removing
    * the arrow and adding `Classes.MINIMAL` to minimize and accelerate the
    * transitions.
    * @default false
    */
  var minimal: js.UndefOr[Boolean] = js.native
  /**
    * Popper modifier options, passed directly to internal Popper instance. See
    * https://popper.js.org/docs/modifiers/ for complete
    * details.
    */
  var modifiers: js.UndefOr[Modifiers] = js.native
  /**
    * A callback that is invoked when user interaction causes the overlay to close, such as
    * clicking on the overlay or pressing the `esc` key (if enabled).
    *
    * Receives the event from the user's interaction, if there was an event (generally either a
    * mouse or key event). Note that, since this component is controlled by the `isOpen` prop, it
    * will not actually close itself until that prop becomes `false`.
    */
  var onClose: js.UndefOr[js.Function1[/* event */ js.UndefOr[SyntheticEvent[HTMLElement, Event]], Unit]] = js.native
  /**
    * Lifecycle method invoked just after the CSS _close_ transition ends but
    * before the child has been removed from the DOM. Receives the DOM element
    * of the child being closed.
    */
  var onClosed: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
  /**
    * Lifecycle method invoked just before the CSS _close_ transition begins on
    * a child. Receives the DOM element of the child being closed.
    */
  var onClosing: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
  /**
    * Callback invoked in controlled mode when the popover open state *would*
    * change due to user interaction.
    */
  var onInteraction: js.UndefOr[
    js.Function2[
      /* nextOpenState */ Boolean, 
      /* e */ js.UndefOr[SyntheticEvent[HTMLElement, Event]], 
      Unit
    ]
  ] = js.native
  /**
    * Lifecycle method invoked just after the CSS _open_ transition ends.
    * Receives the DOM element of the child being opened.
    */
  var onOpened: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
  /**
    * Lifecycle method invoked just after mounting the child in the DOM but
    * just before the CSS _open_ transition begins. Receives the DOM element of
    * the child being opened.
    */
  var onOpening: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
  /**
    * Whether the popover should open when its target is focused. If `true`,
    * target will render with `tabindex="0"` to make it focusable via keyboard
    * navigation.
    * @default true
    */
  var openOnTargetFocus: js.UndefOr[Boolean] = js.native
  /**
    * A space-delimited string of class names applied to the popover element.
    */
  var popoverClassName: js.UndefOr[String] = js.native
  /**
    * Ref supplied to the `Classes.POPOVER` element.
    */
  var popoverRef: js.UndefOr[js.Function1[/* ref */ HTMLDivElement | Null, Unit]] = js.native
  /**
    * Space-delimited string of class names applied to the `Portal` element if
    * `usePortal={true}`.
    */
  var portalClassName: js.UndefOr[String] = js.native
  /**
    * The container element into which the overlay renders its contents, when `usePortal` is `true`.
    * This prop is ignored if `usePortal` is `false`.
    * @default document.body
    */
  var portalContainer: js.UndefOr[HTMLElement] = js.native
  /**
    * The position (relative to the target) at which the popover should appear.
    *
    * The default value of `"auto"` will choose the best position when opened
    * and will allow the popover to reposition itself to remain onscreen as the
    * user scrolls around.
    * @default "auto"
    */
  var position: js.UndefOr[PopoverPosition] = js.native
  /**
    * The target to which the popover content is attached. This can instead be
    * provided as the _first_ element in `children`.
    */
  var target: js.UndefOr[String | Element] = js.native
  /**
    * Space-delimited string of class names applied to the target element.
    */
  var targetClassName: js.UndefOr[String] = js.native
  /**
    * HTML props to spread to target element. Use `targetTagName` to change
    * the type of element rendered. Note that `ref` is not supported.
    */
  var targetProps: js.UndefOr[HTMLAttributes[HTMLElement]] = js.native
  /**
    * HTML tag name for the target element. This must be an HTML element to
    * ensure that it supports the necessary DOM event handlers.
    *
    * By default, a `<span>` tag is used so popovers appear as inline-block
    * elements and can be nested in text. Use `<div>` tag for a block element.
    * @default "span"
    */
  var targetTagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.native
  /**
    * Indicates how long (in milliseconds) the overlay's enter/leave transition takes.
    * This is used by React `CSSTransition` to know when a transition completes and must match
    * the duration of the animation in CSS. Only set this prop if you override Blueprint's default
    * transitions with new transitions of a different length.
    * @default 300
    */
  var transitionDuration: js.UndefOr[Double] = js.native
  /**
    * Whether the popover should be rendered inside a `Portal` attached to
    * `portalContainer` prop.
    *
    * Rendering content inside a `Portal` allows the popover content to escape
    * the physical bounds of its parent while still being positioned correctly
    * relative to its target. Using a `Portal` is necessary if any ancestor of
    * the target hides overflow or uses very complex positioning.
    *
    * Not using a `Portal` can result in smoother performance when scrolling
    * and allows the popover content to inherit CSS styles from surrounding
    * elements, but it remains subject to the overflow bounds of its ancestors.
    * @default true
    */
  var usePortal: js.UndefOr[Boolean] = js.native
  /**
    * HTML tag name for the wrapper element, which also receives the
    * `className` prop.
    * @default "span"
    */
  var wrapperTagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.native
}

object IPopoverPropschildrenReac {
  @scala.inline
  def apply(): IPopoverPropschildrenReac = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPopoverPropschildrenReac]
  }
  @scala.inline
  implicit class IPopoverPropschildrenReacOps[Self <: IPopoverPropschildrenReac] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setBackdropProps(value: HTMLProps[HTMLDivElement]): Self = this.set("backdropProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdropProps: Self = this.set("backdropProps", js.undefined)
    @scala.inline
    def setBoundary(value: Boundary): Self = this.set("boundary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundary: Self = this.set("boundary", js.undefined)
    @scala.inline
    def setCanEscapeKeyClose(value: Boolean): Self = this.set("canEscapeKeyClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanEscapeKeyClose: Self = this.set("canEscapeKeyClose", js.undefined)
    @scala.inline
    def setCaptureDismiss(value: Boolean): Self = this.set("captureDismiss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptureDismiss: Self = this.set("captureDismiss", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContent(value: String | Element): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDefaultIsOpen(value: Boolean): Self = this.set("defaultIsOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultIsOpen: Self = this.set("defaultIsOpen", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setEnforceFocus(value: Boolean): Self = this.set("enforceFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnforceFocus: Self = this.set("enforceFocus", js.undefined)
    @scala.inline
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setHasBackdrop(value: Boolean): Self = this.set("hasBackdrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasBackdrop: Self = this.set("hasBackdrop", js.undefined)
    @scala.inline
    def setHoverCloseDelay(value: Double): Self = this.set("hoverCloseDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverCloseDelay: Self = this.set("hoverCloseDelay", js.undefined)
    @scala.inline
    def setHoverOpenDelay(value: Double): Self = this.set("hoverOpenDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverOpenDelay: Self = this.set("hoverOpenDelay", js.undefined)
    @scala.inline
    def setInheritDarkTheme(value: Boolean): Self = this.set("inheritDarkTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInheritDarkTheme: Self = this.set("inheritDarkTheme", js.undefined)
    @scala.inline
    def setInteractionKind(value: PopoverInteractionKind): Self = this.set("interactionKind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractionKind: Self = this.set("interactionKind", js.undefined)
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    @scala.inline
    def setLazy(value: Boolean): Self = this.set("lazy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLazy: Self = this.set("lazy", js.undefined)
    @scala.inline
    def setMinimal(value: Boolean): Self = this.set("minimal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimal: Self = this.set("minimal", js.undefined)
    @scala.inline
    def setModifiers(value: Modifiers): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
    @scala.inline
    def setOnClose(value: /* event */ js.UndefOr[SyntheticEvent[HTMLElement, Event]] => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnClosed(value: /* node */ HTMLElement => Unit): Self = this.set("onClosed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClosed: Self = this.set("onClosed", js.undefined)
    @scala.inline
    def setOnClosing(value: /* node */ HTMLElement => Unit): Self = this.set("onClosing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClosing: Self = this.set("onClosing", js.undefined)
    @scala.inline
    def setOnInteraction(
      value: (/* nextOpenState */ Boolean, /* e */ js.UndefOr[SyntheticEvent[HTMLElement, Event]]) => Unit
    ): Self = this.set("onInteraction", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnInteraction: Self = this.set("onInteraction", js.undefined)
    @scala.inline
    def setOnOpened(value: /* node */ HTMLElement => Unit): Self = this.set("onOpened", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOpened: Self = this.set("onOpened", js.undefined)
    @scala.inline
    def setOnOpening(value: /* node */ HTMLElement => Unit): Self = this.set("onOpening", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOpening: Self = this.set("onOpening", js.undefined)
    @scala.inline
    def setOpenOnTargetFocus(value: Boolean): Self = this.set("openOnTargetFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenOnTargetFocus: Self = this.set("openOnTargetFocus", js.undefined)
    @scala.inline
    def setPopoverClassName(value: String): Self = this.set("popoverClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopoverClassName: Self = this.set("popoverClassName", js.undefined)
    @scala.inline
    def setPopoverRef(value: /* ref */ HTMLDivElement | Null => Unit): Self = this.set("popoverRef", js.Any.fromFunction1(value))
    @scala.inline
    def deletePopoverRef: Self = this.set("popoverRef", js.undefined)
    @scala.inline
    def setPortalClassName(value: String): Self = this.set("portalClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortalClassName: Self = this.set("portalClassName", js.undefined)
    @scala.inline
    def setPortalContainer(value: HTMLElement): Self = this.set("portalContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortalContainer: Self = this.set("portalContainer", js.undefined)
    @scala.inline
    def setPosition(value: PopoverPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setTarget(value: String | Element): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTargetClassName(value: String): Self = this.set("targetClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetClassName: Self = this.set("targetClassName", js.undefined)
    @scala.inline
    def setTargetProps(value: HTMLAttributes[HTMLElement]): Self = this.set("targetProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetProps: Self = this.set("targetProps", js.undefined)
    @scala.inline
    def setTargetTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = this.set("targetTagName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetTagName: Self = this.set("targetTagName", js.undefined)
    @scala.inline
    def setTransitionDuration(value: Double): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
    @scala.inline
    def setUsePortal(value: Boolean): Self = this.set("usePortal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsePortal: Self = this.set("usePortal", js.undefined)
    @scala.inline
    def setWrapperTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = this.set("wrapperTagName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapperTagName: Self = this.set("wrapperTagName", js.undefined)
  }
  
}

