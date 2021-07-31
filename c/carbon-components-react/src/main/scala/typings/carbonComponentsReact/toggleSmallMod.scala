package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.toggleSmallToggleSmallMod.ToggleSmallProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleSmallMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/ToggleSmall", JSImport.Default)
  @js.native
  val default: FC[ToggleSmallProps] = js.native
  
  type _To = FC[ToggleSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `toggleSmallMod.foo` */
  override def _to: FC[ToggleSmallProps] = default
}
