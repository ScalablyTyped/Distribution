package typings.bootstrap.mod

import typings.bootstrap.anon.PartialOptionsBoundary
import typings.bootstrap.bootstrapStrings.tooltip
import typings.bootstrap.jsDistBaseComponentMod.ComponentOptions
import typings.bootstrap.jsDistBaseComponentMod.GetInstanceFactory
import typings.bootstrap.jsDistBaseComponentMod.GetOrCreateInstanceFactory
import typings.bootstrap.jsDistTooltipMod.Tooltip.Options
import typings.bootstrap.jsDistTooltipMod.Tooltip.SetContentFunction
import typings.bootstrap.jsDistTooltipMod.Tooltip.jQueryInterface
import typings.bootstrap.jsDistTooltipMod.default
import typings.bootstrap.mod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap", "Tooltip")
@js.native
open class Tooltip protected () extends default {
  def this(element: String) = this()
  def this(element: Element) = this()
  def this(element: String, options: PartialOptionsBoundary) = this()
  def this(element: Element, options: PartialOptionsBoundary) = this()
}
object Tooltip {
  
  @JSImport("bootstrap", "Tooltip")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Default settings of this plugin
    *
    * @link https://getbootstrap.com/docs/5.0/getting-started/javascript/#default-settings
    */
  /* static member */
  @JSImport("bootstrap", "Tooltip.Default")
  @js.native
  def Default: Options = js.native
  
  /* static member */
  /* Inlined std.Record<keyof bootstrap.bootstrap/js/dist/tooltip.Tooltip.Options, string> */
  object DefaultType {
    
    @JSImport("bootstrap", "Tooltip.DefaultType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bootstrap", "Tooltip.DefaultType.allowList")
    @js.native
    def allowList: String = js.native
    inline def allowList_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowList")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Tooltip.DefaultType.animation")
    @js.native
    def animation: String = js.native
    inline def animation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animation")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Tooltip.DefaultType.boundary")
    @js.native
    def boundary: String = js.native
    inline def boundary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boundary")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Tooltip.DefaultType.container")
    @js.native
    def container: String = js.native
    inline def container_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("container")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Tooltip.DefaultType.customClass")
    @js.native
    def customClass: js.UndefOr[String] = js.native
    inline def customClass_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("customClass")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Tooltip.DefaultType.delay")
    @js.native
    def delay: String = js.native
    inline def delay_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delay")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Tooltip.DefaultType.fallbackPlacements")
    @js.native
    def fallbackPlacements: String = js.native
    inline def fallbackPlacements_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fallbackPlacements")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Tooltip.DefaultType.html")
    @js.native
    def html: String = js.native
    inline def html_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("html")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Tooltip.DefaultType.offset")
    @js.native
    def offset: String = js.native
    inline def offset_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("offset")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Tooltip.DefaultType.placement")
    @js.native
    def placement: String = js.native
    inline def placement_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Tooltip.DefaultType.popperConfig")
    @js.native
    def popperConfig: js.UndefOr[String] = js.native
    inline def popperConfig_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popperConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Tooltip.DefaultType.sanitize")
    @js.native
    def sanitize: String = js.native
    
    @JSImport("bootstrap", "Tooltip.DefaultType.sanitizeFn")
    @js.native
    def sanitizeFn: String = js.native
    inline def sanitizeFn_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sanitizeFn")(x.asInstanceOf[js.Any])
    
    inline def sanitize_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sanitize")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Tooltip.DefaultType.selector")
    @js.native
    def selector: String = js.native
    inline def selector_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selector")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Tooltip.DefaultType.template")
    @js.native
    def template: String = js.native
    inline def template_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("template")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Tooltip.DefaultType.title")
    @js.native
    def title: String = js.native
    inline def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Tooltip.DefaultType.trigger")
    @js.native
    def trigger: String = js.native
    inline def trigger_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trigger")(x.asInstanceOf[js.Any])
  }
  
  inline def Default_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
  
  /* static member */
  /* Inlined std.Record<'CLICK' | 'FOCUSIN' | 'FOCUSOUT' | 'HIDDEN' | 'HIDE' | 'INSERTED' | 'MOUSEENTER' | 'MOUSELEAVE' | 'SHOW' | 'SHOWN', string> */
  object Event {
    
    @JSImport("bootstrap", "Tooltip.Event")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bootstrap", "Tooltip.Event.CLICK")
    @js.native
    def CLICK: String = js.native
    inline def CLICK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLICK")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Tooltip.Event.FOCUSIN")
    @js.native
    def FOCUSIN: String = js.native
    inline def FOCUSIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUSIN")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Tooltip.Event.FOCUSOUT")
    @js.native
    def FOCUSOUT: String = js.native
    inline def FOCUSOUT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUSOUT")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Tooltip.Event.HIDDEN")
    @js.native
    def HIDDEN: String = js.native
    inline def HIDDEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HIDDEN")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Tooltip.Event.HIDE")
    @js.native
    def HIDE: String = js.native
    inline def HIDE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HIDE")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Tooltip.Event.INSERTED")
    @js.native
    def INSERTED: String = js.native
    inline def INSERTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INSERTED")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Tooltip.Event.MOUSEENTER")
    @js.native
    def MOUSEENTER: String = js.native
    inline def MOUSEENTER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOUSEENTER")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Tooltip.Event.MOUSELEAVE")
    @js.native
    def MOUSELEAVE: String = js.native
    inline def MOUSELEAVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOUSELEAVE")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Tooltip.Event.SHOW")
    @js.native
    def SHOW: String = js.native
    
    @JSImport("bootstrap", "Tooltip.Event.SHOWN")
    @js.native
    def SHOWN: String = js.native
    inline def SHOWN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOWN")(x.asInstanceOf[js.Any])
    
    inline def SHOW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("bootstrap", "Tooltip.Events")
  @js.native
  object Events extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.bootstrap.jsDistTooltipMod.Tooltip.Events & String] = js.native
    
    /* "hidden.bs.tooltip" */ val hidden: typings.bootstrap.jsDistTooltipMod.Tooltip.Events.hidden & String = js.native
    
    /* "hide.bs.tooltip" */ val hide: typings.bootstrap.jsDistTooltipMod.Tooltip.Events.hide & String = js.native
    
    /* "inserted.bs.tooltip" */ val inserted: typings.bootstrap.jsDistTooltipMod.Tooltip.Events.inserted & String = js.native
    
    /* "show.bs.tooltip" */ val show: typings.bootstrap.jsDistTooltipMod.Tooltip.Events.show & String = js.native
    
    /* "shown.bs.tooltip" */ val shown: typings.bootstrap.jsDistTooltipMod.Tooltip.Events.shown & String = js.native
  }
  
  /* static member */
  @JSImport("bootstrap", "Tooltip.NAME")
  @js.native
  def NAME: tooltip = js.native
  inline def NAME_=(x: tooltip): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("bootstrap", "Tooltip.SetContentFunction")
  @js.native
  def SetContentFunction: typings.bootstrap.jsDistTooltipMod.Tooltip.SetContentFunction = js.native
  inline def SetContentFunction_=(x: SetContentFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SetContentFunction")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("bootstrap", "Tooltip.getInstance")
  @js.native
  def getInstance: GetInstanceFactory[typings.bootstrap.jsDistTooltipMod.Tooltip] = js.native
  inline def getInstance_=(x: GetInstanceFactory[typings.bootstrap.jsDistTooltipMod.Tooltip]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
  
  /**
    * Static method which allows you to get the tooltip instance associated with
    * a DOM element, or create a new one in case it wasn’t initialised
    */
  /* static member */
  @JSImport("bootstrap", "Tooltip.getOrCreateInstance")
  @js.native
  def getOrCreateInstance: GetOrCreateInstanceFactory[typings.bootstrap.jsDistTooltipMod.Tooltip, ComponentOptions] = js.native
  inline def getOrCreateInstance_=(x: GetOrCreateInstanceFactory[typings.bootstrap.jsDistTooltipMod.Tooltip, ComponentOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("bootstrap", "Tooltip.jQueryInterface")
  @js.native
  def jQueryInterface: typings.bootstrap.jsDistTooltipMod.Tooltip.jQueryInterface = js.native
  inline def jQueryInterface_=(x: jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
}
