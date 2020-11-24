package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreFromClusterSnapshotMessage extends js.Object {
  
  /**
    * Reserved.
    */
  var AdditionalInfo: js.UndefOr[String] = js.native
  
  /**
    * If true, major version upgrades can be applied during the maintenance window to the Amazon Redshift engine that is running on the cluster.  Default: true 
    */
  var AllowVersionUpgrade: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The number of days that automated snapshots are retained. If the value is 0, automated snapshots are disabled. Even if automated snapshots are disabled, you can still create manual snapshots when you want with CreateClusterSnapshot.  Default: The value selected for the cluster from which the snapshot was taken. Constraints: Must be a value from 0 to 35.
    */
  var AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The Amazon EC2 Availability Zone in which to restore the cluster. Default: A random, system-chosen Availability Zone. Example: us-east-2a 
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * The identifier of the cluster that will be created from restoring the snapshot. Constraints:   Must contain from 1 to 63 alphanumeric characters or hyphens.   Alphabetic characters must be lowercase.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Must be unique for all clusters within an AWS account.  
    */
  var ClusterIdentifier: String = js.native
  
  /**
    * The name of the parameter group to be associated with this cluster. Default: The default Amazon Redshift cluster parameter group. For information about the default parameter group, go to Working with Amazon Redshift Parameter Groups. Constraints:   Must be 1 to 255 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
    */
  var ClusterParameterGroupName: js.UndefOr[String] = js.native
  
  /**
    * A list of security groups to be associated with this cluster. Default: The default cluster security group for Amazon Redshift. Cluster security groups only apply to clusters outside of VPCs.
    */
  var ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroupNameList] = js.native
  
  /**
    * The name of the subnet group where you want to cluster restored. A snapshot of cluster in VPC can be restored only in VPC. Therefore, you must provide subnet group name where you want the cluster restored.
    */
  var ClusterSubnetGroupName: js.UndefOr[String] = js.native
  
  /**
    * The elastic IP (EIP) address for the cluster.
    */
  var ElasticIp: js.UndefOr[String] = js.native
  
  /**
    * An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see Enhanced VPC Routing in the Amazon Redshift Cluster Management Guide. If this option is true, enhanced VPC routing is enabled.  Default: false
    */
  var EnhancedVpcRouting: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * Specifies the name of the HSM client certificate the Amazon Redshift cluster uses to retrieve the data encryption keys stored in an HSM.
    */
  var HsmClientCertificateIdentifier: js.UndefOr[String] = js.native
  
  /**
    * Specifies the name of the HSM configuration that contains the information the Amazon Redshift cluster can use to retrieve and store keys in an HSM.
    */
  var HsmConfigurationIdentifier: js.UndefOr[String] = js.native
  
  /**
    * A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other AWS services. You must supply the IAM roles in their Amazon Resource Name (ARN) format. You can supply up to 10 IAM roles in a single request. A cluster can have up to 10 IAM roles associated at any time.
    */
  var IamRoles: js.UndefOr[IamRoleArnList] = js.native
  
  /**
    * The AWS Key Management Service (KMS) key ID of the encryption key that you want to use to encrypt data in the cluster that you restore from a shared snapshot.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  
  /**
    * The name of the maintenance track for the restored cluster. When you take a snapshot, the snapshot inherits the MaintenanceTrack value from the cluster. The snapshot might be on a different track than the cluster that was the source for the snapshot. For example, suppose that you take a snapshot of a cluster that is on the current track and then change the cluster to be on the trailing track. In this case, the snapshot and the source cluster are on different tracks.
    */
  var MaintenanceTrackName: js.UndefOr[String] = js.native
  
  /**
    * The default number of days to retain a manual snapshot. If the value is -1, the snapshot is retained indefinitely. This setting doesn't change the retention period of existing snapshots. The value must be either -1 or an integer between 1 and 3,653.
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The node type that the restored cluster will be provisioned with. Default: The node type of the cluster from which the snapshot was taken. You can modify this if you are using any DS node type. In that case, you can choose to restore into another DS node type of the same size. For example, you can restore ds1.8xlarge into ds2.8xlarge, or ds1.xlarge into ds2.xlarge. If you have a DC instance type, you must restore into that same instance type and size. In other words, you can only restore a dc1.large instance type into another dc1.large instance type or dc2.large instance type. You can't restore dc1.8xlarge to dc2.8xlarge. First restore to a dc1.8xlarge cluster, then resize to a dc2.8large cluster. For more information about node types, see  About Clusters and Nodes in the Amazon Redshift Cluster Management Guide. 
    */
  var NodeType: js.UndefOr[String] = js.native
  
  /**
    * The number of nodes specified when provisioning the restored cluster.
    */
  var NumberOfNodes: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The AWS customer account used to create or copy the snapshot. Required if you are restoring a snapshot you do not own, optional if you own the snapshot.
    */
  var OwnerAccount: js.UndefOr[String] = js.native
  
  /**
    * The port number on which the cluster accepts connections. Default: The same port as the original cluster. Constraints: Must be between 1115 and 65535.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The weekly time range (in UTC) during which automated cluster maintenance can occur.  Format: ddd:hh24:mi-ddd:hh24:mi   Default: The value selected for the cluster from which the snapshot was taken. For more information about the time blocks for each region, see Maintenance Windows in Amazon Redshift Cluster Management Guide.  Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun Constraints: Minimum 30-minute window.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  
  /**
    * If true, the cluster can be accessed from a public network. 
    */
  var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The name of the cluster the source snapshot was created from. This parameter is required if your IAM user has a policy containing a snapshot resource element that specifies anything other than * for the cluster name.
    */
  var SnapshotClusterIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The name of the snapshot from which to create the new cluster. This parameter isn't case sensitive. Example: my-snapshot-id 
    */
  var SnapshotIdentifier: String = js.native
  
  /**
    * A unique identifier for the snapshot schedule.
    */
  var SnapshotScheduleIdentifier: js.UndefOr[String] = js.native
  
  /**
    * A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster. Default: The default VPC security group is associated with the cluster. VPC security groups only apply to clusters in VPCs.
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.native
}
object RestoreFromClusterSnapshotMessage {
  
  @scala.inline
  def apply(ClusterIdentifier: String, SnapshotIdentifier: String): RestoreFromClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any], SnapshotIdentifier = SnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreFromClusterSnapshotMessage]
  }
  
  @scala.inline
  implicit class RestoreFromClusterSnapshotMessageOps[Self <: RestoreFromClusterSnapshotMessage] (val x: Self) extends AnyVal {
    
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
    def setClusterIdentifier(value: String): Self = this.set("ClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotIdentifier(value: String): Self = this.set("SnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalInfo(value: String): Self = this.set("AdditionalInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalInfo: Self = this.set("AdditionalInfo", js.undefined)
    
    @scala.inline
    def setAllowVersionUpgrade(value: BooleanOptional): Self = this.set("AllowVersionUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowVersionUpgrade: Self = this.set("AllowVersionUpgrade", js.undefined)
    
    @scala.inline
    def setAutomatedSnapshotRetentionPeriod(value: IntegerOptional): Self = this.set("AutomatedSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomatedSnapshotRetentionPeriod: Self = this.set("AutomatedSnapshotRetentionPeriod", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    
    @scala.inline
    def setClusterParameterGroupName(value: String): Self = this.set("ClusterParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterParameterGroupName: Self = this.set("ClusterParameterGroupName", js.undefined)
    
    @scala.inline
    def setClusterSecurityGroupsVarargs(value: String*): Self = this.set("ClusterSecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setClusterSecurityGroups(value: ClusterSecurityGroupNameList): Self = this.set("ClusterSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterSecurityGroups: Self = this.set("ClusterSecurityGroups", js.undefined)
    
    @scala.inline
    def setClusterSubnetGroupName(value: String): Self = this.set("ClusterSubnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterSubnetGroupName: Self = this.set("ClusterSubnetGroupName", js.undefined)
    
    @scala.inline
    def setElasticIp(value: String): Self = this.set("ElasticIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElasticIp: Self = this.set("ElasticIp", js.undefined)
    
    @scala.inline
    def setEnhancedVpcRouting(value: BooleanOptional): Self = this.set("EnhancedVpcRouting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnhancedVpcRouting: Self = this.set("EnhancedVpcRouting", js.undefined)
    
    @scala.inline
    def setHsmClientCertificateIdentifier(value: String): Self = this.set("HsmClientCertificateIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHsmClientCertificateIdentifier: Self = this.set("HsmClientCertificateIdentifier", js.undefined)
    
    @scala.inline
    def setHsmConfigurationIdentifier(value: String): Self = this.set("HsmConfigurationIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHsmConfigurationIdentifier: Self = this.set("HsmConfigurationIdentifier", js.undefined)
    
    @scala.inline
    def setIamRolesVarargs(value: String*): Self = this.set("IamRoles", js.Array(value :_*))
    
    @scala.inline
    def setIamRoles(value: IamRoleArnList): Self = this.set("IamRoles", value.asInstanceOf[js.Any])
    
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
    def setManualSnapshotRetentionPeriod(value: IntegerOptional): Self = this.set("ManualSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManualSnapshotRetentionPeriod: Self = this.set("ManualSnapshotRetentionPeriod", js.undefined)
    
    @scala.inline
    def setNodeType(value: String): Self = this.set("NodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeType: Self = this.set("NodeType", js.undefined)
    
    @scala.inline
    def setNumberOfNodes(value: IntegerOptional): Self = this.set("NumberOfNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfNodes: Self = this.set("NumberOfNodes", js.undefined)
    
    @scala.inline
    def setOwnerAccount(value: String): Self = this.set("OwnerAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerAccount: Self = this.set("OwnerAccount", js.undefined)
    
    @scala.inline
    def setPort(value: IntegerOptional): Self = this.set("Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: String): Self = this.set("PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredMaintenanceWindow: Self = this.set("PreferredMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setPubliclyAccessible(value: BooleanOptional): Self = this.set("PubliclyAccessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubliclyAccessible: Self = this.set("PubliclyAccessible", js.undefined)
    
    @scala.inline
    def setSnapshotClusterIdentifier(value: String): Self = this.set("SnapshotClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotClusterIdentifier: Self = this.set("SnapshotClusterIdentifier", js.undefined)
    
    @scala.inline
    def setSnapshotScheduleIdentifier(value: String): Self = this.set("SnapshotScheduleIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotScheduleIdentifier: Self = this.set("SnapshotScheduleIdentifier", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupIdsVarargs(value: String*): Self = this.set("VpcSecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setVpcSecurityGroupIds(value: VpcSecurityGroupIdList): Self = this.set("VpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcSecurityGroupIds: Self = this.set("VpcSecurityGroupIds", js.undefined)
  }
}
