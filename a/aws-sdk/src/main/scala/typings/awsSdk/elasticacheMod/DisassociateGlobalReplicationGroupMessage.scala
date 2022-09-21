package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateGlobalReplicationGroupMessage extends StObject {
  
  /**
    * The name of the Global datastore
    */
  var GlobalReplicationGroupId: String
  
  /**
    * The name of the secondary cluster you wish to remove from the Global datastore
    */
  var ReplicationGroupId: String
  
  /**
    * The Amazon region of secondary cluster you wish to remove from the Global datastore
    */
  var ReplicationGroupRegion: String
}
object DisassociateGlobalReplicationGroupMessage {
  
  inline def apply(GlobalReplicationGroupId: String, ReplicationGroupId: String, ReplicationGroupRegion: String): DisassociateGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(GlobalReplicationGroupId = GlobalReplicationGroupId.asInstanceOf[js.Any], ReplicationGroupId = ReplicationGroupId.asInstanceOf[js.Any], ReplicationGroupRegion = ReplicationGroupRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateGlobalReplicationGroupMessage]
  }
  
  extension [Self <: DisassociateGlobalReplicationGroupMessage](x: Self) {
    
    inline def setGlobalReplicationGroupId(value: String): Self = StObject.set(x, "GlobalReplicationGroupId", value.asInstanceOf[js.Any])
    
    inline def setReplicationGroupId(value: String): Self = StObject.set(x, "ReplicationGroupId", value.asInstanceOf[js.Any])
    
    inline def setReplicationGroupRegion(value: String): Self = StObject.set(x, "ReplicationGroupRegion", value.asInstanceOf[js.Any])
  }
}
