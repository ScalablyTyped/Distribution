package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDBClusterMessage extends js.Object {
  /**
    * A list of Amazon EC2 Availability Zones that instances in the cluster can be created in.
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.docdbMod.AvailabilityZones] = js.native
  /**
    * The number of days for which automated backups are retained. You must specify a minimum value of 1. Default: 1 Constraints:   Must be a value from 1 to 35.  
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  /**
    * The cluster identifier. This parameter is stored as a lowercase string. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   The first character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: my-cluster 
    */
  var DBClusterIdentifier: String = js.native
  /**
    *  The name of the cluster parameter group to associate with this cluster.
    */
  var DBClusterParameterGroupName: js.UndefOr[String] = js.native
  /**
    * A subnet group to associate with this cluster. Constraints: Must match the name of an existing DBSubnetGroup. Must not be default. Example: mySubnetgroup 
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.native
  /**
    * Specifies whether this cluster can be deleted. If DeletionProtection is enabled, the cluster cannot be deleted unless it is modified and DeletionProtection is disabled. DeletionProtection protects clusters from being accidentally deleted.
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.native
  /**
    * A list of log types that need to be enabled for exporting to Amazon CloudWatch Logs.
    */
  var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.native
  /**
    * The name of the database engine to be used for this cluster. Valid values: docdb 
    */
  var Engine: String = js.native
  /**
    * The version number of the database engine to use.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * The AWS KMS key identifier for an encrypted cluster. The AWS KMS key identifier is the Amazon Resource Name (ARN) for the AWS KMS encryption key. If you are creating a cluster using the same AWS account that owns the AWS KMS encryption key that is used to encrypt the new cluster, you can use the AWS KMS key alias instead of the ARN for the AWS KMS encryption key. If an encryption key is not specified in KmsKeyId:   If ReplicationSourceIdentifier identifies an encrypted source, then Amazon DocumentDB uses the encryption key that is used to encrypt the source. Otherwise, Amazon DocumentDB uses your default encryption key.    If the StorageEncrypted parameter is true and ReplicationSourceIdentifier is not specified, Amazon DocumentDB uses your default encryption key.   AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region. If you create a replica of an encrypted cluster in another AWS Region, you must set KmsKeyId to a KMS key ID that is valid in the destination AWS Region. This key is used to encrypt the replica in that AWS Region.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * The password for the master database user. This password can contain any printable ASCII character except forward slash (/), double quote ("), or the "at" symbol (@). Constraints: Must contain from 8 to 100 characters.
    */
  var MasterUserPassword: String = js.native
  /**
    * The name of the master user for the cluster. Constraints:   Must be from 1 to 63 letters or numbers.   The first character must be a letter.   Cannot be a reserved word for the chosen database engine.  
    */
  var MasterUsername: String = js.native
  /**
    * The port number on which the instances in the cluster accept connections.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  /**
    * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter.  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region.  Constraints:   Must be in the format hh24:mi-hh24:mi.   Must be in Universal Coordinated Time (UTC).   Must not conflict with the preferred maintenance window.   Must be at least 30 minutes.  
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.native
  /**
    * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC). Format: ddd:hh24:mi-ddd:hh24:mi  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring on a random day of the week. Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun Constraints: Minimum 30-minute window.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  /**
    * Specifies whether the cluster is encrypted.
    */
  var StorageEncrypted: js.UndefOr[BooleanOptional] = js.native
  /**
    * The tags to be assigned to the cluster.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * A list of EC2 VPC security groups to associate with this cluster.
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.native
}

object CreateDBClusterMessage {
  @scala.inline
  def apply(DBClusterIdentifier: String, Engine: String, MasterUserPassword: String, MasterUsername: String): CreateDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any], Engine = Engine.asInstanceOf[js.Any], MasterUserPassword = MasterUserPassword.asInstanceOf[js.Any], MasterUsername = MasterUsername.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBClusterMessage]
  }
  @scala.inline
  implicit class CreateDBClusterMessageOps[Self <: CreateDBClusterMessage] (val x: Self) extends AnyVal {
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
    def setDBClusterIdentifier(value: String): Self = this.set("DBClusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setEngine(value: String): Self = this.set("Engine", value.asInstanceOf[js.Any])
    @scala.inline
    def setMasterUserPassword(value: String): Self = this.set("MasterUserPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def setMasterUsername(value: String): Self = this.set("MasterUsername", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailabilityZonesVarargs(value: String*): Self = this.set("AvailabilityZones", js.Array(value :_*))
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZones): Self = this.set("AvailabilityZones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("AvailabilityZones", js.undefined)
    @scala.inline
    def setBackupRetentionPeriod(value: IntegerOptional): Self = this.set("BackupRetentionPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupRetentionPeriod: Self = this.set("BackupRetentionPeriod", js.undefined)
    @scala.inline
    def setDBClusterParameterGroupName(value: String): Self = this.set("DBClusterParameterGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBClusterParameterGroupName: Self = this.set("DBClusterParameterGroupName", js.undefined)
    @scala.inline
    def setDBSubnetGroupName(value: String): Self = this.set("DBSubnetGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBSubnetGroupName: Self = this.set("DBSubnetGroupName", js.undefined)
    @scala.inline
    def setDeletionProtection(value: BooleanOptional): Self = this.set("DeletionProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletionProtection: Self = this.set("DeletionProtection", js.undefined)
    @scala.inline
    def setEnableCloudwatchLogsExportsVarargs(value: String*): Self = this.set("EnableCloudwatchLogsExports", js.Array(value :_*))
    @scala.inline
    def setEnableCloudwatchLogsExports(value: LogTypeList): Self = this.set("EnableCloudwatchLogsExports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableCloudwatchLogsExports: Self = this.set("EnableCloudwatchLogsExports", js.undefined)
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    @scala.inline
    def setPort(value: IntegerOptional): Self = this.set("Port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    @scala.inline
    def setPreferredBackupWindow(value: String): Self = this.set("PreferredBackupWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredBackupWindow: Self = this.set("PreferredBackupWindow", js.undefined)
    @scala.inline
    def setPreferredMaintenanceWindow(value: String): Self = this.set("PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredMaintenanceWindow: Self = this.set("PreferredMaintenanceWindow", js.undefined)
    @scala.inline
    def setStorageEncrypted(value: BooleanOptional): Self = this.set("StorageEncrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageEncrypted: Self = this.set("StorageEncrypted", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setVpcSecurityGroupIdsVarargs(value: String*): Self = this.set("VpcSecurityGroupIds", js.Array(value :_*))
    @scala.inline
    def setVpcSecurityGroupIds(value: VpcSecurityGroupIdList): Self = this.set("VpcSecurityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcSecurityGroupIds: Self = this.set("VpcSecurityGroupIds", js.undefined)
  }
  
}

