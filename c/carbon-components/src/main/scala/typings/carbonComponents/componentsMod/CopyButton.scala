package typings.carbonComponents.componentsMod

import typings.carbonComponents.copyButtonMod.default
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components/globals/js/components", "CopyButton")
@js.native
class CopyButton protected () extends default {
  def this(element: js.Any, options: js.Any) = this()
}
object CopyButton {
  
  @JSImport("carbon-components/globals/js/components", "CopyButton")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components/globals/js/components", "CopyButton.components")
  @js.native
  def components: WeakMap[js.Object, js.Any] = js.native
  @scala.inline
  def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
