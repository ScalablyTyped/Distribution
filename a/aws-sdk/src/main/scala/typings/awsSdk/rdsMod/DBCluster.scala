package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBCluster extends js.Object {
  
  /**
    * The name of the Amazon Kinesis data stream used for the database activity stream.
    */
  var ActivityStreamKinesisStreamName: js.UndefOr[String] = js.native
  
  /**
    * The AWS KMS key identifier used for encrypting messages in the database activity stream.
    */
  var ActivityStreamKmsKeyId: js.UndefOr[String] = js.native
  
  /**
    * The mode of the database activity stream. Database events such as a change or access generate an activity stream event. The database session can handle these events either synchronously or asynchronously. 
    */
  var ActivityStreamMode: js.UndefOr[typings.awsSdk.rdsMod.ActivityStreamMode] = js.native
  
  /**
    * The status of the database activity stream.
    */
  var ActivityStreamStatus: js.UndefOr[typings.awsSdk.rdsMod.ActivityStreamStatus] = js.native
  
  /**
    * For all database engines except Amazon Aurora, AllocatedStorage specifies the allocated storage size in gibibytes (GiB). For Aurora, AllocatedStorage always returns 1, because Aurora DB cluster storage size isn't fixed, but instead automatically adjusts as needed.
    */
  var AllocatedStorage: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * Provides a list of the AWS Identity and Access Management (IAM) roles that are associated with the DB cluster. IAM roles that are associated with a DB cluster grant permission for the DB cluster to access other AWS services on your behalf.
    */
  var AssociatedRoles: js.UndefOr[DBClusterRoles] = js.native
  
  /**
    * Provides the list of Availability Zones (AZs) where instances in the DB cluster can be created.
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.rdsMod.AvailabilityZones] = js.native
  
  /**
    * The number of change records stored for Backtrack.
    */
  var BacktrackConsumedChangeRecords: js.UndefOr[LongOptional] = js.native
  
  /**
    * The target backtrack window, in seconds. If this value is set to 0, backtracking is disabled for the DB cluster. Otherwise, backtracking is enabled.
    */
  var BacktrackWindow: js.UndefOr[LongOptional] = js.native
  
  /**
    * Specifies the number of days for which automatic DB snapshots are retained.
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The current capacity of an Aurora Serverless DB cluster. The capacity is 0 (zero) when the cluster is paused. For more information about Aurora Serverless, see Using Amazon Aurora Serverless in the Amazon Aurora User Guide.
    */
  var Capacity: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * If present, specifies the name of the character set that this cluster is associated with.
    */
  var CharacterSetName: js.UndefOr[String] = js.native
  
  /**
    * Identifies the clone group to which the DB cluster is associated.
    */
  var CloneGroupId: js.UndefOr[String] = js.native
  
  /**
    * Specifies the time when the DB cluster was created, in Universal Coordinated Time (UTC).
    */
  var ClusterCreateTime: js.UndefOr[TStamp] = js.native
  
  /**
    * Specifies whether tags are copied from the DB cluster to snapshots of the DB cluster.
    */
  var CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * Specifies whether the DB cluster is a clone of a DB cluster owned by a different AWS account.
    */
  var CrossAccountClone: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * Identifies all custom endpoints associated with the cluster.
    */
  var CustomEndpoints: js.UndefOr[StringList] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the DB cluster.
    */
  var DBClusterArn: js.UndefOr[String] = js.native
  
  /**
    * Contains a user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB cluster.
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.native
  
  /**
    * Provides the list of instances that make up the DB cluster.
    */
  var DBClusterMembers: js.UndefOr[DBClusterMemberList] = js.native
  
  /**
    * Provides the list of option group memberships for this DB cluster.
    */
  var DBClusterOptionGroupMemberships: js.UndefOr[typings.awsSdk.rdsMod.DBClusterOptionGroupMemberships] = js.native
  
  /**
    * Specifies the name of the DB cluster parameter group for the DB cluster.
    */
  var DBClusterParameterGroup: js.UndefOr[String] = js.native
  
  /**
    * Specifies information on the subnet group associated with the DB cluster, including the name, description, and subnets in the subnet group.
    */
  var DBSubnetGroup: js.UndefOr[String] = js.native
  
  /**
    * Contains the name of the initial database of this DB cluster that was provided at create time, if one was specified when the DB cluster was created. This same name is returned for the life of the DB cluster.
    */
  var DatabaseName: js.UndefOr[String] = js.native
  
  /**
    * The AWS Region-unique, immutable identifier for the DB cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed.
    */
  var DbClusterResourceId: js.UndefOr[String] = js.native
  
  /**
    * Indicates if the DB cluster has deletion protection enabled. The database can't be deleted when deletion protection is enabled. 
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The Active Directory Domain membership records associated with the DB cluster.
    */
  var DomainMemberships: js.UndefOr[DomainMembershipList] = js.native
  
  /**
    * The earliest time to which a DB cluster can be backtracked.
    */
  var EarliestBacktrackTime: js.UndefOr[TStamp] = js.native
  
  /**
    * The earliest time to which a database can be restored with point-in-time restore.
    */
  var EarliestRestorableTime: js.UndefOr[TStamp] = js.native
  
  /**
    * A list of log types that this DB cluster is configured to export to CloudWatch Logs. Log types vary by DB engine. For information about the log types for each DB engine, see Amazon RDS Database Log Files in the Amazon Aurora User Guide. 
    */
  var EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.native
  
  /**
    * Specifies the connection endpoint for the primary instance of the DB cluster.
    */
  var Endpoint: js.UndefOr[String] = js.native
  
  /**
    * The name of the database engine to be used for this DB cluster.
    */
  var Engine: js.UndefOr[String] = js.native
  
  /**
    * The DB engine mode of the DB cluster, either provisioned, serverless, parallelquery, global, or multimaster. For more information, see  CreateDBCluster.
    */
  var EngineMode: js.UndefOr[String] = js.native
  
  /**
    * Indicates the database engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether you have requested to enable write forwarding for a secondary cluster in an Aurora global database. Because write forwarding takes time to enable, check the value of GlobalWriteForwardingStatus to confirm that the request has completed before using the write forwarding feature for this cluster.
    */
  var GlobalWriteForwardingRequested: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * Specifies whether a secondary cluster in an Aurora global database has write forwarding enabled, not enabled, or is in the process of enabling it.
    */
  var GlobalWriteForwardingStatus: js.UndefOr[WriteForwardingStatus] = js.native
  
  /**
    * Specifies the ID that Amazon Route 53 assigns when you create a hosted zone.
    */
  var HostedZoneId: js.UndefOr[String] = js.native
  
  /**
    * A value that indicates whether the HTTP endpoint for an Aurora Serverless DB cluster is enabled. When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the Aurora Serverless DB cluster. You can also query your database from inside the RDS console with the query editor. For more information, see Using the Data API for Aurora Serverless in the Amazon Aurora User Guide.
    */
  var HttpEndpointEnabled: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * A value that indicates whether the mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
    */
  var IAMDatabaseAuthenticationEnabled: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * If StorageEncrypted is enabled, the AWS KMS key identifier for the encrypted DB cluster.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  
  /**
    * Specifies the latest time to which a database can be restored with point-in-time restore.
    */
  var LatestRestorableTime: js.UndefOr[TStamp] = js.native
  
  /**
    * Contains the master username for the DB cluster.
    */
  var MasterUsername: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether the DB cluster has instances in multiple Availability Zones.
    */
  var MultiAZ: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * Specifies the progress of the operation as a percentage.
    */
  var PercentProgress: js.UndefOr[String] = js.native
  
  /**
    * Specifies the port that the database engine is listening on.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * Specifies the daily time range during which automated backups are created if automated backups are enabled, as determined by the BackupRetentionPeriod. 
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.native
  
  /**
    * Specifies the weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  
  /**
    * Contains one or more identifiers of the read replicas associated with this DB cluster.
    */
  var ReadReplicaIdentifiers: js.UndefOr[ReadReplicaIdentifierList] = js.native
  
  /**
    * The reader endpoint for the DB cluster. The reader endpoint for a DB cluster load-balances connections across the Aurora Replicas that are available in a DB cluster. As clients request new connections to the reader endpoint, Aurora distributes the connection requests among the Aurora Replicas in the DB cluster. This functionality can help balance your read workload across multiple Aurora Replicas in your DB cluster.  If a failover occurs, and the Aurora Replica that you are connected to is promoted to be the primary instance, your connection is dropped. To continue sending your read workload to other Aurora Replicas in the cluster, you can then reconnect to the reader endpoint.
    */
  var ReaderEndpoint: js.UndefOr[String] = js.native
  
  /**
    * Contains the identifier of the source DB cluster if this DB cluster is a read replica.
    */
  var ReplicationSourceIdentifier: js.UndefOr[String] = js.native
  
  var ScalingConfigurationInfo: js.UndefOr[typings.awsSdk.rdsMod.ScalingConfigurationInfo] = js.native
  
  /**
    * Specifies the current state of this DB cluster.
    */
  var Status: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether the DB cluster is encrypted.
    */
  var StorageEncrypted: js.UndefOr[Boolean] = js.native
  
  var TagList: js.UndefOr[typings.awsSdk.rdsMod.TagList] = js.native
  
  /**
    * Provides a list of VPC security groups that the DB cluster belongs to.
    */
  var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.native
}
object DBCluster {
  
  @scala.inline
  def apply(): DBCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBCluster]
  }
  
  @scala.inline
  implicit class DBClusterOps[Self <: DBCluster] (val x: Self) extends AnyVal {
    
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
    def setActivityStreamKinesisStreamName(value: String): Self = this.set("ActivityStreamKinesisStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityStreamKinesisStreamName: Self = this.set("ActivityStreamKinesisStreamName", js.undefined)
    
    @scala.inline
    def setActivityStreamKmsKeyId(value: String): Self = this.set("ActivityStreamKmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityStreamKmsKeyId: Self = this.set("ActivityStreamKmsKeyId", js.undefined)
    
    @scala.inline
    def setActivityStreamMode(value: ActivityStreamMode): Self = this.set("ActivityStreamMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityStreamMode: Self = this.set("ActivityStreamMode", js.undefined)
    
    @scala.inline
    def setActivityStreamStatus(value: ActivityStreamStatus): Self = this.set("ActivityStreamStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityStreamStatus: Self = this.set("ActivityStreamStatus", js.undefined)
    
    @scala.inline
    def setAllocatedStorage(value: IntegerOptional): Self = this.set("AllocatedStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllocatedStorage: Self = this.set("AllocatedStorage", js.undefined)
    
    @scala.inline
    def setAssociatedRolesVarargs(value: DBClusterRole*): Self = this.set("AssociatedRoles", js.Array(value :_*))
    
    @scala.inline
    def setAssociatedRoles(value: DBClusterRoles): Self = this.set("AssociatedRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociatedRoles: Self = this.set("AssociatedRoles", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: String*): Self = this.set("AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZones): Self = this.set("AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("AvailabilityZones", js.undefined)
    
    @scala.inline
    def setBacktrackConsumedChangeRecords(value: LongOptional): Self = this.set("BacktrackConsumedChangeRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBacktrackConsumedChangeRecords: Self = this.set("BacktrackConsumedChangeRecords", js.undefined)
    
    @scala.inline
    def setBacktrackWindow(value: LongOptional): Self = this.set("BacktrackWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBacktrackWindow: Self = this.set("BacktrackWindow", js.undefined)
    
    @scala.inline
    def setBackupRetentionPeriod(value: IntegerOptional): Self = this.set("BackupRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupRetentionPeriod: Self = this.set("BackupRetentionPeriod", js.undefined)
    
    @scala.inline
    def setCapacity(value: IntegerOptional): Self = this.set("Capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacity: Self = this.set("Capacity", js.undefined)
    
    @scala.inline
    def setCharacterSetName(value: String): Self = this.set("CharacterSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharacterSetName: Self = this.set("CharacterSetName", js.undefined)
    
    @scala.inline
    def setCloneGroupId(value: String): Self = this.set("CloneGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloneGroupId: Self = this.set("CloneGroupId", js.undefined)
    
    @scala.inline
    def setClusterCreateTime(value: TStamp): Self = this.set("ClusterCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterCreateTime: Self = this.set("ClusterCreateTime", js.undefined)
    
    @scala.inline
    def setCopyTagsToSnapshot(value: BooleanOptional): Self = this.set("CopyTagsToSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyTagsToSnapshot: Self = this.set("CopyTagsToSnapshot", js.undefined)
    
    @scala.inline
    def setCrossAccountClone(value: BooleanOptional): Self = this.set("CrossAccountClone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossAccountClone: Self = this.set("CrossAccountClone", js.undefined)
    
    @scala.inline
    def setCustomEndpointsVarargs(value: String*): Self = this.set("CustomEndpoints", js.Array(value :_*))
    
    @scala.inline
    def setCustomEndpoints(value: StringList): Self = this.set("CustomEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomEndpoints: Self = this.set("CustomEndpoints", js.undefined)
    
    @scala.inline
    def setDBClusterArn(value: String): Self = this.set("DBClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBClusterArn: Self = this.set("DBClusterArn", js.undefined)
    
    @scala.inline
    def setDBClusterIdentifier(value: String): Self = this.set("DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBClusterIdentifier: Self = this.set("DBClusterIdentifier", js.undefined)
    
    @scala.inline
    def setDBClusterMembersVarargs(value: DBClusterMember*): Self = this.set("DBClusterMembers", js.Array(value :_*))
    
    @scala.inline
    def setDBClusterMembers(value: DBClusterMemberList): Self = this.set("DBClusterMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBClusterMembers: Self = this.set("DBClusterMembers", js.undefined)
    
    @scala.inline
    def setDBClusterOptionGroupMembershipsVarargs(value: DBClusterOptionGroupStatus*): Self = this.set("DBClusterOptionGroupMemberships", js.Array(value :_*))
    
    @scala.inline
    def setDBClusterOptionGroupMemberships(value: DBClusterOptionGroupMemberships): Self = this.set("DBClusterOptionGroupMemberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBClusterOptionGroupMemberships: Self = this.set("DBClusterOptionGroupMemberships", js.undefined)
    
    @scala.inline
    def setDBClusterParameterGroup(value: String): Self = this.set("DBClusterParameterGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBClusterParameterGroup: Self = this.set("DBClusterParameterGroup", js.undefined)
    
    @scala.inline
    def setDBSubnetGroup(value: String): Self = this.set("DBSubnetGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBSubnetGroup: Self = this.set("DBSubnetGroup", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: String): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseName: Self = this.set("DatabaseName", js.undefined)
    
    @scala.inline
    def setDbClusterResourceId(value: String): Self = this.set("DbClusterResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbClusterResourceId: Self = this.set("DbClusterResourceId", js.undefined)
    
    @scala.inline
    def setDeletionProtection(value: BooleanOptional): Self = this.set("DeletionProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletionProtection: Self = this.set("DeletionProtection", js.undefined)
    
    @scala.inline
    def setDomainMembershipsVarargs(value: DomainMembership*): Self = this.set("DomainMemberships", js.Array(value :_*))
    
    @scala.inline
    def setDomainMemberships(value: DomainMembershipList): Self = this.set("DomainMemberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainMemberships: Self = this.set("DomainMemberships", js.undefined)
    
    @scala.inline
    def setEarliestBacktrackTime(value: TStamp): Self = this.set("EarliestBacktrackTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEarliestBacktrackTime: Self = this.set("EarliestBacktrackTime", js.undefined)
    
    @scala.inline
    def setEarliestRestorableTime(value: TStamp): Self = this.set("EarliestRestorableTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEarliestRestorableTime: Self = this.set("EarliestRestorableTime", js.undefined)
    
    @scala.inline
    def setEnabledCloudwatchLogsExportsVarargs(value: String*): Self = this.set("EnabledCloudwatchLogsExports", js.Array(value :_*))
    
    @scala.inline
    def setEnabledCloudwatchLogsExports(value: LogTypeList): Self = this.set("EnabledCloudwatchLogsExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledCloudwatchLogsExports: Self = this.set("EnabledCloudwatchLogsExports", js.undefined)
    
    @scala.inline
    def setEndpoint(value: String): Self = this.set("Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("Endpoint", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = this.set("Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("Engine", js.undefined)
    
    @scala.inline
    def setEngineMode(value: String): Self = this.set("EngineMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineMode: Self = this.set("EngineMode", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    
    @scala.inline
    def setGlobalWriteForwardingRequested(value: BooleanOptional): Self = this.set("GlobalWriteForwardingRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalWriteForwardingRequested: Self = this.set("GlobalWriteForwardingRequested", js.undefined)
    
    @scala.inline
    def setGlobalWriteForwardingStatus(value: WriteForwardingStatus): Self = this.set("GlobalWriteForwardingStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalWriteForwardingStatus: Self = this.set("GlobalWriteForwardingStatus", js.undefined)
    
    @scala.inline
    def setHostedZoneId(value: String): Self = this.set("HostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostedZoneId: Self = this.set("HostedZoneId", js.undefined)
    
    @scala.inline
    def setHttpEndpointEnabled(value: BooleanOptional): Self = this.set("HttpEndpointEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpEndpointEnabled: Self = this.set("HttpEndpointEnabled", js.undefined)
    
    @scala.inline
    def setIAMDatabaseAuthenticationEnabled(value: BooleanOptional): Self = this.set("IAMDatabaseAuthenticationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIAMDatabaseAuthenticationEnabled: Self = this.set("IAMDatabaseAuthenticationEnabled", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    
    @scala.inline
    def setLatestRestorableTime(value: TStamp): Self = this.set("LatestRestorableTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestRestorableTime: Self = this.set("LatestRestorableTime", js.undefined)
    
    @scala.inline
    def setMasterUsername(value: String): Self = this.set("MasterUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterUsername: Self = this.set("MasterUsername", js.undefined)
    
    @scala.inline
    def setMultiAZ(value: BooleanOptional): Self = this.set("MultiAZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiAZ: Self = this.set("MultiAZ", js.undefined)
    
    @scala.inline
    def setPercentProgress(value: String): Self = this.set("PercentProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentProgress: Self = this.set("PercentProgress", js.undefined)
    
    @scala.inline
    def setPort(value: IntegerOptional): Self = this.set("Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    
    @scala.inline
    def setPreferredBackupWindow(value: String): Self = this.set("PreferredBackupWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredBackupWindow: Self = this.set("PreferredBackupWindow", js.undefined)
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: String): Self = this.set("PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredMaintenanceWindow: Self = this.set("PreferredMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setReadReplicaIdentifiersVarargs(value: String*): Self = this.set("ReadReplicaIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setReadReplicaIdentifiers(value: ReadReplicaIdentifierList): Self = this.set("ReadReplicaIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadReplicaIdentifiers: Self = this.set("ReadReplicaIdentifiers", js.undefined)
    
    @scala.inline
    def setReaderEndpoint(value: String): Self = this.set("ReaderEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReaderEndpoint: Self = this.set("ReaderEndpoint", js.undefined)
    
    @scala.inline
    def setReplicationSourceIdentifier(value: String): Self = this.set("ReplicationSourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationSourceIdentifier: Self = this.set("ReplicationSourceIdentifier", js.undefined)
    
    @scala.inline
    def setScalingConfigurationInfo(value: ScalingConfigurationInfo): Self = this.set("ScalingConfigurationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalingConfigurationInfo: Self = this.set("ScalingConfigurationInfo", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStorageEncrypted(value: Boolean): Self = this.set("StorageEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageEncrypted: Self = this.set("StorageEncrypted", js.undefined)
    
    @scala.inline
    def setTagListVarargs(value: Tag*): Self = this.set("TagList", js.Array(value :_*))
    
    @scala.inline
    def setTagList(value: TagList): Self = this.set("TagList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagList: Self = this.set("TagList", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupsVarargs(value: VpcSecurityGroupMembership*): Self = this.set("VpcSecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setVpcSecurityGroups(value: VpcSecurityGroupMembershipList): Self = this.set("VpcSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcSecurityGroups: Self = this.set("VpcSecurityGroups", js.undefined)
  }
}
