package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreDBClusterToPointInTimeMessage extends js.Object {
  /**
    * The name of the new DB cluster to be created. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens   First character must be a letter   Cannot end with a hyphen or contain two consecutive hyphens  
    */
  var DBClusterIdentifier: String = js.native
  /**
    * The name of the DB cluster parameter group to associate with the new DB cluster. Constraints:   If supplied, must match the name of an existing DBClusterParameterGroup.  
    */
  var DBClusterParameterGroupName: js.UndefOr[String] = js.native
  /**
    * The DB subnet group name to use for the new DB cluster. Constraints: If supplied, must match the name of an existing DBSubnetGroup. Example: mySubnetgroup 
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.native
  /**
    * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled. 
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.native
  /**
    * The list of logs that the restored DB cluster is to export to CloudWatch Logs.
    */
  var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.native
  /**
    * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and otherwise false. Default: false 
    */
  var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.native
  /**
    * The AWS KMS key identifier to use when restoring an encrypted DB cluster from an encrypted DB cluster. The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are restoring a DB cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB cluster, then you can use the KMS key alias instead of the ARN for the KMS encryption key. You can restore to a new DB cluster and encrypt the new DB cluster with a KMS key that is different than the KMS key used to encrypt the source DB cluster. The new DB cluster is encrypted with the KMS key identified by the KmsKeyId parameter. If you do not specify a value for the KmsKeyId parameter, then the following will occur:   If the DB cluster is encrypted, then the restored DB cluster is encrypted using the KMS key that was used to encrypt the source DB cluster.   If the DB cluster is not encrypted, then the restored DB cluster is not encrypted.   If DBClusterIdentifier refers to a DB cluster that is not encrypted, then the restore request is rejected.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    *  (Not supported by Neptune) 
    */
  var OptionGroupName: js.UndefOr[String] = js.native
  /**
    * The port number on which the new DB cluster accepts connections. Constraints: Value must be 1150-65535  Default: The same port as the original DB cluster.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  /**
    * The date and time to restore the DB cluster to. Valid Values: Value must be a time in Universal Coordinated Time (UTC) format Constraints:   Must be before the latest restorable time for the DB instance   Must be specified if UseLatestRestorableTime parameter is not provided   Cannot be specified if UseLatestRestorableTime parameter is true   Cannot be specified if RestoreType parameter is copy-on-write    Example: 2015-03-07T23:45:00Z 
    */
  var RestoreToTime: js.UndefOr[TStamp] = js.native
  /**
    * The type of restore to be performed. You can specify one of the following values:    full-copy - The new DB cluster is restored as a full copy of the source DB cluster.    copy-on-write - The new DB cluster is restored as a clone of the source DB cluster.   If you don't specify a RestoreType value, then the new DB cluster is restored as a full copy of the source DB cluster.
    */
  var RestoreType: js.UndefOr[String] = js.native
  /**
    * The identifier of the source DB cluster from which to restore. Constraints:   Must match the identifier of an existing DBCluster.  
    */
  var SourceDBClusterIdentifier: String = js.native
  /**
    * The tags to be applied to the restored DB cluster.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * A value that is set to true to restore the DB cluster to the latest restorable backup time, and false otherwise. Default: false  Constraints: Cannot be specified if RestoreToTime parameter is provided.
    */
  var UseLatestRestorableTime: js.UndefOr[Boolean] = js.native
  /**
    * A list of VPC security groups that the new DB cluster belongs to.
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.native
}

object RestoreDBClusterToPointInTimeMessage {
  @scala.inline
  def apply(
    DBClusterIdentifier: String,
    SourceDBClusterIdentifier: String,
    DBClusterParameterGroupName: String = null,
    DBSubnetGroupName: String = null,
    DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
    EnableCloudwatchLogsExports: LogTypeList = null,
    EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
    KmsKeyId: String = null,
    OptionGroupName: String = null,
    Port: js.UndefOr[IntegerOptional] = js.undefined,
    RestoreToTime: TStamp = null,
    RestoreType: String = null,
    Tags: TagList = null,
    UseLatestRestorableTime: js.UndefOr[Boolean] = js.undefined,
    VpcSecurityGroupIds: VpcSecurityGroupIdList = null
  ): RestoreDBClusterToPointInTimeMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any], SourceDBClusterIdentifier = SourceDBClusterIdentifier.asInstanceOf[js.Any])
    if (DBClusterParameterGroupName != null) __obj.updateDynamic("DBClusterParameterGroupName")(DBClusterParameterGroupName.asInstanceOf[js.Any])
    if (DBSubnetGroupName != null) __obj.updateDynamic("DBSubnetGroupName")(DBSubnetGroupName.asInstanceOf[js.Any])
    if (!js.isUndefined(DeletionProtection)) __obj.updateDynamic("DeletionProtection")(DeletionProtection.get.asInstanceOf[js.Any])
    if (EnableCloudwatchLogsExports != null) __obj.updateDynamic("EnableCloudwatchLogsExports")(EnableCloudwatchLogsExports.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableIAMDatabaseAuthentication)) __obj.updateDynamic("EnableIAMDatabaseAuthentication")(EnableIAMDatabaseAuthentication.get.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (OptionGroupName != null) __obj.updateDynamic("OptionGroupName")(OptionGroupName.asInstanceOf[js.Any])
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port.get.asInstanceOf[js.Any])
    if (RestoreToTime != null) __obj.updateDynamic("RestoreToTime")(RestoreToTime.asInstanceOf[js.Any])
    if (RestoreType != null) __obj.updateDynamic("RestoreType")(RestoreType.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (!js.isUndefined(UseLatestRestorableTime)) __obj.updateDynamic("UseLatestRestorableTime")(UseLatestRestorableTime.get.asInstanceOf[js.Any])
    if (VpcSecurityGroupIds != null) __obj.updateDynamic("VpcSecurityGroupIds")(VpcSecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreDBClusterToPointInTimeMessage]
  }
}

