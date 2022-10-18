package typings.carbonComponents

import typings.carbonComponents.anon.PartialHeaderSubmenuOptio
import typings.carbonComponents.anon.ShouldBeExpanded
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsUiShellHeaderSubmenuMod {
  
  @JSImport("carbon-components/components/ui-shell/header-submenu", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with HeaderSubmenu {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialHeaderSubmenuOptio) = this()
  }
  object default {
    
    @JSImport("carbon-components/components/ui-shell/header-submenu", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object NAVIGATE {
      
      @JSImport("carbon-components/components/ui-shell/header-submenu", "default.NAVIGATE")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("carbon-components/components/ui-shell/header-submenu", "default.NAVIGATE.BACKWARD")
      @js.native
      def BACKWARD: Double = js.native
      inline def BACKWARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACKWARD")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/ui-shell/header-submenu", "default.NAVIGATE.FORWARD")
      @js.native
      def FORWARD: Double = js.native
      inline def FORWARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORWARD")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    object actions {
      
      @JSImport("carbon-components/components/ui-shell/header-submenu", "default.actions")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("carbon-components/components/ui-shell/header-submenu", "default.actions.CLOSE_SUBMENU")
      @js.native
      def CLOSE_SUBMENU: String = js.native
      inline def CLOSE_SUBMENU_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSE_SUBMENU")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/ui-shell/header-submenu", "default.actions.DELEGATE_TO_FLYOUT_MENU")
      @js.native
      def DELEGATE_TO_FLYOUT_MENU: String = js.native
      inline def DELEGATE_TO_FLYOUT_MENU_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELEGATE_TO_FLYOUT_MENU")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/ui-shell/header-submenu", "default.actions.OPEN_SUBMENU")
      @js.native
      def OPEN_SUBMENU: String = js.native
      inline def OPEN_SUBMENU_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN_SUBMENU")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/ui-shell/header-submenu", "default.actions.TOGGLE_SUBMENU_WITH_FOCUS")
      @js.native
      def TOGGLE_SUBMENU_WITH_FOCUS: String = js.native
      inline def TOGGLE_SUBMENU_WITH_FOCUS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOGGLE_SUBMENU_WITH_FOCUS")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("carbon-components/components/ui-shell/header-submenu", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait HeaderSubmenu extends StObject {
    
    def _getAction(event: Event): Null | String = js.native
    
    def _getNewState(): Boolean = js.native
    def _getNewState(action: String): Boolean = js.native
    
    def _handleEvent(event: MouseEvent): Unit = js.native
    
    def _handleKeyDown(event: KeyboardEvent): Unit = js.native
    
    def _setState(hasShouldBeExpandedShouldFocusOnOpen: ShouldBeExpanded): Unit = js.native
    
    def getCurrentNavigation(): Null | Element = js.native
    
    def navigate(direction: Double): Unit = js.native
  }
  
  trait HeaderSubmenuOptions extends StObject {
    
    var attribExpanded: String
    
    var selectorInit: String
    
    var selectorItem: String
    
    var selectorTrigger: String
  }
  object HeaderSubmenuOptions {
    
    inline def apply(attribExpanded: String, selectorInit: String, selectorItem: String, selectorTrigger: String): HeaderSubmenuOptions = {
      val __obj = js.Dynamic.literal(attribExpanded = attribExpanded.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorItem = selectorItem.asInstanceOf[js.Any], selectorTrigger = selectorTrigger.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderSubmenuOptions]
    }
    
    extension [Self <: HeaderSubmenuOptions](x: Self) {
      
      inline def setAttribExpanded(value: String): Self = StObject.set(x, "attribExpanded", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
      
      inline def setSelectorItem(value: String): Self = StObject.set(x, "selectorItem", value.asInstanceOf[js.Any])
      
      inline def setSelectorTrigger(value: String): Self = StObject.set(x, "selectorTrigger", value.asInstanceOf[js.Any])
    }
  }
}
