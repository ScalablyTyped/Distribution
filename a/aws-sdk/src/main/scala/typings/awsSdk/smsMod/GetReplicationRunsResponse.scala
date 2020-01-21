package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReplicationRunsResponse extends js.Object {
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * Information about the replication job.
    */
  var replicationJob: js.UndefOr[ReplicationJob] = js.native
  /**
    * Information about the replication runs.
    */
  var replicationRunList: js.UndefOr[ReplicationRunList] = js.native
}

object GetReplicationRunsResponse {
  @scala.inline
  def apply(
    nextToken: NextToken = null,
    replicationJob: ReplicationJob = null,
    replicationRunList: ReplicationRunList = null
  ): GetReplicationRunsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (replicationJob != null) __obj.updateDynamic("replicationJob")(replicationJob.asInstanceOf[js.Any])
    if (replicationRunList != null) __obj.updateDynamic("replicationRunList")(replicationRunList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReplicationRunsResponse]
  }
}

