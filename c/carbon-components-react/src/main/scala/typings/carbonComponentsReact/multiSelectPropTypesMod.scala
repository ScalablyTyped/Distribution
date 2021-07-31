package typings.carbonComponentsReact

import typings.carbonComponentsReact.typingsSharedMod.DownshiftTypedProps
import typings.carbonComponentsReact.typingsSharedMod.ListBoxBaseItemType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiSelectPropTypesMod {
  
  trait MultiSelectSortingProps[ItemType /* <: ListBoxBaseItemType */] extends StObject {
    
    var compareItems: js.UndefOr[
        js.Function3[/* item1 */ ItemType, /* item2 */ ItemType, /* options */ SharedOptions, Double]
      ] = js.undefined
    
    // required but has default value
    var sortItems: js.UndefOr[
        js.Function2[
          /* items */ js.Array[ItemType], 
          /* options */ SortItemsOptions[ItemType], 
          js.Array[ItemType]
        ]
      ] = js.undefined
  }
  object MultiSelectSortingProps {
    
    @scala.inline
    def apply[ItemType /* <: ListBoxBaseItemType */](): MultiSelectSortingProps[ItemType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiSelectSortingProps[ItemType]]
    }
    
    @scala.inline
    implicit class MultiSelectSortingPropsMutableBuilder[Self <: MultiSelectSortingProps[?], ItemType /* <: ListBoxBaseItemType */] (val x: Self & MultiSelectSortingProps[ItemType]) extends AnyVal {
      
      @scala.inline
      def setCompareItems(value: (/* item1 */ ItemType, /* item2 */ ItemType, /* options */ SharedOptions) => Double): Self = StObject.set(x, "compareItems", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCompareItemsUndefined: Self = StObject.set(x, "compareItems", js.undefined)
      
      @scala.inline
      def setSortItems(
        value: (/* items */ js.Array[ItemType], /* options */ SortItemsOptions[ItemType]) => js.Array[ItemType]
      ): Self = StObject.set(x, "sortItems", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSortItemsUndefined: Self = StObject.set(x, "sortItems", js.undefined)
    }
  }
  
  trait SharedOptions extends StObject {
    
    var locale: String
  }
  object SharedOptions {
    
    @scala.inline
    def apply(locale: String): SharedOptions = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[SharedOptions]
    }
    
    @scala.inline
    implicit class SharedOptionsMutableBuilder[Self <: SharedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
  
  trait SortItemsOptions[ItemType]
    extends StObject
       with SharedOptions
       with DownshiftTypedProps[ItemType] {
    
    def compareItems(item1: ItemType, item2: ItemType, options: SharedOptions): Double
    
    var selectedItems: js.Array[ItemType]
  }
  object SortItemsOptions {
    
    @scala.inline
    def apply[ItemType](
      compareItems: (ItemType, ItemType, SharedOptions) => Double,
      locale: String,
      selectedItems: js.Array[ItemType]
    ): SortItemsOptions[ItemType] = {
      val __obj = js.Dynamic.literal(compareItems = js.Any.fromFunction3(compareItems), locale = locale.asInstanceOf[js.Any], selectedItems = selectedItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortItemsOptions[ItemType]]
    }
    
    @scala.inline
    implicit class SortItemsOptionsMutableBuilder[Self <: SortItemsOptions[?], ItemType] (val x: Self & SortItemsOptions[ItemType]) extends AnyVal {
      
      @scala.inline
      def setCompareItems(value: (ItemType, ItemType, SharedOptions) => Double): Self = StObject.set(x, "compareItems", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSelectedItems(value: js.Array[ItemType]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemsVarargs(value: ItemType*): Self = StObject.set(x, "selectedItems", js.Array(value :_*))
    }
  }
}
