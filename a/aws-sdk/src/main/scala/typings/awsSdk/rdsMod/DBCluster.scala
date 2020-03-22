package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * Provides the name of the database engine to be used for this DB cluster.
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * The DB engine mode of the DB cluster, either provisioned, serverless, parallelquery, global, or multimaster.
    */
  var EngineMode: js.UndefOr[String] = js.native
  /**
    * Indicates the database engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.native
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
    * Contains one or more identifiers of the Read Replicas associated with this DB cluster.
    */
  var ReadReplicaIdentifiers: js.UndefOr[ReadReplicaIdentifierList] = js.native
  /**
    * The reader endpoint for the DB cluster. The reader endpoint for a DB cluster load-balances connections across the Aurora Replicas that are available in a DB cluster. As clients request new connections to the reader endpoint, Aurora distributes the connection requests among the Aurora Replicas in the DB cluster. This functionality can help balance your read workload across multiple Aurora Replicas in your DB cluster.  If a failover occurs, and the Aurora Replica that you are connected to is promoted to be the primary instance, your connection is dropped. To continue sending your read workload to other Aurora Replicas in the cluster, you can then reconnect to the reader endpoint.
    */
  var ReaderEndpoint: js.UndefOr[String] = js.native
  /**
    * Contains the identifier of the source DB cluster if this DB cluster is a Read Replica.
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
  /**
    * Provides a list of VPC security groups that the DB cluster belongs to.
    */
  var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.native
}

object DBCluster {
  @scala.inline
  def apply(
    ActivityStreamKinesisStreamName: String = null,
    ActivityStreamKmsKeyId: String = null,
    ActivityStreamMode: ActivityStreamMode = null,
    ActivityStreamStatus: ActivityStreamStatus = null,
    AllocatedStorage: Int | scala.Double = null,
    AssociatedRoles: DBClusterRoles = null,
    AvailabilityZones: AvailabilityZones = null,
    BacktrackConsumedChangeRecords: Int | scala.Double = null,
    BacktrackWindow: Int | scala.Double = null,
    BackupRetentionPeriod: Int | scala.Double = null,
    Capacity: Int | scala.Double = null,
    CharacterSetName: String = null,
    CloneGroupId: String = null,
    ClusterCreateTime: TStamp = null,
    CopyTagsToSnapshot: js.UndefOr[scala.Boolean] = js.undefined,
    CrossAccountClone: js.UndefOr[scala.Boolean] = js.undefined,
    CustomEndpoints: StringList = null,
    DBClusterArn: String = null,
    DBClusterIdentifier: String = null,
    DBClusterMembers: DBClusterMemberList = null,
    DBClusterOptionGroupMemberships: DBClusterOptionGroupMemberships = null,
    DBClusterParameterGroup: String = null,
    DBSubnetGroup: String = null,
    DatabaseName: String = null,
    DbClusterResourceId: String = null,
    DeletionProtection: js.UndefOr[scala.Boolean] = js.undefined,
    DomainMemberships: DomainMembershipList = null,
    EarliestBacktrackTime: TStamp = null,
    EarliestRestorableTime: TStamp = null,
    EnabledCloudwatchLogsExports: LogTypeList = null,
    Endpoint: String = null,
    Engine: String = null,
    EngineMode: String = null,
    EngineVersion: String = null,
    HostedZoneId: String = null,
    HttpEndpointEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    IAMDatabaseAuthenticationEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    KmsKeyId: String = null,
    LatestRestorableTime: TStamp = null,
    MasterUsername: String = null,
    MultiAZ: js.UndefOr[scala.Boolean] = js.undefined,
    PercentProgress: String = null,
    Port: Int | scala.Double = null,
    PreferredBackupWindow: String = null,
    PreferredMaintenanceWindow: String = null,
    ReadReplicaIdentifiers: ReadReplicaIdentifierList = null,
    ReaderEndpoint: String = null,
    ReplicationSourceIdentifier: String = null,
    ScalingConfigurationInfo: ScalingConfigurationInfo = null,
    Status: String = null,
    StorageEncrypted: js.UndefOr[scala.Boolean] = js.undefined,
    VpcSecurityGroups: VpcSecurityGroupMembershipList = null
  ): DBCluster = {
    val __obj = js.Dynamic.literal()
    if (ActivityStreamKinesisStreamName != null) __obj.updateDynamic("ActivityStreamKinesisStreamName")(ActivityStreamKinesisStreamName.asInstanceOf[js.Any])
    if (ActivityStreamKmsKeyId != null) __obj.updateDynamic("ActivityStreamKmsKeyId")(ActivityStreamKmsKeyId.asInstanceOf[js.Any])
    if (ActivityStreamMode != null) __obj.updateDynamic("ActivityStreamMode")(ActivityStreamMode.asInstanceOf[js.Any])
    if (ActivityStreamStatus != null) __obj.updateDynamic("ActivityStreamStatus")(ActivityStreamStatus.asInstanceOf[js.Any])
    if (AllocatedStorage != null) __obj.updateDynamic("AllocatedStorage")(AllocatedStorage.asInstanceOf[js.Any])
    if (AssociatedRoles != null) __obj.updateDynamic("AssociatedRoles")(AssociatedRoles.asInstanceOf[js.Any])
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    if (BacktrackConsumedChangeRecords != null) __obj.updateDynamic("BacktrackConsumedChangeRecords")(BacktrackConsumedChangeRecords.asInstanceOf[js.Any])
    if (BacktrackWindow != null) __obj.updateDynamic("BacktrackWindow")(BacktrackWindow.asInstanceOf[js.Any])
    if (BackupRetentionPeriod != null) __obj.updateDynamic("BackupRetentionPeriod")(BackupRetentionPeriod.asInstanceOf[js.Any])
    if (Capacity != null) __obj.updateDynamic("Capacity")(Capacity.asInstanceOf[js.Any])
    if (CharacterSetName != null) __obj.updateDynamic("CharacterSetName")(CharacterSetName.asInstanceOf[js.Any])
    if (CloneGroupId != null) __obj.updateDynamic("CloneGroupId")(CloneGroupId.asInstanceOf[js.Any])
    if (ClusterCreateTime != null) __obj.updateDynamic("ClusterCreateTime")(ClusterCreateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(CopyTagsToSnapshot)) __obj.updateDynamic("CopyTagsToSnapshot")(CopyTagsToSnapshot.asInstanceOf[js.Any])
    if (!js.isUndefined(CrossAccountClone)) __obj.updateDynamic("CrossAccountClone")(CrossAccountClone.asInstanceOf[js.Any])
    if (CustomEndpoints != null) __obj.updateDynamic("CustomEndpoints")(CustomEndpoints.asInstanceOf[js.Any])
    if (DBClusterArn != null) __obj.updateDynamic("DBClusterArn")(DBClusterArn.asInstanceOf[js.Any])
    if (DBClusterIdentifier != null) __obj.updateDynamic("DBClusterIdentifier")(DBClusterIdentifier.asInstanceOf[js.Any])
    if (DBClusterMembers != null) __obj.updateDynamic("DBClusterMembers")(DBClusterMembers.asInstanceOf[js.Any])
    if (DBClusterOptionGroupMemberships != null) __obj.updateDynamic("DBClusterOptionGroupMemberships")(DBClusterOptionGroupMemberships.asInstanceOf[js.Any])
    if (DBClusterParameterGroup != null) __obj.updateDynamic("DBClusterParameterGroup")(DBClusterParameterGroup.asInstanceOf[js.Any])
    if (DBSubnetGroup != null) __obj.updateDynamic("DBSubnetGroup")(DBSubnetGroup.asInstanceOf[js.Any])
    if (DatabaseName != null) __obj.updateDynamic("DatabaseName")(DatabaseName.asInstanceOf[js.Any])
    if (DbClusterResourceId != null) __obj.updateDynamic("DbClusterResourceId")(DbClusterResourceId.asInstanceOf[js.Any])
    if (!js.isUndefined(DeletionProtection)) __obj.updateDynamic("DeletionProtection")(DeletionProtection.asInstanceOf[js.Any])
    if (DomainMemberships != null) __obj.updateDynamic("DomainMemberships")(DomainMemberships.asInstanceOf[js.Any])
    if (EarliestBacktrackTime != null) __obj.updateDynamic("EarliestBacktrackTime")(EarliestBacktrackTime.asInstanceOf[js.Any])
    if (EarliestRestorableTime != null) __obj.updateDynamic("EarliestRestorableTime")(EarliestRestorableTime.asInstanceOf[js.Any])
    if (EnabledCloudwatchLogsExports != null) __obj.updateDynamic("EnabledCloudwatchLogsExports")(EnabledCloudwatchLogsExports.asInstanceOf[js.Any])
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint.asInstanceOf[js.Any])
    if (Engine != null) __obj.updateDynamic("Engine")(Engine.asInstanceOf[js.Any])
    if (EngineMode != null) __obj.updateDynamic("EngineMode")(EngineMode.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (HostedZoneId != null) __obj.updateDynamic("HostedZoneId")(HostedZoneId.asInstanceOf[js.Any])
    if (!js.isUndefined(HttpEndpointEnabled)) __obj.updateDynamic("HttpEndpointEnabled")(HttpEndpointEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(IAMDatabaseAuthenticationEnabled)) __obj.updateDynamic("IAMDatabaseAuthenticationEnabled")(IAMDatabaseAuthenticationEnabled.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (LatestRestorableTime != null) __obj.updateDynamic("LatestRestorableTime")(LatestRestorableTime.asInstanceOf[js.Any])
    if (MasterUsername != null) __obj.updateDynamic("MasterUsername")(MasterUsername.asInstanceOf[js.Any])
    if (!js.isUndefined(MultiAZ)) __obj.updateDynamic("MultiAZ")(MultiAZ.asInstanceOf[js.Any])
    if (PercentProgress != null) __obj.updateDynamic("PercentProgress")(PercentProgress.asInstanceOf[js.Any])
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (PreferredBackupWindow != null) __obj.updateDynamic("PreferredBackupWindow")(PreferredBackupWindow.asInstanceOf[js.Any])
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow.asInstanceOf[js.Any])
    if (ReadReplicaIdentifiers != null) __obj.updateDynamic("ReadReplicaIdentifiers")(ReadReplicaIdentifiers.asInstanceOf[js.Any])
    if (ReaderEndpoint != null) __obj.updateDynamic("ReaderEndpoint")(ReaderEndpoint.asInstanceOf[js.Any])
    if (ReplicationSourceIdentifier != null) __obj.updateDynamic("ReplicationSourceIdentifier")(ReplicationSourceIdentifier.asInstanceOf[js.Any])
    if (ScalingConfigurationInfo != null) __obj.updateDynamic("ScalingConfigurationInfo")(ScalingConfigurationInfo.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (!js.isUndefined(StorageEncrypted)) __obj.updateDynamic("StorageEncrypted")(StorageEncrypted.asInstanceOf[js.Any])
    if (VpcSecurityGroups != null) __obj.updateDynamic("VpcSecurityGroups")(VpcSecurityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCluster]
  }
}

