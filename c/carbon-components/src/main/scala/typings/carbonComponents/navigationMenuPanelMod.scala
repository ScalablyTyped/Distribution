package typings.carbonComponents

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationMenuPanelMod {
  
  @JSImport("carbon-components/components/ui-shell/navigation-menu-panel", JSImport.Default)
  @js.native
  class default () extends NavigationMenuPanel
  /* static members */
  object default {
    
    @JSImport("carbon-components/components/ui-shell/navigation-menu-panel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("carbon-components/components/ui-shell/navigation-menu-panel", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    @scala.inline
    def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait NavigationMenuPanel extends StObject {
    
    def _changeState(state: js.Any, callback: js.Any): Unit = js.native
    
    def createdByLauncher(event: js.Any): Unit = js.native
    
    def shouldStateBeChanged(state: js.Any): Boolean = js.native
  }
  object NavigationMenuPanel {
    
    @scala.inline
    def apply(
      _changeState: (js.Any, js.Any) => Unit,
      createdByLauncher: js.Any => Unit,
      shouldStateBeChanged: js.Any => Boolean
    ): NavigationMenuPanel = {
      val __obj = js.Dynamic.literal(_changeState = js.Any.fromFunction2(_changeState), createdByLauncher = js.Any.fromFunction1(createdByLauncher), shouldStateBeChanged = js.Any.fromFunction1(shouldStateBeChanged))
      __obj.asInstanceOf[NavigationMenuPanel]
    }
    
    @scala.inline
    implicit class NavigationMenuPanelMutableBuilder[Self <: NavigationMenuPanel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreatedByLauncher(value: js.Any => Unit): Self = StObject.set(x, "createdByLauncher", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShouldStateBeChanged(value: js.Any => Boolean): Self = StObject.set(x, "shouldStateBeChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_changeState(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "_changeState", js.Any.fromFunction2(value))
    }
  }
}
