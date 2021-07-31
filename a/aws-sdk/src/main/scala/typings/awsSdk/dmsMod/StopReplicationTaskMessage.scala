package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopReplicationTaskMessage extends StObject {
  
  /**
    * The Amazon Resource Name(ARN) of the replication task to be stopped.
    */
  var ReplicationTaskArn: String
}
object StopReplicationTaskMessage {
  
  @scala.inline
  def apply(ReplicationTaskArn: String): StopReplicationTaskMessage = {
    val __obj = js.Dynamic.literal(ReplicationTaskArn = ReplicationTaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopReplicationTaskMessage]
  }
  
  @scala.inline
  implicit class StopReplicationTaskMessageMutableBuilder[Self <: StopReplicationTaskMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationTaskArn(value: String): Self = StObject.set(x, "ReplicationTaskArn", value.asInstanceOf[js.Any])
  }
}
