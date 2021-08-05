package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Snapshot extends StObject {
  
  /**
    * A list of the AWS customer accounts authorized to restore the snapshot. Returns null if no accounts are authorized. Visible only to the snapshot owner. 
    */
  var AccountsWithRestoreAccess: js.UndefOr[AccountsWithRestoreAccessList] = js.undefined
  
  /**
    * The size of the incremental backup.
    */
  var ActualIncrementalBackupSizeInMegaBytes: js.UndefOr[Double] = js.undefined
  
  /**
    * The Availability Zone in which the cluster was created.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The number of megabytes that have been transferred to the snapshot backup.
    */
  var BackupProgressInMegaBytes: js.UndefOr[Double] = js.undefined
  
  /**
    * The time (UTC) when the cluster was originally created.
    */
  var ClusterCreateTime: js.UndefOr[TStamp] = js.undefined
  
  /**
    * The identifier of the cluster for which the snapshot was taken.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The version ID of the Amazon Redshift engine that is running on the cluster.
    */
  var ClusterVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The number of megabytes per second being transferred to the snapshot backup. Returns 0 for a completed backup. 
    */
  var CurrentBackupRateInMegaBytesPerSecond: js.UndefOr[Double] = js.undefined
  
  /**
    * The name of the database that was created when the cluster was created.
    */
  var DBName: js.UndefOr[String] = js.undefined
  
  /**
    * The amount of time an in-progress snapshot backup has been running, or the amount of time it took a completed backup to finish.
    */
  var ElapsedTimeInSeconds: js.UndefOr[Long] = js.undefined
  
  /**
    * If true, the data in the snapshot is encrypted at rest.
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean that indicates whether the snapshot data is encrypted using the HSM keys of the source cluster. true indicates that the data is encrypted using HSM keys.
    */
  var EncryptedWithHSM: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see Enhanced VPC Routing in the Amazon Redshift Cluster Management Guide. If this option is true, enhanced VPC routing is enabled.  Default: false
    */
  var EnhancedVpcRouting: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The estimate of the time remaining before the snapshot backup will complete. Returns 0 for a completed backup. 
    */
  var EstimatedSecondsToCompletion: js.UndefOr[Long] = js.undefined
  
  /**
    * The AWS Key Management Service (KMS) key ID of the encryption key that was used to encrypt data in the cluster from which the snapshot was taken.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the maintenance track for the snapshot.
    */
  var MaintenanceTrackName: js.UndefOr[String] = js.undefined
  
  /**
    * The number of days until a manual snapshot will pass its retention period.
    */
  var ManualSnapshotRemainingDays: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained indefinitely.  The value must be either -1 or an integer between 1 and 3,653.
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The master user name for the cluster.
    */
  var MasterUsername: js.UndefOr[String] = js.undefined
  
  /**
    * The node type of the nodes in the cluster.
    */
  var NodeType: js.UndefOr[String] = js.undefined
  
  /**
    * The number of nodes in the cluster.
    */
  var NumberOfNodes: js.UndefOr[Integer] = js.undefined
  
  /**
    * For manual snapshots, the AWS customer account used to create or copy the snapshot. For automatic snapshots, the owner of the cluster. The owner can perform all snapshot actions, such as sharing a manual snapshot.
    */
  var OwnerAccount: js.UndefOr[String] = js.undefined
  
  /**
    * The port that the cluster is listening on.
    */
  var Port: js.UndefOr[Integer] = js.undefined
  
  /**
    * The list of node types that this cluster snapshot is able to restore into.
    */
  var RestorableNodeTypes: js.UndefOr[RestorableNodeTypeList] = js.undefined
  
  /**
    * The time (in UTC format) when Amazon Redshift began the snapshot. A snapshot contains a copy of the cluster data as of this exact time.
    */
  var SnapshotCreateTime: js.UndefOr[TStamp] = js.undefined
  
  /**
    * The snapshot identifier that is provided in the request.
    */
  var SnapshotIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * A timestamp representing the start of the retention period for the snapshot.
    */
  var SnapshotRetentionStartTime: js.UndefOr[TStamp] = js.undefined
  
  /**
    * The snapshot type. Snapshots created using CreateClusterSnapshot and CopyClusterSnapshot are of type "manual". 
    */
  var SnapshotType: js.UndefOr[String] = js.undefined
  
  /**
    * The source region from which the snapshot was copied.
    */
  var SourceRegion: js.UndefOr[String] = js.undefined
  
  /**
    * The snapshot status. The value of the status depends on the API operation used:     CreateClusterSnapshot and CopyClusterSnapshot returns status as "creating".     DescribeClusterSnapshots returns status as "creating", "available", "final snapshot", or "failed".    DeleteClusterSnapshot returns status as "deleted".  
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * The list of tags for the cluster snapshot.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The size of the complete set of backup data that would be used to restore the cluster.
    */
  var TotalBackupSizeInMegaBytes: js.UndefOr[Double] = js.undefined
  
  /**
    * The VPC identifier of the cluster if the snapshot is from a cluster in a VPC. Otherwise, this field is not in the output.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object Snapshot {
  
  inline def apply(): Snapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Snapshot]
  }
  
  extension [Self <: Snapshot](x: Self) {
    
    inline def setAccountsWithRestoreAccess(value: AccountsWithRestoreAccessList): Self = StObject.set(x, "AccountsWithRestoreAccess", value.asInstanceOf[js.Any])
    
    inline def setAccountsWithRestoreAccessUndefined: Self = StObject.set(x, "AccountsWithRestoreAccess", js.undefined)
    
    inline def setAccountsWithRestoreAccessVarargs(value: AccountWithRestoreAccess*): Self = StObject.set(x, "AccountsWithRestoreAccess", js.Array(value :_*))
    
    inline def setActualIncrementalBackupSizeInMegaBytes(value: Double): Self = StObject.set(x, "ActualIncrementalBackupSizeInMegaBytes", value.asInstanceOf[js.Any])
    
    inline def setActualIncrementalBackupSizeInMegaBytesUndefined: Self = StObject.set(x, "ActualIncrementalBackupSizeInMegaBytes", js.undefined)
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setBackupProgressInMegaBytes(value: Double): Self = StObject.set(x, "BackupProgressInMegaBytes", value.asInstanceOf[js.Any])
    
    inline def setBackupProgressInMegaBytesUndefined: Self = StObject.set(x, "BackupProgressInMegaBytes", js.undefined)
    
    inline def setClusterCreateTime(value: TStamp): Self = StObject.set(x, "ClusterCreateTime", value.asInstanceOf[js.Any])
    
    inline def setClusterCreateTimeUndefined: Self = StObject.set(x, "ClusterCreateTime", js.undefined)
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setClusterIdentifierUndefined: Self = StObject.set(x, "ClusterIdentifier", js.undefined)
    
    inline def setClusterVersion(value: String): Self = StObject.set(x, "ClusterVersion", value.asInstanceOf[js.Any])
    
    inline def setClusterVersionUndefined: Self = StObject.set(x, "ClusterVersion", js.undefined)
    
    inline def setCurrentBackupRateInMegaBytesPerSecond(value: Double): Self = StObject.set(x, "CurrentBackupRateInMegaBytesPerSecond", value.asInstanceOf[js.Any])
    
    inline def setCurrentBackupRateInMegaBytesPerSecondUndefined: Self = StObject.set(x, "CurrentBackupRateInMegaBytesPerSecond", js.undefined)
    
    inline def setDBName(value: String): Self = StObject.set(x, "DBName", value.asInstanceOf[js.Any])
    
    inline def setDBNameUndefined: Self = StObject.set(x, "DBName", js.undefined)
    
    inline def setElapsedTimeInSeconds(value: Long): Self = StObject.set(x, "ElapsedTimeInSeconds", value.asInstanceOf[js.Any])
    
    inline def setElapsedTimeInSecondsUndefined: Self = StObject.set(x, "ElapsedTimeInSeconds", js.undefined)
    
    inline def setEncrypted(value: Boolean): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    inline def setEncryptedWithHSM(value: Boolean): Self = StObject.set(x, "EncryptedWithHSM", value.asInstanceOf[js.Any])
    
    inline def setEncryptedWithHSMUndefined: Self = StObject.set(x, "EncryptedWithHSM", js.undefined)
    
    inline def setEnhancedVpcRouting(value: Boolean): Self = StObject.set(x, "EnhancedVpcRouting", value.asInstanceOf[js.Any])
    
    inline def setEnhancedVpcRoutingUndefined: Self = StObject.set(x, "EnhancedVpcRouting", js.undefined)
    
    inline def setEstimatedSecondsToCompletion(value: Long): Self = StObject.set(x, "EstimatedSecondsToCompletion", value.asInstanceOf[js.Any])
    
    inline def setEstimatedSecondsToCompletionUndefined: Self = StObject.set(x, "EstimatedSecondsToCompletion", js.undefined)
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setMaintenanceTrackName(value: String): Self = StObject.set(x, "MaintenanceTrackName", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceTrackNameUndefined: Self = StObject.set(x, "MaintenanceTrackName", js.undefined)
    
    inline def setManualSnapshotRemainingDays(value: IntegerOptional): Self = StObject.set(x, "ManualSnapshotRemainingDays", value.asInstanceOf[js.Any])
    
    inline def setManualSnapshotRemainingDaysUndefined: Self = StObject.set(x, "ManualSnapshotRemainingDays", js.undefined)
    
    inline def setManualSnapshotRetentionPeriod(value: IntegerOptional): Self = StObject.set(x, "ManualSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setManualSnapshotRetentionPeriodUndefined: Self = StObject.set(x, "ManualSnapshotRetentionPeriod", js.undefined)
    
    inline def setMasterUsername(value: String): Self = StObject.set(x, "MasterUsername", value.asInstanceOf[js.Any])
    
    inline def setMasterUsernameUndefined: Self = StObject.set(x, "MasterUsername", js.undefined)
    
    inline def setNodeType(value: String): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
    
    inline def setNodeTypeUndefined: Self = StObject.set(x, "NodeType", js.undefined)
    
    inline def setNumberOfNodes(value: Integer): Self = StObject.set(x, "NumberOfNodes", value.asInstanceOf[js.Any])
    
    inline def setNumberOfNodesUndefined: Self = StObject.set(x, "NumberOfNodes", js.undefined)
    
    inline def setOwnerAccount(value: String): Self = StObject.set(x, "OwnerAccount", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountUndefined: Self = StObject.set(x, "OwnerAccount", js.undefined)
    
    inline def setPort(value: Integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setRestorableNodeTypes(value: RestorableNodeTypeList): Self = StObject.set(x, "RestorableNodeTypes", value.asInstanceOf[js.Any])
    
    inline def setRestorableNodeTypesUndefined: Self = StObject.set(x, "RestorableNodeTypes", js.undefined)
    
    inline def setRestorableNodeTypesVarargs(value: String*): Self = StObject.set(x, "RestorableNodeTypes", js.Array(value :_*))
    
    inline def setSnapshotCreateTime(value: TStamp): Self = StObject.set(x, "SnapshotCreateTime", value.asInstanceOf[js.Any])
    
    inline def setSnapshotCreateTimeUndefined: Self = StObject.set(x, "SnapshotCreateTime", js.undefined)
    
    inline def setSnapshotIdentifier(value: String): Self = StObject.set(x, "SnapshotIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdentifierUndefined: Self = StObject.set(x, "SnapshotIdentifier", js.undefined)
    
    inline def setSnapshotRetentionStartTime(value: TStamp): Self = StObject.set(x, "SnapshotRetentionStartTime", value.asInstanceOf[js.Any])
    
    inline def setSnapshotRetentionStartTimeUndefined: Self = StObject.set(x, "SnapshotRetentionStartTime", js.undefined)
    
    inline def setSnapshotType(value: String): Self = StObject.set(x, "SnapshotType", value.asInstanceOf[js.Any])
    
    inline def setSnapshotTypeUndefined: Self = StObject.set(x, "SnapshotType", js.undefined)
    
    inline def setSourceRegion(value: String): Self = StObject.set(x, "SourceRegion", value.asInstanceOf[js.Any])
    
    inline def setSourceRegionUndefined: Self = StObject.set(x, "SourceRegion", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    inline def setTotalBackupSizeInMegaBytes(value: Double): Self = StObject.set(x, "TotalBackupSizeInMegaBytes", value.asInstanceOf[js.Any])
    
    inline def setTotalBackupSizeInMegaBytesUndefined: Self = StObject.set(x, "TotalBackupSizeInMegaBytes", js.undefined)
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
