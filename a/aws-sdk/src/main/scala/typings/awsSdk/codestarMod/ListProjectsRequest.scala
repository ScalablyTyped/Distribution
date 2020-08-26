package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProjectsRequest extends js.Object {
  /**
    * The maximum amount of data that can be contained in a single set of results.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The continuation token to be used to return the next set of results, if the results cannot be returned in one response.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListProjectsRequest {
  @scala.inline
  def apply(): ListProjectsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProjectsRequest]
  }
  @scala.inline
  implicit class ListProjectsRequestOps[Self <: ListProjectsRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

