package typings.carbonComponents

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerSubmenuMod {
  
  @JSImport("carbon-components/components/ui-shell/header-submenu", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with HeaderSubmenu {
    def this(element: js.Any, options: js.Any) = this()
    
    /* CompleteClass */
    override def _getAction(event: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def _getNewState(action: js.Any): Boolean = js.native
    
    /* CompleteClass */
    override def _handleEvent(event: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def _handleKeyDown(event: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def _setState(hasShouldBeExpandedShouldFocusOnOpen: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def getCurrentNavigation(): js.Any = js.native
    
    /* CompleteClass */
    override def navigate(direction: js.Any): Unit = js.native
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
    def components: WeakMap[js.Object, js.Any] = js.native
    inline def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait HeaderSubmenu extends StObject {
    
    def _getAction(event: js.Any): js.Any
    
    def _getNewState(action: js.Any): Boolean
    
    def _handleEvent(event: js.Any): Unit
    
    def _handleKeyDown(event: js.Any): Unit
    
    def _setState(hasShouldBeExpandedShouldFocusOnOpen: js.Any): Unit
    
    def getCurrentNavigation(): js.Any
    
    def navigate(direction: js.Any): Unit
  }
  object HeaderSubmenu {
    
    inline def apply(
      _getAction: js.Any => js.Any,
      _getNewState: js.Any => Boolean,
      _handleEvent: js.Any => Unit,
      _handleKeyDown: js.Any => Unit,
      _setState: js.Any => Unit,
      getCurrentNavigation: () => js.Any,
      navigate: js.Any => Unit
    ): HeaderSubmenu = {
      val __obj = js.Dynamic.literal(_getAction = js.Any.fromFunction1(_getAction), _getNewState = js.Any.fromFunction1(_getNewState), _handleEvent = js.Any.fromFunction1(_handleEvent), _handleKeyDown = js.Any.fromFunction1(_handleKeyDown), _setState = js.Any.fromFunction1(_setState), getCurrentNavigation = js.Any.fromFunction0(getCurrentNavigation), navigate = js.Any.fromFunction1(navigate))
      __obj.asInstanceOf[HeaderSubmenu]
    }
    
    extension [Self <: HeaderSubmenu](x: Self) {
      
      inline def setGetCurrentNavigation(value: () => js.Any): Self = StObject.set(x, "getCurrentNavigation", js.Any.fromFunction0(value))
      
      inline def setNavigate(value: js.Any => Unit): Self = StObject.set(x, "navigate", js.Any.fromFunction1(value))
      
      inline def set_getAction(value: js.Any => js.Any): Self = StObject.set(x, "_getAction", js.Any.fromFunction1(value))
      
      inline def set_getNewState(value: js.Any => Boolean): Self = StObject.set(x, "_getNewState", js.Any.fromFunction1(value))
      
      inline def set_handleEvent(value: js.Any => Unit): Self = StObject.set(x, "_handleEvent", js.Any.fromFunction1(value))
      
      inline def set_handleKeyDown(value: js.Any => Unit): Self = StObject.set(x, "_handleKeyDown", js.Any.fromFunction1(value))
      
      inline def set_setState(value: js.Any => Unit): Self = StObject.set(x, "_setState", js.Any.fromFunction1(value))
    }
  }
}
