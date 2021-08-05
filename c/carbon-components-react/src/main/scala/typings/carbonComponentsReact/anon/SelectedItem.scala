package typings.carbonComponentsReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedItem[ItemType] extends StObject {
  
  var selectedItem: js.UndefOr[ItemType | Null] = js.undefined
}
object SelectedItem {
  
  inline def apply[ItemType](): SelectedItem[ItemType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedItem[ItemType]]
  }
  
  extension [Self <: SelectedItem[?], ItemType](x: Self & SelectedItem[ItemType]) {
    
    inline def setSelectedItem(value: ItemType): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemNull: Self = StObject.set(x, "selectedItem", null)
    
    inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
  }
}
