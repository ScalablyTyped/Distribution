package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteReplicationSubnetGroupMessage extends StObject {
  
  /**
    * The subnet group name of the replication instance.
    */
  var ReplicationSubnetGroupIdentifier: String = js.native
}
object DeleteReplicationSubnetGroupMessage {
  
  @scala.inline
  def apply(ReplicationSubnetGroupIdentifier: String): DeleteReplicationSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(ReplicationSubnetGroupIdentifier = ReplicationSubnetGroupIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReplicationSubnetGroupMessage]
  }
  
  @scala.inline
  implicit class DeleteReplicationSubnetGroupMessageMutableBuilder[Self <: DeleteReplicationSubnetGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationSubnetGroupIdentifier(value: String): Self = StObject.set(x, "ReplicationSubnetGroupIdentifier", value.asInstanceOf[js.Any])
  }
}
