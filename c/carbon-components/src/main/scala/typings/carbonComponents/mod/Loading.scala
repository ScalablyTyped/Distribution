package typings.carbonComponents.mod

import typings.carbonComponents.anon.PartialLoadingOptions
import typings.std.HTMLElement
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components", "Loading")
@js.native
open class Loading protected ()
  extends typings.carbonComponents.componentsMod.Loading {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: PartialLoadingOptions) = this()
}
object Loading {
  
  @JSImport("carbon-components", "Loading")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components", "Loading.components")
  @js.native
  def components: WeakMap[js.Object, Any] = js.native
  inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
