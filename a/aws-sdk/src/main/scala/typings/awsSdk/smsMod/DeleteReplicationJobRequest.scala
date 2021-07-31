package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReplicationJobRequest extends StObject {
  
  /**
    * The ID of the replication job.
    */
  var replicationJobId: ReplicationJobId
}
object DeleteReplicationJobRequest {
  
  @scala.inline
  def apply(replicationJobId: ReplicationJobId): DeleteReplicationJobRequest = {
    val __obj = js.Dynamic.literal(replicationJobId = replicationJobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReplicationJobRequest]
  }
  
  @scala.inline
  implicit class DeleteReplicationJobRequestMutableBuilder[Self <: DeleteReplicationJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationJobId(value: ReplicationJobId): Self = StObject.set(x, "replicationJobId", value.asInstanceOf[js.Any])
  }
}
