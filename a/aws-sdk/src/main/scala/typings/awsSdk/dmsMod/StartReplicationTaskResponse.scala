package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartReplicationTaskResponse extends StObject {
  
  /**
    * The replication task started.
    */
  var ReplicationTask: js.UndefOr[typings.awsSdk.dmsMod.ReplicationTask] = js.undefined
}
object StartReplicationTaskResponse {
  
  @scala.inline
  def apply(): StartReplicationTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartReplicationTaskResponse]
  }
  
  @scala.inline
  implicit class StartReplicationTaskResponseMutableBuilder[Self <: StartReplicationTaskResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationTask(value: ReplicationTask): Self = StObject.set(x, "ReplicationTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationTaskUndefined: Self = StObject.set(x, "ReplicationTask", js.undefined)
  }
}
