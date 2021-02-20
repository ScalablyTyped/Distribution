package typings.blueprintjsCore.anon

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/popover/popover.IPopoverProps> */
@js.native
trait PartialIPopoverProps extends StObject {
  
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
  implicit class PartialIPopoverPropsMutableBuilder[Self <: PartialIPopoverProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setBackdropProps(value: HTMLProps[HTMLDivElement]): Self = StObject.set(x, "backdropProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackdropPropsUndefined: Self = StObject.set(x, "backdropProps", js.undefined)
    
    @scala.inline
    def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    @scala.inline
    def setCanEscapeKeyClose(value: Boolean): Self = StObject.set(x, "canEscapeKeyClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanEscapeKeyCloseUndefined: Self = StObject.set(x, "canEscapeKeyClose", js.undefined)
    
    @scala.inline
    def setCaptureDismiss(value: Boolean): Self = StObject.set(x, "captureDismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureDismissUndefined: Self = StObject.set(x, "captureDismiss", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setContent(value: String | Element): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setDefaultIsOpen(value: Boolean): Self = StObject.set(x, "defaultIsOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultIsOpenUndefined: Self = StObject.set(x, "defaultIsOpen", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setEnforceFocus(value: Boolean): Self = StObject.set(x, "enforceFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforceFocusUndefined: Self = StObject.set(x, "enforceFocus", js.undefined)
    
    @scala.inline
    def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setHasBackdrop(value: Boolean): Self = StObject.set(x, "hasBackdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasBackdropUndefined: Self = StObject.set(x, "hasBackdrop", js.undefined)
    
    @scala.inline
    def setHoverCloseDelay(value: Double): Self = StObject.set(x, "hoverCloseDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverCloseDelayUndefined: Self = StObject.set(x, "hoverCloseDelay", js.undefined)
    
    @scala.inline
    def setHoverOpenDelay(value: Double): Self = StObject.set(x, "hoverOpenDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverOpenDelayUndefined: Self = StObject.set(x, "hoverOpenDelay", js.undefined)
    
    @scala.inline
    def setInheritDarkTheme(value: Boolean): Self = StObject.set(x, "inheritDarkTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritDarkThemeUndefined: Self = StObject.set(x, "inheritDarkTheme", js.undefined)
    
    @scala.inline
    def setInteractionKind(value: PopoverInteractionKind): Self = StObject.set(x, "interactionKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractionKindUndefined: Self = StObject.set(x, "interactionKind", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    
    @scala.inline
    def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
    
    @scala.inline
    def setMinimal(value: Boolean): Self = StObject.set(x, "minimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimalUndefined: Self = StObject.set(x, "minimal", js.undefined)
    
    @scala.inline
    def setModifiers(value: Modifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    @scala.inline
    def setOnClose(value: /* event */ SyntheticEvent[HTMLElement, Event] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setOnClosed(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onClosed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClosedUndefined: Self = StObject.set(x, "onClosed", js.undefined)
    
    @scala.inline
    def setOnClosing(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onClosing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClosingUndefined: Self = StObject.set(x, "onClosing", js.undefined)
    
    @scala.inline
    def setOnInteraction(
      value: (/* nextOpenState */ Boolean, /* e */ js.UndefOr[SyntheticEvent[HTMLElement, Event]]) => Unit
    ): Self = StObject.set(x, "onInteraction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnInteractionUndefined: Self = StObject.set(x, "onInteraction", js.undefined)
    
    @scala.inline
    def setOnOpened(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onOpened", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOpenedUndefined: Self = StObject.set(x, "onOpened", js.undefined)
    
    @scala.inline
    def setOnOpening(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onOpening", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOpeningUndefined: Self = StObject.set(x, "onOpening", js.undefined)
    
    @scala.inline
    def setOpenOnTargetFocus(value: Boolean): Self = StObject.set(x, "openOnTargetFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenOnTargetFocusUndefined: Self = StObject.set(x, "openOnTargetFocus", js.undefined)
    
    @scala.inline
    def setPopoverClassName(value: String): Self = StObject.set(x, "popoverClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopoverClassNameUndefined: Self = StObject.set(x, "popoverClassName", js.undefined)
    
    @scala.inline
    def setPopoverRef(value: /* ref */ HTMLElement | Null => Unit): Self = StObject.set(x, "popoverRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPopoverRefUndefined: Self = StObject.set(x, "popoverRef", js.undefined)
    
    @scala.inline
    def setPortalClassName(value: String): Self = StObject.set(x, "portalClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalClassNameUndefined: Self = StObject.set(x, "portalClassName", js.undefined)
    
    @scala.inline
    def setPortalContainer(value: HTMLElement): Self = StObject.set(x, "portalContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalContainerUndefined: Self = StObject.set(x, "portalContainer", js.undefined)
    
    @scala.inline
    def setPosition(value: PopoverPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setTarget(value: String | Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetClassName(value: String): Self = StObject.set(x, "targetClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetClassNameUndefined: Self = StObject.set(x, "targetClassName", js.undefined)
    
    @scala.inline
    def setTargetProps(value: HTMLAttributes[HTMLElement]): Self = StObject.set(x, "targetProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetPropsUndefined: Self = StObject.set(x, "targetProps", js.undefined)
    
    @scala.inline
    def setTargetTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = StObject.set(x, "targetTagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTagNameUndefined: Self = StObject.set(x, "targetTagName", js.undefined)
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    
    @scala.inline
    def setUsePortal(value: Boolean): Self = StObject.set(x, "usePortal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePortalUndefined: Self = StObject.set(x, "usePortal", js.undefined)
    
    @scala.inline
    def setWrapperTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = StObject.set(x, "wrapperTagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperTagNameUndefined: Self = StObject.set(x, "wrapperTagName", js.undefined)
  }
}
