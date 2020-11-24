package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalReplicationGroupMember extends js.Object {
  
  /**
    * Indicates whether automatic failover is enabled for the replication group.
    */
  var AutomaticFailover: js.UndefOr[AutomaticFailoverStatus] = js.native
  
  /**
    * The replication group id of the Global Datastore member.
    */
  var ReplicationGroupId: js.UndefOr[String] = js.native
  
  /**
    * The AWS region of the Global Datastore member.
    */
  var ReplicationGroupRegion: js.UndefOr[String] = js.native
  
  /**
    * Indicates the role of the replication group, primary or secondary.
    */
  var Role: js.UndefOr[String] = js.native
  
  /**
    * The status of the membership of the replication group.
    */
  var Status: js.UndefOr[String] = js.native
}
object GlobalReplicationGroupMember {
  
  @scala.inline
  def apply(): GlobalReplicationGroupMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalReplicationGroupMember]
  }
  
  @scala.inline
  implicit class GlobalReplicationGroupMemberOps[Self <: GlobalReplicationGroupMember] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutomaticFailover(value: AutomaticFailoverStatus): Self = this.set("AutomaticFailover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomaticFailover: Self = this.set("AutomaticFailover", js.undefined)
    
    @scala.inline
    def setReplicationGroupId(value: String): Self = this.set("ReplicationGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationGroupId: Self = this.set("ReplicationGroupId", js.undefined)
    
    @scala.inline
    def setReplicationGroupRegion(value: String): Self = this.set("ReplicationGroupRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationGroupRegion: Self = this.set("ReplicationGroupRegion", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("Role", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
