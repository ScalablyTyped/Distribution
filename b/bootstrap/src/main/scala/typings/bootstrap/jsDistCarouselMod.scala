package typings.bootstrap

import typings.bootstrap.anon.PartialOptions
import typings.bootstrap.bootstrapBooleans.`false`
import typings.bootstrap.bootstrapStrings.carousel
import typings.bootstrap.bootstrapStrings.cycle
import typings.bootstrap.bootstrapStrings.dispose
import typings.bootstrap.bootstrapStrings.hover
import typings.bootstrap.bootstrapStrings.next
import typings.bootstrap.bootstrapStrings.nextWhenVisible
import typings.bootstrap.bootstrapStrings.pause
import typings.bootstrap.bootstrapStrings.prev
import typings.bootstrap.bootstrapStrings.to
import typings.bootstrap.jsDistBaseComponentMod.GetInstanceFactory
import typings.bootstrap.jsDistBaseComponentMod.GetOrCreateInstanceFactory
import typings.bootstrap.jsDistCarouselMod.Carousel.Options
import typings.bootstrap.jsDistCarouselMod.Carousel.jQueryInterface
import typings.bootstrap.mod.global.Element
import typings.bootstrap.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsDistCarouselMod {
  
  @JSImport("bootstrap/js/dist/carousel", JSImport.Default)
  @js.native
  open class default protected () extends Carousel {
    def this(element: String) = this()
    def this(element: Element) = this()
    def this(element: String, options: PartialOptions) = this()
    def this(element: Element, options: PartialOptions) = this()
  }
  object default {
    
    @JSImport("bootstrap/js/dist/carousel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default settings of this plugin
      *
      * @link https://getbootstrap.com/docs/5.0/getting-started/javascript/#default-settings
      */
    /* static member */
    @JSImport("bootstrap/js/dist/carousel", "default.Default")
    @js.native
    def Default: Options = js.native
    inline def Default_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap/js/dist/carousel", "default.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.bootstrap.jsDistCarouselMod.Carousel.Events & String] = js.native
      
      /* "slid.bs.carousel" */ val slid: typings.bootstrap.jsDistCarouselMod.Carousel.Events.slid & String = js.native
      
      /* "slide.bs.carousel" */ val slide: typings.bootstrap.jsDistCarouselMod.Carousel.Events.slide & String = js.native
    }
    
    /* static member */
    /* was `typeof Carousel.getOrCreateInstance` */
    @JSImport("bootstrap/js/dist/carousel", "default.carouselInstance")
    @js.native
    def carouselInstance: GetOrCreateInstanceFactory[Carousel, PartialOptions] = js.native
    inline def carouselInstance_=(x: GetOrCreateInstanceFactory[Carousel, PartialOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("carouselInstance")(x.asInstanceOf[js.Any])
    
    /**
      * Static method which allows you to get the carousel instance associated
      * with a DOM element.
      */
    /* static member */
    @JSImport("bootstrap/js/dist/carousel", "default.getInstance")
    @js.native
    def getInstance: GetInstanceFactory[Carousel] = js.native
    inline def getInstance_=(x: GetInstanceFactory[Carousel]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("bootstrap/js/dist/carousel", "default.getOrCreateInstance")
    @js.native
    def getOrCreateInstance: GetOrCreateInstanceFactory[Carousel, PartialOptions] = js.native
    inline def getOrCreateInstance_=(x: GetOrCreateInstanceFactory[Carousel, PartialOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("bootstrap/js/dist/carousel", "default.jQueryInterface")
    @js.native
    def jQueryInterface: typings.bootstrap.jsDistCarouselMod.Carousel.jQueryInterface = js.native
    inline def jQueryInterface_=(x: jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Carousel
    extends typings.bootstrap.jsDistBaseComponentMod.default {
    
    /**
      * Cycles through the carousel items from left to right.
      */
    def cycle(): Unit = js.native
    
    /**
      * Cycles to the next item. Returns to the caller before the next item has
      * been shown (e.g., before the slid.bs.carousel event occurs).
      */
    def next(): Unit = js.native
    
    /**
      * Cycles the carousel to a particular frame (0 based, similar to an array).
      * Returns to the caller before the target item has been shown (e.g., before
      * the slid.bs.carousel event occurs).
      */
    def nextWhenVisible(): Unit = js.native
    
    /**
      * Stops the carousel from cycling through items.
      */
    def pause(): Unit = js.native
    def pause(event: Any): Unit = js.native
    
    /**
      * Cycles to the previous item. Returns to the caller before the previous
      * item has been shown (e.g., before the slid.bs.carousel event occurs).
      */
    def prev(): Unit = js.native
    
    /**
      * Cycles the carousel to a particular frame (0 based, similar to an array).
      * Returns to the caller before the target item has been shown (e.g., before
      * the slid.bs.carousel event occurs).
      */
    def to(index: Double): Unit = js.native
  }
  object Carousel {
    
    @js.native
    sealed trait Events extends StObject
    @JSImport("bootstrap/js/dist/carousel", "Carousel.Events")
    @js.native
    object Events extends StObject {
      
      /**
        * Fired when the carousel has completed its slide transition.
        */
      @js.native
      sealed trait slid
        extends StObject
           with Events
      
      /**
        * Fires immediately when the slide instance method is invoked.
        */
      @js.native
      sealed trait slide
        extends StObject
           with Events
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.bootstrap.bootstrapStrings.left
      - typings.bootstrap.bootstrapStrings.right
    */
    trait Direction extends StObject
    object Direction {
      
      inline def left: typings.bootstrap.bootstrapStrings.left = "left".asInstanceOf[typings.bootstrap.bootstrapStrings.left]
      
      inline def right: typings.bootstrap.bootstrapStrings.right = "right".asInstanceOf[typings.bootstrap.bootstrapStrings.right]
    }
    
    trait Event extends StObject {
      
      /**
        * The direction in which the carousel is sliding (either "left" or
        * "right").
        */
      val direction: Direction
      
      /**
        * The index of the current item
        */
      val from: Double
      
      /**
        * The DOM element that is being slid into place as the active item.
        */
      val relatedTarget: Element
      
      /**
        * The index of the next item
        */
      val to: Double
    }
    object Event {
      
      inline def apply(direction: Direction, from: Double, relatedTarget: Element, to: Double): Event = {
        val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], relatedTarget = relatedTarget.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
        __obj.asInstanceOf[Event]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
        
        inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
        
        inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
        
        inline def setRelatedTarget(value: Element): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
        
        inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      }
    }
    
    trait Options extends StObject {
      
      /**
        * The amount of time to delay between automatically cycling an item. If
        * false, carousel will not automatically cycle.
        *
        * @default 5000
        */
      var interval: Double | `false`
      
      /**
        * Whether the carousel should react to keyboard events.
        *
        * @default true
        */
      var keyboard: Boolean
      
      /**
        * If set to "hover", pauses the cycling of the carousel on mouseenter and
        * resumes the cycling of the carousel on mouseleave. If set to false,
        * hovering over the carousel won't pause it. On touch-enabled devices, when
        * set to "hover", cycling will pause on touchend (once the user finished
        * interacting with the carousel) for two intervals, before automatically
        * resuming. Note that this is in addition to the above mouse behavior.
        *
        * @default "hover"
        */
      var pause: hover | `false`
      
      /**
        * Autoplays the carousel after the user manually cycles the first item. If
        * "carousel", autoplays the carousel on load.
        *
        * @default false
        */
      var ride: carousel | Boolean
      
      /**
        * Whether the carousel should support left/right swipe interactions on
        * touchscreen devices.
        *
        * @default true
        */
      var touch: Boolean
      
      /**
        * Whether the carousel should cycle continuously or have hard stops.
        *
        * @default true
        */
      var wrap: Boolean
    }
    object Options {
      
      inline def apply(
        interval: Double | `false`,
        keyboard: Boolean,
        pause: hover | `false`,
        ride: carousel | Boolean,
        touch: Boolean,
        wrap: Boolean
      ): Options = {
        val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], keyboard = keyboard.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], ride = ride.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setInterval(value: Double | `false`): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
        
        inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
        
        inline def setPause(value: hover | `false`): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
        
        inline def setRide(value: carousel | Boolean): Self = StObject.set(x, "ride", value.asInstanceOf[js.Any])
        
        inline def setTouch(value: Boolean): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
        
        inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      }
    }
    
    type jQueryInterface = js.Function1[
        /* config */ js.UndefOr[
          PartialOptions | Double | cycle | pause | prev | next | nextWhenVisible | to | dispose
        ], 
        JQuery
      ]
  }
}
