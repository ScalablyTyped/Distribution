package typings.carbonComponents.mod

import typings.carbonComponents.anon.BACKWARD
import typings.carbonComponents.anon.PartialNavigationMenuOpti
import typings.std.HTMLElement
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components", "NavigationMenu")
@js.native
open class NavigationMenu protected ()
  extends typings.carbonComponents.globalsJsComponentsMod.NavigationMenu {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: PartialNavigationMenuOpti) = this()
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
  def components: WeakMap[js.Object, Any] = js.native
  inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
