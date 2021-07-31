package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.selectItemSelectItemMod.SelectItemProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectItemMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/SelectItem", JSImport.Default)
  @js.native
  val default: FC[SelectItemProps] = js.native
  
  type _To = FC[SelectItemProps]
  
  /* This means you don't have to write `default`, but can instead just say `selectItemMod.foo` */
  override def _to: FC[SelectItemProps] = default
}
