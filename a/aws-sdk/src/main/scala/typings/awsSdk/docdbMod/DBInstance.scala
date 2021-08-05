package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBInstance extends StObject {
  
  /**
    * Indicates that minor version patches are applied automatically.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the name of the Availability Zone that the instance is located in.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the number of days for which automatic snapshots are retained.
    */
  var BackupRetentionPeriod: js.UndefOr[Integer] = js.undefined
  
  /**
    * The identifier of the CA certificate for this DB instance.
    */
  var CACertificateIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * Contains the name of the cluster that the instance is a member of if the instance is a member of a cluster.
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the instance.
    */
  var DBInstanceArn: js.UndefOr[String] = js.undefined
  
  /**
    * Contains the name of the compute and memory capacity class of the instance.
    */
  var DBInstanceClass: js.UndefOr[String] = js.undefined
  
  /**
    * Contains a user-provided database identifier. This identifier is the unique key that identifies an instance.
    */
  var DBInstanceIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the current state of this database.
    */
  var DBInstanceStatus: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies information on the subnet group that is associated with the instance, including the name, description, and subnets in the subnet group.
    */
  var DBSubnetGroup: js.UndefOr[typings.awsSdk.docdbMod.DBSubnetGroup] = js.undefined
  
  /**
    * The AWS Region-unique, immutable identifier for the instance. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the instance is accessed.
    */
  var DbiResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * A list of log types that this instance is configured to export to Amazon CloudWatch Logs.
    */
  var EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
  
  /**
    * Specifies the connection endpoint.
    */
  var Endpoint: js.UndefOr[typings.awsSdk.docdbMod.Endpoint] = js.undefined
  
  /**
    * Provides the name of the database engine to be used for this instance.
    */
  var Engine: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the database engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Provides the date and time that the instance was created.
    */
  var InstanceCreateTime: js.UndefOr[TStamp] = js.undefined
  
  /**
    *  If StorageEncrypted is true, the AWS KMS key identifier for the encrypted instance. 
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the latest time to which a database can be restored with point-in-time restore.
    */
  var LatestRestorableTime: js.UndefOr[TStamp] = js.undefined
  
  /**
    * Specifies that changes to the instance are pending. This element is included only when changes are pending. Specific changes are identified by subelements.
    */
  var PendingModifiedValues: js.UndefOr[typings.awsSdk.docdbMod.PendingModifiedValues] = js.undefined
  
  /**
    *  Specifies the daily time range during which automated backups are created if automated backups are enabled, as determined by the BackupRetentionPeriod. 
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  
  /**
    * A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance after a failure of the existing primary instance.
    */
  var PromotionTier: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Not supported. Amazon DocumentDB does not currently support public endpoints. The value of PubliclyAccessible is always false.
    */
  var PubliclyAccessible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The status of a read replica. If the instance is not a read replica, this is blank.
    */
  var StatusInfos: js.UndefOr[DBInstanceStatusInfoList] = js.undefined
  
  /**
    * Specifies whether or not the instance is encrypted.
    */
  var StorageEncrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Provides a list of VPC security group elements that the instance belongs to.
    */
  var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined
}
object DBInstance {
  
  inline def apply(): DBInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBInstance]
  }
  
  extension [Self <: DBInstance](x: Self) {
    
    inline def setAutoMinorVersionUpgrade(value: Boolean): Self = StObject.set(x, "AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    inline def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "AutoMinorVersionUpgrade", js.undefined)
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setBackupRetentionPeriod(value: Integer): Self = StObject.set(x, "BackupRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setBackupRetentionPeriodUndefined: Self = StObject.set(x, "BackupRetentionPeriod", js.undefined)
    
    inline def setCACertificateIdentifier(value: String): Self = StObject.set(x, "CACertificateIdentifier", value.asInstanceOf[js.Any])
    
    inline def setCACertificateIdentifierUndefined: Self = StObject.set(x, "CACertificateIdentifier", js.undefined)
    
    inline def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBClusterIdentifierUndefined: Self = StObject.set(x, "DBClusterIdentifier", js.undefined)
    
    inline def setDBInstanceArn(value: String): Self = StObject.set(x, "DBInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceArnUndefined: Self = StObject.set(x, "DBInstanceArn", js.undefined)
    
    inline def setDBInstanceClass(value: String): Self = StObject.set(x, "DBInstanceClass", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceClassUndefined: Self = StObject.set(x, "DBInstanceClass", js.undefined)
    
    inline def setDBInstanceIdentifier(value: String): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceIdentifierUndefined: Self = StObject.set(x, "DBInstanceIdentifier", js.undefined)
    
    inline def setDBInstanceStatus(value: String): Self = StObject.set(x, "DBInstanceStatus", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceStatusUndefined: Self = StObject.set(x, "DBInstanceStatus", js.undefined)
    
    inline def setDBSubnetGroup(value: DBSubnetGroup): Self = StObject.set(x, "DBSubnetGroup", value.asInstanceOf[js.Any])
    
    inline def setDBSubnetGroupUndefined: Self = StObject.set(x, "DBSubnetGroup", js.undefined)
    
    inline def setDbiResourceId(value: String): Self = StObject.set(x, "DbiResourceId", value.asInstanceOf[js.Any])
    
    inline def setDbiResourceIdUndefined: Self = StObject.set(x, "DbiResourceId", js.undefined)
    
    inline def setEnabledCloudwatchLogsExports(value: LogTypeList): Self = StObject.set(x, "EnabledCloudwatchLogsExports", value.asInstanceOf[js.Any])
    
    inline def setEnabledCloudwatchLogsExportsUndefined: Self = StObject.set(x, "EnabledCloudwatchLogsExports", js.undefined)
    
    inline def setEnabledCloudwatchLogsExportsVarargs(value: String*): Self = StObject.set(x, "EnabledCloudwatchLogsExports", js.Array(value :_*))
    
    inline def setEndpoint(value: Endpoint): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setInstanceCreateTime(value: TStamp): Self = StObject.set(x, "InstanceCreateTime", value.asInstanceOf[js.Any])
    
    inline def setInstanceCreateTimeUndefined: Self = StObject.set(x, "InstanceCreateTime", js.undefined)
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setLatestRestorableTime(value: TStamp): Self = StObject.set(x, "LatestRestorableTime", value.asInstanceOf[js.Any])
    
    inline def setLatestRestorableTimeUndefined: Self = StObject.set(x, "LatestRestorableTime", js.undefined)
    
    inline def setPendingModifiedValues(value: PendingModifiedValues): Self = StObject.set(x, "PendingModifiedValues", value.asInstanceOf[js.Any])
    
    inline def setPendingModifiedValuesUndefined: Self = StObject.set(x, "PendingModifiedValues", js.undefined)
    
    inline def setPreferredBackupWindow(value: String): Self = StObject.set(x, "PreferredBackupWindow", value.asInstanceOf[js.Any])
    
    inline def setPreferredBackupWindowUndefined: Self = StObject.set(x, "PreferredBackupWindow", js.undefined)
    
    inline def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "PreferredMaintenanceWindow", js.undefined)
    
    inline def setPromotionTier(value: IntegerOptional): Self = StObject.set(x, "PromotionTier", value.asInstanceOf[js.Any])
    
    inline def setPromotionTierUndefined: Self = StObject.set(x, "PromotionTier", js.undefined)
    
    inline def setPubliclyAccessible(value: Boolean): Self = StObject.set(x, "PubliclyAccessible", value.asInstanceOf[js.Any])
    
    inline def setPubliclyAccessibleUndefined: Self = StObject.set(x, "PubliclyAccessible", js.undefined)
    
    inline def setStatusInfos(value: DBInstanceStatusInfoList): Self = StObject.set(x, "StatusInfos", value.asInstanceOf[js.Any])
    
    inline def setStatusInfosUndefined: Self = StObject.set(x, "StatusInfos", js.undefined)
    
    inline def setStatusInfosVarargs(value: DBInstanceStatusInfo*): Self = StObject.set(x, "StatusInfos", js.Array(value :_*))
    
    inline def setStorageEncrypted(value: Boolean): Self = StObject.set(x, "StorageEncrypted", value.asInstanceOf[js.Any])
    
    inline def setStorageEncryptedUndefined: Self = StObject.set(x, "StorageEncrypted", js.undefined)
    
    inline def setVpcSecurityGroups(value: VpcSecurityGroupMembershipList): Self = StObject.set(x, "VpcSecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupsUndefined: Self = StObject.set(x, "VpcSecurityGroups", js.undefined)
    
    inline def setVpcSecurityGroupsVarargs(value: VpcSecurityGroupMembership*): Self = StObject.set(x, "VpcSecurityGroups", js.Array(value :_*))
  }
}
