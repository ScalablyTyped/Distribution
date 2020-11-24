package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRdsDbInstanceDetails extends js.Object {
  
  /**
    * The amount of storage (in gigabytes) to initially allocate for the DB instance.
    */
  var AllocatedStorage: js.UndefOr[Integer] = js.native
  
  /**
    * The AWS Identity and Access Management (IAM) roles associated with the DB instance.
    */
  var AssociatedRoles: js.UndefOr[AwsRdsDbInstanceAssociatedRoles] = js.native
  
  /**
    * Indicates whether minor version patches are applied automatically.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.native
  
  /**
    * The Availability Zone where the DB instance will be created.
    */
  var AvailabilityZone: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The number of days for which to retain automated backups.
    */
  var BackupRetentionPeriod: js.UndefOr[Integer] = js.native
  
  /**
    * The identifier of the CA certificate for this DB instance.
    */
  var CACertificateIdentifier: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the character set that this DB instance is associated with.
    */
  var CharacterSetName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Whether to copy resource tags to snapshots of the DB instance.
    */
  var CopyTagsToSnapshot: js.UndefOr[Boolean] = js.native
  
  /**
    * If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance is a member of.
    */
  var DBClusterIdentifier: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Contains the name of the compute and memory capacity class of the DB instance.
    */
  var DBInstanceClass: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Contains a user-supplied database identifier. This identifier is the unique key that identifies a DB instance.
    */
  var DBInstanceIdentifier: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The meaning of this parameter differs according to the database engine you use.  MySQL, MariaDB, SQL Server, PostgreSQL  Contains the name of the initial database of this instance that was provided at create time, if one was specified when the DB instance was created. This same name is returned for the life of the DB instance.  Oracle  Contains the Oracle System ID (SID) of the created DB instance. Not shown when the returned parameters do not apply to an Oracle DB instance. 
    */
  var DBName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can be a different port than the DB cluster port.
    */
  var DbInstancePort: js.UndefOr[Integer] = js.native
  
  /**
    * The current status of the DB instance.
    */
  var DbInstanceStatus: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A list of the DB parameter groups to assign to the DB instance.
    */
  var DbParameterGroups: js.UndefOr[AwsRdsDbParameterGroups] = js.native
  
  /**
    * A list of the DB security groups to assign to the DB instance.
    */
  var DbSecurityGroups: js.UndefOr[StringList] = js.native
  
  /**
    * Information about the subnet group that is associated with the DB instance.
    */
  var DbSubnetGroup: js.UndefOr[AwsRdsDbSubnetGroup] = js.native
  
  /**
    * The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB instance is accessed. 
    */
  var DbiResourceId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates whether the DB instance has deletion protection enabled. When deletion protection is enabled, the database cannot be deleted.
    */
  var DeletionProtection: js.UndefOr[Boolean] = js.native
  
  /**
    * The Active Directory domain membership records associated with the DB instance.
    */
  var DomainMemberships: js.UndefOr[AwsRdsDbDomainMemberships] = js.native
  
  /**
    * A list of log types that this DB instance is configured to export to CloudWatch Logs.
    */
  var EnabledCloudWatchLogsExports: js.UndefOr[StringList] = js.native
  
  /**
    * Specifies the connection endpoint.
    */
  var Endpoint: js.UndefOr[AwsRdsDbInstanceEndpoint] = js.native
  
  /**
    * Provides the name of the database engine to use for this DB instance.
    */
  var Engine: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates the database engine version.
    */
  var EngineVersion: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The ARN of the CloudWatch Logs log stream that receives the enhanced monitoring metrics data for the DB instance.
    */
  var EnhancedMonitoringResourceArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and otherwise false. IAM database authentication can be enabled for the following database engines.   For MySQL 5.6, minor version 5.6.34 or higher   For MySQL 5.7, minor version 5.7.16 or higher   Aurora 5.6 or higher  
    */
  var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates when the DB instance was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var InstanceCreateTime: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Specifies the provisioned IOPS (I/O operations per second) for this DB instance.
    */
  var Iops: js.UndefOr[Integer] = js.native
  
  /**
    * If StorageEncrypted is true, the AWS KMS key identifier for the encrypted DB instance.
    */
  var KmsKeyId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Specifies the latest time to which a database can be restored with point-in-time restore. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var LatestRestorableTime: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * License model information for this DB instance.
    */
  var LicenseModel: js.UndefOr[NonEmptyString] = js.native
  
  var ListenerEndpoint: js.UndefOr[AwsRdsDbInstanceEndpoint] = js.native
  
  /**
    * The master user name of the DB instance.
    */
  var MasterUsername: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The upper limit to which Amazon RDS can automatically scale the storage of the DB instance.
    */
  var MaxAllocatedStorage: js.UndefOr[Integer] = js.native
  
  /**
    * The interval, in seconds, between points when enhanced monitoring metrics are collected for the DB instance.
    */
  var MonitoringInterval: js.UndefOr[Integer] = js.native
  
  /**
    * The ARN for the IAM role that permits Amazon RDS to send enhanced monitoring metrics to CloudWatch Logs.
    */
  var MonitoringRoleArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Whether the DB instance is a multiple Availability Zone deployment.
    */
  var MultiAz: js.UndefOr[Boolean] = js.native
  
  /**
    * The list of option group memberships for this DB instance.
    */
  var OptionGroupMemberships: js.UndefOr[AwsRdsDbOptionGroupMemberships] = js.native
  
  /**
    * Changes to the DB instance that are currently pending.
    */
  var PendingModifiedValues: js.UndefOr[AwsRdsDbPendingModifiedValues] = js.native
  
  /**
    * Indicates whether Performance Insights is enabled for the DB instance.
    */
  var PerformanceInsightsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The identifier of the AWS KMS key used to encrypt the Performance Insights data.
    */
  var PerformanceInsightsKmsKeyId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The number of days to retain Performance Insights data.
    */
  var PerformanceInsightsRetentionPeriod: js.UndefOr[Integer] = js.native
  
  /**
    * The range of time each day when automated backups are created, if automated backups are enabled. Uses the format HH:MM-HH:MM. For example, 04:52-05:22.
    */
  var PreferredBackupWindow: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC). Uses the format &lt;day&gt;:HH:MM-&lt;day&gt;:HH:MM. For the day values, use mon|tue|wed|thu|fri|sat|sun. For example, sun:09:32-sun:10:02.
    */
  var PreferredMaintenanceWindow: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
    */
  var ProcessorFeatures: js.UndefOr[AwsRdsDbProcessorFeatures] = js.native
  
  /**
    * The order in which to promote an Aurora replica to the primary instance after a failure of the existing primary instance.
    */
  var PromotionTier: js.UndefOr[Integer] = js.native
  
  /**
    * Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing instance with a publicly resolvable DNS name, which resolves to a public IP address. A value of false specifies an internal instance with a DNS name that resolves to a private IP address. 
    */
  var PubliclyAccessible: js.UndefOr[Boolean] = js.native
  
  /**
    * List of identifiers of Aurora DB clusters to which the RDS DB instance is replicated as a read replica.
    */
  var ReadReplicaDBClusterIdentifiers: js.UndefOr[StringList] = js.native
  
  /**
    * List of identifiers of the read replicas associated with this DB instance.
    */
  var ReadReplicaDBInstanceIdentifiers: js.UndefOr[StringList] = js.native
  
  /**
    * If this DB instance is a read replica, contains the identifier of the source DB instance.
    */
  var ReadReplicaSourceDBInstanceIdentifier: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * For a DB instance with multi-Availability Zone support, the name of the secondary Availability Zone.
    */
  var SecondaryAvailabilityZone: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The status of a read replica. If the instance isn't a read replica, this is empty.
    */
  var StatusInfos: js.UndefOr[AwsRdsDbStatusInfos] = js.native
  
  /**
    * Specifies whether the DB instance is encrypted.
    */
  var StorageEncrypted: js.UndefOr[Boolean] = js.native
  
  /**
    * The storage type for the DB instance.
    */
  var StorageType: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The ARN from the key store with which the instance is associated for TDE encryption.
    */
  var TdeCredentialArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The time zone of the DB instance.
    */
  var Timezone: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A list of VPC security groups that the DB instance belongs to.
    */
  var VpcSecurityGroups: js.UndefOr[AwsRdsDbInstanceVpcSecurityGroups] = js.native
}
object AwsRdsDbInstanceDetails {
  
  @scala.inline
  def apply(): AwsRdsDbInstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbInstanceDetails]
  }
  
  @scala.inline
  implicit class AwsRdsDbInstanceDetailsOps[Self <: AwsRdsDbInstanceDetails] (val x: Self) extends AnyVal {
    
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
    def setAllocatedStorage(value: Integer): Self = this.set("AllocatedStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllocatedStorage: Self = this.set("AllocatedStorage", js.undefined)
    
    @scala.inline
    def setAssociatedRolesVarargs(value: AwsRdsDbInstanceAssociatedRole*): Self = this.set("AssociatedRoles", js.Array(value :_*))
    
    @scala.inline
    def setAssociatedRoles(value: AwsRdsDbInstanceAssociatedRoles): Self = this.set("AssociatedRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociatedRoles: Self = this.set("AssociatedRoles", js.undefined)
    
    @scala.inline
    def setAutoMinorVersionUpgrade(value: Boolean): Self = this.set("AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoMinorVersionUpgrade: Self = this.set("AutoMinorVersionUpgrade", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: NonEmptyString): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    
    @scala.inline
    def setBackupRetentionPeriod(value: Integer): Self = this.set("BackupRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupRetentionPeriod: Self = this.set("BackupRetentionPeriod", js.undefined)
    
    @scala.inline
    def setCACertificateIdentifier(value: NonEmptyString): Self = this.set("CACertificateIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCACertificateIdentifier: Self = this.set("CACertificateIdentifier", js.undefined)
    
    @scala.inline
    def setCharacterSetName(value: NonEmptyString): Self = this.set("CharacterSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharacterSetName: Self = this.set("CharacterSetName", js.undefined)
    
    @scala.inline
    def setCopyTagsToSnapshot(value: Boolean): Self = this.set("CopyTagsToSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyTagsToSnapshot: Self = this.set("CopyTagsToSnapshot", js.undefined)
    
    @scala.inline
    def setDBClusterIdentifier(value: NonEmptyString): Self = this.set("DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBClusterIdentifier: Self = this.set("DBClusterIdentifier", js.undefined)
    
    @scala.inline
    def setDBInstanceClass(value: NonEmptyString): Self = this.set("DBInstanceClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBInstanceClass: Self = this.set("DBInstanceClass", js.undefined)
    
    @scala.inline
    def setDBInstanceIdentifier(value: NonEmptyString): Self = this.set("DBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBInstanceIdentifier: Self = this.set("DBInstanceIdentifier", js.undefined)
    
    @scala.inline
    def setDBName(value: NonEmptyString): Self = this.set("DBName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBName: Self = this.set("DBName", js.undefined)
    
    @scala.inline
    def setDbInstancePort(value: Integer): Self = this.set("DbInstancePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbInstancePort: Self = this.set("DbInstancePort", js.undefined)
    
    @scala.inline
    def setDbInstanceStatus(value: NonEmptyString): Self = this.set("DbInstanceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbInstanceStatus: Self = this.set("DbInstanceStatus", js.undefined)
    
    @scala.inline
    def setDbParameterGroupsVarargs(value: AwsRdsDbParameterGroup*): Self = this.set("DbParameterGroups", js.Array(value :_*))
    
    @scala.inline
    def setDbParameterGroups(value: AwsRdsDbParameterGroups): Self = this.set("DbParameterGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbParameterGroups: Self = this.set("DbParameterGroups", js.undefined)
    
    @scala.inline
    def setDbSecurityGroupsVarargs(value: NonEmptyString*): Self = this.set("DbSecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setDbSecurityGroups(value: StringList): Self = this.set("DbSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbSecurityGroups: Self = this.set("DbSecurityGroups", js.undefined)
    
    @scala.inline
    def setDbSubnetGroup(value: AwsRdsDbSubnetGroup): Self = this.set("DbSubnetGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbSubnetGroup: Self = this.set("DbSubnetGroup", js.undefined)
    
    @scala.inline
    def setDbiResourceId(value: NonEmptyString): Self = this.set("DbiResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbiResourceId: Self = this.set("DbiResourceId", js.undefined)
    
    @scala.inline
    def setDeletionProtection(value: Boolean): Self = this.set("DeletionProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletionProtection: Self = this.set("DeletionProtection", js.undefined)
    
    @scala.inline
    def setDomainMembershipsVarargs(value: AwsRdsDbDomainMembership*): Self = this.set("DomainMemberships", js.Array(value :_*))
    
    @scala.inline
    def setDomainMemberships(value: AwsRdsDbDomainMemberships): Self = this.set("DomainMemberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainMemberships: Self = this.set("DomainMemberships", js.undefined)
    
    @scala.inline
    def setEnabledCloudWatchLogsExportsVarargs(value: NonEmptyString*): Self = this.set("EnabledCloudWatchLogsExports", js.Array(value :_*))
    
    @scala.inline
    def setEnabledCloudWatchLogsExports(value: StringList): Self = this.set("EnabledCloudWatchLogsExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledCloudWatchLogsExports: Self = this.set("EnabledCloudWatchLogsExports", js.undefined)
    
    @scala.inline
    def setEndpoint(value: AwsRdsDbInstanceEndpoint): Self = this.set("Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("Endpoint", js.undefined)
    
    @scala.inline
    def setEngine(value: NonEmptyString): Self = this.set("Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("Engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: NonEmptyString): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    
    @scala.inline
    def setEnhancedMonitoringResourceArn(value: NonEmptyString): Self = this.set("EnhancedMonitoringResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnhancedMonitoringResourceArn: Self = this.set("EnhancedMonitoringResourceArn", js.undefined)
    
    @scala.inline
    def setIAMDatabaseAuthenticationEnabled(value: Boolean): Self = this.set("IAMDatabaseAuthenticationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIAMDatabaseAuthenticationEnabled: Self = this.set("IAMDatabaseAuthenticationEnabled", js.undefined)
    
    @scala.inline
    def setInstanceCreateTime(value: NonEmptyString): Self = this.set("InstanceCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceCreateTime: Self = this.set("InstanceCreateTime", js.undefined)
    
    @scala.inline
    def setIops(value: Integer): Self = this.set("Iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIops: Self = this.set("Iops", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: NonEmptyString): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    
    @scala.inline
    def setLatestRestorableTime(value: NonEmptyString): Self = this.set("LatestRestorableTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestRestorableTime: Self = this.set("LatestRestorableTime", js.undefined)
    
    @scala.inline
    def setLicenseModel(value: NonEmptyString): Self = this.set("LicenseModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseModel: Self = this.set("LicenseModel", js.undefined)
    
    @scala.inline
    def setListenerEndpoint(value: AwsRdsDbInstanceEndpoint): Self = this.set("ListenerEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListenerEndpoint: Self = this.set("ListenerEndpoint", js.undefined)
    
    @scala.inline
    def setMasterUsername(value: NonEmptyString): Self = this.set("MasterUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterUsername: Self = this.set("MasterUsername", js.undefined)
    
    @scala.inline
    def setMaxAllocatedStorage(value: Integer): Self = this.set("MaxAllocatedStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAllocatedStorage: Self = this.set("MaxAllocatedStorage", js.undefined)
    
    @scala.inline
    def setMonitoringInterval(value: Integer): Self = this.set("MonitoringInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoringInterval: Self = this.set("MonitoringInterval", js.undefined)
    
    @scala.inline
    def setMonitoringRoleArn(value: NonEmptyString): Self = this.set("MonitoringRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoringRoleArn: Self = this.set("MonitoringRoleArn", js.undefined)
    
    @scala.inline
    def setMultiAz(value: Boolean): Self = this.set("MultiAz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiAz: Self = this.set("MultiAz", js.undefined)
    
    @scala.inline
    def setOptionGroupMembershipsVarargs(value: AwsRdsDbOptionGroupMembership*): Self = this.set("OptionGroupMemberships", js.Array(value :_*))
    
    @scala.inline
    def setOptionGroupMemberships(value: AwsRdsDbOptionGroupMemberships): Self = this.set("OptionGroupMemberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionGroupMemberships: Self = this.set("OptionGroupMemberships", js.undefined)
    
    @scala.inline
    def setPendingModifiedValues(value: AwsRdsDbPendingModifiedValues): Self = this.set("PendingModifiedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingModifiedValues: Self = this.set("PendingModifiedValues", js.undefined)
    
    @scala.inline
    def setPerformanceInsightsEnabled(value: Boolean): Self = this.set("PerformanceInsightsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformanceInsightsEnabled: Self = this.set("PerformanceInsightsEnabled", js.undefined)
    
    @scala.inline
    def setPerformanceInsightsKmsKeyId(value: NonEmptyString): Self = this.set("PerformanceInsightsKmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformanceInsightsKmsKeyId: Self = this.set("PerformanceInsightsKmsKeyId", js.undefined)
    
    @scala.inline
    def setPerformanceInsightsRetentionPeriod(value: Integer): Self = this.set("PerformanceInsightsRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformanceInsightsRetentionPeriod: Self = this.set("PerformanceInsightsRetentionPeriod", js.undefined)
    
    @scala.inline
    def setPreferredBackupWindow(value: NonEmptyString): Self = this.set("PreferredBackupWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredBackupWindow: Self = this.set("PreferredBackupWindow", js.undefined)
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: NonEmptyString): Self = this.set("PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredMaintenanceWindow: Self = this.set("PreferredMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setProcessorFeaturesVarargs(value: AwsRdsDbProcessorFeature*): Self = this.set("ProcessorFeatures", js.Array(value :_*))
    
    @scala.inline
    def setProcessorFeatures(value: AwsRdsDbProcessorFeatures): Self = this.set("ProcessorFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessorFeatures: Self = this.set("ProcessorFeatures", js.undefined)
    
    @scala.inline
    def setPromotionTier(value: Integer): Self = this.set("PromotionTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromotionTier: Self = this.set("PromotionTier", js.undefined)
    
    @scala.inline
    def setPubliclyAccessible(value: Boolean): Self = this.set("PubliclyAccessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubliclyAccessible: Self = this.set("PubliclyAccessible", js.undefined)
    
    @scala.inline
    def setReadReplicaDBClusterIdentifiersVarargs(value: NonEmptyString*): Self = this.set("ReadReplicaDBClusterIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setReadReplicaDBClusterIdentifiers(value: StringList): Self = this.set("ReadReplicaDBClusterIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadReplicaDBClusterIdentifiers: Self = this.set("ReadReplicaDBClusterIdentifiers", js.undefined)
    
    @scala.inline
    def setReadReplicaDBInstanceIdentifiersVarargs(value: NonEmptyString*): Self = this.set("ReadReplicaDBInstanceIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setReadReplicaDBInstanceIdentifiers(value: StringList): Self = this.set("ReadReplicaDBInstanceIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadReplicaDBInstanceIdentifiers: Self = this.set("ReadReplicaDBInstanceIdentifiers", js.undefined)
    
    @scala.inline
    def setReadReplicaSourceDBInstanceIdentifier(value: NonEmptyString): Self = this.set("ReadReplicaSourceDBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadReplicaSourceDBInstanceIdentifier: Self = this.set("ReadReplicaSourceDBInstanceIdentifier", js.undefined)
    
    @scala.inline
    def setSecondaryAvailabilityZone(value: NonEmptyString): Self = this.set("SecondaryAvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryAvailabilityZone: Self = this.set("SecondaryAvailabilityZone", js.undefined)
    
    @scala.inline
    def setStatusInfosVarargs(value: AwsRdsDbStatusInfo*): Self = this.set("StatusInfos", js.Array(value :_*))
    
    @scala.inline
    def setStatusInfos(value: AwsRdsDbStatusInfos): Self = this.set("StatusInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusInfos: Self = this.set("StatusInfos", js.undefined)
    
    @scala.inline
    def setStorageEncrypted(value: Boolean): Self = this.set("StorageEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageEncrypted: Self = this.set("StorageEncrypted", js.undefined)
    
    @scala.inline
    def setStorageType(value: NonEmptyString): Self = this.set("StorageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageType: Self = this.set("StorageType", js.undefined)
    
    @scala.inline
    def setTdeCredentialArn(value: NonEmptyString): Self = this.set("TdeCredentialArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTdeCredentialArn: Self = this.set("TdeCredentialArn", js.undefined)
    
    @scala.inline
    def setTimezone(value: NonEmptyString): Self = this.set("Timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone: Self = this.set("Timezone", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupsVarargs(value: AwsRdsDbInstanceVpcSecurityGroup*): Self = this.set("VpcSecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setVpcSecurityGroups(value: AwsRdsDbInstanceVpcSecurityGroups): Self = this.set("VpcSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcSecurityGroups: Self = this.set("VpcSecurityGroups", js.undefined)
  }
}
