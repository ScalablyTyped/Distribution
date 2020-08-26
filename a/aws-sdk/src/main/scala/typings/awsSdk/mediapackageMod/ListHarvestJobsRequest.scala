package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHarvestJobsRequest extends js.Object {
  /**
    * When specified, the request will return only HarvestJobs associated with the given Channel ID.
    */
  var IncludeChannelId: js.UndefOr[string] = js.native
  /**
    * When specified, the request will return only HarvestJobs in the given status.
    */
  var IncludeStatus: js.UndefOr[string] = js.native
  /**
    * The upper bound on the number of records to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.mediapackageMod.MaxResults] = js.native
  /**
    * A token used to resume pagination from the end of a previous request.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListHarvestJobsRequest {
  @scala.inline
  def apply(): ListHarvestJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHarvestJobsRequest]
  }
  @scala.inline
  implicit class ListHarvestJobsRequestOps[Self <: ListHarvestJobsRequest] (val x: Self) extends AnyVal {
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
    def setIncludeChannelId(value: string): Self = this.set("IncludeChannelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeChannelId: Self = this.set("IncludeChannelId", js.undefined)
    @scala.inline
    def setIncludeStatus(value: string): Self = this.set("IncludeStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeStatus: Self = this.set("IncludeStatus", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

