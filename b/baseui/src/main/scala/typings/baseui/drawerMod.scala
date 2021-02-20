package typings.baseui

import typings.baseui.anon.CloseSource
import typings.baseui.anon.SharedStylePropsArgchildr
import typings.baseui.baseuiStrings.`100Percentsign`
import typings.baseui.baseuiStrings.`500px`
import typings.baseui.baseuiStrings.auto
import typings.baseui.baseuiStrings.backdrop
import typings.baseui.baseuiStrings.bottom
import typings.baseui.baseuiStrings.closeButton
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.escape_
import typings.baseui.baseuiStrings.full
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.right
import typings.baseui.baseuiStrings.top
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerMod {
  
  @js.native
  trait ANCHOR extends StObject {
    
    var bottom: typings.baseui.baseuiStrings.bottom = js.native
    
    var left: typings.baseui.baseuiStrings.left = js.native
    
    var right: typings.baseui.baseuiStrings.right = js.native
    
    var top: typings.baseui.baseuiStrings.top = js.native
  }
  object ANCHOR {
    
    @JSImport("baseui/drawer", "ANCHOR")
    @js.native
    val ^ : ANCHOR = js.native
    
    @scala.inline
    implicit class ANCHORMutableBuilder[Self <: ANCHOR] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: bottom): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: left): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: right): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: top): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CLOSE_SOURCE extends StObject {
    
    var backdrop: typings.baseui.baseuiStrings.backdrop = js.native
    
    var closeButton: typings.baseui.baseuiStrings.closeButton = js.native
    
    var escape: escape_ = js.native
  }
  object CLOSE_SOURCE {
    
    @JSImport("baseui/drawer", "CLOSE_SOURCE")
    @js.native
    val ^ : CLOSE_SOURCE = js.native
    
    @scala.inline
    implicit class CLOSE_SOURCEMutableBuilder[Self <: CLOSE_SOURCE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackdrop(value: backdrop): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseButton(value: closeButton): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscape(value: escape_): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/drawer", "Drawer")
  @js.native
  class Drawer protected ()
    extends Component[DrawerProps, DrawerState, js.Any] {
    def this(props: DrawerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DrawerProps, context: js.Any) = this()
    
    def addDomEvents(): Unit = js.native
    
    def animateOutComplete(): Unit = js.native
    
    def clearTimers(): Unit = js.native
    
    def didClose(): Unit = js.native
    
    def didOpen(): Unit = js.native
    
    def disableMountNodeScroll(): Unit = js.native
    
    def getChildren(): ReactNode = js.native
    
    def getRef(component: String): Ref[_] = js.native
    
    def getSharedProps(): SharedStylePropsArgchildr = js.native
    
    def onBackdropClick(): Unit = js.native
    
    def onCloseClick(): Unit = js.native
    
    def onDocumentKeyPress(event: KeyboardEvent): Unit = js.native
    
    def removeDomEvents(): Unit = js.native
    
    def renderDrawer(): ReactNode = js.native
    
    def resentMountNodeScroll(): Unit = js.native
    
    @JSName("triggerClose")
    def triggerClose_backdrop(source: backdrop): Unit = js.native
    @JSName("triggerClose")
    def triggerClose_closeButton(source: closeButton): Unit = js.native
    @JSName("triggerClose")
    def triggerClose_escape(source: escape_): Unit = js.native
  }
  
  @js.native
  trait SIZE extends StObject {
    
    var default: default_ = js.native
    
    var auto: typings.baseui.baseuiStrings.auto = js.native
    
    var full: typings.baseui.baseuiStrings.full = js.native
  }
  object SIZE {
    
    @JSImport("baseui/drawer", "SIZE")
    @js.native
    val ^ : SIZE = js.native
    
    @scala.inline
    implicit class SIZEMutableBuilder[Self <: SIZE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuto(value: auto): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault(value: default_): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull(value: full): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SIZE_DIMENSIONS extends StObject {
    
    var default: `500px` = js.native
    
    var auto: typings.baseui.baseuiStrings.auto = js.native
    
    var full: `100Percentsign` = js.native
  }
  object SIZE_DIMENSIONS {
    
    @JSImport("baseui/drawer", "SIZE_DIMENSIONS")
    @js.native
    val ^ : SIZE_DIMENSIONS = js.native
    
    @scala.inline
    implicit class SIZE_DIMENSIONSMutableBuilder[Self <: SIZE_DIMENSIONS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuto(value: auto): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault(value: `500px`): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull(value: `100Percentsign`): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/drawer", "StyledBackdrop")
  @js.native
  val StyledBackdrop: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/drawer", "StyledClose")
  @js.native
  val StyledClose: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/drawer", "StyledDrawerBody")
  @js.native
  val StyledDrawerBody: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/drawer", "StyledDrawerContainer")
  @js.native
  val StyledDrawerContainer: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/drawer", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[js.Any] = js.native
  
  @js.native
  trait DrawerOverrides extends StObject {
    
    var Backdrop: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ] = js.native
    
    var Close: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ] = js.native
    
    var DrawerBody: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ] = js.native
    
    var DrawerContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ] = js.native
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ] = js.native
  }
  object DrawerOverrides {
    
    @scala.inline
    def apply(): DrawerOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerOverrides]
    }
    
    @scala.inline
    implicit class DrawerOverridesMutableBuilder[Self <: DrawerOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackdrop(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ): Self = StObject.set(x, "Backdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropUndefined: Self = StObject.set(x, "Backdrop", js.undefined)
      
      @scala.inline
      def setClose(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ): Self = StObject.set(x, "Close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "Close", js.undefined)
      
      @scala.inline
      def setDrawerBody(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ): Self = StObject.set(x, "DrawerBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawerBodyUndefined: Self = StObject.set(x, "DrawerBody", js.undefined)
      
      @scala.inline
      def setDrawerContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ): Self = StObject.set(x, "DrawerContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawerContainerUndefined: Self = StObject.set(x, "DrawerContainer", js.undefined)
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  @js.native
  trait DrawerProps extends StObject {
    
    var anchor: js.UndefOr[left | right | top | bottom | String] = js.native
    
    var animate: js.UndefOr[Boolean] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var closeable: js.UndefOr[Boolean] = js.native
    
    var isOpen: js.UndefOr[Boolean] = js.native
    
    var mountNode: js.UndefOr[HTMLElement] = js.native
    
    var onBackdropClick: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], _]] = js.native
    
    var onClose: js.UndefOr[js.Function1[/* args */ CloseSource, _]] = js.native
    
    var onEscapeKeyDown: js.UndefOr[js.Function1[/* event */ typings.react.mod.KeyboardEvent[HTMLElement], _]] = js.native
    
    var overrides: js.UndefOr[DrawerOverrides] = js.native
    
    var renderAll: js.UndefOr[Boolean] = js.native
    
    var showBackdrop: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[default_ | full | auto | String] = js.native
  }
  object DrawerProps {
    
    @scala.inline
    def apply(): DrawerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerProps]
    }
    
    @scala.inline
    implicit class DrawerPropsMutableBuilder[Self <: DrawerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: left | right | top | bottom | String): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setCloseable(value: Boolean): Self = StObject.set(x, "closeable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseableUndefined: Self = StObject.set(x, "closeable", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setMountNode(value: HTMLElement): Self = StObject.set(x, "mountNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountNodeUndefined: Self = StObject.set(x, "mountNode", js.undefined)
      
      @scala.inline
      def setOnBackdropClick(value: /* event */ MouseEvent[HTMLElement, NativeMouseEvent] => _): Self = StObject.set(x, "onBackdropClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBackdropClickUndefined: Self = StObject.set(x, "onBackdropClick", js.undefined)
      
      @scala.inline
      def setOnClose(value: /* args */ CloseSource => _): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnEscapeKeyDown(value: /* event */ typings.react.mod.KeyboardEvent[HTMLElement] => _): Self = StObject.set(x, "onEscapeKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEscapeKeyDownUndefined: Self = StObject.set(x, "onEscapeKeyDown", js.undefined)
      
      @scala.inline
      def setOverrides(value: DrawerOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
      
      @scala.inline
      def setShowBackdrop(value: Boolean): Self = StObject.set(x, "showBackdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowBackdropUndefined: Self = StObject.set(x, "showBackdrop", js.undefined)
      
      @scala.inline
      def setSize(value: default_ | full | auto | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait DrawerState extends StObject {
    
    var isVisible: Boolean = js.native
    
    var mounted: Boolean = js.native
  }
  object DrawerState {
    
    @scala.inline
    def apply(isVisible: Boolean, mounted: Boolean): DrawerState = {
      val __obj = js.Dynamic.literal(isVisible = isVisible.asInstanceOf[js.Any], mounted = mounted.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawerState]
    }
    
    @scala.inline
    implicit class DrawerStateMutableBuilder[Self <: DrawerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMounted(value: Boolean): Self = StObject.set(x, "mounted", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SharedStylePropsArg extends StObject {
    
    @JSName("$anchor")
    var $anchor: js.UndefOr[left | right | top | bottom] = js.native
    
    @JSName("$animating")
    var $animating: js.UndefOr[Boolean] = js.native
    
    @JSName("$closeable")
    var $closeable: js.UndefOr[Boolean] = js.native
    
    @JSName("$isOpen")
    var $isOpen: js.UndefOr[Boolean] = js.native
    
    @JSName("$isVisible")
    var $isVisible: js.UndefOr[Boolean] = js.native
    
    @JSName("$size")
    var $size: js.UndefOr[default_ | full | auto] = js.native
    
    var children: js.UndefOr[ReactNode] = js.native
  }
  object SharedStylePropsArg {
    
    @scala.inline
    def apply(): SharedStylePropsArg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedStylePropsArg]
    }
    
    @scala.inline
    implicit class SharedStylePropsArgMutableBuilder[Self <: SharedStylePropsArg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$anchor(value: left | right | top | bottom): Self = StObject.set(x, "$anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$anchorUndefined: Self = StObject.set(x, "$anchor", js.undefined)
      
      @scala.inline
      def set$animating(value: Boolean): Self = StObject.set(x, "$animating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$animatingUndefined: Self = StObject.set(x, "$animating", js.undefined)
      
      @scala.inline
      def set$closeable(value: Boolean): Self = StObject.set(x, "$closeable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$closeableUndefined: Self = StObject.set(x, "$closeable", js.undefined)
      
      @scala.inline
      def set$isOpen(value: Boolean): Self = StObject.set(x, "$isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$isOpenUndefined: Self = StObject.set(x, "$isOpen", js.undefined)
      
      @scala.inline
      def set$isVisible(value: Boolean): Self = StObject.set(x, "$isVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$isVisibleUndefined: Self = StObject.set(x, "$isVisible", js.undefined)
      
      @scala.inline
      def set$size(value: default_ | full | auto): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
