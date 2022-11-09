package typings.blueprintjsPopover2

import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.blueprintjsPopover2.anon.PartialState
import typings.blueprintjsPopover2.anon.Popover2PropsDefaultPopov
import typings.blueprintjsPopover2.blueprintjsPopover2Strings.`click-target`
import typings.blueprintjsPopover2.blueprintjsPopover2Strings.`hover-target`
import typings.blueprintjsPopover2.blueprintjsPopover2Strings.click
import typings.blueprintjsPopover2.blueprintjsPopover2Strings.hover
import typings.blueprintjsPopover2.libEsmPopover2SharedPropsMod.DefaultPopover2TargetHTMLProps
import typings.blueprintjsPopover2.libEsmPopover2SharedPropsMod.IPopover2SharedProps
import typings.blueprintjsPopover2.libEsmPopupKindMod.PopupKind
import typings.popperjsCore.libTypesMod.PositioningStrategy
import typings.react.mod.HTMLProps
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPopover2Mod {
  
  @JSImport("@blueprintjs/popover2/lib/esm/popover2", "Popover2")
  @js.native
  open class Popover2[T] protected ()
    extends AbstractPureComponent2[Popover2Props[T], IPopover2State, js.Object] {
    def this(props: Popover2Props[T]) = this()
    def this(props: Popover2Props[T], context: Any) = this()
    
    /* private */ var cancelOpenTimeout: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPopover2(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPopover2(props: Popover2Props[T], state: IPopover2State): Unit = js.native
    
    /* private */ var getIsOpen: Any = js.native
    
    /* private */ var getPopoverElement: Any = js.native
    
    /* private */ var getPopperModifiers: Any = js.native
    
    /* private */ var handleMouseEnter: Any = js.native
    
    /* private */ var handleMouseLeave: Any = js.native
    
    /* private */ var handleOverlayClose: Any = js.native
    
    /* private */ var handlePopoverClick: Any = js.native
    
    /* private */ var handleTargetBlur: Any = js.native
    
    /* private */ var handleTargetClick: Any = js.native
    
    /* private */ var handleTargetContextMenu: Any = js.native
    
    /* private */ var handleTargetFocus: Any = js.native
    
    /* private */ var isArrowEnabled: Any = js.native
    
    /* private */ var isControlled: Any = js.native
    
    /* private */ var isElementInPopover: Any = js.native
    
    /* private */ var isHoverInteractionKind: Any = js.native
    
    /* private */ var isMouseInTargetOrPopover: Any = js.native
    
    /* private */ var lostFocusOnSamePage: Any = js.native
    
    /**
      * DOM element that contains the popover.
      * When `usePortal={true}`, this element will be portaled outside the usual DOM flow,
      * so this reference can be very useful for testing.
      */
    var popoverElement: HTMLElement | Null = js.native
    
    /** Popover ref handler */
    /* private */ var popoverRef: Any = js.native
    
    /* private */ var popperScheduleUpdate: Any = js.native
    
    /* private */ var renderPopover: Any = js.native
    
    /* private */ var renderTarget: Any = js.native
    
    /**
      * Instance method to instruct the `Popover` to recompute its position.
      *
      * This method should only be used if you are updating the target in a way
      * that does not cause it to re-render, such as changing its _position_
      * without changing its _size_ (since `Popover` already repositions when it
      * detects a resize).
      */
    def reposition(): js.UndefOr[js.Promise[PartialState | Null]] = js.native
    
    /* private */ var setOpenState: Any = js.native
    
    /** DOM element that contains the target. */
    var targetElement: HTMLElement | Null = js.native
    
    /** Target ref handler */
    /* private */ var targetRef: Any = js.native
    
    /* private */ var updateDarkParent: Any = js.native
    
    /* protected */ def validateProps(props: Popover2PropsDefaultPopov): Unit = js.native
  }
  /* static members */
  object Popover2 {
    
    @JSImport("@blueprintjs/popover2/lib/esm/popover2", "Popover2")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/popover2/lib/esm/popover2", "Popover2.defaultProps")
    @js.native
    def defaultProps: Popover2Props[DefaultPopover2TargetHTMLProps] = js.native
    inline def defaultProps_=(x: Popover2Props[DefaultPopover2TargetHTMLProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/popover2/lib/esm/popover2", "Popover2.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined {  CLICK :'click',   CLICK_TARGET_ONLY :'click-target',   HOVER :'hover',   HOVER_TARGET_ONLY :'hover-target'}[keyof {  CLICK :'click',   CLICK_TARGET_ONLY :'click-target',   HOVER :'hover',   HOVER_TARGET_ONLY :'hover-target'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.blueprintjsPopover2.blueprintjsPopover2Strings.click
    - typings.blueprintjsPopover2.blueprintjsPopover2Strings.`click-target`
    - typings.blueprintjsPopover2.blueprintjsPopover2Strings.hover
    - typings.blueprintjsPopover2.blueprintjsPopover2Strings.`hover-target`
  */
  trait Popover2InteractionKind extends StObject
  object Popover2InteractionKind {
    
    @JSImport("@blueprintjs/popover2/lib/esm/popover2", "Popover2InteractionKind")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/popover2/lib/esm/popover2", "Popover2InteractionKind.CLICK")
    @js.native
    def CLICK: click = js.native
    inline def CLICK_=(x: click): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLICK")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/popover2/lib/esm/popover2", "Popover2InteractionKind.CLICK_TARGET_ONLY")
    @js.native
    def CLICK_TARGET_ONLY: `click-target` = js.native
    inline def CLICK_TARGET_ONLY_=(x: `click-target`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLICK_TARGET_ONLY")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/popover2/lib/esm/popover2", "Popover2InteractionKind.HOVER")
    @js.native
    def HOVER: hover = js.native
    inline def HOVER_=(x: hover): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOVER")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/popover2/lib/esm/popover2", "Popover2InteractionKind.HOVER_TARGET_ONLY")
    @js.native
    def HOVER_TARGET_ONLY: `hover-target` = js.native
    inline def HOVER_TARGET_ONLY_=(x: `hover-target`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOVER_TARGET_ONLY")(x.asInstanceOf[js.Any])
  }
  
  trait IPopover2Props[TProps]
    extends StObject
       with IPopover2SharedProps[TProps] {
    
    /** HTML props for the backdrop element. Can be combined with `backdropClassName`. */
    var backdropProps: js.UndefOr[HTMLProps[HTMLDivElement]] = js.undefined
    
    /**
      * The content displayed inside the popover.
      */
    var content: js.UndefOr[String | Element] = js.undefined
    
    /**
      * Enables an invisible overlay beneath the popover that captures clicks and
      * prevents interaction with the rest of the document until the popover is
      * closed. This prop is only available when `interactionKind` is
      * `PopoverInteractionKind.CLICK`. When popovers with backdrop are opened,
      * they become focused.
      *
      * @default false
      */
    var hasBackdrop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The kind of interaction that triggers the display of the popover.
      *
      * @default "click"
      */
    var interactionKind: js.UndefOr[Popover2InteractionKind] = js.undefined
    
    /**
      * The kind of popup displayed by the popover. This property is ignored if
      * `interactionKind` is {@link Popover2InteractionKind.HOVER_TARGET_ONLY}.
      * This controls the `aria-haspopup` attribute of the target element. The
      * default is "menu" (technically, `aria-haspopup` will be set to "true",
      * which is the same as "menu", for backwards compatibility).
      *
      * @default "menu" or undefined
      */
    var popupKind: js.UndefOr[PopupKind] = js.undefined
    
    /**
      * Popper.js positioning strategy.
      *
      * @see https://popper.js.org/docs/v2/constructors/#strategy
      * @default "absolute"
      */
    var positioningStrategy: js.UndefOr[PositioningStrategy] = js.undefined
  }
  object IPopover2Props {
    
    inline def apply[TProps](): IPopover2Props[TProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPopover2Props[TProps]]
    }
    
    extension [Self <: IPopover2Props[?], TProps](x: Self & IPopover2Props[TProps]) {
      
      inline def setBackdropProps(value: HTMLProps[HTMLDivElement]): Self = StObject.set(x, "backdropProps", value.asInstanceOf[js.Any])
      
      inline def setBackdropPropsUndefined: Self = StObject.set(x, "backdropProps", js.undefined)
      
      inline def setContent(value: String | Element): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setHasBackdrop(value: Boolean): Self = StObject.set(x, "hasBackdrop", value.asInstanceOf[js.Any])
      
      inline def setHasBackdropUndefined: Self = StObject.set(x, "hasBackdrop", js.undefined)
      
      inline def setInteractionKind(value: Popover2InteractionKind): Self = StObject.set(x, "interactionKind", value.asInstanceOf[js.Any])
      
      inline def setInteractionKindUndefined: Self = StObject.set(x, "interactionKind", js.undefined)
      
      inline def setPopupKind(value: PopupKind): Self = StObject.set(x, "popupKind", value.asInstanceOf[js.Any])
      
      inline def setPopupKindUndefined: Self = StObject.set(x, "popupKind", js.undefined)
      
      inline def setPositioningStrategy(value: PositioningStrategy): Self = StObject.set(x, "positioningStrategy", value.asInstanceOf[js.Any])
      
      inline def setPositioningStrategyUndefined: Self = StObject.set(x, "positioningStrategy", js.undefined)
    }
  }
  
  trait IPopover2State extends StObject {
    
    var hasDarkParent: Boolean
    
    var isOpen: Boolean
  }
  object IPopover2State {
    
    inline def apply(hasDarkParent: Boolean, isOpen: Boolean): IPopover2State = {
      val __obj = js.Dynamic.literal(hasDarkParent = hasDarkParent.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPopover2State]
    }
    
    extension [Self <: IPopover2State](x: Self) {
      
      inline def setHasDarkParent(value: Boolean): Self = StObject.set(x, "hasDarkParent", value.asInstanceOf[js.Any])
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    }
  }
  
  type Popover2Props[TProps] = IPopover2Props[TProps]
}
