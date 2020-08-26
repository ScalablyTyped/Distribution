package typings.awsSdk.mediastoredataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemsResponse extends js.Object {
  /**
    * The metadata entries for the folders and objects at the requested path.
    */
  var Items: js.UndefOr[ItemList] = js.native
  /**
    * The token that can be used in a request to view the next set of results. For example, you submit a ListItems request that matches 2,000 items with MaxResults set at 500. The service returns the first batch of results (up to 500) and a NextToken value that can be used to fetch the next batch of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListItemsResponse {
  @scala.inline
  def apply(): ListItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemsResponse]
  }
  @scala.inline
  implicit class ListItemsResponseOps[Self <: ListItemsResponse] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: Item*): Self = this.set("Items", js.Array(value :_*))
    @scala.inline
    def setItems(value: ItemList): Self = this.set("Items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("Items", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

