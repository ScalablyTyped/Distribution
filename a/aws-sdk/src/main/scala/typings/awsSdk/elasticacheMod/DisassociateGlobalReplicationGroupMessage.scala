package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateGlobalReplicationGroupMessage extends StObject {
  
  /**
    * The name of the Global Datastore
    */
  var GlobalReplicationGroupId: String = js.native
  
  /**
    * The name of the secondary cluster you wish to remove from the Global Datastore
    */
  var ReplicationGroupId: String = js.native
  
  /**
    * The AWS region of secondary cluster you wish to remove from the Global Datastore
    */
  var ReplicationGroupRegion: String = js.native
}
object DisassociateGlobalReplicationGroupMessage {
  
  @scala.inline
  def apply(GlobalReplicationGroupId: String, ReplicationGroupId: String, ReplicationGroupRegion: String): DisassociateGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(GlobalReplicationGroupId = GlobalReplicationGroupId.asInstanceOf[js.Any], ReplicationGroupId = ReplicationGroupId.asInstanceOf[js.Any], ReplicationGroupRegion = ReplicationGroupRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateGlobalReplicationGroupMessage]
  }
  
  @scala.inline
  implicit class DisassociateGlobalReplicationGroupMessageMutableBuilder[Self <: DisassociateGlobalReplicationGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalReplicationGroupId(value: String): Self = StObject.set(x, "GlobalReplicationGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationGroupId(value: String): Self = StObject.set(x, "ReplicationGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationGroupRegion(value: String): Self = StObject.set(x, "ReplicationGroupRegion", value.asInstanceOf[js.Any])
  }
}
