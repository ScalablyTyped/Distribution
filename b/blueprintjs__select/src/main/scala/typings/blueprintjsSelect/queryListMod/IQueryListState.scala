package typings.blueprintjsSelect.queryListMod

import typings.blueprintjsSelect.listItemsUtilsMod.ICreateNewItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQueryListState[T] extends js.Object {
  /** The currently focused item (for keyboard interactions). */
  var activeItem: T | ICreateNewItem | Null = js.native
  /**
    * The item returned from `createNewItemFromQuery(this.state.query)`, cached
    * to avoid continuous reinstantions within `isCreateItemRendered`, where
    * this element will be used to hide the "Create Item" option if its value
    * matches the current `query`.
    */
  var createNewItem: js.UndefOr[T] = js.native
  /** The original `items` array filtered by `itemListPredicate` or `itemPredicate`. */
  var filteredItems: js.Array[T] = js.native
  /** The current query string. */
  var query: String = js.native
}

object IQueryListState {
  @scala.inline
  def apply[T](filteredItems: js.Array[T], query: String): IQueryListState[T] = {
    val __obj = js.Dynamic.literal(filteredItems = filteredItems.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQueryListState[T]]
  }
  @scala.inline
  implicit class IQueryListStateOps[Self <: IQueryListState[_], T] (val x: Self with IQueryListState[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFilteredItemsVarargs(value: T*): Self = this.set("filteredItems", js.Array(value :_*))
    @scala.inline
    def setFilteredItems(value: js.Array[T]): Self = this.set("filteredItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveItem(value: T | ICreateNewItem): Self = this.set("activeItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveItemNull: Self = this.set("activeItem", null)
    @scala.inline
    def setCreateNewItem(value: T): Self = this.set("createNewItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateNewItem: Self = this.set("createNewItem", js.undefined)
  }
  
}

