package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): GetReplicationJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReplicationJobsResponse]
  }
  
  @scala.inline
  implicit class GetReplicationJobsResponseOps[Self <: GetReplicationJobsResponse] (val x: Self) extends AnyVal {
    
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
    def setReplicationJobListVarargs(value: ReplicationJob*): Self = this.set("replicationJobList", js.Array(value :_*))
    
    @scala.inline
    def setReplicationJobList(value: ReplicationJobList): Self = this.set("replicationJobList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationJobList: Self = this.set("replicationJobList", js.undefined)
  }
}
