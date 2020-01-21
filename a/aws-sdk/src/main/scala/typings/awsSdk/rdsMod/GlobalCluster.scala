package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalCluster extends js.Object {
  /**
    *  The default database name within the new global database cluster. 
    */
  var DatabaseName: js.UndefOr[String] = js.native
  /**
    *  The deletion protection setting for the new global database cluster. 
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.native
  /**
    *  The Aurora database engine used by the global database cluster. 
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * Indicates the database engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the global database cluster.
    */
  var GlobalClusterArn: js.UndefOr[String] = js.native
  /**
    *  Contains a user-supplied global database cluster identifier. This identifier is the unique key that identifies a global database cluster. 
    */
  var GlobalClusterIdentifier: js.UndefOr[String] = js.native
  /**
    *  The list of cluster IDs for secondary clusters within the global database cluster. Currently limited to 1 item. 
    */
  var GlobalClusterMembers: js.UndefOr[GlobalClusterMemberList] = js.native
  /**
    *  The AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed. 
    */
  var GlobalClusterResourceId: js.UndefOr[String] = js.native
  /**
    * Specifies the current state of this global database cluster.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    *  The storage encryption setting for the global database cluster. 
    */
  var StorageEncrypted: js.UndefOr[BooleanOptional] = js.native
}

object GlobalCluster {
  @scala.inline
  def apply(
    DatabaseName: String = null,
    DeletionProtection: js.UndefOr[scala.Boolean] = js.undefined,
    Engine: String = null,
    EngineVersion: String = null,
    GlobalClusterArn: String = null,
    GlobalClusterIdentifier: String = null,
    GlobalClusterMembers: GlobalClusterMemberList = null,
    GlobalClusterResourceId: String = null,
    Status: String = null,
    StorageEncrypted: js.UndefOr[scala.Boolean] = js.undefined
  ): GlobalCluster = {
    val __obj = js.Dynamic.literal()
    if (DatabaseName != null) __obj.updateDynamic("DatabaseName")(DatabaseName.asInstanceOf[js.Any])
    if (!js.isUndefined(DeletionProtection)) __obj.updateDynamic("DeletionProtection")(DeletionProtection.asInstanceOf[js.Any])
    if (Engine != null) __obj.updateDynamic("Engine")(Engine.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (GlobalClusterArn != null) __obj.updateDynamic("GlobalClusterArn")(GlobalClusterArn.asInstanceOf[js.Any])
    if (GlobalClusterIdentifier != null) __obj.updateDynamic("GlobalClusterIdentifier")(GlobalClusterIdentifier.asInstanceOf[js.Any])
    if (GlobalClusterMembers != null) __obj.updateDynamic("GlobalClusterMembers")(GlobalClusterMembers.asInstanceOf[js.Any])
    if (GlobalClusterResourceId != null) __obj.updateDynamic("GlobalClusterResourceId")(GlobalClusterResourceId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (!js.isUndefined(StorageEncrypted)) __obj.updateDynamic("StorageEncrypted")(StorageEncrypted.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalCluster]
  }
}

