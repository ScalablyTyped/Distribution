package typings
package atBlueprintjsSelectLib.libEsmCommonListItemsPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IListItemsProps[T]
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
    * The currently focused item for keyboard interactions, or `null` to
    * indicate that no item is active. If omitted or `undefined`, this prop will be
    * uncontrolled (managed by the component's state). Use `onActiveItemChange`
    * to listen for updates.
    */
  var activeItem: js.UndefOr[T | scala.Null] = js.native
  /**
    * React content to render when query is empty.
    * If omitted, all items will be rendered (or result of `itemListPredicate` with empty query).
    * If explicit `null`, nothing will be rendered when query is empty.
    *
    * This prop is ignored if a custom `itemListRenderer` is supplied.
    */
  var initialContent: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode | scala.Null] = js.native
  /**
    * Determine if the given item is disabled. Provide a callback function, or
    * simply provide the name of a boolean property on the item that exposes
    * its disabled state.
    */
  var itemDisabled: js.UndefOr[java.lang.String] = js.native
  /**
    * Customize querying of entire `items` array. Return new list of items.
    * This method can reorder, add, or remove items at will.
    * (Supports filter algorithms that operate on the entire set, rather than individual items.)
    *
    * If `itemPredicate` is also defined, this prop takes priority and the other will be ignored.
    */
  var itemListPredicate: js.UndefOr[atBlueprintjsSelectLib.libEsmCommonPredicateMod.ItemListPredicate[T]] = js.native
  /**
    * Custom renderer for the contents of the dropdown.
    *
    * The default implementation invokes `itemRenderer` for each item that passes the predicate
    * and wraps them all in a `Menu` element. If the query is empty then `initialContent` is returned,
    * and if there are no items that match the predicate then `noResults` is returned.
    */
  var itemListRenderer: js.UndefOr[atBlueprintjsSelectLib.libEsmCommonItemListRendererMod.ItemListRenderer[T]] = js.native
  /**
    * Customize querying of individual items. Return `true` to keep the item, `false` to hide.
    * This method will be invoked once for each item, so it should be performant. For more complex
    * queries, use `itemListPredicate` to operate once on the entire array.
    *
    * This prop is ignored if `itemListPredicate` is also defined.
    */
  var itemPredicate: js.UndefOr[atBlueprintjsSelectLib.libEsmCommonPredicateMod.ItemPredicate[T]] = js.native
  /**
    * Custom renderer for an item in the dropdown list. Receives a boolean indicating whether
    * this item is active (selected by keyboard arrows) and an `onClick` event handler that
    * should be attached to the returned element.
    */
  @JSName("itemRenderer")
  var itemRenderer_Original: atBlueprintjsSelectLib.libEsmCommonItemRendererMod.ItemRenderer[T] = js.native
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
  var noResults: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.native
  /**
    * Invoked when user interaction should change the active item: arrow keys move it up/down
    * in the list, selecting an item makes it active, and changing the query may reset it to
    * the first item in the list if it no longer matches the filter.
    */
  var onActiveItemChange: js.UndefOr[js.Function1[/* activeItem */ T | scala.Null, scala.Unit]] = js.native
  /**
    * Callback invoked when the query string changes.
    */
  var onQueryChange: js.UndefOr[
    js.Function2[
      /* query */ java.lang.String, 
      /* event */ js.UndefOr[reactLib.reactMod.ReactNs.ChangeEvent[reactLib.HTMLInputElement]], 
      scala.Unit
    ]
  ] = js.native
  /**
    * Query string passed to `itemListPredicate` or `itemPredicate` to filter items.
    * This value is controlled: its state must be managed externally by attaching an `onChange`
    * handler to the relevant element in your `renderer` implementation.
    */
  var query: js.UndefOr[java.lang.String] = js.native
  /**
    * Whether the active item should be reset to the first matching item _every
    * time the query changes_ (via prop or by user input).
    * @default true
    */
  var resetOnQuery: js.UndefOr[scala.Boolean] = js.native
  /**
    * Whether the active item should be reset to the first matching item _when
    * an item is selected_. The query will also be reset to the empty string.
    * @default false
    */
  var resetOnSelect: js.UndefOr[scala.Boolean] = js.native
  /**
    * When `activeItem` is controlled, whether the active item should _always_
    * be scrolled into view when the prop changes. If `false`, only changes
    * that result from built-in interactions (clicking, querying, or using
    * arrow keys) will scroll the active item into view. Ignored if the
    * `activeItem` prop is omitted (uncontrolled behavior).
    * @default true
    */
  var scrollToActiveItem: js.UndefOr[scala.Boolean] = js.native
  /**
    * Custom renderer for an item in the dropdown list. Receives a boolean indicating whether
    * this item is active (selected by keyboard arrows) and an `onClick` event handler that
    * should be attached to the returned element.
    */
  def itemRenderer(item: T, itemProps: atBlueprintjsSelectLib.libEsmCommonItemRendererMod.IItemRendererProps): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
  /**
    * Callback invoked when an item from the list is selected,
    * typically by clicking or pressing `enter` key.
    */
  def onItemSelect(item: T): scala.Unit = js.native
  def onItemSelect(item: T, event: reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement, reactLib.Event]): scala.Unit = js.native
}

