package typings.carbonComponents.componentsMod

import typings.carbonComponents.anon.AttribTooltipTarget
import typings.carbonComponents.tooltipMod.default
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components/globals/js/components", "Tooltip")
@js.native
class Tooltip protected () extends default {
  def this(element: js.Any, options: js.Any) = this()
}
/* static members */
@JSImport("carbon-components/globals/js/components", "Tooltip")
@js.native
object Tooltip extends js.Object {
  
  var components: WeakMap[js.Object, _] = js.native
  
  def options: AttribTooltipTarget = js.native
}
