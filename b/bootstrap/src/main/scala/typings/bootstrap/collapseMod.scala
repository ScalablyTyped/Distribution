package typings.bootstrap

import typings.bootstrap.anon.PartialOptionsParent
import typings.jquery.JQuery
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collapseMod {
  
  @JSImport("bootstrap/js/dist/collapse", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Collapse {
    def this(element: Element) = this()
    def this(element: Element, options: PartialOptionsParent) = this()
    
    /**
      * Destroys an element's collapse.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Hides a collapsible element. Returns to the caller before the collapsible
      * element has actually been hidden (e.g., before the hidden.bs.collapse
      * event occurs).
      */
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /**
      * Shows a collapsible element. Returns to the caller before the collapsible
      * element has actually been shown (e.g., before the shown.bs.collapse event
      * occurs).
      */
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /**
      * Toggles a collapsible element to shown or hidden. Returns to the caller
      * before the collapsible element has actually been shown or hidden (i.e.
      * before the shown.bs.collapse or hidden.bs.collapse event occurs).
      */
    /* CompleteClass */
    override def toggle(): Unit = js.native
  }
  object default {
    
    @JSImport("bootstrap/js/dist/collapse", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bootstrap/js/dist/collapse", "default.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.bootstrap.collapseMod.Collapse.Events & String] = js.native
      
      /* "hidden.bs.collapse" */ val hidden: typings.bootstrap.collapseMod.Collapse.Events.hidden & String = js.native
      
      /* "hide.bs.collapse" */ val hide: typings.bootstrap.collapseMod.Collapse.Events.hide & String = js.native
      
      /* "show.bs.collapse" */ val show: typings.bootstrap.collapseMod.Collapse.Events.show & String = js.native
      
      /* "shown.bs.collapse" */ val shown: typings.bootstrap.collapseMod.Collapse.Events.shown & String = js.native
    }
    
    /**
      * Static method which allows you to get the collapse instance associated
      * with a DOM element.
      */
    /* static member */
    @scala.inline
    def getInstance(element: Element): Collapse = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(element.asInstanceOf[js.Any]).asInstanceOf[Collapse]
    @scala.inline
    def getInstance(element: Element, options: PartialOptionsParent): Collapse = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Collapse]
  }
  
  trait Collapse extends StObject {
    
    /**
      * Destroys an element's collapse.
      */
    def dispose(): Unit
    
    /**
      * Hides a collapsible element. Returns to the caller before the collapsible
      * element has actually been hidden (e.g., before the hidden.bs.collapse
      * event occurs).
      */
    def hide(): Unit
    
    /**
      * Shows a collapsible element. Returns to the caller before the collapsible
      * element has actually been shown (e.g., before the shown.bs.collapse event
      * occurs).
      */
    def show(): Unit
    
    /**
      * Toggles a collapsible element to shown or hidden. Returns to the caller
      * before the collapsible element has actually been shown or hidden (i.e.
      * before the shown.bs.collapse or hidden.bs.collapse event occurs).
      */
    def toggle(): Unit
  }
  object Collapse {
    
    @scala.inline
    def apply(dispose: () => Unit, hide: () => Unit, show: () => Unit, toggle: () => Unit): Collapse = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle))
      __obj.asInstanceOf[Collapse]
    }
    
    @js.native
    sealed trait Events extends StObject
    @JSImport("bootstrap/js/dist/collapse", "Collapse.Events")
    @js.native
    object Events extends StObject {
      
      /**
        * This event is fired when a collapse element has been hidden from the
        * user (will wait for CSS transitions to complete).
        */
      @js.native
      sealed trait hidden
        extends StObject
           with Events
      
      /**
        * This event is fired immediately when the hide method has been called.
        */
      @js.native
      sealed trait hide
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
        * This event is fired when a collapse element has been made visible to the user (will wait for CSS transitions to complete).
        */
      @js.native
      sealed trait shown
        extends StObject
           with Events
    }
    
    @scala.inline
    implicit class CollapseMutableBuilder[Self <: Collapse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    }
    
    trait Options extends StObject {
      
      /**
        * If parent is provided, then all collapsible elements under the specified
        * parent will be closed when this collapsible item is shown. (similar to
        * traditional accordion behavior - this is dependent on the card class).
        * The attribute has to be set on the target collapsible area.
        *
        * @default false
        */
      var parent: String | Element | JQuery[HTMLElement]
      
      /**
        * Toggles the collapsible element on invocation
        *
        * @default true
        */
      var toggle: Boolean
    }
    object Options {
      
      @scala.inline
      def apply(parent: String | Element | JQuery[HTMLElement], toggle: Boolean): Options = {
        val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setParent(value: String | Element | JQuery[HTMLElement]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setToggle(value: Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      }
    }
  }
}
