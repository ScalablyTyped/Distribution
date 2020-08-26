package typings.blueprintjsCore.popoverSharedPropsMod

import typings.blueprintjsCore.overlayMod.IOverlayableProps
import typings.blueprintjsCore.propsMod.IProps
import typings.popperJs.mod.Boundary
import typings.popperJs.mod.Modifiers
import typings.react.mod.HTMLAttributes
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPopoverSharedProps
  extends IOverlayableProps
     with IProps {
  /**
    * Determines the boundary element used by Popper for its `flip` and
    * `preventOverflow` modifiers. Three shorthand keywords are supported;
    * Popper will find the correct DOM element itself.
    * @default "scrollParent"
    */
  var boundary: js.UndefOr[Boundary] = js.native
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
    * Whether the popover is visible. Passing this prop puts the popover in
    * controlled mode, where the only way to change visibility is by updating
    * this property. If `disabled={true}`, this prop will be ignored, and the
    * popover will remain closed.
    * @default undefined
    */
  var isOpen: js.UndefOr[Boolean] = js.native
  /**
    * Popper modifier options, passed directly to internal Popper instance. See
    * https://popper.js.org/docs/modifiers/ for complete
    * details.
    */
  var modifiers: js.UndefOr[Modifiers] = js.native
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
    * The position (relative to the target) at which the popover should appear.
    *
    * The default value of `"auto"` will choose the best position when opened
    * and will allow the popover to reposition itself to remain onscreen as the
    * user scrolls around.
    * @default "auto"
    */
  var position: js.UndefOr[PopoverPosition] = js.native
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
    * HTML tag name for the wrapper element, which also receives the
    * `className` prop.
    * @default "span"
    */
  var wrapperTagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.native
}

object IPopoverSharedProps {
  @scala.inline
  def apply(): IPopoverSharedProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPopoverSharedProps]
  }
  @scala.inline
  implicit class IPopoverSharedPropsOps[Self <: IPopoverSharedProps] (val x: Self) extends AnyVal {
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
    def setBoundary(value: Boundary): Self = this.set("boundary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundary: Self = this.set("boundary", js.undefined)
    @scala.inline
    def setCaptureDismiss(value: Boolean): Self = this.set("captureDismiss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptureDismiss: Self = this.set("captureDismiss", js.undefined)
    @scala.inline
    def setDefaultIsOpen(value: Boolean): Self = this.set("defaultIsOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultIsOpen: Self = this.set("defaultIsOpen", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
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
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    @scala.inline
    def setModifiers(value: Modifiers): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
    @scala.inline
    def setOnInteraction(
      value: (/* nextOpenState */ Boolean, /* e */ js.UndefOr[SyntheticEvent[HTMLElement, Event]]) => Unit
    ): Self = this.set("onInteraction", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnInteraction: Self = this.set("onInteraction", js.undefined)
    @scala.inline
    def setOpenOnTargetFocus(value: Boolean): Self = this.set("openOnTargetFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenOnTargetFocus: Self = this.set("openOnTargetFocus", js.undefined)
    @scala.inline
    def setPopoverClassName(value: String): Self = this.set("popoverClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopoverClassName: Self = this.set("popoverClassName", js.undefined)
    @scala.inline
    def setPosition(value: PopoverPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
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
    def setWrapperTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = this.set("wrapperTagName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapperTagName: Self = this.set("wrapperTagName", js.undefined)
  }
  
}

