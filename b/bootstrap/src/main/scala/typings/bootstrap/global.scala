package typings.bootstrap

import typings.bootstrap.anon.PartialOptions
import typings.bootstrap.anon.PartialOptionsAnimation
import typings.bootstrap.anon.PartialOptionsBackdrop
import typings.bootstrap.anon.PartialOptionsBoundary
import typings.bootstrap.anon.PartialOptionsMethod
import typings.bootstrap.anon.PartialOptionsParent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Bootstrap {
    
    @JSGlobal("Bootstrap.Alert")
    @js.native
    class Alert protected ()
      extends typings.bootstrap.mod.Alert {
      def this(element: Element) = this()
    }
    object Alert {
      
      @JSGlobal("Bootstrap.Alert")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Bootstrap.Alert.Events")
      @js.native
      object Events extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typings.bootstrap.alertMod.Alert.Events & String] = js.native
        
        /* "close.bs.alert" */ val close: typings.bootstrap.alertMod.Alert.Events.close & String = js.native
        
        /* "closed.bs.alert" */ val closed: typings.bootstrap.alertMod.Alert.Events.closed & String = js.native
      }
      
      /**
        * Static method which allows you to get the alert instance associated to a
        * DOM element, you can use it like this: getInstance(alert)
        */
      /* static member */
      inline def getInstance(element: Element): typings.bootstrap.alertMod.Alert = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(element.asInstanceOf[js.Any]).asInstanceOf[typings.bootstrap.alertMod.Alert]
    }
    
    @JSGlobal("Bootstrap.Button")
    @js.native
    class Button protected ()
      extends typings.bootstrap.mod.Button {
      def this(element: Element) = this()
    }
    
    @JSGlobal("Bootstrap.Carousel")
    @js.native
    class Carousel protected ()
      extends typings.bootstrap.mod.Carousel {
      def this(element: Element) = this()
      def this(element: Element, options: PartialOptions) = this()
    }
    object Carousel {
      
      @JSGlobal("Bootstrap.Carousel")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Bootstrap.Carousel.Events")
      @js.native
      object Events extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typings.bootstrap.carouselMod.Carousel.Events & String] = js.native
        
        /* "slid.bs.carousel" */ val slid: typings.bootstrap.carouselMod.Carousel.Events.slid & String = js.native
        
        /* "slide.bs.carousel" */ val slide: typings.bootstrap.carouselMod.Carousel.Events.slide & String = js.native
      }
      
      /**
        * Static method which allows you to get the carousel instance associated
        * with a DOM element.
        */
      /* static member */
      inline def getInstance(element: Element): typings.bootstrap.carouselMod.Carousel = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(element.asInstanceOf[js.Any]).asInstanceOf[typings.bootstrap.carouselMod.Carousel]
      inline def getInstance(element: Element, options: PartialOptions): typings.bootstrap.carouselMod.Carousel = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bootstrap.carouselMod.Carousel]
    }
    
    @JSGlobal("Bootstrap.Collapse")
    @js.native
    class Collapse protected ()
      extends typings.bootstrap.mod.Collapse {
      def this(element: Element) = this()
      def this(element: Element, options: PartialOptionsParent) = this()
    }
    object Collapse {
      
      @JSGlobal("Bootstrap.Collapse")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Bootstrap.Collapse.Events")
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
      inline def getInstance(element: Element): typings.bootstrap.collapseMod.Collapse = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(element.asInstanceOf[js.Any]).asInstanceOf[typings.bootstrap.collapseMod.Collapse]
      inline def getInstance(element: Element, options: PartialOptionsParent): typings.bootstrap.collapseMod.Collapse = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bootstrap.collapseMod.Collapse]
    }
    
    @JSGlobal("Bootstrap.Dropdown")
    @js.native
    class Dropdown protected ()
      extends typings.bootstrap.mod.Dropdown {
      def this(element: Element) = this()
      def this(element: Element, options: PartialOptionsBoundary) = this()
    }
    object Dropdown {
      
      @JSGlobal("Bootstrap.Dropdown")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Bootstrap.Dropdown.Events")
      @js.native
      object Events extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typings.bootstrap.dropdownMod.Dropdown.Events & String] = js.native
        
        /* "hidden.bs.dropdown" */ val hidden: typings.bootstrap.dropdownMod.Dropdown.Events.hidden & String = js.native
        
        /* "hide.bs.dropdown" */ val hide: typings.bootstrap.dropdownMod.Dropdown.Events.hide & String = js.native
        
        /* "show.bs.dropdown" */ val show: typings.bootstrap.dropdownMod.Dropdown.Events.show & String = js.native
        
        /* "shown.bs.dropdown" */ val shown: typings.bootstrap.dropdownMod.Dropdown.Events.shown & String = js.native
      }
      
      /**
        * Static method which allows you to get the dropdown instance associated
        * with a DOM element.
        */
      /* static member */
      inline def getInstance(element: Element): typings.bootstrap.dropdownMod.Dropdown = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(element.asInstanceOf[js.Any]).asInstanceOf[typings.bootstrap.dropdownMod.Dropdown]
      inline def getInstance(element: Element, options: PartialOptionsBoundary): typings.bootstrap.dropdownMod.Dropdown = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bootstrap.dropdownMod.Dropdown]
    }
    
    @JSGlobal("Bootstrap.Modal")
    @js.native
    class Modal protected ()
      extends typings.bootstrap.mod.Modal {
      def this(element: Element) = this()
      def this(element: Element, options: PartialOptionsBackdrop) = this()
    }
    object Modal {
      
      @JSGlobal("Bootstrap.Modal")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Bootstrap.Modal.Events")
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
      inline def getInstance(element: Element): typings.bootstrap.modalMod.Modal = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(element.asInstanceOf[js.Any]).asInstanceOf[typings.bootstrap.modalMod.Modal]
      inline def getInstance(element: Element, options: PartialOptionsBackdrop): typings.bootstrap.modalMod.Modal = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bootstrap.modalMod.Modal]
    }
    
    @JSGlobal("Bootstrap.Popover")
    @js.native
    class Popover protected ()
      extends typings.bootstrap.mod.Popover {
      def this(element: Element) = this()
      def this(element: Element, options: PartialOptionsAnimation) = this()
    }
    object Popover {
      
      @JSGlobal("Bootstrap.Popover")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Bootstrap.Popover.Events")
      @js.native
      object Events extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typings.bootstrap.popoverMod.Popover.Events & String] = js.native
        
        /* "hidden.bs.popover" */ val hidden: typings.bootstrap.popoverMod.Popover.Events.hidden & String = js.native
        
        /* "hide.bs.popover" */ val hide: typings.bootstrap.popoverMod.Popover.Events.hide & String = js.native
        
        /* "inserted.bs.popover" */ val inserted: typings.bootstrap.popoverMod.Popover.Events.inserted & String = js.native
        
        /* "show.bs.popover" */ val show: typings.bootstrap.popoverMod.Popover.Events.show & String = js.native
        
        /* "shown.bs.popover" */ val shown: typings.bootstrap.popoverMod.Popover.Events.shown & String = js.native
      }
      
      /**
        * Static method which allows you to get the popover instance associated
        * with a DOM element
        */
      /* static member */
      inline def getInstance(element: Element): typings.bootstrap.popoverMod.Popover = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(element.asInstanceOf[js.Any]).asInstanceOf[typings.bootstrap.popoverMod.Popover]
      inline def getInstance(element: Element, options: PartialOptionsAnimation): typings.bootstrap.popoverMod.Popover = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bootstrap.popoverMod.Popover]
    }
    
    @JSGlobal("Bootstrap.ScrollSpy")
    @js.native
    class ScrollSpy protected ()
      extends typings.bootstrap.mod.ScrollSpy {
      def this(element: Element) = this()
      def this(element: Element, options: PartialOptionsMethod) = this()
    }
    object ScrollSpy {
      
      @JSGlobal("Bootstrap.ScrollSpy")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Bootstrap.ScrollSpy.Events")
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
      inline def getInstance(element: Element): typings.bootstrap.scrollspyMod.ScrollSpy = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(element.asInstanceOf[js.Any]).asInstanceOf[typings.bootstrap.scrollspyMod.ScrollSpy]
      inline def getInstance(element: Element, options: PartialOptionsMethod): typings.bootstrap.scrollspyMod.ScrollSpy = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bootstrap.scrollspyMod.ScrollSpy]
    }
    
    @JSGlobal("Bootstrap.Tab")
    @js.native
    class Tab protected ()
      extends typings.bootstrap.mod.Tab {
      def this(element: Element) = this()
    }
    object Tab {
      
      @JSGlobal("Bootstrap.Tab")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Bootstrap.Tab.Events")
      @js.native
      object Events extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typings.bootstrap.tabMod.Tab.Events & String] = js.native
        
        /* "hidden.bs.tab" */ val hidden: typings.bootstrap.tabMod.Tab.Events.hidden & String = js.native
        
        /* "hide.bs.tab" */ val hide: typings.bootstrap.tabMod.Tab.Events.hide & String = js.native
        
        /* "show.bs.tab" */ val show: typings.bootstrap.tabMod.Tab.Events.show & String = js.native
        
        /* "shown.bs.tab" */ val shown: typings.bootstrap.tabMod.Tab.Events.shown & String = js.native
      }
      
      /**
        * Static method which allows you to get the tab instance associated with a
        * DOM element
        */
      /* static member */
      inline def getInstance(element: Element): typings.bootstrap.tabMod.Tab = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(element.asInstanceOf[js.Any]).asInstanceOf[typings.bootstrap.tabMod.Tab]
    }
    
    @JSGlobal("Bootstrap.Toast")
    @js.native
    class Toast protected ()
      extends typings.bootstrap.mod.Toast {
      def this(element: Element) = this()
    }
    object Toast {
      
      @JSGlobal("Bootstrap.Toast")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Bootstrap.Toast.Events")
      @js.native
      object Events extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typings.bootstrap.toastMod.Toast.Events & String] = js.native
        
        /* "hidden.bs.toast" */ val hidden: typings.bootstrap.toastMod.Toast.Events.hidden & String = js.native
        
        /* "hide.bs.toast" */ val hide: typings.bootstrap.toastMod.Toast.Events.hide & String = js.native
        
        /* "show.bs.toast" */ val show: typings.bootstrap.toastMod.Toast.Events.show & String = js.native
        
        /* "shown.bs.toast" */ val shown: typings.bootstrap.toastMod.Toast.Events.shown & String = js.native
      }
      
      /**
        * Static method which allows you to get the scrollspy instance associated
        * with a DOM element
        */
      /* static member */
      inline def getInstance(element: Element): typings.bootstrap.toastMod.Toast = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(element.asInstanceOf[js.Any]).asInstanceOf[typings.bootstrap.toastMod.Toast]
    }
    
    @JSGlobal("Bootstrap.Tooltip")
    @js.native
    class Tooltip protected ()
      extends typings.bootstrap.mod.Tooltip {
      def this(element: Element) = this()
    }
    object Tooltip {
      
      @JSGlobal("Bootstrap.Tooltip")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Bootstrap.Tooltip.Events")
      @js.native
      object Events extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typings.bootstrap.tooltipMod.Tooltip.Events & String] = js.native
        
        /* "hidden.bs.tooltip" */ val hidden: typings.bootstrap.tooltipMod.Tooltip.Events.hidden & String = js.native
        
        /* "hide.bs.tooltip" */ val hide: typings.bootstrap.tooltipMod.Tooltip.Events.hide & String = js.native
        
        /* "inserted.bs.tooltip" */ val inserted: typings.bootstrap.tooltipMod.Tooltip.Events.inserted & String = js.native
        
        /* "show.bs.tooltip" */ val show: typings.bootstrap.tooltipMod.Tooltip.Events.show & String = js.native
        
        /* "shown.bs.tooltip" */ val shown: typings.bootstrap.tooltipMod.Tooltip.Events.shown & String = js.native
      }
      
      /**
        * Static method which allows you to get the scrollspy instance associated
        * with a DOM element
        */
      /* static member */
      inline def getInstance(element: Element): typings.bootstrap.tooltipMod.Tooltip = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(element.asInstanceOf[js.Any]).asInstanceOf[typings.bootstrap.tooltipMod.Tooltip]
    }
  }
}
