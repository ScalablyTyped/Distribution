package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProjectsInput extends js.Object {
  /**
    * During a previous call, if there are more than 100 items in the list, only the first 100 items are returned, along with a unique string called a nextToken. To get the next batch of items in the list, call this operation again, adding the next token to the call. To get all of the items in the list, keep calling this operation with each subsequent next token that is returned, until no more next tokens are returned.
    */
  var nextToken: js.UndefOr[NonEmptyString] = js.native
  /**
    * The criterion to be used to list build project names. Valid values include:    CREATED_TIME: List based on when each build project was created.    LAST_MODIFIED_TIME: List based on when information about each build project was last changed.    NAME: List based on each build project's name.   Use sortOrder to specify in what order to list the build project names based on the preceding criteria.
    */
  var sortBy: js.UndefOr[ProjectSortByType] = js.native
  /**
    * The order in which to list build projects. Valid values include:    ASCENDING: List in ascending order.    DESCENDING: List in descending order.   Use sortBy to specify the criterion to be used to list build project names.
    */
  var sortOrder: js.UndefOr[SortOrderType] = js.native
}

object ListProjectsInput {
  @scala.inline
  def apply(): ListProjectsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProjectsInput]
  }
  @scala.inline
  implicit class ListProjectsInputOps[Self <: ListProjectsInput] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NonEmptyString): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setSortBy(value: ProjectSortByType): Self = this.set("sortBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortBy: Self = this.set("sortBy", js.undefined)
    @scala.inline
    def setSortOrder(value: SortOrderType): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
  }
  
}

