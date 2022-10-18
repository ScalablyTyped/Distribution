package typings.carbonComponents.globalsJsComponentsMod

import typings.carbonComponents.anon.PartialSearchOptions
import typings.carbonComponents.componentsSearchSearchMod.default
import typings.std.HTMLElement
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components/globals/js/components", "Search")
@js.native
open class Search protected () extends default {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: PartialSearchOptions) = this()
}
object Search {
  
  @JSImport("carbon-components/globals/js/components", "Search")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components/globals/js/components", "Search.components")
  @js.native
  def components: WeakMap[js.Object, Any] = js.native
  inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
