package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): Snapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Snapshot]
  }
  
  @scala.inline
  implicit class SnapshotOps[Self <: Snapshot] (val x: Self) extends AnyVal {
    
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
    def setAccountsWithRestoreAccessVarargs(value: AccountWithRestoreAccess*): Self = this.set("AccountsWithRestoreAccess", js.Array(value :_*))
    
    @scala.inline
    def setAccountsWithRestoreAccess(value: AccountsWithRestoreAccessList): Self = this.set("AccountsWithRestoreAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountsWithRestoreAccess: Self = this.set("AccountsWithRestoreAccess", js.undefined)
    
    @scala.inline
    def setActualIncrementalBackupSizeInMegaBytes(value: Double): Self = this.set("ActualIncrementalBackupSizeInMegaBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActualIncrementalBackupSizeInMegaBytes: Self = this.set("ActualIncrementalBackupSizeInMegaBytes", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    
    @scala.inline
    def setBackupProgressInMegaBytes(value: Double): Self = this.set("BackupProgressInMegaBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupProgressInMegaBytes: Self = this.set("BackupProgressInMegaBytes", js.undefined)
    
    @scala.inline
    def setClusterCreateTime(value: TStamp): Self = this.set("ClusterCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterCreateTime: Self = this.set("ClusterCreateTime", js.undefined)
    
    @scala.inline
    def setClusterIdentifier(value: String): Self = this.set("ClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterIdentifier: Self = this.set("ClusterIdentifier", js.undefined)
    
    @scala.inline
    def setClusterVersion(value: String): Self = this.set("ClusterVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterVersion: Self = this.set("ClusterVersion", js.undefined)
    
    @scala.inline
    def setCurrentBackupRateInMegaBytesPerSecond(value: Double): Self = this.set("CurrentBackupRateInMegaBytesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentBackupRateInMegaBytesPerSecond: Self = this.set("CurrentBackupRateInMegaBytesPerSecond", js.undefined)
    
    @scala.inline
    def setDBName(value: String): Self = this.set("DBName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBName: Self = this.set("DBName", js.undefined)
    
    @scala.inline
    def setElapsedTimeInSeconds(value: Long): Self = this.set("ElapsedTimeInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElapsedTimeInSeconds: Self = this.set("ElapsedTimeInSeconds", js.undefined)
    
    @scala.inline
    def setEncrypted(value: Boolean): Self = this.set("Encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncrypted: Self = this.set("Encrypted", js.undefined)
    
    @scala.inline
    def setEncryptedWithHSM(value: Boolean): Self = this.set("EncryptedWithHSM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptedWithHSM: Self = this.set("EncryptedWithHSM", js.undefined)
    
    @scala.inline
    def setEnhancedVpcRouting(value: Boolean): Self = this.set("EnhancedVpcRouting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnhancedVpcRouting: Self = this.set("EnhancedVpcRouting", js.undefined)
    
    @scala.inline
    def setEstimatedSecondsToCompletion(value: Long): Self = this.set("EstimatedSecondsToCompletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedSecondsToCompletion: Self = this.set("EstimatedSecondsToCompletion", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    
    @scala.inline
    def setMaintenanceTrackName(value: String): Self = this.set("MaintenanceTrackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaintenanceTrackName: Self = this.set("MaintenanceTrackName", js.undefined)
    
    @scala.inline
    def setManualSnapshotRemainingDays(value: IntegerOptional): Self = this.set("ManualSnapshotRemainingDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManualSnapshotRemainingDays: Self = this.set("ManualSnapshotRemainingDays", js.undefined)
    
    @scala.inline
    def setManualSnapshotRetentionPeriod(value: IntegerOptional): Self = this.set("ManualSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManualSnapshotRetentionPeriod: Self = this.set("ManualSnapshotRetentionPeriod", js.undefined)
    
    @scala.inline
    def setMasterUsername(value: String): Self = this.set("MasterUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterUsername: Self = this.set("MasterUsername", js.undefined)
    
    @scala.inline
    def setNodeType(value: String): Self = this.set("NodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeType: Self = this.set("NodeType", js.undefined)
    
    @scala.inline
    def setNumberOfNodes(value: Integer): Self = this.set("NumberOfNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfNodes: Self = this.set("NumberOfNodes", js.undefined)
    
    @scala.inline
    def setOwnerAccount(value: String): Self = this.set("OwnerAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerAccount: Self = this.set("OwnerAccount", js.undefined)
    
    @scala.inline
    def setPort(value: Integer): Self = this.set("Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    
    @scala.inline
    def setRestorableNodeTypesVarargs(value: String*): Self = this.set("RestorableNodeTypes", js.Array(value :_*))
    
    @scala.inline
    def setRestorableNodeTypes(value: RestorableNodeTypeList): Self = this.set("RestorableNodeTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestorableNodeTypes: Self = this.set("RestorableNodeTypes", js.undefined)
    
    @scala.inline
    def setSnapshotCreateTime(value: TStamp): Self = this.set("SnapshotCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotCreateTime: Self = this.set("SnapshotCreateTime", js.undefined)
    
    @scala.inline
    def setSnapshotIdentifier(value: String): Self = this.set("SnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotIdentifier: Self = this.set("SnapshotIdentifier", js.undefined)
    
    @scala.inline
    def setSnapshotRetentionStartTime(value: TStamp): Self = this.set("SnapshotRetentionStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotRetentionStartTime: Self = this.set("SnapshotRetentionStartTime", js.undefined)
    
    @scala.inline
    def setSnapshotType(value: String): Self = this.set("SnapshotType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotType: Self = this.set("SnapshotType", js.undefined)
    
    @scala.inline
    def setSourceRegion(value: String): Self = this.set("SourceRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceRegion: Self = this.set("SourceRegion", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setTotalBackupSizeInMegaBytes(value: Double): Self = this.set("TotalBackupSizeInMegaBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalBackupSizeInMegaBytes: Self = this.set("TotalBackupSizeInMegaBytes", js.undefined)
    
    @scala.inline
    def setVpcId(value: String): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
}
