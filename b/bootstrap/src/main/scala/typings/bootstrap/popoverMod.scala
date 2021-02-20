package typings.bootstrap

import typings.bootstrap.anon.Hide
import typings.bootstrap.anon.PartialOptionsAnimation
import typings.bootstrap.anon.RecordkeyofHTMLElementTag
import typings.bootstrap.bootstrapBooleans.`false`
import typings.bootstrap.bootstrapStrings.auto
import typings.bootstrap.bootstrapStrings.bottom
import typings.bootstrap.bootstrapStrings.click
import typings.bootstrap.bootstrapStrings.focus
import typings.bootstrap.bootstrapStrings.hover
import typings.bootstrap.bootstrapStrings.left
import typings.bootstrap.bootstrapStrings.manual
import typings.bootstrap.bootstrapStrings.right
import typings.bootstrap.bootstrapStrings.scrollParent
import typings.bootstrap.bootstrapStrings.top
import typings.bootstrap.bootstrapStrings.viewport
import typings.bootstrap.bootstrapStrings.window
import typings.popperJs.mod.Behavior
import typings.popperJs.mod.PopperOptions
import typings.popperJs.mod.Position
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverMod {
  
  @JSImport("bootstrap/js/dist/popover", JSImport.Default)
  @js.native
  class default protected () extends Popover {
    def this(element: Element) = this()
    def this(element: Element, options: PartialOptionsAnimation) = this()
  }
  object default {
    
    @JSImport("bootstrap/js/dist/popover", "default.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.bootstrap.popoverMod.Popover.Events with String] = js.native
      
      /* "hidden.bs.popover" */ val hidden: typings.bootstrap.popoverMod.Popover.Events.hidden with String = js.native
      
      /* "hide.bs.popover" */ val hide: typings.bootstrap.popoverMod.Popover.Events.hide with String = js.native
      
      /* "inserted.bs.popover" */ val inserted: typings.bootstrap.popoverMod.Popover.Events.inserted with String = js.native
      
      /* "show.bs.popover" */ val show: typings.bootstrap.popoverMod.Popover.Events.show with String = js.native
      
      /* "shown.bs.popover" */ val shown: typings.bootstrap.popoverMod.Popover.Events.shown with String = js.native
    }
    
    /**
      * Static method which allows you to get the popover instance associated
      * with a DOM element
      */
    /* static member */
    @JSImport("bootstrap/js/dist/popover", "default.getInstance")
    @js.native
    def getInstance(element: Element): Popover = js.native
    @JSImport("bootstrap/js/dist/popover", "default.getInstance")
    @js.native
    def getInstance(element: Element, options: PartialOptionsAnimation): Popover = js.native
  }
  
  @js.native
  trait Popover extends StObject {
    
    /**
      * Removes the ability for an element’s popover to be shown. The popover
      * will only be able to be shown if it is re-enabled.
      */
    def disable(): Unit = js.native
    
    /**
      * Hides and destroys an element’s popover. Popovers that use delegation
      * (which are created using the selector option) cannot be individually
      * destroyed on descendant trigger elements.
      */
    def dispose(): Unit = js.native
    
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
    def toggleEnable(): Unit = js.native
    
    /**
      * Updates the position of an element’s popover.
      */
    def update(): Unit = js.native
  }
  object Popover {
    
    @scala.inline
    def apply(
      disable: () => Unit,
      dispose: () => Unit,
      enable: () => Unit,
      hide: () => Unit,
      show: () => Unit,
      toggle: () => Unit,
      toggleEnable: () => Unit,
      update: () => Unit
    ): Popover = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), dispose = js.Any.fromFunction0(dispose), enable = js.Any.fromFunction0(enable), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle), toggleEnable = js.Any.fromFunction0(toggleEnable), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[Popover]
    }
    
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
      sealed trait hidden extends Events
      
      /**
        * This event is fired immediately when the hide instance method has
        * been called.
        */
      @js.native
      sealed trait hide extends Events
      
      /**
        * This event is fired after the show.bs.popover event when the popover
        * template has been added to the DOM.
        */
      @js.native
      sealed trait inserted extends Events
      
      /**
        * This event fires immediately when the show instance method is called.
        */
      @js.native
      sealed trait show extends Events
      
      /**
        * This event is fired when the popover has been made visible to the
        * user (will wait for CSS transitions to complete).
        */
      @js.native
      sealed trait shown extends Events
    }
    
    @js.native
    trait Options extends StObject {
      
      /**
        * Apply a CSS fade transition to the popover
        *
        * @default true
        */
      var animation: Boolean = js.native
      
      /**
        * Overflow constraint boundary of the popover. Accepts the values of
        * 'viewport', 'window', 'scrollParent', or an HTMLElement reference
        * (JavaScript only).
        *
        * @see {@link https://popper.js.org/docs/v1/#modifiers..preventOverflow.boundariesElement}
        * @default 'scrollParent'
        */
      var boundary: viewport | window | scrollParent | Element = js.native
      
      /**
        * Appends the popover to a specific element. Example: container:
        * 'body'. This option is particularly useful in that it allows you to
        * position the popover in the flow of the document near the triggering
        * element - which will prevent the popover from floating away from the
        * triggering element during a window resize.
        *
        * @default false
        */
      var container: String | Element | `false` = js.native
      
      /**
        * Default content value if data-content attribute isn't present.
        *
        * If a function is given, it will be called with its this reference set
        * to the element that the popover is attached to.
        *
        * @default ''
        */
      var content: String | Element | js.Function0[Unit] = js.native
      
      /**
        * Delay showing and hiding the popover (ms) - does not apply to manual
        * trigger export type
        *
        * If a number is supplied, delay is applied to both hide/show
        *
        * @default 0
        */
      var delay: Double | Hide = js.native
      
      /**
        * Allow to specify which position Popper will use on fallback.
        *
        * @see {@link https://popper.js.org/docs/v1/#modifiers..flip.behavior}
        * @default 'flip'
        */
      var fallbackPlacement: Behavior | js.Array[Position] = js.native
      
      /**
        * Insert HTML into the popover. If false, innerText property will be
        * used to insert content into the DOM. Use text if you're worried about
        * XSS attacks.
        *
        * @default false
        */
      var html: Boolean = js.native
      
      /**
        * Offset of the popover relative to its target.
        *
        * @see {@link https://popper.js.org/docs/v1/#modifiers..offset.offset}
        * @default 0
        */
      var offset: Double | String = js.native
      
      /**
        * How to position the popover - auto | top | bottom | left | right.
        * When auto is specified, it will dynamically reorient the popover.
        *
        * When a function is used to determine the placement, it is called with
        * the popover DOM node as its first argument and the triggering element
        * DOM node as its second. The this context is set to the popover
        * instance.
        *
        * @default 'right'
        */
      var placement: auto | top | bottom | left | right | js.Function0[Unit] = js.native
      
      /**
        * To change Bootstrap's default Popper.js config
        *
        * @see {@link https://popper.js.org/docs/v1/#Popper.Defaults}
        * @default null
        */
      var popperConfig: PopperOptions | Null = js.native
      
      /**
        * Enable or disable the sanitization. If activated 'template',
        * 'content' and 'title' options will be sanitized.
        *
        * @default true
        */
      var sanitize: Boolean = js.native
      
      /**
        * Here you can supply your own sanitize function. This can be useful if
        * you prefer to use a dedicated library to perform sanitization.
        *
        * @default null
        */
      def sanitizeFn(): Unit | Null = js.native
      
      /**
        * If a selector is provided, popover objects will be delegated to the
        * specified targets. In practice, this is used to enable dynamic HTML
        * content to have popovers added.
        *
        * @default false
        */
      var selector: String | `false` = js.native
      
      /**
        * Base HTML to use when creating the popover.
        *
        * The popover's title will be injected into the .popover-header.
        *
        * The popover's content will be injected into the .popover-body.
        *
        * .popover-arrow will become the popover's arrow.
        *
        * The outermost wrapper element should have the .popover class.
        *
        * @default '<div class="popover" role="tooltip"><div class="popover-arrow"></div><h3 class="popover-header"></h3><div class="popover-body"></div></div>'
        */
      var template: String = js.native
      
      /**
        * Default title value if title attribute isn't present.
        *
        * If a function is given, it will be called with its this reference set
        * to the element that the popover is attached to.
        *
        * @default ''
        */
      var title: String | Element | js.Function0[Unit] = js.native
      
      /**
        * How popover is triggered - click | hover | focus | manual. You may
        * pass multiple triggers; separate them with a space. manual cannot be
        * combined with any other trigger.
        *
        * @default 'click'
        */
      var trigger: click | hover | focus | manual = js.native
      
      /**
        * Object which contains allowed attributes and tags
        *
        * @see {@link https://v5.getbootstrap.com/docs/5.0/getting-started/javascript/#sanitizer}
        */
      var whiteList: RecordkeyofHTMLElementTag = js.native
    }
    object Options {
      
      @scala.inline
      def apply(
        animation: Boolean,
        boundary: viewport | window | scrollParent | Element,
        container: String | Element | `false`,
        content: String | Element | js.Function0[Unit],
        delay: Double | Hide,
        fallbackPlacement: Behavior | js.Array[Position],
        html: Boolean,
        offset: Double | String,
        placement: auto | top | bottom | left | right | js.Function0[Unit],
        sanitize: Boolean,
        sanitizeFn: () => Unit | Null,
        selector: String | `false`,
        template: String,
        title: String | Element | js.Function0[Unit],
        trigger: click | hover | focus | manual,
        whiteList: RecordkeyofHTMLElementTag
      ): Options = {
        val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], boundary = boundary.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], fallbackPlacement = fallbackPlacement.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], sanitize = sanitize.asInstanceOf[js.Any], sanitizeFn = js.Any.fromFunction0(sanitizeFn), selector = selector.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any], whiteList = whiteList.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBoundary(value: viewport | window | scrollParent | Element): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainer(value: String | Element | `false`): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContent(value: String | Element | js.Function0[Unit]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentFunction0(value: () => Unit): Self = StObject.set(x, "content", js.Any.fromFunction0(value))
        
        @scala.inline
        def setDelay(value: Double | Hide): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFallbackPlacement(value: Behavior | js.Array[Position]): Self = StObject.set(x, "fallbackPlacement", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFallbackPlacementVarargs(value: Position*): Self = StObject.set(x, "fallbackPlacement", js.Array(value :_*))
        
        @scala.inline
        def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlacement(value: auto | top | bottom | left | right | js.Function0[Unit]): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlacementFunction0(value: () => Unit): Self = StObject.set(x, "placement", js.Any.fromFunction0(value))
        
        @scala.inline
        def setPopperConfig(value: PopperOptions): Self = StObject.set(x, "popperConfig", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPopperConfigNull: Self = StObject.set(x, "popperConfig", null)
        
        @scala.inline
        def setSanitize(value: Boolean): Self = StObject.set(x, "sanitize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSanitizeFn(value: () => Unit | Null): Self = StObject.set(x, "sanitizeFn", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSelector(value: String | `false`): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitle(value: String | Element | js.Function0[Unit]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleFunction0(value: () => Unit): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
        
        @scala.inline
        def setTrigger(value: click | hover | focus | manual): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhiteList(value: RecordkeyofHTMLElementTag): Self = StObject.set(x, "whiteList", value.asInstanceOf[js.Any])
      }
    }
    
    @scala.inline
    implicit class PopoverMutableBuilder[Self <: Popover] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToggleEnable(value: () => Unit): Self = StObject.set(x, "toggleEnable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
}
