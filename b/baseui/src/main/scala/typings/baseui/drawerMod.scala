package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.anon.CloseSource
import typings.baseui.baseuiStrings.`100Percentsign`
import typings.baseui.baseuiStrings.`500px`
import typings.baseui.baseuiStrings.button
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.div
import typings.baseui.baseuiStrings.escape_
import typings.baseui.drawerDrawerMod.default
import typings.baseui.drawerTypesMod.AnchorProp
import typings.baseui.drawerTypesMod.DrawerOverrides
import typings.baseui.drawerTypesMod.SharedStylePropsArg
import typings.baseui.drawerTypesMod.SizeProp
import typings.react.mod.ReactNode
import typings.std.Event
import typings.std.HTMLElement
import typings.styletronReact.typesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerMod {
  
  object ANCHOR {
    
    @JSImport("baseui/drawer", "ANCHOR.bottom")
    @js.native
    val bottom: typings.baseui.baseuiStrings.bottom = js.native
    
    @JSImport("baseui/drawer", "ANCHOR.left")
    @js.native
    val left: typings.baseui.baseuiStrings.left = js.native
    
    @JSImport("baseui/drawer", "ANCHOR.right")
    @js.native
    val right: typings.baseui.baseuiStrings.right = js.native
    
    @JSImport("baseui/drawer", "ANCHOR.top")
    @js.native
    val top: typings.baseui.baseuiStrings.top = js.native
  }
  
  object CLOSE_SOURCE {
    
    @JSImport("baseui/drawer", "CLOSE_SOURCE.backdrop")
    @js.native
    val backdrop: typings.baseui.baseuiStrings.backdrop = js.native
    
    @JSImport("baseui/drawer", "CLOSE_SOURCE.closeButton")
    @js.native
    val closeButton: typings.baseui.baseuiStrings.closeButton = js.native
    
    @JSImport("baseui/drawer", "CLOSE_SOURCE.escape")
    @js.native
    val escape: escape_ = js.native
  }
  
  @JSImport("baseui/drawer", "Drawer")
  @js.native
  open class Drawer () extends default
  object Drawer {
    
    /* static member */
    /* Inlined std.Partial<baseui.baseui/drawer/types.DrawerProps> */
    object defaultProps {
      
      @JSImport("baseui/drawer", "Drawer.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/drawer", "Drawer.defaultProps.anchor")
      @js.native
      def anchor: js.UndefOr[AnchorProp] = js.native
      inline def anchor_=(x: js.UndefOr[AnchorProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("anchor")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/drawer", "Drawer.defaultProps.animate")
      @js.native
      def animate: js.UndefOr[Boolean] = js.native
      inline def animate_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/drawer", "Drawer.defaultProps.autoFocus")
      @js.native
      def autoFocus: js.UndefOr[Boolean] = js.native
      inline def autoFocus_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/drawer", "Drawer.defaultProps.children")
      @js.native
      def children: js.UndefOr[ReactNode | js.Function0[ReactNode]] = js.native
      inline def children_=(x: js.UndefOr[ReactNode | js.Function0[ReactNode]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/drawer", "Drawer.defaultProps.closeable")
      @js.native
      def closeable: js.UndefOr[Boolean] = js.native
      inline def closeable_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeable")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/drawer", "Drawer.defaultProps.isOpen")
      @js.native
      def isOpen: js.UndefOr[Boolean] = js.native
      inline def isOpen_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/drawer", "Drawer.defaultProps.mountNode")
      @js.native
      def mountNode: js.UndefOr[HTMLElement] = js.native
      inline def mountNode_=(x: js.UndefOr[HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mountNode")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/drawer", "Drawer.defaultProps.onBackdropClick")
      @js.native
      def onBackdropClick: js.UndefOr[js.Function1[/* e */ Event, Any]] = js.native
      inline def onBackdropClick_=(x: js.UndefOr[js.Function1[/* e */ Event, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBackdropClick")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/drawer", "Drawer.defaultProps.onClose")
      @js.native
      def onClose: js.UndefOr[js.Function1[/* a */ CloseSource, Any]] = js.native
      inline def onClose_=(x: js.UndefOr[js.Function1[/* a */ CloseSource, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClose")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/drawer", "Drawer.defaultProps.onEscapeKeyDown")
      @js.native
      def onEscapeKeyDown: js.UndefOr[js.Function1[/* e */ Event, Any]] = js.native
      inline def onEscapeKeyDown_=(x: js.UndefOr[js.Function1[/* e */ Event, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onEscapeKeyDown")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/drawer", "Drawer.defaultProps.overrides")
      @js.native
      def overrides: js.UndefOr[DrawerOverrides] = js.native
      inline def overrides_=(x: js.UndefOr[DrawerOverrides]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrides")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/drawer", "Drawer.defaultProps.renderAll")
      @js.native
      def renderAll: js.UndefOr[Boolean] = js.native
      inline def renderAll_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderAll")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/drawer", "Drawer.defaultProps.showBackdrop")
      @js.native
      def showBackdrop: js.UndefOr[Boolean] = js.native
      inline def showBackdrop_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showBackdrop")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/drawer", "Drawer.defaultProps.size")
      @js.native
      def size: js.UndefOr[SizeProp] = js.native
      inline def size_=(x: js.UndefOr[SizeProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/drawer", "Hidden")
  @js.native
  val Hidden: StyletronComponent[div, js.Object] = js.native
  
  object SIZE extends Shortcut {
    
    @JSImport("baseui/drawer", "SIZE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/drawer", "SIZE.auto")
    @js.native
    val auto: typings.baseui.baseuiStrings.auto = js.native
    
    @JSImport("baseui/drawer", "SIZE.full")
    @js.native
    val full: typings.baseui.baseuiStrings.full = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `SIZE.foo` */
    override def _to: default_ = default
  }
  
  object SIZE_DIMENSION extends Shortcut {
    
    @JSImport("baseui/drawer", "SIZE_DIMENSION.default")
    @js.native
    val default: `500px` = js.native
    
    @JSImport("baseui/drawer", "SIZE_DIMENSION.auto")
    @js.native
    val auto: typings.baseui.baseuiStrings.auto = js.native
    
    @JSImport("baseui/drawer", "SIZE_DIMENSION.full")
    @js.native
    val full: `100Percentsign` = js.native
    
    type _To = `500px`
    
    /* This means you don't have to write `default`, but can instead just say `SIZE_DIMENSION.foo` */
    override def _to: `500px` = default
  }
  
  @JSImport("baseui/drawer", "StyledBackdrop")
  @js.native
  val StyledBackdrop: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/drawer", "StyledClose")
  @js.native
  val StyledClose: StyletronComponent[button, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/drawer", "StyledDrawerBody")
  @js.native
  val StyledDrawerBody: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/drawer", "StyledDrawerContainer")
  @js.native
  val StyledDrawerContainer: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/drawer", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[div, SharedStylePropsArg] = js.native
}
