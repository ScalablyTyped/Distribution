package typings.blueprintjsCore

import typings.blueprintjsCore.anon.IPopoverPropschildrenReac
import typings.blueprintjsCore.blueprintjsCoreStrings.`click-target`
import typings.blueprintjsCore.blueprintjsCoreStrings.`hover-target`
import typings.blueprintjsCore.blueprintjsCoreStrings.click
import typings.blueprintjsCore.blueprintjsCoreStrings.hover
import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.popoverSharedPropsMod.IPopoverSharedProps
import typings.react.mod.HTMLProps
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/popover/popover", "Popover")
  @js.native
  class Popover protected ()
    extends AbstractPureComponent2[IPopoverProps, IPopoverState, js.Object] {
    def this(props: IPopoverProps) = this()
    def this(props: IPopoverProps, context: js.Any) = this()
    
    var cancelOpenTimeout: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPopover(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPopover(props: IPopoverProps, state: IPopoverState): Unit = js.native
    
    var getIsOpen: js.Any = js.native
    
    var getPopperModifiers: js.Any = js.native
    
    var handleMouseEnter: js.Any = js.native
    
    var handleMouseLeave: js.Any = js.native
    
    var handleOverlayClose: js.Any = js.native
    
    var handlePopoverClick: js.Any = js.native
    
    var handleTargetBlur: js.Any = js.native
    
    var handleTargetClick: js.Any = js.native
    
    var handleTargetFocus: js.Any = js.native
    
    var isArrowEnabled: js.Any = js.native
    
    var isControlled: js.Any = js.native
    
    var isElementInPopover: js.Any = js.native
    
    var isHoverInteractionKind: js.Any = js.native
    
    var isMouseInTargetOrPopover: js.Any = js.native
    
    var lostFocusOnSamePage: js.Any = js.native
    
    /**
      * DOM element that contains the popover.
      * When `usePortal={true}`, this element will be portaled outside the usual DOM flow,
      * so this reference can be very useful for testing.
      */
    var popoverElement: HTMLElement | Null = js.native
    
    var popoverRef: js.Any = js.native
    
    var popperScheduleUpdate: js.Any = js.native
    
    var refHandlers: js.Any = js.native
    
    var renderPopover: js.Any = js.native
    
    var renderTarget: js.Any = js.native
    
    /**
      * Instance method to instruct the `Popover` to recompute its position.
      *
      * This method should only be used if you are updating the target in a way
      * that does not cause it to re-render, such as changing its _position_
      * without changing its _size_ (since `Popover` already repositions when it
      * detects a resize).
      */
    def reposition(): js.UndefOr[Unit] = js.native
    
    var setOpenState: js.Any = js.native
    
    /** DOM element that contains the target. */
    var targetElement: HTMLElement | Null = js.native
    
    var understandChildren: js.Any = js.native
    
    var updateDarkParent: js.Any = js.native
    
    /** Popper modifier that updates React state (for style properties) based on latest data. */
    var updatePopoverState: js.Any = js.native
    
    /* protected */ def validateProps(props: IPopoverPropschildrenReac): Unit = js.native
  }
  /* static members */
  object Popover {
    
    @JSImport("@blueprintjs/core/lib/esm/components/popover/popover", "Popover")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/popover/popover", "Popover.defaultProps")
    @js.native
    def defaultProps: IPopoverProps = js.native
    @scala.inline
    def defaultProps_=(x: IPopoverProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/popover/popover", "Popover.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined {  CLICK :'click',   CLICK_TARGET_ONLY :'click-target',   HOVER :'hover',   HOVER_TARGET_ONLY :'hover-target'}[keyof {  CLICK :'click',   CLICK_TARGET_ONLY :'click-target',   HOVER :'hover',   HOVER_TARGET_ONLY :'hover-target'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.blueprintjsCore.blueprintjsCoreStrings.click
    - typings.blueprintjsCore.blueprintjsCoreStrings.`click-target`
    - typings.blueprintjsCore.blueprintjsCoreStrings.hover
    - typings.blueprintjsCore.blueprintjsCoreStrings.`hover-target`
  */
  trait PopoverInteractionKind extends StObject
  object PopoverInteractionKind {
    
    @JSImport("@blueprintjs/core/lib/esm/components/popover/popover", "PopoverInteractionKind")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/popover/popover", "PopoverInteractionKind.CLICK")
    @js.native
    def CLICK: click = js.native
    @scala.inline
    def CLICK_=(x: click): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLICK")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/popover/popover", "PopoverInteractionKind.CLICK_TARGET_ONLY")
    @js.native
    def CLICK_TARGET_ONLY: `click-target` = js.native
    @scala.inline
    def CLICK_TARGET_ONLY_=(x: `click-target`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLICK_TARGET_ONLY")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/popover/popover", "PopoverInteractionKind.HOVER")
    @js.native
    def HOVER: hover = js.native
    @scala.inline
    def HOVER_=(x: hover): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOVER")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/popover/popover", "PopoverInteractionKind.HOVER_TARGET_ONLY")
    @js.native
    def HOVER_TARGET_ONLY: `hover-target` = js.native
    @scala.inline
    def HOVER_TARGET_ONLY_=(x: `hover-target`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOVER_TARGET_ONLY")(x.asInstanceOf[js.Any])
  }
  
  trait IPopoverProps
    extends StObject
       with IPopoverSharedProps {
    
    /** HTML props for the backdrop element. Can be combined with `backdropClassName`. */
    var backdropProps: js.UndefOr[HTMLProps[HTMLDivElement]] = js.undefined
    
    /**
      * The content displayed inside the popover. This can instead be provided as
      * the _second_ element in `children` (first is `target`).
      */
    var content: js.UndefOr[String | Element] = js.undefined
    
    /**
      * Whether the wrapper and target should take up the full width of their container.
      * Note that supplying `true` for this prop will force  `targetTagName="div"` and
      * `wrapperTagName="div"`.
      */
    var fill: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables an invisible overlay beneath the popover that captures clicks and
      * prevents interaction with the rest of the document until the popover is
      * closed. This prop is only available when `interactionKind` is
      * `PopoverInteractionKind.CLICK`. When popovers with backdrop are opened,
      * they become focused.
      * @default false
      */
    var hasBackdrop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The kind of interaction that triggers the display of the popover.
      * @default PopoverInteractionKind.CLICK
      */
    var interactionKind: js.UndefOr[PopoverInteractionKind] = js.undefined
    
    /**
      * Ref supplied to the `Classes.POPOVER` element.
      */
    var popoverRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, Unit]] = js.undefined
    
    /**
      * The target to which the popover content is attached. This can instead be
      * provided as the _first_ element in `children`.
      */
    var target: js.UndefOr[String | Element] = js.undefined
  }
  object IPopoverProps {
    
    @scala.inline
    def apply(): IPopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPopoverProps]
    }
    
    @scala.inline
    implicit class IPopoverPropsMutableBuilder[Self <: IPopoverProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackdropProps(value: HTMLProps[HTMLDivElement]): Self = StObject.set(x, "backdropProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropPropsUndefined: Self = StObject.set(x, "backdropProps", js.undefined)
      
      @scala.inline
      def setContent(value: String | Element): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setHasBackdrop(value: Boolean): Self = StObject.set(x, "hasBackdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasBackdropUndefined: Self = StObject.set(x, "hasBackdrop", js.undefined)
      
      @scala.inline
      def setInteractionKind(value: PopoverInteractionKind): Self = StObject.set(x, "interactionKind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteractionKindUndefined: Self = StObject.set(x, "interactionKind", js.undefined)
      
      @scala.inline
      def setPopoverRef(value: /* ref */ HTMLElement | Null => Unit): Self = StObject.set(x, "popoverRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPopoverRefUndefined: Self = StObject.set(x, "popoverRef", js.undefined)
      
      @scala.inline
      def setTarget(value: String | Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait IPopoverState extends StObject {
    
    var hasDarkParent: Boolean
    
    var isOpen: Boolean
    
    var transformOrigin: String
  }
  object IPopoverState {
    
    @scala.inline
    def apply(hasDarkParent: Boolean, isOpen: Boolean, transformOrigin: String): IPopoverState = {
      val __obj = js.Dynamic.literal(hasDarkParent = hasDarkParent.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], transformOrigin = transformOrigin.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPopoverState]
    }
    
    @scala.inline
    implicit class IPopoverStateMutableBuilder[Self <: IPopoverState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasDarkParent(value: Boolean): Self = StObject.set(x, "hasDarkParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformOrigin(value: String): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
    }
  }
}
