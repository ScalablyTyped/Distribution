package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.libComponentsMenuMenuGroupMod.MenuGroupProps
import typings.carbonComponentsReact.libComponentsMenuMenuItemMod.MenuItemProps
import typings.carbonComponentsReact.libComponentsMenuMenuMod.MenuComponent
import typings.carbonComponentsReact.libComponentsMenuMenuRadioGroupMod.MenuRadioGroupProps
import typings.carbonComponentsReact.libComponentsMenuMenuSelectableItemMod.MenuSelectableItemProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsMenuMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Menu", JSImport.Default)
  @js.native
  val default: MenuComponent = js.native
  
  @JSImport("carbon-components-react/lib/components/Menu", "MenuDivider")
  @js.native
  val MenuDivider: FC[js.Object] = js.native
  
  @JSImport("carbon-components-react/lib/components/Menu", "MenuGroup")
  @js.native
  val MenuGroup: FC[MenuGroupProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/Menu", "MenuItem")
  @js.native
  val MenuItem: FC[MenuItemProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/Menu", "MenuRadioGroup")
  @js.native
  val MenuRadioGroup: FC[MenuRadioGroupProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/Menu", "MenuSelectableItem")
  @js.native
  val MenuSelectableItem: FC[MenuSelectableItemProps] = js.native
  
  type _To = MenuComponent
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsMenuMod.foo` */
  override def _to: MenuComponent = default
}
