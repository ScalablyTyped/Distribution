package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDBInstanceMessage extends js.Object {
  /**
    * The new amount of storage (in gibibytes) to allocate for the DB instance. Not applicable. Storage is managed by the DB Cluster.
    */
  var AllocatedStorage: js.UndefOr[IntegerOptional] = js.native
  /**
    * Indicates that major version upgrades are allowed. Changing this parameter doesn't result in an outage and the change is asynchronously applied as soon as possible.
    */
  var AllowMajorVersionUpgrade: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether the modifications in this request and any pending modifications are asynchronously applied as soon as possible, regardless of the PreferredMaintenanceWindow setting for the DB instance.  If this parameter is set to false, changes to the DB instance are applied during the next maintenance window. Some parameter changes can cause an outage and are applied on the next call to RebootDBInstance, or the next failure reboot. Default: false 
    */
  var ApplyImmediately: js.UndefOr[Boolean] = js.native
  /**
    *  Indicates that minor version upgrades are applied automatically to the DB instance during the maintenance window. Changing this parameter doesn't result in an outage except in the following case and the change is asynchronously applied as soon as possible. An outage will result if this parameter is set to true during the maintenance window, and a newer minor version is available, and Neptune has enabled auto patching for that engine version.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.native
  /**
    * Not applicable. The retention period for automated backups is managed by the DB cluster. For more information, see ModifyDBCluster. Default: Uses existing setting
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  /**
    * Indicates the certificate that needs to be associated with the instance.
    */
  var CACertificateIdentifier: js.UndefOr[String] = js.native
  /**
    * The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB instance or DB cluster.
    */
  var CloudwatchLogsExportConfiguration: js.UndefOr[typings.awsSdk.neptuneMod.CloudwatchLogsExportConfiguration] = js.native
  /**
    * True to copy all tags from the DB instance to snapshots of the DB instance, and otherwise false. The default is false.
    */
  var CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.native
  /**
    * The new compute and memory capacity of the DB instance, for example, db.m4.large. Not all DB instance classes are available in all AWS Regions. If you modify the DB instance class, an outage occurs during the change. The change is applied during the next maintenance window, unless ApplyImmediately is specified as true for this request. Default: Uses existing setting
    */
  var DBInstanceClass: js.UndefOr[String] = js.native
  /**
    * The DB instance identifier. This value is stored as a lowercase string. Constraints:   Must match the identifier of an existing DBInstance.  
    */
  var DBInstanceIdentifier: String = js.native
  /**
    * The name of the DB parameter group to apply to the DB instance. Changing this setting doesn't result in an outage. The parameter group name itself is changed immediately, but the actual parameter changes are not applied until you reboot the instance without failover. The db instance will NOT be rebooted automatically and the parameter changes will NOT be applied during the next maintenance window. Default: Uses existing setting Constraints: The DB parameter group must be in the same DB parameter group family as this DB instance.
    */
  var DBParameterGroupName: js.UndefOr[String] = js.native
  /**
    * The port number on which the database accepts connections. The value of the DBPortNumber parameter must not match any of the port values specified for options in the option group for the DB instance. Your database will restart when you change the DBPortNumber value regardless of the value of the ApplyImmediately parameter.  Default: 8182 
    */
  var DBPortNumber: js.UndefOr[IntegerOptional] = js.native
  /**
    * A list of DB security groups to authorize on this DB instance. Changing this setting doesn't result in an outage and the change is asynchronously applied as soon as possible. Constraints:   If supplied, must match existing DBSecurityGroups.  
    */
  var DBSecurityGroups: js.UndefOr[DBSecurityGroupNameList] = js.native
  /**
    * The new DB subnet group for the DB instance. You can use this parameter to move your DB instance to a different VPC. Changing the subnet group causes an outage during the change. The change is applied during the next maintenance window, unless you specify true for the ApplyImmediately parameter. Constraints: If supplied, must match the name of an existing DBSubnetGroup. Example: mySubnetGroup 
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.native
  /**
    * A value that indicates whether the DB instance has deletion protection enabled. The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled. See Deleting a DB Instance.
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.native
  /**
    * Not supported.
    */
  var Domain: js.UndefOr[String] = js.native
  /**
    * Not supported
    */
  var DomainIAMRoleName: js.UndefOr[String] = js.native
  /**
    * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and otherwise false. You can enable IAM database authentication for the following database engines Not applicable. Mapping AWS IAM accounts to database accounts is managed by the DB cluster. For more information, see ModifyDBCluster. Default: false 
    */
  var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.native
  /**
    *  (Not supported by Neptune) 
    */
  var EnablePerformanceInsights: js.UndefOr[BooleanOptional] = js.native
  /**
    * The version number of the database engine to upgrade to. Currently, setting this parameter has no effect. To upgrade your database engine to the most recent release, use the ApplyPendingMaintenanceAction API.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * The new Provisioned IOPS (I/O operations per second) value for the instance. Changing this setting doesn't result in an outage and the change is applied during the next maintenance window unless the ApplyImmediately parameter is set to true for this request. Default: Uses existing setting
    */
  var Iops: js.UndefOr[IntegerOptional] = js.native
  /**
    * Not supported.
    */
  var LicenseModel: js.UndefOr[String] = js.native
  /**
    * Not applicable.
    */
  var MasterUserPassword: js.UndefOr[String] = js.native
  /**
    * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0. If MonitoringRoleArn is specified, then you must also set MonitoringInterval to a value other than 0. Valid Values: 0, 1, 5, 10, 15, 30, 60 
    */
  var MonitoringInterval: js.UndefOr[IntegerOptional] = js.native
  /**
    * The ARN for the IAM role that permits Neptune to send enhanced monitoring metrics to Amazon CloudWatch Logs. For example, arn:aws:iam:123456789012:role/emaccess. If MonitoringInterval is set to a value other than 0, then you must supply a MonitoringRoleArn value.
    */
  var MonitoringRoleArn: js.UndefOr[String] = js.native
  /**
    * Specifies if the DB instance is a Multi-AZ deployment. Changing this parameter doesn't result in an outage and the change is applied during the next maintenance window unless the ApplyImmediately parameter is set to true for this request.
    */
  var MultiAZ: js.UndefOr[BooleanOptional] = js.native
  /**
    *  The new DB instance identifier for the DB instance when renaming a DB instance. When you change the DB instance identifier, an instance reboot will occur immediately if you set Apply Immediately to true, or will occur during the next maintenance window if Apply Immediately to false. This value is stored as a lowercase string. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   The first character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: mydbinstance 
    */
  var NewDBInstanceIdentifier: js.UndefOr[String] = js.native
  /**
    *  (Not supported by Neptune) 
    */
  var OptionGroupName: js.UndefOr[String] = js.native
  /**
    *  (Not supported by Neptune) 
    */
  var PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.native
  /**
    *  The daily time range during which automated backups are created if automated backups are enabled. Not applicable. The daily time range for creating automated backups is managed by the DB cluster. For more information, see ModifyDBCluster. Constraints:   Must be in the format hh24:mi-hh24:mi   Must be in Universal Time Coordinated (UTC)   Must not conflict with the preferred maintenance window   Must be at least 30 minutes  
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.native
  /**
    * The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage. Changing this parameter doesn't result in an outage, except in the following situation, and the change is asynchronously applied as soon as possible. If there are pending actions that cause a reboot, and the maintenance window is changed to include the current time, then changing this parameter will cause a reboot of the DB instance. If moving this window to the current time, there must be at least 30 minutes between the current time and end of the window to ensure pending changes are applied. Default: Uses existing setting Format: ddd:hh24:mi-ddd:hh24:mi Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun Constraints: Must be at least 30 minutes
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  /**
    * A value that specifies the order in which a Read Replica is promoted to the primary instance after a failure of the existing primary instance. Default: 1 Valid Values: 0 - 15
    */
  var PromotionTier: js.UndefOr[IntegerOptional] = js.native
  /**
    * This flag should no longer be used.
    */
  var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.native
  /**
    * Not supported.
    */
  var StorageType: js.UndefOr[String] = js.native
  /**
    * The ARN from the key store with which to associate the instance for TDE encryption.
    */
  var TdeCredentialArn: js.UndefOr[String] = js.native
  /**
    * The password for the given ARN from the key store in order to access the device.
    */
  var TdeCredentialPassword: js.UndefOr[String] = js.native
  /**
    * A list of EC2 VPC security groups to authorize on this DB instance. This change is asynchronously applied as soon as possible. Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster. For more information, see ModifyDBCluster. Constraints:   If supplied, must match existing VpcSecurityGroupIds.  
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.native
}

object ModifyDBInstanceMessage {
  @scala.inline
  def apply(
    DBInstanceIdentifier: String,
    AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
    AllowMajorVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
    ApplyImmediately: js.UndefOr[Boolean] = js.undefined,
    AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
    BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
    CACertificateIdentifier: String = null,
    CloudwatchLogsExportConfiguration: CloudwatchLogsExportConfiguration = null,
    CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined,
    DBInstanceClass: String = null,
    DBParameterGroupName: String = null,
    DBPortNumber: js.UndefOr[IntegerOptional] = js.undefined,
    DBSecurityGroups: DBSecurityGroupNameList = null,
    DBSubnetGroupName: String = null,
    DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
    Domain: String = null,
    DomainIAMRoleName: String = null,
    EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
    EnablePerformanceInsights: js.UndefOr[BooleanOptional] = js.undefined,
    EngineVersion: String = null,
    Iops: js.UndefOr[IntegerOptional] = js.undefined,
    LicenseModel: String = null,
    MasterUserPassword: String = null,
    MonitoringInterval: js.UndefOr[IntegerOptional] = js.undefined,
    MonitoringRoleArn: String = null,
    MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
    NewDBInstanceIdentifier: String = null,
    OptionGroupName: String = null,
    PerformanceInsightsKMSKeyId: String = null,
    PreferredBackupWindow: String = null,
    PreferredMaintenanceWindow: String = null,
    PromotionTier: js.UndefOr[IntegerOptional] = js.undefined,
    PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
    StorageType: String = null,
    TdeCredentialArn: String = null,
    TdeCredentialPassword: String = null,
    VpcSecurityGroupIds: VpcSecurityGroupIdList = null
  ): ModifyDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any])
    if (!js.isUndefined(AllocatedStorage)) __obj.updateDynamic("AllocatedStorage")(AllocatedStorage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(AllowMajorVersionUpgrade)) __obj.updateDynamic("AllowMajorVersionUpgrade")(AllowMajorVersionUpgrade.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ApplyImmediately)) __obj.updateDynamic("ApplyImmediately")(ApplyImmediately.get.asInstanceOf[js.Any])
    if (!js.isUndefined(AutoMinorVersionUpgrade)) __obj.updateDynamic("AutoMinorVersionUpgrade")(AutoMinorVersionUpgrade.get.asInstanceOf[js.Any])
    if (!js.isUndefined(BackupRetentionPeriod)) __obj.updateDynamic("BackupRetentionPeriod")(BackupRetentionPeriod.get.asInstanceOf[js.Any])
    if (CACertificateIdentifier != null) __obj.updateDynamic("CACertificateIdentifier")(CACertificateIdentifier.asInstanceOf[js.Any])
    if (CloudwatchLogsExportConfiguration != null) __obj.updateDynamic("CloudwatchLogsExportConfiguration")(CloudwatchLogsExportConfiguration.asInstanceOf[js.Any])
    if (!js.isUndefined(CopyTagsToSnapshot)) __obj.updateDynamic("CopyTagsToSnapshot")(CopyTagsToSnapshot.get.asInstanceOf[js.Any])
    if (DBInstanceClass != null) __obj.updateDynamic("DBInstanceClass")(DBInstanceClass.asInstanceOf[js.Any])
    if (DBParameterGroupName != null) __obj.updateDynamic("DBParameterGroupName")(DBParameterGroupName.asInstanceOf[js.Any])
    if (!js.isUndefined(DBPortNumber)) __obj.updateDynamic("DBPortNumber")(DBPortNumber.get.asInstanceOf[js.Any])
    if (DBSecurityGroups != null) __obj.updateDynamic("DBSecurityGroups")(DBSecurityGroups.asInstanceOf[js.Any])
    if (DBSubnetGroupName != null) __obj.updateDynamic("DBSubnetGroupName")(DBSubnetGroupName.asInstanceOf[js.Any])
    if (!js.isUndefined(DeletionProtection)) __obj.updateDynamic("DeletionProtection")(DeletionProtection.get.asInstanceOf[js.Any])
    if (Domain != null) __obj.updateDynamic("Domain")(Domain.asInstanceOf[js.Any])
    if (DomainIAMRoleName != null) __obj.updateDynamic("DomainIAMRoleName")(DomainIAMRoleName.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableIAMDatabaseAuthentication)) __obj.updateDynamic("EnableIAMDatabaseAuthentication")(EnableIAMDatabaseAuthentication.get.asInstanceOf[js.Any])
    if (!js.isUndefined(EnablePerformanceInsights)) __obj.updateDynamic("EnablePerformanceInsights")(EnablePerformanceInsights.get.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(Iops)) __obj.updateDynamic("Iops")(Iops.get.asInstanceOf[js.Any])
    if (LicenseModel != null) __obj.updateDynamic("LicenseModel")(LicenseModel.asInstanceOf[js.Any])
    if (MasterUserPassword != null) __obj.updateDynamic("MasterUserPassword")(MasterUserPassword.asInstanceOf[js.Any])
    if (!js.isUndefined(MonitoringInterval)) __obj.updateDynamic("MonitoringInterval")(MonitoringInterval.get.asInstanceOf[js.Any])
    if (MonitoringRoleArn != null) __obj.updateDynamic("MonitoringRoleArn")(MonitoringRoleArn.asInstanceOf[js.Any])
    if (!js.isUndefined(MultiAZ)) __obj.updateDynamic("MultiAZ")(MultiAZ.get.asInstanceOf[js.Any])
    if (NewDBInstanceIdentifier != null) __obj.updateDynamic("NewDBInstanceIdentifier")(NewDBInstanceIdentifier.asInstanceOf[js.Any])
    if (OptionGroupName != null) __obj.updateDynamic("OptionGroupName")(OptionGroupName.asInstanceOf[js.Any])
    if (PerformanceInsightsKMSKeyId != null) __obj.updateDynamic("PerformanceInsightsKMSKeyId")(PerformanceInsightsKMSKeyId.asInstanceOf[js.Any])
    if (PreferredBackupWindow != null) __obj.updateDynamic("PreferredBackupWindow")(PreferredBackupWindow.asInstanceOf[js.Any])
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow.asInstanceOf[js.Any])
    if (!js.isUndefined(PromotionTier)) __obj.updateDynamic("PromotionTier")(PromotionTier.get.asInstanceOf[js.Any])
    if (!js.isUndefined(PubliclyAccessible)) __obj.updateDynamic("PubliclyAccessible")(PubliclyAccessible.get.asInstanceOf[js.Any])
    if (StorageType != null) __obj.updateDynamic("StorageType")(StorageType.asInstanceOf[js.Any])
    if (TdeCredentialArn != null) __obj.updateDynamic("TdeCredentialArn")(TdeCredentialArn.asInstanceOf[js.Any])
    if (TdeCredentialPassword != null) __obj.updateDynamic("TdeCredentialPassword")(TdeCredentialPassword.asInstanceOf[js.Any])
    if (VpcSecurityGroupIds != null) __obj.updateDynamic("VpcSecurityGroupIds")(VpcSecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBInstanceMessage]
  }
}

