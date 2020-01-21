package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReplicationJobsResponse extends js.Object {
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * Information about the replication jobs.
    */
  var replicationJobList: js.UndefOr[ReplicationJobList] = js.native
}

object GetReplicationJobsResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, replicationJobList: ReplicationJobList = null): GetReplicationJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (replicationJobList != null) __obj.updateDynamic("replicationJobList")(replicationJobList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReplicationJobsResponse]
  }
}

