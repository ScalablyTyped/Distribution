package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreDBClusterFromSnapshotMessage extends js.Object {
  /**
    * Provides the list of Availability Zones (AZs) where instances in the restored DB cluster can be created.
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.rdsMod.AvailabilityZones] = js.native
  /**
    * The target backtrack window, in seconds. To disable backtracking, set this value to 0.  Currently, Backtrack is only supported for Aurora MySQL DB clusters.  Default: 0 Constraints:   If specified, this value must be set to a number from 0 to 259,200 (72 hours).  
    */
  var BacktrackWindow: js.UndefOr[LongOptional] = js.native
  /**
    * A value that indicates whether to copy all tags from the restored DB cluster to snapshots of the restored DB cluster. The default is not to copy them.
    */
  var CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.native
  /**
    * The name of the DB cluster to create from the DB snapshot or DB cluster snapshot. This parameter isn't case-sensitive. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: my-snapshot-id 
    */
  var DBClusterIdentifier: String = js.native
  /**
    * The name of the DB cluster parameter group to associate with this DB cluster. If this argument is omitted, the default DB cluster parameter group for the specified engine is used. Constraints:   If supplied, must match the name of an existing default DB cluster parameter group.   Must be 1 to 255 letters, numbers, or hyphens.   First character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.  
    */
  var DBClusterParameterGroupName: js.UndefOr[String] = js.native
  /**
    * The name of the DB subnet group to use for the new DB cluster. Constraints: If supplied, must match the name of an existing DB subnet group. Example: mySubnetgroup 
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.native
  /**
    * The database name for the restored DB cluster.
    */
  var DatabaseName: js.UndefOr[String] = js.native
  /**
    * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled. 
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.native
  /**
    * Specify the Active Directory directory ID to restore the DB cluster in. The domain must be created prior to this operation. 
    */
  var Domain: js.UndefOr[String] = js.native
  /**
    * Specify the name of the IAM role to be used when making API calls to the Directory Service.
    */
  var DomainIAMRoleName: js.UndefOr[String] = js.native
  /**
    * The list of logs that the restored DB cluster is to export to Amazon CloudWatch Logs. The values in the list depend on the DB engine being used. For more information, see Publishing Database Logs to Amazon CloudWatch Logs  in the Amazon Aurora User Guide.
    */
  var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.native
  /**
    * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts. By default, mapping is disabled. For more information, see  IAM Database Authentication in the Amazon Aurora User Guide. 
    */
  var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.native
  /**
    * The database engine to use for the new DB cluster. Default: The same as source Constraint: Must be compatible with the engine of the source
    */
  var Engine: String = js.native
  /**
    * The DB engine mode of the DB cluster, either provisioned, serverless, parallelquery, global, or multimaster.
    */
  var EngineMode: js.UndefOr[String] = js.native
  /**
    * The version of the database engine to use for the new DB cluster. To list all of the available engine versions for aurora (for MySQL 5.6-compatible Aurora), use the following command:  aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"  To list all of the available engine versions for aurora-mysql (for MySQL 5.7-compatible Aurora), use the following command:  aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"  To list all of the available engine versions for aurora-postgresql, use the following command:  aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"   If you aren't using the default engine version, then you must specify the engine version.   Aurora MySQL  Example: 5.6.10a, 5.6.mysql_aurora.1.19.2, 5.7.12, 5.7.mysql_aurora.2.04.5   Aurora PostgreSQL  Example: 9.6.3, 10.7 
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * The AWS KMS key identifier to use when restoring an encrypted DB cluster from a DB snapshot or DB cluster snapshot. The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are restoring a DB cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB cluster, then you can use the KMS key alias instead of the ARN for the KMS encryption key. If you don't specify a value for the KmsKeyId parameter, then the following occurs:   If the DB snapshot or DB cluster snapshot in SnapshotIdentifier is encrypted, then the restored DB cluster is encrypted using the KMS key that was used to encrypt the DB snapshot or DB cluster snapshot.   If the DB snapshot or DB cluster snapshot in SnapshotIdentifier isn't encrypted, then the restored DB cluster isn't encrypted.  
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * The name of the option group to use for the restored DB cluster.
    */
  var OptionGroupName: js.UndefOr[String] = js.native
  /**
    * The port number on which the new DB cluster accepts connections. Constraints: This value must be 1150-65535  Default: The same port as the original DB cluster.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  /**
    * For DB clusters in serverless DB engine mode, the scaling properties of the DB cluster.
    */
  var ScalingConfiguration: js.UndefOr[typings.awsSdk.rdsMod.ScalingConfiguration] = js.native
  /**
    * The identifier for the DB snapshot or DB cluster snapshot to restore from. You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster snapshot. However, you can use only the ARN to specify a DB snapshot. Constraints:   Must match the identifier of an existing Snapshot.  
    */
  var SnapshotIdentifier: String = js.native
  /**
    * The tags to be assigned to the restored DB cluster.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * A list of VPC security groups that the new DB cluster will belong to.
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.native
}

object RestoreDBClusterFromSnapshotMessage {
  @scala.inline
  def apply(DBClusterIdentifier: String, Engine: String, SnapshotIdentifier: String): RestoreDBClusterFromSnapshotMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any], Engine = Engine.asInstanceOf[js.Any], SnapshotIdentifier = SnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreDBClusterFromSnapshotMessage]
  }
  @scala.inline
  implicit class RestoreDBClusterFromSnapshotMessageOps[Self <: RestoreDBClusterFromSnapshotMessage] (val x: Self) extends AnyVal {
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
    def setSnapshotIdentifier(value: String): Self = this.set("SnapshotIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailabilityZonesVarargs(value: String*): Self = this.set("AvailabilityZones", js.Array(value :_*))
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZones): Self = this.set("AvailabilityZones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("AvailabilityZones", js.undefined)
    @scala.inline
    def setBacktrackWindow(value: LongOptional): Self = this.set("BacktrackWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBacktrackWindow: Self = this.set("BacktrackWindow", js.undefined)
    @scala.inline
    def setCopyTagsToSnapshot(value: BooleanOptional): Self = this.set("CopyTagsToSnapshot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyTagsToSnapshot: Self = this.set("CopyTagsToSnapshot", js.undefined)
    @scala.inline
    def setDBClusterParameterGroupName(value: String): Self = this.set("DBClusterParameterGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBClusterParameterGroupName: Self = this.set("DBClusterParameterGroupName", js.undefined)
    @scala.inline
    def setDBSubnetGroupName(value: String): Self = this.set("DBSubnetGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBSubnetGroupName: Self = this.set("DBSubnetGroupName", js.undefined)
    @scala.inline
    def setDatabaseName(value: String): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabaseName: Self = this.set("DatabaseName", js.undefined)
    @scala.inline
    def setDeletionProtection(value: BooleanOptional): Self = this.set("DeletionProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletionProtection: Self = this.set("DeletionProtection", js.undefined)
    @scala.inline
    def setDomain(value: String): Self = this.set("Domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("Domain", js.undefined)
    @scala.inline
    def setDomainIAMRoleName(value: String): Self = this.set("DomainIAMRoleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainIAMRoleName: Self = this.set("DomainIAMRoleName", js.undefined)
    @scala.inline
    def setEnableCloudwatchLogsExportsVarargs(value: String*): Self = this.set("EnableCloudwatchLogsExports", js.Array(value :_*))
    @scala.inline
    def setEnableCloudwatchLogsExports(value: LogTypeList): Self = this.set("EnableCloudwatchLogsExports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableCloudwatchLogsExports: Self = this.set("EnableCloudwatchLogsExports", js.undefined)
    @scala.inline
    def setEnableIAMDatabaseAuthentication(value: BooleanOptional): Self = this.set("EnableIAMDatabaseAuthentication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableIAMDatabaseAuthentication: Self = this.set("EnableIAMDatabaseAuthentication", js.undefined)
    @scala.inline
    def setEngineMode(value: String): Self = this.set("EngineMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineMode: Self = this.set("EngineMode", js.undefined)
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    @scala.inline
    def setOptionGroupName(value: String): Self = this.set("OptionGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionGroupName: Self = this.set("OptionGroupName", js.undefined)
    @scala.inline
    def setPort(value: IntegerOptional): Self = this.set("Port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    @scala.inline
    def setScalingConfiguration(value: ScalingConfiguration): Self = this.set("ScalingConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScalingConfiguration: Self = this.set("ScalingConfiguration", js.undefined)
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

