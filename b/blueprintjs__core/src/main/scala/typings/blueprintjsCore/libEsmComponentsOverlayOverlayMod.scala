package typings.blueprintjsCore

import typings.blueprintjsCore.anon.HasEverOpened
import typings.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import typings.react.mod.HTMLProps
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsOverlayOverlayMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/overlay/overlay", "Overlay")
  @js.native
  open class Overlay protected ()
    extends AbstractPureComponent2[OverlayProps, IOverlayState, js.Object] {
    def this(props: OverlayProps) = this()
    def this(props: OverlayProps, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MOverlay(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MOverlay(prevProps: OverlayProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MOverlay(): Unit = js.native
    
    var containerElement: HTMLElement | Null = js.native
    
    /* private */ var endFocusTrapElement: Any = js.native
    
    /* private */ var getKeyboardFocusableElements: Any = js.native
    
    /* private */ var handleBackdropMouseDown: Any = js.native
    
    /* private */ var handleDocumentClick: Any = js.native
    
    /**
      * When multiple Overlays are open, this event handler is only active for the most recently
      * opened one to avoid Overlays competing with each other for focus.
      */
    /* private */ var handleDocumentFocus: Any = js.native
    
    /**
      * Ensures repeatedly pressing tab keeps focus inside the Overlay. Moves focus to the
      * `startFocusTrapElement` or the last keyboard-focusable element in the Overlay (excluding the
      * `startFocusTrapElement`), depending on whether the element losing focus is inside the
      * Overlay.
      */
    /* private */ var handleEndFocusTrapElementFocus: Any = js.native
    
    /* private */ var handleKeyDown: Any = js.native
    
    /**
      * Ensures repeatedly pressing shift+tab keeps focus inside the Overlay. Moves focus to
      * the `endFocusTrapElement` or the first keyboard-focusable element in the Overlay (excluding
      * the `startFocusTrapElement`), depending on whether the element losing focus is inside the
      * Overlay.
      */
    /* private */ var handleStartFocusTrapElementFocus: Any = js.native
    
    /**
      * Wrap around to the end of the dialog if `enforceFocus` is enabled.
      */
    /* private */ var handleStartFocusTrapElementKeyDown: Any = js.native
    
    /* private */ var handleTransitionAddEnd: Any = js.native
    
    /* private */ var handleTransitionExited: Any = js.native
    
    /* private */ var isAutoFocusing: Any = js.native
    
    /* private */ var lastActiveElementBeforeOpened: Any = js.native
    
    /* private */ var maybeRenderBackdrop: Any = js.native
    
    /* private */ var maybeRenderChild: Any = js.native
    
    /* private */ var overlayWillClose: Any = js.native
    
    /* private */ var overlayWillOpen: Any = js.native
    
    /* private */ var refHandlers: Any = js.native
    
    /* private */ var renderDummyElement: Any = js.native
    
    /* private */ var startFocusTrapElement: Any = js.native
  }
  /* static members */
  object Overlay {
    
    @JSImport("@blueprintjs/core/lib/esm/components/overlay/overlay", "Overlay")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/overlay/overlay", "Overlay.defaultProps")
    @js.native
    def defaultProps: OverlayProps = js.native
    inline def defaultProps_=(x: OverlayProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/overlay/overlay", "Overlay.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(param0: OverlayProps): HasEverOpened | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(param0.asInstanceOf[js.Any]).asInstanceOf[HasEverOpened | Null]
    
    @JSImport("@blueprintjs/core/lib/esm/components/overlay/overlay", "Overlay.getLastOpened")
    @js.native
    def getLastOpened: Any = js.native
    inline def getLastOpened_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getLastOpened")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/overlay/overlay", "Overlay.openStack")
    @js.native
    def openStack: Any = js.native
    inline def openStack_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openStack")(x.asInstanceOf[js.Any])
  }
  
  type BackdropProps = IBackdropProps
  
  trait IBackdropProps extends StObject {
    
    /** CSS class names to apply to backdrop element. */
    var backdropClassName: js.UndefOr[String] = js.undefined
    
    /** HTML props for the backdrop element. */
    var backdropProps: js.UndefOr[HTMLProps[HTMLDivElement]] = js.undefined
    
    /**
      * Whether clicking outside the overlay element (either on backdrop when present or on document)
      * should invoke `onClose`.
      *
      * @default true
      */
    var canOutsideClickClose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether a container-spanning backdrop element should be rendered behind the contents.
      *
      * @default true
      */
    var hasBackdrop: js.UndefOr[Boolean] = js.undefined
  }
  object IBackdropProps {
    
    inline def apply(): IBackdropProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBackdropProps]
    }
    
    extension [Self <: IBackdropProps](x: Self) {
      
      inline def setBackdropClassName(value: String): Self = StObject.set(x, "backdropClassName", value.asInstanceOf[js.Any])
      
      inline def setBackdropClassNameUndefined: Self = StObject.set(x, "backdropClassName", js.undefined)
      
      inline def setBackdropProps(value: HTMLProps[HTMLDivElement]): Self = StObject.set(x, "backdropProps", value.asInstanceOf[js.Any])
      
      inline def setBackdropPropsUndefined: Self = StObject.set(x, "backdropProps", js.undefined)
      
      inline def setCanOutsideClickClose(value: Boolean): Self = StObject.set(x, "canOutsideClickClose", value.asInstanceOf[js.Any])
      
      inline def setCanOutsideClickCloseUndefined: Self = StObject.set(x, "canOutsideClickClose", js.undefined)
      
      inline def setHasBackdrop(value: Boolean): Self = StObject.set(x, "hasBackdrop", value.asInstanceOf[js.Any])
      
      inline def setHasBackdropUndefined: Self = StObject.set(x, "hasBackdrop", js.undefined)
    }
  }
  
  trait IOverlayLifecycleProps extends StObject {
    
    /**
      * Lifecycle method invoked just after the CSS _close_ transition ends but
      * before the child has been removed from the DOM. Receives the DOM element
      * of the child being closed.
      */
    var onClosed: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
    
    /**
      * Lifecycle method invoked just before the CSS _close_ transition begins on
      * a child. Receives the DOM element of the child being closed.
      */
    var onClosing: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
    
    /**
      * Lifecycle method invoked just after the CSS _open_ transition ends.
      * Receives the DOM element of the child being opened.
      */
    var onOpened: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
    
    /**
      * Lifecycle method invoked just after mounting the child in the DOM but
      * just before the CSS _open_ transition begins. Receives the DOM element of
      * the child being opened.
      */
    var onOpening: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  }
  object IOverlayLifecycleProps {
    
    inline def apply(): IOverlayLifecycleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOverlayLifecycleProps]
    }
    
    extension [Self <: IOverlayLifecycleProps](x: Self) {
      
      inline def setOnClosed(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onClosed", js.Any.fromFunction1(value))
      
      inline def setOnClosedUndefined: Self = StObject.set(x, "onClosed", js.undefined)
      
      inline def setOnClosing(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onClosing", js.Any.fromFunction1(value))
      
      inline def setOnClosingUndefined: Self = StObject.set(x, "onClosing", js.undefined)
      
      inline def setOnOpened(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onOpened", js.Any.fromFunction1(value))
      
      inline def setOnOpenedUndefined: Self = StObject.set(x, "onOpened", js.undefined)
      
      inline def setOnOpening(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onOpening", js.Any.fromFunction1(value))
      
      inline def setOnOpeningUndefined: Self = StObject.set(x, "onOpening", js.undefined)
    }
  }
  
  trait IOverlayProps
    extends StObject
       with IOverlayableProps
       with IBackdropProps
       with IProps {
    
    /** Element to overlay. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Toggles the visibility of the overlay and its children.
      * This prop is required because the component is controlled.
      */
    var isOpen: Boolean
    
    /**
      * Name of the transition for internal `CSSTransition`.
      * Providing your own name here will require defining new CSS transition properties.
      *
      * @default Classes.OVERLAY
      */
    var transitionName: js.UndefOr[String] = js.undefined
  }
  object IOverlayProps {
    
    inline def apply(isOpen: Boolean): IOverlayProps = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOverlayProps]
    }
    
    extension [Self <: IOverlayProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
    }
  }
  
  trait IOverlayState extends StObject {
    
    var hasEverOpened: js.UndefOr[Boolean] = js.undefined
  }
  object IOverlayState {
    
    inline def apply(): IOverlayState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOverlayState]
    }
    
    extension [Self <: IOverlayState](x: Self) {
      
      inline def setHasEverOpened(value: Boolean): Self = StObject.set(x, "hasEverOpened", value.asInstanceOf[js.Any])
      
      inline def setHasEverOpenedUndefined: Self = StObject.set(x, "hasEverOpened", js.undefined)
    }
  }
  
  trait IOverlayableProps
    extends StObject
       with IOverlayLifecycleProps {
    
    /**
      * Whether the overlay should acquire application focus when it first opens.
      *
      * @default true
      */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether pressing the `esc` key should invoke `onClose`.
      *
      * @default true
      */
    var canEscapeKeyClose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the overlay should prevent focus from leaving itself. That is, if the user attempts
      * to focus an element outside the overlay and this prop is enabled, then the overlay will
      * immediately bring focus back to itself. If you are nesting overlay components, either disable
      * this prop on the "outermost" overlays or mark the nested ones `usePortal={false}`.
      *
      * @default true
      */
    var enforceFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true` and `usePortal={true}`, the `Portal` containing the children is created and attached
      * to the DOM when the overlay is opened for the first time; otherwise this happens when the
      * component mounts. Lazy mounting provides noticeable performance improvements if you have lots
      * of overlays at once, such as on each row of a table.
      *
      * @default true
      */
    var `lazy`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A callback that is invoked when user interaction causes the overlay to close, such as
      * clicking on the overlay or pressing the `esc` key (if enabled).
      *
      * Receives the event from the user's interaction, if there was an event (generally either a
      * mouse or key event). Note that, since this component is controlled by the `isOpen` prop, it
      * will not actually close itself until that prop becomes `false`.
      */
    var onClose: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLElement, Event], Unit]] = js.undefined
    
    /**
      * Space-delimited string of class names applied to the `Portal` element if
      * `usePortal={true}`.
      */
    var portalClassName: js.UndefOr[String] = js.undefined
    
    /**
      * The container element into which the overlay renders its contents, when `usePortal` is `true`.
      * This prop is ignored if `usePortal` is `false`.
      *
      * @default document.body
      */
    var portalContainer: js.UndefOr[HTMLElement] = js.undefined
    
    /**
      * Whether the application should return focus to the last active element in the
      * document after this overlay closes.
      *
      * @default true
      */
    var shouldReturnFocusOnClose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates how long (in milliseconds) the overlay's enter/leave transition takes.
      * This is used by React `CSSTransition` to know when a transition completes and must match
      * the duration of the animation in CSS. Only set this prop if you override Blueprint's default
      * transitions with new transitions of a different length.
      *
      * @default 300
      */
    var transitionDuration: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether the overlay should be wrapped in a `Portal`, which renders its contents in a new
      * element attached to `portalContainer` prop.
      *
      * This prop essentially determines which element is covered by the backdrop: if `false`,
      * then only its parent is covered; otherwise, the entire page is covered (because the parent
      * of the `Portal` is the `<body>` itself).
      *
      * Set this prop to `false` on nested overlays (such as `Dialog` or `Popover`) to ensure that they
      * are rendered above their parents.
      *
      * @default true
      */
    var usePortal: js.UndefOr[Boolean] = js.undefined
  }
  object IOverlayableProps {
    
    inline def apply(): IOverlayableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOverlayableProps]
    }
    
    extension [Self <: IOverlayableProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setCanEscapeKeyClose(value: Boolean): Self = StObject.set(x, "canEscapeKeyClose", value.asInstanceOf[js.Any])
      
      inline def setCanEscapeKeyCloseUndefined: Self = StObject.set(x, "canEscapeKeyClose", js.undefined)
      
      inline def setEnforceFocus(value: Boolean): Self = StObject.set(x, "enforceFocus", value.asInstanceOf[js.Any])
      
      inline def setEnforceFocusUndefined: Self = StObject.set(x, "enforceFocus", js.undefined)
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      inline def setOnClose(value: /* event */ SyntheticEvent[HTMLElement, Event] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setPortalClassName(value: String): Self = StObject.set(x, "portalClassName", value.asInstanceOf[js.Any])
      
      inline def setPortalClassNameUndefined: Self = StObject.set(x, "portalClassName", js.undefined)
      
      inline def setPortalContainer(value: HTMLElement): Self = StObject.set(x, "portalContainer", value.asInstanceOf[js.Any])
      
      inline def setPortalContainerUndefined: Self = StObject.set(x, "portalContainer", js.undefined)
      
      inline def setShouldReturnFocusOnClose(value: Boolean): Self = StObject.set(x, "shouldReturnFocusOnClose", value.asInstanceOf[js.Any])
      
      inline def setShouldReturnFocusOnCloseUndefined: Self = StObject.set(x, "shouldReturnFocusOnClose", js.undefined)
      
      inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      inline def setUsePortal(value: Boolean): Self = StObject.set(x, "usePortal", value.asInstanceOf[js.Any])
      
      inline def setUsePortalUndefined: Self = StObject.set(x, "usePortal", js.undefined)
    }
  }
  
  type OverlayLifecycleProps = IOverlayLifecycleProps
  
  type OverlayProps = IOverlayProps
  
  type OverlayableProps = IOverlayableProps
}
