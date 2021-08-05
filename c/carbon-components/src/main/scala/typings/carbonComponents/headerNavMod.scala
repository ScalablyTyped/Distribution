package typings.carbonComponents

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerNavMod {
  
  @JSImport("carbon-components/components/ui-shell/header-nav", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with HeaderNav {
    def this(element: js.Any, options: js.Any) = this()
    
    /* CompleteClass */
    override def _handleKeyDown(event: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def getCurrentNavigation(): js.Any = js.native
    
    /* CompleteClass */
    override def navigate(direction: js.Any): Unit = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/ui-shell/header-nav", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object NAVIGATE {
      
      @JSImport("carbon-components/components/ui-shell/header-nav", "default.NAVIGATE")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("carbon-components/components/ui-shell/header-nav", "default.NAVIGATE.BACKWARD")
      @js.native
      def BACKWARD: Double = js.native
      inline def BACKWARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACKWARD")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/ui-shell/header-nav", "default.NAVIGATE.FORWARD")
      @js.native
      def FORWARD: Double = js.native
      inline def FORWARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORWARD")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("carbon-components/components/ui-shell/header-nav", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    inline def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait HeaderNav extends StObject {
    
    def _handleKeyDown(event: js.Any): Unit
    
    def getCurrentNavigation(): js.Any
    
    def navigate(direction: js.Any): Unit
  }
  object HeaderNav {
    
    inline def apply(_handleKeyDown: js.Any => Unit, getCurrentNavigation: () => js.Any, navigate: js.Any => Unit): HeaderNav = {
      val __obj = js.Dynamic.literal(_handleKeyDown = js.Any.fromFunction1(_handleKeyDown), getCurrentNavigation = js.Any.fromFunction0(getCurrentNavigation), navigate = js.Any.fromFunction1(navigate))
      __obj.asInstanceOf[HeaderNav]
    }
    
    extension [Self <: HeaderNav](x: Self) {
      
      inline def setGetCurrentNavigation(value: () => js.Any): Self = StObject.set(x, "getCurrentNavigation", js.Any.fromFunction0(value))
      
      inline def setNavigate(value: js.Any => Unit): Self = StObject.set(x, "navigate", js.Any.fromFunction1(value))
      
      inline def set_handleKeyDown(value: js.Any => Unit): Self = StObject.set(x, "_handleKeyDown", js.Any.fromFunction1(value))
    }
  }
}
