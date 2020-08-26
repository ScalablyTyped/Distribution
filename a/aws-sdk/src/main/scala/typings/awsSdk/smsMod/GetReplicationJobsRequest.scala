package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReplicationJobsRequest extends js.Object {
  /**
    * The maximum number of results to return in a single call. The default value is 50. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The identifier of the replication job.
    */
  var replicationJobId: js.UndefOr[ReplicationJobId] = js.native
}

object GetReplicationJobsRequest {
  @scala.inline
  def apply(): GetReplicationJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReplicationJobsRequest]
  }
  @scala.inline
  implicit class GetReplicationJobsRequestOps[Self <: GetReplicationJobsRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setReplicationJobId(value: ReplicationJobId): Self = this.set("replicationJobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationJobId: Self = this.set("replicationJobId", js.undefined)
  }
  
}

