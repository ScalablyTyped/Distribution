package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBInstance extends js.Object {
  /**
    * Specifies the allocated storage size specified in gibibytes.
    */
  var AllocatedStorage: js.UndefOr[Integer] = js.native
  /**
    *  The AWS Identity and Access Management (IAM) roles associated with the DB instance. 
    */
  var AssociatedRoles: js.UndefOr[DBInstanceRoles] = js.native
  /**
    * Indicates that minor version patches are applied automatically.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the name of the Availability Zone the DB instance is located in.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * Specifies the number of days for which automatic DB snapshots are retained.
    */
  var BackupRetentionPeriod: js.UndefOr[Integer] = js.native
  /**
    * The identifier of the CA certificate for this DB instance.
    */
  var CACertificateIdentifier: js.UndefOr[String] = js.native
  /**
    * If present, specifies the name of the character set that this instance is associated with.
    */
  var CharacterSetName: js.UndefOr[String] = js.native
  /**
    * Specifies whether tags are copied from the DB instance to snapshots of the DB instance.  Amazon Aurora  Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora DB instance has no effect on the DB cluster setting. For more information, see DBCluster.
    */
  var CopyTagsToSnapshot: js.UndefOr[Boolean] = js.native
  /**
    * If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance is a member of.
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the DB instance.
    */
  var DBInstanceArn: js.UndefOr[String] = js.native
  /**
    * Contains the name of the compute and memory capacity class of the DB instance.
    */
  var DBInstanceClass: js.UndefOr[String] = js.native
  /**
    * Contains a user-supplied database identifier. This identifier is the unique key that identifies a DB instance.
    */
  var DBInstanceIdentifier: js.UndefOr[String] = js.native
  /**
    * Specifies the current state of this database. For information about DB instance statuses, see DB Instance Status in the Amazon RDS User Guide. 
    */
  var DBInstanceStatus: js.UndefOr[String] = js.native
  /**
    * The meaning of this parameter differs according to the database engine you use.  MySQL, MariaDB, SQL Server, PostgreSQL  Contains the name of the initial database of this instance that was provided at create time, if one was specified when the DB instance was created. This same name is returned for the life of the DB instance. Type: String  Oracle  Contains the Oracle System ID (SID) of the created DB instance. Not shown when the returned parameters do not apply to an Oracle DB instance.
    */
  var DBName: js.UndefOr[String] = js.native
  /**
    * Provides the list of DB parameter groups applied to this DB instance.
    */
  var DBParameterGroups: js.UndefOr[DBParameterGroupStatusList] = js.native
  /**
    *  A list of DB security group elements containing DBSecurityGroup.Name and DBSecurityGroup.Status subelements. 
    */
  var DBSecurityGroups: js.UndefOr[DBSecurityGroupMembershipList] = js.native
  /**
    * Specifies information on the subnet group associated with the DB instance, including the name, description, and subnets in the subnet group.
    */
  var DBSubnetGroup: js.UndefOr[typings.awsSdk.rdsMod.DBSubnetGroup] = js.native
  /**
    * Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can be a different port than the DB cluster port.
    */
  var DbInstancePort: js.UndefOr[Integer] = js.native
  /**
    * The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB instance is accessed.
    */
  var DbiResourceId: js.UndefOr[String] = js.native
  /**
    * Indicates if the DB instance has deletion protection enabled. The database can't be deleted when deletion protection is enabled. For more information, see  Deleting a DB Instance. 
    */
  var DeletionProtection: js.UndefOr[Boolean] = js.native
  /**
    * The Active Directory Domain membership records associated with the DB instance.
    */
  var DomainMemberships: js.UndefOr[DomainMembershipList] = js.native
  /**
    * A list of log types that this DB instance is configured to export to CloudWatch Logs. Log types vary by DB engine. For information about the log types for each DB engine, see Amazon RDS Database Log Files in the Amazon RDS User Guide. 
    */
  var EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.native
  /**
    * Specifies the connection endpoint.
    */
  var Endpoint: js.UndefOr[typings.awsSdk.rdsMod.Endpoint] = js.native
  /**
    * Provides the name of the database engine to be used for this DB instance.
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * Indicates the database engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log stream that receives the Enhanced Monitoring metrics data for the DB instance.
    */
  var EnhancedMonitoringResourceArn: js.UndefOr[String] = js.native
  /**
    * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and otherwise false. IAM database authentication can be enabled for the following database engines   For MySQL 5.6, minor version 5.6.34 or higher   For MySQL 5.7, minor version 5.7.16 or higher   Aurora 5.6 or higher. To enable IAM database authentication for Aurora, see DBCluster Type.  
    */
  var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Provides the date and time the DB instance was created.
    */
  var InstanceCreateTime: js.UndefOr[TStamp] = js.native
  /**
    * Specifies the Provisioned IOPS (I/O operations per second) value.
    */
  var Iops: js.UndefOr[IntegerOptional] = js.native
  /**
    *  If StorageEncrypted is true, the AWS KMS key identifier for the encrypted DB instance. 
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * Specifies the latest time to which a database can be restored with point-in-time restore.
    */
  var LatestRestorableTime: js.UndefOr[TStamp] = js.native
  /**
    * License model information for this DB instance.
    */
  var LicenseModel: js.UndefOr[String] = js.native
  /**
    * Specifies the listener connection endpoint for SQL Server Always On.
    */
  var ListenerEndpoint: js.UndefOr[Endpoint] = js.native
  /**
    * Contains the master username for the DB instance.
    */
  var MasterUsername: js.UndefOr[String] = js.native
  /**
    * The upper limit to which Amazon RDS can automatically scale the storage of the DB instance.
    */
  var MaxAllocatedStorage: js.UndefOr[IntegerOptional] = js.native
  /**
    * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance.
    */
  var MonitoringInterval: js.UndefOr[IntegerOptional] = js.native
  /**
    * The ARN for the IAM role that permits RDS to send Enhanced Monitoring metrics to Amazon CloudWatch Logs.
    */
  var MonitoringRoleArn: js.UndefOr[String] = js.native
  /**
    * Specifies if the DB instance is a Multi-AZ deployment.
    */
  var MultiAZ: js.UndefOr[Boolean] = js.native
  /**
    * Provides the list of option group memberships for this DB instance.
    */
  var OptionGroupMemberships: js.UndefOr[OptionGroupMembershipList] = js.native
  /**
    * Specifies that changes to the DB instance are pending. This element is only included when changes are pending. Specific changes are identified by subelements.
    */
  var PendingModifiedValues: js.UndefOr[typings.awsSdk.rdsMod.PendingModifiedValues] = js.native
  /**
    * True if Performance Insights is enabled for the DB instance, and otherwise false.
    */
  var PerformanceInsightsEnabled: js.UndefOr[BooleanOptional] = js.native
  /**
    * The AWS KMS key identifier for encryption of Performance Insights data. The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key.
    */
  var PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.native
  /**
    * The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2 years). 
    */
  var PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  /**
    *  Specifies the daily time range during which automated backups are created if automated backups are enabled, as determined by the BackupRetentionPeriod. 
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.native
  /**
    * Specifies the weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  /**
    * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
    */
  var ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.native
  /**
    * A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a failure of the existing primary instance. For more information, see  Fault Tolerance for an Aurora DB Cluster in the Amazon Aurora User Guide. 
    */
  var PromotionTier: js.UndefOr[IntegerOptional] = js.native
  /**
    * Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing instance with a publicly resolvable DNS name, which resolves to a public IP address. A value of false specifies an internal instance with a DNS name that resolves to a private IP address.
    */
  var PubliclyAccessible: js.UndefOr[Boolean] = js.native
  /**
    * Contains one or more identifiers of Aurora DB clusters to which the RDS DB instance is replicated as a read replica. For example, when you create an Aurora read replica of an RDS MySQL DB instance, the Aurora MySQL DB cluster for the Aurora read replica is shown. This output does not contain information about cross region Aurora read replicas.  Currently, each RDS DB instance can have only one Aurora read replica. 
    */
  var ReadReplicaDBClusterIdentifiers: js.UndefOr[ReadReplicaDBClusterIdentifierList] = js.native
  /**
    * Contains one or more identifiers of the read replicas associated with this DB instance.
    */
  var ReadReplicaDBInstanceIdentifiers: js.UndefOr[ReadReplicaDBInstanceIdentifierList] = js.native
  /**
    * Contains the identifier of the source DB instance if this DB instance is a read replica.
    */
  var ReadReplicaSourceDBInstanceIdentifier: js.UndefOr[String] = js.native
  /**
    * If present, specifies the name of the secondary Availability Zone for a DB instance with multi-AZ support.
    */
  var SecondaryAvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The status of a read replica. If the instance isn't a read replica, this is blank.
    */
  var StatusInfos: js.UndefOr[DBInstanceStatusInfoList] = js.native
  /**
    * Specifies whether the DB instance is encrypted.
    */
  var StorageEncrypted: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the storage type associated with DB instance.
    */
  var StorageType: js.UndefOr[String] = js.native
  /**
    * The ARN from the key store with which the instance is associated for TDE encryption.
    */
  var TdeCredentialArn: js.UndefOr[String] = js.native
  /**
    * The time zone of the DB instance. In most cases, the Timezone element is empty. Timezone content appears only for Microsoft SQL Server DB instances that were created with a time zone specified. 
    */
  var Timezone: js.UndefOr[String] = js.native
  /**
    * Provides a list of VPC security group elements that the DB instance belongs to.
    */
  var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.native
}

object DBInstance {
  @scala.inline
  def apply(
    AllocatedStorage: Int | scala.Double = null,
    AssociatedRoles: DBInstanceRoles = null,
    AutoMinorVersionUpgrade: js.UndefOr[scala.Boolean] = js.undefined,
    AvailabilityZone: String = null,
    BackupRetentionPeriod: Int | scala.Double = null,
    CACertificateIdentifier: String = null,
    CharacterSetName: String = null,
    CopyTagsToSnapshot: js.UndefOr[scala.Boolean] = js.undefined,
    DBClusterIdentifier: String = null,
    DBInstanceArn: String = null,
    DBInstanceClass: String = null,
    DBInstanceIdentifier: String = null,
    DBInstanceStatus: String = null,
    DBName: String = null,
    DBParameterGroups: DBParameterGroupStatusList = null,
    DBSecurityGroups: DBSecurityGroupMembershipList = null,
    DBSubnetGroup: DBSubnetGroup = null,
    DbInstancePort: Int | scala.Double = null,
    DbiResourceId: String = null,
    DeletionProtection: js.UndefOr[scala.Boolean] = js.undefined,
    DomainMemberships: DomainMembershipList = null,
    EnabledCloudwatchLogsExports: LogTypeList = null,
    Endpoint: Endpoint = null,
    Engine: String = null,
    EngineVersion: String = null,
    EnhancedMonitoringResourceArn: String = null,
    IAMDatabaseAuthenticationEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    InstanceCreateTime: TStamp = null,
    Iops: Int | scala.Double = null,
    KmsKeyId: String = null,
    LatestRestorableTime: TStamp = null,
    LicenseModel: String = null,
    ListenerEndpoint: Endpoint = null,
    MasterUsername: String = null,
    MaxAllocatedStorage: Int | scala.Double = null,
    MonitoringInterval: Int | scala.Double = null,
    MonitoringRoleArn: String = null,
    MultiAZ: js.UndefOr[scala.Boolean] = js.undefined,
    OptionGroupMemberships: OptionGroupMembershipList = null,
    PendingModifiedValues: PendingModifiedValues = null,
    PerformanceInsightsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    PerformanceInsightsKMSKeyId: String = null,
    PerformanceInsightsRetentionPeriod: Int | scala.Double = null,
    PreferredBackupWindow: String = null,
    PreferredMaintenanceWindow: String = null,
    ProcessorFeatures: ProcessorFeatureList = null,
    PromotionTier: Int | scala.Double = null,
    PubliclyAccessible: js.UndefOr[scala.Boolean] = js.undefined,
    ReadReplicaDBClusterIdentifiers: ReadReplicaDBClusterIdentifierList = null,
    ReadReplicaDBInstanceIdentifiers: ReadReplicaDBInstanceIdentifierList = null,
    ReadReplicaSourceDBInstanceIdentifier: String = null,
    SecondaryAvailabilityZone: String = null,
    StatusInfos: DBInstanceStatusInfoList = null,
    StorageEncrypted: js.UndefOr[scala.Boolean] = js.undefined,
    StorageType: String = null,
    TdeCredentialArn: String = null,
    Timezone: String = null,
    VpcSecurityGroups: VpcSecurityGroupMembershipList = null
  ): DBInstance = {
    val __obj = js.Dynamic.literal()
    if (AllocatedStorage != null) __obj.updateDynamic("AllocatedStorage")(AllocatedStorage.asInstanceOf[js.Any])
    if (AssociatedRoles != null) __obj.updateDynamic("AssociatedRoles")(AssociatedRoles.asInstanceOf[js.Any])
    if (!js.isUndefined(AutoMinorVersionUpgrade)) __obj.updateDynamic("AutoMinorVersionUpgrade")(AutoMinorVersionUpgrade.asInstanceOf[js.Any])
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (BackupRetentionPeriod != null) __obj.updateDynamic("BackupRetentionPeriod")(BackupRetentionPeriod.asInstanceOf[js.Any])
    if (CACertificateIdentifier != null) __obj.updateDynamic("CACertificateIdentifier")(CACertificateIdentifier.asInstanceOf[js.Any])
    if (CharacterSetName != null) __obj.updateDynamic("CharacterSetName")(CharacterSetName.asInstanceOf[js.Any])
    if (!js.isUndefined(CopyTagsToSnapshot)) __obj.updateDynamic("CopyTagsToSnapshot")(CopyTagsToSnapshot.asInstanceOf[js.Any])
    if (DBClusterIdentifier != null) __obj.updateDynamic("DBClusterIdentifier")(DBClusterIdentifier.asInstanceOf[js.Any])
    if (DBInstanceArn != null) __obj.updateDynamic("DBInstanceArn")(DBInstanceArn.asInstanceOf[js.Any])
    if (DBInstanceClass != null) __obj.updateDynamic("DBInstanceClass")(DBInstanceClass.asInstanceOf[js.Any])
    if (DBInstanceIdentifier != null) __obj.updateDynamic("DBInstanceIdentifier")(DBInstanceIdentifier.asInstanceOf[js.Any])
    if (DBInstanceStatus != null) __obj.updateDynamic("DBInstanceStatus")(DBInstanceStatus.asInstanceOf[js.Any])
    if (DBName != null) __obj.updateDynamic("DBName")(DBName.asInstanceOf[js.Any])
    if (DBParameterGroups != null) __obj.updateDynamic("DBParameterGroups")(DBParameterGroups.asInstanceOf[js.Any])
    if (DBSecurityGroups != null) __obj.updateDynamic("DBSecurityGroups")(DBSecurityGroups.asInstanceOf[js.Any])
    if (DBSubnetGroup != null) __obj.updateDynamic("DBSubnetGroup")(DBSubnetGroup.asInstanceOf[js.Any])
    if (DbInstancePort != null) __obj.updateDynamic("DbInstancePort")(DbInstancePort.asInstanceOf[js.Any])
    if (DbiResourceId != null) __obj.updateDynamic("DbiResourceId")(DbiResourceId.asInstanceOf[js.Any])
    if (!js.isUndefined(DeletionProtection)) __obj.updateDynamic("DeletionProtection")(DeletionProtection.asInstanceOf[js.Any])
    if (DomainMemberships != null) __obj.updateDynamic("DomainMemberships")(DomainMemberships.asInstanceOf[js.Any])
    if (EnabledCloudwatchLogsExports != null) __obj.updateDynamic("EnabledCloudwatchLogsExports")(EnabledCloudwatchLogsExports.asInstanceOf[js.Any])
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint.asInstanceOf[js.Any])
    if (Engine != null) __obj.updateDynamic("Engine")(Engine.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (EnhancedMonitoringResourceArn != null) __obj.updateDynamic("EnhancedMonitoringResourceArn")(EnhancedMonitoringResourceArn.asInstanceOf[js.Any])
    if (!js.isUndefined(IAMDatabaseAuthenticationEnabled)) __obj.updateDynamic("IAMDatabaseAuthenticationEnabled")(IAMDatabaseAuthenticationEnabled.asInstanceOf[js.Any])
    if (InstanceCreateTime != null) __obj.updateDynamic("InstanceCreateTime")(InstanceCreateTime.asInstanceOf[js.Any])
    if (Iops != null) __obj.updateDynamic("Iops")(Iops.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (LatestRestorableTime != null) __obj.updateDynamic("LatestRestorableTime")(LatestRestorableTime.asInstanceOf[js.Any])
    if (LicenseModel != null) __obj.updateDynamic("LicenseModel")(LicenseModel.asInstanceOf[js.Any])
    if (ListenerEndpoint != null) __obj.updateDynamic("ListenerEndpoint")(ListenerEndpoint.asInstanceOf[js.Any])
    if (MasterUsername != null) __obj.updateDynamic("MasterUsername")(MasterUsername.asInstanceOf[js.Any])
    if (MaxAllocatedStorage != null) __obj.updateDynamic("MaxAllocatedStorage")(MaxAllocatedStorage.asInstanceOf[js.Any])
    if (MonitoringInterval != null) __obj.updateDynamic("MonitoringInterval")(MonitoringInterval.asInstanceOf[js.Any])
    if (MonitoringRoleArn != null) __obj.updateDynamic("MonitoringRoleArn")(MonitoringRoleArn.asInstanceOf[js.Any])
    if (!js.isUndefined(MultiAZ)) __obj.updateDynamic("MultiAZ")(MultiAZ.asInstanceOf[js.Any])
    if (OptionGroupMemberships != null) __obj.updateDynamic("OptionGroupMemberships")(OptionGroupMemberships.asInstanceOf[js.Any])
    if (PendingModifiedValues != null) __obj.updateDynamic("PendingModifiedValues")(PendingModifiedValues.asInstanceOf[js.Any])
    if (!js.isUndefined(PerformanceInsightsEnabled)) __obj.updateDynamic("PerformanceInsightsEnabled")(PerformanceInsightsEnabled.asInstanceOf[js.Any])
    if (PerformanceInsightsKMSKeyId != null) __obj.updateDynamic("PerformanceInsightsKMSKeyId")(PerformanceInsightsKMSKeyId.asInstanceOf[js.Any])
    if (PerformanceInsightsRetentionPeriod != null) __obj.updateDynamic("PerformanceInsightsRetentionPeriod")(PerformanceInsightsRetentionPeriod.asInstanceOf[js.Any])
    if (PreferredBackupWindow != null) __obj.updateDynamic("PreferredBackupWindow")(PreferredBackupWindow.asInstanceOf[js.Any])
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow.asInstanceOf[js.Any])
    if (ProcessorFeatures != null) __obj.updateDynamic("ProcessorFeatures")(ProcessorFeatures.asInstanceOf[js.Any])
    if (PromotionTier != null) __obj.updateDynamic("PromotionTier")(PromotionTier.asInstanceOf[js.Any])
    if (!js.isUndefined(PubliclyAccessible)) __obj.updateDynamic("PubliclyAccessible")(PubliclyAccessible.asInstanceOf[js.Any])
    if (ReadReplicaDBClusterIdentifiers != null) __obj.updateDynamic("ReadReplicaDBClusterIdentifiers")(ReadReplicaDBClusterIdentifiers.asInstanceOf[js.Any])
    if (ReadReplicaDBInstanceIdentifiers != null) __obj.updateDynamic("ReadReplicaDBInstanceIdentifiers")(ReadReplicaDBInstanceIdentifiers.asInstanceOf[js.Any])
    if (ReadReplicaSourceDBInstanceIdentifier != null) __obj.updateDynamic("ReadReplicaSourceDBInstanceIdentifier")(ReadReplicaSourceDBInstanceIdentifier.asInstanceOf[js.Any])
    if (SecondaryAvailabilityZone != null) __obj.updateDynamic("SecondaryAvailabilityZone")(SecondaryAvailabilityZone.asInstanceOf[js.Any])
    if (StatusInfos != null) __obj.updateDynamic("StatusInfos")(StatusInfos.asInstanceOf[js.Any])
    if (!js.isUndefined(StorageEncrypted)) __obj.updateDynamic("StorageEncrypted")(StorageEncrypted.asInstanceOf[js.Any])
    if (StorageType != null) __obj.updateDynamic("StorageType")(StorageType.asInstanceOf[js.Any])
    if (TdeCredentialArn != null) __obj.updateDynamic("TdeCredentialArn")(TdeCredentialArn.asInstanceOf[js.Any])
    if (Timezone != null) __obj.updateDynamic("Timezone")(Timezone.asInstanceOf[js.Any])
    if (VpcSecurityGroups != null) __obj.updateDynamic("VpcSecurityGroups")(VpcSecurityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBInstance]
  }
}

