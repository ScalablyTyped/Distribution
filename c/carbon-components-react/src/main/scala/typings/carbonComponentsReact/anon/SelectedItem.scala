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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectedItem[?], ItemType] (val x: Self & SelectedItem[ItemType]) extends AnyVal {
    
    inline def setSelectedItem(value: ItemType): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemNull: Self = StObject.set(x, "selectedItem", null)
    
    inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
  }
}
