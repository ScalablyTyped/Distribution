package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreDBClusterToPointInTimeMessage extends js.Object {
  /**
    * The name of the new cluster to be created. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   The first character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
    */
  var DBClusterIdentifier: String = js.native
  /**
    * The subnet group name to use for the new cluster. Constraints: If provided, must match the name of an existing DBSubnetGroup. Example: mySubnetgroup 
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.native
  /**
    * Specifies whether this cluster can be deleted. If DeletionProtection is enabled, the cluster cannot be deleted unless it is modified and DeletionProtection is disabled. DeletionProtection protects clusters from being accidentally deleted.
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.native
  /**
    * A list of log types that must be enabled for exporting to Amazon CloudWatch Logs.
    */
  var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.native
  /**
    * The AWS KMS key identifier to use when restoring an encrypted cluster from an encrypted cluster. The AWS KMS key identifier is the Amazon Resource Name (ARN) for the AWS KMS encryption key. If you are restoring a cluster with the same AWS account that owns the AWS KMS encryption key used to encrypt the new cluster, then you can use the AWS KMS key alias instead of the ARN for the AWS KMS encryption key. You can restore to a new cluster and encrypt the new cluster with an AWS KMS key that is different from the AWS KMS key used to encrypt the source cluster. The new DB cluster is encrypted with the AWS KMS key identified by the KmsKeyId parameter. If you do not specify a value for the KmsKeyId parameter, then the following occurs:   If the cluster is encrypted, then the restored cluster is encrypted using the AWS KMS key that was used to encrypt the source cluster.   If the cluster is not encrypted, then the restored cluster is not encrypted.   If DBClusterIdentifier refers to a cluster that is not encrypted, then the restore request is rejected.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * The port number on which the new cluster accepts connections. Constraints: Must be a value from 1150 to 65535.  Default: The default port for the engine.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  /**
    * The date and time to restore the cluster to. Valid values: A time in Universal Coordinated Time (UTC) format. Constraints:   Must be before the latest restorable time for the instance.   Must be specified if the UseLatestRestorableTime parameter is not provided.   Cannot be specified if the UseLatestRestorableTime parameter is true.   Cannot be specified if the RestoreType parameter is copy-on-write.   Example: 2015-03-07T23:45:00Z 
    */
  var RestoreToTime: js.UndefOr[TStamp] = js.native
  /**
    * The identifier of the source cluster from which to restore. Constraints:   Must match the identifier of an existing DBCluster.  
    */
  var SourceDBClusterIdentifier: String = js.native
  /**
    * The tags to be assigned to the restored cluster.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * A value that is set to true to restore the cluster to the latest restorable backup time, and false otherwise.  Default: false  Constraints: Cannot be specified if the RestoreToTime parameter is provided.
    */
  var UseLatestRestorableTime: js.UndefOr[Boolean] = js.native
  /**
    * A list of VPC security groups that the new cluster belongs to.
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.native
}

object RestoreDBClusterToPointInTimeMessage {
  @scala.inline
  def apply(DBClusterIdentifier: String, SourceDBClusterIdentifier: String): RestoreDBClusterToPointInTimeMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any], SourceDBClusterIdentifier = SourceDBClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreDBClusterToPointInTimeMessage]
  }
  @scala.inline
  implicit class RestoreDBClusterToPointInTimeMessageOps[Self <: RestoreDBClusterToPointInTimeMessage] (val x: Self) extends AnyVal {
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
    def setSourceDBClusterIdentifier(value: String): Self = this.set("SourceDBClusterIdentifier", value.asInstanceOf[js.Any])
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
    def setKmsKeyId(value: String): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    @scala.inline
    def setPort(value: IntegerOptional): Self = this.set("Port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    @scala.inline
    def setRestoreToTime(value: TStamp): Self = this.set("RestoreToTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestoreToTime: Self = this.set("RestoreToTime", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setUseLatestRestorableTime(value: Boolean): Self = this.set("UseLatestRestorableTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseLatestRestorableTime: Self = this.set("UseLatestRestorableTime", js.undefined)
    @scala.inline
    def setVpcSecurityGroupIdsVarargs(value: String*): Self = this.set("VpcSecurityGroupIds", js.Array(value :_*))
    @scala.inline
    def setVpcSecurityGroupIds(value: VpcSecurityGroupIdList): Self = this.set("VpcSecurityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcSecurityGroupIds: Self = this.set("VpcSecurityGroupIds", js.undefined)
  }
  
}

