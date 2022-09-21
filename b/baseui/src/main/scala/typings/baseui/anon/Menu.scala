package typings.baseui.anon

import typings.baseui.baseuiStrings.menu
import typings.baseui.baseuiStrings.none
import typings.baseui.baseuiStrings.tooltip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Menu extends StObject {
  
  val menu: typings.baseui.baseuiStrings.menu
  
  val none: typings.baseui.baseuiStrings.none
  
  val tooltip: typings.baseui.baseuiStrings.tooltip
}
object Menu {
  
  inline def apply(): Menu = {
    val __obj = js.Dynamic.literal(menu = "menu", none = "none", tooltip = "tooltip")
    __obj.asInstanceOf[Menu]
  }
  
  extension [Self <: Menu](x: Self) {
    
    inline def setMenu(value: menu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setNone(value: none): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
