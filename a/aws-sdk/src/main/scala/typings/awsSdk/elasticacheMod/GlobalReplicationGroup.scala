package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalReplicationGroup extends js.Object {
  
  /**
    * The ARN (Amazon Resource Name) of the global replication group.
    */
  var ARN: js.UndefOr[String] = js.native
  
  /**
    * A flag that enables encryption at rest when set to true. You cannot modify the value of AtRestEncryptionEnabled after the replication group is created. To enable encryption at rest on a replication group you must set AtRestEncryptionEnabled to true when you create the replication group.   Required: Only available when creating a replication group in an Amazon VPC using redis version 3.2.6, 4.x or later.
    */
  var AtRestEncryptionEnabled: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * A flag that enables using an AuthToken (password) when issuing Redis commands. Default: false 
    */
  var AuthTokenEnabled: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The cache node type of the Global Datastore
    */
  var CacheNodeType: js.UndefOr[String] = js.native
  
  /**
    * A flag that indicates whether the Global Datastore is cluster enabled.
    */
  var ClusterEnabled: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The Elasticache engine. For Redis only.
    */
  var Engine: js.UndefOr[String] = js.native
  
  /**
    * The Elasticache Redis engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  
  /**
    * Indicates the slot configuration and global identifier for each slice group.
    */
  var GlobalNodeGroups: js.UndefOr[GlobalNodeGroupList] = js.native
  
  /**
    * The optional description of the Global Datastore
    */
  var GlobalReplicationGroupDescription: js.UndefOr[String] = js.native
  
  /**
    * The name of the Global Datastore
    */
  var GlobalReplicationGroupId: js.UndefOr[String] = js.native
  
  /**
    * The replication groups that comprise the Global Datastore.
    */
  var Members: js.UndefOr[GlobalReplicationGroupMemberList] = js.native
  
  /**
    * The status of the Global Datastore
    */
  var Status: js.UndefOr[String] = js.native
  
  /**
    * A flag that enables in-transit encryption when set to true. You cannot modify the value of TransitEncryptionEnabled after the cluster is created. To enable in-transit encryption on a cluster you must set TransitEncryptionEnabled to true when you create a cluster. 
    */
  var TransitEncryptionEnabled: js.UndefOr[BooleanOptional] = js.native
}
object GlobalReplicationGroup {
  
  @scala.inline
  def apply(): GlobalReplicationGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalReplicationGroup]
  }
  
  @scala.inline
  implicit class GlobalReplicationGroupOps[Self <: GlobalReplicationGroup] (val x: Self) extends AnyVal {
    
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
    def setARN(value: String): Self = this.set("ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteARN: Self = this.set("ARN", js.undefined)
    
    @scala.inline
    def setAtRestEncryptionEnabled(value: BooleanOptional): Self = this.set("AtRestEncryptionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAtRestEncryptionEnabled: Self = this.set("AtRestEncryptionEnabled", js.undefined)
    
    @scala.inline
    def setAuthTokenEnabled(value: BooleanOptional): Self = this.set("AuthTokenEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthTokenEnabled: Self = this.set("AuthTokenEnabled", js.undefined)
    
    @scala.inline
    def setCacheNodeType(value: String): Self = this.set("CacheNodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheNodeType: Self = this.set("CacheNodeType", js.undefined)
    
    @scala.inline
    def setClusterEnabled(value: BooleanOptional): Self = this.set("ClusterEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterEnabled: Self = this.set("ClusterEnabled", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = this.set("Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("Engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    
    @scala.inline
    def setGlobalNodeGroupsVarargs(value: GlobalNodeGroup*): Self = this.set("GlobalNodeGroups", js.Array(value :_*))
    
    @scala.inline
    def setGlobalNodeGroups(value: GlobalNodeGroupList): Self = this.set("GlobalNodeGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalNodeGroups: Self = this.set("GlobalNodeGroups", js.undefined)
    
    @scala.inline
    def setGlobalReplicationGroupDescription(value: String): Self = this.set("GlobalReplicationGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalReplicationGroupDescription: Self = this.set("GlobalReplicationGroupDescription", js.undefined)
    
    @scala.inline
    def setGlobalReplicationGroupId(value: String): Self = this.set("GlobalReplicationGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalReplicationGroupId: Self = this.set("GlobalReplicationGroupId", js.undefined)
    
    @scala.inline
    def setMembersVarargs(value: GlobalReplicationGroupMember*): Self = this.set("Members", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: GlobalReplicationGroupMemberList): Self = this.set("Members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembers: Self = this.set("Members", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTransitEncryptionEnabled(value: BooleanOptional): Self = this.set("TransitEncryptionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitEncryptionEnabled: Self = this.set("TransitEncryptionEnabled", js.undefined)
  }
}
