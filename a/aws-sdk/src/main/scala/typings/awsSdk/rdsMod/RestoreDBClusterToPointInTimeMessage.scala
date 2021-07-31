package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreDBClusterToPointInTimeMessage extends StObject {
  
  /**
    * The target backtrack window, in seconds. To disable backtracking, set this value to 0.  Currently, Backtrack is only supported for Aurora MySQL DB clusters.  Default: 0 Constraints:   If specified, this value must be set to a number from 0 to 259,200 (72 hours).  
    */
  var BacktrackWindow: js.UndefOr[LongOptional] = js.undefined
  
  /**
    * A value that indicates whether to copy all tags from the restored DB cluster to snapshots of the restored DB cluster. The default is not to copy them.
    */
  var CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The name of the new DB cluster to be created. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens  
    */
  var DBClusterIdentifier: String
  
  /**
    * The name of the DB cluster parameter group to associate with this DB cluster. If this argument is omitted, the default DB cluster parameter group for the specified engine is used. Constraints:   If supplied, must match the name of an existing DB cluster parameter group.   Must be 1 to 255 letters, numbers, or hyphens.   First character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.  
    */
  var DBClusterParameterGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The DB subnet group name to use for the new DB cluster. Constraints: If supplied, must match the name of an existing DBSubnetGroup. Example: mySubnetgroup 
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled. 
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Specify the Active Directory directory ID to restore the DB cluster in. The domain must be created prior to this operation.   For Amazon Aurora DB clusters, Amazon RDS can use Kerberos Authentication to authenticate users that connect to the DB cluster. For more information, see Kerberos Authentication in the Amazon Aurora User Guide. 
    */
  var Domain: js.UndefOr[String] = js.undefined
  
  /**
    * Specify the name of the IAM role to be used when making API calls to the Directory Service.
    */
  var DomainIAMRoleName: js.UndefOr[String] = js.undefined
  
  /**
    * The list of logs that the restored DB cluster is to export to CloudWatch Logs. The values in the list depend on the DB engine being used. For more information, see Publishing Database Logs to Amazon CloudWatch Logs in the Amazon Aurora User Guide.
    */
  var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
  
  /**
    * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts. By default, mapping is disabled. For more information, see  IAM Database Authentication in the Amazon Aurora User Guide. 
    */
  var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The AWS KMS key identifier to use when restoring an encrypted DB cluster from an encrypted DB cluster. The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are restoring a DB cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB cluster, then you can use the KMS key alias instead of the ARN for the KMS encryption key. You can restore to a new DB cluster and encrypt the new DB cluster with a KMS key that is different than the KMS key used to encrypt the source DB cluster. The new DB cluster is encrypted with the KMS key identified by the KmsKeyId parameter. If you don't specify a value for the KmsKeyId parameter, then the following occurs:   If the DB cluster is encrypted, then the restored DB cluster is encrypted using the KMS key that was used to encrypt the source DB cluster.   If the DB cluster isn't encrypted, then the restored DB cluster isn't encrypted.   If DBClusterIdentifier refers to a DB cluster that isn't encrypted, then the restore request is rejected.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the option group for the new DB cluster.
    */
  var OptionGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The port number on which the new DB cluster accepts connections. Constraints: A value from 1150-65535.  Default: The default port for the engine.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The date and time to restore the DB cluster to. Valid Values: Value must be a time in Universal Coordinated Time (UTC) format Constraints:   Must be before the latest restorable time for the DB instance   Must be specified if UseLatestRestorableTime parameter isn't provided   Can't be specified if the UseLatestRestorableTime parameter is enabled   Can't be specified if the RestoreType parameter is copy-on-write    Example: 2015-03-07T23:45:00Z 
    */
  var RestoreToTime: js.UndefOr[TStamp] = js.undefined
  
  /**
    * The type of restore to be performed. You can specify one of the following values:    full-copy - The new DB cluster is restored as a full copy of the source DB cluster.    copy-on-write - The new DB cluster is restored as a clone of the source DB cluster.   Constraints: You can't specify copy-on-write if the engine version of the source DB cluster is earlier than 1.11. If you don't specify a RestoreType value, then the new DB cluster is restored as a full copy of the source DB cluster.
    */
  var RestoreType: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the source DB cluster from which to restore. Constraints:   Must match the identifier of an existing DBCluster.  
    */
  var SourceDBClusterIdentifier: String
  
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * A value that indicates whether to restore the DB cluster to the latest restorable backup time. By default, the DB cluster isn't restored to the latest restorable backup time.  Constraints: Can't be specified if RestoreToTime parameter is provided.
    */
  var UseLatestRestorableTime: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of VPC security groups that the new DB cluster belongs to.
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
}
object RestoreDBClusterToPointInTimeMessage {
  
  @scala.inline
  def apply(DBClusterIdentifier: String, SourceDBClusterIdentifier: String): RestoreDBClusterToPointInTimeMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any], SourceDBClusterIdentifier = SourceDBClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreDBClusterToPointInTimeMessage]
  }
  
  @scala.inline
  implicit class RestoreDBClusterToPointInTimeMessageMutableBuilder[Self <: RestoreDBClusterToPointInTimeMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBacktrackWindow(value: LongOptional): Self = StObject.set(x, "BacktrackWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBacktrackWindowUndefined: Self = StObject.set(x, "BacktrackWindow", js.undefined)
    
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
    def setDBSubnetGroupName(value: String): Self = StObject.set(x, "DBSubnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSubnetGroupNameUndefined: Self = StObject.set(x, "DBSubnetGroupName", js.undefined)
    
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
    def setEnableCloudwatchLogsExports(value: LogTypeList): Self = StObject.set(x, "EnableCloudwatchLogsExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCloudwatchLogsExportsUndefined: Self = StObject.set(x, "EnableCloudwatchLogsExports", js.undefined)
    
    @scala.inline
    def setEnableCloudwatchLogsExportsVarargs(value: String*): Self = StObject.set(x, "EnableCloudwatchLogsExports", js.Array(value :_*))
    
    @scala.inline
    def setEnableIAMDatabaseAuthentication(value: BooleanOptional): Self = StObject.set(x, "EnableIAMDatabaseAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableIAMDatabaseAuthenticationUndefined: Self = StObject.set(x, "EnableIAMDatabaseAuthentication", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setOptionGroupName(value: String): Self = StObject.set(x, "OptionGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionGroupNameUndefined: Self = StObject.set(x, "OptionGroupName", js.undefined)
    
    @scala.inline
    def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    @scala.inline
    def setRestoreToTime(value: TStamp): Self = StObject.set(x, "RestoreToTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreToTimeUndefined: Self = StObject.set(x, "RestoreToTime", js.undefined)
    
    @scala.inline
    def setRestoreType(value: String): Self = StObject.set(x, "RestoreType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreTypeUndefined: Self = StObject.set(x, "RestoreType", js.undefined)
    
    @scala.inline
    def setSourceDBClusterIdentifier(value: String): Self = StObject.set(x, "SourceDBClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setUseLatestRestorableTime(value: Boolean): Self = StObject.set(x, "UseLatestRestorableTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseLatestRestorableTimeUndefined: Self = StObject.set(x, "UseLatestRestorableTime", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupIds(value: VpcSecurityGroupIdList): Self = StObject.set(x, "VpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "VpcSecurityGroupIds", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "VpcSecurityGroupIds", js.Array(value :_*))
  }
}
