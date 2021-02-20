package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartOnDemandReplicationRunRequest extends StObject {
  
  /**
    * The description of the replication run.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * The ID of the replication job.
    */
  var replicationJobId: ReplicationJobId = js.native
}
object StartOnDemandReplicationRunRequest {
  
  @scala.inline
  def apply(replicationJobId: ReplicationJobId): StartOnDemandReplicationRunRequest = {
    val __obj = js.Dynamic.literal(replicationJobId = replicationJobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartOnDemandReplicationRunRequest]
  }
  
  @scala.inline
  implicit class StartOnDemandReplicationRunRequestMutableBuilder[Self <: StartOnDemandReplicationRunRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setReplicationJobId(value: ReplicationJobId): Self = StObject.set(x, "replicationJobId", value.asInstanceOf[js.Any])
  }
}
