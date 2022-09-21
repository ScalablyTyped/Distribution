package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.menuOptionMod.MenuOptionProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuItemMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Menu/MenuItem", JSImport.Default)
  @js.native
  val default: FC[MenuItemProps] = js.native
  
  type MenuItemProps = MenuOptionProps
  
  type _To = FC[MenuItemProps]
  
  /* This means you don't have to write `default`, but can instead just say `menuItemMod.foo` */
  override def _to: FC[MenuItemProps] = default
}
