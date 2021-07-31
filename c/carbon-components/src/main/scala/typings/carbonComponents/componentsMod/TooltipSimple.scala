package typings.carbonComponents.componentsMod

import typings.carbonComponents.tooltipSimpleMod.default
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components/globals/js/components", "TooltipSimple")
@js.native
class TooltipSimple protected () extends default {
  def this(element: js.Any, options: js.Any) = this()
}
/* static members */
object TooltipSimple {
  
  @JSImport("carbon-components/globals/js/components", "TooltipSimple")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("carbon-components/globals/js/components", "TooltipSimple.components")
  @js.native
  def components: WeakMap[js.Object, js.Any] = js.native
  @scala.inline
  def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
