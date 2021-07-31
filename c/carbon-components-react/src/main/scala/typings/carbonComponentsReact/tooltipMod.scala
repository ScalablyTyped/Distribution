package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.tooltipTooltipMod.TooltipProps
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefReturn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Tooltip", JSImport.Default)
  @js.native
  val default: ForwardRefReturn[js.Any, TooltipProps] = js.native
  
  type _To = ForwardRefReturn[js.Any, TooltipProps]
  
  /* This means you don't have to write `default`, but can instead just say `tooltipMod.foo` */
  override def _to: ForwardRefReturn[js.Any, TooltipProps] = default
}
