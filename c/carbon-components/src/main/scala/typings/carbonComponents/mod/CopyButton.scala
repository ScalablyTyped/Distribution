package typings.carbonComponents.mod

import typings.carbonComponents.anon.PartialCopyButtonOptions
import typings.std.HTMLElement
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components", "CopyButton")
@js.native
open class CopyButton protected ()
  extends typings.carbonComponents.globalsJsComponentsMod.CopyButton {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: PartialCopyButtonOptions) = this()
}
object CopyButton {
  
  @JSImport("carbon-components", "CopyButton")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components", "CopyButton.components")
  @js.native
  def components: WeakMap[js.Object, Any] = js.native
  inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
