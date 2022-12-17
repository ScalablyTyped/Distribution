package typings.carbonComponentsReact

import typings.carbonComponentsReact.anon.SelectedItems
import typings.carbonComponentsReact.libComponentsMultiSelectMultiSelectMod.MultiSelectProps
import typings.carbonComponentsReact.typingsSharedMod.ListBoxBaseItemType
import typings.react.mod.Component
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsMultiSelectFilterableMultiSelectMod {
  
  @JSImport("carbon-components-react/lib/components/MultiSelect/FilterableMultiSelect", JSImport.Default)
  @js.native
  open class default[T /* <: ListBoxBaseItemType */] ()
    extends Component[FilterableMultiSelectProps[T], js.Object, Any]
  
  trait FilterItemsExtra[T] extends StObject {
    
    var inputValue: String
    
    var itemToString: NonNullable[js.UndefOr[js.Function1[/* item */ T, String]]]
  }
  object FilterItemsExtra {
    
    inline def apply[T](inputValue: String): FilterItemsExtra[T] = {
      val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterItemsExtra[T]]
    }
    
    extension [Self <: FilterItemsExtra[?], T](x: Self & FilterItemsExtra[T]) {
      
      inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      inline def setItemToString(value: /* item */ T => String): Self = StObject.set(x, "itemToString", js.Any.fromFunction1(value))
      
      inline def setItemToStringUndefined: Self = StObject.set(x, "itemToString", js.undefined)
    }
  }
  
  type FilterableMultiSelect[T /* <: ListBoxBaseItemType */] = Component[FilterableMultiSelectProps[T], js.Object, Any]
  
  trait FilterableMultiSelectProps[T /* <: ListBoxBaseItemType */]
    extends StObject
       with MultiSelectProps[T] {
    
    var filterItems: js.UndefOr[
        js.Function2[/* items */ js.Array[T], /* extra */ FilterItemsExtra[T], js.Array[T]]
      ] = js.undefined
    
    var placeholder: String
  }
  object FilterableMultiSelectProps {
    
    inline def apply[T /* <: ListBoxBaseItemType */](id: String, items: js.Array[T], onChange: SelectedItems[T] => Unit, placeholder: String): FilterableMultiSelectProps[T] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), placeholder = placeholder.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterableMultiSelectProps[T]]
    }
    
    extension [Self <: FilterableMultiSelectProps[?], T /* <: ListBoxBaseItemType */](x: Self & FilterableMultiSelectProps[T]) {
      
      inline def setFilterItems(value: (/* items */ js.Array[T], /* extra */ FilterItemsExtra[T]) => js.Array[T]): Self = StObject.set(x, "filterItems", js.Any.fromFunction2(value))
      
      inline def setFilterItemsUndefined: Self = StObject.set(x, "filterItems", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    }
  }
}
