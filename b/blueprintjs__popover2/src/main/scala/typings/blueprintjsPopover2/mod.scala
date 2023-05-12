package typings.blueprintjsPopover2

import typings.blueprintjsPopover2.anon.OmitContextMenu2PopoverPr
import typings.blueprintjsPopover2.anon.PartialBreadcrumbs2Props
import typings.blueprintjsPopover2.anon.PartialTooltip2PropsDefau
import typings.blueprintjsPopover2.blueprintjsPopover2Strings.`click-target`
import typings.blueprintjsPopover2.blueprintjsPopover2Strings.`hover-target`
import typings.blueprintjsPopover2.blueprintjsPopover2Strings.click
import typings.blueprintjsPopover2.blueprintjsPopover2Strings.hover
import typings.blueprintjsPopover2.libEsmBreadcrumbs2Mod.Breadcrumbs2Props
import typings.blueprintjsPopover2.libEsmContextMenu2Mod.ContextMenu2Props
import typings.blueprintjsPopover2.libEsmContextMenu2PopoverMod.ContextMenu2PopoverProps
import typings.blueprintjsPopover2.libEsmMenuItem2Mod.MenuItem2Props
import typings.blueprintjsPopover2.libEsmPopover2Mod.Popover2Props
import typings.blueprintjsPopover2.libEsmPopover2SharedPropsMod.DefaultPopover2TargetHTMLProps
import typings.blueprintjsPopover2.libEsmResizeSensor2Mod.ResizeSensor2Props
import typings.blueprintjsPopover2.libEsmTooltip2Mod.Tooltip2Props
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.FC
import typings.react.mod.NamedExoticComponent
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@blueprintjs/popover2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/popover2", "Breadcrumbs2")
  @js.native
  open class Breadcrumbs2 protected ()
    extends typings.blueprintjsPopover2.libEsmBreadcrumbs2Mod.Breadcrumbs2 {
    def this(props: Breadcrumbs2Props) = this()
    def this(props: Breadcrumbs2Props, context: Any) = this()
  }
  /* static members */
  object Breadcrumbs2 {
    
    @JSImport("@blueprintjs/popover2", "Breadcrumbs2")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/popover2", "Breadcrumbs2.defaultProps")
    @js.native
    def defaultProps: PartialBreadcrumbs2Props = js.native
    inline def defaultProps_=(x: PartialBreadcrumbs2Props): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  object Classes {
    
    @JSImport("@blueprintjs/popover2", "Classes.CONTEXT_MENU2")
    @js.native
    val CONTEXT_MENU2: String = js.native
    
    @JSImport("@blueprintjs/popover2", "Classes.CONTEXT_MENU2_BACKDROP")
    @js.native
    val CONTEXT_MENU2_BACKDROP: String = js.native
    
    @JSImport("@blueprintjs/popover2", "Classes.CONTEXT_MENU2_POPOVER2")
    @js.native
    val CONTEXT_MENU2_POPOVER2: String = js.native
    
    @JSImport("@blueprintjs/popover2", "Classes.CONTEXT_MENU2_VIRTUAL_TARGET")
    @js.native
    val CONTEXT_MENU2_VIRTUAL_TARGET: String = js.native
    
    @JSImport("@blueprintjs/popover2", "Classes.POPOVER2")
    @js.native
    val POPOVER2: String = js.native
    
    @JSImport("@blueprintjs/popover2", "Classes.POPOVER2_ARROW")
    @js.native
    val POPOVER2_ARROW: String = js.native
    
    @JSImport("@blueprintjs/popover2", "Classes.POPOVER2_BACKDROP")
    @js.native
    val POPOVER2_BACKDROP: String = js.native
    
    @JSImport("@blueprintjs/popover2", "Classes.POPOVER2_CAPTURING_DISMISS")
    @js.native
    val POPOVER2_CAPTURING_DISMISS: String = js.native
    
    @JSImport("@blueprintjs/popover2", "Classes.POPOVER2_CONTENT")
    @js.native
    val POPOVER2_CONTENT: String = js.native
    
    @JSImport("@blueprintjs/popover2", "Classes.POPOVER2_CONTENT_PLACEMENT")
    @js.native
    val POPOVER2_CONTENT_PLACEMENT: String = js.native
    
    @JSImport("@blueprintjs/popover2", "Classes.POPOVER2_CONTENT_SIZING")
    @js.native
    val POPOVER2_CONTENT_SIZING: String = js.native
    
    @JSImport("@blueprintjs/popover2", "Classes.POPOVER2_DISMISS")
    @js.native
    val POPOVER2_DISMISS: String = js.native
    
    @JSImport("@blueprintjs/popover2", "Classes.POPOVER2_DISMISS_OVERRIDE")
    @js.native
    val POPOVER2_DISMISS_OVERRIDE: String = js.native
    
    @JSImport("@blueprintjs/popover2", "Classes.POPOVER2_MATCH_TARGET_WIDTH")
    @js.native
    val POPOVER2_MATCH_TARGET_WIDTH: String = js.native
    
    @JSImport("@blueprintjs/popover2", "Classes.POPOVER2_OPEN")
    @js.native
    val POPOVER2_OPEN: String = js.native
    
    @JSImport("@blueprintjs/popover2", "Classes.POPOVER2_POPPER_ESCAPED")
    @js.native
    val POPOVER2_POPPER_ESCAPED: String = js.native
    
    @JSImport("@blueprintjs/popover2", "Classes.POPOVER2_REFERENCE_HIDDEN")
    @js.native
    val POPOVER2_REFERENCE_HIDDEN: String = js.native
    
    @JSImport("@blueprintjs/popover2", "Classes.POPOVER2_TARGET")
    @js.native
    val POPOVER2_TARGET: String = js.native
    
    @JSImport("@blueprintjs/popover2", "Classes.POPOVER2_TRANSITION_CONTAINER")
    @js.native
    val POPOVER2_TRANSITION_CONTAINER: String = js.native
    
    @JSImport("@blueprintjs/popover2", "Classes.TOOLTIP2")
    @js.native
    val TOOLTIP2: String = js.native
    
    @JSImport("@blueprintjs/popover2", "Classes.TOOLTIP2_INDICATOR")
    @js.native
    val TOOLTIP2_INDICATOR: String = js.native
  }
  
  @JSImport("@blueprintjs/popover2", "ContextMenu2")
  @js.native
  val ContextMenu2: FC[ContextMenu2Props] = js.native
  
  @JSImport("@blueprintjs/popover2", "ContextMenu2Popover")
  @js.native
  val ContextMenu2Popover: NamedExoticComponent[ContextMenu2PopoverProps] = js.native
  
  object Errors {
    
    @JSImport("@blueprintjs/popover2", "Errors.POPOVER2_HAS_BACKDROP_INTERACTION")
    @js.native
    val POPOVER2_HAS_BACKDROP_INTERACTION: String = js.native
    
    @JSImport("@blueprintjs/popover2", "Errors.POPOVER2_REQUIRES_TARGET")
    @js.native
    val POPOVER2_REQUIRES_TARGET: String = js.native
    
    @JSImport("@blueprintjs/popover2", "Errors.POPOVER2_WARN_DOUBLE_TARGET")
    @js.native
    val POPOVER2_WARN_DOUBLE_TARGET: String = js.native
    
    @JSImport("@blueprintjs/popover2", "Errors.POPOVER2_WARN_EMPTY_CONTENT")
    @js.native
    val POPOVER2_WARN_EMPTY_CONTENT: String = js.native
    
    @JSImport("@blueprintjs/popover2", "Errors.POPOVER2_WARN_HAS_BACKDROP_INLINE")
    @js.native
    val POPOVER2_WARN_HAS_BACKDROP_INLINE: String = js.native
    
    @JSImport("@blueprintjs/popover2", "Errors.POPOVER2_WARN_PLACEMENT_AND_POSITION_MUTEX")
    @js.native
    val POPOVER2_WARN_PLACEMENT_AND_POSITION_MUTEX: String = js.native
    
    @JSImport("@blueprintjs/popover2", "Errors.POPOVER2_WARN_TARGET_PROPS_WITH_RENDER_TARGET")
    @js.native
    val POPOVER2_WARN_TARGET_PROPS_WITH_RENDER_TARGET: String = js.native
    
    @JSImport("@blueprintjs/popover2", "Errors.POPOVER2_WARN_TOO_MANY_CHILDREN")
    @js.native
    val POPOVER2_WARN_TOO_MANY_CHILDREN: String = js.native
    
    @JSImport("@blueprintjs/popover2", "Errors.POPOVER2_WARN_UNCONTROLLED_ONINTERACTION")
    @js.native
    val POPOVER2_WARN_UNCONTROLLED_ONINTERACTION: String = js.native
  }
  
  @JSImport("@blueprintjs/popover2", "MenuItem2")
  @js.native
  open class MenuItem2 protected ()
    extends typings.blueprintjsPopover2.libEsmMenuItem2Mod.MenuItem2 {
    def this(props: MenuItem2Props & AnchorHTMLAttributes[HTMLAnchorElement]) = this()
    def this(props: MenuItem2Props & AnchorHTMLAttributes[HTMLAnchorElement], context: Any) = this()
  }
  /* static members */
  object MenuItem2 {
    
    @JSImport("@blueprintjs/popover2", "MenuItem2")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/popover2", "MenuItem2.defaultProps")
    @js.native
    def defaultProps: MenuItem2Props = js.native
    inline def defaultProps_=(x: MenuItem2Props): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/popover2", "MenuItem2.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/popover2", "Popover2")
  @js.native
  open class Popover2[T /* <: DefaultPopover2TargetHTMLProps */] protected ()
    extends typings.blueprintjsPopover2.libEsmPopover2Mod.Popover2[T] {
    def this(props: Popover2Props[T]) = this()
    def this(props: Popover2Props[T], context: Any) = this()
  }
  /* static members */
  object Popover2 {
    
    @JSImport("@blueprintjs/popover2", "Popover2")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/popover2", "Popover2.defaultProps")
    @js.native
    def defaultProps: Popover2Props[DefaultPopover2TargetHTMLProps] = js.native
    inline def defaultProps_=(x: Popover2Props[DefaultPopover2TargetHTMLProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/popover2", "Popover2.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  object Popover2InteractionKind {
    
    @JSImport("@blueprintjs/popover2", "Popover2InteractionKind")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/popover2", "Popover2InteractionKind.CLICK")
    @js.native
    def CLICK: click = js.native
    inline def CLICK_=(x: click): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLICK")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/popover2", "Popover2InteractionKind.CLICK_TARGET_ONLY")
    @js.native
    def CLICK_TARGET_ONLY: `click-target` = js.native
    inline def CLICK_TARGET_ONLY_=(x: `click-target`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLICK_TARGET_ONLY")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/popover2", "Popover2InteractionKind.HOVER")
    @js.native
    def HOVER: hover = js.native
    inline def HOVER_=(x: hover): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOVER")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/popover2", "Popover2InteractionKind.HOVER_TARGET_ONLY")
    @js.native
    def HOVER_TARGET_ONLY: `hover-target` = js.native
    inline def HOVER_TARGET_ONLY_=(x: `hover-target`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOVER_TARGET_ONLY")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/popover2", "PopupKind")
  @js.native
  object PopupKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.blueprintjsPopover2.libEsmPopupKindMod.PopupKind & String] = js.native
    
    /* "dialog" */ val DIALOG: typings.blueprintjsPopover2.libEsmPopupKindMod.PopupKind.DIALOG & String = js.native
    
    /* "grid" */ val GRID: typings.blueprintjsPopover2.libEsmPopupKindMod.PopupKind.GRID & String = js.native
    
    /* "listbox" */ val LISTBOX: typings.blueprintjsPopover2.libEsmPopupKindMod.PopupKind.LISTBOX & String = js.native
    
    /* "menu" */ val MENU: typings.blueprintjsPopover2.libEsmPopupKindMod.PopupKind.MENU & String = js.native
    
    /* "tree" */ val TREE: typings.blueprintjsPopover2.libEsmPopupKindMod.PopupKind.TREE & String = js.native
  }
  
  @JSImport("@blueprintjs/popover2", "ResizeSensor2")
  @js.native
  open class ResizeSensor2 protected ()
    extends typings.blueprintjsPopover2.libEsmResizeSensor2Mod.ResizeSensor2 {
    def this(props: ResizeSensor2Props) = this()
    def this(props: ResizeSensor2Props, context: Any) = this()
  }
  /* static members */
  object ResizeSensor2 {
    
    @JSImport("@blueprintjs/popover2", "ResizeSensor2")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/popover2", "ResizeSensor2.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/popover2", "Tooltip2")
  @js.native
  open class Tooltip2[T /* <: DefaultPopover2TargetHTMLProps */] protected ()
    extends typings.blueprintjsPopover2.libEsmTooltip2Mod.Tooltip2[T] {
    def this(props: Tooltip2Props[T]) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: Tooltip2Props[T], context: Any) = this()
  }
  /* static members */
  object Tooltip2 {
    
    @JSImport("@blueprintjs/popover2", "Tooltip2")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/popover2", "Tooltip2.defaultProps")
    @js.native
    def defaultProps: PartialTooltip2PropsDefau = js.native
    inline def defaultProps_=(x: PartialTooltip2PropsDefau): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/popover2", "Tooltip2.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  inline def hideContextMenu(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideContextMenu")().asInstanceOf[Unit]
  
  inline def showContextMenu(props: OmitContextMenu2PopoverPr): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showContextMenu")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
