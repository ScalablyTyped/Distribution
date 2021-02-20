package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateReplicationJobResponse extends StObject {
  
  /**
    * The unique identifier of the replication job.
    */
  var replicationJobId: js.UndefOr[ReplicationJobId] = js.native
}
object CreateReplicationJobResponse {
  
  @scala.inline
  def apply(): CreateReplicationJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateReplicationJobResponse]
  }
  
  @scala.inline
  implicit class CreateReplicationJobResponseMutableBuilder[Self <: CreateReplicationJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationJobId(value: ReplicationJobId): Self = StObject.set(x, "replicationJobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationJobIdUndefined: Self = StObject.set(x, "replicationJobId", js.undefined)
  }
}
