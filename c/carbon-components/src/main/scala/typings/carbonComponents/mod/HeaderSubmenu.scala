package typings.carbonComponents.mod

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components", "HeaderSubmenu")
@js.native
class HeaderSubmenu protected ()
  extends typings.carbonComponents.componentsMod.HeaderSubmenu {
  def this(element: js.Any, options: js.Any) = this()
}
object HeaderSubmenu {
  
  @JSImport("carbon-components", "HeaderSubmenu")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  object NAVIGATE {
    
    @JSImport("carbon-components", "HeaderSubmenu.NAVIGATE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("carbon-components", "HeaderSubmenu.NAVIGATE.BACKWARD")
    @js.native
    def BACKWARD: Double = js.native
    @scala.inline
    def BACKWARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACKWARD")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "HeaderSubmenu.NAVIGATE.FORWARD")
    @js.native
    def FORWARD: Double = js.native
    @scala.inline
    def FORWARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORWARD")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  object actions {
    
    @JSImport("carbon-components", "HeaderSubmenu.actions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("carbon-components", "HeaderSubmenu.actions.CLOSE_SUBMENU")
    @js.native
    def CLOSE_SUBMENU: String = js.native
    @scala.inline
    def CLOSE_SUBMENU_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSE_SUBMENU")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "HeaderSubmenu.actions.DELEGATE_TO_FLYOUT_MENU")
    @js.native
    def DELEGATE_TO_FLYOUT_MENU: String = js.native
    @scala.inline
    def DELEGATE_TO_FLYOUT_MENU_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELEGATE_TO_FLYOUT_MENU")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "HeaderSubmenu.actions.OPEN_SUBMENU")
    @js.native
    def OPEN_SUBMENU: String = js.native
    @scala.inline
    def OPEN_SUBMENU_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN_SUBMENU")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "HeaderSubmenu.actions.TOGGLE_SUBMENU_WITH_FOCUS")
    @js.native
    def TOGGLE_SUBMENU_WITH_FOCUS: String = js.native
    @scala.inline
    def TOGGLE_SUBMENU_WITH_FOCUS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOGGLE_SUBMENU_WITH_FOCUS")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  @JSImport("carbon-components", "HeaderSubmenu.components")
  @js.native
  def components: WeakMap[js.Object, js.Any] = js.native
  @scala.inline
  def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
