package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSharedProjectsInput extends js.Object {
  /**
    *  The maximum number of paginated shared build projects returned per response. Use nextToken to iterate pages in the list of returned Project objects. The default value is 100. 
    */
  var maxResults: js.UndefOr[PageSize] = js.native
  /**
    *  During a previous call, the maximum number of items that can be returned is the value specified in maxResults. If there more items in the list, then a unique string called a nextToken is returned. To get the next batch of items in the list, call this operation again, adding the next token to the call. To get all of the items in the list, keep calling this operation with each subsequent next token that is returned, until no more next tokens are returned. 
    */
  var nextToken: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The criterion to be used to list build projects shared with the current AWS account or user. Valid values include:     ARN: List based on the ARN.     MODIFIED_TIME: List based on when information about the shared project was last changed.   
    */
  var sortBy: js.UndefOr[SharedResourceSortByType] = js.native
  /**
    * The order in which to list shared build projects. Valid values include:    ASCENDING: List in ascending order.    DESCENDING: List in descending order.  
    */
  var sortOrder: js.UndefOr[SortOrderType] = js.native
}

object ListSharedProjectsInput {
  @scala.inline
  def apply(): ListSharedProjectsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSharedProjectsInput]
  }
  @scala.inline
  implicit class ListSharedProjectsInputOps[Self <: ListSharedProjectsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaxResults(value: PageSize): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NonEmptyString): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setSortBy(value: SharedResourceSortByType): Self = this.set("sortBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortBy: Self = this.set("sortBy", js.undefined)
    @scala.inline
    def setSortOrder(value: SortOrderType): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
  }
  
}

