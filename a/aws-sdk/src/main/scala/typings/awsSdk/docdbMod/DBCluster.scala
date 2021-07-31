package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBCluster extends StObject {
  
  /**
    * Provides a list of the AWS Identity and Access Management (IAM) roles that are associated with the cluster. IAM roles that are associated with a cluster grant permission for the cluster to access other AWS services on your behalf.
    */
  var AssociatedRoles: js.UndefOr[DBClusterRoles] = js.undefined
  
  /**
    * Provides the list of Amazon EC2 Availability Zones that instances in the cluster can be created in.
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.docdbMod.AvailabilityZones] = js.undefined
  
  /**
    * Specifies the number of days for which automatic snapshots are retained.
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Specifies the time when the cluster was created, in Universal Coordinated Time (UTC).
    */
  var ClusterCreateTime: js.UndefOr[TStamp] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the cluster.
    */
  var DBClusterArn: js.UndefOr[String] = js.undefined
  
  /**
    * Contains a user-supplied cluster identifier. This identifier is the unique key that identifies a cluster.
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * Provides the list of instances that make up the cluster.
    */
  var DBClusterMembers: js.UndefOr[DBClusterMemberList] = js.undefined
  
  /**
    * Specifies the name of the cluster parameter group for the cluster.
    */
  var DBClusterParameterGroup: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies information on the subnet group that is associated with the cluster, including the name, description, and subnets in the subnet group.
    */
  var DBSubnetGroup: js.UndefOr[String] = js.undefined
  
  /**
    * The AWS Region-unique, immutable identifier for the cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the cluster is accessed.
    */
  var DbClusterResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether this cluster can be deleted. If DeletionProtection is enabled, the cluster cannot be deleted unless it is modified and DeletionProtection is disabled. DeletionProtection protects clusters from being accidentally deleted.
    */
  var DeletionProtection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The earliest time to which a database can be restored with point-in-time restore.
    */
  var EarliestRestorableTime: js.UndefOr[TStamp] = js.undefined
  
  /**
    * A list of log types that this cluster is configured to export to Amazon CloudWatch Logs.
    */
  var EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
  
  /**
    * Specifies the connection endpoint for the primary instance of the cluster.
    */
  var Endpoint: js.UndefOr[String] = js.undefined
  
  /**
    * Provides the name of the database engine to be used for this cluster.
    */
  var Engine: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the database engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the ID that Amazon Route 53 assigns when you create a hosted zone.
    */
  var HostedZoneId: js.UndefOr[String] = js.undefined
  
  /**
    * If StorageEncrypted is true, the AWS KMS key identifier for the encrypted cluster.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the latest time to which a database can be restored with point-in-time restore.
    */
  var LatestRestorableTime: js.UndefOr[TStamp] = js.undefined
  
  /**
    * Contains the master user name for the cluster.
    */
  var MasterUsername: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the cluster has instances in multiple Availability Zones.
    */
  var MultiAZ: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the progress of the operation as a percentage.
    */
  var PercentProgress: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the port that the database engine is listening on.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Specifies the daily time range during which automated backups are created if automated backups are enabled, as determined by the BackupRetentionPeriod. 
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  
  /**
    * The reader endpoint for the cluster. The reader endpoint for a cluster load balances connections across the Amazon DocumentDB replicas that are available in a cluster. As clients request new connections to the reader endpoint, Amazon DocumentDB distributes the connection requests among the Amazon DocumentDB replicas in the cluster. This functionality can help balance your read workload across multiple Amazon DocumentDB replicas in your cluster.  If a failover occurs, and the Amazon DocumentDB replica that you are connected to is promoted to be the primary instance, your connection is dropped. To continue sending your read workload to other Amazon DocumentDB replicas in the cluster, you can then reconnect to the reader endpoint.
    */
  var ReaderEndpoint: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the current state of this cluster.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the cluster is encrypted.
    */
  var StorageEncrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Provides a list of virtual private cloud (VPC) security groups that the cluster belongs to.
    */
  var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined
}
object DBCluster {
  
  @scala.inline
  def apply(): DBCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBCluster]
  }
  
  @scala.inline
  implicit class DBClusterMutableBuilder[Self <: DBCluster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociatedRoles(value: DBClusterRoles): Self = StObject.set(x, "AssociatedRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedRolesUndefined: Self = StObject.set(x, "AssociatedRoles", js.undefined)
    
    @scala.inline
    def setAssociatedRolesVarargs(value: DBClusterRole*): Self = StObject.set(x, "AssociatedRoles", js.Array(value :_*))
    
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZones): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setBackupRetentionPeriod(value: IntegerOptional): Self = StObject.set(x, "BackupRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupRetentionPeriodUndefined: Self = StObject.set(x, "BackupRetentionPeriod", js.undefined)
    
    @scala.inline
    def setClusterCreateTime(value: TStamp): Self = StObject.set(x, "ClusterCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterCreateTimeUndefined: Self = StObject.set(x, "ClusterCreateTime", js.undefined)
    
    @scala.inline
    def setDBClusterArn(value: String): Self = StObject.set(x, "DBClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterArnUndefined: Self = StObject.set(x, "DBClusterArn", js.undefined)
    
    @scala.inline
    def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterIdentifierUndefined: Self = StObject.set(x, "DBClusterIdentifier", js.undefined)
    
    @scala.inline
    def setDBClusterMembers(value: DBClusterMemberList): Self = StObject.set(x, "DBClusterMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterMembersUndefined: Self = StObject.set(x, "DBClusterMembers", js.undefined)
    
    @scala.inline
    def setDBClusterMembersVarargs(value: DBClusterMember*): Self = StObject.set(x, "DBClusterMembers", js.Array(value :_*))
    
    @scala.inline
    def setDBClusterParameterGroup(value: String): Self = StObject.set(x, "DBClusterParameterGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterParameterGroupUndefined: Self = StObject.set(x, "DBClusterParameterGroup", js.undefined)
    
    @scala.inline
    def setDBSubnetGroup(value: String): Self = StObject.set(x, "DBSubnetGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSubnetGroupUndefined: Self = StObject.set(x, "DBSubnetGroup", js.undefined)
    
    @scala.inline
    def setDbClusterResourceId(value: String): Self = StObject.set(x, "DbClusterResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbClusterResourceIdUndefined: Self = StObject.set(x, "DbClusterResourceId", js.undefined)
    
    @scala.inline
    def setDeletionProtection(value: Boolean): Self = StObject.set(x, "DeletionProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionProtectionUndefined: Self = StObject.set(x, "DeletionProtection", js.undefined)
    
    @scala.inline
    def setEarliestRestorableTime(value: TStamp): Self = StObject.set(x, "EarliestRestorableTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEarliestRestorableTimeUndefined: Self = StObject.set(x, "EarliestRestorableTime", js.undefined)
    
    @scala.inline
    def setEnabledCloudwatchLogsExports(value: LogTypeList): Self = StObject.set(x, "EnabledCloudwatchLogsExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledCloudwatchLogsExportsUndefined: Self = StObject.set(x, "EnabledCloudwatchLogsExports", js.undefined)
    
    @scala.inline
    def setEnabledCloudwatchLogsExportsVarargs(value: String*): Self = StObject.set(x, "EnabledCloudwatchLogsExports", js.Array(value :_*))
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setHostedZoneId(value: String): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedZoneIdUndefined: Self = StObject.set(x, "HostedZoneId", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setLatestRestorableTime(value: TStamp): Self = StObject.set(x, "LatestRestorableTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestRestorableTimeUndefined: Self = StObject.set(x, "LatestRestorableTime", js.undefined)
    
    @scala.inline
    def setMasterUsername(value: String): Self = StObject.set(x, "MasterUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterUsernameUndefined: Self = StObject.set(x, "MasterUsername", js.undefined)
    
    @scala.inline
    def setMultiAZ(value: Boolean): Self = StObject.set(x, "MultiAZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiAZUndefined: Self = StObject.set(x, "MultiAZ", js.undefined)
    
    @scala.inline
    def setPercentProgress(value: String): Self = StObject.set(x, "PercentProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentProgressUndefined: Self = StObject.set(x, "PercentProgress", js.undefined)
    
    @scala.inline
    def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    @scala.inline
    def setPreferredBackupWindow(value: String): Self = StObject.set(x, "PreferredBackupWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredBackupWindowUndefined: Self = StObject.set(x, "PreferredBackupWindow", js.undefined)
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "PreferredMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setReaderEndpoint(value: String): Self = StObject.set(x, "ReaderEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReaderEndpointUndefined: Self = StObject.set(x, "ReaderEndpoint", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setStorageEncrypted(value: Boolean): Self = StObject.set(x, "StorageEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageEncryptedUndefined: Self = StObject.set(x, "StorageEncrypted", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroups(value: VpcSecurityGroupMembershipList): Self = StObject.set(x, "VpcSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcSecurityGroupsUndefined: Self = StObject.set(x, "VpcSecurityGroups", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupsVarargs(value: VpcSecurityGroupMembership*): Self = StObject.set(x, "VpcSecurityGroups", js.Array(value :_*))
  }
}
