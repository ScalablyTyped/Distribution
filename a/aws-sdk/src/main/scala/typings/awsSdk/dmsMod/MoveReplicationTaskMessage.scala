package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoveReplicationTaskMessage extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the task that you want to move.
    */
  var ReplicationTaskArn: String = js.native
  
  /**
    * The ARN of the replication instance where you want to move the task to.
    */
  var TargetReplicationInstanceArn: String = js.native
}
object MoveReplicationTaskMessage {
  
  @scala.inline
  def apply(ReplicationTaskArn: String, TargetReplicationInstanceArn: String): MoveReplicationTaskMessage = {
    val __obj = js.Dynamic.literal(ReplicationTaskArn = ReplicationTaskArn.asInstanceOf[js.Any], TargetReplicationInstanceArn = TargetReplicationInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveReplicationTaskMessage]
  }
  
  @scala.inline
  implicit class MoveReplicationTaskMessageMutableBuilder[Self <: MoveReplicationTaskMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationTaskArn(value: String): Self = StObject.set(x, "ReplicationTaskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetReplicationInstanceArn(value: String): Self = StObject.set(x, "TargetReplicationInstanceArn", value.asInstanceOf[js.Any])
  }
}
