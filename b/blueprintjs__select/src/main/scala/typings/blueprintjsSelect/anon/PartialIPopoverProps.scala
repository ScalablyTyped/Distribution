package typings.blueprintjsSelect.anon

import typings.blueprintjsCore.popoverMod.PopoverInteractionKind
import typings.blueprintjsCore.popoverSharedPropsMod.PopoverPosition
import typings.popperJs.mod.Boundary
import typings.popperJs.mod.Modifiers
import typings.react.mod.HTMLAttributes
import typings.react.mod.HTMLProps
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core.IPopoverProps> */
@js.native
trait PartialIPopoverProps extends js.Object {
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var backdropProps: js.UndefOr[HTMLProps[HTMLDivElement]] = js.native
  
  var boundary: js.UndefOr[Boundary] = js.native
  
  var canEscapeKeyClose: js.UndefOr[Boolean] = js.native
  
  var captureDismiss: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var content: js.UndefOr[String | Element] = js.native
  
  var defaultIsOpen: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var enforceFocus: js.UndefOr[Boolean] = js.native
  
  var fill: js.UndefOr[Boolean] = js.native
  
  var hasBackdrop: js.UndefOr[Boolean] = js.native
  
  var hoverCloseDelay: js.UndefOr[Double] = js.native
  
  var hoverOpenDelay: js.UndefOr[Double] = js.native
  
  var inheritDarkTheme: js.UndefOr[Boolean] = js.native
  
  var interactionKind: js.UndefOr[PopoverInteractionKind] = js.native
  
  var isOpen: js.UndefOr[Boolean] = js.native
  
  var `lazy`: js.UndefOr[Boolean] = js.native
  
  var minimal: js.UndefOr[Boolean] = js.native
  
  var modifiers: js.UndefOr[Modifiers] = js.native
  
  var onClose: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLElement, Event], Unit]] = js.native
  
  var onClosed: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
  
  var onClosing: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
  
  var onInteraction: js.UndefOr[
    js.Function2[
      /* nextOpenState */ Boolean, 
      /* e */ js.UndefOr[SyntheticEvent[HTMLElement, Event]], 
      Unit
    ]
  ] = js.native
  
  var onOpened: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
  
  var onOpening: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
  
  var openOnTargetFocus: js.UndefOr[Boolean] = js.native
  
  var popoverClassName: js.UndefOr[String] = js.native
  
  var popoverRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, Unit]] = js.native
  
  var portalClassName: js.UndefOr[String] = js.native
  
  var portalContainer: js.UndefOr[HTMLElement] = js.native
  
  var position: js.UndefOr[PopoverPosition] = js.native
  
  var target: js.UndefOr[String | Element] = js.native
  
  var targetClassName: js.UndefOr[String] = js.native
  
  var targetProps: js.UndefOr[HTMLAttributes[HTMLElement]] = js.native
  
  var targetTagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.native
  
  var transitionDuration: js.UndefOr[Double] = js.native
  
  var usePortal: js.UndefOr[Boolean] = js.native
  
  var wrapperTagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.native
}
object PartialIPopoverProps {
  
  @scala.inline
  def apply(): PartialIPopoverProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIPopoverProps]
  }
  
  @scala.inline
  implicit class PartialIPopoverPropsOps[Self <: PartialIPopoverProps] (val x: Self) extends AnyVal {
    
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
    def setOnClose(value: /* event */ SyntheticEvent[HTMLElement, Event] => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    
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
    def setPopoverRef(value: /* ref */ HTMLElement | Null => Unit): Self = this.set("popoverRef", js.Any.fromFunction1(value))
    
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
