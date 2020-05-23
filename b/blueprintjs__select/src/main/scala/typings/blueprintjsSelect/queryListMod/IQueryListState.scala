package typings.blueprintjsSelect.queryListMod

import typings.blueprintjsSelect.listItemsUtilsMod.ICreateNewItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQueryListState[T] extends js.Object {
  /** The currently focused item (for keyboard interactions). */
  var activeItem: T | ICreateNewItem | Null
  /**
    * The item returned from `createNewItemFromQuery(this.state.query)`, cached
    * to avoid continuous reinstantions within `isCreateItemRendered`, where
    * this element will be used to hide the "Create Item" option if its value
    * matches the current `query`.
    */
  var createNewItem: js.UndefOr[T] = js.undefined
  /** The original `items` array filtered by `itemListPredicate` or `itemPredicate`. */
  var filteredItems: js.Array[T]
  /** The current query string. */
  var query: String
}

object IQueryListState {
  @scala.inline
  def apply[T](
    filteredItems: js.Array[T],
    query: String,
    activeItem: T | ICreateNewItem = null,
    createNewItem: T = null
  ): IQueryListState[T] = {
    val __obj = js.Dynamic.literal(filteredItems = filteredItems.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], activeItem = activeItem.asInstanceOf[js.Any])
    if (createNewItem != null) __obj.updateDynamic("createNewItem")(createNewItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQueryListState[T]]
  }
}

