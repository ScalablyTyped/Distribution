package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterSnapshot extends js.Object {
  /**
    * Specifies the allocated storage size in gibibytes (GiB).
    */
  var AllocatedStorage: js.UndefOr[Integer] = js.native
  /**
    * Provides the list of Availability Zones (AZs) where instances in the DB cluster snapshot can be restored.
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.rdsMod.AvailabilityZones] = js.native
  /**
    * Specifies the time when the DB cluster was created, in Universal Coordinated Time (UTC).
    */
  var ClusterCreateTime: js.UndefOr[TStamp] = js.native
  /**
    * Specifies the DB cluster identifier of the DB cluster that this DB cluster snapshot was created from.
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the DB cluster snapshot.
    */
  var DBClusterSnapshotArn: js.UndefOr[String] = js.native
  /**
    * Specifies the identifier for the DB cluster snapshot.
    */
  var DBClusterSnapshotIdentifier: js.UndefOr[String] = js.native
  /**
    * Specifies the name of the database engine.
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * Provides the version of the database engine for this DB cluster snapshot.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and otherwise false.
    */
  var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * If StorageEncrypted is true, the AWS KMS key identifier for the encrypted DB cluster snapshot.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * Provides the license model information for this DB cluster snapshot.
    */
  var LicenseModel: js.UndefOr[String] = js.native
  /**
    * Provides the master username for the DB cluster snapshot.
    */
  var MasterUsername: js.UndefOr[String] = js.native
  /**
    * Specifies the percentage of the estimated data that has been transferred.
    */
  var PercentProgress: js.UndefOr[Integer] = js.native
  /**
    * Specifies the port that the DB cluster was listening on at the time of the snapshot.
    */
  var Port: js.UndefOr[Integer] = js.native
  /**
    * Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
    */
  var SnapshotCreateTime: js.UndefOr[TStamp] = js.native
  /**
    * Provides the type of the DB cluster snapshot.
    */
  var SnapshotType: js.UndefOr[String] = js.native
  /**
    * If the DB cluster snapshot was copied from a source DB cluster snapshot, the Amazon Resource Name (ARN) for the source DB cluster snapshot, otherwise, a null value.
    */
  var SourceDBClusterSnapshotArn: js.UndefOr[String] = js.native
  /**
    * Specifies the status of this DB cluster snapshot.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * Specifies whether the DB cluster snapshot is encrypted.
    */
  var StorageEncrypted: js.UndefOr[Boolean] = js.native
  /**
    * Provides the VPC ID associated with the DB cluster snapshot.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object DBClusterSnapshot {
  @scala.inline
  def apply(
    AllocatedStorage: Int | scala.Double = null,
    AvailabilityZones: AvailabilityZones = null,
    ClusterCreateTime: TStamp = null,
    DBClusterIdentifier: String = null,
    DBClusterSnapshotArn: String = null,
    DBClusterSnapshotIdentifier: String = null,
    Engine: String = null,
    EngineVersion: String = null,
    IAMDatabaseAuthenticationEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    KmsKeyId: String = null,
    LicenseModel: String = null,
    MasterUsername: String = null,
    PercentProgress: Int | scala.Double = null,
    Port: Int | scala.Double = null,
    SnapshotCreateTime: TStamp = null,
    SnapshotType: String = null,
    SourceDBClusterSnapshotArn: String = null,
    Status: String = null,
    StorageEncrypted: js.UndefOr[scala.Boolean] = js.undefined,
    VpcId: String = null
  ): DBClusterSnapshot = {
    val __obj = js.Dynamic.literal()
    if (AllocatedStorage != null) __obj.updateDynamic("AllocatedStorage")(AllocatedStorage.asInstanceOf[js.Any])
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    if (ClusterCreateTime != null) __obj.updateDynamic("ClusterCreateTime")(ClusterCreateTime.asInstanceOf[js.Any])
    if (DBClusterIdentifier != null) __obj.updateDynamic("DBClusterIdentifier")(DBClusterIdentifier.asInstanceOf[js.Any])
    if (DBClusterSnapshotArn != null) __obj.updateDynamic("DBClusterSnapshotArn")(DBClusterSnapshotArn.asInstanceOf[js.Any])
    if (DBClusterSnapshotIdentifier != null) __obj.updateDynamic("DBClusterSnapshotIdentifier")(DBClusterSnapshotIdentifier.asInstanceOf[js.Any])
    if (Engine != null) __obj.updateDynamic("Engine")(Engine.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(IAMDatabaseAuthenticationEnabled)) __obj.updateDynamic("IAMDatabaseAuthenticationEnabled")(IAMDatabaseAuthenticationEnabled.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (LicenseModel != null) __obj.updateDynamic("LicenseModel")(LicenseModel.asInstanceOf[js.Any])
    if (MasterUsername != null) __obj.updateDynamic("MasterUsername")(MasterUsername.asInstanceOf[js.Any])
    if (PercentProgress != null) __obj.updateDynamic("PercentProgress")(PercentProgress.asInstanceOf[js.Any])
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (SnapshotCreateTime != null) __obj.updateDynamic("SnapshotCreateTime")(SnapshotCreateTime.asInstanceOf[js.Any])
    if (SnapshotType != null) __obj.updateDynamic("SnapshotType")(SnapshotType.asInstanceOf[js.Any])
    if (SourceDBClusterSnapshotArn != null) __obj.updateDynamic("SourceDBClusterSnapshotArn")(SourceDBClusterSnapshotArn.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (!js.isUndefined(StorageEncrypted)) __obj.updateDynamic("StorageEncrypted")(StorageEncrypted.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBClusterSnapshot]
  }
}

