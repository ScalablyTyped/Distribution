package typings.carbonComponents.mod

import typings.carbonComponents.anon.PartialTextInputOptions
import typings.std.HTMLElement
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components", "TextInput")
@js.native
open class TextInput protected ()
  extends typings.carbonComponents.componentsMod.TextInput {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: PartialTextInputOptions) = this()
}
/* static members */
object TextInput {
  
  @JSImport("carbon-components", "TextInput")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("carbon-components", "TextInput.components")
  @js.native
  def components: WeakMap[js.Object, Any] = js.native
  inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
