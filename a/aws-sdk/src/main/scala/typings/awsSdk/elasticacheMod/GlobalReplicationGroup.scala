package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalReplicationGroup extends StObject {
  
  /**
    * The ARN (Amazon Resource Name) of the global replication group.
    */
  var ARN: js.UndefOr[String] = js.undefined
  
  /**
    * A flag that enables encryption at rest when set to true. You cannot modify the value of AtRestEncryptionEnabled after the replication group is created. To enable encryption at rest on a replication group you must set AtRestEncryptionEnabled to true when you create the replication group.   Required: Only available when creating a replication group in an Amazon VPC using redis version 3.2.6, 4.x or later.
    */
  var AtRestEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A flag that enables using an AuthToken (password) when issuing Redis commands. Default: false 
    */
  var AuthTokenEnabled: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The cache node type of the Global datastore
    */
  var CacheNodeType: js.UndefOr[String] = js.undefined
  
  /**
    * A flag that indicates whether the Global datastore is cluster enabled.
    */
  var ClusterEnabled: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The Elasticache engine. For Redis only.
    */
  var Engine: js.UndefOr[String] = js.undefined
  
  /**
    * The Elasticache Redis engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the slot configuration and global identifier for each slice group.
    */
  var GlobalNodeGroups: js.UndefOr[GlobalNodeGroupList] = js.undefined
  
  /**
    * The optional description of the Global datastore
    */
  var GlobalReplicationGroupDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Global datastore
    */
  var GlobalReplicationGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The replication groups that comprise the Global datastore.
    */
  var Members: js.UndefOr[GlobalReplicationGroupMemberList] = js.undefined
  
  /**
    * The status of the Global datastore
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * A flag that enables in-transit encryption when set to true. You cannot modify the value of TransitEncryptionEnabled after the cluster is created. To enable in-transit encryption on a cluster you must set TransitEncryptionEnabled to true when you create a cluster.   Required: Only available when creating a replication group in an Amazon VPC using redis version 3.2.6, 4.x or later.
    */
  var TransitEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined
}
object GlobalReplicationGroup {
  
  inline def apply(): GlobalReplicationGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalReplicationGroup]
  }
  
  extension [Self <: GlobalReplicationGroup](x: Self) {
    
    inline def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setAtRestEncryptionEnabled(value: BooleanOptional): Self = StObject.set(x, "AtRestEncryptionEnabled", value.asInstanceOf[js.Any])
    
    inline def setAtRestEncryptionEnabledUndefined: Self = StObject.set(x, "AtRestEncryptionEnabled", js.undefined)
    
    inline def setAuthTokenEnabled(value: BooleanOptional): Self = StObject.set(x, "AuthTokenEnabled", value.asInstanceOf[js.Any])
    
    inline def setAuthTokenEnabledUndefined: Self = StObject.set(x, "AuthTokenEnabled", js.undefined)
    
    inline def setCacheNodeType(value: String): Self = StObject.set(x, "CacheNodeType", value.asInstanceOf[js.Any])
    
    inline def setCacheNodeTypeUndefined: Self = StObject.set(x, "CacheNodeType", js.undefined)
    
    inline def setClusterEnabled(value: BooleanOptional): Self = StObject.set(x, "ClusterEnabled", value.asInstanceOf[js.Any])
    
    inline def setClusterEnabledUndefined: Self = StObject.set(x, "ClusterEnabled", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setGlobalNodeGroups(value: GlobalNodeGroupList): Self = StObject.set(x, "GlobalNodeGroups", value.asInstanceOf[js.Any])
    
    inline def setGlobalNodeGroupsUndefined: Self = StObject.set(x, "GlobalNodeGroups", js.undefined)
    
    inline def setGlobalNodeGroupsVarargs(value: GlobalNodeGroup*): Self = StObject.set(x, "GlobalNodeGroups", js.Array(value*))
    
    inline def setGlobalReplicationGroupDescription(value: String): Self = StObject.set(x, "GlobalReplicationGroupDescription", value.asInstanceOf[js.Any])
    
    inline def setGlobalReplicationGroupDescriptionUndefined: Self = StObject.set(x, "GlobalReplicationGroupDescription", js.undefined)
    
    inline def setGlobalReplicationGroupId(value: String): Self = StObject.set(x, "GlobalReplicationGroupId", value.asInstanceOf[js.Any])
    
    inline def setGlobalReplicationGroupIdUndefined: Self = StObject.set(x, "GlobalReplicationGroupId", js.undefined)
    
    inline def setMembers(value: GlobalReplicationGroupMemberList): Self = StObject.set(x, "Members", value.asInstanceOf[js.Any])
    
    inline def setMembersUndefined: Self = StObject.set(x, "Members", js.undefined)
    
    inline def setMembersVarargs(value: GlobalReplicationGroupMember*): Self = StObject.set(x, "Members", js.Array(value*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTransitEncryptionEnabled(value: BooleanOptional): Self = StObject.set(x, "TransitEncryptionEnabled", value.asInstanceOf[js.Any])
    
    inline def setTransitEncryptionEnabledUndefined: Self = StObject.set(x, "TransitEncryptionEnabled", js.undefined)
  }
}
