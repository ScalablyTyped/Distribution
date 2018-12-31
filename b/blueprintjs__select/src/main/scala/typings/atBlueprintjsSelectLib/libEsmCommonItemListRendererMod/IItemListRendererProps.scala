package typings
package atBlueprintjsSelectLib.libEsmCommonItemListRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IItemListRendererProps[T] extends js.Object {
  /** The currently focused item (for keyboard interactions). */
  var activeItem: T | scala.Null = js.native
  /**
    * Array of items filtered by `itemListPredicate` or `itemPredicate`.
    * See `items` for the full list of items.
    *
    * Use `renderFilteredItems()` utility function from this library to
    * map each item in this array through `renderItem`, with support for
    * optional `noResults` and `initialContent` states.
    */
  var filteredItems: js.Array[T] = js.native
  /**
    * Array of all items in the list.
    * See `filteredItems` for a filtered array based on `query` and predicate props.
    */
  var items: js.Array[T] = js.native
  /**
    * The current query string.
    */
  var query: java.lang.String = js.native
  def itemsParentRef(): scala.Unit = js.native
  /**
    * A ref handler that should be attached to the parent HTML element of the menu items.
    * This is required for the active item to scroll into view automatically.
    */
  def itemsParentRef(ref: reactLib.HTMLElement): scala.Unit = js.native
  /**
    * Call this function to render an item.
    * This retrieves the modifiers for the item and delegates actual rendering
    * to the owner component's `itemRenderer` prop.
    */
  def renderItem(item: T, index: scala.Double): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
}

