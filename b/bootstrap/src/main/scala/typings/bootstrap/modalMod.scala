package typings.bootstrap

import typings.bootstrap.anon.PartialOptionsBackdrop
import typings.bootstrap.bootstrapStrings.static
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalMod {
  
  @JSImport("bootstrap/js/dist/modal", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Modal {
    def this(element: Element) = this()
    def this(element: Element, options: PartialOptionsBackdrop) = this()
    
    /**
      * Destroys an element's dropdown.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Manually readjust the modal’s position if the height of a modal
      * changes while it is open (i.e. in case a scrollbar appears).
      */
    /* CompleteClass */
    override def handleUpdate(): Unit = js.native
    
    /**
      * Manually hides a modal. Returns to the caller before the modal has
      * actually been hidden (i.e. before the hidden.bs.modal event occurs).
      */
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /**
      * Manually opens a modal. Returns to the caller before the modal has
      * actually been shown (i.e. before the shown.bs.modal event occurs).
      */
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /**
      * Manually toggles a modal. Returns to the caller before the modal has
      * actually been shown or hidden (i.e. before the shown.bs.modal or
      * hidden.bs.modal event occurs).
      */
    /* CompleteClass */
    override def toggle(): Unit = js.native
  }
  object default {
    
    @JSImport("bootstrap/js/dist/modal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bootstrap/js/dist/modal", "default.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.bootstrap.modalMod.Modal.Events & String] = js.native
      
      /* "hidden.bs.modal" */ val hidden: typings.bootstrap.modalMod.Modal.Events.hidden & String = js.native
      
      /* "hide.bs.modal" */ val hide: typings.bootstrap.modalMod.Modal.Events.hide & String = js.native
      
      /* "hidePrevented.bs.modal" */ val hidePrevented: typings.bootstrap.modalMod.Modal.Events.hidePrevented & String = js.native
      
      /* "show.bs.modal" */ val show: typings.bootstrap.modalMod.Modal.Events.show & String = js.native
      
      /* "shown.bs.modal" */ val shown: typings.bootstrap.modalMod.Modal.Events.shown & String = js.native
    }
    
    /**
      * Static method which allows you to get the modal instance associated with
      * a DOM element
      */
    /* static member */
    inline def getInstance(element: Element): Modal = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(element.asInstanceOf[js.Any]).asInstanceOf[Modal]
    inline def getInstance(element: Element, options: PartialOptionsBackdrop): Modal = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Modal]
  }
  
  trait Modal extends StObject {
    
    /**
      * Destroys an element's dropdown.
      */
    def dispose(): Unit
    
    /**
      * Manually readjust the modal’s position if the height of a modal
      * changes while it is open (i.e. in case a scrollbar appears).
      */
    def handleUpdate(): Unit
    
    /**
      * Manually hides a modal. Returns to the caller before the modal has
      * actually been hidden (i.e. before the hidden.bs.modal event occurs).
      */
    def hide(): Unit
    
    /**
      * Manually opens a modal. Returns to the caller before the modal has
      * actually been shown (i.e. before the shown.bs.modal event occurs).
      */
    def show(): Unit
    
    /**
      * Manually toggles a modal. Returns to the caller before the modal has
      * actually been shown or hidden (i.e. before the shown.bs.modal or
      * hidden.bs.modal event occurs).
      */
    def toggle(): Unit
  }
  object Modal {
    
    inline def apply(
      dispose: () => Unit,
      handleUpdate: () => Unit,
      hide: () => Unit,
      show: () => Unit,
      toggle: () => Unit
    ): Modal = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), handleUpdate = js.Any.fromFunction0(handleUpdate), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle))
      __obj.asInstanceOf[Modal]
    }
    
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
    
    extension [Self <: Modal](x: Self) {
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      inline def setHandleUpdate(value: () => Unit): Self = StObject.set(x, "handleUpdate", js.Any.fromFunction0(value))
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      inline def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
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
      
      /**
        * Shows the modal when initialized.
        *
        * @default true
        */
      var show: Boolean
    }
    object Options {
      
      inline def apply(backdrop: static | Boolean, focus: Boolean, keyboard: Boolean, show: Boolean): Options = {
        val __obj = js.Dynamic.literal(backdrop = backdrop.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keyboard = keyboard.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setBackdrop(value: static | Boolean): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
        
        inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
        
        inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
        
        inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      }
    }
  }
}
