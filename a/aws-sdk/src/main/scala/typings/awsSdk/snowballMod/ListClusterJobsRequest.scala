package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListClusterJobsRequest extends js.Object {
  /**
    * The 39-character ID for the cluster that you want to list, for example CID123e4567-e89b-12d3-a456-426655440000.
    */
  var ClusterId: typings.awsSdk.snowballMod.ClusterId = js.native
  /**
    * The number of JobListEntry objects to return.
    */
  var MaxResults: js.UndefOr[ListLimit] = js.native
  /**
    * HTTP requests are stateless. To identify what object comes "next" in the list of JobListEntry objects, you have the option of specifying NextToken as the starting point for your returned list.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListClusterJobsRequest {
  @scala.inline
  def apply(ClusterId: ClusterId): ListClusterJobsRequest = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListClusterJobsRequest]
  }
  @scala.inline
  implicit class ListClusterJobsRequestOps[Self <: ListClusterJobsRequest] (val x: Self) extends AnyVal {
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
    def setClusterId(value: ClusterId): Self = this.set("ClusterId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: ListLimit): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

