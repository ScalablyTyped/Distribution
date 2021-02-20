package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoveReplicationTaskResponse extends StObject {
  
  /**
    * The replication task that was moved.
    */
  var ReplicationTask: js.UndefOr[typings.awsSdk.dmsMod.ReplicationTask] = js.native
}
object MoveReplicationTaskResponse {
  
  @scala.inline
  def apply(): MoveReplicationTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveReplicationTaskResponse]
  }
  
  @scala.inline
  implicit class MoveReplicationTaskResponseMutableBuilder[Self <: MoveReplicationTaskResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationTask(value: ReplicationTask): Self = StObject.set(x, "ReplicationTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationTaskUndefined: Self = StObject.set(x, "ReplicationTask", js.undefined)
  }
}
