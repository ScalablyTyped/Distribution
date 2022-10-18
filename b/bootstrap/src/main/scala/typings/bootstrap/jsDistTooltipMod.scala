package typings.bootstrap

import typings.bootstrap.anon.Hide
import typings.bootstrap.anon.PartialOptionsBoundary
import typings.bootstrap.anon.PartialOptionsModifiers
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
import typings.bootstrap.bootstrapStrings.setContent
import typings.bootstrap.bootstrapStrings.show
import typings.bootstrap.bootstrapStrings.toggle
import typings.bootstrap.bootstrapStrings.toggleEnabled
import typings.bootstrap.bootstrapStrings.tooltip
import typings.bootstrap.bootstrapStrings.update
import typings.bootstrap.jsDistBaseComponentMod.ComponentOptions
import typings.bootstrap.jsDistBaseComponentMod.GetInstanceFactory
import typings.bootstrap.jsDistBaseComponentMod.GetOrCreateInstanceFactory
import typings.bootstrap.jsDistTooltipMod.Tooltip.Options
import typings.bootstrap.jsDistTooltipMod.Tooltip.SetContentFunction
import typings.bootstrap.jsDistTooltipMod.Tooltip.jQueryInterface
import typings.bootstrap.mod.global.Element
import typings.bootstrap.mod.global.JQuery
import typings.popperjsCore.libEnumsMod.Boundary
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsDistTooltipMod {
  
  @JSImport("bootstrap/js/dist/tooltip", JSImport.Default)
  @js.native
  open class default protected () extends Tooltip {
    def this(element: String) = this()
    def this(element: Element) = this()
    def this(element: String, options: PartialOptionsBoundary) = this()
    def this(element: Element, options: PartialOptionsBoundary) = this()
  }
  object default {
    
    @JSImport("bootstrap/js/dist/tooltip", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default settings of this plugin
      *
      * @link https://getbootstrap.com/docs/5.0/getting-started/javascript/#default-settings
      */
    /* static member */
    @JSImport("bootstrap/js/dist/tooltip", "default.Default")
    @js.native
    def Default: Options = js.native
    
    /* static member */
    /* Inlined std.Record<keyof bootstrap.bootstrap/js/dist/tooltip.Tooltip.Options, string> */
    object DefaultType {
      
      @JSImport("bootstrap/js/dist/tooltip", "default.DefaultType")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("bootstrap/js/dist/tooltip", "default.DefaultType.allowList")
      @js.native
      def allowList: String = js.native
      inline def allowList_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowList")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/tooltip", "default.DefaultType.animation")
      @js.native
      def animation: String = js.native
      inline def animation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animation")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/tooltip", "default.DefaultType.boundary")
      @js.native
      def boundary: String = js.native
      inline def boundary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boundary")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/tooltip", "default.DefaultType.container")
      @js.native
      def container: String = js.native
      inline def container_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("container")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/tooltip", "default.DefaultType.customClass")
      @js.native
      def customClass: js.UndefOr[String] = js.native
      inline def customClass_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("customClass")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/tooltip", "default.DefaultType.delay")
      @js.native
      def delay: String = js.native
      inline def delay_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delay")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/tooltip", "default.DefaultType.fallbackPlacements")
      @js.native
      def fallbackPlacements: String = js.native
      inline def fallbackPlacements_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fallbackPlacements")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/tooltip", "default.DefaultType.html")
      @js.native
      def html: String = js.native
      inline def html_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("html")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/tooltip", "default.DefaultType.offset")
      @js.native
      def offset: String = js.native
      inline def offset_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("offset")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/tooltip", "default.DefaultType.placement")
      @js.native
      def placement: String = js.native
      inline def placement_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/tooltip", "default.DefaultType.popperConfig")
      @js.native
      def popperConfig: js.UndefOr[String] = js.native
      inline def popperConfig_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popperConfig")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/tooltip", "default.DefaultType.sanitize")
      @js.native
      def sanitize: String = js.native
      
      @JSImport("bootstrap/js/dist/tooltip", "default.DefaultType.sanitizeFn")
      @js.native
      def sanitizeFn: String = js.native
      inline def sanitizeFn_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sanitizeFn")(x.asInstanceOf[js.Any])
      
      inline def sanitize_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sanitize")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/tooltip", "default.DefaultType.selector")
      @js.native
      def selector: String = js.native
      inline def selector_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selector")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/tooltip", "default.DefaultType.template")
      @js.native
      def template: String = js.native
      inline def template_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("template")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/tooltip", "default.DefaultType.title")
      @js.native
      def title: String = js.native
      inline def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/tooltip", "default.DefaultType.trigger")
      @js.native
      def trigger: String = js.native
      inline def trigger_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trigger")(x.asInstanceOf[js.Any])
    }
    
    inline def Default_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
    
    /* static member */
    /* Inlined std.Record<'CLICK' | 'FOCUSIN' | 'FOCUSOUT' | 'HIDDEN' | 'HIDE' | 'INSERTED' | 'MOUSEENTER' | 'MOUSELEAVE' | 'SHOW' | 'SHOWN', string> */
    object Event {
      
      @JSImport("bootstrap/js/dist/tooltip", "default.Event")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("bootstrap/js/dist/tooltip", "default.Event.CLICK")
      @js.native
      def CLICK: String = js.native
      inline def CLICK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLICK")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/tooltip", "default.Event.FOCUSIN")
      @js.native
      def FOCUSIN: String = js.native
      inline def FOCUSIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUSIN")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/tooltip", "default.Event.FOCUSOUT")
      @js.native
      def FOCUSOUT: String = js.native
      inline def FOCUSOUT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUSOUT")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/tooltip", "default.Event.HIDDEN")
      @js.native
      def HIDDEN: String = js.native
      inline def HIDDEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HIDDEN")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/tooltip", "default.Event.HIDE")
      @js.native
      def HIDE: String = js.native
      inline def HIDE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HIDE")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/tooltip", "default.Event.INSERTED")
      @js.native
      def INSERTED: String = js.native
      inline def INSERTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INSERTED")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/tooltip", "default.Event.MOUSEENTER")
      @js.native
      def MOUSEENTER: String = js.native
      inline def MOUSEENTER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOUSEENTER")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/tooltip", "default.Event.MOUSELEAVE")
      @js.native
      def MOUSELEAVE: String = js.native
      inline def MOUSELEAVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOUSELEAVE")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/tooltip", "default.Event.SHOW")
      @js.native
      def SHOW: String = js.native
      
      @JSImport("bootstrap/js/dist/tooltip", "default.Event.SHOWN")
      @js.native
      def SHOWN: String = js.native
      inline def SHOWN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOWN")(x.asInstanceOf[js.Any])
      
      inline def SHOW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("bootstrap/js/dist/tooltip", "default.Events")
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
    @JSImport("bootstrap/js/dist/tooltip", "default.NAME")
    @js.native
    def NAME: tooltip = js.native
    inline def NAME_=(x: tooltip): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("bootstrap/js/dist/tooltip", "default.SetContentFunction")
    @js.native
    def SetContentFunction: typings.bootstrap.jsDistTooltipMod.Tooltip.SetContentFunction = js.native
    inline def SetContentFunction_=(x: SetContentFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SetContentFunction")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("bootstrap/js/dist/tooltip", "default.getInstance")
    @js.native
    def getInstance: GetInstanceFactory[Tooltip] = js.native
    inline def getInstance_=(x: GetInstanceFactory[Tooltip]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
    
    /**
      * Static method which allows you to get the tooltip instance associated with
      * a DOM element, or create a new one in case it wasn’t initialised
      */
    /* static member */
    @JSImport("bootstrap/js/dist/tooltip", "default.getOrCreateInstance")
    @js.native
    def getOrCreateInstance: GetOrCreateInstanceFactory[Tooltip, ComponentOptions] = js.native
    inline def getOrCreateInstance_=(x: GetOrCreateInstanceFactory[Tooltip, ComponentOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("bootstrap/js/dist/tooltip", "default.jQueryInterface")
    @js.native
    def jQueryInterface: typings.bootstrap.jsDistTooltipMod.Tooltip.jQueryInterface = js.native
    inline def jQueryInterface_=(x: jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Tooltip
    extends typings.bootstrap.jsDistBaseComponentMod.default {
    
    /**
      * Removes the ability for an element’s tooltip to be shown. The tooltip
      * will only be able to be shown if it is re-enabled.
      */
    def disable(): Unit = js.native
    
    /**
      * Gives an element’s tooltip the ability to be shown. Tooltips are
      * enabled by default.
      */
    def enable(): Unit = js.native
    
    /**
      * Hides an element’s tooltip. Returns to the caller before the tooltip
      * has actually been hidden (i.e. before the hidden.bs.tooltip event
      * occurs). This is considered a “manual” triggering of the tooltip.
      */
    def hide(): Unit = js.native
    
    /**
      * Gives a way to change the tooltip’s content after its initialization.
      */
    def setContent(): Unit = js.native
    def setContent(content: Record[String, String | Element | SetContentFunction | Null]): Unit = js.native
    
    /**
      * Reveals an element’s tooltip. Returns to the caller before the
      * tooltip has actually been shown (i.e. before the shown.bs.tooltip
      * event occurs). This is considered a “manual” triggering of the
      * tooltip. Tooltips with zero-length titles are never displayed.
      */
    def show(): Unit = js.native
    
    /**
      * Toggles an element’s tooltip. Returns to the caller before the
      * tooltip has actually been shown or hidden (i.e. before the
      * shown.bs.tooltip or hidden.bs.tooltip event occurs). This is
      * considered a “manual” triggering of the tooltip.
      */
    def toggle(): Unit = js.native
    def toggle(event: Any): Unit = js.native
    
    /**
      * Toggles the ability for an element’s tooltip to be shown or hidden.
      */
    def toggleEnabled(): Unit = js.native
    
    /**
      * Updates the position of an element’s tooltip.
      */
    def update(): Unit = js.native
  }
  object Tooltip {
    
    @js.native
    sealed trait Events extends StObject
    @JSImport("bootstrap/js/dist/tooltip", "Tooltip.Events")
    @js.native
    object Events extends StObject {
      
      /**
        * This event is fired when the tooltip has finished being hidden from
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
        * This event is fired after the show.bs.tooltip event when the tooltip
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
        * This event is fired when the tooltip has been made visible to the
        * user (will wait for CSS transitions to complete).
        */
      @js.native
      sealed trait shown
        extends StObject
           with Events
    }
    
    type Offset = js.Tuple2[Double, Double]
    
    type OffsetFunction = js.Function0[Offset]
    
    trait Options extends StObject {
      
      /**
        * Object which contains allowed attributes and tags
        *
        * @see {@link https://v5.getbootstrap.com/docs/5.0/getting-started/javascript/#sanitizer}
        */
      var allowList: RecordkeyofHTMLElementTag
      
      /**
        * Apply a CSS fade transition to the tooltip
        *
        * @default true
        */
      var animation: Boolean
      
      /**
        * Overflow constraint boundary of the popover. Accepts the values of
        * 'viewport', 'window', 'scrollParent', or an HTMLElement reference
        * (JavaScript only).
        *
        * @see {@link https://popper.js.org/docs/v1/#modifiers..preventOverflow.boundariesElement}
        * @default 'scrollParent'
        */
      var boundary: Boundary
      
      /**
        * Appends the tooltip to a specific element. Example: container:
        * 'body'. This option is particularly useful in that it allows you to
        * position the tooltip in the flow of the document near the triggering
        * element - which will prevent the tooltip from floating away from the
        * triggering element during a window resize.
        *
        * @default false
        */
      var container: String | Element | `false`
      
      /**
        * Add classes to the tooltip when it is shown. Note that these classes
        * will be added in addition to any classes specified in the template.
        * To add multiple classes, separate them with spaces: 'class-1
        * class-2'.
        *
        * You can also pass a function that should return a single string
        * containing additional class names.
        *
        * @default ''
        */
      var customClass: js.UndefOr[String | js.Function0[String]] = js.undefined
      
      /**
        * Delay showing and hiding the popover (ms) - does not apply to manual
        * trigger type
        *
        * If a number is supplied, delay is applied to both hide/show
        *
        * @default 0
        */
      var delay: Double | Hide
      
      /**
        * Allow to specify which position Popper will use on fallback.
        *
        * @see {@link https://popper.js.org/docs/v2/modifiers/flip/#fallbackplacements}
        * @default ['top', 'right', 'bottom', 'left']
        */
      var fallbackPlacements: js.Array[String]
      
      /**
        * Allow HTML in the tooltip.
        *
        * If true, HTML tags in the tooltip's title will be rendered in the
        * tooltip. If false, innerText property will be used to insert content
        * into the DOM.
        *
        * Use text if you're worried about XSS attacks.
        *
        * @default false
        */
      var html: Boolean
      
      /**
        * Offset of the tooltip relative to its target.
        *
        * When a function is used to determine the offset, it is called with an
        * object containing the popper placement, the reference, and popper
        * rects as its first argument. The triggering element DOM node is
        * passed as the second argument. The function must return an array with
        * two numbers: [skidding, distance].
        *
        * @see {@link https://popper.js.org/docs/v2/modifiers/offset}
        * @default [0, 0]
        */
      var offset: Offset | String | OffsetFunction
      
      /**
        * How to position the popover - auto | top | bottom | left | right.
        * When auto is specified, it will dynamically reorient the popover.
        *
        * When a function is used to determine the placement, it is called with
        * the popover DOM node as its first argument and the triggering element
        * DOM node as its second. The this context is set to the popover
        * instance.
        *
        * @default 'top'
        */
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
      var popperConfig: PartialOptionsModifiers | PopperConfigFunction | Null
      
      /**
        * Enable or disable the sanitization. If activated 'template' and
        * 'title' options will be sanitized.
        *
        * @default true
        */
      var sanitize: Boolean
      
      /**
        * Here you can supply your own sanitize function. This can be useful if
        * you prefer to use a dedicated library to perform sanitization.
        *
        * @default null
        */
      def sanitizeFn(): Unit | Null
      
      /**
        * If a selector is provided, tooltip objects will be delegated to the
        * specified targets. In practice, this is used to also apply tooltips
        * to dynamically added DOM elements (jQuery.on support).
        *
        * @default false
        */
      var selector: String | `false`
      
      /**
        * Base HTML to use when creating the tooltip.
        *
        * The tooltip's title will be injected into the .tooltip-inner.
        *
        * .tooltip-arrow will become the tooltip's arrow.
        *
        * The outermost wrapper element should have the .tooltip class and
        * role="tooltip".
        *
        * @default '<div class="tooltip" role="tooltip"><div class="tooltip-arrow"></div><div class="tooltip-inner"></div></div>'
        */
      var template: String
      
      /**
        * Default title value if title attribute isn't present.
        *
        * If a function is given, it will be called with its this reference set
        * to the element that the popover is attached to.
        *
        * @default ''
        */
      var title: String | Element | JQuery | (js.ThisFunction0[/* this */ HTMLElement, String | Element | JQuery])
      
      /**
        * How tooltip is triggered - click | hover | focus | manual. You may
        * pass multiple triggers; separate them with a space.
        *
        * 'manual' indicates that the tooltip will be triggered
        * programmatically via the .tooltip('show'), .tooltip('hide') and
        * .tooltip('toggle') methods; this value cannot be combined with any
        * other trigger.
        *
        * 'hover' on its own will result in tooltips that cannot be triggered
        * via the keyboard, and should only be used if alternative methods for
        * conveying the same information for keyboard users is present.
        *
        * @default 'hover focus'
        */
      var trigger: click | hover | focus | manual | (`click hover`) | (`click focus`) | (`hover focus`) | (`click hover focus`)
    }
    object Options {
      
      inline def apply(
        allowList: RecordkeyofHTMLElementTag,
        animation: Boolean,
        boundary: Boundary,
        container: String | Element | `false`,
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
        val __obj = js.Dynamic.literal(allowList = allowList.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], boundary = boundary.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], fallbackPlacements = fallbackPlacements.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], sanitize = sanitize.asInstanceOf[js.Any], sanitizeFn = js.Any.fromFunction0(sanitizeFn), selector = selector.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any], popperConfig = null)
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setAllowList(value: RecordkeyofHTMLElementTag): Self = StObject.set(x, "allowList", value.asInstanceOf[js.Any])
        
        inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
        
        inline def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
        
        inline def setBoundaryVarargs(value: typings.std.Element*): Self = StObject.set(x, "boundary", js.Array(value*))
        
        inline def setContainer(value: String | Element | `false`): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
        
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
        
        inline def setPopperConfig(value: PartialOptionsModifiers | PopperConfigFunction): Self = StObject.set(x, "popperConfig", value.asInstanceOf[js.Any])
        
        inline def setPopperConfigFunction1(value: /* defaultBsPopperConfig */ Options => PartialOptionsModifiers): Self = StObject.set(x, "popperConfig", js.Any.fromFunction1(value))
        
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
    
    /* Rewritten from type alias, can be one of: 
      - typings.bootstrap.bootstrapStrings.auto
      - typings.bootstrap.bootstrapStrings.top
      - typings.bootstrap.bootstrapStrings.bottom
      - typings.bootstrap.bootstrapStrings.left
      - typings.bootstrap.bootstrapStrings.right
    */
    trait PopoverPlacement extends StObject
    object PopoverPlacement {
      
      inline def auto: typings.bootstrap.bootstrapStrings.auto = "auto".asInstanceOf[typings.bootstrap.bootstrapStrings.auto]
      
      inline def bottom: typings.bootstrap.bootstrapStrings.bottom = "bottom".asInstanceOf[typings.bootstrap.bootstrapStrings.bottom]
      
      inline def left: typings.bootstrap.bootstrapStrings.left = "left".asInstanceOf[typings.bootstrap.bootstrapStrings.left]
      
      inline def right: typings.bootstrap.bootstrapStrings.right = "right".asInstanceOf[typings.bootstrap.bootstrapStrings.right]
      
      inline def top: typings.bootstrap.bootstrapStrings.top = "top".asInstanceOf[typings.bootstrap.bootstrapStrings.top]
    }
    
    type PopperConfigFunction = js.Function1[/* defaultBsPopperConfig */ Options, PartialOptionsModifiers]
    
    type SetContentFunction = js.Function0[String | Element | (js.Function0[String | Element | Null]) | Null]
    
    type jQueryInterface = js.Function1[
        /* config */ js.UndefOr[
          PartialOptionsBoundary | show | hide | toggle | enable | disable | toggleEnabled | update | setContent | dispose
        ], 
        JQuery
      ]
  }
}
