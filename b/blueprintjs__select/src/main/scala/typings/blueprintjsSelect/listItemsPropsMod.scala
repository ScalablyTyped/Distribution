package typings.blueprintjsSelect

import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsSelect.blueprintjsSelectStrings.first
import typings.blueprintjsSelect.blueprintjsSelectStrings.last
import typings.blueprintjsSelect.itemListRendererMod.ItemListRenderer
import typings.blueprintjsSelect.itemRendererMod.ItemRenderer
import typings.blueprintjsSelect.listItemsUtilsMod.ICreateNewItem
import typings.blueprintjsSelect.predicateMod.ItemListPredicate
import typings.blueprintjsSelect.predicateMod.ItemPredicate
import typings.react.mod.ChangeEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/select/lib/esm/common/listItemsProps", JSImport.Namespace)
@js.native
object listItemsPropsMod extends js.Object {
  
  def executeItemsEqual[T](): Boolean = js.native
  def executeItemsEqual[T](itemsEqualProp: js.UndefOr[ItemsEqualProp[T]], itemA: T): Boolean = js.native
  def executeItemsEqual[T](itemsEqualProp: js.UndefOr[ItemsEqualProp[T]], itemA: T, itemB: T): Boolean = js.native
  def executeItemsEqual[T](itemsEqualProp: js.UndefOr[ItemsEqualProp[T]], itemA: js.UndefOr[scala.Nothing], itemB: T): Boolean = js.native
  def executeItemsEqual[T](itemsEqualProp: js.UndefOr[ItemsEqualProp[T]], itemA: Null, itemB: T): Boolean = js.native
  def executeItemsEqual[T](itemsEqualProp: ItemsEqualProp[T]): Boolean = js.native
  
  @js.native
  trait IListItemsProps[T] extends IProps {
    
    /**
      * The currently focused item for keyboard interactions, or `null` to
      * indicate that no item is active. If omitted or `undefined`, this prop will be
      * uncontrolled (managed by the component's state). Use `onActiveItemChange`
      * to listen for updates.
      */
    var activeItem: js.UndefOr[T | ICreateNewItem | Null] = js.native
    
    /**
      * If provided, allows new items to be created using the current query
      * string. This is invoked when user interaction causes a new item to be
      * created, either by pressing the `Enter` key or by clicking on the "Create
      * Item" option. It transforms a query string into an item type.
      */
    var createNewItemFromQuery: js.UndefOr[js.Function1[/* query */ String, T]] = js.native
    
    /**
      * Determines the position of the `createNewItem` within the list: first or
      * last. Only relevant when `createNewItemRenderer` is defined.
      * @default 'last'
      */
    var createNewItemPosition: js.UndefOr[first | last] = js.native
    
    /**
      * Custom renderer to transform the current query string into a selectable
      * "Create Item" option. If this function is provided, a "Create Item"
      * option will be rendered at the end of the list of items. If this function
      * is not provided, a "Create Item" option will not be displayed.
      */
    var createNewItemRenderer: js.UndefOr[
        js.Function3[
          /* query */ String, 
          /* active */ Boolean, 
          /* handleClick */ MouseEventHandler[HTMLElement], 
          js.UndefOr[Element]
        ]
      ] = js.native
    
    /**
      * React content to render when query is empty.
      * If omitted, all items will be rendered (or result of `itemListPredicate` with empty query).
      * If explicit `null`, nothing will be rendered when query is empty.
      *
      * This prop is ignored if a custom `itemListRenderer` is supplied.
      */
    var initialContent: js.UndefOr[ReactNode | Null] = js.native
    
    /**
      * Determine if the given item is disabled. Provide a callback function, or
      * simply provide the name of a boolean property on the item that exposes
      * its disabled state.
      */
    var itemDisabled: js.UndefOr[
        (/* keyof T */ String) | (js.Function2[/* item */ T, /* index */ Double, Boolean])
      ] = js.native
    
    /**
      * Customize querying of entire `items` array. Return new list of items.
      * This method can reorder, add, or remove items at will.
      * (Supports filter algorithms that operate on the entire set, rather than individual items.)
      *
      * If `itemPredicate` is also defined, this prop takes priority and the other will be ignored.
      */
    var itemListPredicate: js.UndefOr[ItemListPredicate[T]] = js.native
    
    /**
      * Custom renderer for the contents of the dropdown.
      *
      * The default implementation invokes `itemRenderer` for each item that passes the predicate
      * and wraps them all in a `Menu` element. If the query is empty then `initialContent` is returned,
      * and if there are no items that match the predicate then `noResults` is returned.
      */
    var itemListRenderer: js.UndefOr[ItemListRenderer[T]] = js.native
    
    /**
      * Customize querying of individual items.
      *
      * __Filtering a list of items.__ This function is invoked to filter the
      * list of items as a query is typed. Return `true` to keep the item, or
      * `false` to hide. This method is invoked once for each item, so it should
      * be performant. For more complex queries, use `itemListPredicate` to
      * operate once on the entire array. For the purposes of filtering the list,
      * this prop is ignored if `itemListPredicate` is also defined.
      *
      * __Matching a pasted value to an item.__ This function is also invoked to
      * match a pasted value to an existing item if possible. In this case, the
      * function will receive `exactMatch=true`, and the function should return
      * true only if the item _exactly_ matches the query. For the purposes of
      * matching pasted values, this prop will be invoked even if
      * `itemListPredicate` is defined.
      */
    var itemPredicate: js.UndefOr[ItemPredicate[T]] = js.native
    
    /**
      * Custom renderer for an item in the dropdown list. Receives a boolean indicating whether
      * this item is active (selected by keyboard arrows) and an `onClick` event handler that
      * should be attached to the returned element.
      */
    var itemRenderer: ItemRenderer[T] = js.native
    
    /** Array of items in the list. */
    var items: js.Array[T] = js.native
    
    /**
      * Specifies how to test if two items are equal. By default, simple strict
      * equality (`===`) is used to compare two items.
      *
      * If your items have a unique identifier field, simply provide the name of
      * a property on the item that can be compared with strict equality to
      * determine equivalence: `itemsEqual="id"` will check `a.id === b.id`.
      *
      * If more complex comparison logic is required, provide an equality
      * comparator function that returns `true` if the two items are equal. The
      * arguments to this function will never be `null` or `undefined`, as those
      * values are handled before calling the function.
      */
    var itemsEqual: js.UndefOr[ItemsEqualProp[T]] = js.native
    
    /**
      * React content to render when filtering items returns zero results.
      * If omitted, nothing will be rendered in this case.
      *
      * This prop is ignored if a custom `itemListRenderer` is supplied.
      */
    var noResults: js.UndefOr[ReactNode] = js.native
    
    /**
      * Invoked when user interaction should change the active item: arrow keys
      * move it up/down in the list, selecting an item makes it active, and
      * changing the query may reset it to the first item in the list if it no
      * longer matches the filter.
      *
      * If the "Create Item" option is displayed and currently active, then
      * `isCreateNewItem` will be `true` and `activeItem` will be `null`. In this
      * case, you should provide a valid `ICreateNewItem` object to the
      * `activeItem` _prop_ in order for the "Create Item" option to appear as
      * active.
      *
      * __Note:__ You can instantiate a `ICreateNewItem` object using the
      * `getCreateNewItem()` utility exported from this package.
      */
    var onActiveItemChange: js.UndefOr[js.Function2[/* activeItem */ T | Null, /* isCreateNewItem */ Boolean, Unit]] = js.native
    
    /**
      * Callback invoked when an item from the list is selected,
      * typically by clicking or pressing `enter` key.
      */
    def onItemSelect(item: T): Unit = js.native
    def onItemSelect(item: T, event: SyntheticEvent[HTMLElement, Event]): Unit = js.native
    
    /**
      * Callback invoked when multiple items are selected at once via pasting.
      */
    var onItemsPaste: js.UndefOr[js.Function1[/* items */ js.Array[T], Unit]] = js.native
    
    /**
      * Callback invoked when the query string changes.
      */
    var onQueryChange: js.UndefOr[
        js.Function2[/* query */ String, /* event */ js.UndefOr[ChangeEvent[HTMLInputElement]], Unit]
      ] = js.native
    
    /**
      * Query string passed to `itemListPredicate` or `itemPredicate` to filter items.
      * This value is controlled: its state must be managed externally by attaching an `onChange`
      * handler to the relevant element in your `renderer` implementation.
      */
    var query: js.UndefOr[String] = js.native
    
    /**
      * Whether the active item should be reset to the first matching item _every
      * time the query changes_ (via prop or by user input).
      * @default true
      */
    var resetOnQuery: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the active item should be reset to the first matching item _when
      * an item is selected_. The query will also be reset to the empty string.
      * @default false
      */
    var resetOnSelect: js.UndefOr[Boolean] = js.native
    
    /**
      * When `activeItem` is controlled, whether the active item should _always_
      * be scrolled into view when the prop changes. If `false`, only changes
      * that result from built-in interactions (clicking, querying, or using
      * arrow keys) will scroll the active item into view. Ignored if the
      * `activeItem` prop is omitted (uncontrolled behavior).
      * @default true
      */
    var scrollToActiveItem: js.UndefOr[Boolean] = js.native
  }
  
  type ItemsEqualComparator[T] = js.Function2[/* itemA */ T, /* itemB */ T, Boolean]
  
  type ItemsEqualProp[T] = ItemsEqualComparator[T] | (/* keyof T */ String)
}
