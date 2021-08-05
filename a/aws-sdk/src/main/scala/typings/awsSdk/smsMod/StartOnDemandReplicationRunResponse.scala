package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartOnDemandReplicationRunResponse extends StObject {
  
  /**
    * The ID of the replication run.
    */
  var replicationRunId: js.UndefOr[ReplicationRunId] = js.undefined
}
object StartOnDemandReplicationRunResponse {
  
  inline def apply(): StartOnDemandReplicationRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartOnDemandReplicationRunResponse]
  }
  
  extension [Self <: StartOnDemandReplicationRunResponse](x: Self) {
    
    inline def setReplicationRunId(value: ReplicationRunId): Self = StObject.set(x, "replicationRunId", value.asInstanceOf[js.Any])
    
    inline def setReplicationRunIdUndefined: Self = StObject.set(x, "replicationRunId", js.undefined)
  }
}
