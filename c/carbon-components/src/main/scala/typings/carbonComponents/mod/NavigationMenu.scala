package typings.carbonComponents.mod

import typings.carbonComponents.anon.BACKWARD
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components", "NavigationMenu")
@js.native
class NavigationMenu protected ()
  extends typings.carbonComponents.componentsMod.NavigationMenu {
  def this(element: js.Any, options: js.Any) = this()
}
/* static members */
object NavigationMenu {
  
  @JSImport("carbon-components", "NavigationMenu")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("carbon-components", "NavigationMenu.NAVIGATE")
  @js.native
  def NAVIGATE: BACKWARD = js.native
  inline def NAVIGATE_=(x: BACKWARD): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAVIGATE")(x.asInstanceOf[js.Any])
  
  @JSImport("carbon-components", "NavigationMenu.components")
  @js.native
  def components: WeakMap[js.Object, js.Any] = js.native
  inline def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
