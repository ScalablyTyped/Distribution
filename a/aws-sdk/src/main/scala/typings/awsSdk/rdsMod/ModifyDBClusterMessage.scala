package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDBClusterMessage extends StObject {
  
  /**
    * A value that indicates whether major version upgrades are allowed. Constraints: You must allow major version upgrades when specifying a value for the EngineVersion parameter that is a different major version than the DB cluster's current version.
    */
  var AllowMajorVersionUpgrade: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value that indicates whether the modifications in this request and any pending modifications are asynchronously applied as soon as possible, regardless of the PreferredMaintenanceWindow setting for the DB cluster. If this parameter is disabled, changes to the DB cluster are applied during the next maintenance window. The ApplyImmediately parameter only affects the EnableIAMDatabaseAuthentication, MasterUserPassword, and NewDBClusterIdentifier values. If the ApplyImmediately parameter is disabled, then changes to the EnableIAMDatabaseAuthentication, MasterUserPassword, and NewDBClusterIdentifier values are applied during the next maintenance window. All other changes are applied immediately, regardless of the value of the ApplyImmediately parameter. By default, this parameter is disabled.
    */
  var ApplyImmediately: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The target backtrack window, in seconds. To disable backtracking, set this value to 0.  Currently, Backtrack is only supported for Aurora MySQL DB clusters.  Default: 0 Constraints:   If specified, this value must be set to a number from 0 to 259,200 (72 hours).  
    */
  var BacktrackWindow: js.UndefOr[LongOptional] = js.undefined
  
  /**
    * The number of days for which automated backups are retained. You must specify a minimum value of 1. Default: 1 Constraints:   Must be a value from 1 to 35  
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB cluster.
    */
  var CloudwatchLogsExportConfiguration: js.UndefOr[typings.awsSdk.rdsMod.CloudwatchLogsExportConfiguration] = js.undefined
  
  /**
    * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The default is not to copy them.
    */
  var CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The DB cluster identifier for the cluster being modified. This parameter isn't case-sensitive. Constraints: This identifier must match the identifier of an existing DB cluster.
    */
  var DBClusterIdentifier: String
  
  /**
    * The name of the DB cluster parameter group to use for the DB cluster.
    */
  var DBClusterParameterGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the DB parameter group to apply to all instances of the DB cluster.   When you apply a parameter group using the DBInstanceParameterGroupName parameter, the DB cluster isn't rebooted automatically. Also, parameter changes aren't applied during the next maintenance window but instead are applied immediately.  Default: The existing name setting Constraints:   The DB parameter group must be in the same DB parameter group family as this DB cluster.   The DBInstanceParameterGroupName parameter is only valid in combination with the AllowMajorVersionUpgrade parameter.  
    */
  var DBInstanceParameterGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled. 
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The Active Directory directory ID to move the DB cluster to. Specify none to remove the cluster from its current domain. The domain must be created prior to this operation.  For more information, see Kerberos Authentication in the Amazon Aurora User Guide. 
    */
  var Domain: js.UndefOr[String] = js.undefined
  
  /**
    * Specify the name of the IAM role to be used when making API calls to the Directory Service.
    */
  var DomainIAMRoleName: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates whether to enable write operations to be forwarded from this cluster to the primary cluster in an Aurora global database. The resulting changes are replicated back to this cluster. This parameter only applies to DB clusters that are secondary clusters in an Aurora global database. By default, Aurora disallows write operations for secondary clusters.
    */
  var EnableGlobalWriteForwarding: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By default, the HTTP endpoint is disabled. When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the Aurora Serverless DB cluster. You can also query your database from inside the RDS console with the query editor. For more information, see Using the Data API for Aurora Serverless in the Amazon Aurora User Guide.
    */
  var EnableHttpEndpoint: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts. By default, mapping is disabled. For more information, see  IAM Database Authentication in the Amazon Aurora User Guide. 
    */
  var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The version number of the database engine to which you want to upgrade. Changing this parameter results in an outage. The change is applied during the next maintenance window unless ApplyImmediately is enabled. To list all of the available engine versions for aurora (for MySQL 5.6-compatible Aurora), use the following command:  aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"  To list all of the available engine versions for aurora-mysql (for MySQL 5.7-compatible Aurora), use the following command:  aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"  To list all of the available engine versions for aurora-postgresql, use the following command:  aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion" 
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The new password for the master database user. This password can contain any printable ASCII character except "/", """, or "@". Constraints: Must contain from 8 to 41 characters.
    */
  var MasterUserPassword: js.UndefOr[String] = js.undefined
  
  /**
    * The new DB cluster identifier for the DB cluster when renaming a DB cluster. This value is stored as a lowercase string. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens   The first character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: my-cluster2 
    */
  var NewDBClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates that the DB cluster should be associated with the specified option group. Changing this parameter doesn't result in an outage except in the following case, and the change is applied during the next maintenance window unless the ApplyImmediately is enabled for this request. If the parameter change results in an option group that enables OEM, this change can cause a brief (sub-second) period during which new connections are rejected but existing connections are not interrupted.  Permanent options can't be removed from an option group. The option group can't be removed from a DB cluster once it is associated with a DB cluster.
    */
  var OptionGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The port number on which the DB cluster accepts connections. Constraints: Value must be 1150-65535  Default: The same port as the original DB cluster.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The daily time range during which automated backups are created if automated backups are enabled, using the BackupRetentionPeriod parameter.  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To see the time blocks available, see  Adjusting the Preferred DB Cluster Maintenance Window in the Amazon Aurora User Guide.  Constraints:   Must be in the format hh24:mi-hh24:mi.   Must be in Universal Coordinated Time (UTC).   Must not conflict with the preferred maintenance window.   Must be at least 30 minutes.  
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.undefined
  
  /**
    * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC). Format: ddd:hh24:mi-ddd:hh24:mi  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring on a random day of the week. To see the time blocks available, see  Adjusting the Preferred DB Cluster Maintenance Window in the Amazon Aurora User Guide.  Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun. Constraints: Minimum 30-minute window.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  
  /**
    * The scaling properties of the DB cluster. You can only modify scaling properties for DB clusters in serverless DB engine mode.
    */
  var ScalingConfiguration: js.UndefOr[typings.awsSdk.rdsMod.ScalingConfiguration] = js.undefined
  
  /**
    * A list of VPC security groups that the DB cluster will belong to.
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
}
object ModifyDBClusterMessage {
  
  @scala.inline
  def apply(DBClusterIdentifier: String): ModifyDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBClusterMessage]
  }
  
  @scala.inline
  implicit class ModifyDBClusterMessageMutableBuilder[Self <: ModifyDBClusterMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowMajorVersionUpgrade(value: Boolean): Self = StObject.set(x, "AllowMajorVersionUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowMajorVersionUpgradeUndefined: Self = StObject.set(x, "AllowMajorVersionUpgrade", js.undefined)
    
    @scala.inline
    def setApplyImmediately(value: Boolean): Self = StObject.set(x, "ApplyImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyImmediatelyUndefined: Self = StObject.set(x, "ApplyImmediately", js.undefined)
    
    @scala.inline
    def setBacktrackWindow(value: LongOptional): Self = StObject.set(x, "BacktrackWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBacktrackWindowUndefined: Self = StObject.set(x, "BacktrackWindow", js.undefined)
    
    @scala.inline
    def setBackupRetentionPeriod(value: IntegerOptional): Self = StObject.set(x, "BackupRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupRetentionPeriodUndefined: Self = StObject.set(x, "BackupRetentionPeriod", js.undefined)
    
    @scala.inline
    def setCloudwatchLogsExportConfiguration(value: CloudwatchLogsExportConfiguration): Self = StObject.set(x, "CloudwatchLogsExportConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudwatchLogsExportConfigurationUndefined: Self = StObject.set(x, "CloudwatchLogsExportConfiguration", js.undefined)
    
    @scala.inline
    def setCopyTagsToSnapshot(value: BooleanOptional): Self = StObject.set(x, "CopyTagsToSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyTagsToSnapshotUndefined: Self = StObject.set(x, "CopyTagsToSnapshot", js.undefined)
    
    @scala.inline
    def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterParameterGroupName(value: String): Self = StObject.set(x, "DBClusterParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterParameterGroupNameUndefined: Self = StObject.set(x, "DBClusterParameterGroupName", js.undefined)
    
    @scala.inline
    def setDBInstanceParameterGroupName(value: String): Self = StObject.set(x, "DBInstanceParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBInstanceParameterGroupNameUndefined: Self = StObject.set(x, "DBInstanceParameterGroupName", js.undefined)
    
    @scala.inline
    def setDeletionProtection(value: BooleanOptional): Self = StObject.set(x, "DeletionProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionProtectionUndefined: Self = StObject.set(x, "DeletionProtection", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainIAMRoleName(value: String): Self = StObject.set(x, "DomainIAMRoleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainIAMRoleNameUndefined: Self = StObject.set(x, "DomainIAMRoleName", js.undefined)
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    @scala.inline
    def setEnableGlobalWriteForwarding(value: BooleanOptional): Self = StObject.set(x, "EnableGlobalWriteForwarding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableGlobalWriteForwardingUndefined: Self = StObject.set(x, "EnableGlobalWriteForwarding", js.undefined)
    
    @scala.inline
    def setEnableHttpEndpoint(value: BooleanOptional): Self = StObject.set(x, "EnableHttpEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableHttpEndpointUndefined: Self = StObject.set(x, "EnableHttpEndpoint", js.undefined)
    
    @scala.inline
    def setEnableIAMDatabaseAuthentication(value: BooleanOptional): Self = StObject.set(x, "EnableIAMDatabaseAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableIAMDatabaseAuthenticationUndefined: Self = StObject.set(x, "EnableIAMDatabaseAuthentication", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setMasterUserPassword(value: String): Self = StObject.set(x, "MasterUserPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterUserPasswordUndefined: Self = StObject.set(x, "MasterUserPassword", js.undefined)
    
    @scala.inline
    def setNewDBClusterIdentifier(value: String): Self = StObject.set(x, "NewDBClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewDBClusterIdentifierUndefined: Self = StObject.set(x, "NewDBClusterIdentifier", js.undefined)
    
    @scala.inline
    def setOptionGroupName(value: String): Self = StObject.set(x, "OptionGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionGroupNameUndefined: Self = StObject.set(x, "OptionGroupName", js.undefined)
    
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
    def setScalingConfiguration(value: ScalingConfiguration): Self = StObject.set(x, "ScalingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingConfigurationUndefined: Self = StObject.set(x, "ScalingConfiguration", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupIds(value: VpcSecurityGroupIdList): Self = StObject.set(x, "VpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "VpcSecurityGroupIds", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "VpcSecurityGroupIds", js.Array(value :_*))
  }
}
