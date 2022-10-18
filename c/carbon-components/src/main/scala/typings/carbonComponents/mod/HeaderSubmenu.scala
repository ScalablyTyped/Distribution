package typings.carbonComponents.mod

import typings.carbonComponents.anon.PartialHeaderSubmenuOptio
import typings.std.HTMLElement
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components", "HeaderSubmenu")
@js.native
open class HeaderSubmenu protected ()
  extends typings.carbonComponents.globalsJsComponentsMod.HeaderSubmenu {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: PartialHeaderSubmenuOptio) = this()
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
    inline def BACKWARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACKWARD")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "HeaderSubmenu.NAVIGATE.FORWARD")
    @js.native
    def FORWARD: Double = js.native
    inline def FORWARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORWARD")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  object actions {
    
    @JSImport("carbon-components", "HeaderSubmenu.actions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("carbon-components", "HeaderSubmenu.actions.CLOSE_SUBMENU")
    @js.native
    def CLOSE_SUBMENU: String = js.native
    inline def CLOSE_SUBMENU_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSE_SUBMENU")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "HeaderSubmenu.actions.DELEGATE_TO_FLYOUT_MENU")
    @js.native
    def DELEGATE_TO_FLYOUT_MENU: String = js.native
    inline def DELEGATE_TO_FLYOUT_MENU_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELEGATE_TO_FLYOUT_MENU")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "HeaderSubmenu.actions.OPEN_SUBMENU")
    @js.native
    def OPEN_SUBMENU: String = js.native
    inline def OPEN_SUBMENU_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN_SUBMENU")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "HeaderSubmenu.actions.TOGGLE_SUBMENU_WITH_FOCUS")
    @js.native
    def TOGGLE_SUBMENU_WITH_FOCUS: String = js.native
    inline def TOGGLE_SUBMENU_WITH_FOCUS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOGGLE_SUBMENU_WITH_FOCUS")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  @JSImport("carbon-components", "HeaderSubmenu.components")
  @js.native
  def components: WeakMap[js.Object, Any] = js.native
  inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
