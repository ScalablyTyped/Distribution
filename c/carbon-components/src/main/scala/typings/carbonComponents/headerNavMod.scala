package typings.carbonComponents

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerNavMod {
  
  @JSImport("carbon-components/components/ui-shell/header-nav", JSImport.Default)
  @js.native
  class default protected () extends HeaderNav {
    def this(element: js.Any, options: js.Any) = this()
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
      @scala.inline
      def BACKWARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACKWARD")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/ui-shell/header-nav", "default.NAVIGATE.FORWARD")
      @js.native
      def FORWARD: Double = js.native
      @scala.inline
      def FORWARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORWARD")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("carbon-components/components/ui-shell/header-nav", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    @scala.inline
    def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait HeaderNav extends StObject {
    
    def _handleKeyDown(event: js.Any): Unit = js.native
    
    def getCurrentNavigation(): js.Any = js.native
    
    def navigate(direction: js.Any): Unit = js.native
  }
  object HeaderNav {
    
    @scala.inline
    def apply(_handleKeyDown: js.Any => Unit, getCurrentNavigation: () => js.Any, navigate: js.Any => Unit): HeaderNav = {
      val __obj = js.Dynamic.literal(_handleKeyDown = js.Any.fromFunction1(_handleKeyDown), getCurrentNavigation = js.Any.fromFunction0(getCurrentNavigation), navigate = js.Any.fromFunction1(navigate))
      __obj.asInstanceOf[HeaderNav]
    }
    
    @scala.inline
    implicit class HeaderNavMutableBuilder[Self <: HeaderNav] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetCurrentNavigation(value: () => js.Any): Self = StObject.set(x, "getCurrentNavigation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNavigate(value: js.Any => Unit): Self = StObject.set(x, "navigate", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_handleKeyDown(value: js.Any => Unit): Self = StObject.set(x, "_handleKeyDown", js.Any.fromFunction1(value))
    }
  }
}
