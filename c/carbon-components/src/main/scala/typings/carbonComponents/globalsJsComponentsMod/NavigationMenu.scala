package typings.carbonComponents.globalsJsComponentsMod

import typings.carbonComponents.anon.BACKWARD
import typings.carbonComponents.anon.PartialNavigationMenuOpti
import typings.carbonComponents.componentsUiShellNavigationMenuMod.default
import typings.std.HTMLElement
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components/globals/js/components", "NavigationMenu")
@js.native
open class NavigationMenu protected () extends default {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: PartialNavigationMenuOpti) = this()
}
/* static members */
object NavigationMenu {
  
  @JSImport("carbon-components/globals/js/components", "NavigationMenu")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("carbon-components/globals/js/components", "NavigationMenu.NAVIGATE")
  @js.native
  def NAVIGATE: BACKWARD = js.native
  inline def NAVIGATE_=(x: BACKWARD): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAVIGATE")(x.asInstanceOf[js.Any])
  
  @JSImport("carbon-components/globals/js/components", "NavigationMenu.components")
  @js.native
  def components: WeakMap[js.Object, Any] = js.native
  inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
