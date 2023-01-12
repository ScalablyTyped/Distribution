package typings.bootstrap

import typings.bootstrap.anon.PartialOptionsAutoClose
import typings.bootstrap.anon.PartialOptionsModifiers
import typings.bootstrap.bootstrapStrings.dispose
import typings.bootstrap.bootstrapStrings.dynamic
import typings.bootstrap.bootstrapStrings.hide
import typings.bootstrap.bootstrapStrings.inside
import typings.bootstrap.bootstrapStrings.outside
import typings.bootstrap.bootstrapStrings.parent
import typings.bootstrap.bootstrapStrings.show
import typings.bootstrap.bootstrapStrings.static
import typings.bootstrap.bootstrapStrings.toggle
import typings.bootstrap.bootstrapStrings.update
import typings.bootstrap.jsDistBaseComponentMod.GetInstanceFactory
import typings.bootstrap.jsDistBaseComponentMod.GetOrCreateInstanceFactory
import typings.bootstrap.jsDistDropdownMod.Dropdown.Options
import typings.bootstrap.jsDistDropdownMod.Dropdown.jQueryInterface
import typings.bootstrap.mod.global.Element
import typings.bootstrap.mod.global.JQuery
import typings.popperjsCore.libEnumsMod.Boundary
import typings.popperjsCore.libTypesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsDistDropdownMod {
  
  @JSImport("bootstrap/js/dist/dropdown", JSImport.Default)
  @js.native
  open class default protected () extends Dropdown {
    def this(element: String) = this()
    def this(element: Element) = this()
    def this(element: String, options: PartialOptionsAutoClose) = this()
    def this(element: Element, options: PartialOptionsAutoClose) = this()
  }
  object default {
    
    @JSImport("bootstrap/js/dist/dropdown", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default settings of this plugin
      *
      * @link https://getbootstrap.com/docs/5.0/getting-started/javascript/#default-settings
      */
    /* static member */
    @JSImport("bootstrap/js/dist/dropdown", "default.Default")
    @js.native
    def Default: Options = js.native
    
    /* static member */
    /* Inlined std.Record<keyof bootstrap.bootstrap/js/dist/dropdown.Dropdown.Options, string> */
    object DefaultType {
      
      @JSImport("bootstrap/js/dist/dropdown", "default.DefaultType")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("bootstrap/js/dist/dropdown", "default.DefaultType.autoClose")
      @js.native
      def autoClose: String = js.native
      inline def autoClose_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/dropdown", "default.DefaultType.boundary")
      @js.native
      def boundary: String = js.native
      inline def boundary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boundary")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/dropdown", "default.DefaultType.display")
      @js.native
      def display: String = js.native
      inline def display_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("display")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/dropdown", "default.DefaultType.offset")
      @js.native
      def offset: String = js.native
      inline def offset_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("offset")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/dropdown", "default.DefaultType.popperConfig")
      @js.native
      def popperConfig: js.UndefOr[String] = js.native
      inline def popperConfig_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popperConfig")(x.asInstanceOf[js.Any])
      
      @JSImport("bootstrap/js/dist/dropdown", "default.DefaultType.reference")
      @js.native
      def reference: String = js.native
      inline def reference_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reference")(x.asInstanceOf[js.Any])
    }
    
    inline def Default_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap/js/dist/dropdown", "default.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.bootstrap.jsDistDropdownMod.Dropdown.Events & String] = js.native
      
      /* "hidden.bs.dropdown" */ val hidden: typings.bootstrap.jsDistDropdownMod.Dropdown.Events.hidden & String = js.native
      
      /* "hide.bs.dropdown" */ val hide: typings.bootstrap.jsDistDropdownMod.Dropdown.Events.hide & String = js.native
      
      /* "show.bs.dropdown" */ val show: typings.bootstrap.jsDistDropdownMod.Dropdown.Events.show & String = js.native
      
      /* "shown.bs.dropdown" */ val shown: typings.bootstrap.jsDistDropdownMod.Dropdown.Events.shown & String = js.native
    }
    
    /**
      * Static method which allows you to get the dropdown instance associated
      * with a DOM element.
      */
    /* static member */
    @JSImport("bootstrap/js/dist/dropdown", "default.getInstance")
    @js.native
    def getInstance: GetInstanceFactory[Dropdown] = js.native
    inline def getInstance_=(x: GetInstanceFactory[Dropdown]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
    
    /**
      * Static method which returns a dropdown instance associated to a DOM element or
      *  create a new one in case it wasn't initialised.
      * You can use it like this: bootstrap.Dropdown.getOrCreateInstance(element)
      */
    /* static member */
    @JSImport("bootstrap/js/dist/dropdown", "default.getOrCreateInstance")
    @js.native
    def getOrCreateInstance: GetOrCreateInstanceFactory[Dropdown, PartialOptionsAutoClose] = js.native
    inline def getOrCreateInstance_=(x: GetOrCreateInstanceFactory[Dropdown, PartialOptionsAutoClose]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("bootstrap/js/dist/dropdown", "default.jQueryInterface")
    @js.native
    def jQueryInterface: typings.bootstrap.jsDistDropdownMod.Dropdown.jQueryInterface = js.native
    inline def jQueryInterface_=(x: jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Dropdown
    extends typings.bootstrap.jsDistBaseComponentMod.default {
    
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
      sealed trait hidden
        extends StObject
           with Events
      
      /**
        * Fires immediately when the hide instance method has been called.
        */
      @js.native
      sealed trait hide
        extends StObject
           with Events
      
      /**
        * Fires immediately when the show instance method is called.
        */
      @js.native
      sealed trait show
        extends StObject
           with Events
      
      /**
        * Fired when the dropdown has been made visible to the user and CSS
        * transitions have completed.
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
        * Configure the auto close behavior of the dropdown
        *
        * @default true
        */
      var autoClose: Boolean | inside | outside
      
      /**
        * Overflow constraint boundary of the dropdown menu. Accepts the values
        * of 'viewport', 'window', 'scrollParent', or an HTMLElement reference
        * (JavaScript only). For more information refer to Popper.js's
        * preventOverflow docs.
        *
        * @see {@link https://popper.js.org/docs/v2/modifiers/prevent-overflow/#boundary}
        * @default "scrollParent"
        */
      var boundary: Boundary | Element
      
      /**
        * By default, we use Popper.js for dynamic positioning. Disable this
        * with static.
        *
        * @default "dynamic"
        */
      var display: dynamic | static
      
      /**
        * Offset of the dropdown relative to its target. You can pass a string
        * in data attributes with comma separated values like:
        * data-bs-offset="10,20"
        *
        * When a function is used to determine the offset, it is called with an
        * object containing the popper placement, the reference, and popper
        * rects as its first argument. The triggering element DOM node is
        * passed as the second argument. The function must return an array with
        * two numbers: [skidding, distance].
        *
        * For more information refer to Popper's offset docs.
        *
        * @default [0, 2]
        */
      var offset: Offset | String | OffsetFunction
      
      /**
        * To change Bootstrap's default Popper.js config, see Popper.js's
        * configuration
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
        * Reference element of the dropdown menu. Accepts the values of
        * 'toggle', 'parent', an HTMLElement reference or an object providing
        * getBoundingClientRect. For more information refer to Popper.js's
        * referenceObject docs.
        *
        * @see {@link https://popper.js.org/docs/v2/constructors/#createpopper}
        * @default "toggle"
        */
      var reference: toggle | parent | Element | Rect
    }
    object Options {
      
      inline def apply(
        autoClose: Boolean | inside | outside,
        boundary: Boundary | Element,
        display: dynamic | static,
        offset: Offset | String | OffsetFunction,
        reference: toggle | parent | Element | Rect
      ): Options = {
        val __obj = js.Dynamic.literal(autoClose = autoClose.asInstanceOf[js.Any], boundary = boundary.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], popperConfig = null)
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setAutoClose(value: Boolean | inside | outside): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
        
        inline def setBoundary(value: Boundary | Element): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
        
        inline def setBoundaryVarargs(value: typings.std.Element*): Self = StObject.set(x, "boundary", js.Array(value*))
        
        inline def setDisplay(value: dynamic | static): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
        
        inline def setOffset(value: Offset | String | OffsetFunction): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        inline def setOffsetFunction0(value: () => Offset): Self = StObject.set(x, "offset", js.Any.fromFunction0(value))
        
        inline def setPopperConfig(value: PartialOptionsModifiers | PopperConfigFunction): Self = StObject.set(x, "popperConfig", value.asInstanceOf[js.Any])
        
        inline def setPopperConfigFunction0(value: () => PartialOptionsModifiers): Self = StObject.set(x, "popperConfig", js.Any.fromFunction0(value))
        
        inline def setPopperConfigNull: Self = StObject.set(x, "popperConfig", null)
        
        inline def setReference(value: toggle | parent | Element | Rect): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      }
    }
    
    type PopperConfigFunction = js.Function0[PartialOptionsModifiers]
    
    type jQueryInterface = js.Function1[
        /* config */ js.UndefOr[PartialOptionsAutoClose | toggle | show | hide | update | dispose], 
        JQuery
      ]
  }
}
