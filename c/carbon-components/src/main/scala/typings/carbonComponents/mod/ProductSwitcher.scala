package typings.carbonComponents.mod

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components", "ProductSwitcher")
@js.native
class ProductSwitcher protected ()
  extends typings.carbonComponents.componentsMod.ProductSwitcher {
  def this(element: js.Any, options: js.Any) = this()
}
object ProductSwitcher {
  
  @JSImport("carbon-components", "ProductSwitcher")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components", "ProductSwitcher.SELECT_NONE")
  @js.native
  def SELECT_NONE: String = js.native
  @scala.inline
  def SELECT_NONE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECT_NONE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("carbon-components", "ProductSwitcher.components")
  @js.native
  def components: WeakMap[js.Object, js.Any] = js.native
  @scala.inline
  def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
