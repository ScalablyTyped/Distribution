package typings.awsSdk.neptuneMod

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
    *  (Not supported by Neptune) 
    */
  var CharacterSetName: js.UndefOr[String] = js.native
  /**
    * Specifies whether tags are copied from the DB instance to snapshots of the DB instance.
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
    * Specifies the current state of this database.
    */
  var DBInstanceStatus: js.UndefOr[String] = js.native
  /**
    * The database name.
    */
  var DBName: js.UndefOr[String] = js.native
  /**
    * Provides the list of DB parameter groups applied to this DB instance.
    */
  var DBParameterGroups: js.UndefOr[DBParameterGroupStatusList] = js.native
  /**
    *  Provides List of DB security group elements containing only DBSecurityGroup.Name and DBSecurityGroup.Status subelements.
    */
  var DBSecurityGroups: js.UndefOr[DBSecurityGroupMembershipList] = js.native
  /**
    * Specifies information on the subnet group associated with the DB instance, including the name, description, and subnets in the subnet group.
    */
  var DBSubnetGroup: js.UndefOr[typings.awsSdk.neptuneMod.DBSubnetGroup] = js.native
  /**
    * Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can be a different port than the DB cluster port.
    */
  var DbInstancePort: js.UndefOr[Integer] = js.native
  /**
    * The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB instance is accessed.
    */
  var DbiResourceId: js.UndefOr[String] = js.native
  /**
    * Indicates whether or not the DB instance has deletion protection enabled. The instance can't be deleted when deletion protection is enabled. See Deleting a DB Instance.
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.native
  /**
    * Not supported
    */
  var DomainMemberships: js.UndefOr[DomainMembershipList] = js.native
  /**
    * A list of log types that this DB instance is configured to export to CloudWatch Logs.
    */
  var EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.native
  /**
    * Specifies the connection endpoint.
    */
  var Endpoint: js.UndefOr[typings.awsSdk.neptuneMod.Endpoint] = js.native
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
    * True if AWS Identity and Access Management (IAM) authentication is enabled, and otherwise false.
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
    *  Not supported: The encryption for DB instances is managed by the DB cluster.
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
    * Contains the master username for the DB instance.
    */
  var MasterUsername: js.UndefOr[String] = js.native
  /**
    * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance.
    */
  var MonitoringInterval: js.UndefOr[IntegerOptional] = js.native
  /**
    * The ARN for the IAM role that permits Neptune to send Enhanced Monitoring metrics to Amazon CloudWatch Logs.
    */
  var MonitoringRoleArn: js.UndefOr[String] = js.native
  /**
    * Specifies if the DB instance is a Multi-AZ deployment.
    */
  var MultiAZ: js.UndefOr[Boolean] = js.native
  /**
    *  (Not supported by Neptune) 
    */
  var OptionGroupMemberships: js.UndefOr[OptionGroupMembershipList] = js.native
  /**
    * Specifies that changes to the DB instance are pending. This element is only included when changes are pending. Specific changes are identified by subelements.
    */
  var PendingModifiedValues: js.UndefOr[typings.awsSdk.neptuneMod.PendingModifiedValues] = js.native
  /**
    *  (Not supported by Neptune) 
    */
  var PerformanceInsightsEnabled: js.UndefOr[BooleanOptional] = js.native
  /**
    *  (Not supported by Neptune) 
    */
  var PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.native
  /**
    *  Specifies the daily time range during which automated backups are created if automated backups are enabled, as determined by the BackupRetentionPeriod.
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.native
  /**
    * Specifies the weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  /**
    * A value that specifies the order in which a Read Replica is promoted to the primary instance after a failure of the existing primary instance. 
    */
  var PromotionTier: js.UndefOr[IntegerOptional] = js.native
  /**
    * This flag should no longer be used.
    */
  var PubliclyAccessible: js.UndefOr[Boolean] = js.native
  /**
    * Contains one or more identifiers of DB clusters that are Read Replicas of this DB instance.
    */
  var ReadReplicaDBClusterIdentifiers: js.UndefOr[ReadReplicaDBClusterIdentifierList] = js.native
  /**
    * Contains one or more identifiers of the Read Replicas associated with this DB instance.
    */
  var ReadReplicaDBInstanceIdentifiers: js.UndefOr[ReadReplicaDBInstanceIdentifierList] = js.native
  /**
    * Contains the identifier of the source DB instance if this DB instance is a Read Replica.
    */
  var ReadReplicaSourceDBInstanceIdentifier: js.UndefOr[String] = js.native
  /**
    * If present, specifies the name of the secondary Availability Zone for a DB instance with multi-AZ support.
    */
  var SecondaryAvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The status of a Read Replica. If the instance is not a Read Replica, this is blank.
    */
  var StatusInfos: js.UndefOr[DBInstanceStatusInfoList] = js.native
  /**
    * Not supported: The encryption for DB instances is managed by the DB cluster.
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
    * Not supported.
    */
  var Timezone: js.UndefOr[String] = js.native
  /**
    * Provides a list of VPC security group elements that the DB instance belongs to.
    */
  var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.native
}

object DBInstance {
  @scala.inline
  def apply(): DBInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBInstance]
  }
  @scala.inline
  implicit class DBInstanceOps[Self <: DBInstance] (val x: Self) extends AnyVal {
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
    def setAllocatedStorage(value: Integer): Self = this.set("AllocatedStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocatedStorage: Self = this.set("AllocatedStorage", js.undefined)
    @scala.inline
    def setAutoMinorVersionUpgrade(value: Boolean): Self = this.set("AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoMinorVersionUpgrade: Self = this.set("AutoMinorVersionUpgrade", js.undefined)
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    @scala.inline
    def setBackupRetentionPeriod(value: Integer): Self = this.set("BackupRetentionPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupRetentionPeriod: Self = this.set("BackupRetentionPeriod", js.undefined)
    @scala.inline
    def setCACertificateIdentifier(value: String): Self = this.set("CACertificateIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCACertificateIdentifier: Self = this.set("CACertificateIdentifier", js.undefined)
    @scala.inline
    def setCharacterSetName(value: String): Self = this.set("CharacterSetName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharacterSetName: Self = this.set("CharacterSetName", js.undefined)
    @scala.inline
    def setCopyTagsToSnapshot(value: Boolean): Self = this.set("CopyTagsToSnapshot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyTagsToSnapshot: Self = this.set("CopyTagsToSnapshot", js.undefined)
    @scala.inline
    def setDBClusterIdentifier(value: String): Self = this.set("DBClusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBClusterIdentifier: Self = this.set("DBClusterIdentifier", js.undefined)
    @scala.inline
    def setDBInstanceArn(value: String): Self = this.set("DBInstanceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBInstanceArn: Self = this.set("DBInstanceArn", js.undefined)
    @scala.inline
    def setDBInstanceClass(value: String): Self = this.set("DBInstanceClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBInstanceClass: Self = this.set("DBInstanceClass", js.undefined)
    @scala.inline
    def setDBInstanceIdentifier(value: String): Self = this.set("DBInstanceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBInstanceIdentifier: Self = this.set("DBInstanceIdentifier", js.undefined)
    @scala.inline
    def setDBInstanceStatus(value: String): Self = this.set("DBInstanceStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBInstanceStatus: Self = this.set("DBInstanceStatus", js.undefined)
    @scala.inline
    def setDBName(value: String): Self = this.set("DBName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBName: Self = this.set("DBName", js.undefined)
    @scala.inline
    def setDBParameterGroupsVarargs(value: DBParameterGroupStatus*): Self = this.set("DBParameterGroups", js.Array(value :_*))
    @scala.inline
    def setDBParameterGroups(value: DBParameterGroupStatusList): Self = this.set("DBParameterGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBParameterGroups: Self = this.set("DBParameterGroups", js.undefined)
    @scala.inline
    def setDBSecurityGroupsVarargs(value: DBSecurityGroupMembership*): Self = this.set("DBSecurityGroups", js.Array(value :_*))
    @scala.inline
    def setDBSecurityGroups(value: DBSecurityGroupMembershipList): Self = this.set("DBSecurityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBSecurityGroups: Self = this.set("DBSecurityGroups", js.undefined)
    @scala.inline
    def setDBSubnetGroup(value: DBSubnetGroup): Self = this.set("DBSubnetGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBSubnetGroup: Self = this.set("DBSubnetGroup", js.undefined)
    @scala.inline
    def setDbInstancePort(value: Integer): Self = this.set("DbInstancePort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDbInstancePort: Self = this.set("DbInstancePort", js.undefined)
    @scala.inline
    def setDbiResourceId(value: String): Self = this.set("DbiResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDbiResourceId: Self = this.set("DbiResourceId", js.undefined)
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
    def setEnabledCloudwatchLogsExportsVarargs(value: String*): Self = this.set("EnabledCloudwatchLogsExports", js.Array(value :_*))
    @scala.inline
    def setEnabledCloudwatchLogsExports(value: LogTypeList): Self = this.set("EnabledCloudwatchLogsExports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabledCloudwatchLogsExports: Self = this.set("EnabledCloudwatchLogsExports", js.undefined)
    @scala.inline
    def setEndpoint(value: Endpoint): Self = this.set("Endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("Endpoint", js.undefined)
    @scala.inline
    def setEngine(value: String): Self = this.set("Engine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngine: Self = this.set("Engine", js.undefined)
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    @scala.inline
    def setEnhancedMonitoringResourceArn(value: String): Self = this.set("EnhancedMonitoringResourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnhancedMonitoringResourceArn: Self = this.set("EnhancedMonitoringResourceArn", js.undefined)
    @scala.inline
    def setIAMDatabaseAuthenticationEnabled(value: Boolean): Self = this.set("IAMDatabaseAuthenticationEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIAMDatabaseAuthenticationEnabled: Self = this.set("IAMDatabaseAuthenticationEnabled", js.undefined)
    @scala.inline
    def setInstanceCreateTime(value: TStamp): Self = this.set("InstanceCreateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceCreateTime: Self = this.set("InstanceCreateTime", js.undefined)
    @scala.inline
    def setIops(value: IntegerOptional): Self = this.set("Iops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIops: Self = this.set("Iops", js.undefined)
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    @scala.inline
    def setLatestRestorableTime(value: TStamp): Self = this.set("LatestRestorableTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatestRestorableTime: Self = this.set("LatestRestorableTime", js.undefined)
    @scala.inline
    def setLicenseModel(value: String): Self = this.set("LicenseModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseModel: Self = this.set("LicenseModel", js.undefined)
    @scala.inline
    def setMasterUsername(value: String): Self = this.set("MasterUsername", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterUsername: Self = this.set("MasterUsername", js.undefined)
    @scala.inline
    def setMonitoringInterval(value: IntegerOptional): Self = this.set("MonitoringInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonitoringInterval: Self = this.set("MonitoringInterval", js.undefined)
    @scala.inline
    def setMonitoringRoleArn(value: String): Self = this.set("MonitoringRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonitoringRoleArn: Self = this.set("MonitoringRoleArn", js.undefined)
    @scala.inline
    def setMultiAZ(value: Boolean): Self = this.set("MultiAZ", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiAZ: Self = this.set("MultiAZ", js.undefined)
    @scala.inline
    def setOptionGroupMembershipsVarargs(value: OptionGroupMembership*): Self = this.set("OptionGroupMemberships", js.Array(value :_*))
    @scala.inline
    def setOptionGroupMemberships(value: OptionGroupMembershipList): Self = this.set("OptionGroupMemberships", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionGroupMemberships: Self = this.set("OptionGroupMemberships", js.undefined)
    @scala.inline
    def setPendingModifiedValues(value: PendingModifiedValues): Self = this.set("PendingModifiedValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePendingModifiedValues: Self = this.set("PendingModifiedValues", js.undefined)
    @scala.inline
    def setPerformanceInsightsEnabled(value: BooleanOptional): Self = this.set("PerformanceInsightsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerformanceInsightsEnabled: Self = this.set("PerformanceInsightsEnabled", js.undefined)
    @scala.inline
    def setPerformanceInsightsKMSKeyId(value: String): Self = this.set("PerformanceInsightsKMSKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerformanceInsightsKMSKeyId: Self = this.set("PerformanceInsightsKMSKeyId", js.undefined)
    @scala.inline
    def setPreferredBackupWindow(value: String): Self = this.set("PreferredBackupWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredBackupWindow: Self = this.set("PreferredBackupWindow", js.undefined)
    @scala.inline
    def setPreferredMaintenanceWindow(value: String): Self = this.set("PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredMaintenanceWindow: Self = this.set("PreferredMaintenanceWindow", js.undefined)
    @scala.inline
    def setPromotionTier(value: IntegerOptional): Self = this.set("PromotionTier", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromotionTier: Self = this.set("PromotionTier", js.undefined)
    @scala.inline
    def setPubliclyAccessible(value: Boolean): Self = this.set("PubliclyAccessible", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePubliclyAccessible: Self = this.set("PubliclyAccessible", js.undefined)
    @scala.inline
    def setReadReplicaDBClusterIdentifiersVarargs(value: String*): Self = this.set("ReadReplicaDBClusterIdentifiers", js.Array(value :_*))
    @scala.inline
    def setReadReplicaDBClusterIdentifiers(value: ReadReplicaDBClusterIdentifierList): Self = this.set("ReadReplicaDBClusterIdentifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadReplicaDBClusterIdentifiers: Self = this.set("ReadReplicaDBClusterIdentifiers", js.undefined)
    @scala.inline
    def setReadReplicaDBInstanceIdentifiersVarargs(value: String*): Self = this.set("ReadReplicaDBInstanceIdentifiers", js.Array(value :_*))
    @scala.inline
    def setReadReplicaDBInstanceIdentifiers(value: ReadReplicaDBInstanceIdentifierList): Self = this.set("ReadReplicaDBInstanceIdentifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadReplicaDBInstanceIdentifiers: Self = this.set("ReadReplicaDBInstanceIdentifiers", js.undefined)
    @scala.inline
    def setReadReplicaSourceDBInstanceIdentifier(value: String): Self = this.set("ReadReplicaSourceDBInstanceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadReplicaSourceDBInstanceIdentifier: Self = this.set("ReadReplicaSourceDBInstanceIdentifier", js.undefined)
    @scala.inline
    def setSecondaryAvailabilityZone(value: String): Self = this.set("SecondaryAvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryAvailabilityZone: Self = this.set("SecondaryAvailabilityZone", js.undefined)
    @scala.inline
    def setStatusInfosVarargs(value: DBInstanceStatusInfo*): Self = this.set("StatusInfos", js.Array(value :_*))
    @scala.inline
    def setStatusInfos(value: DBInstanceStatusInfoList): Self = this.set("StatusInfos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusInfos: Self = this.set("StatusInfos", js.undefined)
    @scala.inline
    def setStorageEncrypted(value: Boolean): Self = this.set("StorageEncrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageEncrypted: Self = this.set("StorageEncrypted", js.undefined)
    @scala.inline
    def setStorageType(value: String): Self = this.set("StorageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageType: Self = this.set("StorageType", js.undefined)
    @scala.inline
    def setTdeCredentialArn(value: String): Self = this.set("TdeCredentialArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTdeCredentialArn: Self = this.set("TdeCredentialArn", js.undefined)
    @scala.inline
    def setTimezone(value: String): Self = this.set("Timezone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezone: Self = this.set("Timezone", js.undefined)
    @scala.inline
    def setVpcSecurityGroupsVarargs(value: VpcSecurityGroupMembership*): Self = this.set("VpcSecurityGroups", js.Array(value :_*))
    @scala.inline
    def setVpcSecurityGroups(value: VpcSecurityGroupMembershipList): Self = this.set("VpcSecurityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcSecurityGroups: Self = this.set("VpcSecurityGroups", js.undefined)
  }
  
}

