package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Snapshot extends js.Object {
  /**
    * A list of the AWS customer accounts authorized to restore the snapshot. Returns null if no accounts are authorized. Visible only to the snapshot owner. 
    */
  var AccountsWithRestoreAccess: js.UndefOr[AccountsWithRestoreAccessList] = js.native
  /**
    * The size of the incremental backup.
    */
  var ActualIncrementalBackupSizeInMegaBytes: js.UndefOr[Double] = js.native
  /**
    * The Availability Zone in which the cluster was created.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The number of megabytes that have been transferred to the snapshot backup.
    */
  var BackupProgressInMegaBytes: js.UndefOr[Double] = js.native
  /**
    * The time (UTC) when the cluster was originally created.
    */
  var ClusterCreateTime: js.UndefOr[TStamp] = js.native
  /**
    * The identifier of the cluster for which the snapshot was taken.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * The version ID of the Amazon Redshift engine that is running on the cluster.
    */
  var ClusterVersion: js.UndefOr[String] = js.native
  /**
    * The number of megabytes per second being transferred to the snapshot backup. Returns 0 for a completed backup. 
    */
  var CurrentBackupRateInMegaBytesPerSecond: js.UndefOr[Double] = js.native
  /**
    * The name of the database that was created when the cluster was created.
    */
  var DBName: js.UndefOr[String] = js.native
  /**
    * The amount of time an in-progress snapshot backup has been running, or the amount of time it took a completed backup to finish.
    */
  var ElapsedTimeInSeconds: js.UndefOr[Long] = js.native
  /**
    * If true, the data in the snapshot is encrypted at rest.
    */
  var Encrypted: js.UndefOr[Boolean] = js.native
  /**
    * A boolean that indicates whether the snapshot data is encrypted using the HSM keys of the source cluster. true indicates that the data is encrypted using HSM keys.
    */
  var EncryptedWithHSM: js.UndefOr[Boolean] = js.native
  /**
    * An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see Enhanced VPC Routing in the Amazon Redshift Cluster Management Guide. If this option is true, enhanced VPC routing is enabled.  Default: false
    */
  var EnhancedVpcRouting: js.UndefOr[Boolean] = js.native
  /**
    * The estimate of the time remaining before the snapshot backup will complete. Returns 0 for a completed backup. 
    */
  var EstimatedSecondsToCompletion: js.UndefOr[Long] = js.native
  /**
    * The AWS Key Management Service (KMS) key ID of the encryption key that was used to encrypt data in the cluster from which the snapshot was taken.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * The name of the maintenance track for the snapshot.
    */
  var MaintenanceTrackName: js.UndefOr[String] = js.native
  /**
    * The number of days until a manual snapshot will pass its retention period.
    */
  var ManualSnapshotRemainingDays: js.UndefOr[IntegerOptional] = js.native
  /**
    * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained indefinitely.  The value must be either -1 or an integer between 1 and 3,653.
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  /**
    * The master user name for the cluster.
    */
  var MasterUsername: js.UndefOr[String] = js.native
  /**
    * The node type of the nodes in the cluster.
    */
  var NodeType: js.UndefOr[String] = js.native
  /**
    * The number of nodes in the cluster.
    */
  var NumberOfNodes: js.UndefOr[Integer] = js.native
  /**
    * For manual snapshots, the AWS customer account used to create or copy the snapshot. For automatic snapshots, the owner of the cluster. The owner can perform all snapshot actions, such as sharing a manual snapshot.
    */
  var OwnerAccount: js.UndefOr[String] = js.native
  /**
    * The port that the cluster is listening on.
    */
  var Port: js.UndefOr[Integer] = js.native
  /**
    * The list of node types that this cluster snapshot is able to restore into.
    */
  var RestorableNodeTypes: js.UndefOr[RestorableNodeTypeList] = js.native
  /**
    * The time (in UTC format) when Amazon Redshift began the snapshot. A snapshot contains a copy of the cluster data as of this exact time.
    */
  var SnapshotCreateTime: js.UndefOr[TStamp] = js.native
  /**
    * The snapshot identifier that is provided in the request.
    */
  var SnapshotIdentifier: js.UndefOr[String] = js.native
  /**
    * A timestamp representing the start of the retention period for the snapshot.
    */
  var SnapshotRetentionStartTime: js.UndefOr[TStamp] = js.native
  /**
    * The snapshot type. Snapshots created using CreateClusterSnapshot and CopyClusterSnapshot are of type "manual". 
    */
  var SnapshotType: js.UndefOr[String] = js.native
  /**
    * The source region from which the snapshot was copied.
    */
  var SourceRegion: js.UndefOr[String] = js.native
  /**
    * The snapshot status. The value of the status depends on the API operation used:     CreateClusterSnapshot and CopyClusterSnapshot returns status as "creating".     DescribeClusterSnapshots returns status as "creating", "available", "final snapshot", or "failed".    DeleteClusterSnapshot returns status as "deleted".  
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The list of tags for the cluster snapshot.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The size of the complete set of backup data that would be used to restore the cluster.
    */
  var TotalBackupSizeInMegaBytes: js.UndefOr[Double] = js.native
  /**
    * The VPC identifier of the cluster if the snapshot is from a cluster in a VPC. Otherwise, this field is not in the output.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object Snapshot {
  @scala.inline
  def apply(
    AccountsWithRestoreAccess: AccountsWithRestoreAccessList = null,
    ActualIncrementalBackupSizeInMegaBytes: Int | scala.Double = null,
    AvailabilityZone: String = null,
    BackupProgressInMegaBytes: Int | scala.Double = null,
    ClusterCreateTime: TStamp = null,
    ClusterIdentifier: String = null,
    ClusterVersion: String = null,
    CurrentBackupRateInMegaBytesPerSecond: Int | scala.Double = null,
    DBName: String = null,
    ElapsedTimeInSeconds: Int | scala.Double = null,
    Encrypted: js.UndefOr[scala.Boolean] = js.undefined,
    EncryptedWithHSM: js.UndefOr[scala.Boolean] = js.undefined,
    EnhancedVpcRouting: js.UndefOr[scala.Boolean] = js.undefined,
    EstimatedSecondsToCompletion: Int | scala.Double = null,
    KmsKeyId: String = null,
    MaintenanceTrackName: String = null,
    ManualSnapshotRemainingDays: Int | scala.Double = null,
    ManualSnapshotRetentionPeriod: Int | scala.Double = null,
    MasterUsername: String = null,
    NodeType: String = null,
    NumberOfNodes: Int | scala.Double = null,
    OwnerAccount: String = null,
    Port: Int | scala.Double = null,
    RestorableNodeTypes: RestorableNodeTypeList = null,
    SnapshotCreateTime: TStamp = null,
    SnapshotIdentifier: String = null,
    SnapshotRetentionStartTime: TStamp = null,
    SnapshotType: String = null,
    SourceRegion: String = null,
    Status: String = null,
    Tags: TagList = null,
    TotalBackupSizeInMegaBytes: Int | scala.Double = null,
    VpcId: String = null
  ): Snapshot = {
    val __obj = js.Dynamic.literal()
    if (AccountsWithRestoreAccess != null) __obj.updateDynamic("AccountsWithRestoreAccess")(AccountsWithRestoreAccess.asInstanceOf[js.Any])
    if (ActualIncrementalBackupSizeInMegaBytes != null) __obj.updateDynamic("ActualIncrementalBackupSizeInMegaBytes")(ActualIncrementalBackupSizeInMegaBytes.asInstanceOf[js.Any])
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (BackupProgressInMegaBytes != null) __obj.updateDynamic("BackupProgressInMegaBytes")(BackupProgressInMegaBytes.asInstanceOf[js.Any])
    if (ClusterCreateTime != null) __obj.updateDynamic("ClusterCreateTime")(ClusterCreateTime.asInstanceOf[js.Any])
    if (ClusterIdentifier != null) __obj.updateDynamic("ClusterIdentifier")(ClusterIdentifier.asInstanceOf[js.Any])
    if (ClusterVersion != null) __obj.updateDynamic("ClusterVersion")(ClusterVersion.asInstanceOf[js.Any])
    if (CurrentBackupRateInMegaBytesPerSecond != null) __obj.updateDynamic("CurrentBackupRateInMegaBytesPerSecond")(CurrentBackupRateInMegaBytesPerSecond.asInstanceOf[js.Any])
    if (DBName != null) __obj.updateDynamic("DBName")(DBName.asInstanceOf[js.Any])
    if (ElapsedTimeInSeconds != null) __obj.updateDynamic("ElapsedTimeInSeconds")(ElapsedTimeInSeconds.asInstanceOf[js.Any])
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted.asInstanceOf[js.Any])
    if (!js.isUndefined(EncryptedWithHSM)) __obj.updateDynamic("EncryptedWithHSM")(EncryptedWithHSM.asInstanceOf[js.Any])
    if (!js.isUndefined(EnhancedVpcRouting)) __obj.updateDynamic("EnhancedVpcRouting")(EnhancedVpcRouting.asInstanceOf[js.Any])
    if (EstimatedSecondsToCompletion != null) __obj.updateDynamic("EstimatedSecondsToCompletion")(EstimatedSecondsToCompletion.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (MaintenanceTrackName != null) __obj.updateDynamic("MaintenanceTrackName")(MaintenanceTrackName.asInstanceOf[js.Any])
    if (ManualSnapshotRemainingDays != null) __obj.updateDynamic("ManualSnapshotRemainingDays")(ManualSnapshotRemainingDays.asInstanceOf[js.Any])
    if (ManualSnapshotRetentionPeriod != null) __obj.updateDynamic("ManualSnapshotRetentionPeriod")(ManualSnapshotRetentionPeriod.asInstanceOf[js.Any])
    if (MasterUsername != null) __obj.updateDynamic("MasterUsername")(MasterUsername.asInstanceOf[js.Any])
    if (NodeType != null) __obj.updateDynamic("NodeType")(NodeType.asInstanceOf[js.Any])
    if (NumberOfNodes != null) __obj.updateDynamic("NumberOfNodes")(NumberOfNodes.asInstanceOf[js.Any])
    if (OwnerAccount != null) __obj.updateDynamic("OwnerAccount")(OwnerAccount.asInstanceOf[js.Any])
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (RestorableNodeTypes != null) __obj.updateDynamic("RestorableNodeTypes")(RestorableNodeTypes.asInstanceOf[js.Any])
    if (SnapshotCreateTime != null) __obj.updateDynamic("SnapshotCreateTime")(SnapshotCreateTime.asInstanceOf[js.Any])
    if (SnapshotIdentifier != null) __obj.updateDynamic("SnapshotIdentifier")(SnapshotIdentifier.asInstanceOf[js.Any])
    if (SnapshotRetentionStartTime != null) __obj.updateDynamic("SnapshotRetentionStartTime")(SnapshotRetentionStartTime.asInstanceOf[js.Any])
    if (SnapshotType != null) __obj.updateDynamic("SnapshotType")(SnapshotType.asInstanceOf[js.Any])
    if (SourceRegion != null) __obj.updateDynamic("SourceRegion")(SourceRegion.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (TotalBackupSizeInMegaBytes != null) __obj.updateDynamic("TotalBackupSizeInMegaBytes")(TotalBackupSizeInMegaBytes.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Snapshot]
  }
}

