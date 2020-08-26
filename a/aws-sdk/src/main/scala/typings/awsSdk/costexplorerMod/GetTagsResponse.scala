package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTagsResponse extends js.Object {
  /**
    * The token for the next set of retrievable results. AWS provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.native
  /**
    * The number of query results that AWS returns at a time.
    */
  var ReturnSize: PageSize = js.native
  /**
    * The tags that match your request.
    */
  var Tags: TagList = js.native
  /**
    * The total number of query results.
    */
  var TotalSize: PageSize = js.native
}

object GetTagsResponse {
  @scala.inline
  def apply(ReturnSize: PageSize, Tags: TagList, TotalSize: PageSize): GetTagsResponse = {
    val __obj = js.Dynamic.literal(ReturnSize = ReturnSize.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any], TotalSize = TotalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTagsResponse]
  }
  @scala.inline
  implicit class GetTagsResponseOps[Self <: GetTagsResponse] (val x: Self) extends AnyVal {
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
    def setReturnSize(value: PageSize): Self = this.set("ReturnSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Entity*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalSize(value: PageSize): Self = this.set("TotalSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextPageToken(value: NextPageToken): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
  }
  
}

