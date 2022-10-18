package typings.blueprintjsSelect

import typings.blueprintjsSelect.libEsmCommonListItemsUtilsMod.CreateNewItem
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.global.JSX.Element
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonItemListRendererMod {
  
  @JSImport("@blueprintjs/select/lib/esm/common/itemListRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderFilteredItems(props: ItemListRendererProps[Any]): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("renderFilteredItems")(props.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
  inline def renderFilteredItems(props: ItemListRendererProps[Any], noResults: Unit, initialContent: ReactNode): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFilteredItems")(props.asInstanceOf[js.Any], noResults.asInstanceOf[js.Any], initialContent.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  inline def renderFilteredItems(props: ItemListRendererProps[Any], noResults: ReactNode): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFilteredItems")(props.asInstanceOf[js.Any], noResults.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  inline def renderFilteredItems(props: ItemListRendererProps[Any], noResults: ReactNode, initialContent: ReactNode): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFilteredItems")(props.asInstanceOf[js.Any], noResults.asInstanceOf[js.Any], initialContent.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  
  type IItemListRendererProps[T] = ItemListRendererProps[T]
  
  type ItemListRenderer[T] = js.Function1[/* itemListProps */ ItemListRendererProps[T], Element | Null]
  
  trait ItemListRendererProps[T] extends StObject {
    
    /**
      * The currently focused item (for keyboard interactions), or `null` to
      * indicate that no item is active.
      */
    var activeItem: T | CreateNewItem | Null
    
    /**
      * Array of items filtered by `itemListPredicate` or `itemPredicate`.
      * See `items` for the full list of items.
      *
      * Use `renderFilteredItems()` utility function from this library to
      * map each item in this array through `renderItem`, with support for
      * optional `noResults` and `initialContent` states.
      */
    var filteredItems: js.Array[T]
    
    /**
      * Array of all items in the list.
      * See `filteredItems` for a filtered array based on `query` and predicate props.
      */
    var items: js.Array[T]
    
    /**
      * A ref handler that should be attached to the parent HTML element of the menu items.
      * This is required for the active item to scroll into view automatically.
      */
    var itemsParentRef: Ref[HTMLUListElement]
    
    /**
      * Props to apply to the `Menu` created within the `itemListRenderer`
      */
    var menuProps: js.UndefOr[HTMLAttributes[HTMLUListElement]] = js.undefined
    
    /**
      * The current query string.
      */
    var query: String
    
    /**
      * Call this function to render the "create new item" view component.
      *
      * @returns null when creating a new item is not available, and undefined if the createNewItemRenderer returns undefined
      */
    def renderCreateItem(): js.UndefOr[Element | Null]
    
    /**
      * Call this function to render an item.
      * This retrieves the modifiers for the item and delegates actual rendering
      * to the owner component's `itemRenderer` prop.
      */
    def renderItem(item: T, index: Double): Element | Null
  }
  object ItemListRendererProps {
    
    inline def apply[T](
      filteredItems: js.Array[T],
      items: js.Array[T],
      query: String,
      renderCreateItem: () => js.UndefOr[Element | Null],
      renderItem: (T, Double) => Element | Null
    ): ItemListRendererProps[T] = {
      val __obj = js.Dynamic.literal(filteredItems = filteredItems.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], renderCreateItem = js.Any.fromFunction0(renderCreateItem), renderItem = js.Any.fromFunction2(renderItem), activeItem = null, itemsParentRef = null)
      __obj.asInstanceOf[ItemListRendererProps[T]]
    }
    
    extension [Self <: ItemListRendererProps[?], T](x: Self & ItemListRendererProps[T]) {
      
      inline def setActiveItem(value: T | CreateNewItem): Self = StObject.set(x, "activeItem", value.asInstanceOf[js.Any])
      
      inline def setActiveItemNull: Self = StObject.set(x, "activeItem", null)
      
      inline def setFilteredItems(value: js.Array[T]): Self = StObject.set(x, "filteredItems", value.asInstanceOf[js.Any])
      
      inline def setFilteredItemsVarargs(value: T*): Self = StObject.set(x, "filteredItems", js.Array(value*))
      
      inline def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsParentRef(value: Ref[HTMLUListElement]): Self = StObject.set(x, "itemsParentRef", value.asInstanceOf[js.Any])
      
      inline def setItemsParentRefFunction1(value: /* instance */ HTMLUListElement | Null => Unit): Self = StObject.set(x, "itemsParentRef", js.Any.fromFunction1(value))
      
      inline def setItemsParentRefNull: Self = StObject.set(x, "itemsParentRef", null)
      
      inline def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMenuProps(value: HTMLAttributes[HTMLUListElement]): Self = StObject.set(x, "menuProps", value.asInstanceOf[js.Any])
      
      inline def setMenuPropsUndefined: Self = StObject.set(x, "menuProps", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setRenderCreateItem(value: () => js.UndefOr[Element | Null]): Self = StObject.set(x, "renderCreateItem", js.Any.fromFunction0(value))
      
      inline def setRenderItem(value: (T, Double) => Element | Null): Self = StObject.set(x, "renderItem", js.Any.fromFunction2(value))
    }
  }
}
