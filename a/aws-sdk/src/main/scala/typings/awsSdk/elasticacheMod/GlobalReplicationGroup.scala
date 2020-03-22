package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalReplicationGroup extends js.Object {
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
    * The Elasticache engine. For preview, it is Redis only.
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * The Elasticache Redis engine version. For preview, it is Redis version 5.0.5 only.
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
  def apply(
    AtRestEncryptionEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    AuthTokenEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    CacheNodeType: String = null,
    ClusterEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    Engine: String = null,
    EngineVersion: String = null,
    GlobalNodeGroups: GlobalNodeGroupList = null,
    GlobalReplicationGroupDescription: String = null,
    GlobalReplicationGroupId: String = null,
    Members: GlobalReplicationGroupMemberList = null,
    Status: String = null,
    TransitEncryptionEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): GlobalReplicationGroup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AtRestEncryptionEnabled)) __obj.updateDynamic("AtRestEncryptionEnabled")(AtRestEncryptionEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(AuthTokenEnabled)) __obj.updateDynamic("AuthTokenEnabled")(AuthTokenEnabled.asInstanceOf[js.Any])
    if (CacheNodeType != null) __obj.updateDynamic("CacheNodeType")(CacheNodeType.asInstanceOf[js.Any])
    if (!js.isUndefined(ClusterEnabled)) __obj.updateDynamic("ClusterEnabled")(ClusterEnabled.asInstanceOf[js.Any])
    if (Engine != null) __obj.updateDynamic("Engine")(Engine.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (GlobalNodeGroups != null) __obj.updateDynamic("GlobalNodeGroups")(GlobalNodeGroups.asInstanceOf[js.Any])
    if (GlobalReplicationGroupDescription != null) __obj.updateDynamic("GlobalReplicationGroupDescription")(GlobalReplicationGroupDescription.asInstanceOf[js.Any])
    if (GlobalReplicationGroupId != null) __obj.updateDynamic("GlobalReplicationGroupId")(GlobalReplicationGroupId.asInstanceOf[js.Any])
    if (Members != null) __obj.updateDynamic("Members")(Members.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (!js.isUndefined(TransitEncryptionEnabled)) __obj.updateDynamic("TransitEncryptionEnabled")(TransitEncryptionEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalReplicationGroup]
  }
}

