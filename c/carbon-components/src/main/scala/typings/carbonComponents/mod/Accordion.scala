package typings.carbonComponents.mod

import typings.carbonComponents.anon.PartialAccordionOptions
import typings.std.HTMLElement
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components", "Accordion")
@js.native
open class Accordion protected ()
  extends typings.carbonComponents.globalsJsComponentsMod.Accordion {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: PartialAccordionOptions) = this()
}
object Accordion {
  
  @JSImport("carbon-components", "Accordion")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components", "Accordion.components")
  @js.native
  def components: WeakMap[js.Object, Any] = js.native
  inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
