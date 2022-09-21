package typings.carbonComponents.componentsMod

import typings.carbonComponents.anon.PartialToolbarOptions
import typings.carbonComponents.toolbarMod.default
import typings.std.HTMLElement
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components/globals/js/components", "Toolbar")
@js.native
open class Toolbar protected () extends default {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: PartialToolbarOptions) = this()
}
object Toolbar {
  
  @JSImport("carbon-components/globals/js/components", "Toolbar")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components/globals/js/components", "Toolbar.components")
  @js.native
  def components: WeakMap[js.Object, Any] = js.native
  inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
