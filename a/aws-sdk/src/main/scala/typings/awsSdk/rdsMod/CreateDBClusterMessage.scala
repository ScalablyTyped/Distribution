package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDBClusterMessage extends js.Object {
  /**
    * A list of Availability Zones (AZs) where instances in the DB cluster can be created. For information on AWS Regions and Availability Zones, see Choosing the Regions and Availability Zones in the Amazon Aurora User Guide. 
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.rdsMod.AvailabilityZones] = js.native
  /**
    * The target backtrack window, in seconds. To disable backtracking, set this value to 0.   Currently, Backtrack is only supported for Aurora MySQL DB clusters.  Default: 0 Constraints:   If specified, this value must be set to a number from 0 to 259,200 (72 hours).  
    */
  var BacktrackWindow: js.UndefOr[LongOptional] = js.native
  /**
    * The number of days for which automated backups are retained. Default: 1 Constraints:   Must be a value from 1 to 35  
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  /**
    * A value that indicates that the DB cluster should be associated with the specified CharacterSet.
    */
  var CharacterSetName: js.UndefOr[String] = js.native
  /**
    * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The default is not to copy them.
    */
  var CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.native
  /**
    * The DB cluster identifier. This parameter is stored as a lowercase string. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   First character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.   Example: my-cluster1 
    */
  var DBClusterIdentifier: String = js.native
  /**
    *  The name of the DB cluster parameter group to associate with this DB cluster. If you do not specify a value, then the default DB cluster parameter group for the specified DB engine and version is used.  Constraints:   If supplied, must match the name of an existing DB cluster parameter group.  
    */
  var DBClusterParameterGroupName: js.UndefOr[String] = js.native
  /**
    * A DB subnet group to associate with this DB cluster. Constraints: Must match the name of an existing DBSubnetGroup. Must not be default. Example: mySubnetgroup 
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.native
  /**
    * The name for your database of up to 64 alphanumeric characters. If you do not provide a name, Amazon RDS doesn't create a database in the DB cluster you are creating.
    */
  var DatabaseName: js.UndefOr[String] = js.native
  /**
    * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled.
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.native
  /**
    * The Active Directory directory ID to create the DB cluster in.  For Amazon Aurora DB clusters, Amazon RDS can use Kerberos Authentication to authenticate users that connect to the DB cluster. For more information, see Kerberos Authentication in the Amazon Aurora User Guide. 
    */
  var Domain: js.UndefOr[String] = js.native
  /**
    * Specify the name of the IAM role to be used when making API calls to the Directory Service.
    */
  var DomainIAMRoleName: js.UndefOr[String] = js.native
  /**
    * The list of log types that need to be enabled for exporting to CloudWatch Logs. The values in the list depend on the DB engine being used. For more information, see Publishing Database Logs to Amazon CloudWatch Logs in the Amazon Aurora User Guide.
    */
  var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.native
  /**
    * A value that indicates whether to enable write operations to be forwarded from this cluster to the primary cluster in an Aurora global database. The resulting changes are replicated back to this cluster. This parameter only applies to DB clusters that are secondary clusters in an Aurora global database. By default, Aurora disallows write operations for secondary clusters.
    */
  var EnableGlobalWriteForwarding: js.UndefOr[BooleanOptional] = js.native
  /**
    * A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By default, the HTTP endpoint is disabled. When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the Aurora Serverless DB cluster. You can also query your database from inside the RDS console with the query editor. For more information, see Using the Data API for Aurora Serverless in the Amazon Aurora User Guide.
    */
  var EnableHttpEndpoint: js.UndefOr[BooleanOptional] = js.native
  /**
    * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts. By default, mapping is disabled. For more information, see  IAM Database Authentication in the Amazon Aurora User Guide. 
    */
  var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.native
  /**
    * The name of the database engine to be used for this DB cluster. Valid Values: aurora (for MySQL 5.6-compatible Aurora), aurora-mysql (for MySQL 5.7-compatible Aurora), and aurora-postgresql 
    */
  var Engine: String = js.native
  /**
    * The DB engine mode of the DB cluster, either provisioned, serverless, parallelquery, global, or multimaster.   global engine mode only applies for global database clusters created with Aurora MySQL version 5.6.10a. For higher Aurora MySQL versions, the clusters in a global database use provisioned engine mode.   Limitations and requirements apply to some DB engine modes. For more information, see the following sections in the Amazon Aurora User Guide:     Limitations of Aurora Serverless      Limitations of Parallel Query      Requirements for Aurora Global Databases      Limitations of Multi-Master Clusters   
    */
  var EngineMode: js.UndefOr[String] = js.native
  /**
    * The version number of the database engine to use. To list all of the available engine versions for aurora (for MySQL 5.6-compatible Aurora), use the following command:  aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"  To list all of the available engine versions for aurora-mysql (for MySQL 5.7-compatible Aurora), use the following command:  aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"  To list all of the available engine versions for aurora-postgresql, use the following command:  aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"   Aurora MySQL  Example: 5.6.10a, 5.6.mysql_aurora.1.19.2, 5.7.12, 5.7.mysql_aurora.2.04.5   Aurora PostgreSQL  Example: 9.6.3, 10.7 
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    *  The global cluster ID of an Aurora cluster that becomes the primary cluster in the new global database cluster. 
    */
  var GlobalClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * The AWS KMS key identifier for an encrypted DB cluster. The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a DB cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB cluster, then you can use the KMS key alias instead of the ARN for the KMS encryption key. If an encryption key isn't specified in KmsKeyId:   If ReplicationSourceIdentifier identifies an encrypted source, then Amazon RDS will use the encryption key used to encrypt the source. Otherwise, Amazon RDS will use your default encryption key.    If the StorageEncrypted parameter is enabled and ReplicationSourceIdentifier isn't specified, then Amazon RDS will use your default encryption key.   AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region. If you create a read replica of an encrypted DB cluster in another AWS Region, you must set KmsKeyId to a KMS key ID that is valid in the destination AWS Region. This key is used to encrypt the read replica in that AWS Region.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * The password for the master database user. This password can contain any printable ASCII character except "/", """, or "@". Constraints: Must contain from 8 to 41 characters.
    */
  var MasterUserPassword: js.UndefOr[String] = js.native
  /**
    * The name of the master user for the DB cluster. Constraints:   Must be 1 to 16 letters or numbers.   First character must be a letter.   Can't be a reserved word for the chosen database engine.  
    */
  var MasterUsername: js.UndefOr[String] = js.native
  /**
    * A value that indicates that the DB cluster should be associated with the specified option group. Permanent options can't be removed from an option group. The option group can't be removed from a DB cluster once it is associated with a DB cluster.
    */
  var OptionGroupName: js.UndefOr[String] = js.native
  /**
    * The port number on which the instances in the DB cluster accept connections.  Default: 3306 if engine is set as aurora or 5432 if set to aurora-postgresql. 
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  /**
    * A URL that contains a Signature Version 4 signed request for the CreateDBCluster action to be called in the source AWS Region where the DB cluster is replicated from. You only need to specify PreSignedUrl when you are performing cross-region replication from an encrypted DB cluster. The pre-signed URL must be a valid request for the CreateDBCluster API action that can be executed in the source AWS Region that contains the encrypted DB cluster to be copied. The pre-signed URL request must contain the following parameter values:    KmsKeyId - The AWS KMS key identifier for the key to use to encrypt the copy of the DB cluster in the destination AWS Region. This should refer to the same KMS key for both the CreateDBCluster action that is called in the destination AWS Region, and the action contained in the pre-signed URL.    DestinationRegion - The name of the AWS Region that Aurora read replica will be created in.    ReplicationSourceIdentifier - The DB cluster identifier for the encrypted DB cluster to be copied. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For example, if you are copying an encrypted DB cluster from the us-west-2 AWS Region, then your ReplicationSourceIdentifier would look like Example: arn:aws:rds:us-west-2:123456789012:cluster:aurora-cluster1.   To learn how to generate a Signature Version 4 signed request, see  Authenticating Requests: Using Query Parameters (AWS Signature Version 4) and  Signature Version 4 Signing Process.  If you are using an AWS SDK tool or the AWS CLI, you can specify SourceRegion (or --source-region for the AWS CLI) instead of specifying PreSignedUrl manually. Specifying SourceRegion autogenerates a pre-signed URL that is a valid request for the operation that can be executed in the source AWS Region. If you supply a value for this operation's SourceRegion parameter, a pre-signed URL will be calculated on your behalf.
    */
  var PreSignedUrl: js.UndefOr[String] = js.native
  /**
    * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter.  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To see the time blocks available, see  Adjusting the Preferred DB Cluster Maintenance Window in the Amazon Aurora User Guide.  Constraints:   Must be in the format hh24:mi-hh24:mi.   Must be in Universal Coordinated Time (UTC).   Must not conflict with the preferred maintenance window.   Must be at least 30 minutes.  
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.native
  /**
    * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC). Format: ddd:hh24:mi-ddd:hh24:mi  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring on a random day of the week. To see the time blocks available, see  Adjusting the Preferred DB Cluster Maintenance Window in the Amazon Aurora User Guide.  Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun. Constraints: Minimum 30-minute window.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is created as a read replica.
    */
  var ReplicationSourceIdentifier: js.UndefOr[String] = js.native
  /**
    * For DB clusters in serverless DB engine mode, the scaling properties of the DB cluster.
    */
  var ScalingConfiguration: js.UndefOr[typings.awsSdk.rdsMod.ScalingConfiguration] = js.native
  /**
    * The ID of the region that contains the source for the read replica.
    */
  var SourceRegion: js.UndefOr[String] = js.native
  /**
    * A value that indicates whether the DB cluster is encrypted.
    */
  var StorageEncrypted: js.UndefOr[BooleanOptional] = js.native
  /**
    * Tags to assign to the DB cluster.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * A list of EC2 VPC security groups to associate with this DB cluster.
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.native
}

object CreateDBClusterMessage {
  @scala.inline
  def apply(DBClusterIdentifier: String, Engine: String): CreateDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any], Engine = Engine.asInstanceOf[js.Any])
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
    def setBackupRetentionPeriod(value: IntegerOptional): Self = this.set("BackupRetentionPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupRetentionPeriod: Self = this.set("BackupRetentionPeriod", js.undefined)
    @scala.inline
    def setCharacterSetName(value: String): Self = this.set("CharacterSetName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharacterSetName: Self = this.set("CharacterSetName", js.undefined)
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
    def setEnableGlobalWriteForwarding(value: BooleanOptional): Self = this.set("EnableGlobalWriteForwarding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableGlobalWriteForwarding: Self = this.set("EnableGlobalWriteForwarding", js.undefined)
    @scala.inline
    def setEnableHttpEndpoint(value: BooleanOptional): Self = this.set("EnableHttpEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableHttpEndpoint: Self = this.set("EnableHttpEndpoint", js.undefined)
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
    def setGlobalClusterIdentifier(value: String): Self = this.set("GlobalClusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalClusterIdentifier: Self = this.set("GlobalClusterIdentifier", js.undefined)
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    @scala.inline
    def setMasterUserPassword(value: String): Self = this.set("MasterUserPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterUserPassword: Self = this.set("MasterUserPassword", js.undefined)
    @scala.inline
    def setMasterUsername(value: String): Self = this.set("MasterUsername", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterUsername: Self = this.set("MasterUsername", js.undefined)
    @scala.inline
    def setOptionGroupName(value: String): Self = this.set("OptionGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionGroupName: Self = this.set("OptionGroupName", js.undefined)
    @scala.inline
    def setPort(value: IntegerOptional): Self = this.set("Port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    @scala.inline
    def setPreSignedUrl(value: String): Self = this.set("PreSignedUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreSignedUrl: Self = this.set("PreSignedUrl", js.undefined)
    @scala.inline
    def setPreferredBackupWindow(value: String): Self = this.set("PreferredBackupWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredBackupWindow: Self = this.set("PreferredBackupWindow", js.undefined)
    @scala.inline
    def setPreferredMaintenanceWindow(value: String): Self = this.set("PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredMaintenanceWindow: Self = this.set("PreferredMaintenanceWindow", js.undefined)
    @scala.inline
    def setReplicationSourceIdentifier(value: String): Self = this.set("ReplicationSourceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationSourceIdentifier: Self = this.set("ReplicationSourceIdentifier", js.undefined)
    @scala.inline
    def setScalingConfiguration(value: ScalingConfiguration): Self = this.set("ScalingConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScalingConfiguration: Self = this.set("ScalingConfiguration", js.undefined)
    @scala.inline
    def setSourceRegion(value: String): Self = this.set("SourceRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceRegion: Self = this.set("SourceRegion", js.undefined)
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

