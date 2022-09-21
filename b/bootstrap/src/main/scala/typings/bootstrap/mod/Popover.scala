package typings.bootstrap.mod

import typings.bootstrap.anon.PartialOptionsAllowList
import typings.bootstrap.baseComponentMod.GetInstanceFactory
import typings.bootstrap.baseComponentMod.GetOrCreateInstanceFactory
import typings.bootstrap.bootstrapStrings.popover
import typings.bootstrap.mod.global.Element
import typings.bootstrap.popoverMod.Popover.Options
import typings.bootstrap.popoverMod.Popover.jQueryInterface
import typings.bootstrap.popoverMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap", "Popover")
@js.native
open class Popover protected () extends default {
  def this(element: String) = this()
  def this(element: Element) = this()
  def this(element: String, options: PartialOptionsAllowList) = this()
  def this(element: Element, options: PartialOptionsAllowList) = this()
}
object Popover {
  
  @JSImport("bootstrap", "Popover")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Default settings of this plugin
    *
    * @link https://getbootstrap.com/docs/5.0/getting-started/javascript/#default-settings
    */
  /* static member */
  @JSImport("bootstrap", "Popover.Default")
  @js.native
  def Default: Options = js.native
  
  /* static member */
  /* Inlined std.Record<keyof bootstrap.bootstrap/js/dist/popover.Popover.Options, string> */
  object DefaultType {
    
    @JSImport("bootstrap", "Popover.DefaultType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bootstrap", "Popover.DefaultType.allowList")
    @js.native
    def allowList: String = js.native
    inline def allowList_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowList")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Popover.DefaultType.animation")
    @js.native
    def animation: String = js.native
    inline def animation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animation")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Popover.DefaultType.boundary")
    @js.native
    def boundary: String = js.native
    inline def boundary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boundary")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Popover.DefaultType.container")
    @js.native
    def container: String = js.native
    inline def container_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("container")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Popover.DefaultType.content")
    @js.native
    def content: String = js.native
    inline def content_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("content")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Popover.DefaultType.customClass")
    @js.native
    def customClass: js.UndefOr[String] = js.native
    inline def customClass_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("customClass")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Popover.DefaultType.delay")
    @js.native
    def delay: String = js.native
    inline def delay_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delay")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Popover.DefaultType.fallbackPlacement")
    @js.native
    def fallbackPlacement: String = js.native
    inline def fallbackPlacement_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fallbackPlacement")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Popover.DefaultType.html")
    @js.native
    def html: String = js.native
    inline def html_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("html")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Popover.DefaultType.offset")
    @js.native
    def offset: String = js.native
    inline def offset_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("offset")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Popover.DefaultType.placement")
    @js.native
    def placement: String = js.native
    inline def placement_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Popover.DefaultType.popperConfig")
    @js.native
    def popperConfig: js.UndefOr[String] = js.native
    inline def popperConfig_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popperConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Popover.DefaultType.sanitize")
    @js.native
    def sanitize: String = js.native
    
    @JSImport("bootstrap", "Popover.DefaultType.sanitizeFn")
    @js.native
    def sanitizeFn: String = js.native
    inline def sanitizeFn_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sanitizeFn")(x.asInstanceOf[js.Any])
    
    inline def sanitize_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sanitize")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Popover.DefaultType.selector")
    @js.native
    def selector: String = js.native
    inline def selector_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selector")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Popover.DefaultType.template")
    @js.native
    def template: String = js.native
    inline def template_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("template")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Popover.DefaultType.title")
    @js.native
    def title: String = js.native
    inline def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Popover.DefaultType.trigger")
    @js.native
    def trigger: String = js.native
    inline def trigger_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trigger")(x.asInstanceOf[js.Any])
  }
  
  inline def Default_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
  
  /* static member */
  /* Inlined std.Record<'CLICK' | 'FOCUSIN' | 'FOCUSOUT' | 'HIDDEN' | 'HIDE' | 'INSERTED' | 'MOUSEENTER' | 'MOUSELEAVE' | 'SHOW' | 'SHOWN', string> */
  object Event {
    
    @JSImport("bootstrap", "Popover.Event")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bootstrap", "Popover.Event.CLICK")
    @js.native
    def CLICK: String = js.native
    inline def CLICK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLICK")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Popover.Event.FOCUSIN")
    @js.native
    def FOCUSIN: String = js.native
    inline def FOCUSIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUSIN")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Popover.Event.FOCUSOUT")
    @js.native
    def FOCUSOUT: String = js.native
    inline def FOCUSOUT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUSOUT")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Popover.Event.HIDDEN")
    @js.native
    def HIDDEN: String = js.native
    inline def HIDDEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HIDDEN")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Popover.Event.HIDE")
    @js.native
    def HIDE: String = js.native
    inline def HIDE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HIDE")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Popover.Event.INSERTED")
    @js.native
    def INSERTED: String = js.native
    inline def INSERTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INSERTED")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Popover.Event.MOUSEENTER")
    @js.native
    def MOUSEENTER: String = js.native
    inline def MOUSEENTER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOUSEENTER")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Popover.Event.MOUSELEAVE")
    @js.native
    def MOUSELEAVE: String = js.native
    inline def MOUSELEAVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOUSELEAVE")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Popover.Event.SHOW")
    @js.native
    def SHOW: String = js.native
    
    @JSImport("bootstrap", "Popover.Event.SHOWN")
    @js.native
    def SHOWN: String = js.native
    inline def SHOWN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOWN")(x.asInstanceOf[js.Any])
    
    inline def SHOW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("bootstrap", "Popover.Events")
  @js.native
  object Events extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.bootstrap.popoverMod.Popover.Events & String] = js.native
    
    /* "hidden.bs.popover" */ val hidden: typings.bootstrap.popoverMod.Popover.Events.hidden & String = js.native
    
    /* "hide.bs.popover" */ val hide: typings.bootstrap.popoverMod.Popover.Events.hide & String = js.native
    
    /* "inserted.bs.popover" */ val inserted: typings.bootstrap.popoverMod.Popover.Events.inserted & String = js.native
    
    /* "show.bs.popover" */ val show: typings.bootstrap.popoverMod.Popover.Events.show & String = js.native
    
    /* "shown.bs.popover" */ val shown: typings.bootstrap.popoverMod.Popover.Events.shown & String = js.native
  }
  
  /* static member */
  @JSImport("bootstrap", "Popover.NAME")
  @js.native
  def NAME: popover = js.native
  inline def NAME_=(x: popover): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("bootstrap", "Popover.getInstance")
  @js.native
  def getInstance: GetInstanceFactory[typings.bootstrap.popoverMod.Popover] = js.native
  inline def getInstance_=(x: GetInstanceFactory[typings.bootstrap.popoverMod.Popover]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
  
  /**
    * Static method which allows you to get the popover instance associated with
    *  a DOM element, or create a new one in case it wasn’t initialised
    */
  /* static member */
  @JSImport("bootstrap", "Popover.getOrCreateInstance")
  @js.native
  def getOrCreateInstance: GetOrCreateInstanceFactory[typings.bootstrap.popoverMod.Popover, PartialOptionsAllowList] = js.native
  inline def getOrCreateInstance_=(x: GetOrCreateInstanceFactory[typings.bootstrap.popoverMod.Popover, PartialOptionsAllowList]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("bootstrap", "Popover.jQueryInterface")
  @js.native
  def jQueryInterface: typings.bootstrap.popoverMod.Popover.jQueryInterface = js.native
  inline def jQueryInterface_=(x: jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
}
