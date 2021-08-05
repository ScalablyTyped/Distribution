package typings.carbonComponents.mod

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components", "OverflowMenu")
@js.native
class OverflowMenu protected ()
  extends typings.carbonComponents.componentsMod.OverflowMenu {
  def this(element: js.Any, options: js.Any) = this()
}
object OverflowMenu {
  
  @JSImport("carbon-components", "OverflowMenu")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components", "OverflowMenu.components")
  @js.native
  def components: WeakMap[js.Object, js.Any] = js.native
  inline def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
