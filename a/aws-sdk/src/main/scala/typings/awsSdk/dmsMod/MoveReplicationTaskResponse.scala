package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveReplicationTaskResponse extends StObject {
  
  /**
    * The replication task that was moved.
    */
  var ReplicationTask: js.UndefOr[typings.awsSdk.dmsMod.ReplicationTask] = js.undefined
}
object MoveReplicationTaskResponse {
  
  inline def apply(): MoveReplicationTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveReplicationTaskResponse]
  }
  
  extension [Self <: MoveReplicationTaskResponse](x: Self) {
    
    inline def setReplicationTask(value: ReplicationTask): Self = StObject.set(x, "ReplicationTask", value.asInstanceOf[js.Any])
    
    inline def setReplicationTaskUndefined: Self = StObject.set(x, "ReplicationTask", js.undefined)
  }
}
