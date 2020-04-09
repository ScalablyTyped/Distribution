package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClusterMessage extends js.Object {
  /**
    * Reserved.
    */
  var AdditionalInfo: js.UndefOr[String] = js.native
  /**
    * If true, major version upgrades can be applied during the maintenance window to the Amazon Redshift engine that is running on the cluster. When a new major version of the Amazon Redshift engine is released, you can request that the service automatically apply upgrades during the maintenance window to the Amazon Redshift engine that is running on your cluster. Default: true 
    */
  var AllowVersionUpgrade: js.UndefOr[BooleanOptional] = js.native
  /**
    * The number of days that automated snapshots are retained. If the value is 0, automated snapshots are disabled. Even if automated snapshots are disabled, you can still create manual snapshots when you want with CreateClusterSnapshot.  Default: 1  Constraints: Must be a value from 0 to 35.
    */
  var AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  /**
    * The EC2 Availability Zone (AZ) in which you want Amazon Redshift to provision the cluster. For example, if you have several EC2 instances running in a specific Availability Zone, then you might want the cluster to be provisioned in the same zone in order to decrease network latency. Default: A random, system-chosen Availability Zone in the region that is specified by the endpoint. Example: us-east-2d  Constraint: The specified Availability Zone must be in the same region as the current endpoint.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * A unique identifier for the cluster. You use this identifier to refer to the cluster for any subsequent cluster operations such as deleting or modifying. The identifier also appears in the Amazon Redshift console. Constraints:   Must contain from 1 to 63 alphanumeric characters or hyphens.   Alphabetic characters must be lowercase.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Must be unique for all clusters within an AWS account.   Example: myexamplecluster 
    */
  var ClusterIdentifier: String = js.native
  /**
    * The name of the parameter group to be associated with this cluster. Default: The default Amazon Redshift cluster parameter group. For information about the default parameter group, go to Working with Amazon Redshift Parameter Groups  Constraints:   Must be 1 to 255 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
    */
  var ClusterParameterGroupName: js.UndefOr[String] = js.native
  /**
    * A list of security groups to be associated with this cluster. Default: The default cluster security group for Amazon Redshift.
    */
  var ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroupNameList] = js.native
  /**
    * The name of a cluster subnet group to be associated with this cluster. If this parameter is not provided the resulting cluster will be deployed outside virtual private cloud (VPC).
    */
  var ClusterSubnetGroupName: js.UndefOr[String] = js.native
  /**
    * The type of the cluster. When cluster type is specified as    single-node, the NumberOfNodes parameter is not required.    multi-node, the NumberOfNodes parameter is required.   Valid Values: multi-node | single-node  Default: multi-node 
    */
  var ClusterType: js.UndefOr[String] = js.native
  /**
    * The version of the Amazon Redshift engine software that you want to deploy on the cluster. The version selected runs on all the nodes in the cluster. Constraints: Only version 1.0 is currently available. Example: 1.0 
    */
  var ClusterVersion: js.UndefOr[String] = js.native
  /**
    * The name of the first database to be created when the cluster is created. To create additional databases after the cluster is created, connect to the cluster with a SQL client and use SQL commands to create a database. For more information, go to Create a Database in the Amazon Redshift Database Developer Guide.  Default: dev  Constraints:   Must contain 1 to 64 alphanumeric characters.   Must contain only lowercase letters.   Cannot be a word that is reserved by the service. A list of reserved words can be found in Reserved Words in the Amazon Redshift Database Developer Guide.   
    */
  var DBName: js.UndefOr[String] = js.native
  /**
    * The Elastic IP (EIP) address for the cluster. Constraints: The cluster must be provisioned in EC2-VPC and publicly-accessible through an Internet gateway. For more information about provisioning clusters in EC2-VPC, go to Supported Platforms to Launch Your Cluster in the Amazon Redshift Cluster Management Guide.
    */
  var ElasticIp: js.UndefOr[String] = js.native
  /**
    * If true, the data in the cluster is encrypted at rest.  Default: false
    */
  var Encrypted: js.UndefOr[BooleanOptional] = js.native
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
    * A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other AWS services. You must supply the IAM roles in their Amazon Resource Name (ARN) format. You can supply up to 10 IAM roles in a single request. A cluster can have up to 10 IAM roles associated with it at any time.
    */
  var IamRoles: js.UndefOr[IamRoleArnList] = js.native
  /**
    * The AWS Key Management Service (KMS) key ID of the encryption key that you want to use to encrypt data in the cluster.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * An optional parameter for the name of the maintenance track for the cluster. If you don't provide a maintenance track name, the cluster is assigned to the current track.
    */
  var MaintenanceTrackName: js.UndefOr[String] = js.native
  /**
    * The default number of days to retain a manual snapshot. If the value is -1, the snapshot is retained indefinitely. This setting doesn't change the retention period of existing snapshots. The value must be either -1 or an integer between 1 and 3,653.
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  /**
    * The password associated with the master user account for the cluster that is being created. Constraints:   Must be between 8 and 64 characters in length.   Must contain at least one uppercase letter.   Must contain at least one lowercase letter.   Must contain one number.   Can be any printable ASCII character (ASCII code 33 to 126) except ' (single quote), " (double quote), \, /, @, or space.  
    */
  var MasterUserPassword: String = js.native
  /**
    * The user name associated with the master user account for the cluster that is being created. Constraints:   Must be 1 - 128 alphanumeric characters. The user name can't be PUBLIC.   First character must be a letter.   Cannot be a reserved word. A list of reserved words can be found in Reserved Words in the Amazon Redshift Database Developer Guide.   
    */
  var MasterUsername: String = js.native
  /**
    * The node type to be provisioned for the cluster. For information about node types, go to  Working with Clusters in the Amazon Redshift Cluster Management Guide.  Valid Values: ds2.xlarge | ds2.8xlarge | dc1.large | dc1.8xlarge | dc2.large | dc2.8xlarge | ra3.4xlarge | ra3.16xlarge 
    */
  var NodeType: String = js.native
  /**
    * The number of compute nodes in the cluster. This parameter is required when the ClusterType parameter is specified as multi-node.  For information about determining how many nodes you need, go to  Working with Clusters in the Amazon Redshift Cluster Management Guide.  If you don't specify this parameter, you get a single-node cluster. When requesting a multi-node cluster, you must specify the number of nodes that you want in the cluster. Default: 1  Constraints: Value must be at least 1 and no more than 100.
    */
  var NumberOfNodes: js.UndefOr[IntegerOptional] = js.native
  /**
    * The port number on which the cluster accepts incoming connections. The cluster is accessible only via the JDBC and ODBC connection strings. Part of the connection string requires the port on which the cluster will listen for incoming connections. Default: 5439  Valid Values: 1150-65535 
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  /**
    * The weekly time range (in UTC) during which automated cluster maintenance can occur.  Format: ddd:hh24:mi-ddd:hh24:mi   Default: A 30-minute window selected at random from an 8-hour block of time per region, occurring on a random day of the week. For more information about the time blocks for each region, see Maintenance Windows in Amazon Redshift Cluster Management Guide. Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun Constraints: Minimum 30-minute window.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  /**
    * If true, the cluster can be accessed from a public network. 
    */
  var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.native
  /**
    * A unique identifier for the snapshot schedule.
    */
  var SnapshotScheduleIdentifier: js.UndefOr[String] = js.native
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster. Default: The default VPC security group is associated with the cluster.
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.native
}

object CreateClusterMessage {
  @scala.inline
  def apply(
    ClusterIdentifier: String,
    MasterUserPassword: String,
    MasterUsername: String,
    NodeType: String,
    AdditionalInfo: String = null,
    AllowVersionUpgrade: js.UndefOr[scala.Boolean] = js.undefined,
    AutomatedSnapshotRetentionPeriod: Int | scala.Double = null,
    AvailabilityZone: String = null,
    ClusterParameterGroupName: String = null,
    ClusterSecurityGroups: ClusterSecurityGroupNameList = null,
    ClusterSubnetGroupName: String = null,
    ClusterType: String = null,
    ClusterVersion: String = null,
    DBName: String = null,
    ElasticIp: String = null,
    Encrypted: js.UndefOr[scala.Boolean] = js.undefined,
    EnhancedVpcRouting: js.UndefOr[scala.Boolean] = js.undefined,
    HsmClientCertificateIdentifier: String = null,
    HsmConfigurationIdentifier: String = null,
    IamRoles: IamRoleArnList = null,
    KmsKeyId: String = null,
    MaintenanceTrackName: String = null,
    ManualSnapshotRetentionPeriod: Int | scala.Double = null,
    NumberOfNodes: Int | scala.Double = null,
    Port: Int | scala.Double = null,
    PreferredMaintenanceWindow: String = null,
    PubliclyAccessible: js.UndefOr[scala.Boolean] = js.undefined,
    SnapshotScheduleIdentifier: String = null,
    Tags: TagList = null,
    VpcSecurityGroupIds: VpcSecurityGroupIdList = null
  ): CreateClusterMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any], MasterUserPassword = MasterUserPassword.asInstanceOf[js.Any], MasterUsername = MasterUsername.asInstanceOf[js.Any], NodeType = NodeType.asInstanceOf[js.Any])
    if (AdditionalInfo != null) __obj.updateDynamic("AdditionalInfo")(AdditionalInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(AllowVersionUpgrade)) __obj.updateDynamic("AllowVersionUpgrade")(AllowVersionUpgrade.asInstanceOf[js.Any])
    if (AutomatedSnapshotRetentionPeriod != null) __obj.updateDynamic("AutomatedSnapshotRetentionPeriod")(AutomatedSnapshotRetentionPeriod.asInstanceOf[js.Any])
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (ClusterParameterGroupName != null) __obj.updateDynamic("ClusterParameterGroupName")(ClusterParameterGroupName.asInstanceOf[js.Any])
    if (ClusterSecurityGroups != null) __obj.updateDynamic("ClusterSecurityGroups")(ClusterSecurityGroups.asInstanceOf[js.Any])
    if (ClusterSubnetGroupName != null) __obj.updateDynamic("ClusterSubnetGroupName")(ClusterSubnetGroupName.asInstanceOf[js.Any])
    if (ClusterType != null) __obj.updateDynamic("ClusterType")(ClusterType.asInstanceOf[js.Any])
    if (ClusterVersion != null) __obj.updateDynamic("ClusterVersion")(ClusterVersion.asInstanceOf[js.Any])
    if (DBName != null) __obj.updateDynamic("DBName")(DBName.asInstanceOf[js.Any])
    if (ElasticIp != null) __obj.updateDynamic("ElasticIp")(ElasticIp.asInstanceOf[js.Any])
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted.asInstanceOf[js.Any])
    if (!js.isUndefined(EnhancedVpcRouting)) __obj.updateDynamic("EnhancedVpcRouting")(EnhancedVpcRouting.asInstanceOf[js.Any])
    if (HsmClientCertificateIdentifier != null) __obj.updateDynamic("HsmClientCertificateIdentifier")(HsmClientCertificateIdentifier.asInstanceOf[js.Any])
    if (HsmConfigurationIdentifier != null) __obj.updateDynamic("HsmConfigurationIdentifier")(HsmConfigurationIdentifier.asInstanceOf[js.Any])
    if (IamRoles != null) __obj.updateDynamic("IamRoles")(IamRoles.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (MaintenanceTrackName != null) __obj.updateDynamic("MaintenanceTrackName")(MaintenanceTrackName.asInstanceOf[js.Any])
    if (ManualSnapshotRetentionPeriod != null) __obj.updateDynamic("ManualSnapshotRetentionPeriod")(ManualSnapshotRetentionPeriod.asInstanceOf[js.Any])
    if (NumberOfNodes != null) __obj.updateDynamic("NumberOfNodes")(NumberOfNodes.asInstanceOf[js.Any])
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow.asInstanceOf[js.Any])
    if (!js.isUndefined(PubliclyAccessible)) __obj.updateDynamic("PubliclyAccessible")(PubliclyAccessible.asInstanceOf[js.Any])
    if (SnapshotScheduleIdentifier != null) __obj.updateDynamic("SnapshotScheduleIdentifier")(SnapshotScheduleIdentifier.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (VpcSecurityGroupIds != null) __obj.updateDynamic("VpcSecurityGroupIds")(VpcSecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterMessage]
  }
}

