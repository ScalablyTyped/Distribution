package typings.baseui

import typings.baseui.overridesMod.Override
import typings.react.mod.ReactNode
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerTypesMod {
  
  /* keyof baseui.anon.Bottom */ /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.left
    - typings.baseui.baseuiStrings.right
    - typings.baseui.baseuiStrings.top
    - typings.baseui.baseuiStrings.bottom
  */
  trait Anchor extends StObject
  
  type AnchorProp = Anchor | String
  
  /* keyof baseui.anon.Backdrop */ /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.closeButton
    - typings.baseui.baseuiStrings.backdrop
    - typings.baseui.baseuiStrings.escape_
  */
  trait CloseSource extends StObject
  
  trait DrawerOverrides extends StObject {
    
    var Backdrop: js.UndefOr[Override[Any]] = js.undefined
    
    var Close: js.UndefOr[Override[Any]] = js.undefined
    
    var DrawerBody: js.UndefOr[Override[Any]] = js.undefined
    
    var DrawerContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
  }
  object DrawerOverrides {
    
    inline def apply(): DrawerOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerOverrides]
    }
    
    extension [Self <: DrawerOverrides](x: Self) {
      
      inline def setBackdrop(value: Override[Any]): Self = StObject.set(x, "Backdrop", value.asInstanceOf[js.Any])
      
      inline def setBackdropUndefined: Self = StObject.set(x, "Backdrop", js.undefined)
      
      inline def setClose(value: Override[Any]): Self = StObject.set(x, "Close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "Close", js.undefined)
      
      inline def setDrawerBody(value: Override[Any]): Self = StObject.set(x, "DrawerBody", value.asInstanceOf[js.Any])
      
      inline def setDrawerBodyUndefined: Self = StObject.set(x, "DrawerBody", js.undefined)
      
      inline def setDrawerContainer(value: Override[Any]): Self = StObject.set(x, "DrawerContainer", value.asInstanceOf[js.Any])
      
      inline def setDrawerContainerUndefined: Self = StObject.set(x, "DrawerContainer", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  trait DrawerProps extends StObject {
    
    var anchor: AnchorProp
    
    /** Sets whether the Drawer should be displayed by easing in and out */
    var animate: Boolean
    
    /** If true, focus will shift to the first interactive element within the drawer.
      * If false, the drawer container itself will receive focus.
      * Moving focus into a newly opened drawer is important for accessibility purposes, so please be careful!
      */
    var autoFocus: Boolean
    
    /** Drawer content. The children-as-function API may be preferable
      * for performance reasons (wont render until opened) */
    var children: js.UndefOr[ReactNode | js.Function0[ReactNode]] = js.undefined
    
    /** Whether the modal should be closeable by the user
      *  (either via escape, backdrop click, etc). You can set this to
      * false if your modal has an action that the user must take before closing.*/
    var closeable: Boolean
    
    var isOpen: Boolean
    
    /** Where to mount the modal */
    var mountNode: js.UndefOr[HTMLElement] = js.undefined
    
    /**Function to be called when backdrop is clicked */
    var onBackdropClick: js.UndefOr[js.Function1[/* e */ Event, Any]] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* a */ typings.baseui.anon.CloseSource, Any]] = js.undefined
    
    var onEscapeKeyDown: js.UndefOr[js.Function1[/* e */ Event, Any]] = js.undefined
    
    var overrides: DrawerOverrides
    
    /** Renders all drawer content for SEO purposes regardless of drawer isOpen state */
    var renderAll: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the backdrop should be present */
    var showBackdrop: Boolean
    
    /** Controls the size of the modal (primarily width).
      * Can be a SIZE constant or css width property value. */
    var size: SizeProp
  }
  object DrawerProps {
    
    inline def apply(
      anchor: AnchorProp,
      animate: Boolean,
      autoFocus: Boolean,
      closeable: Boolean,
      isOpen: Boolean,
      overrides: DrawerOverrides,
      showBackdrop: Boolean,
      size: SizeProp
    ): DrawerProps = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any], autoFocus = autoFocus.asInstanceOf[js.Any], closeable = closeable.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any], showBackdrop = showBackdrop.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawerProps]
    }
    
    extension [Self <: DrawerProps](x: Self) {
      
      inline def setAnchor(value: AnchorProp): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactNode | js.Function0[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction0(value: () => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction0(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCloseable(value: Boolean): Self = StObject.set(x, "closeable", value.asInstanceOf[js.Any])
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setMountNode(value: HTMLElement): Self = StObject.set(x, "mountNode", value.asInstanceOf[js.Any])
      
      inline def setMountNodeUndefined: Self = StObject.set(x, "mountNode", js.undefined)
      
      inline def setOnBackdropClick(value: /* e */ Event => Any): Self = StObject.set(x, "onBackdropClick", js.Any.fromFunction1(value))
      
      inline def setOnBackdropClickUndefined: Self = StObject.set(x, "onBackdropClick", js.undefined)
      
      inline def setOnClose(value: /* a */ typings.baseui.anon.CloseSource => Any): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnEscapeKeyDown(value: /* e */ Event => Any): Self = StObject.set(x, "onEscapeKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnEscapeKeyDownUndefined: Self = StObject.set(x, "onEscapeKeyDown", js.undefined)
      
      inline def setOverrides(value: DrawerOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
      
      inline def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
      
      inline def setShowBackdrop(value: Boolean): Self = StObject.set(x, "showBackdrop", value.asInstanceOf[js.Any])
      
      inline def setSize(value: SizeProp): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<baseui.baseui/drawer/types.DrawerProps, 'children'> */
  trait DrawerPropsWithoutChildren extends StObject {
    
    var anchor: AnchorProp
    
    var animate: Boolean
    
    var autoFocus: Boolean
    
    var closeable: Boolean
    
    var isOpen: Boolean
    
    var mountNode: js.UndefOr[HTMLElement] = js.undefined
    
    var onBackdropClick: js.UndefOr[js.Function1[/* e */ Event, Any]] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* a */ typings.baseui.anon.CloseSource, Any]] = js.undefined
    
    var onEscapeKeyDown: js.UndefOr[js.Function1[/* e */ Event, Any]] = js.undefined
    
    var overrides: DrawerOverrides
    
    var renderAll: js.UndefOr[Boolean] = js.undefined
    
    var showBackdrop: Boolean
    
    var size: SizeProp
  }
  object DrawerPropsWithoutChildren {
    
    inline def apply(
      anchor: AnchorProp,
      animate: Boolean,
      autoFocus: Boolean,
      closeable: Boolean,
      isOpen: Boolean,
      overrides: DrawerOverrides,
      showBackdrop: Boolean,
      size: SizeProp
    ): DrawerPropsWithoutChildren = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any], autoFocus = autoFocus.asInstanceOf[js.Any], closeable = closeable.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any], showBackdrop = showBackdrop.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawerPropsWithoutChildren]
    }
    
    extension [Self <: DrawerPropsWithoutChildren](x: Self) {
      
      inline def setAnchor(value: AnchorProp): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setCloseable(value: Boolean): Self = StObject.set(x, "closeable", value.asInstanceOf[js.Any])
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setMountNode(value: HTMLElement): Self = StObject.set(x, "mountNode", value.asInstanceOf[js.Any])
      
      inline def setMountNodeUndefined: Self = StObject.set(x, "mountNode", js.undefined)
      
      inline def setOnBackdropClick(value: /* e */ Event => Any): Self = StObject.set(x, "onBackdropClick", js.Any.fromFunction1(value))
      
      inline def setOnBackdropClickUndefined: Self = StObject.set(x, "onBackdropClick", js.undefined)
      
      inline def setOnClose(value: /* a */ typings.baseui.anon.CloseSource => Any): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnEscapeKeyDown(value: /* e */ Event => Any): Self = StObject.set(x, "onEscapeKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnEscapeKeyDownUndefined: Self = StObject.set(x, "onEscapeKeyDown", js.undefined)
      
      inline def setOverrides(value: DrawerOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
      
      inline def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
      
      inline def setShowBackdrop(value: Boolean): Self = StObject.set(x, "showBackdrop", value.asInstanceOf[js.Any])
      
      inline def setSize(value: SizeProp): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait DrawerState extends StObject {
    
    var isFocusVisible: Boolean
    
    var isVisible: Boolean
    
    var mounted: Boolean
  }
  object DrawerState {
    
    inline def apply(isFocusVisible: Boolean, isVisible: Boolean, mounted: Boolean): DrawerState = {
      val __obj = js.Dynamic.literal(isFocusVisible = isFocusVisible.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], mounted = mounted.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawerState]
    }
    
    extension [Self <: DrawerState](x: Self) {
      
      inline def setIsFocusVisible(value: Boolean): Self = StObject.set(x, "isFocusVisible", value.asInstanceOf[js.Any])
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setMounted(value: Boolean): Self = StObject.set(x, "mounted", value.asInstanceOf[js.Any])
    }
  }
  
  trait ElementRef extends StObject {
    
    var current: Any | Null
  }
  object ElementRef {
    
    inline def apply(): ElementRef = {
      val __obj = js.Dynamic.literal(current = null)
      __obj.asInstanceOf[ElementRef]
    }
    
    extension [Self <: ElementRef](x: Self) {
      
      inline def setCurrent(value: Any): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentNull: Self = StObject.set(x, "current", null)
    }
  }
  
  trait SharedStylePropsArg extends StObject {
    
    @JSName("$anchor")
    var $anchor: AnchorProp
    
    @JSName("$animating")
    var $animating: Boolean
    
    @JSName("$closeable")
    var $closeable: Boolean
    
    @JSName("$isFocusVisible")
    var $isFocusVisible: Boolean
    
    @JSName("$isOpen")
    var $isOpen: Boolean
    
    @JSName("$isVisible")
    var $isVisible: Boolean
    
    @JSName("$showBackdrop")
    var $showBackdrop: Boolean
    
    @JSName("$size")
    var $size: SizeProp
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object SharedStylePropsArg {
    
    inline def apply(
      $anchor: AnchorProp,
      $animating: Boolean,
      $closeable: Boolean,
      $isFocusVisible: Boolean,
      $isOpen: Boolean,
      $isVisible: Boolean,
      $showBackdrop: Boolean,
      $size: SizeProp
    ): SharedStylePropsArg = {
      val __obj = js.Dynamic.literal($anchor = $anchor.asInstanceOf[js.Any], $animating = $animating.asInstanceOf[js.Any], $closeable = $closeable.asInstanceOf[js.Any], $isFocusVisible = $isFocusVisible.asInstanceOf[js.Any], $isOpen = $isOpen.asInstanceOf[js.Any], $isVisible = $isVisible.asInstanceOf[js.Any], $showBackdrop = $showBackdrop.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any])
      __obj.asInstanceOf[SharedStylePropsArg]
    }
    
    extension [Self <: SharedStylePropsArg](x: Self) {
      
      inline def set$anchor(value: AnchorProp): Self = StObject.set(x, "$anchor", value.asInstanceOf[js.Any])
      
      inline def set$animating(value: Boolean): Self = StObject.set(x, "$animating", value.asInstanceOf[js.Any])
      
      inline def set$closeable(value: Boolean): Self = StObject.set(x, "$closeable", value.asInstanceOf[js.Any])
      
      inline def set$isFocusVisible(value: Boolean): Self = StObject.set(x, "$isFocusVisible", value.asInstanceOf[js.Any])
      
      inline def set$isOpen(value: Boolean): Self = StObject.set(x, "$isOpen", value.asInstanceOf[js.Any])
      
      inline def set$isVisible(value: Boolean): Self = StObject.set(x, "$isVisible", value.asInstanceOf[js.Any])
      
      inline def set$showBackdrop(value: Boolean): Self = StObject.set(x, "$showBackdrop", value.asInstanceOf[js.Any])
      
      inline def set$size(value: SizeProp): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  /* keyof baseui.anon.Auto */ /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.default_
    - typings.baseui.baseuiStrings.full
    - typings.baseui.baseuiStrings.auto
  */
  trait Size extends StObject
  
  type SizeProp = Size | String
}
