package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDBClusterMessage extends js.Object {
  /**
    * A value that indicates whether major version upgrades are allowed. Constraints: You must allow major version upgrades when specifying a value for the EngineVersion parameter that is a different major version than the DB cluster's current version.
    */
  var AllowMajorVersionUpgrade: js.UndefOr[Boolean] = js.native
  /**
    * A value that indicates whether the modifications in this request and any pending modifications are asynchronously applied as soon as possible, regardless of the PreferredMaintenanceWindow setting for the DB cluster. If this parameter is disabled, changes to the DB cluster are applied during the next maintenance window. The ApplyImmediately parameter only affects the EnableIAMDatabaseAuthentication, MasterUserPassword, and NewDBClusterIdentifier values. If the ApplyImmediately parameter is disabled, then changes to the EnableIAMDatabaseAuthentication, MasterUserPassword, and NewDBClusterIdentifier values are applied during the next maintenance window. All other changes are applied immediately, regardless of the value of the ApplyImmediately parameter. By default, this parameter is disabled.
    */
  var ApplyImmediately: js.UndefOr[Boolean] = js.native
  /**
    * The target backtrack window, in seconds. To disable backtracking, set this value to 0. Default: 0 Constraints:   If specified, this value must be set to a number from 0 to 259,200 (72 hours).  
    */
  var BacktrackWindow: js.UndefOr[LongOptional] = js.native
  /**
    * The number of days for which automated backups are retained. You must specify a minimum value of 1. Default: 1 Constraints:   Must be a value from 1 to 35  
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  /**
    * The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB cluster.
    */
  var CloudwatchLogsExportConfiguration: js.UndefOr[typings.awsSdk.rdsMod.CloudwatchLogsExportConfiguration] = js.native
  /**
    * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The default is not to copy them.
    */
  var CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.native
  /**
    * The DB cluster identifier for the cluster being modified. This parameter isn't case-sensitive. Constraints: This identifier must match the identifier of an existing DB cluster.
    */
  var DBClusterIdentifier: String = js.native
  /**
    * The name of the DB cluster parameter group to use for the DB cluster.
    */
  var DBClusterParameterGroupName: js.UndefOr[String] = js.native
  /**
    * The name of the DB parameter group to apply to all instances of the DB cluster.   When you apply a parameter group using the DBInstanceParameterGroupName parameter, the DB cluster isn't rebooted automatically. Also, parameter changes aren't applied during the next maintenance window but instead are applied immediately.  Default: The existing name setting Constraints:   The DB parameter group must be in the same DB parameter group family as this DB cluster.   The DBInstanceParameterGroupName parameter is only valid in combination with the AllowMajorVersionUpgrade parameter.  
    */
  var DBInstanceParameterGroupName: js.UndefOr[String] = js.native
  /**
    * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled. 
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.native
  /**
    * The Active Directory directory ID to move the DB cluster to. Specify none to remove the cluster from its current domain. The domain must be created prior to this operation. 
    */
  var Domain: js.UndefOr[String] = js.native
  /**
    * Specify the name of the IAM role to be used when making API calls to the Directory Service.
    */
  var DomainIAMRoleName: js.UndefOr[String] = js.native
  /**
    * A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By default, the HTTP endpoint is disabled. When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the Aurora Serverless DB cluster. You can also query your database from inside the RDS console with the query editor. For more information, see Using the Data API for Aurora Serverless in the Amazon Aurora User Guide.
    */
  var EnableHttpEndpoint: js.UndefOr[BooleanOptional] = js.native
  /**
    * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts. By default, mapping is disabled. For more information, see  IAM Database Authentication in the Amazon Aurora User Guide. 
    */
  var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.native
  /**
    * The version number of the database engine to which you want to upgrade. Changing this parameter results in an outage. The change is applied during the next maintenance window unless ApplyImmediately is enabled. To list all of the available engine versions for aurora (for MySQL 5.6-compatible Aurora), use the following command:  aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"  To list all of the available engine versions for aurora-mysql (for MySQL 5.7-compatible Aurora), use the following command:  aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"  To list all of the available engine versions for aurora-postgresql, use the following command:  aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion" 
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * The new password for the master database user. This password can contain any printable ASCII character except "/", """, or "@". Constraints: Must contain from 8 to 41 characters.
    */
  var MasterUserPassword: js.UndefOr[String] = js.native
  /**
    * The new DB cluster identifier for the DB cluster when renaming a DB cluster. This value is stored as a lowercase string. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens   The first character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: my-cluster2 
    */
  var NewDBClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * A value that indicates that the DB cluster should be associated with the specified option group. Changing this parameter doesn't result in an outage except in the following case, and the change is applied during the next maintenance window unless the ApplyImmediately is enabled for this request. If the parameter change results in an option group that enables OEM, this change can cause a brief (sub-second) period during which new connections are rejected but existing connections are not interrupted.  Permanent options can't be removed from an option group. The option group can't be removed from a DB cluster once it is associated with a DB cluster.
    */
  var OptionGroupName: js.UndefOr[String] = js.native
  /**
    * The port number on which the DB cluster accepts connections. Constraints: Value must be 1150-65535  Default: The same port as the original DB cluster.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  /**
    * The daily time range during which automated backups are created if automated backups are enabled, using the BackupRetentionPeriod parameter.  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To see the time blocks available, see  Adjusting the Preferred DB Cluster Maintenance Window in the Amazon Aurora User Guide.  Constraints:   Must be in the format hh24:mi-hh24:mi.   Must be in Universal Coordinated Time (UTC).   Must not conflict with the preferred maintenance window.   Must be at least 30 minutes.  
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.native
  /**
    * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC). Format: ddd:hh24:mi-ddd:hh24:mi  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring on a random day of the week. To see the time blocks available, see  Adjusting the Preferred DB Cluster Maintenance Window in the Amazon Aurora User Guide.  Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun. Constraints: Minimum 30-minute window.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  /**
    * The scaling properties of the DB cluster. You can only modify scaling properties for DB clusters in serverless DB engine mode.
    */
  var ScalingConfiguration: js.UndefOr[typings.awsSdk.rdsMod.ScalingConfiguration] = js.native
  /**
    * A list of VPC security groups that the DB cluster will belong to.
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.native
}

object ModifyDBClusterMessage {
  @scala.inline
  def apply(
    DBClusterIdentifier: String,
    AllowMajorVersionUpgrade: js.UndefOr[scala.Boolean] = js.undefined,
    ApplyImmediately: js.UndefOr[scala.Boolean] = js.undefined,
    BacktrackWindow: Int | scala.Double = null,
    BackupRetentionPeriod: Int | scala.Double = null,
    CloudwatchLogsExportConfiguration: CloudwatchLogsExportConfiguration = null,
    CopyTagsToSnapshot: js.UndefOr[scala.Boolean] = js.undefined,
    DBClusterParameterGroupName: String = null,
    DBInstanceParameterGroupName: String = null,
    DeletionProtection: js.UndefOr[scala.Boolean] = js.undefined,
    Domain: String = null,
    DomainIAMRoleName: String = null,
    EnableHttpEndpoint: js.UndefOr[scala.Boolean] = js.undefined,
    EnableIAMDatabaseAuthentication: js.UndefOr[scala.Boolean] = js.undefined,
    EngineVersion: String = null,
    MasterUserPassword: String = null,
    NewDBClusterIdentifier: String = null,
    OptionGroupName: String = null,
    Port: Int | scala.Double = null,
    PreferredBackupWindow: String = null,
    PreferredMaintenanceWindow: String = null,
    ScalingConfiguration: ScalingConfiguration = null,
    VpcSecurityGroupIds: VpcSecurityGroupIdList = null
  ): ModifyDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any])
    if (!js.isUndefined(AllowMajorVersionUpgrade)) __obj.updateDynamic("AllowMajorVersionUpgrade")(AllowMajorVersionUpgrade.asInstanceOf[js.Any])
    if (!js.isUndefined(ApplyImmediately)) __obj.updateDynamic("ApplyImmediately")(ApplyImmediately.asInstanceOf[js.Any])
    if (BacktrackWindow != null) __obj.updateDynamic("BacktrackWindow")(BacktrackWindow.asInstanceOf[js.Any])
    if (BackupRetentionPeriod != null) __obj.updateDynamic("BackupRetentionPeriod")(BackupRetentionPeriod.asInstanceOf[js.Any])
    if (CloudwatchLogsExportConfiguration != null) __obj.updateDynamic("CloudwatchLogsExportConfiguration")(CloudwatchLogsExportConfiguration.asInstanceOf[js.Any])
    if (!js.isUndefined(CopyTagsToSnapshot)) __obj.updateDynamic("CopyTagsToSnapshot")(CopyTagsToSnapshot.asInstanceOf[js.Any])
    if (DBClusterParameterGroupName != null) __obj.updateDynamic("DBClusterParameterGroupName")(DBClusterParameterGroupName.asInstanceOf[js.Any])
    if (DBInstanceParameterGroupName != null) __obj.updateDynamic("DBInstanceParameterGroupName")(DBInstanceParameterGroupName.asInstanceOf[js.Any])
    if (!js.isUndefined(DeletionProtection)) __obj.updateDynamic("DeletionProtection")(DeletionProtection.asInstanceOf[js.Any])
    if (Domain != null) __obj.updateDynamic("Domain")(Domain.asInstanceOf[js.Any])
    if (DomainIAMRoleName != null) __obj.updateDynamic("DomainIAMRoleName")(DomainIAMRoleName.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableHttpEndpoint)) __obj.updateDynamic("EnableHttpEndpoint")(EnableHttpEndpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableIAMDatabaseAuthentication)) __obj.updateDynamic("EnableIAMDatabaseAuthentication")(EnableIAMDatabaseAuthentication.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (MasterUserPassword != null) __obj.updateDynamic("MasterUserPassword")(MasterUserPassword.asInstanceOf[js.Any])
    if (NewDBClusterIdentifier != null) __obj.updateDynamic("NewDBClusterIdentifier")(NewDBClusterIdentifier.asInstanceOf[js.Any])
    if (OptionGroupName != null) __obj.updateDynamic("OptionGroupName")(OptionGroupName.asInstanceOf[js.Any])
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (PreferredBackupWindow != null) __obj.updateDynamic("PreferredBackupWindow")(PreferredBackupWindow.asInstanceOf[js.Any])
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow.asInstanceOf[js.Any])
    if (ScalingConfiguration != null) __obj.updateDynamic("ScalingConfiguration")(ScalingConfiguration.asInstanceOf[js.Any])
    if (VpcSecurityGroupIds != null) __obj.updateDynamic("VpcSecurityGroupIds")(VpcSecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBClusterMessage]
  }
}

