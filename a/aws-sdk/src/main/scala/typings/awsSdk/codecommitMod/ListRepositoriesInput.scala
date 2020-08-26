package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRepositoriesInput extends js.Object {
  /**
    * An enumeration token that allows the operation to batch the results of the operation. Batch sizes are 1,000 for list repository operations. When the client sends the token back to AWS CodeCommit, another page of 1,000 records is retrieved.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The order in which to sort the results of a list repositories operation.
    */
  var order: js.UndefOr[OrderEnum] = js.native
  /**
    * The criteria used to sort the results of a list repositories operation.
    */
  var sortBy: js.UndefOr[SortByEnum] = js.native
}

object ListRepositoriesInput {
  @scala.inline
  def apply(): ListRepositoriesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRepositoriesInput]
  }
  @scala.inline
  implicit class ListRepositoriesInputOps[Self <: ListRepositoriesInput] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setOrder(value: OrderEnum): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setSortBy(value: SortByEnum): Self = this.set("sortBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortBy: Self = this.set("sortBy", js.undefined)
  }
  
}

