package typings.bootstrap

import typings.bootstrap.anon.Hide
import typings.bootstrap.anon.PartialOptionsAllowList
import typings.bootstrap.anon.RecordkeyofHTMLElementTag
import typings.bootstrap.bootstrapBooleans.`false`
import typings.bootstrap.bootstrapStrings.`click focus`
import typings.bootstrap.bootstrapStrings.`click hover focus`
import typings.bootstrap.bootstrapStrings.`click hover`
import typings.bootstrap.bootstrapStrings.`hover focus`
import typings.bootstrap.bootstrapStrings.click
import typings.bootstrap.bootstrapStrings.disable
import typings.bootstrap.bootstrapStrings.dispose
import typings.bootstrap.bootstrapStrings.enable
import typings.bootstrap.bootstrapStrings.focus
import typings.bootstrap.bootstrapStrings.hide
import typings.bootstrap.bootstrapStrings.hover
import typings.bootstrap.bootstrapStrings.manual
import typings.bootstrap.bootstrapStrings.popover
import typings.bootstrap.bootstrapStrings.setContent
import typings.bootstrap.bootstrapStrings.show
import typings.bootstrap.bootstrapStrings.toggle
import typings.bootstrap.bootstrapStrings.toggleEnabled
import typings.bootstrap.bootstrapStrings.update
import typings.bootstrap.jsDistBaseComponentMod.GetInstanceFactory
import typings.bootstrap.jsDistBaseComponentMod.GetOrCreateInstanceFactory
import typings.bootstrap.jsDistPopoverMod.Popover.Options
import typings.bootstrap.jsDistPopoverMod.Popover.jQueryInterface
import typings.bootstrap.jsDistTooltipMod.Tooltip.Offset
import typings.bootstrap.jsDistTooltipMod.Tooltip.OffsetFunction
import typings.bootstrap.jsDistTooltipMod.Tooltip.PopoverPlacement
import typings.bootstrap.jsDistTooltipMod.Tooltip.SetContentFunction
import typings.bootstrap.mod.global.Element
import typings.bootstrap.mod.global.JQuery
import typings.popperjsCore.libEnumsMod.Boundary
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsDistPopoverMod {
  
  @JSImport("bootstrap/js/dist/popover", JSImport.Default)
  @js.native
  open class default protected () extends Popover {
    def this(element: String) = this()
    def this(element: Element) = this()
    def this(element: String, options: PartialOptionsAllowList) = this()
    def this(element: Element, options: PartialOptionsAllowList) = this()
  }
  object default {
    
    @JSImport("bootstrap/js/dist/popover", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default settings of this plugin
      *
      * @link https://getbootstrap.com/docs/5.0/getting-started/javascript/#default-settings
      */
    /* static member */
    @JSImport("bootstrap/js/dist/popover", "default.Default")
    @js.native
    def Default: Options = js.native
    
    /* static member */
    /* Inlined std.Record<keyof bootstrap.bootstrap/js/dist/popover.Popover.Options, string> */
    object DefaultType {
      
      @JSImport("bootstrap/js/dist/popover", "default.DefaultType")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("bootstrap/js/dist/popover", "default.DefaultType.allowList")
      @js.native
      def allowList: String = js.native
      inline def allowList_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowList")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/popover", "default.DefaultType.animation")
      @js.native
      def animation: String = js.native
      inline def animation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animation")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/popover", "default.DefaultType.boundary")
      @js.native
      def boundary: String = js.native
      inline def boundary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boundary")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/popover", "default.DefaultType.container")
      @js.native
      def container: String = js.native
      inline def container_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("container")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/popover", "default.DefaultType.content")
      @js.native
      def content: String = js.native
      inline def content_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("content")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/popover", "default.DefaultType.customClass")
      @js.native
      def customClass: js.UndefOr[String] = js.native
      inline def customClass_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("customClass")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/popover", "default.DefaultType.delay")
      @js.native
      def delay: String = js.native
      inline def delay_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delay")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/popover", "default.DefaultType.fallbackPlacements")
      @js.native
      def fallbackPlacements: String = js.native
      inline def fallbackPlacements_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fallbackPlacements")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/popover", "default.DefaultType.html")
      @js.native
      def html: String = js.native
      inline def html_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("html")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/popover", "default.DefaultType.offset")
      @js.native
      def offset: String = js.native
      inline def offset_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("offset")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/popover", "default.DefaultType.placement")
      @js.native
      def placement: String = js.native
      inline def placement_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/popover", "default.DefaultType.popperConfig")
      @js.native
      def popperConfig: js.UndefOr[String] = js.native
      inline def popperConfig_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popperConfig")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/popover", "default.DefaultType.sanitize")
      @js.native
      def sanitize: String = js.native
      
      @JSImport("bootstrap/js/dist/popover", "default.DefaultType.sanitizeFn")
      @js.native
      def sanitizeFn: String = js.native
      inline def sanitizeFn_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sanitizeFn")(x.asInstanceOf[js.Any])
      
      inline def sanitize_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sanitize")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/popover", "default.DefaultType.selector")
      @js.native
      def selector: String = js.native
      inline def selector_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selector")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/popover", "default.DefaultType.template")
      @js.native
      def template: String = js.native
      inline def template_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("template")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/popover", "default.DefaultType.title")
      @js.native
      def title: String = js.native
      inline def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/popover", "default.DefaultType.trigger")
      @js.native
      def trigger: String = js.native
      inline def trigger_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trigger")(x.asInstanceOf[js.Any])
    }
    
    inline def Default_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
    
    /* static member */
    /* Inlined std.Record<'CLICK' | 'FOCUSIN' | 'FOCUSOUT' | 'HIDDEN' | 'HIDE' | 'INSERTED' | 'MOUSEENTER' | 'MOUSELEAVE' | 'SHOW' | 'SHOWN', string> */
    object Event {
      
      @JSImport("bootstrap/js/dist/popover", "default.Event")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("bootstrap/js/dist/popover", "default.Event.CLICK")
      @js.native
      def CLICK: String = js.native
      inline def CLICK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLICK")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/popover", "default.Event.FOCUSIN")
      @js.native
      def FOCUSIN: String = js.native
      inline def FOCUSIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUSIN")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/popover", "default.Event.FOCUSOUT")
      @js.native
      def FOCUSOUT: String = js.native
      inline def FOCUSOUT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUSOUT")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/popover", "default.Event.HIDDEN")
      @js.native
      def HIDDEN: String = js.native
      inline def HIDDEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HIDDEN")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/popover", "default.Event.HIDE")
      @js.native
      def HIDE: String = js.native
      inline def HIDE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HIDE")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/popover", "default.Event.INSERTED")
      @js.native
      def INSERTED: String = js.native
      inline def INSERTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INSERTED")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/popover", "default.Event.MOUSEENTER")
      @js.native
      def MOUSEENTER: String = js.native
      inline def MOUSEENTER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOUSEENTER")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/popover", "default.Event.MOUSELEAVE")
      @js.native
      def MOUSELEAVE: String = js.native
      inline def MOUSELEAVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOUSELEAVE")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/popover", "default.Event.SHOW")
      @js.native
      def SHOW: String = js.native
      
      @JSImport("bootstrap/js/dist/popover", "default.Event.SHOWN")
      @js.native
      def SHOWN: String = js.native
      inline def SHOWN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOWN")(x.asInstanceOf[js.Any])
      
      inline def SHOW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("bootstrap/js/dist/popover", "default.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.bootstrap.jsDistPopoverMod.Popover.Events & String] = js.native
      
      /* "hidden.bs.popover" */ val hidden: typings.bootstrap.jsDistPopoverMod.Popover.Events.hidden & String = js.native
      
      /* "hide.bs.popover" */ val hide: typings.bootstrap.jsDistPopoverMod.Popover.Events.hide & String = js.native
      
      /* "inserted.bs.popover" */ val inserted: typings.bootstrap.jsDistPopoverMod.Popover.Events.inserted & String = js.native
      
      /* "show.bs.popover" */ val show: typings.bootstrap.jsDistPopoverMod.Popover.Events.show & String = js.native
      
      /* "shown.bs.popover" */ val shown: typings.bootstrap.jsDistPopoverMod.Popover.Events.shown & String = js.native
    }
    
    /* static member */
    @JSImport("bootstrap/js/dist/popover", "default.NAME")
    @js.native
    def NAME: popover = js.native
    inline def NAME_=(x: popover): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("bootstrap/js/dist/popover", "default.getInstance")
    @js.native
    def getInstance: GetInstanceFactory[Popover] = js.native
    inline def getInstance_=(x: GetInstanceFactory[Popover]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
    
    /**
      * Static method which allows you to get the popover instance associated with
      *  a DOM element, or create a new one in case it wasn’t initialised
      */
    /* static member */
    @JSImport("bootstrap/js/dist/popover", "default.getOrCreateInstance")
    @js.native
    def getOrCreateInstance: GetOrCreateInstanceFactory[Popover, PartialOptionsAllowList] = js.native
    inline def getOrCreateInstance_=(x: GetOrCreateInstanceFactory[Popover, PartialOptionsAllowList]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("bootstrap/js/dist/popover", "default.jQueryInterface")
    @js.native
    def jQueryInterface: typings.bootstrap.jsDistPopoverMod.Popover.jQueryInterface = js.native
    inline def jQueryInterface_=(x: jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Popover
    extends typings.bootstrap.jsDistBaseComponentMod.default {
    
    /**
      * Removes the ability for an element’s popover to be shown. The popover
      * will only be able to be shown if it is re-enabled.
      */
    def disable(): Unit = js.native
    
    /**
      * Gives an element’s popover the ability to be shown. Popovers are
      * enabled by default.
      */
    def enable(): Unit = js.native
    
    /**
      * Hides an element’s popover. Returns to the caller before the popover
      * has actually been hidden (i.e. before the hidden.bs.popover event
      * occurs). This is considered a “manual” triggering of the popover.
      */
    def hide(): Unit = js.native
    
    /**
      * Gives a way to change the popover’s content after its initialization.
      */
    def setContent(): Unit = js.native
    def setContent(content: Record[String, String | Element | SetContentFunction | Null]): Unit = js.native
    
    /**
      * Reveals an element’s popover. Returns to the caller before the
      * popover has actually been shown (i.e. before the shown.bs.popover
      * event occurs). This is considered a “manual” triggering of the
      * popover. Popovers whose title and content are both zero-length are
      * never displayed.
      */
    def show(): Unit = js.native
    
    /**
      * Toggles an element’s popover. Returns to the caller before the
      * popover has actually been shown or hidden (i.e. before the
      * shown.bs.popover or hidden.bs.popover event occurs). This is
      * considered a “manual” triggering of the popover.
      */
    def toggle(): Unit = js.native
    
    /**
      * Toggles the ability for an element’s popover to be shown or hidden.
      */
    def toggleEnabled(): Unit = js.native
    
    /**
      * Updates the position of an element’s popover.
      */
    def update(): Unit = js.native
  }
  object Popover {
    
    @js.native
    sealed trait Events extends StObject
    @JSImport("bootstrap/js/dist/popover", "Popover.Events")
    @js.native
    object Events extends StObject {
      
      /**
        * This event is fired when the popover has finished being hidden from
        * the user (will wait for CSS transitions to complete).
        */
      @js.native
      sealed trait hidden
        extends StObject
           with Events
      
      /**
        * This event is fired immediately when the hide instance method has
        * been called.
        */
      @js.native
      sealed trait hide
        extends StObject
           with Events
      
      /**
        * This event is fired after the show.bs.popover event when the popover
        * template has been added to the DOM.
        */
      @js.native
      sealed trait inserted
        extends StObject
           with Events
      
      /**
        * This event fires immediately when the show instance method is called.
        */
      @js.native
      sealed trait show
        extends StObject
           with Events
      
      /**
        * This event is fired when the popover has been made visible to the
        * user (will wait for CSS transitions to complete).
        */
      @js.native
      sealed trait shown
        extends StObject
           with Events
    }
    
    /* Inlined parent std.Omit<bootstrap.bootstrap/js/dist/tooltip.default.Options, 'popperConfig'> */
    trait Options extends StObject {
      
      var allowList: RecordkeyofHTMLElementTag
      
      var animation: Boolean
      
      var boundary: Boundary
      
      var container: String | Element | `false`
      
      /**
        * Default content value if data-content attribute isn't present.
        *
        * If a function is given, it will be called with its this reference set
        * to the element that the popover is attached to.
        *
        * @default ''
        */
      var content: String | Element | JQuery | (js.ThisFunction0[/* this */ HTMLElement, String | Element | JQuery])
      
      var customClass: js.UndefOr[String | js.Function0[String]] = js.undefined
      
      var delay: Double | Hide
      
      var fallbackPlacements: js.Array[String]
      
      var html: Boolean
      
      var offset: Offset | String | OffsetFunction
      
      var placement: PopoverPlacement | js.Function0[PopoverPlacement]
      
      /**
        * To change Bootstrap's default Popper.js config
        *
        * When a function is used to create the Popper configuration, it's
        * called with an object that contains the Bootstrap's default Popper
        * configuration. It helps you use and merge the default with your own
        * configuration. The function must return a configuration object for
        * Popper.
        *
        * @see {@link https://popper.js.org/docs/v2}
        * @default null
        */
      var popperConfig: PartialOptionsAllowList | PopperConfigFunction | Null
      
      var sanitize: Boolean
      
      def sanitizeFn(): Unit | Null
      @JSName("sanitizeFn")
      var sanitizeFn_Original: js.Function0[Unit | Null]
      
      var selector: String | `false`
      
      var template: String
      
      var title: String | Element | JQuery | (js.ThisFunction0[/* this */ HTMLElement, String | Element | JQuery])
      
      var trigger: click | hover | focus | manual | (`click hover`) | (`click focus`) | (`hover focus`) | (`click hover focus`)
    }
    object Options {
      
      inline def apply(
        allowList: RecordkeyofHTMLElementTag,
        animation: Boolean,
        boundary: Boundary,
        container: String | Element | `false`,
        content: String | Element | JQuery | (js.ThisFunction0[/* this */ HTMLElement, String | Element | JQuery]),
        delay: Double | Hide,
        fallbackPlacements: js.Array[String],
        html: Boolean,
        offset: Offset | String | OffsetFunction,
        placement: PopoverPlacement | js.Function0[PopoverPlacement],
        sanitize: Boolean,
        sanitizeFn: () => Unit | Null,
        selector: String | `false`,
        template: String,
        title: String | Element | JQuery | (js.ThisFunction0[/* this */ HTMLElement, String | Element | JQuery]),
        trigger: click | hover | focus | manual | (`click hover`) | (`click focus`) | (`hover focus`) | (`click hover focus`)
      ): Options = {
        val __obj = js.Dynamic.literal(allowList = allowList.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], boundary = boundary.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], fallbackPlacements = fallbackPlacements.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], sanitize = sanitize.asInstanceOf[js.Any], sanitizeFn = js.Any.fromFunction0(sanitizeFn), selector = selector.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any], popperConfig = null)
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setAllowList(value: RecordkeyofHTMLElementTag): Self = StObject.set(x, "allowList", value.asInstanceOf[js.Any])
        
        inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
        
        inline def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
        
        inline def setBoundaryVarargs(value: typings.std.Element*): Self = StObject.set(x, "boundary", js.Array(value*))
        
        inline def setContainer(value: String | Element | `false`): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
        
        inline def setContent(
          value: String | Element | JQuery | (js.ThisFunction0[/* this */ HTMLElement, String | Element | JQuery])
        ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setCustomClass(value: String | js.Function0[String]): Self = StObject.set(x, "customClass", value.asInstanceOf[js.Any])
        
        inline def setCustomClassFunction0(value: () => String): Self = StObject.set(x, "customClass", js.Any.fromFunction0(value))
        
        inline def setCustomClassUndefined: Self = StObject.set(x, "customClass", js.undefined)
        
        inline def setDelay(value: Double | Hide): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
        
        inline def setFallbackPlacements(value: js.Array[String]): Self = StObject.set(x, "fallbackPlacements", value.asInstanceOf[js.Any])
        
        inline def setFallbackPlacementsVarargs(value: String*): Self = StObject.set(x, "fallbackPlacements", js.Array(value*))
        
        inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
        
        inline def setOffset(value: Offset | String | OffsetFunction): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        inline def setOffsetFunction0(value: () => Offset): Self = StObject.set(x, "offset", js.Any.fromFunction0(value))
        
        inline def setPlacement(value: PopoverPlacement | js.Function0[PopoverPlacement]): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
        
        inline def setPlacementFunction0(value: () => PopoverPlacement): Self = StObject.set(x, "placement", js.Any.fromFunction0(value))
        
        inline def setPopperConfig(value: PartialOptionsAllowList | PopperConfigFunction): Self = StObject.set(x, "popperConfig", value.asInstanceOf[js.Any])
        
        inline def setPopperConfigFunction1(value: /* defaultBsPopperConfig */ Options => PartialOptionsAllowList): Self = StObject.set(x, "popperConfig", js.Any.fromFunction1(value))
        
        inline def setPopperConfigNull: Self = StObject.set(x, "popperConfig", null)
        
        inline def setSanitize(value: Boolean): Self = StObject.set(x, "sanitize", value.asInstanceOf[js.Any])
        
        inline def setSanitizeFn(value: () => Unit | Null): Self = StObject.set(x, "sanitizeFn", js.Any.fromFunction0(value))
        
        inline def setSelector(value: String | `false`): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
        
        inline def setTitle(
          value: String | Element | JQuery | (js.ThisFunction0[/* this */ HTMLElement, String | Element | JQuery])
        ): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTrigger(
          value: click | hover | focus | manual | (`click hover`) | (`click focus`) | (`hover focus`) | (`click hover focus`)
        ): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      }
    }
    
    type PopperConfigFunction = js.Function1[/* defaultBsPopperConfig */ Options, PartialOptionsAllowList]
    
    type jQueryInterface = js.Function1[
        /* config */ js.UndefOr[
          PartialOptionsAllowList | show | hide | toggle | enable | disable | toggleEnabled | update | setContent | dispose
        ], 
        JQuery
      ]
  }
}
