package typings.bootstrap

import typings.bootstrap.anon.PartialOptionsMethod
import typings.bootstrap.bootstrapStrings.auto
import typings.bootstrap.bootstrapStrings.offset
import typings.bootstrap.bootstrapStrings.position
import typings.jquery.JQuery
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollspyMod {
  
  @JSImport("bootstrap/js/dist/scrollspy", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with ScrollSpy {
    def this(element: Element) = this()
    def this(element: Element, options: PartialOptionsMethod) = this()
    
    /**
      * Destroys an element’s scrollspy.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * When using scrollspy in conjunction with adding or removing of
      * elements from the DOM, you’ll need to call the refresh method like
      * so:
      */
    /* CompleteClass */
    override def refresh(): Unit = js.native
  }
  object default {
    
    @JSImport("bootstrap/js/dist/scrollspy", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bootstrap/js/dist/scrollspy", "default.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.bootstrap.scrollspyMod.ScrollSpy.Events & String] = js.native
      
      /* "activate.bs.scrollspy" */ val activate: typings.bootstrap.scrollspyMod.ScrollSpy.Events.activate & String = js.native
    }
    
    /**
      * Static method which allows you to get the scrollspy instance associated
      * with a DOM element
      */
    /* static member */
    inline def getInstance(element: Element): ScrollSpy = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(element.asInstanceOf[js.Any]).asInstanceOf[ScrollSpy]
    inline def getInstance(element: Element, options: PartialOptionsMethod): ScrollSpy = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ScrollSpy]
  }
  
  trait ScrollSpy extends StObject {
    
    /**
      * Destroys an element’s scrollspy.
      */
    def dispose(): Unit
    
    /**
      * When using scrollspy in conjunction with adding or removing of
      * elements from the DOM, you’ll need to call the refresh method like
      * so:
      */
    def refresh(): Unit
  }
  object ScrollSpy {
    
    inline def apply(dispose: () => Unit, refresh: () => Unit): ScrollSpy = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), refresh = js.Any.fromFunction0(refresh))
      __obj.asInstanceOf[ScrollSpy]
    }
    
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
        * Specifies element to apply Scrollspy plugin.
        */
      var target: String | Element | JQuery[HTMLElement]
    }
    object Options {
      
      inline def apply(method: auto | offset | position, offset: Double, target: String | Element | JQuery[HTMLElement]): Options = {
        val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setMethod(value: auto | offset | position): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        inline def setTarget(value: String | Element | JQuery[HTMLElement]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      }
    }
    
    extension [Self <: ScrollSpy](x: Self) {
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      inline def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    }
  }
}
