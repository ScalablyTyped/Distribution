package typings.carbonComponents.mod

import typings.carbonComponents.anon.AttribTooltipTarget
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components", "Tooltip")
@js.native
class Tooltip protected ()
  extends typings.carbonComponents.componentsMod.Tooltip {
  def this(element: js.Any, options: js.Any) = this()
}
/* static members */
@JSImport("carbon-components", "Tooltip")
@js.native
object Tooltip extends js.Object {
  
  var components: WeakMap[js.Object, _] = js.native
  
  def options: AttribTooltipTarget = js.native
}
