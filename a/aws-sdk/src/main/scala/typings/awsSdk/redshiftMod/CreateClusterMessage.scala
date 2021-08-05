package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClusterMessage extends StObject {
  
  /**
    * Reserved.
    */
  var AdditionalInfo: js.UndefOr[String] = js.undefined
  
  /**
    * If true, major version upgrades can be applied during the maintenance window to the Amazon Redshift engine that is running on the cluster. When a new major version of the Amazon Redshift engine is released, you can request that the service automatically apply upgrades during the maintenance window to the Amazon Redshift engine that is running on your cluster. Default: true 
    */
  var AllowVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The number of days that automated snapshots are retained. If the value is 0, automated snapshots are disabled. Even if automated snapshots are disabled, you can still create manual snapshots when you want with CreateClusterSnapshot.  Default: 1  Constraints: Must be a value from 0 to 35.
    */
  var AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The EC2 Availability Zone (AZ) in which you want Amazon Redshift to provision the cluster. For example, if you have several EC2 instances running in a specific Availability Zone, then you might want the cluster to be provisioned in the same zone in order to decrease network latency. Default: A random, system-chosen Availability Zone in the region that is specified by the endpoint. Example: us-east-2d  Constraint: The specified Availability Zone must be in the same region as the current endpoint.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * A unique identifier for the cluster. You use this identifier to refer to the cluster for any subsequent cluster operations such as deleting or modifying. The identifier also appears in the Amazon Redshift console. Constraints:   Must contain from 1 to 63 alphanumeric characters or hyphens.   Alphabetic characters must be lowercase.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Must be unique for all clusters within an AWS account.   Example: myexamplecluster 
    */
  var ClusterIdentifier: String
  
  /**
    * The name of the parameter group to be associated with this cluster. Default: The default Amazon Redshift cluster parameter group. For information about the default parameter group, go to Working with Amazon Redshift Parameter Groups  Constraints:   Must be 1 to 255 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
    */
  var ClusterParameterGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * A list of security groups to be associated with this cluster. Default: The default cluster security group for Amazon Redshift.
    */
  var ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroupNameList] = js.undefined
  
  /**
    * The name of a cluster subnet group to be associated with this cluster. If this parameter is not provided the resulting cluster will be deployed outside virtual private cloud (VPC).
    */
  var ClusterSubnetGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the cluster. When cluster type is specified as    single-node, the NumberOfNodes parameter is not required.    multi-node, the NumberOfNodes parameter is required.   Valid Values: multi-node | single-node  Default: multi-node 
    */
  var ClusterType: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the Amazon Redshift engine software that you want to deploy on the cluster. The version selected runs on all the nodes in the cluster. Constraints: Only version 1.0 is currently available. Example: 1.0 
    */
  var ClusterVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the first database to be created when the cluster is created. To create additional databases after the cluster is created, connect to the cluster with a SQL client and use SQL commands to create a database. For more information, go to Create a Database in the Amazon Redshift Database Developer Guide.  Default: dev  Constraints:   Must contain 1 to 64 alphanumeric characters.   Must contain only lowercase letters.   Cannot be a word that is reserved by the service. A list of reserved words can be found in Reserved Words in the Amazon Redshift Database Developer Guide.   
    */
  var DBName: js.UndefOr[String] = js.undefined
  
  /**
    * The Elastic IP (EIP) address for the cluster. Constraints: The cluster must be provisioned in EC2-VPC and publicly-accessible through an Internet gateway. For more information about provisioning clusters in EC2-VPC, go to Supported Platforms to Launch Your Cluster in the Amazon Redshift Cluster Management Guide.
    */
  var ElasticIp: js.UndefOr[String] = js.undefined
  
  /**
    * If true, the data in the cluster is encrypted at rest.  Default: false
    */
  var Encrypted: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see Enhanced VPC Routing in the Amazon Redshift Cluster Management Guide. If this option is true, enhanced VPC routing is enabled.  Default: false
    */
  var EnhancedVpcRouting: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Specifies the name of the HSM client certificate the Amazon Redshift cluster uses to retrieve the data encryption keys stored in an HSM.
    */
  var HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the name of the HSM configuration that contains the information the Amazon Redshift cluster can use to retrieve and store keys in an HSM.
    */
  var HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other AWS services. You must supply the IAM roles in their Amazon Resource Name (ARN) format. You can supply up to 10 IAM roles in a single request. A cluster can have up to 10 IAM roles associated with it at any time.
    */
  var IamRoles: js.UndefOr[IamRoleArnList] = js.undefined
  
  /**
    * The AWS Key Management Service (KMS) key ID of the encryption key that you want to use to encrypt data in the cluster.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * An optional parameter for the name of the maintenance track for the cluster. If you don't provide a maintenance track name, the cluster is assigned to the current track.
    */
  var MaintenanceTrackName: js.UndefOr[String] = js.undefined
  
  /**
    * The default number of days to retain a manual snapshot. If the value is -1, the snapshot is retained indefinitely. This setting doesn't change the retention period of existing snapshots. The value must be either -1 or an integer between 1 and 3,653.
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The password associated with the master user account for the cluster that is being created. Constraints:   Must be between 8 and 64 characters in length.   Must contain at least one uppercase letter.   Must contain at least one lowercase letter.   Must contain one number.   Can be any printable ASCII character (ASCII code 33 to 126) except ' (single quote), " (double quote), \, /, @, or space.  
    */
  var MasterUserPassword: String
  
  /**
    * The user name associated with the master user account for the cluster that is being created. Constraints:   Must be 1 - 128 alphanumeric characters. The user name can't be PUBLIC.   First character must be a letter.   Cannot be a reserved word. A list of reserved words can be found in Reserved Words in the Amazon Redshift Database Developer Guide.   
    */
  var MasterUsername: String
  
  /**
    * The node type to be provisioned for the cluster. For information about node types, go to  Working with Clusters in the Amazon Redshift Cluster Management Guide.  Valid Values: ds2.xlarge | ds2.8xlarge | dc1.large | dc1.8xlarge | dc2.large | dc2.8xlarge | ra3.4xlarge | ra3.16xlarge 
    */
  var NodeType: String
  
  /**
    * The number of compute nodes in the cluster. This parameter is required when the ClusterType parameter is specified as multi-node.  For information about determining how many nodes you need, go to  Working with Clusters in the Amazon Redshift Cluster Management Guide.  If you don't specify this parameter, you get a single-node cluster. When requesting a multi-node cluster, you must specify the number of nodes that you want in the cluster. Default: 1  Constraints: Value must be at least 1 and no more than 100.
    */
  var NumberOfNodes: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The port number on which the cluster accepts incoming connections. The cluster is accessible only via the JDBC and ODBC connection strings. Part of the connection string requires the port on which the cluster will listen for incoming connections. Default: 5439  Valid Values: 1150-65535 
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The weekly time range (in UTC) during which automated cluster maintenance can occur.  Format: ddd:hh24:mi-ddd:hh24:mi   Default: A 30-minute window selected at random from an 8-hour block of time per region, occurring on a random day of the week. For more information about the time blocks for each region, see Maintenance Windows in Amazon Redshift Cluster Management Guide. Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun Constraints: Minimum 30-minute window.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  
  /**
    * If true, the cluster can be accessed from a public network. 
    */
  var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A unique identifier for the snapshot schedule.
    */
  var SnapshotScheduleIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster. Default: The default VPC security group is associated with the cluster.
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
}
object CreateClusterMessage {
  
  inline def apply(ClusterIdentifier: String, MasterUserPassword: String, MasterUsername: String, NodeType: String): CreateClusterMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any], MasterUserPassword = MasterUserPassword.asInstanceOf[js.Any], MasterUsername = MasterUsername.asInstanceOf[js.Any], NodeType = NodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterMessage]
  }
  
  extension [Self <: CreateClusterMessage](x: Self) {
    
    inline def setAdditionalInfo(value: String): Self = StObject.set(x, "AdditionalInfo", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoUndefined: Self = StObject.set(x, "AdditionalInfo", js.undefined)
    
    inline def setAllowVersionUpgrade(value: BooleanOptional): Self = StObject.set(x, "AllowVersionUpgrade", value.asInstanceOf[js.Any])
    
    inline def setAllowVersionUpgradeUndefined: Self = StObject.set(x, "AllowVersionUpgrade", js.undefined)
    
    inline def setAutomatedSnapshotRetentionPeriod(value: IntegerOptional): Self = StObject.set(x, "AutomatedSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setAutomatedSnapshotRetentionPeriodUndefined: Self = StObject.set(x, "AutomatedSnapshotRetentionPeriod", js.undefined)
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setClusterParameterGroupName(value: String): Self = StObject.set(x, "ClusterParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setClusterParameterGroupNameUndefined: Self = StObject.set(x, "ClusterParameterGroupName", js.undefined)
    
    inline def setClusterSecurityGroups(value: ClusterSecurityGroupNameList): Self = StObject.set(x, "ClusterSecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setClusterSecurityGroupsUndefined: Self = StObject.set(x, "ClusterSecurityGroups", js.undefined)
    
    inline def setClusterSecurityGroupsVarargs(value: String*): Self = StObject.set(x, "ClusterSecurityGroups", js.Array(value :_*))
    
    inline def setClusterSubnetGroupName(value: String): Self = StObject.set(x, "ClusterSubnetGroupName", value.asInstanceOf[js.Any])
    
    inline def setClusterSubnetGroupNameUndefined: Self = StObject.set(x, "ClusterSubnetGroupName", js.undefined)
    
    inline def setClusterType(value: String): Self = StObject.set(x, "ClusterType", value.asInstanceOf[js.Any])
    
    inline def setClusterTypeUndefined: Self = StObject.set(x, "ClusterType", js.undefined)
    
    inline def setClusterVersion(value: String): Self = StObject.set(x, "ClusterVersion", value.asInstanceOf[js.Any])
    
    inline def setClusterVersionUndefined: Self = StObject.set(x, "ClusterVersion", js.undefined)
    
    inline def setDBName(value: String): Self = StObject.set(x, "DBName", value.asInstanceOf[js.Any])
    
    inline def setDBNameUndefined: Self = StObject.set(x, "DBName", js.undefined)
    
    inline def setElasticIp(value: String): Self = StObject.set(x, "ElasticIp", value.asInstanceOf[js.Any])
    
    inline def setElasticIpUndefined: Self = StObject.set(x, "ElasticIp", js.undefined)
    
    inline def setEncrypted(value: BooleanOptional): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    inline def setEnhancedVpcRouting(value: BooleanOptional): Self = StObject.set(x, "EnhancedVpcRouting", value.asInstanceOf[js.Any])
    
    inline def setEnhancedVpcRoutingUndefined: Self = StObject.set(x, "EnhancedVpcRouting", js.undefined)
    
    inline def setHsmClientCertificateIdentifier(value: String): Self = StObject.set(x, "HsmClientCertificateIdentifier", value.asInstanceOf[js.Any])
    
    inline def setHsmClientCertificateIdentifierUndefined: Self = StObject.set(x, "HsmClientCertificateIdentifier", js.undefined)
    
    inline def setHsmConfigurationIdentifier(value: String): Self = StObject.set(x, "HsmConfigurationIdentifier", value.asInstanceOf[js.Any])
    
    inline def setHsmConfigurationIdentifierUndefined: Self = StObject.set(x, "HsmConfigurationIdentifier", js.undefined)
    
    inline def setIamRoles(value: IamRoleArnList): Self = StObject.set(x, "IamRoles", value.asInstanceOf[js.Any])
    
    inline def setIamRolesUndefined: Self = StObject.set(x, "IamRoles", js.undefined)
    
    inline def setIamRolesVarargs(value: String*): Self = StObject.set(x, "IamRoles", js.Array(value :_*))
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setMaintenanceTrackName(value: String): Self = StObject.set(x, "MaintenanceTrackName", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceTrackNameUndefined: Self = StObject.set(x, "MaintenanceTrackName", js.undefined)
    
    inline def setManualSnapshotRetentionPeriod(value: IntegerOptional): Self = StObject.set(x, "ManualSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setManualSnapshotRetentionPeriodUndefined: Self = StObject.set(x, "ManualSnapshotRetentionPeriod", js.undefined)
    
    inline def setMasterUserPassword(value: String): Self = StObject.set(x, "MasterUserPassword", value.asInstanceOf[js.Any])
    
    inline def setMasterUsername(value: String): Self = StObject.set(x, "MasterUsername", value.asInstanceOf[js.Any])
    
    inline def setNodeType(value: String): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
    
    inline def setNumberOfNodes(value: IntegerOptional): Self = StObject.set(x, "NumberOfNodes", value.asInstanceOf[js.Any])
    
    inline def setNumberOfNodesUndefined: Self = StObject.set(x, "NumberOfNodes", js.undefined)
    
    inline def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "PreferredMaintenanceWindow", js.undefined)
    
    inline def setPubliclyAccessible(value: BooleanOptional): Self = StObject.set(x, "PubliclyAccessible", value.asInstanceOf[js.Any])
    
    inline def setPubliclyAccessibleUndefined: Self = StObject.set(x, "PubliclyAccessible", js.undefined)
    
    inline def setSnapshotScheduleIdentifier(value: String): Self = StObject.set(x, "SnapshotScheduleIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSnapshotScheduleIdentifierUndefined: Self = StObject.set(x, "SnapshotScheduleIdentifier", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    inline def setVpcSecurityGroupIds(value: VpcSecurityGroupIdList): Self = StObject.set(x, "VpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "VpcSecurityGroupIds", js.undefined)
    
    inline def setVpcSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "VpcSecurityGroupIds", js.Array(value :_*))
  }
}
