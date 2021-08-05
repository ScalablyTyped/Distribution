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
  
  inline def apply(replicationJobId: ReplicationJobId): DeleteReplicationJobRequest = {
    val __obj = js.Dynamic.literal(replicationJobId = replicationJobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReplicationJobRequest]
  }
  
  extension [Self <: DeleteReplicationJobRequest](x: Self) {
    
    inline def setReplicationJobId(value: ReplicationJobId): Self = StObject.set(x, "replicationJobId", value.asInstanceOf[js.Any])
  }
}
