package typings.carbonComponents.mod

import typings.carbonComponents.anon.PartialOverflowMenuOption
import typings.std.HTMLElement
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components", "OverflowMenu")
@js.native
open class OverflowMenu protected ()
  extends typings.carbonComponents.globalsJsComponentsMod.OverflowMenu {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: PartialOverflowMenuOption) = this()
}
object OverflowMenu {
  
  @JSImport("carbon-components", "OverflowMenu")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components", "OverflowMenu.components")
  @js.native
  def components: WeakMap[js.Object, Any] = js.native
  inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
