package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.ReactLIAttr
import typings.react.mod.FC
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemListItemMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/ListItem/ListItem", JSImport.Default)
  @js.native
  val default: FC[ListItemProps] = js.native
  
  type ListItemProps = ReactLIAttr[HTMLLIElement]
  
  type _To = FC[ListItemProps]
  
  /* This means you don't have to write `default`, but can instead just say `listItemListItemMod.foo` */
  override def _to: FC[ListItemProps] = default
}
