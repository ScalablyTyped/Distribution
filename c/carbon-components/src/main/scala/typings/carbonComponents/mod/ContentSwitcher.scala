package typings.carbonComponents.mod

import typings.carbonComponents.anon.PartialContentSwitcherOpt
import typings.std.HTMLElement
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components", "ContentSwitcher")
@js.native
open class ContentSwitcher protected ()
  extends typings.carbonComponents.componentsMod.ContentSwitcher {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: PartialContentSwitcherOpt) = this()
}
object ContentSwitcher {
  
  @JSImport("carbon-components", "ContentSwitcher")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components", "ContentSwitcher.components")
  @js.native
  def components: WeakMap[js.Object, Any] = js.native
  inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
