package typings.baseui

import typings.baseui.appNavBarTypesMod.NavItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appNavBarUtilsMod {
  
  @JSImport("baseui/app-nav-bar/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultMapItemToNode(item: NavItem): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultMapItemToNode")(item.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def mapItemsActive(items: js.Array[NavItem], predicate: js.Function1[/* a */ NavItem, Boolean]): js.Array[NavItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapItemsActive")(items.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Array[NavItem]]
  
  inline def setItemActive(items: js.Array[NavItem], item: NavItem): js.Array[NavItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("setItemActive")(items.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Array[NavItem]]
  inline def setItemActive(items: js.Array[NavItem], item: NavItem, getUniqueIdentifier: GetUniqueIdentifier): js.Array[NavItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("setItemActive")(items.asInstanceOf[js.Any], item.asInstanceOf[js.Any], getUniqueIdentifier.asInstanceOf[js.Any])).asInstanceOf[js.Array[NavItem]]
  
  type GetUniqueIdentifier = js.Function1[/* a */ NavItem, String | Double]
}
