package typings.baseui

import org.scalablytyped.runtime.StringDictionary
import typings.baseui.anon.CloseSource
import typings.baseui.anon.IsVisible
import typings.baseui.anon.OmitSharedStylePropsArgch
import typings.baseui.drawerTypesMod.AnchorProp
import typings.baseui.drawerTypesMod.DrawerOverrides
import typings.baseui.drawerTypesMod.DrawerProps
import typings.baseui.drawerTypesMod.DrawerState
import typings.baseui.drawerTypesMod.ElementRef
import typings.baseui.drawerTypesMod.SizeProp
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerDrawerMod {
  
  @JSImport("baseui/drawer/drawer", JSImport.Default)
  @js.native
  open class default () extends Drawer
  object default {
    
    /* static member */
    /* Inlined std.Partial<baseui.baseui/drawer/types.DrawerProps> */
    object defaultProps {
      
      @JSImport("baseui/drawer/drawer", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/drawer/drawer", "default.defaultProps.anchor")
      @js.native
      def anchor: js.UndefOr[AnchorProp] = js.native
      inline def anchor_=(x: js.UndefOr[AnchorProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("anchor")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/drawer/drawer", "default.defaultProps.animate")
      @js.native
      def animate: js.UndefOr[Boolean] = js.native
      inline def animate_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/drawer/drawer", "default.defaultProps.autoFocus")
      @js.native
      def autoFocus: js.UndefOr[Boolean] = js.native
      inline def autoFocus_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/drawer/drawer", "default.defaultProps.children")
      @js.native
      def children: js.UndefOr[ReactNode | js.Function0[ReactNode]] = js.native
      inline def children_=(x: js.UndefOr[ReactNode | js.Function0[ReactNode]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/drawer/drawer", "default.defaultProps.closeable")
      @js.native
      def closeable: js.UndefOr[Boolean] = js.native
      inline def closeable_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeable")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/drawer/drawer", "default.defaultProps.isOpen")
      @js.native
      def isOpen: js.UndefOr[Boolean] = js.native
      inline def isOpen_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/drawer/drawer", "default.defaultProps.mountNode")
      @js.native
      def mountNode: js.UndefOr[HTMLElement] = js.native
      inline def mountNode_=(x: js.UndefOr[HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mountNode")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/drawer/drawer", "default.defaultProps.onBackdropClick")
      @js.native
      def onBackdropClick: js.UndefOr[js.Function1[/* e */ Event, Any]] = js.native
      inline def onBackdropClick_=(x: js.UndefOr[js.Function1[/* e */ Event, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBackdropClick")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/drawer/drawer", "default.defaultProps.onClose")
      @js.native
      def onClose: js.UndefOr[js.Function1[/* a */ CloseSource, Any]] = js.native
      inline def onClose_=(x: js.UndefOr[js.Function1[/* a */ CloseSource, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClose")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/drawer/drawer", "default.defaultProps.onEscapeKeyDown")
      @js.native
      def onEscapeKeyDown: js.UndefOr[js.Function1[/* e */ Event, Any]] = js.native
      inline def onEscapeKeyDown_=(x: js.UndefOr[js.Function1[/* e */ Event, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onEscapeKeyDown")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/drawer/drawer", "default.defaultProps.overrides")
      @js.native
      def overrides: js.UndefOr[DrawerOverrides] = js.native
      inline def overrides_=(x: js.UndefOr[DrawerOverrides]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrides")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/drawer/drawer", "default.defaultProps.renderAll")
      @js.native
      def renderAll: js.UndefOr[Boolean] = js.native
      inline def renderAll_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderAll")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/drawer/drawer", "default.defaultProps.showBackdrop")
      @js.native
      def showBackdrop: js.UndefOr[Boolean] = js.native
      inline def showBackdrop_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showBackdrop")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/drawer/drawer", "default.defaultProps.size")
      @js.native
      def size: js.UndefOr[SizeProp] = js.native
      inline def size_=(x: js.UndefOr[SizeProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Drawer extends Component[DrawerProps, DrawerState, Any] {
    
    var _refs: StringDictionary[ElementRef] = js.native
    
    def animateOutComplete(): Unit = js.native
    
    var animateOutTimer: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TimeoutID */ Any) | Null
      ] = js.native
    
    var animateStartTimer: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationFrameID */ Any) | Null
      ] = js.native
    
    def clearTimers(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MDrawer(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDrawer(prevProps: DrawerProps, prevState: DrawerState): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDrawer(): Unit = js.native
    
    def didClose(): Unit = js.native
    
    def didOpen(): Unit = js.native
    
    def disableMountNodeScroll(): Unit = js.native
    
    def getChildren(): Any = js.native
    
    def getMountNode(): HTMLElement = js.native
    
    def getRef(component: String): ElementRef = js.native
    
    def getSharedProps(): OmitSharedStylePropsArgch = js.native
    
    def handleBlur(event: SyntheticEvent[Element, Event]): Unit = js.native
    
    def handleFocus(event: SyntheticEvent[Element, Event]): Unit = js.native
    
    var lastFocus: js.UndefOr[HTMLElement | Null] = js.native
    
    var lastMountNodeOverflowStyle: js.UndefOr[String | Null] = js.native
    
    def onBackdropClick(event: Event): Unit = js.native
    
    def onCloseClick(): Unit = js.native
    
    def onEscape(): Unit = js.native
    
    def renderDrawer(renderedContent: ReactNode): typings.react.mod.global.JSX.Element = js.native
    
    def resetMountNodeScroll(): Unit = js.native
    
    @JSName("state")
    var state_Drawer: IsVisible = js.native
    
    def triggerClose(): Unit = js.native
    def triggerClose(source: typings.baseui.drawerTypesMod.CloseSource): Unit = js.native
  }
}
