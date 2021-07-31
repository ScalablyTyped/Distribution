package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.listItemListItemMod.ListItemProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/ListItem", JSImport.Default)
  @js.native
  val default: FC[ListItemProps] = js.native
  
  type _To = FC[ListItemProps]
  
  /* This means you don't have to write `default`, but can instead just say `listItemMod.foo` */
  override def _to: FC[ListItemProps] = default
}
