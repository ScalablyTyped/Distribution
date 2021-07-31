package typings.carbonComponentsReact

import typings.carbonComponentsReact.anon.SelectedItems
import typings.carbonComponentsReact.multiSelectMultiSelectMod.MultiSelectProps
import typings.carbonComponentsReact.typingsSharedMod.ListBoxBaseItemType
import typings.react.mod.Component
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterableMultiSelectMod {
  
  @JSImport("carbon-components-react/lib/components/MultiSelect/FilterableMultiSelect", JSImport.Default)
  @js.native
  class default[T /* <: ListBoxBaseItemType */] ()
    extends Component[FilterableMultiSelectProps[T], js.Object, js.Any]
  
  trait FilterItemsExtra[T] extends StObject {
    
    var inputValue: String
    
    var itemToString: NonNullable[js.UndefOr[js.Function1[/* item */ T, String]]]
  }
  object FilterItemsExtra {
    
    @scala.inline
    def apply[T](inputValue: String): FilterItemsExtra[T] = {
      val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterItemsExtra[T]]
    }
    
    @scala.inline
    implicit class FilterItemsExtraMutableBuilder[Self <: FilterItemsExtra[?], T] (val x: Self & FilterItemsExtra[T]) extends AnyVal {
      
      @scala.inline
      def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemToString(value: /* item */ T => String): Self = StObject.set(x, "itemToString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemToStringUndefined: Self = StObject.set(x, "itemToString", js.undefined)
    }
  }
  
  type FilterableMultiSelect[T /* <: ListBoxBaseItemType */] = Component[FilterableMultiSelectProps[T], js.Object, js.Any]
  
  trait FilterableMultiSelectProps[T /* <: ListBoxBaseItemType */]
    extends StObject
       with MultiSelectProps[T] {
    
    var filterItems: js.UndefOr[
        js.Function2[/* items */ js.Array[T], /* extra */ FilterItemsExtra[T], js.Array[T]]
      ] = js.undefined
    
    var placeholder: String
  }
  object FilterableMultiSelectProps {
    
    @scala.inline
    def apply[T /* <: ListBoxBaseItemType */](id: String, items: js.Array[T], onChange: SelectedItems[T] => Unit, placeholder: String): FilterableMultiSelectProps[T] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), placeholder = placeholder.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterableMultiSelectProps[T]]
    }
    
    @scala.inline
    implicit class FilterableMultiSelectPropsMutableBuilder[Self <: FilterableMultiSelectProps[?], T /* <: ListBoxBaseItemType */] (val x: Self & FilterableMultiSelectProps[T]) extends AnyVal {
      
      @scala.inline
      def setFilterItems(value: (/* items */ js.Array[T], /* extra */ FilterItemsExtra[T]) => js.Array[T]): Self = StObject.set(x, "filterItems", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterItemsUndefined: Self = StObject.set(x, "filterItems", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    }
  }
}
