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
    * The replication group id of the Global Datastore member.
    */
  var ReplicationGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The AWS region of the Global Datastore member.
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
  
  @scala.inline
  def apply(): GlobalReplicationGroupMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalReplicationGroupMember]
  }
  
  @scala.inline
  implicit class GlobalReplicationGroupMemberMutableBuilder[Self <: GlobalReplicationGroupMember] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomaticFailover(value: AutomaticFailoverStatus): Self = StObject.set(x, "AutomaticFailover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticFailoverUndefined: Self = StObject.set(x, "AutomaticFailover", js.undefined)
    
    @scala.inline
    def setReplicationGroupId(value: String): Self = StObject.set(x, "ReplicationGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationGroupIdUndefined: Self = StObject.set(x, "ReplicationGroupId", js.undefined)
    
    @scala.inline
    def setReplicationGroupRegion(value: String): Self = StObject.set(x, "ReplicationGroupRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationGroupRegionUndefined: Self = StObject.set(x, "ReplicationGroupRegion", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
