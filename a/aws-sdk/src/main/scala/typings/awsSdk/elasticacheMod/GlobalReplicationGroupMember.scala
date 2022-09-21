package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalReplicationGroupMember extends StObject {
  
  /**
    * Indicates whether automatic failover is enabled for the replication group.
    */
  var AutomaticFailover: js.UndefOr[AutomaticFailoverStatus] = js.undefined
  
  /**
    * The replication group id of the Global datastore member.
    */
  var ReplicationGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon region of the Global datastore member.
    */
  var ReplicationGroupRegion: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the role of the replication group, primary or secondary.
    */
  var Role: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the membership of the replication group.
    */
  var Status: js.UndefOr[String] = js.undefined
}
object GlobalReplicationGroupMember {
  
  inline def apply(): GlobalReplicationGroupMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalReplicationGroupMember]
  }
  
  extension [Self <: GlobalReplicationGroupMember](x: Self) {
    
    inline def setAutomaticFailover(value: AutomaticFailoverStatus): Self = StObject.set(x, "AutomaticFailover", value.asInstanceOf[js.Any])
    
    inline def setAutomaticFailoverUndefined: Self = StObject.set(x, "AutomaticFailover", js.undefined)
    
    inline def setReplicationGroupId(value: String): Self = StObject.set(x, "ReplicationGroupId", value.asInstanceOf[js.Any])
    
    inline def setReplicationGroupIdUndefined: Self = StObject.set(x, "ReplicationGroupId", js.undefined)
    
    inline def setReplicationGroupRegion(value: String): Self = StObject.set(x, "ReplicationGroupRegion", value.asInstanceOf[js.Any])
    
    inline def setReplicationGroupRegionUndefined: Self = StObject.set(x, "ReplicationGroupRegion", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
