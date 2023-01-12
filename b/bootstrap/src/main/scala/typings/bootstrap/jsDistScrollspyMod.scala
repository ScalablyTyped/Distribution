package typings.bootstrap

import typings.bootstrap.anon.PartialOptionsMethod
import typings.bootstrap.bootstrapStrings.auto
import typings.bootstrap.bootstrapStrings.dispose
import typings.bootstrap.bootstrapStrings.offset
import typings.bootstrap.bootstrapStrings.position
import typings.bootstrap.bootstrapStrings.refresh
import typings.bootstrap.jsDistBaseComponentMod.GetInstanceFactory
import typings.bootstrap.jsDistBaseComponentMod.GetOrCreateInstanceFactory
import typings.bootstrap.jsDistScrollspyMod.ScrollSpy.Options
import typings.bootstrap.jsDistScrollspyMod.ScrollSpy.jQueryInterface
import typings.bootstrap.mod.global.Element
import typings.bootstrap.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsDistScrollspyMod {
  
  @JSImport("bootstrap/js/dist/scrollspy", JSImport.Default)
  @js.native
  open class default protected () extends ScrollSpy {
    def this(element: String) = this()
    def this(element: Element) = this()
    def this(element: String, options: PartialOptionsMethod) = this()
    def this(element: Element, options: PartialOptionsMethod) = this()
  }
  object default {
    
    @JSImport("bootstrap/js/dist/scrollspy", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default settings of this plugin
      *
      * @link https://getbootstrap.com/docs/5.0/getting-started/javascript/#default-settings
      */
    /* static member */
    @JSImport("bootstrap/js/dist/scrollspy", "default.Default")
    @js.native
    def Default: Options = js.native
    inline def Default_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap/js/dist/scrollspy", "default.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.bootstrap.jsDistScrollspyMod.ScrollSpy.Events & String] = js.native
      
      /* "activate.bs.scrollspy" */ val activate: typings.bootstrap.jsDistScrollspyMod.ScrollSpy.Events.activate & String = js.native
    }
    
    /**
      * Static method which allows you to get the scrollspy instance associated
      * with a DOM element
      */
    /* static member */
    @JSImport("bootstrap/js/dist/scrollspy", "default.getInstance")
    @js.native
    def getInstance: GetInstanceFactory[ScrollSpy] = js.native
    inline def getInstance_=(x: GetInstanceFactory[ScrollSpy]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
    
    /**
      * Static method which allows you to get the scrollspy instance associated with
      * a DOM element, or create a new one in case it wasn’t initialised
      */
    /* static member */
    @JSImport("bootstrap/js/dist/scrollspy", "default.getOrCreateInstance")
    @js.native
    def getOrCreateInstance: GetOrCreateInstanceFactory[ScrollSpy, PartialOptionsMethod] = js.native
    inline def getOrCreateInstance_=(x: GetOrCreateInstanceFactory[ScrollSpy, PartialOptionsMethod]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("bootstrap/js/dist/scrollspy", "default.jQueryInterface")
    @js.native
    def jQueryInterface: typings.bootstrap.jsDistScrollspyMod.ScrollSpy.jQueryInterface = js.native
    inline def jQueryInterface_=(x: jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ScrollSpy
    extends typings.bootstrap.jsDistBaseComponentMod.default {
    
    /**
      * When using scrollspy in conjunction with adding or removing of
      * elements from the DOM, you’ll need to call the refresh method like
      * so:
      */
    def refresh(): Unit = js.native
  }
  object ScrollSpy {
    
    @js.native
    sealed trait Events extends StObject
    @JSImport("bootstrap/js/dist/scrollspy", "ScrollSpy.Events")
    @js.native
    object Events extends StObject {
      
      /**
        * This event fires on the scroll element whenever a new item becomes
        * activated by the scrollspy.
        */
      @js.native
      sealed trait activate
        extends StObject
           with Events
    }
    
    trait Options extends StObject {
      
      /**
        * Finds which section the spied element is in. auto will choose the
        * best method to get scroll coordinates. offset will use the
        * Element.getBoundingClientRect() method to get scroll coordinates.
        * position will use the HTMLElement.offsetTop and
        * HTMLElement.offsetLeft properties to get scroll coordinates.
        *
        * @default 'auto'
        */
      var method: auto | offset | position
      
      /**
        * Pixels to offset from top when calculating position of scroll.
        *
        * @default 10
        */
      var offset: Double
      
      /**
        * Intersection Observer [rootMargin](https://developer.mozilla.org/en-US/docs/Web/API/IntersectionObserver/rootMargin)
        * valid units, when calculating scroll position.
        *
        * @default '0px 0px -25%'
        */
      var rootMargin: String
      
      /**
        * Enables smooth scrolling when a user clicks on a link that refers to ScrollSpy observables.
        *
        * @default false
        */
      var smoothScroll: Boolean
      
      /**
        * Specifies element to apply Scrollspy plugin.
        */
      var target: String | Element | JQuery
      
      /**
        * `IntersectionObserver` [threshold](https://developer.mozilla.org/en-US/docs/Web/API/IntersectionObserver/IntersectionObserver#threshold) valid input, when calculating scroll position.
        */
      var threshold: js.UndefOr[js.Array[Double] | String] = js.undefined
    }
    object Options {
      
      inline def apply(
        method: auto | offset | position,
        offset: Double,
        rootMargin: String,
        smoothScroll: Boolean,
        target: String | Element | JQuery
      ): Options = {
        val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], rootMargin = rootMargin.asInstanceOf[js.Any], smoothScroll = smoothScroll.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setMethod(value: auto | offset | position): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        inline def setRootMargin(value: String): Self = StObject.set(x, "rootMargin", value.asInstanceOf[js.Any])
        
        inline def setSmoothScroll(value: Boolean): Self = StObject.set(x, "smoothScroll", value.asInstanceOf[js.Any])
        
        inline def setTarget(value: String | Element | JQuery): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
        
        inline def setThreshold(value: js.Array[Double] | String): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
        
        inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
        
        inline def setThresholdVarargs(value: Double*): Self = StObject.set(x, "threshold", js.Array(value*))
      }
    }
    
    type jQueryInterface = js.Function1[/* config */ js.UndefOr[PartialOptionsMethod | refresh | dispose], JQuery]
  }
}
