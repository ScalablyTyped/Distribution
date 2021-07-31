package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRdsDbInstanceDetails extends StObject {
  
  /**
    * The amount of storage (in gigabytes) to initially allocate for the DB instance.
    */
  var AllocatedStorage: js.UndefOr[Integer] = js.undefined
  
  /**
    * The AWS Identity and Access Management (IAM) roles associated with the DB instance.
    */
  var AssociatedRoles: js.UndefOr[AwsRdsDbInstanceAssociatedRoles] = js.undefined
  
  /**
    * Indicates whether minor version patches are applied automatically.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Availability Zone where the DB instance will be created.
    */
  var AvailabilityZone: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The number of days for which to retain automated backups.
    */
  var BackupRetentionPeriod: js.UndefOr[Integer] = js.undefined
  
  /**
    * The identifier of the CA certificate for this DB instance.
    */
  var CACertificateIdentifier: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the character set that this DB instance is associated with.
    */
  var CharacterSetName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether to copy resource tags to snapshots of the DB instance.
    */
  var CopyTagsToSnapshot: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance is a member of.
    */
  var DBClusterIdentifier: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Contains the name of the compute and memory capacity class of the DB instance.
    */
  var DBInstanceClass: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Contains a user-supplied database identifier. This identifier is the unique key that identifies a DB instance.
    */
  var DBInstanceIdentifier: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The meaning of this parameter differs according to the database engine you use.  MySQL, MariaDB, SQL Server, PostgreSQL  Contains the name of the initial database of this instance that was provided at create time, if one was specified when the DB instance was created. This same name is returned for the life of the DB instance.  Oracle  Contains the Oracle System ID (SID) of the created DB instance. Not shown when the returned parameters do not apply to an Oracle DB instance. 
    */
  var DBName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can be a different port than the DB cluster port.
    */
  var DbInstancePort: js.UndefOr[Integer] = js.undefined
  
  /**
    * The current status of the DB instance.
    */
  var DbInstanceStatus: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A list of the DB parameter groups to assign to the DB instance.
    */
  var DbParameterGroups: js.UndefOr[AwsRdsDbParameterGroups] = js.undefined
  
  /**
    * A list of the DB security groups to assign to the DB instance.
    */
  var DbSecurityGroups: js.UndefOr[StringList] = js.undefined
  
  /**
    * Information about the subnet group that is associated with the DB instance.
    */
  var DbSubnetGroup: js.UndefOr[AwsRdsDbSubnetGroup] = js.undefined
  
  /**
    * The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB instance is accessed. 
    */
  var DbiResourceId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates whether the DB instance has deletion protection enabled. When deletion protection is enabled, the database cannot be deleted.
    */
  var DeletionProtection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Active Directory domain membership records associated with the DB instance.
    */
  var DomainMemberships: js.UndefOr[AwsRdsDbDomainMemberships] = js.undefined
  
  /**
    * A list of log types that this DB instance is configured to export to CloudWatch Logs.
    */
  var EnabledCloudWatchLogsExports: js.UndefOr[StringList] = js.undefined
  
  /**
    * Specifies the connection endpoint.
    */
  var Endpoint: js.UndefOr[AwsRdsDbInstanceEndpoint] = js.undefined
  
  /**
    * Provides the name of the database engine to use for this DB instance.
    */
  var Engine: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates the database engine version.
    */
  var EngineVersion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN of the CloudWatch Logs log stream that receives the enhanced monitoring metrics data for the DB instance.
    */
  var EnhancedMonitoringResourceArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and otherwise false. IAM database authentication can be enabled for the following database engines.   For MySQL 5.6, minor version 5.6.34 or higher   For MySQL 5.7, minor version 5.7.16 or higher   Aurora 5.6 or higher  
    */
  var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates when the DB instance was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var InstanceCreateTime: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Specifies the provisioned IOPS (I/O operations per second) for this DB instance.
    */
  var Iops: js.UndefOr[Integer] = js.undefined
  
  /**
    * If StorageEncrypted is true, the AWS KMS key identifier for the encrypted DB instance.
    */
  var KmsKeyId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Specifies the latest time to which a database can be restored with point-in-time restore. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var LatestRestorableTime: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * License model information for this DB instance.
    */
  var LicenseModel: js.UndefOr[NonEmptyString] = js.undefined
  
  var ListenerEndpoint: js.UndefOr[AwsRdsDbInstanceEndpoint] = js.undefined
  
  /**
    * The master user name of the DB instance.
    */
  var MasterUsername: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The upper limit to which Amazon RDS can automatically scale the storage of the DB instance.
    */
  var MaxAllocatedStorage: js.UndefOr[Integer] = js.undefined
  
  /**
    * The interval, in seconds, between points when enhanced monitoring metrics are collected for the DB instance.
    */
  var MonitoringInterval: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ARN for the IAM role that permits Amazon RDS to send enhanced monitoring metrics to CloudWatch Logs.
    */
  var MonitoringRoleArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether the DB instance is a multiple Availability Zone deployment.
    */
  var MultiAz: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The list of option group memberships for this DB instance.
    */
  var OptionGroupMemberships: js.UndefOr[AwsRdsDbOptionGroupMemberships] = js.undefined
  
  /**
    * Changes to the DB instance that are currently pending.
    */
  var PendingModifiedValues: js.UndefOr[AwsRdsDbPendingModifiedValues] = js.undefined
  
  /**
    * Indicates whether Performance Insights is enabled for the DB instance.
    */
  var PerformanceInsightsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The identifier of the AWS KMS key used to encrypt the Performance Insights data.
    */
  var PerformanceInsightsKmsKeyId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The number of days to retain Performance Insights data.
    */
  var PerformanceInsightsRetentionPeriod: js.UndefOr[Integer] = js.undefined
  
  /**
    * The range of time each day when automated backups are created, if automated backups are enabled. Uses the format HH:MM-HH:MM. For example, 04:52-05:22.
    */
  var PreferredBackupWindow: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC). Uses the format &lt;day&gt;:HH:MM-&lt;day&gt;:HH:MM. For the day values, use mon|tue|wed|thu|fri|sat|sun. For example, sun:09:32-sun:10:02.
    */
  var PreferredMaintenanceWindow: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
    */
  var ProcessorFeatures: js.UndefOr[AwsRdsDbProcessorFeatures] = js.undefined
  
  /**
    * The order in which to promote an Aurora replica to the primary instance after a failure of the existing primary instance.
    */
  var PromotionTier: js.UndefOr[Integer] = js.undefined
  
  /**
    * Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing instance with a publicly resolvable DNS name, which resolves to a public IP address. A value of false specifies an internal instance with a DNS name that resolves to a private IP address. 
    */
  var PubliclyAccessible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * List of identifiers of Aurora DB clusters to which the RDS DB instance is replicated as a read replica.
    */
  var ReadReplicaDBClusterIdentifiers: js.UndefOr[StringList] = js.undefined
  
  /**
    * List of identifiers of the read replicas associated with this DB instance.
    */
  var ReadReplicaDBInstanceIdentifiers: js.UndefOr[StringList] = js.undefined
  
  /**
    * If this DB instance is a read replica, contains the identifier of the source DB instance.
    */
  var ReadReplicaSourceDBInstanceIdentifier: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * For a DB instance with multi-Availability Zone support, the name of the secondary Availability Zone.
    */
  var SecondaryAvailabilityZone: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The status of a read replica. If the instance isn't a read replica, this is empty.
    */
  var StatusInfos: js.UndefOr[AwsRdsDbStatusInfos] = js.undefined
  
  /**
    * Specifies whether the DB instance is encrypted.
    */
  var StorageEncrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The storage type for the DB instance.
    */
  var StorageType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN from the key store with which the instance is associated for TDE encryption.
    */
  var TdeCredentialArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The time zone of the DB instance.
    */
  var Timezone: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A list of VPC security groups that the DB instance belongs to.
    */
  var VpcSecurityGroups: js.UndefOr[AwsRdsDbInstanceVpcSecurityGroups] = js.undefined
}
object AwsRdsDbInstanceDetails {
  
  @scala.inline
  def apply(): AwsRdsDbInstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbInstanceDetails]
  }
  
  @scala.inline
  implicit class AwsRdsDbInstanceDetailsMutableBuilder[Self <: AwsRdsDbInstanceDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocatedStorage(value: Integer): Self = StObject.set(x, "AllocatedStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocatedStorageUndefined: Self = StObject.set(x, "AllocatedStorage", js.undefined)
    
    @scala.inline
    def setAssociatedRoles(value: AwsRdsDbInstanceAssociatedRoles): Self = StObject.set(x, "AssociatedRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedRolesUndefined: Self = StObject.set(x, "AssociatedRoles", js.undefined)
    
    @scala.inline
    def setAssociatedRolesVarargs(value: AwsRdsDbInstanceAssociatedRole*): Self = StObject.set(x, "AssociatedRoles", js.Array(value :_*))
    
    @scala.inline
    def setAutoMinorVersionUpgrade(value: Boolean): Self = StObject.set(x, "AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "AutoMinorVersionUpgrade", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: NonEmptyString): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setBackupRetentionPeriod(value: Integer): Self = StObject.set(x, "BackupRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupRetentionPeriodUndefined: Self = StObject.set(x, "BackupRetentionPeriod", js.undefined)
    
    @scala.inline
    def setCACertificateIdentifier(value: NonEmptyString): Self = StObject.set(x, "CACertificateIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCACertificateIdentifierUndefined: Self = StObject.set(x, "CACertificateIdentifier", js.undefined)
    
    @scala.inline
    def setCharacterSetName(value: NonEmptyString): Self = StObject.set(x, "CharacterSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacterSetNameUndefined: Self = StObject.set(x, "CharacterSetName", js.undefined)
    
    @scala.inline
    def setCopyTagsToSnapshot(value: Boolean): Self = StObject.set(x, "CopyTagsToSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyTagsToSnapshotUndefined: Self = StObject.set(x, "CopyTagsToSnapshot", js.undefined)
    
    @scala.inline
    def setDBClusterIdentifier(value: NonEmptyString): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterIdentifierUndefined: Self = StObject.set(x, "DBClusterIdentifier", js.undefined)
    
    @scala.inline
    def setDBInstanceClass(value: NonEmptyString): Self = StObject.set(x, "DBInstanceClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBInstanceClassUndefined: Self = StObject.set(x, "DBInstanceClass", js.undefined)
    
    @scala.inline
    def setDBInstanceIdentifier(value: NonEmptyString): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBInstanceIdentifierUndefined: Self = StObject.set(x, "DBInstanceIdentifier", js.undefined)
    
    @scala.inline
    def setDBName(value: NonEmptyString): Self = StObject.set(x, "DBName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBNameUndefined: Self = StObject.set(x, "DBName", js.undefined)
    
    @scala.inline
    def setDbInstancePort(value: Integer): Self = StObject.set(x, "DbInstancePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbInstancePortUndefined: Self = StObject.set(x, "DbInstancePort", js.undefined)
    
    @scala.inline
    def setDbInstanceStatus(value: NonEmptyString): Self = StObject.set(x, "DbInstanceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbInstanceStatusUndefined: Self = StObject.set(x, "DbInstanceStatus", js.undefined)
    
    @scala.inline
    def setDbParameterGroups(value: AwsRdsDbParameterGroups): Self = StObject.set(x, "DbParameterGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbParameterGroupsUndefined: Self = StObject.set(x, "DbParameterGroups", js.undefined)
    
    @scala.inline
    def setDbParameterGroupsVarargs(value: AwsRdsDbParameterGroup*): Self = StObject.set(x, "DbParameterGroups", js.Array(value :_*))
    
    @scala.inline
    def setDbSecurityGroups(value: StringList): Self = StObject.set(x, "DbSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbSecurityGroupsUndefined: Self = StObject.set(x, "DbSecurityGroups", js.undefined)
    
    @scala.inline
    def setDbSecurityGroupsVarargs(value: NonEmptyString*): Self = StObject.set(x, "DbSecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setDbSubnetGroup(value: AwsRdsDbSubnetGroup): Self = StObject.set(x, "DbSubnetGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbSubnetGroupUndefined: Self = StObject.set(x, "DbSubnetGroup", js.undefined)
    
    @scala.inline
    def setDbiResourceId(value: NonEmptyString): Self = StObject.set(x, "DbiResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbiResourceIdUndefined: Self = StObject.set(x, "DbiResourceId", js.undefined)
    
    @scala.inline
    def setDeletionProtection(value: Boolean): Self = StObject.set(x, "DeletionProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionProtectionUndefined: Self = StObject.set(x, "DeletionProtection", js.undefined)
    
    @scala.inline
    def setDomainMemberships(value: AwsRdsDbDomainMemberships): Self = StObject.set(x, "DomainMemberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainMembershipsUndefined: Self = StObject.set(x, "DomainMemberships", js.undefined)
    
    @scala.inline
    def setDomainMembershipsVarargs(value: AwsRdsDbDomainMembership*): Self = StObject.set(x, "DomainMemberships", js.Array(value :_*))
    
    @scala.inline
    def setEnabledCloudWatchLogsExports(value: StringList): Self = StObject.set(x, "EnabledCloudWatchLogsExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledCloudWatchLogsExportsUndefined: Self = StObject.set(x, "EnabledCloudWatchLogsExports", js.undefined)
    
    @scala.inline
    def setEnabledCloudWatchLogsExportsVarargs(value: NonEmptyString*): Self = StObject.set(x, "EnabledCloudWatchLogsExports", js.Array(value :_*))
    
    @scala.inline
    def setEndpoint(value: AwsRdsDbInstanceEndpoint): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    @scala.inline
    def setEngine(value: NonEmptyString): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: NonEmptyString): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setEnhancedMonitoringResourceArn(value: NonEmptyString): Self = StObject.set(x, "EnhancedMonitoringResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnhancedMonitoringResourceArnUndefined: Self = StObject.set(x, "EnhancedMonitoringResourceArn", js.undefined)
    
    @scala.inline
    def setIAMDatabaseAuthenticationEnabled(value: Boolean): Self = StObject.set(x, "IAMDatabaseAuthenticationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIAMDatabaseAuthenticationEnabledUndefined: Self = StObject.set(x, "IAMDatabaseAuthenticationEnabled", js.undefined)
    
    @scala.inline
    def setInstanceCreateTime(value: NonEmptyString): Self = StObject.set(x, "InstanceCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceCreateTimeUndefined: Self = StObject.set(x, "InstanceCreateTime", js.undefined)
    
    @scala.inline
    def setIops(value: Integer): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: NonEmptyString): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setLatestRestorableTime(value: NonEmptyString): Self = StObject.set(x, "LatestRestorableTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestRestorableTimeUndefined: Self = StObject.set(x, "LatestRestorableTime", js.undefined)
    
    @scala.inline
    def setLicenseModel(value: NonEmptyString): Self = StObject.set(x, "LicenseModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseModelUndefined: Self = StObject.set(x, "LicenseModel", js.undefined)
    
    @scala.inline
    def setListenerEndpoint(value: AwsRdsDbInstanceEndpoint): Self = StObject.set(x, "ListenerEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenerEndpointUndefined: Self = StObject.set(x, "ListenerEndpoint", js.undefined)
    
    @scala.inline
    def setMasterUsername(value: NonEmptyString): Self = StObject.set(x, "MasterUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterUsernameUndefined: Self = StObject.set(x, "MasterUsername", js.undefined)
    
    @scala.inline
    def setMaxAllocatedStorage(value: Integer): Self = StObject.set(x, "MaxAllocatedStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAllocatedStorageUndefined: Self = StObject.set(x, "MaxAllocatedStorage", js.undefined)
    
    @scala.inline
    def setMonitoringInterval(value: Integer): Self = StObject.set(x, "MonitoringInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringIntervalUndefined: Self = StObject.set(x, "MonitoringInterval", js.undefined)
    
    @scala.inline
    def setMonitoringRoleArn(value: NonEmptyString): Self = StObject.set(x, "MonitoringRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringRoleArnUndefined: Self = StObject.set(x, "MonitoringRoleArn", js.undefined)
    
    @scala.inline
    def setMultiAz(value: Boolean): Self = StObject.set(x, "MultiAz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiAzUndefined: Self = StObject.set(x, "MultiAz", js.undefined)
    
    @scala.inline
    def setOptionGroupMemberships(value: AwsRdsDbOptionGroupMemberships): Self = StObject.set(x, "OptionGroupMemberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionGroupMembershipsUndefined: Self = StObject.set(x, "OptionGroupMemberships", js.undefined)
    
    @scala.inline
    def setOptionGroupMembershipsVarargs(value: AwsRdsDbOptionGroupMembership*): Self = StObject.set(x, "OptionGroupMemberships", js.Array(value :_*))
    
    @scala.inline
    def setPendingModifiedValues(value: AwsRdsDbPendingModifiedValues): Self = StObject.set(x, "PendingModifiedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingModifiedValuesUndefined: Self = StObject.set(x, "PendingModifiedValues", js.undefined)
    
    @scala.inline
    def setPerformanceInsightsEnabled(value: Boolean): Self = StObject.set(x, "PerformanceInsightsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceInsightsEnabledUndefined: Self = StObject.set(x, "PerformanceInsightsEnabled", js.undefined)
    
    @scala.inline
    def setPerformanceInsightsKmsKeyId(value: NonEmptyString): Self = StObject.set(x, "PerformanceInsightsKmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceInsightsKmsKeyIdUndefined: Self = StObject.set(x, "PerformanceInsightsKmsKeyId", js.undefined)
    
    @scala.inline
    def setPerformanceInsightsRetentionPeriod(value: Integer): Self = StObject.set(x, "PerformanceInsightsRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceInsightsRetentionPeriodUndefined: Self = StObject.set(x, "PerformanceInsightsRetentionPeriod", js.undefined)
    
    @scala.inline
    def setPreferredBackupWindow(value: NonEmptyString): Self = StObject.set(x, "PreferredBackupWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredBackupWindowUndefined: Self = StObject.set(x, "PreferredBackupWindow", js.undefined)
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: NonEmptyString): Self = StObject.set(x, "PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "PreferredMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setProcessorFeatures(value: AwsRdsDbProcessorFeatures): Self = StObject.set(x, "ProcessorFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessorFeaturesUndefined: Self = StObject.set(x, "ProcessorFeatures", js.undefined)
    
    @scala.inline
    def setProcessorFeaturesVarargs(value: AwsRdsDbProcessorFeature*): Self = StObject.set(x, "ProcessorFeatures", js.Array(value :_*))
    
    @scala.inline
    def setPromotionTier(value: Integer): Self = StObject.set(x, "PromotionTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotionTierUndefined: Self = StObject.set(x, "PromotionTier", js.undefined)
    
    @scala.inline
    def setPubliclyAccessible(value: Boolean): Self = StObject.set(x, "PubliclyAccessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubliclyAccessibleUndefined: Self = StObject.set(x, "PubliclyAccessible", js.undefined)
    
    @scala.inline
    def setReadReplicaDBClusterIdentifiers(value: StringList): Self = StObject.set(x, "ReadReplicaDBClusterIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadReplicaDBClusterIdentifiersUndefined: Self = StObject.set(x, "ReadReplicaDBClusterIdentifiers", js.undefined)
    
    @scala.inline
    def setReadReplicaDBClusterIdentifiersVarargs(value: NonEmptyString*): Self = StObject.set(x, "ReadReplicaDBClusterIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setReadReplicaDBInstanceIdentifiers(value: StringList): Self = StObject.set(x, "ReadReplicaDBInstanceIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadReplicaDBInstanceIdentifiersUndefined: Self = StObject.set(x, "ReadReplicaDBInstanceIdentifiers", js.undefined)
    
    @scala.inline
    def setReadReplicaDBInstanceIdentifiersVarargs(value: NonEmptyString*): Self = StObject.set(x, "ReadReplicaDBInstanceIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setReadReplicaSourceDBInstanceIdentifier(value: NonEmptyString): Self = StObject.set(x, "ReadReplicaSourceDBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadReplicaSourceDBInstanceIdentifierUndefined: Self = StObject.set(x, "ReadReplicaSourceDBInstanceIdentifier", js.undefined)
    
    @scala.inline
    def setSecondaryAvailabilityZone(value: NonEmptyString): Self = StObject.set(x, "SecondaryAvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryAvailabilityZoneUndefined: Self = StObject.set(x, "SecondaryAvailabilityZone", js.undefined)
    
    @scala.inline
    def setStatusInfos(value: AwsRdsDbStatusInfos): Self = StObject.set(x, "StatusInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusInfosUndefined: Self = StObject.set(x, "StatusInfos", js.undefined)
    
    @scala.inline
    def setStatusInfosVarargs(value: AwsRdsDbStatusInfo*): Self = StObject.set(x, "StatusInfos", js.Array(value :_*))
    
    @scala.inline
    def setStorageEncrypted(value: Boolean): Self = StObject.set(x, "StorageEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageEncryptedUndefined: Self = StObject.set(x, "StorageEncrypted", js.undefined)
    
    @scala.inline
    def setStorageType(value: NonEmptyString): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
    
    @scala.inline
    def setTdeCredentialArn(value: NonEmptyString): Self = StObject.set(x, "TdeCredentialArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTdeCredentialArnUndefined: Self = StObject.set(x, "TdeCredentialArn", js.undefined)
    
    @scala.inline
    def setTimezone(value: NonEmptyString): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneUndefined: Self = StObject.set(x, "Timezone", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroups(value: AwsRdsDbInstanceVpcSecurityGroups): Self = StObject.set(x, "VpcSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcSecurityGroupsUndefined: Self = StObject.set(x, "VpcSecurityGroups", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupsVarargs(value: AwsRdsDbInstanceVpcSecurityGroup*): Self = StObject.set(x, "VpcSecurityGroups", js.Array(value :_*))
  }
}
