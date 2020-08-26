package typings.awsSdk.mobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProjectsRequest extends js.Object {
  /**
    *  Maximum number of records to list in a single response. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    *  Pagination token. Set to null to start listing projects from start. If non-null pagination token is returned in a result, then pass its value in here in another request to list more projects. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

