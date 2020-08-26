package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBInstance extends js.Object {
  /**
    * Indicates that minor version patches are applied automatically.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the name of the Availability Zone that the instance is located in.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * Specifies the number of days for which automatic snapshots are retained.
    */
  var BackupRetentionPeriod: js.UndefOr[Integer] = js.native
  /**
    * The identifier of the CA certificate for this DB instance.
    */
  var CACertificateIdentifier: js.UndefOr[String] = js.native
  /**
    * Contains the name of the cluster that the instance is a member of if the instance is a member of a cluster.
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the instance.
    */
  var DBInstanceArn: js.UndefOr[String] = js.native
  /**
    * Contains the name of the compute and memory capacity class of the instance.
    */
  var DBInstanceClass: js.UndefOr[String] = js.native
  /**
    * Contains a user-provided database identifier. This identifier is the unique key that identifies an instance.
    */
  var DBInstanceIdentifier: js.UndefOr[String] = js.native
  /**
    * Specifies the current state of this database.
    */
  var DBInstanceStatus: js.UndefOr[String] = js.native
  /**
    * Specifies information on the subnet group that is associated with the instance, including the name, description, and subnets in the subnet group.
    */
  var DBSubnetGroup: js.UndefOr[typings.awsSdk.docdbMod.DBSubnetGroup] = js.native
  /**
    * The AWS Region-unique, immutable identifier for the instance. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the instance is accessed.
    */
  var DbiResourceId: js.UndefOr[String] = js.native
  /**
    * A list of log types that this instance is configured to export to Amazon CloudWatch Logs.
    */
  var EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.native
  /**
    * Specifies the connection endpoint.
    */
  var Endpoint: js.UndefOr[typings.awsSdk.docdbMod.Endpoint] = js.native
  /**
    * Provides the name of the database engine to be used for this instance.
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * Indicates the database engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * Provides the date and time that the instance was created.
    */
  var InstanceCreateTime: js.UndefOr[TStamp] = js.native
  /**
    *  If StorageEncrypted is true, the AWS KMS key identifier for the encrypted instance. 
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * Specifies the latest time to which a database can be restored with point-in-time restore.
    */
  var LatestRestorableTime: js.UndefOr[TStamp] = js.native
  /**
    * Specifies that changes to the instance are pending. This element is included only when changes are pending. Specific changes are identified by subelements.
    */
  var PendingModifiedValues: js.UndefOr[typings.awsSdk.docdbMod.PendingModifiedValues] = js.native
  /**
    *  Specifies the daily time range during which automated backups are created if automated backups are enabled, as determined by the BackupRetentionPeriod. 
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.native
  /**
    * Specifies the weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  /**
    * A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance after a failure of the existing primary instance.
    */
  var PromotionTier: js.UndefOr[IntegerOptional] = js.native
  /**
    * Not supported. Amazon DocumentDB does not currently support public endpoints. The value of PubliclyAccessible is always false.
    */
  var PubliclyAccessible: js.UndefOr[Boolean] = js.native
  /**
    * The status of a read replica. If the instance is not a read replica, this is blank.
    */
  var StatusInfos: js.UndefOr[DBInstanceStatusInfoList] = js.native
  /**
    * Specifies whether or not the instance is encrypted.
    */
  var StorageEncrypted: js.UndefOr[Boolean] = js.native
  /**
    * Provides a list of VPC security group elements that the instance belongs to.
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
    def setDBSubnetGroup(value: DBSubnetGroup): Self = this.set("DBSubnetGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBSubnetGroup: Self = this.set("DBSubnetGroup", js.undefined)
    @scala.inline
    def setDbiResourceId(value: String): Self = this.set("DbiResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDbiResourceId: Self = this.set("DbiResourceId", js.undefined)
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
    def setInstanceCreateTime(value: TStamp): Self = this.set("InstanceCreateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceCreateTime: Self = this.set("InstanceCreateTime", js.undefined)
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    @scala.inline
    def setLatestRestorableTime(value: TStamp): Self = this.set("LatestRestorableTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatestRestorableTime: Self = this.set("LatestRestorableTime", js.undefined)
    @scala.inline
    def setPendingModifiedValues(value: PendingModifiedValues): Self = this.set("PendingModifiedValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePendingModifiedValues: Self = this.set("PendingModifiedValues", js.undefined)
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
    def setVpcSecurityGroupsVarargs(value: VpcSecurityGroupMembership*): Self = this.set("VpcSecurityGroups", js.Array(value :_*))
    @scala.inline
    def setVpcSecurityGroups(value: VpcSecurityGroupMembershipList): Self = this.set("VpcSecurityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcSecurityGroups: Self = this.set("VpcSecurityGroups", js.undefined)
  }
  
}

