package typings.bootstrap

import typings.bootstrap.anon.PartialOptionsBoundary
import typings.bootstrap.bootstrapStrings.dynamic
import typings.bootstrap.bootstrapStrings.parent
import typings.bootstrap.bootstrapStrings.static
import typings.bootstrap.bootstrapStrings.toggle
import typings.popperJs.mod.Boundary
import typings.popperJs.mod.PopperOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownMod {
  
  @JSImport("bootstrap/js/dist/dropdown", JSImport.Default)
  @js.native
  class default protected () extends Dropdown {
    def this(element: Element) = this()
    def this(element: Element, options: PartialOptionsBoundary) = this()
  }
  object default {
    
    @JSImport("bootstrap/js/dist/dropdown", "default.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.bootstrap.dropdownMod.Dropdown.Events with String] = js.native
      
      /* "hidden.bs.dropdown" */ val hidden: typings.bootstrap.dropdownMod.Dropdown.Events.hidden with String = js.native
      
      /* "hide.bs.dropdown" */ val hide: typings.bootstrap.dropdownMod.Dropdown.Events.hide with String = js.native
      
      /* "show.bs.dropdown" */ val show: typings.bootstrap.dropdownMod.Dropdown.Events.show with String = js.native
      
      /* "shown.bs.dropdown" */ val shown: typings.bootstrap.dropdownMod.Dropdown.Events.shown with String = js.native
    }
    
    /**
      * Static method which allows you to get the dropdown instance associated
      * with a DOM element.
      */
    /* static member */
    @JSImport("bootstrap/js/dist/dropdown", "default.getInstance")
    @js.native
    def getInstance(element: Element): Dropdown = js.native
    @JSImport("bootstrap/js/dist/dropdown", "default.getInstance")
    @js.native
    def getInstance(element: Element, options: PartialOptionsBoundary): Dropdown = js.native
  }
  
  @js.native
  trait Dropdown extends StObject {
    
    /**
      * Destroys an element's dropdown.
      */
    def dispose(): Unit = js.native
    
    /**
      * Hides the dropdown menu of a given navbar or tabbed navigation.
      */
    def hide(): Unit = js.native
    
    /**
      * Shows the dropdown menu of a given navbar or tabbed navigation.
      */
    def show(): Unit = js.native
    
    /**
      * Toggles the dropdown menu of a given navbar or tabbed navigation.
      */
    def toggle(): Unit = js.native
    
    /**
      * Updates the position of an element's dropdown.
      */
    def update(): Unit = js.native
  }
  object Dropdown {
    
    @scala.inline
    def apply(dispose: () => Unit, hide: () => Unit, show: () => Unit, toggle: () => Unit, update: () => Unit): Dropdown = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[Dropdown]
    }
    
    @js.native
    sealed trait Events extends StObject
    @JSImport("bootstrap/js/dist/dropdown", "Dropdown.Events")
    @js.native
    object Events extends StObject {
      
      /**
        * Fired when the dropdown has finished being hidden from the user and
        * CSS transitions have completed.
        */
      @js.native
      sealed trait hidden extends Events
      
      /**
        * Fires immediately when the hide instance method has been called.
        */
      @js.native
      sealed trait hide extends Events
      
      /**
        * Fires immediately when the show instance method is called.
        */
      @js.native
      sealed trait show extends Events
      
      /**
        * Fired when the dropdown has been made visible to the user and CSS
        * transitions have completed.
        */
      @js.native
      sealed trait shown extends Events
    }
    
    @scala.inline
    implicit class DropdownMutableBuilder[Self <: Dropdown] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
    
    @js.native
    trait Options extends StObject {
      
      /**
        * Overflow constraint boundary of the dropdown menu. Accepts the values
        * of 'viewport', 'window', 'scrollParent', or an HTMLElement reference
        * (JavaScript only). For more information refer to Popper.js's
        * preventOverflow docs.
        *
        * @see {@link https://popper.js.org/docs/v1/#modifiers..preventOverflow.boundariesElement}
        * @default "scrollParent"
        */
      var boundary: Boundary | Element = js.native
      
      /**
        * By default, we use Popper.js for dynamic positioning. Disable this
        * with static.
        *
        * @default "dynamic"
        */
      var display: dynamic | static = js.native
      
      /**
        * Allow Dropdown to flip in case of an overlapping on the reference
        * element. For more information refer to Popper.js's flip docs.
        *
        * @see {@link https://popper.js.org/docs/v1/#modifiers..flip.enabled}
        * @default true
        */
      var flip: Boolean = js.native
      
      /**
        * Offset of the dropdown relative to its target.
        *
        * When a function is used to determine the offset, it is called with an
        * object containing the offset data as its first argument. The function
        * must return an object with the same structure. The triggering element
        * DOM node is passed as the second argument.
        *
        * For more information refer to Popper.js's offset docs.
        *
        * @see {@link https://popper.js.org/docs/v1/#modifiers..offset.offset}
        * @default 0
        */
      var offset: Double = js.native
      
      /**
        * To change Bootstrap's default Popper.js config, see Popper.js's
        * configuration
        *
        * @see {@link https://popper.js.org/docs/v1/#Popper.Defaults}
        * @default null
        */
      var popperConfig: PopperOptions | Null = js.native
      
      /**
        * Reference element of the dropdown menu. Accepts the values of
        * 'toggle', 'parent', or an HTMLElement reference. For more information
        * refer to Popper.js's referenceObject docs.
        *
        * @see {@link https://popper.js.org/docs/v1/#referenceObject}
        * @default "toggle"
        */
      var reference: toggle | parent | Element = js.native
    }
    object Options {
      
      @scala.inline
      def apply(
        boundary: Boundary | Element,
        display: dynamic | static,
        flip: Boolean,
        offset: Double,
        reference: toggle | parent | Element
      ): Options = {
        val __obj = js.Dynamic.literal(boundary = boundary.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], flip = flip.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBoundary(value: Boundary | Element): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplay(value: dynamic | static): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPopperConfig(value: PopperOptions): Self = StObject.set(x, "popperConfig", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPopperConfigNull: Self = StObject.set(x, "popperConfig", null)
        
        @scala.inline
        def setReference(value: toggle | parent | Element): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      }
    }
  }
}
