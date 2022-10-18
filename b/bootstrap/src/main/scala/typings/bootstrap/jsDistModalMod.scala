package typings.bootstrap

import typings.bootstrap.anon.PartialOptionsBackdrop
import typings.bootstrap.bootstrapStrings.dispose
import typings.bootstrap.bootstrapStrings.handleUpdate
import typings.bootstrap.bootstrapStrings.hide
import typings.bootstrap.bootstrapStrings.show
import typings.bootstrap.bootstrapStrings.static
import typings.bootstrap.bootstrapStrings.toggle
import typings.bootstrap.jsDistBaseComponentMod.GetInstanceFactory
import typings.bootstrap.jsDistBaseComponentMod.GetOrCreateInstanceFactory
import typings.bootstrap.jsDistModalMod.Modal.Options
import typings.bootstrap.jsDistModalMod.Modal.jQueryInterface
import typings.bootstrap.mod.global.Element
import typings.bootstrap.mod.global.JQuery
import typings.std.CustomEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsDistModalMod {
  
  @JSImport("bootstrap/js/dist/modal", JSImport.Default)
  @js.native
  open class default protected () extends Modal {
    def this(element: String) = this()
    def this(element: Element) = this()
    def this(element: String, options: PartialOptionsBackdrop) = this()
    def this(element: Element, options: PartialOptionsBackdrop) = this()
  }
  object default {
    
    @JSImport("bootstrap/js/dist/modal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default settings of this plugin
      *
      * @link https://getbootstrap.com/docs/5.0/getting-started/javascript/#default-settings
      */
    /* static member */
    @JSImport("bootstrap/js/dist/modal", "default.Default")
    @js.native
    def Default: Options = js.native
    inline def Default_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap/js/dist/modal", "default.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.bootstrap.jsDistModalMod.Modal.Events & String] = js.native
      
      /* "hidden.bs.modal" */ val hidden: typings.bootstrap.jsDistModalMod.Modal.Events.hidden & String = js.native
      
      /* "hide.bs.modal" */ val hide: typings.bootstrap.jsDistModalMod.Modal.Events.hide & String = js.native
      
      /* "hidePrevented.bs.modal" */ val hidePrevented: typings.bootstrap.jsDistModalMod.Modal.Events.hidePrevented & String = js.native
      
      /* "show.bs.modal" */ val show: typings.bootstrap.jsDistModalMod.Modal.Events.show & String = js.native
      
      /* "shown.bs.modal" */ val shown: typings.bootstrap.jsDistModalMod.Modal.Events.shown & String = js.native
    }
    
    /**
      * Static method which allows you to get the modal instance associated with
      * a DOM element
      */
    /* static member */
    @JSImport("bootstrap/js/dist/modal", "default.getInstance")
    @js.native
    def getInstance: GetInstanceFactory[Modal] = js.native
    inline def getInstance_=(x: GetInstanceFactory[Modal]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
    
    /**
      * Static method which allows you to get the modal instance associated with
      * a DOM element, or create a new one in case it wasn’t initialised
      */
    /* static member */
    @JSImport("bootstrap/js/dist/modal", "default.getOrCreateInstance")
    @js.native
    def getOrCreateInstance: GetOrCreateInstanceFactory[Modal, PartialOptionsBackdrop] = js.native
    inline def getOrCreateInstance_=(x: GetOrCreateInstanceFactory[Modal, PartialOptionsBackdrop]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("bootstrap/js/dist/modal", "default.jQueryInterface")
    @js.native
    def jQueryInterface: typings.bootstrap.jsDistModalMod.Modal.jQueryInterface = js.native
    inline def jQueryInterface_=(x: jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Modal
    extends typings.bootstrap.jsDistBaseComponentMod.default {
    
    /**
      * Manually readjust the modal’s position if the height of a modal
      * changes while it is open (i.e. in case a scrollbar appears).
      */
    def handleUpdate(): Unit = js.native
    
    /**
      * Manually hides a modal. Returns to the caller before the modal has
      * actually been hidden (i.e. before the hidden.bs.modal event occurs).
      */
    def hide(): Unit = js.native
    
    /**
      * Manually opens a modal. Returns to the caller before the modal has
      * actually been shown (i.e. before the shown.bs.modal event occurs).
      */
    def show(): Unit = js.native
    def show(relatedTarget: HTMLElement): Unit = js.native
    
    /**
      * Manually toggles a modal. Returns to the caller before the modal has
      * actually been shown or hidden (i.e. before the shown.bs.modal or
      * hidden.bs.modal event occurs).
      */
    def toggle(): Unit = js.native
    def toggle(relatedTarget: HTMLElement): Unit = js.native
  }
  object Modal {
    
    @js.native
    sealed trait Events extends StObject
    @JSImport("bootstrap/js/dist/modal", "Modal.Events")
    @js.native
    object Events extends StObject {
      
      /**
        * This event is fired when the modal has finished being hidden from the
        * user (will wait for CSS transitions to complete).
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
        * This event is fired when the modal is shown, its backdrop is static
        * and a click outside the modal or an escape key press is performed
        * with the keyboard option or data-keyboard set to false.
        */
      @js.native
      sealed trait hidePrevented
        extends StObject
           with Events
      
      /**
        * This event fires immediately when the show instance method is called.
        * If caused by a click, the clicked element is available as the
        * relatedTarget property of the event.
        */
      @js.native
      sealed trait show
        extends StObject
           with Events
      
      /**
        * This event is fired when the modal has been made visible to the user
        * (will wait for CSS transitions to complete). If caused by a click,
        * the clicked element is available as the relatedTarget property of
        * the event.
        */
      @js.native
      sealed trait shown
        extends StObject
           with Events
    }
    
    @js.native
    trait Event
      extends StObject
         with CustomEvent[Any] {
      
      /**
        * Only present for `show.bs.modal` and `shown.bs.modal` events when
        * the event was triggered by a click. In that case, it's the element
        * that was clicked. Otherwise, it's undefined.
        */
      var relatedTarget: js.UndefOr[HTMLElement] = js.native
      
      /**
        * The modal DOM element.
        */
      @JSName("target")
      var target_Event: HTMLElement = js.native
    }
    
    trait Options extends StObject {
      
      /**
        * Includes a modal-backdrop element. Alternatively, specify static for
        * a backdrop which doesn't close the modal on click.
        *
        * @default true
        */
      var backdrop: static | Boolean
      
      /**
        * Puts the focus on the modal when initialized.
        *
        * @default true
        */
      var focus: Boolean
      
      /**
        * Closes the modal when escape key is pressed
        *
        * @default true
        */
      var keyboard: Boolean
    }
    object Options {
      
      inline def apply(backdrop: static | Boolean, focus: Boolean, keyboard: Boolean): Options = {
        val __obj = js.Dynamic.literal(backdrop = backdrop.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keyboard = keyboard.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setBackdrop(value: static | Boolean): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
        
        inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
        
        inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      }
    }
    
    type jQueryInterface = js.Function1[
        /* config */ js.UndefOr[PartialOptionsBackdrop | toggle | show | hide | handleUpdate | dispose], 
        JQuery
      ]
  }
}
