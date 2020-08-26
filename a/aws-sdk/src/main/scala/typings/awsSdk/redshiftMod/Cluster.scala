package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster extends js.Object {
  /**
    * A boolean value that, if true, indicates that major version upgrades will be applied automatically to the cluster during the maintenance window. 
    */
  var AllowVersionUpgrade: js.UndefOr[Boolean] = js.native
  /**
    * The number of days that automatic cluster snapshots are retained.
    */
  var AutomatedSnapshotRetentionPeriod: js.UndefOr[Integer] = js.native
  /**
    * The name of the Availability Zone in which the cluster is located.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The availability status of the cluster for queries. Possible values are the following:   Available - The cluster is available for queries.    Unavailable - The cluster is not available for queries.   Maintenance - The cluster is intermittently available for queries due to maintenance activities.   Modifying - The cluster is intermittently available for queries due to changes that modify the cluster.   Failed - The cluster failed and is not available for queries.  
    */
  var ClusterAvailabilityStatus: js.UndefOr[String] = js.native
  /**
    * The date and time that the cluster was created.
    */
  var ClusterCreateTime: js.UndefOr[TStamp] = js.native
  /**
    * The unique identifier of the cluster.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * The nodes in the cluster.
    */
  var ClusterNodes: js.UndefOr[ClusterNodesList] = js.native
  /**
    * The list of cluster parameter groups that are associated with this cluster. Each parameter group in the list is returned with its status.
    */
  var ClusterParameterGroups: js.UndefOr[ClusterParameterGroupStatusList] = js.native
  /**
    * The public key for the cluster.
    */
  var ClusterPublicKey: js.UndefOr[String] = js.native
  /**
    * The specific revision number of the database in the cluster.
    */
  var ClusterRevisionNumber: js.UndefOr[String] = js.native
  /**
    * A list of cluster security group that are associated with the cluster. Each security group is represented by an element that contains ClusterSecurityGroup.Name and ClusterSecurityGroup.Status subelements.  Cluster security groups are used when the cluster is not created in an Amazon Virtual Private Cloud (VPC). Clusters that are created in a VPC use VPC security groups, which are listed by the VpcSecurityGroups parameter. 
    */
  var ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroupMembershipList] = js.native
  /**
    * A value that returns the destination region and retention period that are configured for cross-region snapshot copy.
    */
  var ClusterSnapshotCopyStatus: js.UndefOr[typings.awsSdk.redshiftMod.ClusterSnapshotCopyStatus] = js.native
  /**
    *  The current state of the cluster. Possible values are the following:    available     available, prep-for-resize     available, resize-cleanup     cancelling-resize     creating     deleting     final-snapshot     hardware-failure     incompatible-hsm     incompatible-network     incompatible-parameters     incompatible-restore     modifying     paused     rebooting     renaming     resizing     rotating-keys     storage-full     updating-hsm   
    */
  var ClusterStatus: js.UndefOr[String] = js.native
  /**
    * The name of the subnet group that is associated with the cluster. This parameter is valid only when the cluster is in a VPC.
    */
  var ClusterSubnetGroupName: js.UndefOr[String] = js.native
  /**
    * The version ID of the Amazon Redshift engine that is running on the cluster.
    */
  var ClusterVersion: js.UndefOr[String] = js.native
  /**
    * The name of the initial database that was created when the cluster was created. This same name is returned for the life of the cluster. If an initial database was not specified, a database named devdev was created by default. 
    */
  var DBName: js.UndefOr[String] = js.native
  /**
    * 
    */
  var DataTransferProgress: js.UndefOr[typings.awsSdk.redshiftMod.DataTransferProgress] = js.native
  /**
    * Describes a group of DeferredMaintenanceWindow objects.
    */
  var DeferredMaintenanceWindows: js.UndefOr[DeferredMaintenanceWindowsList] = js.native
  /**
    * The status of the elastic IP (EIP) address.
    */
  var ElasticIpStatus: js.UndefOr[typings.awsSdk.redshiftMod.ElasticIpStatus] = js.native
  /**
    * The number of nodes that you can resize the cluster to with the elastic resize method. 
    */
  var ElasticResizeNumberOfNodeOptions: js.UndefOr[String] = js.native
  /**
    * A boolean value that, if true, indicates that data in the cluster is encrypted at rest.
    */
  var Encrypted: js.UndefOr[Boolean] = js.native
  /**
    * The connection endpoint.
    */
  var Endpoint: js.UndefOr[typings.awsSdk.redshiftMod.Endpoint] = js.native
  /**
    * An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see Enhanced VPC Routing in the Amazon Redshift Cluster Management Guide. If this option is true, enhanced VPC routing is enabled.  Default: false
    */
  var EnhancedVpcRouting: js.UndefOr[Boolean] = js.native
  /**
    * The date and time when the next snapshot is expected to be taken for clusters with a valid snapshot schedule and backups enabled. 
    */
  var ExpectedNextSnapshotScheduleTime: js.UndefOr[TStamp] = js.native
  /**
    *  The status of next expected snapshot for clusters having a valid snapshot schedule and backups enabled. Possible values are the following:   OnTrack - The next snapshot is expected to be taken on time.    Pending - The next snapshot is pending to be taken.   
    */
  var ExpectedNextSnapshotScheduleTimeStatus: js.UndefOr[String] = js.native
  /**
    * A value that reports whether the Amazon Redshift cluster has finished applying any hardware security module (HSM) settings changes specified in a modify cluster command. Values: active, applying
    */
  var HsmStatus: js.UndefOr[typings.awsSdk.redshiftMod.HsmStatus] = js.native
  /**
    * A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other AWS services.
    */
  var IamRoles: js.UndefOr[ClusterIamRoleList] = js.native
  /**
    * The AWS Key Management Service (AWS KMS) key ID of the encryption key used to encrypt data in the cluster.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * The name of the maintenance track for the cluster.
    */
  var MaintenanceTrackName: js.UndefOr[String] = js.native
  /**
    * The default number of days to retain a manual snapshot. If the value is -1, the snapshot is retained indefinitely. This setting doesn't change the retention period of existing snapshots. The value must be either -1 or an integer between 1 and 3,653.
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[Integer] = js.native
  /**
    * The master user name for the cluster. This name is used to connect to the database that is specified in the DBName parameter. 
    */
  var MasterUsername: js.UndefOr[String] = js.native
  /**
    * The status of a modify operation, if any, initiated for the cluster.
    */
  var ModifyStatus: js.UndefOr[String] = js.native
  /**
    * The date and time in UTC when system maintenance can begin.
    */
  var NextMaintenanceWindowStartTime: js.UndefOr[TStamp] = js.native
  /**
    * The node type for the nodes in the cluster.
    */
  var NodeType: js.UndefOr[String] = js.native
  /**
    * The number of compute nodes in the cluster.
    */
  var NumberOfNodes: js.UndefOr[Integer] = js.native
  /**
    * Cluster operations that are waiting to be started.
    */
  var PendingActions: js.UndefOr[PendingActionsList] = js.native
  /**
    * A value that, if present, indicates that changes to the cluster are pending. Specific pending changes are identified by subelements.
    */
  var PendingModifiedValues: js.UndefOr[typings.awsSdk.redshiftMod.PendingModifiedValues] = js.native
  /**
    * The weekly time range, in Universal Coordinated Time (UTC), during which system maintenance can occur.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  /**
    * A boolean value that, if true, indicates that the cluster can be accessed from a public network.
    */
  var PubliclyAccessible: js.UndefOr[Boolean] = js.native
  /**
    * Returns the following:   AllowCancelResize: a boolean value indicating if the resize operation can be cancelled.   ResizeType: Returns ClassicResize  
    */
  var ResizeInfo: js.UndefOr[typings.awsSdk.redshiftMod.ResizeInfo] = js.native
  /**
    * A value that describes the status of a cluster restore action. This parameter returns null if the cluster was not created by restoring a snapshot.
    */
  var RestoreStatus: js.UndefOr[typings.awsSdk.redshiftMod.RestoreStatus] = js.native
  /**
    * A unique identifier for the cluster snapshot schedule.
    */
  var SnapshotScheduleIdentifier: js.UndefOr[String] = js.native
  /**
    * The current state of the cluster snapshot schedule.
    */
  var SnapshotScheduleState: js.UndefOr[ScheduleState] = js.native
  /**
    * The list of tags for the cluster.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The identifier of the VPC the cluster is in, if the cluster is in a VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
  /**
    * A list of Amazon Virtual Private Cloud (Amazon VPC) security groups that are associated with the cluster. This parameter is returned only if the cluster is in a VPC.
    */
  var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.native
}

object Cluster {
  @scala.inline
  def apply(): Cluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cluster]
  }
  @scala.inline
  implicit class ClusterOps[Self <: Cluster] (val x: Self) extends AnyVal {
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
    def setAllowVersionUpgrade(value: Boolean): Self = this.set("AllowVersionUpgrade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowVersionUpgrade: Self = this.set("AllowVersionUpgrade", js.undefined)
    @scala.inline
    def setAutomatedSnapshotRetentionPeriod(value: Integer): Self = this.set("AutomatedSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomatedSnapshotRetentionPeriod: Self = this.set("AutomatedSnapshotRetentionPeriod", js.undefined)
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    @scala.inline
    def setClusterAvailabilityStatus(value: String): Self = this.set("ClusterAvailabilityStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterAvailabilityStatus: Self = this.set("ClusterAvailabilityStatus", js.undefined)
    @scala.inline
    def setClusterCreateTime(value: TStamp): Self = this.set("ClusterCreateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterCreateTime: Self = this.set("ClusterCreateTime", js.undefined)
    @scala.inline
    def setClusterIdentifier(value: String): Self = this.set("ClusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterIdentifier: Self = this.set("ClusterIdentifier", js.undefined)
    @scala.inline
    def setClusterNodesVarargs(value: ClusterNode*): Self = this.set("ClusterNodes", js.Array(value :_*))
    @scala.inline
    def setClusterNodes(value: ClusterNodesList): Self = this.set("ClusterNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterNodes: Self = this.set("ClusterNodes", js.undefined)
    @scala.inline
    def setClusterParameterGroupsVarargs(value: ClusterParameterGroupStatus*): Self = this.set("ClusterParameterGroups", js.Array(value :_*))
    @scala.inline
    def setClusterParameterGroups(value: ClusterParameterGroupStatusList): Self = this.set("ClusterParameterGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterParameterGroups: Self = this.set("ClusterParameterGroups", js.undefined)
    @scala.inline
    def setClusterPublicKey(value: String): Self = this.set("ClusterPublicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterPublicKey: Self = this.set("ClusterPublicKey", js.undefined)
    @scala.inline
    def setClusterRevisionNumber(value: String): Self = this.set("ClusterRevisionNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterRevisionNumber: Self = this.set("ClusterRevisionNumber", js.undefined)
    @scala.inline
    def setClusterSecurityGroupsVarargs(value: ClusterSecurityGroupMembership*): Self = this.set("ClusterSecurityGroups", js.Array(value :_*))
    @scala.inline
    def setClusterSecurityGroups(value: ClusterSecurityGroupMembershipList): Self = this.set("ClusterSecurityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterSecurityGroups: Self = this.set("ClusterSecurityGroups", js.undefined)
    @scala.inline
    def setClusterSnapshotCopyStatus(value: ClusterSnapshotCopyStatus): Self = this.set("ClusterSnapshotCopyStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterSnapshotCopyStatus: Self = this.set("ClusterSnapshotCopyStatus", js.undefined)
    @scala.inline
    def setClusterStatus(value: String): Self = this.set("ClusterStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterStatus: Self = this.set("ClusterStatus", js.undefined)
    @scala.inline
    def setClusterSubnetGroupName(value: String): Self = this.set("ClusterSubnetGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterSubnetGroupName: Self = this.set("ClusterSubnetGroupName", js.undefined)
    @scala.inline
    def setClusterVersion(value: String): Self = this.set("ClusterVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterVersion: Self = this.set("ClusterVersion", js.undefined)
    @scala.inline
    def setDBName(value: String): Self = this.set("DBName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBName: Self = this.set("DBName", js.undefined)
    @scala.inline
    def setDataTransferProgress(value: DataTransferProgress): Self = this.set("DataTransferProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTransferProgress: Self = this.set("DataTransferProgress", js.undefined)
    @scala.inline
    def setDeferredMaintenanceWindowsVarargs(value: DeferredMaintenanceWindow*): Self = this.set("DeferredMaintenanceWindows", js.Array(value :_*))
    @scala.inline
    def setDeferredMaintenanceWindows(value: DeferredMaintenanceWindowsList): Self = this.set("DeferredMaintenanceWindows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeferredMaintenanceWindows: Self = this.set("DeferredMaintenanceWindows", js.undefined)
    @scala.inline
    def setElasticIpStatus(value: ElasticIpStatus): Self = this.set("ElasticIpStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticIpStatus: Self = this.set("ElasticIpStatus", js.undefined)
    @scala.inline
    def setElasticResizeNumberOfNodeOptions(value: String): Self = this.set("ElasticResizeNumberOfNodeOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticResizeNumberOfNodeOptions: Self = this.set("ElasticResizeNumberOfNodeOptions", js.undefined)
    @scala.inline
    def setEncrypted(value: Boolean): Self = this.set("Encrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncrypted: Self = this.set("Encrypted", js.undefined)
    @scala.inline
    def setEndpoint(value: Endpoint): Self = this.set("Endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("Endpoint", js.undefined)
    @scala.inline
    def setEnhancedVpcRouting(value: Boolean): Self = this.set("EnhancedVpcRouting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnhancedVpcRouting: Self = this.set("EnhancedVpcRouting", js.undefined)
    @scala.inline
    def setExpectedNextSnapshotScheduleTime(value: TStamp): Self = this.set("ExpectedNextSnapshotScheduleTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpectedNextSnapshotScheduleTime: Self = this.set("ExpectedNextSnapshotScheduleTime", js.undefined)
    @scala.inline
    def setExpectedNextSnapshotScheduleTimeStatus(value: String): Self = this.set("ExpectedNextSnapshotScheduleTimeStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpectedNextSnapshotScheduleTimeStatus: Self = this.set("ExpectedNextSnapshotScheduleTimeStatus", js.undefined)
    @scala.inline
    def setHsmStatus(value: HsmStatus): Self = this.set("HsmStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHsmStatus: Self = this.set("HsmStatus", js.undefined)
    @scala.inline
    def setIamRolesVarargs(value: ClusterIamRole*): Self = this.set("IamRoles", js.Array(value :_*))
    @scala.inline
    def setIamRoles(value: ClusterIamRoleList): Self = this.set("IamRoles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamRoles: Self = this.set("IamRoles", js.undefined)
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    @scala.inline
    def setMaintenanceTrackName(value: String): Self = this.set("MaintenanceTrackName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaintenanceTrackName: Self = this.set("MaintenanceTrackName", js.undefined)
    @scala.inline
    def setManualSnapshotRetentionPeriod(value: Integer): Self = this.set("ManualSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManualSnapshotRetentionPeriod: Self = this.set("ManualSnapshotRetentionPeriod", js.undefined)
    @scala.inline
    def setMasterUsername(value: String): Self = this.set("MasterUsername", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterUsername: Self = this.set("MasterUsername", js.undefined)
    @scala.inline
    def setModifyStatus(value: String): Self = this.set("ModifyStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifyStatus: Self = this.set("ModifyStatus", js.undefined)
    @scala.inline
    def setNextMaintenanceWindowStartTime(value: TStamp): Self = this.set("NextMaintenanceWindowStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextMaintenanceWindowStartTime: Self = this.set("NextMaintenanceWindowStartTime", js.undefined)
    @scala.inline
    def setNodeType(value: String): Self = this.set("NodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeType: Self = this.set("NodeType", js.undefined)
    @scala.inline
    def setNumberOfNodes(value: Integer): Self = this.set("NumberOfNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfNodes: Self = this.set("NumberOfNodes", js.undefined)
    @scala.inline
    def setPendingActionsVarargs(value: String*): Self = this.set("PendingActions", js.Array(value :_*))
    @scala.inline
    def setPendingActions(value: PendingActionsList): Self = this.set("PendingActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePendingActions: Self = this.set("PendingActions", js.undefined)
    @scala.inline
    def setPendingModifiedValues(value: PendingModifiedValues): Self = this.set("PendingModifiedValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePendingModifiedValues: Self = this.set("PendingModifiedValues", js.undefined)
    @scala.inline
    def setPreferredMaintenanceWindow(value: String): Self = this.set("PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredMaintenanceWindow: Self = this.set("PreferredMaintenanceWindow", js.undefined)
    @scala.inline
    def setPubliclyAccessible(value: Boolean): Self = this.set("PubliclyAccessible", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePubliclyAccessible: Self = this.set("PubliclyAccessible", js.undefined)
    @scala.inline
    def setResizeInfo(value: ResizeInfo): Self = this.set("ResizeInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeInfo: Self = this.set("ResizeInfo", js.undefined)
    @scala.inline
    def setRestoreStatus(value: RestoreStatus): Self = this.set("RestoreStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestoreStatus: Self = this.set("RestoreStatus", js.undefined)
    @scala.inline
    def setSnapshotScheduleIdentifier(value: String): Self = this.set("SnapshotScheduleIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotScheduleIdentifier: Self = this.set("SnapshotScheduleIdentifier", js.undefined)
    @scala.inline
    def setSnapshotScheduleState(value: ScheduleState): Self = this.set("SnapshotScheduleState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotScheduleState: Self = this.set("SnapshotScheduleState", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setVpcId(value: String): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
    @scala.inline
    def setVpcSecurityGroupsVarargs(value: VpcSecurityGroupMembership*): Self = this.set("VpcSecurityGroups", js.Array(value :_*))
    @scala.inline
    def setVpcSecurityGroups(value: VpcSecurityGroupMembershipList): Self = this.set("VpcSecurityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcSecurityGroups: Self = this.set("VpcSecurityGroups", js.undefined)
  }
  
}

