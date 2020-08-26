package typings.awsSdk.mediastoredataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemsRequest extends js.Object {
  /**
    * The maximum number of results to return per API request. For example, you submit a ListItems request with MaxResults set at 500. Although 2,000 items match your request, the service returns no more than the first 500 items. (The service also returns a NextToken value that you can use to fetch the next batch of results.) The service might return fewer results than the MaxResults value. If MaxResults is not included in the request, the service defaults to pagination with a maximum of 1,000 results per page.
    */
  var MaxResults: js.UndefOr[ListLimit] = js.native
  /**
    * The token that identifies which batch of results that you want to see. For example, you submit a ListItems request with MaxResults set at 500. The service returns the first batch of results (up to 500) and a NextToken value. To see the next batch of results, you can submit the ListItems request a second time and specify the NextToken value. Tokens expire after 15 minutes.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The path in the container from which to retrieve items. Format: &lt;folder name&gt;/&lt;folder name&gt;/&lt;file name&gt;
    */
  var Path: js.UndefOr[ListPathNaming] = js.native
}

object ListItemsRequest {
  @scala.inline
  def apply(): ListItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemsRequest]
  }
  @scala.inline
  implicit class ListItemsRequestOps[Self <: ListItemsRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: ListLimit): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setPath(value: ListPathNaming): Self = this.set("Path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("Path", js.undefined)
  }
  
}

