package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReplicationTaskMessage extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the replication task to be deleted.
    */
  var ReplicationTaskArn: String
}
object DeleteReplicationTaskMessage {
  
  inline def apply(ReplicationTaskArn: String): DeleteReplicationTaskMessage = {
    val __obj = js.Dynamic.literal(ReplicationTaskArn = ReplicationTaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReplicationTaskMessage]
  }
  
  extension [Self <: DeleteReplicationTaskMessage](x: Self) {
    
    inline def setReplicationTaskArn(value: String): Self = StObject.set(x, "ReplicationTaskArn", value.asInstanceOf[js.Any])
  }
}
