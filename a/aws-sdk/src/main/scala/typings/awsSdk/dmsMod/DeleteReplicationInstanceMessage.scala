package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReplicationInstanceMessage extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the replication instance to be deleted.
    */
  var ReplicationInstanceArn: String
}
object DeleteReplicationInstanceMessage {
  
  @scala.inline
  def apply(ReplicationInstanceArn: String): DeleteReplicationInstanceMessage = {
    val __obj = js.Dynamic.literal(ReplicationInstanceArn = ReplicationInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReplicationInstanceMessage]
  }
  
  @scala.inline
  implicit class DeleteReplicationInstanceMessageMutableBuilder[Self <: DeleteReplicationInstanceMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationInstanceArn(value: String): Self = StObject.set(x, "ReplicationInstanceArn", value.asInstanceOf[js.Any])
  }
}
