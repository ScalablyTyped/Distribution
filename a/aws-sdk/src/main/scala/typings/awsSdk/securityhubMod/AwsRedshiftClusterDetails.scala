package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRedshiftClusterDetails extends StObject {
  
  /**
    * Indicates whether major version upgrades are applied automatically to the cluster during the maintenance window.
    */
  var AllowVersionUpgrade: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of days that automatic cluster snapshots are retained.
    */
  var AutomatedSnapshotRetentionPeriod: js.UndefOr[Integer] = js.native
  
  /**
    * The name of the Availability Zone in which the cluster is located.
    */
  var AvailabilityZone: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The availability status of the cluster for queries. Possible values are the following:    Available - The cluster is available for queries.    Unavailable - The cluster is not available for queries.    Maintenance - The cluster is intermittently available for queries due to maintenance activities.    Modifying -The cluster is intermittently available for queries due to changes that modify the cluster.    Failed - The cluster failed and is not available for queries.  
    */
  var ClusterAvailabilityStatus: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates when the cluster was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var ClusterCreateTime: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The unique identifier of the cluster.
    */
  var ClusterIdentifier: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The nodes in the cluster.
    */
  var ClusterNodes: js.UndefOr[AwsRedshiftClusterClusterNodes] = js.native
  
  /**
    * The list of cluster parameter groups that are associated with this cluster.
    */
  var ClusterParameterGroups: js.UndefOr[AwsRedshiftClusterClusterParameterGroups] = js.native
  
  /**
    * The public key for the cluster.
    */
  var ClusterPublicKey: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The specific revision number of the database in the cluster.
    */
  var ClusterRevisionNumber: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A list of cluster security groups that are associated with the cluster.
    */
  var ClusterSecurityGroups: js.UndefOr[AwsRedshiftClusterClusterSecurityGroups] = js.native
  
  /**
    * Information about the destination Region and retention period for the cross-Region snapshot copy.
    */
  var ClusterSnapshotCopyStatus: js.UndefOr[AwsRedshiftClusterClusterSnapshotCopyStatus] = js.native
  
  /**
    * The current status of the cluster. Valid values: available | available, prep-for-resize | available, resize-cleanup | cancelling-resize | creating | deleting | final-snapshot | hardware-failure | incompatible-hsm | incompatible-network | incompatible-parameters | incompatible-restore | modifying | paused | rebooting | renaming | resizing | rotating-keys | storage-full | updating-hsm 
    */
  var ClusterStatus: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the subnet group that is associated with the cluster. This parameter is valid only when the cluster is in a VPC.
    */
  var ClusterSubnetGroupName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The version ID of the Amazon Redshift engine that runs on the cluster.
    */
  var ClusterVersion: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the initial database that was created when the cluster was created. The same name is returned for the life of the cluster. If an initial database is not specified, a database named devdev is created by default.
    */
  var DBName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * List of time windows during which maintenance was deferred.
    */
  var DeferredMaintenanceWindows: js.UndefOr[AwsRedshiftClusterDeferredMaintenanceWindows] = js.native
  
  /**
    * Information about the status of the Elastic IP (EIP) address.
    */
  var ElasticIpStatus: js.UndefOr[AwsRedshiftClusterElasticIpStatus] = js.native
  
  /**
    * The number of nodes that you can use the elastic resize method to resize the cluster to.
    */
  var ElasticResizeNumberOfNodeOptions: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates whether the data in the cluster is encrypted at rest.
    */
  var Encrypted: js.UndefOr[Boolean] = js.native
  
  /**
    * The connection endpoint.
    */
  var Endpoint: js.UndefOr[AwsRedshiftClusterEndpoint] = js.native
  
  /**
    * Indicates whether to create the cluster with enhanced VPC routing enabled.
    */
  var EnhancedVpcRouting: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates when the next snapshot is expected to be taken. The cluster must have a valid snapshot schedule and have backups enabled. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var ExpectedNextSnapshotScheduleTime: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The status of the next expected snapshot. Valid values: OnTrack | Pending 
    */
  var ExpectedNextSnapshotScheduleTimeStatus: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Information about whether the Amazon Redshift cluster finished applying any changes to hardware security module (HSM) settings that were specified in a modify cluster command.
    */
  var HsmStatus: js.UndefOr[AwsRedshiftClusterHsmStatus] = js.native
  
  /**
    * A list of IAM roles that the cluster can use to access other AWS services.
    */
  var IamRoles: js.UndefOr[AwsRedshiftClusterIamRoles] = js.native
  
  /**
    * The identifier of the AWS KMS encryption key that is used to encrypt data in the cluster.
    */
  var KmsKeyId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the maintenance track for the cluster.
    */
  var MaintenanceTrackName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The default number of days to retain a manual snapshot. If the value is -1, the snapshot is retained indefinitely. This setting doesn't change the retention period of existing snapshots. Valid values: Either -1 or an integer between 1 and 3,653
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[Integer] = js.native
  
  /**
    * The master user name for the cluster. This name is used to connect to the database that is specified in as the value of DBName.
    */
  var MasterUsername: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates the start of the next maintenance window. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var NextMaintenanceWindowStartTime: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The node type for the nodes in the cluster.
    */
  var NodeType: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The number of compute nodes in the cluster.
    */
  var NumberOfNodes: js.UndefOr[Integer] = js.native
  
  /**
    * A list of cluster operations that are waiting to start.
    */
  var PendingActions: js.UndefOr[StringList] = js.native
  
  /**
    * A list of changes to the cluster that are currently pending.
    */
  var PendingModifiedValues: js.UndefOr[AwsRedshiftClusterPendingModifiedValues] = js.native
  
  /**
    * The weekly time range, in Universal Coordinated Time (UTC), during which system maintenance can occur. Format:  &lt;day&gt;:HH:MM-&lt;day&gt;:HH:MM  For the day values, use mon | tue | wed | thu | fri | sat | sun  For example, sun:09:32-sun:10:02 
    */
  var PreferredMaintenanceWindow: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Whether the cluster can be accessed from a public network.
    */
  var PubliclyAccessible: js.UndefOr[Boolean] = js.native
  
  /**
    * Information about the resize operation for the cluster.
    */
  var ResizeInfo: js.UndefOr[AwsRedshiftClusterResizeInfo] = js.native
  
  /**
    * Information about the status of a cluster restore action. Only applies to a cluster that was created by restoring a snapshot.
    */
  var RestoreStatus: js.UndefOr[AwsRedshiftClusterRestoreStatus] = js.native
  
  /**
    * A unique identifier for the cluster snapshot schedule.
    */
  var SnapshotScheduleIdentifier: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The current state of the cluster snapshot schedule. Valid values: MODIFYING | ACTIVE | FAILED 
    */
  var SnapshotScheduleState: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The identifier of the VPC that the cluster is in, if the cluster is in a VPC.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The list of VPC security groups that the cluster belongs to, if the cluster is in a VPC.
    */
  var VpcSecurityGroups: js.UndefOr[AwsRedshiftClusterVpcSecurityGroups] = js.native
}
object AwsRedshiftClusterDetails {
  
  @scala.inline
  def apply(): AwsRedshiftClusterDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterDetails]
  }
  
  @scala.inline
  implicit class AwsRedshiftClusterDetailsMutableBuilder[Self <: AwsRedshiftClusterDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowVersionUpgrade(value: Boolean): Self = StObject.set(x, "AllowVersionUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowVersionUpgradeUndefined: Self = StObject.set(x, "AllowVersionUpgrade", js.undefined)
    
    @scala.inline
    def setAutomatedSnapshotRetentionPeriod(value: Integer): Self = StObject.set(x, "AutomatedSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomatedSnapshotRetentionPeriodUndefined: Self = StObject.set(x, "AutomatedSnapshotRetentionPeriod", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: NonEmptyString): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setClusterAvailabilityStatus(value: NonEmptyString): Self = StObject.set(x, "ClusterAvailabilityStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterAvailabilityStatusUndefined: Self = StObject.set(x, "ClusterAvailabilityStatus", js.undefined)
    
    @scala.inline
    def setClusterCreateTime(value: NonEmptyString): Self = StObject.set(x, "ClusterCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterCreateTimeUndefined: Self = StObject.set(x, "ClusterCreateTime", js.undefined)
    
    @scala.inline
    def setClusterIdentifier(value: NonEmptyString): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdentifierUndefined: Self = StObject.set(x, "ClusterIdentifier", js.undefined)
    
    @scala.inline
    def setClusterNodes(value: AwsRedshiftClusterClusterNodes): Self = StObject.set(x, "ClusterNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterNodesUndefined: Self = StObject.set(x, "ClusterNodes", js.undefined)
    
    @scala.inline
    def setClusterNodesVarargs(value: AwsRedshiftClusterClusterNode*): Self = StObject.set(x, "ClusterNodes", js.Array(value :_*))
    
    @scala.inline
    def setClusterParameterGroups(value: AwsRedshiftClusterClusterParameterGroups): Self = StObject.set(x, "ClusterParameterGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterParameterGroupsUndefined: Self = StObject.set(x, "ClusterParameterGroups", js.undefined)
    
    @scala.inline
    def setClusterParameterGroupsVarargs(value: AwsRedshiftClusterClusterParameterGroup*): Self = StObject.set(x, "ClusterParameterGroups", js.Array(value :_*))
    
    @scala.inline
    def setClusterPublicKey(value: NonEmptyString): Self = StObject.set(x, "ClusterPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterPublicKeyUndefined: Self = StObject.set(x, "ClusterPublicKey", js.undefined)
    
    @scala.inline
    def setClusterRevisionNumber(value: NonEmptyString): Self = StObject.set(x, "ClusterRevisionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterRevisionNumberUndefined: Self = StObject.set(x, "ClusterRevisionNumber", js.undefined)
    
    @scala.inline
    def setClusterSecurityGroups(value: AwsRedshiftClusterClusterSecurityGroups): Self = StObject.set(x, "ClusterSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterSecurityGroupsUndefined: Self = StObject.set(x, "ClusterSecurityGroups", js.undefined)
    
    @scala.inline
    def setClusterSecurityGroupsVarargs(value: AwsRedshiftClusterClusterSecurityGroup*): Self = StObject.set(x, "ClusterSecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setClusterSnapshotCopyStatus(value: AwsRedshiftClusterClusterSnapshotCopyStatus): Self = StObject.set(x, "ClusterSnapshotCopyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterSnapshotCopyStatusUndefined: Self = StObject.set(x, "ClusterSnapshotCopyStatus", js.undefined)
    
    @scala.inline
    def setClusterStatus(value: NonEmptyString): Self = StObject.set(x, "ClusterStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterStatusUndefined: Self = StObject.set(x, "ClusterStatus", js.undefined)
    
    @scala.inline
    def setClusterSubnetGroupName(value: NonEmptyString): Self = StObject.set(x, "ClusterSubnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterSubnetGroupNameUndefined: Self = StObject.set(x, "ClusterSubnetGroupName", js.undefined)
    
    @scala.inline
    def setClusterVersion(value: NonEmptyString): Self = StObject.set(x, "ClusterVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterVersionUndefined: Self = StObject.set(x, "ClusterVersion", js.undefined)
    
    @scala.inline
    def setDBName(value: NonEmptyString): Self = StObject.set(x, "DBName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBNameUndefined: Self = StObject.set(x, "DBName", js.undefined)
    
    @scala.inline
    def setDeferredMaintenanceWindows(value: AwsRedshiftClusterDeferredMaintenanceWindows): Self = StObject.set(x, "DeferredMaintenanceWindows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferredMaintenanceWindowsUndefined: Self = StObject.set(x, "DeferredMaintenanceWindows", js.undefined)
    
    @scala.inline
    def setDeferredMaintenanceWindowsVarargs(value: AwsRedshiftClusterDeferredMaintenanceWindow*): Self = StObject.set(x, "DeferredMaintenanceWindows", js.Array(value :_*))
    
    @scala.inline
    def setElasticIpStatus(value: AwsRedshiftClusterElasticIpStatus): Self = StObject.set(x, "ElasticIpStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticIpStatusUndefined: Self = StObject.set(x, "ElasticIpStatus", js.undefined)
    
    @scala.inline
    def setElasticResizeNumberOfNodeOptions(value: NonEmptyString): Self = StObject.set(x, "ElasticResizeNumberOfNodeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticResizeNumberOfNodeOptionsUndefined: Self = StObject.set(x, "ElasticResizeNumberOfNodeOptions", js.undefined)
    
    @scala.inline
    def setEncrypted(value: Boolean): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    @scala.inline
    def setEndpoint(value: AwsRedshiftClusterEndpoint): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    @scala.inline
    def setEnhancedVpcRouting(value: Boolean): Self = StObject.set(x, "EnhancedVpcRouting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnhancedVpcRoutingUndefined: Self = StObject.set(x, "EnhancedVpcRouting", js.undefined)
    
    @scala.inline
    def setExpectedNextSnapshotScheduleTime(value: NonEmptyString): Self = StObject.set(x, "ExpectedNextSnapshotScheduleTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedNextSnapshotScheduleTimeStatus(value: NonEmptyString): Self = StObject.set(x, "ExpectedNextSnapshotScheduleTimeStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedNextSnapshotScheduleTimeStatusUndefined: Self = StObject.set(x, "ExpectedNextSnapshotScheduleTimeStatus", js.undefined)
    
    @scala.inline
    def setExpectedNextSnapshotScheduleTimeUndefined: Self = StObject.set(x, "ExpectedNextSnapshotScheduleTime", js.undefined)
    
    @scala.inline
    def setHsmStatus(value: AwsRedshiftClusterHsmStatus): Self = StObject.set(x, "HsmStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsmStatusUndefined: Self = StObject.set(x, "HsmStatus", js.undefined)
    
    @scala.inline
    def setIamRoles(value: AwsRedshiftClusterIamRoles): Self = StObject.set(x, "IamRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamRolesUndefined: Self = StObject.set(x, "IamRoles", js.undefined)
    
    @scala.inline
    def setIamRolesVarargs(value: AwsRedshiftClusterIamRole*): Self = StObject.set(x, "IamRoles", js.Array(value :_*))
    
    @scala.inline
    def setKmsKeyId(value: NonEmptyString): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setMaintenanceTrackName(value: NonEmptyString): Self = StObject.set(x, "MaintenanceTrackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintenanceTrackNameUndefined: Self = StObject.set(x, "MaintenanceTrackName", js.undefined)
    
    @scala.inline
    def setManualSnapshotRetentionPeriod(value: Integer): Self = StObject.set(x, "ManualSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualSnapshotRetentionPeriodUndefined: Self = StObject.set(x, "ManualSnapshotRetentionPeriod", js.undefined)
    
    @scala.inline
    def setMasterUsername(value: NonEmptyString): Self = StObject.set(x, "MasterUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterUsernameUndefined: Self = StObject.set(x, "MasterUsername", js.undefined)
    
    @scala.inline
    def setNextMaintenanceWindowStartTime(value: NonEmptyString): Self = StObject.set(x, "NextMaintenanceWindowStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMaintenanceWindowStartTimeUndefined: Self = StObject.set(x, "NextMaintenanceWindowStartTime", js.undefined)
    
    @scala.inline
    def setNodeType(value: NonEmptyString): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeTypeUndefined: Self = StObject.set(x, "NodeType", js.undefined)
    
    @scala.inline
    def setNumberOfNodes(value: Integer): Self = StObject.set(x, "NumberOfNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfNodesUndefined: Self = StObject.set(x, "NumberOfNodes", js.undefined)
    
    @scala.inline
    def setPendingActions(value: StringList): Self = StObject.set(x, "PendingActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingActionsUndefined: Self = StObject.set(x, "PendingActions", js.undefined)
    
    @scala.inline
    def setPendingActionsVarargs(value: NonEmptyString*): Self = StObject.set(x, "PendingActions", js.Array(value :_*))
    
    @scala.inline
    def setPendingModifiedValues(value: AwsRedshiftClusterPendingModifiedValues): Self = StObject.set(x, "PendingModifiedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingModifiedValuesUndefined: Self = StObject.set(x, "PendingModifiedValues", js.undefined)
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: NonEmptyString): Self = StObject.set(x, "PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "PreferredMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setPubliclyAccessible(value: Boolean): Self = StObject.set(x, "PubliclyAccessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubliclyAccessibleUndefined: Self = StObject.set(x, "PubliclyAccessible", js.undefined)
    
    @scala.inline
    def setResizeInfo(value: AwsRedshiftClusterResizeInfo): Self = StObject.set(x, "ResizeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeInfoUndefined: Self = StObject.set(x, "ResizeInfo", js.undefined)
    
    @scala.inline
    def setRestoreStatus(value: AwsRedshiftClusterRestoreStatus): Self = StObject.set(x, "RestoreStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreStatusUndefined: Self = StObject.set(x, "RestoreStatus", js.undefined)
    
    @scala.inline
    def setSnapshotScheduleIdentifier(value: NonEmptyString): Self = StObject.set(x, "SnapshotScheduleIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotScheduleIdentifierUndefined: Self = StObject.set(x, "SnapshotScheduleIdentifier", js.undefined)
    
    @scala.inline
    def setSnapshotScheduleState(value: NonEmptyString): Self = StObject.set(x, "SnapshotScheduleState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotScheduleStateUndefined: Self = StObject.set(x, "SnapshotScheduleState", js.undefined)
    
    @scala.inline
    def setVpcId(value: NonEmptyString): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroups(value: AwsRedshiftClusterVpcSecurityGroups): Self = StObject.set(x, "VpcSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcSecurityGroupsUndefined: Self = StObject.set(x, "VpcSecurityGroups", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupsVarargs(value: AwsRedshiftClusterVpcSecurityGroup*): Self = StObject.set(x, "VpcSecurityGroups", js.Array(value :_*))
  }
}
