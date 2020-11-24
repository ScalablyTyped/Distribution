package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): GetReplicationRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReplicationRunsResponse]
  }
  
  @scala.inline
  implicit class GetReplicationRunsResponseOps[Self <: GetReplicationRunsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setReplicationJob(value: ReplicationJob): Self = this.set("replicationJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationJob: Self = this.set("replicationJob", js.undefined)
    
    @scala.inline
    def setReplicationRunListVarargs(value: ReplicationRun*): Self = this.set("replicationRunList", js.Array(value :_*))
    
    @scala.inline
    def setReplicationRunList(value: ReplicationRunList): Self = this.set("replicationRunList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationRunList: Self = this.set("replicationRunList", js.undefined)
  }
}
