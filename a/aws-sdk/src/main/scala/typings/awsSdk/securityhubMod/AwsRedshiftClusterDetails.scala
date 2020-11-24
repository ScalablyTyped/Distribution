package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRedshiftClusterDetails extends js.Object {
  
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
  implicit class AwsRedshiftClusterDetailsOps[Self <: AwsRedshiftClusterDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowVersionUpgrade(value: Boolean): Self = this.set("AllowVersionUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowVersionUpgrade: Self = this.set("AllowVersionUpgrade", js.undefined)
    
    @scala.inline
    def setAutomatedSnapshotRetentionPeriod(value: Integer): Self = this.set("AutomatedSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomatedSnapshotRetentionPeriod: Self = this.set("AutomatedSnapshotRetentionPeriod", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: NonEmptyString): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    
    @scala.inline
    def setClusterAvailabilityStatus(value: NonEmptyString): Self = this.set("ClusterAvailabilityStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterAvailabilityStatus: Self = this.set("ClusterAvailabilityStatus", js.undefined)
    
    @scala.inline
    def setClusterCreateTime(value: NonEmptyString): Self = this.set("ClusterCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterCreateTime: Self = this.set("ClusterCreateTime", js.undefined)
    
    @scala.inline
    def setClusterIdentifier(value: NonEmptyString): Self = this.set("ClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterIdentifier: Self = this.set("ClusterIdentifier", js.undefined)
    
    @scala.inline
    def setClusterNodesVarargs(value: AwsRedshiftClusterClusterNode*): Self = this.set("ClusterNodes", js.Array(value :_*))
    
    @scala.inline
    def setClusterNodes(value: AwsRedshiftClusterClusterNodes): Self = this.set("ClusterNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterNodes: Self = this.set("ClusterNodes", js.undefined)
    
    @scala.inline
    def setClusterParameterGroupsVarargs(value: AwsRedshiftClusterClusterParameterGroup*): Self = this.set("ClusterParameterGroups", js.Array(value :_*))
    
    @scala.inline
    def setClusterParameterGroups(value: AwsRedshiftClusterClusterParameterGroups): Self = this.set("ClusterParameterGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterParameterGroups: Self = this.set("ClusterParameterGroups", js.undefined)
    
    @scala.inline
    def setClusterPublicKey(value: NonEmptyString): Self = this.set("ClusterPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterPublicKey: Self = this.set("ClusterPublicKey", js.undefined)
    
    @scala.inline
    def setClusterRevisionNumber(value: NonEmptyString): Self = this.set("ClusterRevisionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterRevisionNumber: Self = this.set("ClusterRevisionNumber", js.undefined)
    
    @scala.inline
    def setClusterSecurityGroupsVarargs(value: AwsRedshiftClusterClusterSecurityGroup*): Self = this.set("ClusterSecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setClusterSecurityGroups(value: AwsRedshiftClusterClusterSecurityGroups): Self = this.set("ClusterSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterSecurityGroups: Self = this.set("ClusterSecurityGroups", js.undefined)
    
    @scala.inline
    def setClusterSnapshotCopyStatus(value: AwsRedshiftClusterClusterSnapshotCopyStatus): Self = this.set("ClusterSnapshotCopyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterSnapshotCopyStatus: Self = this.set("ClusterSnapshotCopyStatus", js.undefined)
    
    @scala.inline
    def setClusterStatus(value: NonEmptyString): Self = this.set("ClusterStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterStatus: Self = this.set("ClusterStatus", js.undefined)
    
    @scala.inline
    def setClusterSubnetGroupName(value: NonEmptyString): Self = this.set("ClusterSubnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterSubnetGroupName: Self = this.set("ClusterSubnetGroupName", js.undefined)
    
    @scala.inline
    def setClusterVersion(value: NonEmptyString): Self = this.set("ClusterVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterVersion: Self = this.set("ClusterVersion", js.undefined)
    
    @scala.inline
    def setDBName(value: NonEmptyString): Self = this.set("DBName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBName: Self = this.set("DBName", js.undefined)
    
    @scala.inline
    def setDeferredMaintenanceWindowsVarargs(value: AwsRedshiftClusterDeferredMaintenanceWindow*): Self = this.set("DeferredMaintenanceWindows", js.Array(value :_*))
    
    @scala.inline
    def setDeferredMaintenanceWindows(value: AwsRedshiftClusterDeferredMaintenanceWindows): Self = this.set("DeferredMaintenanceWindows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferredMaintenanceWindows: Self = this.set("DeferredMaintenanceWindows", js.undefined)
    
    @scala.inline
    def setElasticIpStatus(value: AwsRedshiftClusterElasticIpStatus): Self = this.set("ElasticIpStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElasticIpStatus: Self = this.set("ElasticIpStatus", js.undefined)
    
    @scala.inline
    def setElasticResizeNumberOfNodeOptions(value: NonEmptyString): Self = this.set("ElasticResizeNumberOfNodeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElasticResizeNumberOfNodeOptions: Self = this.set("ElasticResizeNumberOfNodeOptions", js.undefined)
    
    @scala.inline
    def setEncrypted(value: Boolean): Self = this.set("Encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncrypted: Self = this.set("Encrypted", js.undefined)
    
    @scala.inline
    def setEndpoint(value: AwsRedshiftClusterEndpoint): Self = this.set("Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("Endpoint", js.undefined)
    
    @scala.inline
    def setEnhancedVpcRouting(value: Boolean): Self = this.set("EnhancedVpcRouting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnhancedVpcRouting: Self = this.set("EnhancedVpcRouting", js.undefined)
    
    @scala.inline
    def setExpectedNextSnapshotScheduleTime(value: NonEmptyString): Self = this.set("ExpectedNextSnapshotScheduleTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedNextSnapshotScheduleTime: Self = this.set("ExpectedNextSnapshotScheduleTime", js.undefined)
    
    @scala.inline
    def setExpectedNextSnapshotScheduleTimeStatus(value: NonEmptyString): Self = this.set("ExpectedNextSnapshotScheduleTimeStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedNextSnapshotScheduleTimeStatus: Self = this.set("ExpectedNextSnapshotScheduleTimeStatus", js.undefined)
    
    @scala.inline
    def setHsmStatus(value: AwsRedshiftClusterHsmStatus): Self = this.set("HsmStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHsmStatus: Self = this.set("HsmStatus", js.undefined)
    
    @scala.inline
    def setIamRolesVarargs(value: AwsRedshiftClusterIamRole*): Self = this.set("IamRoles", js.Array(value :_*))
    
    @scala.inline
    def setIamRoles(value: AwsRedshiftClusterIamRoles): Self = this.set("IamRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamRoles: Self = this.set("IamRoles", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: NonEmptyString): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    
    @scala.inline
    def setMaintenanceTrackName(value: NonEmptyString): Self = this.set("MaintenanceTrackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaintenanceTrackName: Self = this.set("MaintenanceTrackName", js.undefined)
    
    @scala.inline
    def setManualSnapshotRetentionPeriod(value: Integer): Self = this.set("ManualSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManualSnapshotRetentionPeriod: Self = this.set("ManualSnapshotRetentionPeriod", js.undefined)
    
    @scala.inline
    def setMasterUsername(value: NonEmptyString): Self = this.set("MasterUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterUsername: Self = this.set("MasterUsername", js.undefined)
    
    @scala.inline
    def setNextMaintenanceWindowStartTime(value: NonEmptyString): Self = this.set("NextMaintenanceWindowStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextMaintenanceWindowStartTime: Self = this.set("NextMaintenanceWindowStartTime", js.undefined)
    
    @scala.inline
    def setNodeType(value: NonEmptyString): Self = this.set("NodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeType: Self = this.set("NodeType", js.undefined)
    
    @scala.inline
    def setNumberOfNodes(value: Integer): Self = this.set("NumberOfNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfNodes: Self = this.set("NumberOfNodes", js.undefined)
    
    @scala.inline
    def setPendingActionsVarargs(value: NonEmptyString*): Self = this.set("PendingActions", js.Array(value :_*))
    
    @scala.inline
    def setPendingActions(value: StringList): Self = this.set("PendingActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingActions: Self = this.set("PendingActions", js.undefined)
    
    @scala.inline
    def setPendingModifiedValues(value: AwsRedshiftClusterPendingModifiedValues): Self = this.set("PendingModifiedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingModifiedValues: Self = this.set("PendingModifiedValues", js.undefined)
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: NonEmptyString): Self = this.set("PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredMaintenanceWindow: Self = this.set("PreferredMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setPubliclyAccessible(value: Boolean): Self = this.set("PubliclyAccessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubliclyAccessible: Self = this.set("PubliclyAccessible", js.undefined)
    
    @scala.inline
    def setResizeInfo(value: AwsRedshiftClusterResizeInfo): Self = this.set("ResizeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeInfo: Self = this.set("ResizeInfo", js.undefined)
    
    @scala.inline
    def setRestoreStatus(value: AwsRedshiftClusterRestoreStatus): Self = this.set("RestoreStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestoreStatus: Self = this.set("RestoreStatus", js.undefined)
    
    @scala.inline
    def setSnapshotScheduleIdentifier(value: NonEmptyString): Self = this.set("SnapshotScheduleIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotScheduleIdentifier: Self = this.set("SnapshotScheduleIdentifier", js.undefined)
    
    @scala.inline
    def setSnapshotScheduleState(value: NonEmptyString): Self = this.set("SnapshotScheduleState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotScheduleState: Self = this.set("SnapshotScheduleState", js.undefined)
    
    @scala.inline
    def setVpcId(value: NonEmptyString): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupsVarargs(value: AwsRedshiftClusterVpcSecurityGroup*): Self = this.set("VpcSecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setVpcSecurityGroups(value: AwsRedshiftClusterVpcSecurityGroups): Self = this.set("VpcSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcSecurityGroups: Self = this.set("VpcSecurityGroups", js.undefined)
  }
}
