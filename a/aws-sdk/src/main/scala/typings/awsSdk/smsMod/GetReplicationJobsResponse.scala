package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetReplicationJobsResponse extends StObject {
  
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
  implicit class GetReplicationJobsResponseMutableBuilder[Self <: GetReplicationJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setReplicationJobList(value: ReplicationJobList): Self = StObject.set(x, "replicationJobList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationJobListUndefined: Self = StObject.set(x, "replicationJobList", js.undefined)
    
    @scala.inline
    def setReplicationJobListVarargs(value: ReplicationJob*): Self = StObject.set(x, "replicationJobList", js.Array(value :_*))
  }
}
