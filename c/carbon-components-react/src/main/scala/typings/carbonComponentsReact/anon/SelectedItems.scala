package typings.carbonComponentsReact.anon

import typings.carbonComponentsReact.typingsSharedMod.ListBoxBaseItemType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedItems[T /* <: ListBoxBaseItemType */] extends StObject {
  
  var selectedItems: js.Array[T]
}
object SelectedItems {
  
  inline def apply[T /* <: ListBoxBaseItemType */](selectedItems: js.Array[T]): SelectedItems[T] = {
    val __obj = js.Dynamic.literal(selectedItems = selectedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedItems[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectedItems[?], T /* <: ListBoxBaseItemType */] (val x: Self & SelectedItems[T]) extends AnyVal {
    
    inline def setSelectedItems(value: js.Array[T]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemsVarargs(value: T*): Self = StObject.set(x, "selectedItems", js.Array(value*))
  }
}
