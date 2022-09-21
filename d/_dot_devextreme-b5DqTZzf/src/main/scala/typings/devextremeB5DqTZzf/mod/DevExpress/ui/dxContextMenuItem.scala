package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxContextMenu.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxContextMenuItem
  extends StObject
     with dxMenuBaseItem {
  
  /**
    * Specifies nested menu items.
    */
  @JSName("items")
  var items_dxContextMenuItem: js.UndefOr[js.Array[Item]] = js.undefined
}
object dxContextMenuItem {
  
  inline def apply(): dxContextMenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxContextMenuItem]
  }
  
  extension [Self <: dxContextMenuItem](x: Self) {
    
    inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
