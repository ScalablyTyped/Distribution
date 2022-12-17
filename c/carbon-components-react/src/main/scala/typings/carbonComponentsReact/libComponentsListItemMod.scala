package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.libComponentsListItemListItemMod.ListItemProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsListItemMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/ListItem", JSImport.Default)
  @js.native
  val default: FC[ListItemProps] = js.native
  
  type _To = FC[ListItemProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsListItemMod.foo` */
  override def _to: FC[ListItemProps] = default
}
