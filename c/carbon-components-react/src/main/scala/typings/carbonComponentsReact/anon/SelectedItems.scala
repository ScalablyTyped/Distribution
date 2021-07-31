package typings.carbonComponentsReact.anon

import typings.carbonComponentsReact.typingsSharedMod.ListBoxBaseItemType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedItems[T /* <: ListBoxBaseItemType */] extends StObject {
  
  var selectedItems: js.Array[T]
}
object SelectedItems {
  
  @scala.inline
  def apply[T /* <: ListBoxBaseItemType */](selectedItems: js.Array[T]): SelectedItems[T] = {
    val __obj = js.Dynamic.literal(selectedItems = selectedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedItems[T]]
  }
  
  @scala.inline
  implicit class SelectedItemsMutableBuilder[Self <: SelectedItems[?], T /* <: ListBoxBaseItemType */] (val x: Self & SelectedItems[T]) extends AnyVal {
    
    @scala.inline
    def setSelectedItems(value: js.Array[T]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemsVarargs(value: T*): Self = StObject.set(x, "selectedItems", js.Array(value :_*))
  }
}
