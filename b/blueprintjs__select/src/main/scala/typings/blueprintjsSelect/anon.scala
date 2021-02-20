package typings.blueprintjsSelect

import typings.blueprintjsCore.inputGroupMod.IInputGroupProps
import typings.blueprintjsCore.intentMod.Intent
import typings.blueprintjsCore.popoverMod.PopoverInteractionKind
import typings.blueprintjsCore.popoverSharedPropsMod.PopoverPosition
import typings.blueprintjsCore.propsMod.HTMLInputProps
import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsCore.tagInputMod.TagInputAddMethod
import typings.blueprintjsCore.tagMod.ITagProps
import typings.blueprintjsIcons.iconNameMod.IconName
import typings.blueprintjsSelect.blueprintjsSelectBooleans.`false`
import typings.blueprintjsSelect.blueprintjsSelectStrings.first
import typings.blueprintjsSelect.blueprintjsSelectStrings.last
import typings.blueprintjsSelect.itemListRendererMod.IItemListRendererProps
import typings.blueprintjsSelect.itemListRendererMod.ItemListRenderer
import typings.blueprintjsSelect.itemRendererMod.IItemRendererProps
import typings.blueprintjsSelect.itemRendererMod.ItemRenderer
import typings.blueprintjsSelect.listItemsPropsMod.ItemsEqualProp
import typings.blueprintjsSelect.listItemsUtilsMod.ICreateNewItem
import typings.blueprintjsSelect.predicateMod.ItemListPredicate
import typings.blueprintjsSelect.predicateMod.ItemPredicate
import typings.popperJs.mod.Boundary
import typings.popperJs.mod.Modifiers
import typings.react.mod.ChangeEvent
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.HTMLAttributes
import typings.react.mod.HTMLProps
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Disabled extends StObject {
    
    var disabled: Boolean = js.native
    
    var resetOnQuery: Boolean = js.native
  }
  object Disabled {
    
    @scala.inline
    def apply(disabled: Boolean, resetOnQuery: Boolean): Disabled = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], resetOnQuery = resetOnQuery.asInstanceOf[js.Any])
      __obj.asInstanceOf[Disabled]
    }
    
    @scala.inline
    implicit class DisabledMutableBuilder[Self <: Disabled] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetOnQuery(value: Boolean): Self = StObject.set(x, "resetOnQuery", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Fill extends StObject {
    
    var fill: Boolean = js.native
    
    var placeholder: String = js.native
  }
  object Fill {
    
    @scala.inline
    def apply(fill: Boolean, placeholder: String): Fill = {
      val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fill]
    }
    
    @scala.inline
    implicit class FillMutableBuilder[Self <: Fill] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core.IOverlayProps> */
  @js.native
  trait PartialIOverlayProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var backdropClassName: js.UndefOr[String] = js.native
    
    var backdropProps: js.UndefOr[HTMLProps[HTMLDivElement]] = js.native
    
    var canEscapeKeyClose: js.UndefOr[Boolean] = js.native
    
    var canOutsideClickClose: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var enforceFocus: js.UndefOr[Boolean] = js.native
    
    var hasBackdrop: js.UndefOr[Boolean] = js.native
    
    var isOpen: js.UndefOr[Boolean] = js.native
    
    var `lazy`: js.UndefOr[Boolean] = js.native
    
    var onClose: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLElement, Event], Unit]] = js.native
    
    var onClosed: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
    
    var onClosing: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
    
    var onOpened: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
    
    var onOpening: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
    
    var portalClassName: js.UndefOr[String] = js.native
    
    var portalContainer: js.UndefOr[HTMLElement] = js.native
    
    var transitionDuration: js.UndefOr[Double] = js.native
    
    var transitionName: js.UndefOr[String] = js.native
    
    var usePortal: js.UndefOr[Boolean] = js.native
  }
  object PartialIOverlayProps {
    
    @scala.inline
    def apply(): PartialIOverlayProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIOverlayProps]
    }
    
    @scala.inline
    implicit class PartialIOverlayPropsMutableBuilder[Self <: PartialIOverlayProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setBackdropClassName(value: String): Self = StObject.set(x, "backdropClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropClassNameUndefined: Self = StObject.set(x, "backdropClassName", js.undefined)
      
      @scala.inline
      def setBackdropProps(value: HTMLProps[HTMLDivElement]): Self = StObject.set(x, "backdropProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropPropsUndefined: Self = StObject.set(x, "backdropProps", js.undefined)
      
      @scala.inline
      def setCanEscapeKeyClose(value: Boolean): Self = StObject.set(x, "canEscapeKeyClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanEscapeKeyCloseUndefined: Self = StObject.set(x, "canEscapeKeyClose", js.undefined)
      
      @scala.inline
      def setCanOutsideClickClose(value: Boolean): Self = StObject.set(x, "canOutsideClickClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanOutsideClickCloseUndefined: Self = StObject.set(x, "canOutsideClickClose", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setEnforceFocus(value: Boolean): Self = StObject.set(x, "enforceFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnforceFocusUndefined: Self = StObject.set(x, "enforceFocus", js.undefined)
      
      @scala.inline
      def setHasBackdrop(value: Boolean): Self = StObject.set(x, "hasBackdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasBackdropUndefined: Self = StObject.set(x, "hasBackdrop", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
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
      def setOnOpened(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onOpened", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenedUndefined: Self = StObject.set(x, "onOpened", js.undefined)
      
      @scala.inline
      def setOnOpening(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onOpening", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpeningUndefined: Self = StObject.set(x, "onOpening", js.undefined)
      
      @scala.inline
      def setPortalClassName(value: String): Self = StObject.set(x, "portalClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortalClassNameUndefined: Self = StObject.set(x, "portalClassName", js.undefined)
      
      @scala.inline
      def setPortalContainer(value: HTMLElement): Self = StObject.set(x, "portalContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortalContainerUndefined: Self = StObject.set(x, "portalContainer", js.undefined)
      
      @scala.inline
      def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setUsePortal(value: Boolean): Self = StObject.set(x, "usePortal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsePortalUndefined: Self = StObject.set(x, "usePortal", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core.IPopoverProps> */
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
  
  /* Inlined std.Partial<@blueprintjs/select.@blueprintjs/select/lib/esm/components/select/suggest.ISuggestProps<any>> */
  @js.native
  trait PartialISuggestPropsany extends StObject {
    
    var activeItem: js.UndefOr[js.Any | ICreateNewItem | Null] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var closeOnSelect: js.UndefOr[Boolean] = js.native
    
    var createNewItemFromQuery: js.UndefOr[js.Function1[/* query */ String, _]] = js.native
    
    var createNewItemPosition: js.UndefOr[first | last] = js.native
    
    var createNewItemRenderer: js.UndefOr[
        js.Function3[
          /* query */ String, 
          /* active */ Boolean, 
          /* handleClick */ MouseEventHandler[HTMLElement], 
          js.UndefOr[Element]
        ]
      ] = js.native
    
    var defaultSelectedItem: js.UndefOr[js.Any] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var fill: js.UndefOr[Boolean] = js.native
    
    var initialContent: js.UndefOr[ReactNode | Null] = js.native
    
    var inputProps: js.UndefOr[IInputGroupProps with HTMLInputProps] = js.native
    
    var inputValueRenderer: js.UndefOr[js.Function1[/* item */ js.Any, String]] = js.native
    
    var itemDisabled: js.UndefOr[
        (/* keyof any */ String) | (js.Function2[/* item */ js.Any, /* index */ Double, Boolean])
      ] = js.native
    
    var itemListPredicate: js.UndefOr[ItemListPredicate[_]] = js.native
    
    var itemListRenderer: js.UndefOr[ItemListRenderer[_]] = js.native
    
    var itemPredicate: js.UndefOr[ItemPredicate[_]] = js.native
    
    var itemRenderer: js.UndefOr[ItemRenderer[_]] = js.native
    
    var items: js.UndefOr[js.Array[_]] = js.native
    
    var itemsEqual: js.UndefOr[ItemsEqualProp[_]] = js.native
    
    var noResults: js.UndefOr[ReactNode] = js.native
    
    var onActiveItemChange: js.UndefOr[
        js.Function2[/* activeItem */ js.Any | Null, /* isCreateNewItem */ Boolean, Unit]
      ] = js.native
    
    var onItemSelect: js.UndefOr[
        js.Function2[/* item */ js.Any, /* event */ js.UndefOr[SyntheticEvent[HTMLElement, Event]], Unit]
      ] = js.native
    
    var onItemsPaste: js.UndefOr[js.Function1[/* items */ js.Array[_], Unit]] = js.native
    
    var onQueryChange: js.UndefOr[
        js.Function2[/* query */ String, /* event */ js.UndefOr[ChangeEvent[HTMLInputElement]], Unit]
      ] = js.native
    
    var openOnKeyDown: js.UndefOr[Boolean] = js.native
    
    var popoverProps: js.UndefOr[PartialIPopoverProps with js.Object] = js.native
    
    var query: js.UndefOr[String] = js.native
    
    var resetOnClose: js.UndefOr[Boolean] = js.native
    
    var resetOnQuery: js.UndefOr[Boolean] = js.native
    
    var resetOnSelect: js.UndefOr[Boolean] = js.native
    
    var scrollToActiveItem: js.UndefOr[Boolean] = js.native
    
    var selectedItem: js.UndefOr[js.Any | Null] = js.native
  }
  object PartialISuggestPropsany {
    
    @scala.inline
    def apply(): PartialISuggestPropsany = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialISuggestPropsany]
    }
    
    @scala.inline
    implicit class PartialISuggestPropsanyMutableBuilder[Self <: PartialISuggestPropsany] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveItem(value: js.Any | ICreateNewItem): Self = StObject.set(x, "activeItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveItemNull: Self = StObject.set(x, "activeItem", null)
      
      @scala.inline
      def setActiveItemUndefined: Self = StObject.set(x, "activeItem", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnSelectUndefined: Self = StObject.set(x, "closeOnSelect", js.undefined)
      
      @scala.inline
      def setCreateNewItemFromQuery(value: /* query */ String => _): Self = StObject.set(x, "createNewItemFromQuery", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateNewItemFromQueryUndefined: Self = StObject.set(x, "createNewItemFromQuery", js.undefined)
      
      @scala.inline
      def setCreateNewItemPosition(value: first | last): Self = StObject.set(x, "createNewItemPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateNewItemPositionUndefined: Self = StObject.set(x, "createNewItemPosition", js.undefined)
      
      @scala.inline
      def setCreateNewItemRenderer(
        value: (/* query */ String, /* active */ Boolean, /* handleClick */ MouseEventHandler[HTMLElement]) => js.UndefOr[Element]
      ): Self = StObject.set(x, "createNewItemRenderer", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCreateNewItemRendererUndefined: Self = StObject.set(x, "createNewItemRenderer", js.undefined)
      
      @scala.inline
      def setDefaultSelectedItem(value: js.Any): Self = StObject.set(x, "defaultSelectedItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSelectedItemUndefined: Self = StObject.set(x, "defaultSelectedItem", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setInitialContent(value: ReactNode): Self = StObject.set(x, "initialContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialContentNull: Self = StObject.set(x, "initialContent", null)
      
      @scala.inline
      def setInitialContentUndefined: Self = StObject.set(x, "initialContent", js.undefined)
      
      @scala.inline
      def setInputProps(value: IInputGroupProps with HTMLInputProps): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      @scala.inline
      def setInputValueRenderer(value: /* item */ js.Any => String): Self = StObject.set(x, "inputValueRenderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputValueRendererUndefined: Self = StObject.set(x, "inputValueRenderer", js.undefined)
      
      @scala.inline
      def setItemDisabled(value: (/* keyof any */ String) | (js.Function2[/* item */ js.Any, /* index */ Double, Boolean])): Self = StObject.set(x, "itemDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemDisabledFunction2(value: (/* item */ js.Any, /* index */ Double) => Boolean): Self = StObject.set(x, "itemDisabled", js.Any.fromFunction2(value))
      
      @scala.inline
      def setItemDisabledUndefined: Self = StObject.set(x, "itemDisabled", js.undefined)
      
      @scala.inline
      def setItemListPredicate(value: (/* query */ String, /* items */ js.Array[_]) => js.Array[_]): Self = StObject.set(x, "itemListPredicate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setItemListPredicateUndefined: Self = StObject.set(x, "itemListPredicate", js.undefined)
      
      @scala.inline
      def setItemListRenderer(value: /* itemListProps */ IItemListRendererProps[_] => Element | Null): Self = StObject.set(x, "itemListRenderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemListRendererUndefined: Self = StObject.set(x, "itemListRenderer", js.undefined)
      
      @scala.inline
      def setItemPredicate(
        value: (/* query */ String, _, /* index */ js.UndefOr[Double], /* exactMatch */ js.UndefOr[Boolean]) => Boolean
      ): Self = StObject.set(x, "itemPredicate", js.Any.fromFunction4(value))
      
      @scala.inline
      def setItemPredicateUndefined: Self = StObject.set(x, "itemPredicate", js.undefined)
      
      @scala.inline
      def setItemRenderer(value: (_, /* itemProps */ IItemRendererProps) => Element | Null): Self = StObject.set(x, "itemRenderer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setItemRendererUndefined: Self = StObject.set(x, "itemRenderer", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[_]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsEqual(value: ItemsEqualProp[_]): Self = StObject.set(x, "itemsEqual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsEqualFunction2(value: (_, _) => Boolean): Self = StObject.set(x, "itemsEqual", js.Any.fromFunction2(value))
      
      @scala.inline
      def setItemsEqualUndefined: Self = StObject.set(x, "itemsEqual", js.undefined)
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setNoResults(value: ReactNode): Self = StObject.set(x, "noResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoResultsUndefined: Self = StObject.set(x, "noResults", js.undefined)
      
      @scala.inline
      def setOnActiveItemChange(value: (/* activeItem */ js.Any | Null, /* isCreateNewItem */ Boolean) => Unit): Self = StObject.set(x, "onActiveItemChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnActiveItemChangeUndefined: Self = StObject.set(x, "onActiveItemChange", js.undefined)
      
      @scala.inline
      def setOnItemSelect(value: (/* item */ js.Any, /* event */ js.UndefOr[SyntheticEvent[HTMLElement, Event]]) => Unit): Self = StObject.set(x, "onItemSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnItemSelectUndefined: Self = StObject.set(x, "onItemSelect", js.undefined)
      
      @scala.inline
      def setOnItemsPaste(value: /* items */ js.Array[_] => Unit): Self = StObject.set(x, "onItemsPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnItemsPasteUndefined: Self = StObject.set(x, "onItemsPaste", js.undefined)
      
      @scala.inline
      def setOnQueryChange(value: (/* query */ String, /* event */ js.UndefOr[ChangeEvent[HTMLInputElement]]) => Unit): Self = StObject.set(x, "onQueryChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnQueryChangeUndefined: Self = StObject.set(x, "onQueryChange", js.undefined)
      
      @scala.inline
      def setOpenOnKeyDown(value: Boolean): Self = StObject.set(x, "openOnKeyDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenOnKeyDownUndefined: Self = StObject.set(x, "openOnKeyDown", js.undefined)
      
      @scala.inline
      def setPopoverProps(value: PartialIPopoverProps with js.Object): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setResetOnClose(value: Boolean): Self = StObject.set(x, "resetOnClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetOnCloseUndefined: Self = StObject.set(x, "resetOnClose", js.undefined)
      
      @scala.inline
      def setResetOnQuery(value: Boolean): Self = StObject.set(x, "resetOnQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetOnQueryUndefined: Self = StObject.set(x, "resetOnQuery", js.undefined)
      
      @scala.inline
      def setResetOnSelect(value: Boolean): Self = StObject.set(x, "resetOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetOnSelectUndefined: Self = StObject.set(x, "resetOnSelect", js.undefined)
      
      @scala.inline
      def setScrollToActiveItem(value: Boolean): Self = StObject.set(x, "scrollToActiveItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollToActiveItemUndefined: Self = StObject.set(x, "scrollToActiveItem", js.undefined)
      
      @scala.inline
      def setSelectedItem(value: js.Any): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemNull: Self = StObject.set(x, "selectedItem", null)
      
      @scala.inline
      def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core.ITagInputProps> */
  @js.native
  trait PartialITagInputProps extends StObject {
    
    var addOnBlur: js.UndefOr[Boolean] = js.native
    
    var addOnPaste: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var fill: js.UndefOr[Boolean] = js.native
    
    var inputProps: js.UndefOr[HTMLInputProps] = js.native
    
    var inputRef: js.UndefOr[js.Function1[/* input */ HTMLInputElement | Null, Unit]] = js.native
    
    var inputValue: js.UndefOr[String] = js.native
    
    var intent: js.UndefOr[Intent] = js.native
    
    var large: js.UndefOr[Boolean] = js.native
    
    var leftIcon: js.UndefOr[IconName | MaybeElement] = js.native
    
    var onAdd: js.UndefOr[
        js.Function2[/* values */ js.Array[String], /* method */ TagInputAddMethod, Boolean | Unit]
      ] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* values */ js.Array[ReactNode], Boolean | Unit]] = js.native
    
    var onInputChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
    
    var onKeyDown: js.UndefOr[
        js.Function2[/* event */ KeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double], Unit]
      ] = js.native
    
    var onKeyUp: js.UndefOr[
        js.Function2[/* event */ KeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double], Unit]
      ] = js.native
    
    var onRemove: js.UndefOr[js.Function2[/* value */ ReactNode, /* index */ Double, Unit]] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var rightElement: js.UndefOr[Element] = js.native
    
    var separator: js.UndefOr[String | RegExp | `false`] = js.native
    
    var tagProps: js.UndefOr[ITagProps | (js.Function2[/* value */ ReactNode, /* index */ Double, ITagProps])] = js.native
    
    var values: js.UndefOr[js.Array[ReactNode]] = js.native
  }
  object PartialITagInputProps {
    
    @scala.inline
    def apply(): PartialITagInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialITagInputProps]
    }
    
    @scala.inline
    implicit class PartialITagInputPropsMutableBuilder[Self <: PartialITagInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddOnBlur(value: Boolean): Self = StObject.set(x, "addOnBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddOnBlurUndefined: Self = StObject.set(x, "addOnBlur", js.undefined)
      
      @scala.inline
      def setAddOnPaste(value: Boolean): Self = StObject.set(x, "addOnPaste", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddOnPasteUndefined: Self = StObject.set(x, "addOnPaste", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setInputProps(value: HTMLInputProps): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      @scala.inline
      def setInputRef(value: /* input */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      @scala.inline
      def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
      
      @scala.inline
      def setIntent(value: Intent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
      
      @scala.inline
      def setLarge(value: Boolean): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      @scala.inline
      def setLeftIcon(value: IconName | MaybeElement): Self = StObject.set(x, "leftIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftIconNull: Self = StObject.set(x, "leftIcon", null)
      
      @scala.inline
      def setLeftIconUndefined: Self = StObject.set(x, "leftIcon", js.undefined)
      
      @scala.inline
      def setOnAdd(value: (/* values */ js.Array[String], /* method */ TagInputAddMethod) => Boolean | Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* values */ js.Array[ReactNode] => Boolean | Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnInputChange(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onInputChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputChangeUndefined: Self = StObject.set(x, "onInputChange", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: (/* event */ KeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: (/* event */ KeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnRemove(value: (/* value */ ReactNode, /* index */ Double) => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setRightElement(value: Element): Self = StObject.set(x, "rightElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightElementUndefined: Self = StObject.set(x, "rightElement", js.undefined)
      
      @scala.inline
      def setSeparator(value: String | RegExp | `false`): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setTagProps(value: ITagProps | (js.Function2[/* value */ ReactNode, /* index */ Double, ITagProps])): Self = StObject.set(x, "tagProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagPropsFunction2(value: (/* value */ ReactNode, /* index */ Double) => ITagProps): Self = StObject.set(x, "tagProps", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTagPropsUndefined: Self = StObject.set(x, "tagProps", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[ReactNode]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: ReactNode*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Readonly<{  children :react.react.ReactNode | undefined}> */
  @js.native
  trait ReadonlychildrenReactNode extends StObject {
    
    val children: js.UndefOr[ReactNode] = js.native
  }
  object ReadonlychildrenReactNode {
    
    @scala.inline
    def apply(): ReadonlychildrenReactNode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlychildrenReactNode]
    }
    
    @scala.inline
    implicit class ReadonlychildrenReactNodeMutableBuilder[Self <: ReadonlychildrenReactNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
