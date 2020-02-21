package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterSnapshot extends js.Object {
  /**
    * Provides the list of Amazon EC2 Availability Zones that instances in the cluster snapshot can be restored in.
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.docdbMod.AvailabilityZones] = js.native
  /**
    * Specifies the time when the cluster was created, in Universal Coordinated Time (UTC).
    */
  var ClusterCreateTime: js.UndefOr[TStamp] = js.native
  /**
    * Specifies the cluster identifier of the cluster that this cluster snapshot was created from.
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the cluster snapshot.
    */
  var DBClusterSnapshotArn: js.UndefOr[String] = js.native
  /**
    * Specifies the identifier for the cluster snapshot.
    */
  var DBClusterSnapshotIdentifier: js.UndefOr[String] = js.native
  /**
    * Specifies the name of the database engine.
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * Provides the version of the database engine for this cluster snapshot.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * If StorageEncrypted is true, the AWS KMS key identifier for the encrypted cluster snapshot.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * Provides the master user name for the cluster snapshot.
    */
  var MasterUsername: js.UndefOr[String] = js.native
  /**
    * Specifies the percentage of the estimated data that has been transferred.
    */
  var PercentProgress: js.UndefOr[Integer] = js.native
  /**
    * Specifies the port that the cluster was listening on at the time of the snapshot.
    */
  var Port: js.UndefOr[Integer] = js.native
  /**
    * Provides the time when the snapshot was taken, in UTC.
    */
  var SnapshotCreateTime: js.UndefOr[TStamp] = js.native
  /**
    * Provides the type of the cluster snapshot.
    */
  var SnapshotType: js.UndefOr[String] = js.native
  /**
    * If the cluster snapshot was copied from a source cluster snapshot, the ARN for the source cluster snapshot; otherwise, a null value.
    */
  var SourceDBClusterSnapshotArn: js.UndefOr[String] = js.native
  /**
    * Specifies the status of this cluster snapshot.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * Specifies whether the cluster snapshot is encrypted.
    */
  var StorageEncrypted: js.UndefOr[Boolean] = js.native
  /**
    * Provides the virtual private cloud (VPC) ID that is associated with the cluster snapshot.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object DBClusterSnapshot {
  @scala.inline
  def apply(
    AvailabilityZones: AvailabilityZones = null,
    ClusterCreateTime: TStamp = null,
    DBClusterIdentifier: String = null,
    DBClusterSnapshotArn: String = null,
    DBClusterSnapshotIdentifier: String = null,
    Engine: String = null,
    EngineVersion: String = null,
    KmsKeyId: String = null,
    MasterUsername: String = null,
    PercentProgress: Int | Double = null,
    Port: Int | Double = null,
    SnapshotCreateTime: TStamp = null,
    SnapshotType: String = null,
    SourceDBClusterSnapshotArn: String = null,
    Status: String = null,
    StorageEncrypted: js.UndefOr[scala.Boolean] = js.undefined,
    VpcId: String = null
  ): DBClusterSnapshot = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    if (ClusterCreateTime != null) __obj.updateDynamic("ClusterCreateTime")(ClusterCreateTime.asInstanceOf[js.Any])
    if (DBClusterIdentifier != null) __obj.updateDynamic("DBClusterIdentifier")(DBClusterIdentifier.asInstanceOf[js.Any])
    if (DBClusterSnapshotArn != null) __obj.updateDynamic("DBClusterSnapshotArn")(DBClusterSnapshotArn.asInstanceOf[js.Any])
    if (DBClusterSnapshotIdentifier != null) __obj.updateDynamic("DBClusterSnapshotIdentifier")(DBClusterSnapshotIdentifier.asInstanceOf[js.Any])
    if (Engine != null) __obj.updateDynamic("Engine")(Engine.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
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

