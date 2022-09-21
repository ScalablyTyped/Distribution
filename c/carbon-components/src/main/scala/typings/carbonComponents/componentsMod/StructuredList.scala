package typings.carbonComponents.componentsMod

import typings.carbonComponents.anon.PartialStructuredListOpti
import typings.carbonComponents.structuredListMod.default
import typings.std.HTMLElement
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components/globals/js/components", "StructuredList")
@js.native
open class StructuredList protected () extends default {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: PartialStructuredListOpti) = this()
}
object StructuredList {
  
  @JSImport("carbon-components/globals/js/components", "StructuredList")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components/globals/js/components", "StructuredList.components")
  @js.native
  def components: WeakMap[js.Object, Any] = js.native
  inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
