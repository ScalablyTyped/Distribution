package typings.carbonComponents.mod

import typings.carbonComponents.anon.PartialStructuredListOpti
import typings.std.HTMLElement
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components", "StructuredList")
@js.native
open class StructuredList protected ()
  extends typings.carbonComponents.globalsJsComponentsMod.StructuredList {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: PartialStructuredListOpti) = this()
}
object StructuredList {
  
  @JSImport("carbon-components", "StructuredList")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components", "StructuredList.components")
  @js.native
  def components: WeakMap[js.Object, Any] = js.native
  inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
