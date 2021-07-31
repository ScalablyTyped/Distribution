package typings.awsSdk.rdsMod

import typings.awsSdk.anon.DescribeDBClusterSnapshot
import typings.awsSdk.anon.DescribeDBInstancesMessagFilters
import typings.awsSdk.anon.DescribeDBSnapshotsMessag
import typings.awsSdk.awsSdkStrings.dBClusterSnapshotAvailable
import typings.awsSdk.awsSdkStrings.dBClusterSnapshotDeleted
import typings.awsSdk.awsSdkStrings.dBInstanceAvailable
import typings.awsSdk.awsSdkStrings.dBInstanceDeleted
import typings.awsSdk.awsSdkStrings.dBSnapshotAvailable
import typings.awsSdk.awsSdkStrings.dBSnapshotDeleted
import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RDS extends Service {
  
  /**
    * Associates an Identity and Access Management (IAM) role from an Amazon Aurora DB cluster. For more information, see Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf in the Amazon Aurora User Guide.  This action only applies to Aurora DB clusters. 
    */
  def addRoleToDBCluster(): Request[js.Object, AWSError] = js.native
  def addRoleToDBCluster(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Associates an Identity and Access Management (IAM) role from an Amazon Aurora DB cluster. For more information, see Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf in the Amazon Aurora User Guide.  This action only applies to Aurora DB clusters. 
    */
  def addRoleToDBCluster(params: AddRoleToDBClusterMessage): Request[js.Object, AWSError] = js.native
  def addRoleToDBCluster(
    params: AddRoleToDBClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Associates an AWS Identity and Access Management (IAM) role with a DB instance.  To add a role to a DB instance, the status of the DB instance must be available. 
    */
  def addRoleToDBInstance(): Request[js.Object, AWSError] = js.native
  def addRoleToDBInstance(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Associates an AWS Identity and Access Management (IAM) role with a DB instance.  To add a role to a DB instance, the status of the DB instance must be available. 
    */
  def addRoleToDBInstance(params: AddRoleToDBInstanceMessage): Request[js.Object, AWSError] = js.native
  def addRoleToDBInstance(
    params: AddRoleToDBInstanceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Adds a source identifier to an existing RDS event notification subscription.
    */
  def addSourceIdentifierToSubscription(): Request[AddSourceIdentifierToSubscriptionResult, AWSError] = js.native
  def addSourceIdentifierToSubscription(
    callback: js.Function2[/* err */ AWSError, /* data */ AddSourceIdentifierToSubscriptionResult, Unit]
  ): Request[AddSourceIdentifierToSubscriptionResult, AWSError] = js.native
  /**
    * Adds a source identifier to an existing RDS event notification subscription.
    */
  def addSourceIdentifierToSubscription(params: AddSourceIdentifierToSubscriptionMessage): Request[AddSourceIdentifierToSubscriptionResult, AWSError] = js.native
  def addSourceIdentifierToSubscription(
    params: AddSourceIdentifierToSubscriptionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ AddSourceIdentifierToSubscriptionResult, Unit]
  ): Request[AddSourceIdentifierToSubscriptionResult, AWSError] = js.native
  
  /**
    * Adds metadata tags to an Amazon RDS resource. These tags can also be used with cost allocation reporting to track cost associated with Amazon RDS resources, or used in a Condition statement in an IAM policy for Amazon RDS. For an overview on tagging Amazon RDS resources, see Tagging Amazon RDS Resources.
    */
  def addTagsToResource(): Request[js.Object, AWSError] = js.native
  def addTagsToResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds metadata tags to an Amazon RDS resource. These tags can also be used with cost allocation reporting to track cost associated with Amazon RDS resources, or used in a Condition statement in an IAM policy for Amazon RDS. For an overview on tagging Amazon RDS resources, see Tagging Amazon RDS Resources.
    */
  def addTagsToResource(params: AddTagsToResourceMessage): Request[js.Object, AWSError] = js.native
  def addTagsToResource(
    params: AddTagsToResourceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Applies a pending maintenance action to a resource (for example, to a DB instance).
    */
  def applyPendingMaintenanceAction(): Request[ApplyPendingMaintenanceActionResult, AWSError] = js.native
  def applyPendingMaintenanceAction(callback: js.Function2[/* err */ AWSError, /* data */ ApplyPendingMaintenanceActionResult, Unit]): Request[ApplyPendingMaintenanceActionResult, AWSError] = js.native
  /**
    * Applies a pending maintenance action to a resource (for example, to a DB instance).
    */
  def applyPendingMaintenanceAction(params: ApplyPendingMaintenanceActionMessage): Request[ApplyPendingMaintenanceActionResult, AWSError] = js.native
  def applyPendingMaintenanceAction(
    params: ApplyPendingMaintenanceActionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ApplyPendingMaintenanceActionResult, Unit]
  ): Request[ApplyPendingMaintenanceActionResult, AWSError] = js.native
  
  /**
    * Enables ingress to a DBSecurityGroup using one of two forms of authorization. First, EC2 or VPC security groups can be added to the DBSecurityGroup if the application using the database is running on EC2 or VPC instances. Second, IP ranges are available if the application accessing your database is running on the Internet. Required parameters for this API are one of CIDR range, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId for non-VPC).  You can't authorize ingress from an EC2 security group in one AWS Region to an Amazon RDS DB instance in another. You can't authorize ingress from a VPC security group in one VPC to an Amazon RDS DB instance in another.  For an overview of CIDR ranges, go to the Wikipedia Tutorial. 
    */
  def authorizeDBSecurityGroupIngress(): Request[AuthorizeDBSecurityGroupIngressResult, AWSError] = js.native
  def authorizeDBSecurityGroupIngress(callback: js.Function2[/* err */ AWSError, /* data */ AuthorizeDBSecurityGroupIngressResult, Unit]): Request[AuthorizeDBSecurityGroupIngressResult, AWSError] = js.native
  /**
    * Enables ingress to a DBSecurityGroup using one of two forms of authorization. First, EC2 or VPC security groups can be added to the DBSecurityGroup if the application using the database is running on EC2 or VPC instances. Second, IP ranges are available if the application accessing your database is running on the Internet. Required parameters for this API are one of CIDR range, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId for non-VPC).  You can't authorize ingress from an EC2 security group in one AWS Region to an Amazon RDS DB instance in another. You can't authorize ingress from a VPC security group in one VPC to an Amazon RDS DB instance in another.  For an overview of CIDR ranges, go to the Wikipedia Tutorial. 
    */
  def authorizeDBSecurityGroupIngress(params: AuthorizeDBSecurityGroupIngressMessage): Request[AuthorizeDBSecurityGroupIngressResult, AWSError] = js.native
  def authorizeDBSecurityGroupIngress(
    params: AuthorizeDBSecurityGroupIngressMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ AuthorizeDBSecurityGroupIngressResult, Unit]
  ): Request[AuthorizeDBSecurityGroupIngressResult, AWSError] = js.native
  
  /**
    * Backtracks a DB cluster to a specific time, without creating a new DB cluster. For more information on backtracking, see  Backtracking an Aurora DB Cluster in the Amazon Aurora User Guide.   This action only applies to Aurora MySQL DB clusters. 
    */
  def backtrackDBCluster(): Request[DBClusterBacktrack, AWSError] = js.native
  def backtrackDBCluster(callback: js.Function2[/* err */ AWSError, /* data */ DBClusterBacktrack, Unit]): Request[DBClusterBacktrack, AWSError] = js.native
  /**
    * Backtracks a DB cluster to a specific time, without creating a new DB cluster. For more information on backtracking, see  Backtracking an Aurora DB Cluster in the Amazon Aurora User Guide.   This action only applies to Aurora MySQL DB clusters. 
    */
  def backtrackDBCluster(params: BacktrackDBClusterMessage): Request[DBClusterBacktrack, AWSError] = js.native
  def backtrackDBCluster(
    params: BacktrackDBClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBClusterBacktrack, Unit]
  ): Request[DBClusterBacktrack, AWSError] = js.native
  
  /**
    * Cancels an export task in progress that is exporting a snapshot to Amazon S3. Any data that has already been written to the S3 bucket isn't removed. 
    */
  def cancelExportTask(): Request[ExportTask, AWSError] = js.native
  def cancelExportTask(callback: js.Function2[/* err */ AWSError, /* data */ ExportTask, Unit]): Request[ExportTask, AWSError] = js.native
  /**
    * Cancels an export task in progress that is exporting a snapshot to Amazon S3. Any data that has already been written to the S3 bucket isn't removed. 
    */
  def cancelExportTask(params: CancelExportTaskMessage): Request[ExportTask, AWSError] = js.native
  def cancelExportTask(
    params: CancelExportTaskMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ExportTask, Unit]
  ): Request[ExportTask, AWSError] = js.native
  
  @JSName("config")
  var config_RDS: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Copies the specified DB cluster parameter group.  This action only applies to Aurora DB clusters. 
    */
  def copyDBClusterParameterGroup(): Request[CopyDBClusterParameterGroupResult, AWSError] = js.native
  def copyDBClusterParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ CopyDBClusterParameterGroupResult, Unit]): Request[CopyDBClusterParameterGroupResult, AWSError] = js.native
  /**
    * Copies the specified DB cluster parameter group.  This action only applies to Aurora DB clusters. 
    */
  def copyDBClusterParameterGroup(params: CopyDBClusterParameterGroupMessage): Request[CopyDBClusterParameterGroupResult, AWSError] = js.native
  def copyDBClusterParameterGroup(
    params: CopyDBClusterParameterGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CopyDBClusterParameterGroupResult, Unit]
  ): Request[CopyDBClusterParameterGroupResult, AWSError] = js.native
  
  /**
    * Copies a snapshot of a DB cluster. To copy a DB cluster snapshot from a shared manual DB cluster snapshot, SourceDBClusterSnapshotIdentifier must be the Amazon Resource Name (ARN) of the shared DB cluster snapshot. You can copy an encrypted DB cluster snapshot from another AWS Region. In that case, the AWS Region where you call the CopyDBClusterSnapshot action is the destination AWS Region for the encrypted DB cluster snapshot to be copied to. To copy an encrypted DB cluster snapshot from another AWS Region, you must provide the following values:    KmsKeyId - The AWS Key Management System (AWS KMS) key identifier for the key to use to encrypt the copy of the DB cluster snapshot in the destination AWS Region.    PreSignedUrl - A URL that contains a Signature Version 4 signed request for the CopyDBClusterSnapshot action to be called in the source AWS Region where the DB cluster snapshot is copied from. The pre-signed URL must be a valid request for the CopyDBClusterSnapshot API action that can be executed in the source AWS Region that contains the encrypted DB cluster snapshot to be copied. The pre-signed URL request must contain the following parameter values:    KmsKeyId - The KMS key identifier for the key to use to encrypt the copy of the DB cluster snapshot in the destination AWS Region. This is the same identifier for both the CopyDBClusterSnapshot action that is called in the destination AWS Region, and the action contained in the pre-signed URL.    DestinationRegion - The name of the AWS Region that the DB cluster snapshot is to be created in.    SourceDBClusterSnapshotIdentifier - The DB cluster snapshot identifier for the encrypted DB cluster snapshot to be copied. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For example, if you are copying an encrypted DB cluster snapshot from the us-west-2 AWS Region, then your SourceDBClusterSnapshotIdentifier looks like the following example: arn:aws:rds:us-west-2:123456789012:cluster-snapshot:aurora-cluster1-snapshot-20161115.   To learn how to generate a Signature Version 4 signed request, see  Authenticating Requests: Using Query Parameters (AWS Signature Version 4) and  Signature Version 4 Signing Process.  If you are using an AWS SDK tool or the AWS CLI, you can specify SourceRegion (or --source-region for the AWS CLI) instead of specifying PreSignedUrl manually. Specifying SourceRegion autogenerates a pre-signed URL that is a valid request for the operation that can be executed in the source AWS Region.     TargetDBClusterSnapshotIdentifier - The identifier for the new copy of the DB cluster snapshot in the destination AWS Region.    SourceDBClusterSnapshotIdentifier - The DB cluster snapshot identifier for the encrypted DB cluster snapshot to be copied. This identifier must be in the ARN format for the source AWS Region and is the same value as the SourceDBClusterSnapshotIdentifier in the pre-signed URL.    To cancel the copy operation once it is in progress, delete the target DB cluster snapshot identified by TargetDBClusterSnapshotIdentifier while that DB cluster snapshot is in "copying" status. For more information on copying encrypted DB cluster snapshots from one AWS Region to another, see  Copying a Snapshot in the Amazon Aurora User Guide.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def copyDBClusterSnapshot(): Request[CopyDBClusterSnapshotResult, AWSError] = js.native
  def copyDBClusterSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CopyDBClusterSnapshotResult, Unit]): Request[CopyDBClusterSnapshotResult, AWSError] = js.native
  /**
    * Copies a snapshot of a DB cluster. To copy a DB cluster snapshot from a shared manual DB cluster snapshot, SourceDBClusterSnapshotIdentifier must be the Amazon Resource Name (ARN) of the shared DB cluster snapshot. You can copy an encrypted DB cluster snapshot from another AWS Region. In that case, the AWS Region where you call the CopyDBClusterSnapshot action is the destination AWS Region for the encrypted DB cluster snapshot to be copied to. To copy an encrypted DB cluster snapshot from another AWS Region, you must provide the following values:    KmsKeyId - The AWS Key Management System (AWS KMS) key identifier for the key to use to encrypt the copy of the DB cluster snapshot in the destination AWS Region.    PreSignedUrl - A URL that contains a Signature Version 4 signed request for the CopyDBClusterSnapshot action to be called in the source AWS Region where the DB cluster snapshot is copied from. The pre-signed URL must be a valid request for the CopyDBClusterSnapshot API action that can be executed in the source AWS Region that contains the encrypted DB cluster snapshot to be copied. The pre-signed URL request must contain the following parameter values:    KmsKeyId - The KMS key identifier for the key to use to encrypt the copy of the DB cluster snapshot in the destination AWS Region. This is the same identifier for both the CopyDBClusterSnapshot action that is called in the destination AWS Region, and the action contained in the pre-signed URL.    DestinationRegion - The name of the AWS Region that the DB cluster snapshot is to be created in.    SourceDBClusterSnapshotIdentifier - The DB cluster snapshot identifier for the encrypted DB cluster snapshot to be copied. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For example, if you are copying an encrypted DB cluster snapshot from the us-west-2 AWS Region, then your SourceDBClusterSnapshotIdentifier looks like the following example: arn:aws:rds:us-west-2:123456789012:cluster-snapshot:aurora-cluster1-snapshot-20161115.   To learn how to generate a Signature Version 4 signed request, see  Authenticating Requests: Using Query Parameters (AWS Signature Version 4) and  Signature Version 4 Signing Process.  If you are using an AWS SDK tool or the AWS CLI, you can specify SourceRegion (or --source-region for the AWS CLI) instead of specifying PreSignedUrl manually. Specifying SourceRegion autogenerates a pre-signed URL that is a valid request for the operation that can be executed in the source AWS Region.     TargetDBClusterSnapshotIdentifier - The identifier for the new copy of the DB cluster snapshot in the destination AWS Region.    SourceDBClusterSnapshotIdentifier - The DB cluster snapshot identifier for the encrypted DB cluster snapshot to be copied. This identifier must be in the ARN format for the source AWS Region and is the same value as the SourceDBClusterSnapshotIdentifier in the pre-signed URL.    To cancel the copy operation once it is in progress, delete the target DB cluster snapshot identified by TargetDBClusterSnapshotIdentifier while that DB cluster snapshot is in "copying" status. For more information on copying encrypted DB cluster snapshots from one AWS Region to another, see  Copying a Snapshot in the Amazon Aurora User Guide.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def copyDBClusterSnapshot(params: CopyDBClusterSnapshotMessage): Request[CopyDBClusterSnapshotResult, AWSError] = js.native
  def copyDBClusterSnapshot(
    params: CopyDBClusterSnapshotMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CopyDBClusterSnapshotResult, Unit]
  ): Request[CopyDBClusterSnapshotResult, AWSError] = js.native
  
  /**
    * Copies the specified DB parameter group.
    */
  def copyDBParameterGroup(): Request[CopyDBParameterGroupResult, AWSError] = js.native
  def copyDBParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ CopyDBParameterGroupResult, Unit]): Request[CopyDBParameterGroupResult, AWSError] = js.native
  /**
    * Copies the specified DB parameter group.
    */
  def copyDBParameterGroup(params: CopyDBParameterGroupMessage): Request[CopyDBParameterGroupResult, AWSError] = js.native
  def copyDBParameterGroup(
    params: CopyDBParameterGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CopyDBParameterGroupResult, Unit]
  ): Request[CopyDBParameterGroupResult, AWSError] = js.native
  
  /**
    * Copies the specified DB snapshot. The source DB snapshot must be in the available state. You can copy a snapshot from one AWS Region to another. In that case, the AWS Region where you call the CopyDBSnapshot action is the destination AWS Region for the DB snapshot copy.  For more information about copying snapshots, see Copying a DB Snapshot in the Amazon RDS User Guide. 
    */
  def copyDBSnapshot(): Request[CopyDBSnapshotResult, AWSError] = js.native
  def copyDBSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CopyDBSnapshotResult, Unit]): Request[CopyDBSnapshotResult, AWSError] = js.native
  /**
    * Copies the specified DB snapshot. The source DB snapshot must be in the available state. You can copy a snapshot from one AWS Region to another. In that case, the AWS Region where you call the CopyDBSnapshot action is the destination AWS Region for the DB snapshot copy.  For more information about copying snapshots, see Copying a DB Snapshot in the Amazon RDS User Guide. 
    */
  def copyDBSnapshot(params: CopyDBSnapshotMessage): Request[CopyDBSnapshotResult, AWSError] = js.native
  def copyDBSnapshot(
    params: CopyDBSnapshotMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CopyDBSnapshotResult, Unit]
  ): Request[CopyDBSnapshotResult, AWSError] = js.native
  
  /**
    * Copies the specified option group.
    */
  def copyOptionGroup(): Request[CopyOptionGroupResult, AWSError] = js.native
  def copyOptionGroup(callback: js.Function2[/* err */ AWSError, /* data */ CopyOptionGroupResult, Unit]): Request[CopyOptionGroupResult, AWSError] = js.native
  /**
    * Copies the specified option group.
    */
  def copyOptionGroup(params: CopyOptionGroupMessage): Request[CopyOptionGroupResult, AWSError] = js.native
  def copyOptionGroup(
    params: CopyOptionGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CopyOptionGroupResult, Unit]
  ): Request[CopyOptionGroupResult, AWSError] = js.native
  
  /**
    * Creates a custom Availability Zone (AZ). A custom AZ is an on-premises AZ that is integrated with a VMware vSphere cluster. For more information about RDS on VMware, see the  RDS on VMware User Guide.  
    */
  def createCustomAvailabilityZone(): Request[CreateCustomAvailabilityZoneResult, AWSError] = js.native
  def createCustomAvailabilityZone(callback: js.Function2[/* err */ AWSError, /* data */ CreateCustomAvailabilityZoneResult, Unit]): Request[CreateCustomAvailabilityZoneResult, AWSError] = js.native
  /**
    * Creates a custom Availability Zone (AZ). A custom AZ is an on-premises AZ that is integrated with a VMware vSphere cluster. For more information about RDS on VMware, see the  RDS on VMware User Guide.  
    */
  def createCustomAvailabilityZone(params: CreateCustomAvailabilityZoneMessage): Request[CreateCustomAvailabilityZoneResult, AWSError] = js.native
  def createCustomAvailabilityZone(
    params: CreateCustomAvailabilityZoneMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCustomAvailabilityZoneResult, Unit]
  ): Request[CreateCustomAvailabilityZoneResult, AWSError] = js.native
  
  /**
    * Creates a new Amazon Aurora DB cluster. You can use the ReplicationSourceIdentifier parameter to create the DB cluster as a read replica of another DB cluster or Amazon RDS MySQL DB instance. For cross-region replication where the DB cluster identified by ReplicationSourceIdentifier is encrypted, you must also specify the PreSignedUrl parameter. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def createDBCluster(): Request[CreateDBClusterResult, AWSError] = js.native
  def createDBCluster(callback: js.Function2[/* err */ AWSError, /* data */ CreateDBClusterResult, Unit]): Request[CreateDBClusterResult, AWSError] = js.native
  /**
    * Creates a new Amazon Aurora DB cluster. You can use the ReplicationSourceIdentifier parameter to create the DB cluster as a read replica of another DB cluster or Amazon RDS MySQL DB instance. For cross-region replication where the DB cluster identified by ReplicationSourceIdentifier is encrypted, you must also specify the PreSignedUrl parameter. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def createDBCluster(params: CreateDBClusterMessage): Request[CreateDBClusterResult, AWSError] = js.native
  def createDBCluster(
    params: CreateDBClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDBClusterResult, Unit]
  ): Request[CreateDBClusterResult, AWSError] = js.native
  
  /**
    * Creates a new custom endpoint and associates it with an Amazon Aurora DB cluster.  This action only applies to Aurora DB clusters. 
    */
  def createDBClusterEndpoint(): Request[DBClusterEndpoint, AWSError] = js.native
  def createDBClusterEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ DBClusterEndpoint, Unit]): Request[DBClusterEndpoint, AWSError] = js.native
  /**
    * Creates a new custom endpoint and associates it with an Amazon Aurora DB cluster.  This action only applies to Aurora DB clusters. 
    */
  def createDBClusterEndpoint(params: CreateDBClusterEndpointMessage): Request[DBClusterEndpoint, AWSError] = js.native
  def createDBClusterEndpoint(
    params: CreateDBClusterEndpointMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBClusterEndpoint, Unit]
  ): Request[DBClusterEndpoint, AWSError] = js.native
  
  /**
    * Creates a new DB cluster parameter group. Parameters in a DB cluster parameter group apply to all of the instances in a DB cluster.  A DB cluster parameter group is initially created with the default parameters for the database engine used by instances in the DB cluster. To provide custom values for any of the parameters, you must modify the group after creating it using ModifyDBClusterParameterGroup. Once you've created a DB cluster parameter group, you need to associate it with your DB cluster using ModifyDBCluster. When you associate a new DB cluster parameter group with a running DB cluster, you need to reboot the DB instances in the DB cluster without failover for the new DB cluster parameter group and associated settings to take effect.   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully complete the create action before the DB cluster parameter group is used as the default for a new DB cluster. This is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBClusterParameters action to verify that your DB cluster parameter group has been created or modified.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def createDBClusterParameterGroup(): Request[CreateDBClusterParameterGroupResult, AWSError] = js.native
  def createDBClusterParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateDBClusterParameterGroupResult, Unit]): Request[CreateDBClusterParameterGroupResult, AWSError] = js.native
  /**
    * Creates a new DB cluster parameter group. Parameters in a DB cluster parameter group apply to all of the instances in a DB cluster.  A DB cluster parameter group is initially created with the default parameters for the database engine used by instances in the DB cluster. To provide custom values for any of the parameters, you must modify the group after creating it using ModifyDBClusterParameterGroup. Once you've created a DB cluster parameter group, you need to associate it with your DB cluster using ModifyDBCluster. When you associate a new DB cluster parameter group with a running DB cluster, you need to reboot the DB instances in the DB cluster without failover for the new DB cluster parameter group and associated settings to take effect.   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully complete the create action before the DB cluster parameter group is used as the default for a new DB cluster. This is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBClusterParameters action to verify that your DB cluster parameter group has been created or modified.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def createDBClusterParameterGroup(params: CreateDBClusterParameterGroupMessage): Request[CreateDBClusterParameterGroupResult, AWSError] = js.native
  def createDBClusterParameterGroup(
    params: CreateDBClusterParameterGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDBClusterParameterGroupResult, Unit]
  ): Request[CreateDBClusterParameterGroupResult, AWSError] = js.native
  
  /**
    * Creates a snapshot of a DB cluster. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def createDBClusterSnapshot(): Request[CreateDBClusterSnapshotResult, AWSError] = js.native
  def createDBClusterSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CreateDBClusterSnapshotResult, Unit]): Request[CreateDBClusterSnapshotResult, AWSError] = js.native
  /**
    * Creates a snapshot of a DB cluster. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def createDBClusterSnapshot(params: CreateDBClusterSnapshotMessage): Request[CreateDBClusterSnapshotResult, AWSError] = js.native
  def createDBClusterSnapshot(
    params: CreateDBClusterSnapshotMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDBClusterSnapshotResult, Unit]
  ): Request[CreateDBClusterSnapshotResult, AWSError] = js.native
  
  /**
    * Creates a new DB instance.
    */
  def createDBInstance(): Request[CreateDBInstanceResult, AWSError] = js.native
  def createDBInstance(callback: js.Function2[/* err */ AWSError, /* data */ CreateDBInstanceResult, Unit]): Request[CreateDBInstanceResult, AWSError] = js.native
  /**
    * Creates a new DB instance.
    */
  def createDBInstance(params: CreateDBInstanceMessage): Request[CreateDBInstanceResult, AWSError] = js.native
  def createDBInstance(
    params: CreateDBInstanceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDBInstanceResult, Unit]
  ): Request[CreateDBInstanceResult, AWSError] = js.native
  
  /**
    * Creates a new DB instance that acts as a read replica for an existing source DB instance. You can create a read replica for a DB instance running MySQL, MariaDB, Oracle, PostgreSQL, or SQL Server. For more information, see Working with Read Replicas in the Amazon RDS User Guide.  Amazon Aurora doesn't support this action. Call the CreateDBInstance action to create a DB instance for an Aurora DB cluster. All read replica DB instances are created with backups disabled. All other DB instance attributes (including DB security groups and DB parameter groups) are inherited from the source DB instance, except as specified.  Your source DB instance must have backup retention enabled.  
    */
  def createDBInstanceReadReplica(): Request[CreateDBInstanceReadReplicaResult, AWSError] = js.native
  def createDBInstanceReadReplica(callback: js.Function2[/* err */ AWSError, /* data */ CreateDBInstanceReadReplicaResult, Unit]): Request[CreateDBInstanceReadReplicaResult, AWSError] = js.native
  /**
    * Creates a new DB instance that acts as a read replica for an existing source DB instance. You can create a read replica for a DB instance running MySQL, MariaDB, Oracle, PostgreSQL, or SQL Server. For more information, see Working with Read Replicas in the Amazon RDS User Guide.  Amazon Aurora doesn't support this action. Call the CreateDBInstance action to create a DB instance for an Aurora DB cluster. All read replica DB instances are created with backups disabled. All other DB instance attributes (including DB security groups and DB parameter groups) are inherited from the source DB instance, except as specified.  Your source DB instance must have backup retention enabled.  
    */
  def createDBInstanceReadReplica(params: CreateDBInstanceReadReplicaMessage): Request[CreateDBInstanceReadReplicaResult, AWSError] = js.native
  def createDBInstanceReadReplica(
    params: CreateDBInstanceReadReplicaMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDBInstanceReadReplicaResult, Unit]
  ): Request[CreateDBInstanceReadReplicaResult, AWSError] = js.native
  
  /**
    * Creates a new DB parameter group.  A DB parameter group is initially created with the default parameters for the database engine used by the DB instance. To provide custom values for any of the parameters, you must modify the group after creating it using ModifyDBParameterGroup. Once you've created a DB parameter group, you need to associate it with your DB instance using ModifyDBInstance. When you associate a new DB parameter group with a running DB instance, you need to reboot the DB instance without failover for the new DB parameter group and associated settings to take effect.   After you create a DB parameter group, you should wait at least 5 minutes before creating your first DB instance that uses that DB parameter group as the default parameter group. This allows Amazon RDS to fully complete the create action before the parameter group is used as the default for a new DB instance. This is especially important for parameters that are critical when creating the default database for a DB instance, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBParameters command to verify that your DB parameter group has been created or modified. 
    */
  def createDBParameterGroup(): Request[CreateDBParameterGroupResult, AWSError] = js.native
  def createDBParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateDBParameterGroupResult, Unit]): Request[CreateDBParameterGroupResult, AWSError] = js.native
  /**
    * Creates a new DB parameter group.  A DB parameter group is initially created with the default parameters for the database engine used by the DB instance. To provide custom values for any of the parameters, you must modify the group after creating it using ModifyDBParameterGroup. Once you've created a DB parameter group, you need to associate it with your DB instance using ModifyDBInstance. When you associate a new DB parameter group with a running DB instance, you need to reboot the DB instance without failover for the new DB parameter group and associated settings to take effect.   After you create a DB parameter group, you should wait at least 5 minutes before creating your first DB instance that uses that DB parameter group as the default parameter group. This allows Amazon RDS to fully complete the create action before the parameter group is used as the default for a new DB instance. This is especially important for parameters that are critical when creating the default database for a DB instance, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBParameters command to verify that your DB parameter group has been created or modified. 
    */
  def createDBParameterGroup(params: CreateDBParameterGroupMessage): Request[CreateDBParameterGroupResult, AWSError] = js.native
  def createDBParameterGroup(
    params: CreateDBParameterGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDBParameterGroupResult, Unit]
  ): Request[CreateDBParameterGroupResult, AWSError] = js.native
  
  /**
    * Creates a new DB proxy.
    */
  def createDBProxy(): Request[CreateDBProxyResponse, AWSError] = js.native
  def createDBProxy(callback: js.Function2[/* err */ AWSError, /* data */ CreateDBProxyResponse, Unit]): Request[CreateDBProxyResponse, AWSError] = js.native
  /**
    * Creates a new DB proxy.
    */
  def createDBProxy(params: CreateDBProxyRequest): Request[CreateDBProxyResponse, AWSError] = js.native
  def createDBProxy(
    params: CreateDBProxyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDBProxyResponse, Unit]
  ): Request[CreateDBProxyResponse, AWSError] = js.native
  
  /**
    * Creates a new DB security group. DB security groups control access to a DB instance.  A DB security group controls access to EC2-Classic DB instances that are not in a VPC. 
    */
  def createDBSecurityGroup(): Request[CreateDBSecurityGroupResult, AWSError] = js.native
  def createDBSecurityGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateDBSecurityGroupResult, Unit]): Request[CreateDBSecurityGroupResult, AWSError] = js.native
  /**
    * Creates a new DB security group. DB security groups control access to a DB instance.  A DB security group controls access to EC2-Classic DB instances that are not in a VPC. 
    */
  def createDBSecurityGroup(params: CreateDBSecurityGroupMessage): Request[CreateDBSecurityGroupResult, AWSError] = js.native
  def createDBSecurityGroup(
    params: CreateDBSecurityGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDBSecurityGroupResult, Unit]
  ): Request[CreateDBSecurityGroupResult, AWSError] = js.native
  
  /**
    * Creates a snapshot of a DB instance. The source DB instance must be in the available or storage-optimizationstate.
    */
  def createDBSnapshot(): Request[CreateDBSnapshotResult, AWSError] = js.native
  def createDBSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CreateDBSnapshotResult, Unit]): Request[CreateDBSnapshotResult, AWSError] = js.native
  /**
    * Creates a snapshot of a DB instance. The source DB instance must be in the available or storage-optimizationstate.
    */
  def createDBSnapshot(params: CreateDBSnapshotMessage): Request[CreateDBSnapshotResult, AWSError] = js.native
  def createDBSnapshot(
    params: CreateDBSnapshotMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDBSnapshotResult, Unit]
  ): Request[CreateDBSnapshotResult, AWSError] = js.native
  
  /**
    * Creates a new DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS Region.
    */
  def createDBSubnetGroup(): Request[CreateDBSubnetGroupResult, AWSError] = js.native
  def createDBSubnetGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateDBSubnetGroupResult, Unit]): Request[CreateDBSubnetGroupResult, AWSError] = js.native
  /**
    * Creates a new DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS Region.
    */
  def createDBSubnetGroup(params: CreateDBSubnetGroupMessage): Request[CreateDBSubnetGroupResult, AWSError] = js.native
  def createDBSubnetGroup(
    params: CreateDBSubnetGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDBSubnetGroupResult, Unit]
  ): Request[CreateDBSubnetGroupResult, AWSError] = js.native
  
  /**
    * Creates an RDS event notification subscription. This action requires a topic Amazon Resource Name (ARN) created by either the RDS console, the SNS console, or the SNS API. To obtain an ARN with SNS, you must create a topic in Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS console. You can specify the type of source (SourceType) that you want to be notified of and provide a list of RDS sources (SourceIds) that triggers the events. You can also provide a list of event categories (EventCategories) for events that you want to be notified of. For example, you can specify SourceType = db-instance, SourceIds = mydbinstance1, mydbinstance2 and EventCategories = Availability, Backup. If you specify both the SourceType and SourceIds, such as SourceType = db-instance and SourceIdentifier = myDBInstance1, you are notified of all the db-instance events for the specified source. If you specify a SourceType but do not specify a SourceIdentifier, you receive notice of the events for that source type for all your RDS sources. If you don't specify either the SourceType or the SourceIdentifier, you are notified of events generated from all RDS sources belonging to your customer account.  RDS event notification is only available for unencrypted SNS topics. If you specify an encrypted SNS topic, event notifications aren't sent for the topic. 
    */
  def createEventSubscription(): Request[CreateEventSubscriptionResult, AWSError] = js.native
  def createEventSubscription(callback: js.Function2[/* err */ AWSError, /* data */ CreateEventSubscriptionResult, Unit]): Request[CreateEventSubscriptionResult, AWSError] = js.native
  /**
    * Creates an RDS event notification subscription. This action requires a topic Amazon Resource Name (ARN) created by either the RDS console, the SNS console, or the SNS API. To obtain an ARN with SNS, you must create a topic in Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS console. You can specify the type of source (SourceType) that you want to be notified of and provide a list of RDS sources (SourceIds) that triggers the events. You can also provide a list of event categories (EventCategories) for events that you want to be notified of. For example, you can specify SourceType = db-instance, SourceIds = mydbinstance1, mydbinstance2 and EventCategories = Availability, Backup. If you specify both the SourceType and SourceIds, such as SourceType = db-instance and SourceIdentifier = myDBInstance1, you are notified of all the db-instance events for the specified source. If you specify a SourceType but do not specify a SourceIdentifier, you receive notice of the events for that source type for all your RDS sources. If you don't specify either the SourceType or the SourceIdentifier, you are notified of events generated from all RDS sources belonging to your customer account.  RDS event notification is only available for unencrypted SNS topics. If you specify an encrypted SNS topic, event notifications aren't sent for the topic. 
    */
  def createEventSubscription(params: CreateEventSubscriptionMessage): Request[CreateEventSubscriptionResult, AWSError] = js.native
  def createEventSubscription(
    params: CreateEventSubscriptionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEventSubscriptionResult, Unit]
  ): Request[CreateEventSubscriptionResult, AWSError] = js.native
  
  /**
    *  Creates an Aurora global database spread across multiple AWS Regions. The global database contains a single primary cluster with read-write capability, and a read-only secondary cluster that receives data from the primary cluster through high-speed replication performed by the Aurora storage subsystem.   You can create a global database that is initially empty, and then add a primary cluster and a secondary cluster to it. Or you can specify an existing Aurora cluster during the create operation, and this cluster becomes the primary cluster of the global database.   This action only applies to Aurora DB clusters. 
    */
  def createGlobalCluster(): Request[CreateGlobalClusterResult, AWSError] = js.native
  def createGlobalCluster(callback: js.Function2[/* err */ AWSError, /* data */ CreateGlobalClusterResult, Unit]): Request[CreateGlobalClusterResult, AWSError] = js.native
  /**
    *  Creates an Aurora global database spread across multiple AWS Regions. The global database contains a single primary cluster with read-write capability, and a read-only secondary cluster that receives data from the primary cluster through high-speed replication performed by the Aurora storage subsystem.   You can create a global database that is initially empty, and then add a primary cluster and a secondary cluster to it. Or you can specify an existing Aurora cluster during the create operation, and this cluster becomes the primary cluster of the global database.   This action only applies to Aurora DB clusters. 
    */
  def createGlobalCluster(params: CreateGlobalClusterMessage): Request[CreateGlobalClusterResult, AWSError] = js.native
  def createGlobalCluster(
    params: CreateGlobalClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGlobalClusterResult, Unit]
  ): Request[CreateGlobalClusterResult, AWSError] = js.native
  
  /**
    * Creates a new option group. You can create up to 20 option groups.
    */
  def createOptionGroup(): Request[CreateOptionGroupResult, AWSError] = js.native
  def createOptionGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateOptionGroupResult, Unit]): Request[CreateOptionGroupResult, AWSError] = js.native
  /**
    * Creates a new option group. You can create up to 20 option groups.
    */
  def createOptionGroup(params: CreateOptionGroupMessage): Request[CreateOptionGroupResult, AWSError] = js.native
  def createOptionGroup(
    params: CreateOptionGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateOptionGroupResult, Unit]
  ): Request[CreateOptionGroupResult, AWSError] = js.native
  
  /**
    * Deletes a custom Availability Zone (AZ). A custom AZ is an on-premises AZ that is integrated with a VMware vSphere cluster. For more information about RDS on VMware, see the  RDS on VMware User Guide.  
    */
  def deleteCustomAvailabilityZone(): Request[DeleteCustomAvailabilityZoneResult, AWSError] = js.native
  def deleteCustomAvailabilityZone(callback: js.Function2[/* err */ AWSError, /* data */ DeleteCustomAvailabilityZoneResult, Unit]): Request[DeleteCustomAvailabilityZoneResult, AWSError] = js.native
  /**
    * Deletes a custom Availability Zone (AZ). A custom AZ is an on-premises AZ that is integrated with a VMware vSphere cluster. For more information about RDS on VMware, see the  RDS on VMware User Guide.  
    */
  def deleteCustomAvailabilityZone(params: DeleteCustomAvailabilityZoneMessage): Request[DeleteCustomAvailabilityZoneResult, AWSError] = js.native
  def deleteCustomAvailabilityZone(
    params: DeleteCustomAvailabilityZoneMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCustomAvailabilityZoneResult, Unit]
  ): Request[DeleteCustomAvailabilityZoneResult, AWSError] = js.native
  
  /**
    * The DeleteDBCluster action deletes a previously provisioned DB cluster. When you delete a DB cluster, all automated backups for that DB cluster are deleted and can't be recovered. Manual DB cluster snapshots of the specified DB cluster are not deleted.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def deleteDBCluster(): Request[DeleteDBClusterResult, AWSError] = js.native
  def deleteDBCluster(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDBClusterResult, Unit]): Request[DeleteDBClusterResult, AWSError] = js.native
  /**
    * The DeleteDBCluster action deletes a previously provisioned DB cluster. When you delete a DB cluster, all automated backups for that DB cluster are deleted and can't be recovered. Manual DB cluster snapshots of the specified DB cluster are not deleted.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def deleteDBCluster(params: DeleteDBClusterMessage): Request[DeleteDBClusterResult, AWSError] = js.native
  def deleteDBCluster(
    params: DeleteDBClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDBClusterResult, Unit]
  ): Request[DeleteDBClusterResult, AWSError] = js.native
  
  /**
    * Deletes a custom endpoint and removes it from an Amazon Aurora DB cluster.  This action only applies to Aurora DB clusters. 
    */
  def deleteDBClusterEndpoint(): Request[DBClusterEndpoint, AWSError] = js.native
  def deleteDBClusterEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ DBClusterEndpoint, Unit]): Request[DBClusterEndpoint, AWSError] = js.native
  /**
    * Deletes a custom endpoint and removes it from an Amazon Aurora DB cluster.  This action only applies to Aurora DB clusters. 
    */
  def deleteDBClusterEndpoint(params: DeleteDBClusterEndpointMessage): Request[DBClusterEndpoint, AWSError] = js.native
  def deleteDBClusterEndpoint(
    params: DeleteDBClusterEndpointMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBClusterEndpoint, Unit]
  ): Request[DBClusterEndpoint, AWSError] = js.native
  
  /**
    * Deletes a specified DB cluster parameter group. The DB cluster parameter group to be deleted can't be associated with any DB clusters. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def deleteDBClusterParameterGroup(): Request[js.Object, AWSError] = js.native
  def deleteDBClusterParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a specified DB cluster parameter group. The DB cluster parameter group to be deleted can't be associated with any DB clusters. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def deleteDBClusterParameterGroup(params: DeleteDBClusterParameterGroupMessage): Request[js.Object, AWSError] = js.native
  def deleteDBClusterParameterGroup(
    params: DeleteDBClusterParameterGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a DB cluster snapshot. If the snapshot is being copied, the copy operation is terminated.  The DB cluster snapshot must be in the available state to be deleted.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def deleteDBClusterSnapshot(): Request[DeleteDBClusterSnapshotResult, AWSError] = js.native
  def deleteDBClusterSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDBClusterSnapshotResult, Unit]): Request[DeleteDBClusterSnapshotResult, AWSError] = js.native
  /**
    * Deletes a DB cluster snapshot. If the snapshot is being copied, the copy operation is terminated.  The DB cluster snapshot must be in the available state to be deleted.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def deleteDBClusterSnapshot(params: DeleteDBClusterSnapshotMessage): Request[DeleteDBClusterSnapshotResult, AWSError] = js.native
  def deleteDBClusterSnapshot(
    params: DeleteDBClusterSnapshotMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDBClusterSnapshotResult, Unit]
  ): Request[DeleteDBClusterSnapshotResult, AWSError] = js.native
  
  /**
    * The DeleteDBInstance action deletes a previously provisioned DB instance. When you delete a DB instance, all automated backups for that instance are deleted and can't be recovered. Manual DB snapshots of the DB instance to be deleted by DeleteDBInstance are not deleted.  If you request a final DB snapshot the status of the Amazon RDS DB instance is deleting until the DB snapshot is created. The API action DescribeDBInstance is used to monitor the status of this operation. The action can't be canceled or reverted once submitted.  When a DB instance is in a failure state and has a status of failed, incompatible-restore, or incompatible-network, you can only delete it when you skip creation of the final snapshot with the SkipFinalSnapshot parameter. If the specified DB instance is part of an Amazon Aurora DB cluster, you can't delete the DB instance if both of the following conditions are true:   The DB cluster is a read replica of another Amazon Aurora DB cluster.   The DB instance is the only instance in the DB cluster.   To delete a DB instance in this case, first call the PromoteReadReplicaDBCluster API action to promote the DB cluster so it's no longer a read replica. After the promotion completes, then call the DeleteDBInstance API action to delete the final instance in the DB cluster.
    */
  def deleteDBInstance(): Request[DeleteDBInstanceResult, AWSError] = js.native
  def deleteDBInstance(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDBInstanceResult, Unit]): Request[DeleteDBInstanceResult, AWSError] = js.native
  /**
    * The DeleteDBInstance action deletes a previously provisioned DB instance. When you delete a DB instance, all automated backups for that instance are deleted and can't be recovered. Manual DB snapshots of the DB instance to be deleted by DeleteDBInstance are not deleted.  If you request a final DB snapshot the status of the Amazon RDS DB instance is deleting until the DB snapshot is created. The API action DescribeDBInstance is used to monitor the status of this operation. The action can't be canceled or reverted once submitted.  When a DB instance is in a failure state and has a status of failed, incompatible-restore, or incompatible-network, you can only delete it when you skip creation of the final snapshot with the SkipFinalSnapshot parameter. If the specified DB instance is part of an Amazon Aurora DB cluster, you can't delete the DB instance if both of the following conditions are true:   The DB cluster is a read replica of another Amazon Aurora DB cluster.   The DB instance is the only instance in the DB cluster.   To delete a DB instance in this case, first call the PromoteReadReplicaDBCluster API action to promote the DB cluster so it's no longer a read replica. After the promotion completes, then call the DeleteDBInstance API action to delete the final instance in the DB cluster.
    */
  def deleteDBInstance(params: DeleteDBInstanceMessage): Request[DeleteDBInstanceResult, AWSError] = js.native
  def deleteDBInstance(
    params: DeleteDBInstanceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDBInstanceResult, Unit]
  ): Request[DeleteDBInstanceResult, AWSError] = js.native
  
  /**
    * Deletes automated backups based on the source instance's DbiResourceId value or the restorable instance's resource ID.
    */
  def deleteDBInstanceAutomatedBackup(): Request[DeleteDBInstanceAutomatedBackupResult, AWSError] = js.native
  def deleteDBInstanceAutomatedBackup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDBInstanceAutomatedBackupResult, Unit]): Request[DeleteDBInstanceAutomatedBackupResult, AWSError] = js.native
  /**
    * Deletes automated backups based on the source instance's DbiResourceId value or the restorable instance's resource ID.
    */
  def deleteDBInstanceAutomatedBackup(params: DeleteDBInstanceAutomatedBackupMessage): Request[DeleteDBInstanceAutomatedBackupResult, AWSError] = js.native
  def deleteDBInstanceAutomatedBackup(
    params: DeleteDBInstanceAutomatedBackupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDBInstanceAutomatedBackupResult, Unit]
  ): Request[DeleteDBInstanceAutomatedBackupResult, AWSError] = js.native
  
  /**
    * Deletes a specified DB parameter group. The DB parameter group to be deleted can't be associated with any DB instances.
    */
  def deleteDBParameterGroup(): Request[js.Object, AWSError] = js.native
  def deleteDBParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a specified DB parameter group. The DB parameter group to be deleted can't be associated with any DB instances.
    */
  def deleteDBParameterGroup(params: DeleteDBParameterGroupMessage): Request[js.Object, AWSError] = js.native
  def deleteDBParameterGroup(
    params: DeleteDBParameterGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an existing proxy.
    */
  def deleteDBProxy(): Request[DeleteDBProxyResponse, AWSError] = js.native
  def deleteDBProxy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDBProxyResponse, Unit]): Request[DeleteDBProxyResponse, AWSError] = js.native
  /**
    * Deletes an existing proxy.
    */
  def deleteDBProxy(params: DeleteDBProxyRequest): Request[DeleteDBProxyResponse, AWSError] = js.native
  def deleteDBProxy(
    params: DeleteDBProxyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDBProxyResponse, Unit]
  ): Request[DeleteDBProxyResponse, AWSError] = js.native
  
  /**
    * Deletes a DB security group.  The specified DB security group must not be associated with any DB instances. 
    */
  def deleteDBSecurityGroup(): Request[js.Object, AWSError] = js.native
  def deleteDBSecurityGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a DB security group.  The specified DB security group must not be associated with any DB instances. 
    */
  def deleteDBSecurityGroup(params: DeleteDBSecurityGroupMessage): Request[js.Object, AWSError] = js.native
  def deleteDBSecurityGroup(
    params: DeleteDBSecurityGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a DB snapshot. If the snapshot is being copied, the copy operation is terminated.  The DB snapshot must be in the available state to be deleted. 
    */
  def deleteDBSnapshot(): Request[DeleteDBSnapshotResult, AWSError] = js.native
  def deleteDBSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDBSnapshotResult, Unit]): Request[DeleteDBSnapshotResult, AWSError] = js.native
  /**
    * Deletes a DB snapshot. If the snapshot is being copied, the copy operation is terminated.  The DB snapshot must be in the available state to be deleted. 
    */
  def deleteDBSnapshot(params: DeleteDBSnapshotMessage): Request[DeleteDBSnapshotResult, AWSError] = js.native
  def deleteDBSnapshot(
    params: DeleteDBSnapshotMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDBSnapshotResult, Unit]
  ): Request[DeleteDBSnapshotResult, AWSError] = js.native
  
  /**
    * Deletes a DB subnet group.  The specified database subnet group must not be associated with any DB instances. 
    */
  def deleteDBSubnetGroup(): Request[js.Object, AWSError] = js.native
  def deleteDBSubnetGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a DB subnet group.  The specified database subnet group must not be associated with any DB instances. 
    */
  def deleteDBSubnetGroup(params: DeleteDBSubnetGroupMessage): Request[js.Object, AWSError] = js.native
  def deleteDBSubnetGroup(
    params: DeleteDBSubnetGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an RDS event notification subscription.
    */
  def deleteEventSubscription(): Request[DeleteEventSubscriptionResult, AWSError] = js.native
  def deleteEventSubscription(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEventSubscriptionResult, Unit]): Request[DeleteEventSubscriptionResult, AWSError] = js.native
  /**
    * Deletes an RDS event notification subscription.
    */
  def deleteEventSubscription(params: DeleteEventSubscriptionMessage): Request[DeleteEventSubscriptionResult, AWSError] = js.native
  def deleteEventSubscription(
    params: DeleteEventSubscriptionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEventSubscriptionResult, Unit]
  ): Request[DeleteEventSubscriptionResult, AWSError] = js.native
  
  /**
    *  Deletes a global database cluster. The primary and secondary clusters must already be detached or destroyed first.   This action only applies to Aurora DB clusters. 
    */
  def deleteGlobalCluster(): Request[DeleteGlobalClusterResult, AWSError] = js.native
  def deleteGlobalCluster(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGlobalClusterResult, Unit]): Request[DeleteGlobalClusterResult, AWSError] = js.native
  /**
    *  Deletes a global database cluster. The primary and secondary clusters must already be detached or destroyed first.   This action only applies to Aurora DB clusters. 
    */
  def deleteGlobalCluster(params: DeleteGlobalClusterMessage): Request[DeleteGlobalClusterResult, AWSError] = js.native
  def deleteGlobalCluster(
    params: DeleteGlobalClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGlobalClusterResult, Unit]
  ): Request[DeleteGlobalClusterResult, AWSError] = js.native
  
  /**
    * Deletes the installation medium for a DB engine that requires an on-premises customer provided license, such as Microsoft SQL Server.
    */
  def deleteInstallationMedia(): Request[InstallationMedia, AWSError] = js.native
  def deleteInstallationMedia(callback: js.Function2[/* err */ AWSError, /* data */ InstallationMedia, Unit]): Request[InstallationMedia, AWSError] = js.native
  /**
    * Deletes the installation medium for a DB engine that requires an on-premises customer provided license, such as Microsoft SQL Server.
    */
  def deleteInstallationMedia(params: DeleteInstallationMediaMessage): Request[InstallationMedia, AWSError] = js.native
  def deleteInstallationMedia(
    params: DeleteInstallationMediaMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ InstallationMedia, Unit]
  ): Request[InstallationMedia, AWSError] = js.native
  
  /**
    * Deletes an existing option group.
    */
  def deleteOptionGroup(): Request[js.Object, AWSError] = js.native
  def deleteOptionGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an existing option group.
    */
  def deleteOptionGroup(params: DeleteOptionGroupMessage): Request[js.Object, AWSError] = js.native
  def deleteOptionGroup(
    params: DeleteOptionGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Remove the association between one or more DBProxyTarget data structures and a DBProxyTargetGroup.
    */
  def deregisterDBProxyTargets(): Request[DeregisterDBProxyTargetsResponse, AWSError] = js.native
  def deregisterDBProxyTargets(callback: js.Function2[/* err */ AWSError, /* data */ DeregisterDBProxyTargetsResponse, Unit]): Request[DeregisterDBProxyTargetsResponse, AWSError] = js.native
  /**
    * Remove the association between one or more DBProxyTarget data structures and a DBProxyTargetGroup.
    */
  def deregisterDBProxyTargets(params: DeregisterDBProxyTargetsRequest): Request[DeregisterDBProxyTargetsResponse, AWSError] = js.native
  def deregisterDBProxyTargets(
    params: DeregisterDBProxyTargetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterDBProxyTargetsResponse, Unit]
  ): Request[DeregisterDBProxyTargetsResponse, AWSError] = js.native
  
  /**
    * Lists all of the attributes for a customer account. The attributes include Amazon RDS quotas for the account, such as the number of DB instances allowed. The description for a quota includes the quota name, current usage toward that quota, and the quota's maximum value. This command doesn't take any parameters.
    */
  def describeAccountAttributes(): Request[AccountAttributesMessage, AWSError] = js.native
  def describeAccountAttributes(callback: js.Function2[/* err */ AWSError, /* data */ AccountAttributesMessage, Unit]): Request[AccountAttributesMessage, AWSError] = js.native
  /**
    * Lists all of the attributes for a customer account. The attributes include Amazon RDS quotas for the account, such as the number of DB instances allowed. The description for a quota includes the quota name, current usage toward that quota, and the quota's maximum value. This command doesn't take any parameters.
    */
  def describeAccountAttributes(params: DescribeAccountAttributesMessage): Request[AccountAttributesMessage, AWSError] = js.native
  def describeAccountAttributes(
    params: DescribeAccountAttributesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ AccountAttributesMessage, Unit]
  ): Request[AccountAttributesMessage, AWSError] = js.native
  
  /**
    * Lists the set of CA certificates provided by Amazon RDS for this AWS account.
    */
  def describeCertificates(): Request[CertificateMessage, AWSError] = js.native
  def describeCertificates(callback: js.Function2[/* err */ AWSError, /* data */ CertificateMessage, Unit]): Request[CertificateMessage, AWSError] = js.native
  /**
    * Lists the set of CA certificates provided by Amazon RDS for this AWS account.
    */
  def describeCertificates(params: DescribeCertificatesMessage): Request[CertificateMessage, AWSError] = js.native
  def describeCertificates(
    params: DescribeCertificatesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CertificateMessage, Unit]
  ): Request[CertificateMessage, AWSError] = js.native
  
  /**
    * Returns information about custom Availability Zones (AZs). A custom AZ is an on-premises AZ that is integrated with a VMware vSphere cluster. For more information about RDS on VMware, see the  RDS on VMware User Guide.  
    */
  def describeCustomAvailabilityZones(): Request[CustomAvailabilityZoneMessage, AWSError] = js.native
  def describeCustomAvailabilityZones(callback: js.Function2[/* err */ AWSError, /* data */ CustomAvailabilityZoneMessage, Unit]): Request[CustomAvailabilityZoneMessage, AWSError] = js.native
  /**
    * Returns information about custom Availability Zones (AZs). A custom AZ is an on-premises AZ that is integrated with a VMware vSphere cluster. For more information about RDS on VMware, see the  RDS on VMware User Guide.  
    */
  def describeCustomAvailabilityZones(params: DescribeCustomAvailabilityZonesMessage): Request[CustomAvailabilityZoneMessage, AWSError] = js.native
  def describeCustomAvailabilityZones(
    params: DescribeCustomAvailabilityZonesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CustomAvailabilityZoneMessage, Unit]
  ): Request[CustomAvailabilityZoneMessage, AWSError] = js.native
  
  /**
    * Returns information about backtracks for a DB cluster. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora MySQL DB clusters. 
    */
  def describeDBClusterBacktracks(): Request[DBClusterBacktrackMessage, AWSError] = js.native
  def describeDBClusterBacktracks(callback: js.Function2[/* err */ AWSError, /* data */ DBClusterBacktrackMessage, Unit]): Request[DBClusterBacktrackMessage, AWSError] = js.native
  /**
    * Returns information about backtracks for a DB cluster. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora MySQL DB clusters. 
    */
  def describeDBClusterBacktracks(params: DescribeDBClusterBacktracksMessage): Request[DBClusterBacktrackMessage, AWSError] = js.native
  def describeDBClusterBacktracks(
    params: DescribeDBClusterBacktracksMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBClusterBacktrackMessage, Unit]
  ): Request[DBClusterBacktrackMessage, AWSError] = js.native
  
  /**
    * Returns information about endpoints for an Amazon Aurora DB cluster.  This action only applies to Aurora DB clusters. 
    */
  def describeDBClusterEndpoints(): Request[DBClusterEndpointMessage, AWSError] = js.native
  def describeDBClusterEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ DBClusterEndpointMessage, Unit]): Request[DBClusterEndpointMessage, AWSError] = js.native
  /**
    * Returns information about endpoints for an Amazon Aurora DB cluster.  This action only applies to Aurora DB clusters. 
    */
  def describeDBClusterEndpoints(params: DescribeDBClusterEndpointsMessage): Request[DBClusterEndpointMessage, AWSError] = js.native
  def describeDBClusterEndpoints(
    params: DescribeDBClusterEndpointsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBClusterEndpointMessage, Unit]
  ): Request[DBClusterEndpointMessage, AWSError] = js.native
  
  /**
    *  Returns a list of DBClusterParameterGroup descriptions. If a DBClusterParameterGroupName parameter is specified, the list will contain only the description of the specified DB cluster parameter group.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def describeDBClusterParameterGroups(): Request[DBClusterParameterGroupsMessage, AWSError] = js.native
  def describeDBClusterParameterGroups(callback: js.Function2[/* err */ AWSError, /* data */ DBClusterParameterGroupsMessage, Unit]): Request[DBClusterParameterGroupsMessage, AWSError] = js.native
  /**
    *  Returns a list of DBClusterParameterGroup descriptions. If a DBClusterParameterGroupName parameter is specified, the list will contain only the description of the specified DB cluster parameter group.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def describeDBClusterParameterGroups(params: DescribeDBClusterParameterGroupsMessage): Request[DBClusterParameterGroupsMessage, AWSError] = js.native
  def describeDBClusterParameterGroups(
    params: DescribeDBClusterParameterGroupsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBClusterParameterGroupsMessage, Unit]
  ): Request[DBClusterParameterGroupsMessage, AWSError] = js.native
  
  /**
    * Returns the detailed parameter list for a particular DB cluster parameter group. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def describeDBClusterParameters(): Request[DBClusterParameterGroupDetails, AWSError] = js.native
  def describeDBClusterParameters(callback: js.Function2[/* err */ AWSError, /* data */ DBClusterParameterGroupDetails, Unit]): Request[DBClusterParameterGroupDetails, AWSError] = js.native
  /**
    * Returns the detailed parameter list for a particular DB cluster parameter group. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def describeDBClusterParameters(params: DescribeDBClusterParametersMessage): Request[DBClusterParameterGroupDetails, AWSError] = js.native
  def describeDBClusterParameters(
    params: DescribeDBClusterParametersMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBClusterParameterGroupDetails, Unit]
  ): Request[DBClusterParameterGroupDetails, AWSError] = js.native
  
  /**
    * Returns a list of DB cluster snapshot attribute names and values for a manual DB cluster snapshot. When sharing snapshots with other AWS accounts, DescribeDBClusterSnapshotAttributes returns the restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the manual DB cluster snapshot. If all is included in the list of values for the restore attribute, then the manual DB cluster snapshot is public and can be copied or restored by all AWS accounts. To add or remove access for an AWS account to copy or restore a manual DB cluster snapshot, or to make the manual DB cluster snapshot public or private, use the ModifyDBClusterSnapshotAttribute API action.  This action only applies to Aurora DB clusters. 
    */
  def describeDBClusterSnapshotAttributes(): Request[DescribeDBClusterSnapshotAttributesResult, AWSError] = js.native
  def describeDBClusterSnapshotAttributes(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDBClusterSnapshotAttributesResult, Unit]
  ): Request[DescribeDBClusterSnapshotAttributesResult, AWSError] = js.native
  /**
    * Returns a list of DB cluster snapshot attribute names and values for a manual DB cluster snapshot. When sharing snapshots with other AWS accounts, DescribeDBClusterSnapshotAttributes returns the restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the manual DB cluster snapshot. If all is included in the list of values for the restore attribute, then the manual DB cluster snapshot is public and can be copied or restored by all AWS accounts. To add or remove access for an AWS account to copy or restore a manual DB cluster snapshot, or to make the manual DB cluster snapshot public or private, use the ModifyDBClusterSnapshotAttribute API action.  This action only applies to Aurora DB clusters. 
    */
  def describeDBClusterSnapshotAttributes(params: DescribeDBClusterSnapshotAttributesMessage): Request[DescribeDBClusterSnapshotAttributesResult, AWSError] = js.native
  def describeDBClusterSnapshotAttributes(
    params: DescribeDBClusterSnapshotAttributesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDBClusterSnapshotAttributesResult, Unit]
  ): Request[DescribeDBClusterSnapshotAttributesResult, AWSError] = js.native
  
  /**
    * Returns information about DB cluster snapshots. This API action supports pagination. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def describeDBClusterSnapshots(): Request[DBClusterSnapshotMessage, AWSError] = js.native
  def describeDBClusterSnapshots(callback: js.Function2[/* err */ AWSError, /* data */ DBClusterSnapshotMessage, Unit]): Request[DBClusterSnapshotMessage, AWSError] = js.native
  /**
    * Returns information about DB cluster snapshots. This API action supports pagination. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def describeDBClusterSnapshots(params: DescribeDBClusterSnapshotsMessage): Request[DBClusterSnapshotMessage, AWSError] = js.native
  def describeDBClusterSnapshots(
    params: DescribeDBClusterSnapshotsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBClusterSnapshotMessage, Unit]
  ): Request[DBClusterSnapshotMessage, AWSError] = js.native
  
  /**
    * Returns information about provisioned Aurora DB clusters. This API supports pagination. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This operation can also return information for Amazon Neptune DB instances and Amazon DocumentDB instances. 
    */
  def describeDBClusters(): Request[DBClusterMessage, AWSError] = js.native
  def describeDBClusters(callback: js.Function2[/* err */ AWSError, /* data */ DBClusterMessage, Unit]): Request[DBClusterMessage, AWSError] = js.native
  /**
    * Returns information about provisioned Aurora DB clusters. This API supports pagination. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This operation can also return information for Amazon Neptune DB instances and Amazon DocumentDB instances. 
    */
  def describeDBClusters(params: DescribeDBClustersMessage): Request[DBClusterMessage, AWSError] = js.native
  def describeDBClusters(
    params: DescribeDBClustersMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBClusterMessage, Unit]
  ): Request[DBClusterMessage, AWSError] = js.native
  
  /**
    * Returns a list of the available DB engines.
    */
  def describeDBEngineVersions(): Request[DBEngineVersionMessage, AWSError] = js.native
  def describeDBEngineVersions(callback: js.Function2[/* err */ AWSError, /* data */ DBEngineVersionMessage, Unit]): Request[DBEngineVersionMessage, AWSError] = js.native
  /**
    * Returns a list of the available DB engines.
    */
  def describeDBEngineVersions(params: DescribeDBEngineVersionsMessage): Request[DBEngineVersionMessage, AWSError] = js.native
  def describeDBEngineVersions(
    params: DescribeDBEngineVersionsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBEngineVersionMessage, Unit]
  ): Request[DBEngineVersionMessage, AWSError] = js.native
  
  /**
    * Displays backups for both current and deleted instances. For example, use this operation to find details about automated backups for previously deleted instances. Current instances with retention periods greater than zero (0) are returned for both the DescribeDBInstanceAutomatedBackups and DescribeDBInstances operations. All parameters are optional.
    */
  def describeDBInstanceAutomatedBackups(): Request[DBInstanceAutomatedBackupMessage, AWSError] = js.native
  def describeDBInstanceAutomatedBackups(callback: js.Function2[/* err */ AWSError, /* data */ DBInstanceAutomatedBackupMessage, Unit]): Request[DBInstanceAutomatedBackupMessage, AWSError] = js.native
  /**
    * Displays backups for both current and deleted instances. For example, use this operation to find details about automated backups for previously deleted instances. Current instances with retention periods greater than zero (0) are returned for both the DescribeDBInstanceAutomatedBackups and DescribeDBInstances operations. All parameters are optional.
    */
  def describeDBInstanceAutomatedBackups(params: DescribeDBInstanceAutomatedBackupsMessage): Request[DBInstanceAutomatedBackupMessage, AWSError] = js.native
  def describeDBInstanceAutomatedBackups(
    params: DescribeDBInstanceAutomatedBackupsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBInstanceAutomatedBackupMessage, Unit]
  ): Request[DBInstanceAutomatedBackupMessage, AWSError] = js.native
  
  /**
    * Returns information about provisioned RDS instances. This API supports pagination.  This operation can also return information for Amazon Neptune DB instances and Amazon DocumentDB instances. 
    */
  def describeDBInstances(): Request[DBInstanceMessage, AWSError] = js.native
  def describeDBInstances(callback: js.Function2[/* err */ AWSError, /* data */ DBInstanceMessage, Unit]): Request[DBInstanceMessage, AWSError] = js.native
  /**
    * Returns information about provisioned RDS instances. This API supports pagination.  This operation can also return information for Amazon Neptune DB instances and Amazon DocumentDB instances. 
    */
  def describeDBInstances(params: DescribeDBInstancesMessage): Request[DBInstanceMessage, AWSError] = js.native
  def describeDBInstances(
    params: DescribeDBInstancesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBInstanceMessage, Unit]
  ): Request[DBInstanceMessage, AWSError] = js.native
  
  /**
    * Returns a list of DB log files for the DB instance.
    */
  def describeDBLogFiles(): Request[DescribeDBLogFilesResponse, AWSError] = js.native
  def describeDBLogFiles(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDBLogFilesResponse, Unit]): Request[DescribeDBLogFilesResponse, AWSError] = js.native
  /**
    * Returns a list of DB log files for the DB instance.
    */
  def describeDBLogFiles(params: DescribeDBLogFilesMessage): Request[DescribeDBLogFilesResponse, AWSError] = js.native
  def describeDBLogFiles(
    params: DescribeDBLogFilesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDBLogFilesResponse, Unit]
  ): Request[DescribeDBLogFilesResponse, AWSError] = js.native
  
  /**
    *  Returns a list of DBParameterGroup descriptions. If a DBParameterGroupName is specified, the list will contain only the description of the specified DB parameter group. 
    */
  def describeDBParameterGroups(): Request[DBParameterGroupsMessage, AWSError] = js.native
  def describeDBParameterGroups(callback: js.Function2[/* err */ AWSError, /* data */ DBParameterGroupsMessage, Unit]): Request[DBParameterGroupsMessage, AWSError] = js.native
  /**
    *  Returns a list of DBParameterGroup descriptions. If a DBParameterGroupName is specified, the list will contain only the description of the specified DB parameter group. 
    */
  def describeDBParameterGroups(params: DescribeDBParameterGroupsMessage): Request[DBParameterGroupsMessage, AWSError] = js.native
  def describeDBParameterGroups(
    params: DescribeDBParameterGroupsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBParameterGroupsMessage, Unit]
  ): Request[DBParameterGroupsMessage, AWSError] = js.native
  
  /**
    * Returns the detailed parameter list for a particular DB parameter group.
    */
  def describeDBParameters(): Request[DBParameterGroupDetails, AWSError] = js.native
  def describeDBParameters(callback: js.Function2[/* err */ AWSError, /* data */ DBParameterGroupDetails, Unit]): Request[DBParameterGroupDetails, AWSError] = js.native
  /**
    * Returns the detailed parameter list for a particular DB parameter group.
    */
  def describeDBParameters(params: DescribeDBParametersMessage): Request[DBParameterGroupDetails, AWSError] = js.native
  def describeDBParameters(
    params: DescribeDBParametersMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBParameterGroupDetails, Unit]
  ): Request[DBParameterGroupDetails, AWSError] = js.native
  
  /**
    * Returns information about DB proxies.
    */
  def describeDBProxies(): Request[DescribeDBProxiesResponse, AWSError] = js.native
  def describeDBProxies(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDBProxiesResponse, Unit]): Request[DescribeDBProxiesResponse, AWSError] = js.native
  /**
    * Returns information about DB proxies.
    */
  def describeDBProxies(params: DescribeDBProxiesRequest): Request[DescribeDBProxiesResponse, AWSError] = js.native
  def describeDBProxies(
    params: DescribeDBProxiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDBProxiesResponse, Unit]
  ): Request[DescribeDBProxiesResponse, AWSError] = js.native
  
  /**
    * Returns information about DB proxy target groups, represented by DBProxyTargetGroup data structures.
    */
  def describeDBProxyTargetGroups(): Request[DescribeDBProxyTargetGroupsResponse, AWSError] = js.native
  def describeDBProxyTargetGroups(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDBProxyTargetGroupsResponse, Unit]): Request[DescribeDBProxyTargetGroupsResponse, AWSError] = js.native
  /**
    * Returns information about DB proxy target groups, represented by DBProxyTargetGroup data structures.
    */
  def describeDBProxyTargetGroups(params: DescribeDBProxyTargetGroupsRequest): Request[DescribeDBProxyTargetGroupsResponse, AWSError] = js.native
  def describeDBProxyTargetGroups(
    params: DescribeDBProxyTargetGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDBProxyTargetGroupsResponse, Unit]
  ): Request[DescribeDBProxyTargetGroupsResponse, AWSError] = js.native
  
  /**
    * Returns information about DBProxyTarget objects. This API supports pagination.
    */
  def describeDBProxyTargets(): Request[DescribeDBProxyTargetsResponse, AWSError] = js.native
  def describeDBProxyTargets(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDBProxyTargetsResponse, Unit]): Request[DescribeDBProxyTargetsResponse, AWSError] = js.native
  /**
    * Returns information about DBProxyTarget objects. This API supports pagination.
    */
  def describeDBProxyTargets(params: DescribeDBProxyTargetsRequest): Request[DescribeDBProxyTargetsResponse, AWSError] = js.native
  def describeDBProxyTargets(
    params: DescribeDBProxyTargetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDBProxyTargetsResponse, Unit]
  ): Request[DescribeDBProxyTargetsResponse, AWSError] = js.native
  
  /**
    *  Returns a list of DBSecurityGroup descriptions. If a DBSecurityGroupName is specified, the list will contain only the descriptions of the specified DB security group. 
    */
  def describeDBSecurityGroups(): Request[DBSecurityGroupMessage, AWSError] = js.native
  def describeDBSecurityGroups(callback: js.Function2[/* err */ AWSError, /* data */ DBSecurityGroupMessage, Unit]): Request[DBSecurityGroupMessage, AWSError] = js.native
  /**
    *  Returns a list of DBSecurityGroup descriptions. If a DBSecurityGroupName is specified, the list will contain only the descriptions of the specified DB security group. 
    */
  def describeDBSecurityGroups(params: DescribeDBSecurityGroupsMessage): Request[DBSecurityGroupMessage, AWSError] = js.native
  def describeDBSecurityGroups(
    params: DescribeDBSecurityGroupsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBSecurityGroupMessage, Unit]
  ): Request[DBSecurityGroupMessage, AWSError] = js.native
  
  /**
    * Returns a list of DB snapshot attribute names and values for a manual DB snapshot. When sharing snapshots with other AWS accounts, DescribeDBSnapshotAttributes returns the restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the manual DB snapshot. If all is included in the list of values for the restore attribute, then the manual DB snapshot is public and can be copied or restored by all AWS accounts. To add or remove access for an AWS account to copy or restore a manual DB snapshot, or to make the manual DB snapshot public or private, use the ModifyDBSnapshotAttribute API action.
    */
  def describeDBSnapshotAttributes(): Request[DescribeDBSnapshotAttributesResult, AWSError] = js.native
  def describeDBSnapshotAttributes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDBSnapshotAttributesResult, Unit]): Request[DescribeDBSnapshotAttributesResult, AWSError] = js.native
  /**
    * Returns a list of DB snapshot attribute names and values for a manual DB snapshot. When sharing snapshots with other AWS accounts, DescribeDBSnapshotAttributes returns the restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the manual DB snapshot. If all is included in the list of values for the restore attribute, then the manual DB snapshot is public and can be copied or restored by all AWS accounts. To add or remove access for an AWS account to copy or restore a manual DB snapshot, or to make the manual DB snapshot public or private, use the ModifyDBSnapshotAttribute API action.
    */
  def describeDBSnapshotAttributes(params: DescribeDBSnapshotAttributesMessage): Request[DescribeDBSnapshotAttributesResult, AWSError] = js.native
  def describeDBSnapshotAttributes(
    params: DescribeDBSnapshotAttributesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDBSnapshotAttributesResult, Unit]
  ): Request[DescribeDBSnapshotAttributesResult, AWSError] = js.native
  
  /**
    * Returns information about DB snapshots. This API action supports pagination.
    */
  def describeDBSnapshots(): Request[DBSnapshotMessage, AWSError] = js.native
  def describeDBSnapshots(callback: js.Function2[/* err */ AWSError, /* data */ DBSnapshotMessage, Unit]): Request[DBSnapshotMessage, AWSError] = js.native
  /**
    * Returns information about DB snapshots. This API action supports pagination.
    */
  def describeDBSnapshots(params: DescribeDBSnapshotsMessage): Request[DBSnapshotMessage, AWSError] = js.native
  def describeDBSnapshots(
    params: DescribeDBSnapshotsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBSnapshotMessage, Unit]
  ): Request[DBSnapshotMessage, AWSError] = js.native
  
  /**
    * Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName is specified, the list will contain only the descriptions of the specified DBSubnetGroup. For an overview of CIDR ranges, go to the Wikipedia Tutorial. 
    */
  def describeDBSubnetGroups(): Request[DBSubnetGroupMessage, AWSError] = js.native
  def describeDBSubnetGroups(callback: js.Function2[/* err */ AWSError, /* data */ DBSubnetGroupMessage, Unit]): Request[DBSubnetGroupMessage, AWSError] = js.native
  /**
    * Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName is specified, the list will contain only the descriptions of the specified DBSubnetGroup. For an overview of CIDR ranges, go to the Wikipedia Tutorial. 
    */
  def describeDBSubnetGroups(params: DescribeDBSubnetGroupsMessage): Request[DBSubnetGroupMessage, AWSError] = js.native
  def describeDBSubnetGroups(
    params: DescribeDBSubnetGroupsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBSubnetGroupMessage, Unit]
  ): Request[DBSubnetGroupMessage, AWSError] = js.native
  
  /**
    * Returns the default engine and system parameter information for the cluster database engine. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def describeEngineDefaultClusterParameters(): Request[DescribeEngineDefaultClusterParametersResult, AWSError] = js.native
  def describeEngineDefaultClusterParameters(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEngineDefaultClusterParametersResult, Unit]
  ): Request[DescribeEngineDefaultClusterParametersResult, AWSError] = js.native
  /**
    * Returns the default engine and system parameter information for the cluster database engine. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def describeEngineDefaultClusterParameters(params: DescribeEngineDefaultClusterParametersMessage): Request[DescribeEngineDefaultClusterParametersResult, AWSError] = js.native
  def describeEngineDefaultClusterParameters(
    params: DescribeEngineDefaultClusterParametersMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEngineDefaultClusterParametersResult, Unit]
  ): Request[DescribeEngineDefaultClusterParametersResult, AWSError] = js.native
  
  /**
    * Returns the default engine and system parameter information for the specified database engine.
    */
  def describeEngineDefaultParameters(): Request[DescribeEngineDefaultParametersResult, AWSError] = js.native
  def describeEngineDefaultParameters(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEngineDefaultParametersResult, Unit]): Request[DescribeEngineDefaultParametersResult, AWSError] = js.native
  /**
    * Returns the default engine and system parameter information for the specified database engine.
    */
  def describeEngineDefaultParameters(params: DescribeEngineDefaultParametersMessage): Request[DescribeEngineDefaultParametersResult, AWSError] = js.native
  def describeEngineDefaultParameters(
    params: DescribeEngineDefaultParametersMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEngineDefaultParametersResult, Unit]
  ): Request[DescribeEngineDefaultParametersResult, AWSError] = js.native
  
  /**
    * Displays a list of categories for all event source types, or, if specified, for a specified source type. You can see a list of the event categories and source types in  Events in the Amazon RDS User Guide. 
    */
  def describeEventCategories(): Request[EventCategoriesMessage, AWSError] = js.native
  def describeEventCategories(callback: js.Function2[/* err */ AWSError, /* data */ EventCategoriesMessage, Unit]): Request[EventCategoriesMessage, AWSError] = js.native
  /**
    * Displays a list of categories for all event source types, or, if specified, for a specified source type. You can see a list of the event categories and source types in  Events in the Amazon RDS User Guide. 
    */
  def describeEventCategories(params: DescribeEventCategoriesMessage): Request[EventCategoriesMessage, AWSError] = js.native
  def describeEventCategories(
    params: DescribeEventCategoriesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ EventCategoriesMessage, Unit]
  ): Request[EventCategoriesMessage, AWSError] = js.native
  
  /**
    * Lists all the subscription descriptions for a customer account. The description for a subscription includes SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status. If you specify a SubscriptionName, lists the description for that subscription.
    */
  def describeEventSubscriptions(): Request[EventSubscriptionsMessage, AWSError] = js.native
  def describeEventSubscriptions(callback: js.Function2[/* err */ AWSError, /* data */ EventSubscriptionsMessage, Unit]): Request[EventSubscriptionsMessage, AWSError] = js.native
  /**
    * Lists all the subscription descriptions for a customer account. The description for a subscription includes SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status. If you specify a SubscriptionName, lists the description for that subscription.
    */
  def describeEventSubscriptions(params: DescribeEventSubscriptionsMessage): Request[EventSubscriptionsMessage, AWSError] = js.native
  def describeEventSubscriptions(
    params: DescribeEventSubscriptionsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ EventSubscriptionsMessage, Unit]
  ): Request[EventSubscriptionsMessage, AWSError] = js.native
  
  /**
    * Returns events related to DB instances, DB clusters, DB parameter groups, DB security groups, DB snapshots, and DB cluster snapshots for the past 14 days. Events specific to a particular DB instances, DB clusters, DB parameter groups, DB security groups, DB snapshots, and DB cluster snapshots group can be obtained by providing the name as a parameter.  By default, the past hour of events are returned. 
    */
  def describeEvents(): Request[EventsMessage, AWSError] = js.native
  def describeEvents(callback: js.Function2[/* err */ AWSError, /* data */ EventsMessage, Unit]): Request[EventsMessage, AWSError] = js.native
  /**
    * Returns events related to DB instances, DB clusters, DB parameter groups, DB security groups, DB snapshots, and DB cluster snapshots for the past 14 days. Events specific to a particular DB instances, DB clusters, DB parameter groups, DB security groups, DB snapshots, and DB cluster snapshots group can be obtained by providing the name as a parameter.  By default, the past hour of events are returned. 
    */
  def describeEvents(params: DescribeEventsMessage): Request[EventsMessage, AWSError] = js.native
  def describeEvents(
    params: DescribeEventsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ EventsMessage, Unit]
  ): Request[EventsMessage, AWSError] = js.native
  
  /**
    * Returns information about a snapshot export to Amazon S3. This API operation supports pagination. 
    */
  def describeExportTasks(): Request[ExportTasksMessage, AWSError] = js.native
  def describeExportTasks(callback: js.Function2[/* err */ AWSError, /* data */ ExportTasksMessage, Unit]): Request[ExportTasksMessage, AWSError] = js.native
  /**
    * Returns information about a snapshot export to Amazon S3. This API operation supports pagination. 
    */
  def describeExportTasks(params: DescribeExportTasksMessage): Request[ExportTasksMessage, AWSError] = js.native
  def describeExportTasks(
    params: DescribeExportTasksMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ExportTasksMessage, Unit]
  ): Request[ExportTasksMessage, AWSError] = js.native
  
  /**
    *  Returns information about Aurora global database clusters. This API supports pagination.   For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def describeGlobalClusters(): Request[GlobalClustersMessage, AWSError] = js.native
  def describeGlobalClusters(callback: js.Function2[/* err */ AWSError, /* data */ GlobalClustersMessage, Unit]): Request[GlobalClustersMessage, AWSError] = js.native
  /**
    *  Returns information about Aurora global database clusters. This API supports pagination.   For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def describeGlobalClusters(params: DescribeGlobalClustersMessage): Request[GlobalClustersMessage, AWSError] = js.native
  def describeGlobalClusters(
    params: DescribeGlobalClustersMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ GlobalClustersMessage, Unit]
  ): Request[GlobalClustersMessage, AWSError] = js.native
  
  /**
    * Describes the available installation media for a DB engine that requires an on-premises customer provided license, such as Microsoft SQL Server.
    */
  def describeInstallationMedia(): Request[InstallationMediaMessage, AWSError] = js.native
  def describeInstallationMedia(callback: js.Function2[/* err */ AWSError, /* data */ InstallationMediaMessage, Unit]): Request[InstallationMediaMessage, AWSError] = js.native
  /**
    * Describes the available installation media for a DB engine that requires an on-premises customer provided license, such as Microsoft SQL Server.
    */
  def describeInstallationMedia(params: DescribeInstallationMediaMessage): Request[InstallationMediaMessage, AWSError] = js.native
  def describeInstallationMedia(
    params: DescribeInstallationMediaMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ InstallationMediaMessage, Unit]
  ): Request[InstallationMediaMessage, AWSError] = js.native
  
  /**
    * Describes all available options.
    */
  def describeOptionGroupOptions(): Request[OptionGroupOptionsMessage, AWSError] = js.native
  def describeOptionGroupOptions(callback: js.Function2[/* err */ AWSError, /* data */ OptionGroupOptionsMessage, Unit]): Request[OptionGroupOptionsMessage, AWSError] = js.native
  /**
    * Describes all available options.
    */
  def describeOptionGroupOptions(params: DescribeOptionGroupOptionsMessage): Request[OptionGroupOptionsMessage, AWSError] = js.native
  def describeOptionGroupOptions(
    params: DescribeOptionGroupOptionsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ OptionGroupOptionsMessage, Unit]
  ): Request[OptionGroupOptionsMessage, AWSError] = js.native
  
  /**
    * Describes the available option groups.
    */
  def describeOptionGroups(): Request[OptionGroups, AWSError] = js.native
  def describeOptionGroups(callback: js.Function2[/* err */ AWSError, /* data */ OptionGroups, Unit]): Request[OptionGroups, AWSError] = js.native
  /**
    * Describes the available option groups.
    */
  def describeOptionGroups(params: DescribeOptionGroupsMessage): Request[OptionGroups, AWSError] = js.native
  def describeOptionGroups(
    params: DescribeOptionGroupsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ OptionGroups, Unit]
  ): Request[OptionGroups, AWSError] = js.native
  
  /**
    * Returns a list of orderable DB instance options for the specified engine.
    */
  def describeOrderableDBInstanceOptions(): Request[OrderableDBInstanceOptionsMessage, AWSError] = js.native
  def describeOrderableDBInstanceOptions(callback: js.Function2[/* err */ AWSError, /* data */ OrderableDBInstanceOptionsMessage, Unit]): Request[OrderableDBInstanceOptionsMessage, AWSError] = js.native
  /**
    * Returns a list of orderable DB instance options for the specified engine.
    */
  def describeOrderableDBInstanceOptions(params: DescribeOrderableDBInstanceOptionsMessage): Request[OrderableDBInstanceOptionsMessage, AWSError] = js.native
  def describeOrderableDBInstanceOptions(
    params: DescribeOrderableDBInstanceOptionsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ OrderableDBInstanceOptionsMessage, Unit]
  ): Request[OrderableDBInstanceOptionsMessage, AWSError] = js.native
  
  /**
    * Returns a list of resources (for example, DB instances) that have at least one pending maintenance action.
    */
  def describePendingMaintenanceActions(): Request[PendingMaintenanceActionsMessage, AWSError] = js.native
  def describePendingMaintenanceActions(callback: js.Function2[/* err */ AWSError, /* data */ PendingMaintenanceActionsMessage, Unit]): Request[PendingMaintenanceActionsMessage, AWSError] = js.native
  /**
    * Returns a list of resources (for example, DB instances) that have at least one pending maintenance action.
    */
  def describePendingMaintenanceActions(params: DescribePendingMaintenanceActionsMessage): Request[PendingMaintenanceActionsMessage, AWSError] = js.native
  def describePendingMaintenanceActions(
    params: DescribePendingMaintenanceActionsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ PendingMaintenanceActionsMessage, Unit]
  ): Request[PendingMaintenanceActionsMessage, AWSError] = js.native
  
  /**
    * Returns information about reserved DB instances for this account, or about a specified reserved DB instance.
    */
  def describeReservedDBInstances(): Request[ReservedDBInstanceMessage, AWSError] = js.native
  def describeReservedDBInstances(callback: js.Function2[/* err */ AWSError, /* data */ ReservedDBInstanceMessage, Unit]): Request[ReservedDBInstanceMessage, AWSError] = js.native
  /**
    * Returns information about reserved DB instances for this account, or about a specified reserved DB instance.
    */
  def describeReservedDBInstances(params: DescribeReservedDBInstancesMessage): Request[ReservedDBInstanceMessage, AWSError] = js.native
  def describeReservedDBInstances(
    params: DescribeReservedDBInstancesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ReservedDBInstanceMessage, Unit]
  ): Request[ReservedDBInstanceMessage, AWSError] = js.native
  
  /**
    * Lists available reserved DB instance offerings.
    */
  def describeReservedDBInstancesOfferings(): Request[ReservedDBInstancesOfferingMessage, AWSError] = js.native
  def describeReservedDBInstancesOfferings(callback: js.Function2[/* err */ AWSError, /* data */ ReservedDBInstancesOfferingMessage, Unit]): Request[ReservedDBInstancesOfferingMessage, AWSError] = js.native
  /**
    * Lists available reserved DB instance offerings.
    */
  def describeReservedDBInstancesOfferings(params: DescribeReservedDBInstancesOfferingsMessage): Request[ReservedDBInstancesOfferingMessage, AWSError] = js.native
  def describeReservedDBInstancesOfferings(
    params: DescribeReservedDBInstancesOfferingsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ReservedDBInstancesOfferingMessage, Unit]
  ): Request[ReservedDBInstancesOfferingMessage, AWSError] = js.native
  
  /**
    * Returns a list of the source AWS Regions where the current AWS Region can create a read replica or copy a DB snapshot from. This API action supports pagination.
    */
  def describeSourceRegions(): Request[SourceRegionMessage, AWSError] = js.native
  def describeSourceRegions(callback: js.Function2[/* err */ AWSError, /* data */ SourceRegionMessage, Unit]): Request[SourceRegionMessage, AWSError] = js.native
  /**
    * Returns a list of the source AWS Regions where the current AWS Region can create a read replica or copy a DB snapshot from. This API action supports pagination.
    */
  def describeSourceRegions(params: DescribeSourceRegionsMessage): Request[SourceRegionMessage, AWSError] = js.native
  def describeSourceRegions(
    params: DescribeSourceRegionsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ SourceRegionMessage, Unit]
  ): Request[SourceRegionMessage, AWSError] = js.native
  
  /**
    * You can call DescribeValidDBInstanceModifications to learn what modifications you can make to your DB instance. You can use this information when you call ModifyDBInstance. 
    */
  def describeValidDBInstanceModifications(): Request[DescribeValidDBInstanceModificationsResult, AWSError] = js.native
  def describeValidDBInstanceModifications(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeValidDBInstanceModificationsResult, Unit]
  ): Request[DescribeValidDBInstanceModificationsResult, AWSError] = js.native
  /**
    * You can call DescribeValidDBInstanceModifications to learn what modifications you can make to your DB instance. You can use this information when you call ModifyDBInstance. 
    */
  def describeValidDBInstanceModifications(params: DescribeValidDBInstanceModificationsMessage): Request[DescribeValidDBInstanceModificationsResult, AWSError] = js.native
  def describeValidDBInstanceModifications(
    params: DescribeValidDBInstanceModificationsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeValidDBInstanceModificationsResult, Unit]
  ): Request[DescribeValidDBInstanceModificationsResult, AWSError] = js.native
  
  /**
    * Downloads all or a portion of the specified log file, up to 1 MB in size.
    */
  def downloadDBLogFilePortion(): Request[DownloadDBLogFilePortionDetails, AWSError] = js.native
  def downloadDBLogFilePortion(callback: js.Function2[/* err */ AWSError, /* data */ DownloadDBLogFilePortionDetails, Unit]): Request[DownloadDBLogFilePortionDetails, AWSError] = js.native
  /**
    * Downloads all or a portion of the specified log file, up to 1 MB in size.
    */
  def downloadDBLogFilePortion(params: DownloadDBLogFilePortionMessage): Request[DownloadDBLogFilePortionDetails, AWSError] = js.native
  def downloadDBLogFilePortion(
    params: DownloadDBLogFilePortionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DownloadDBLogFilePortionDetails, Unit]
  ): Request[DownloadDBLogFilePortionDetails, AWSError] = js.native
  
  /**
    * Forces a failover for a DB cluster. A failover for a DB cluster promotes one of the Aurora Replicas (read-only instances) in the DB cluster to be the primary instance (the cluster writer). Amazon Aurora will automatically fail over to an Aurora Replica, if one exists, when the primary instance fails. You can force a failover when you want to simulate a failure of a primary instance for testing. Because each instance in a DB cluster has its own endpoint address, you will need to clean up and re-establish any existing connections that use those endpoint addresses when the failover is complete. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def failoverDBCluster(): Request[FailoverDBClusterResult, AWSError] = js.native
  def failoverDBCluster(callback: js.Function2[/* err */ AWSError, /* data */ FailoverDBClusterResult, Unit]): Request[FailoverDBClusterResult, AWSError] = js.native
  /**
    * Forces a failover for a DB cluster. A failover for a DB cluster promotes one of the Aurora Replicas (read-only instances) in the DB cluster to be the primary instance (the cluster writer). Amazon Aurora will automatically fail over to an Aurora Replica, if one exists, when the primary instance fails. You can force a failover when you want to simulate a failure of a primary instance for testing. Because each instance in a DB cluster has its own endpoint address, you will need to clean up and re-establish any existing connections that use those endpoint addresses when the failover is complete. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def failoverDBCluster(params: FailoverDBClusterMessage): Request[FailoverDBClusterResult, AWSError] = js.native
  def failoverDBCluster(
    params: FailoverDBClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ FailoverDBClusterResult, Unit]
  ): Request[FailoverDBClusterResult, AWSError] = js.native
  
  /**
    * Imports the installation media for a DB engine that requires an on-premises customer provided license, such as SQL Server.
    */
  def importInstallationMedia(): Request[InstallationMedia, AWSError] = js.native
  def importInstallationMedia(callback: js.Function2[/* err */ AWSError, /* data */ InstallationMedia, Unit]): Request[InstallationMedia, AWSError] = js.native
  /**
    * Imports the installation media for a DB engine that requires an on-premises customer provided license, such as SQL Server.
    */
  def importInstallationMedia(params: ImportInstallationMediaMessage): Request[InstallationMedia, AWSError] = js.native
  def importInstallationMedia(
    params: ImportInstallationMediaMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ InstallationMedia, Unit]
  ): Request[InstallationMedia, AWSError] = js.native
  
  /**
    * Lists all tags on an Amazon RDS resource. For an overview on tagging an Amazon RDS resource, see Tagging Amazon RDS Resources in the Amazon RDS User Guide.
    */
  def listTagsForResource(): Request[TagListMessage, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ TagListMessage, Unit]): Request[TagListMessage, AWSError] = js.native
  /**
    * Lists all tags on an Amazon RDS resource. For an overview on tagging an Amazon RDS resource, see Tagging Amazon RDS Resources in the Amazon RDS User Guide.
    */
  def listTagsForResource(params: ListTagsForResourceMessage): Request[TagListMessage, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ TagListMessage, Unit]
  ): Request[TagListMessage, AWSError] = js.native
  
  /**
    * Override the system-default Secure Sockets Layer/Transport Layer Security (SSL/TLS) certificate for Amazon RDS for new DB instances temporarily, or remove the override. By using this operation, you can specify an RDS-approved SSL/TLS certificate for new DB instances that is different from the default certificate provided by RDS. You can also use this operation to remove the override, so that new DB instances use the default certificate provided by RDS. You might need to override the default certificate in the following situations:   You already migrated your applications to support the latest certificate authority (CA) certificate, but the new CA certificate is not yet the RDS default CA certificate for the specified AWS Region.   RDS has already moved to a new default CA certificate for the specified AWS Region, but you are still in the process of supporting the new CA certificate. In this case, you temporarily need additional time to finish your application changes.   For more information about rotating your SSL/TLS certificate for RDS DB engines, see  Rotating Your SSL/TLS Certificate in the Amazon RDS User Guide. For more information about rotating your SSL/TLS certificate for Aurora DB engines, see  Rotating Your SSL/TLS Certificate in the Amazon Aurora User Guide.
    */
  def modifyCertificates(): Request[ModifyCertificatesResult, AWSError] = js.native
  def modifyCertificates(callback: js.Function2[/* err */ AWSError, /* data */ ModifyCertificatesResult, Unit]): Request[ModifyCertificatesResult, AWSError] = js.native
  /**
    * Override the system-default Secure Sockets Layer/Transport Layer Security (SSL/TLS) certificate for Amazon RDS for new DB instances temporarily, or remove the override. By using this operation, you can specify an RDS-approved SSL/TLS certificate for new DB instances that is different from the default certificate provided by RDS. You can also use this operation to remove the override, so that new DB instances use the default certificate provided by RDS. You might need to override the default certificate in the following situations:   You already migrated your applications to support the latest certificate authority (CA) certificate, but the new CA certificate is not yet the RDS default CA certificate for the specified AWS Region.   RDS has already moved to a new default CA certificate for the specified AWS Region, but you are still in the process of supporting the new CA certificate. In this case, you temporarily need additional time to finish your application changes.   For more information about rotating your SSL/TLS certificate for RDS DB engines, see  Rotating Your SSL/TLS Certificate in the Amazon RDS User Guide. For more information about rotating your SSL/TLS certificate for Aurora DB engines, see  Rotating Your SSL/TLS Certificate in the Amazon Aurora User Guide.
    */
  def modifyCertificates(params: ModifyCertificatesMessage): Request[ModifyCertificatesResult, AWSError] = js.native
  def modifyCertificates(
    params: ModifyCertificatesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyCertificatesResult, Unit]
  ): Request[ModifyCertificatesResult, AWSError] = js.native
  
  /**
    * Set the capacity of an Aurora Serverless DB cluster to a specific value. Aurora Serverless scales seamlessly based on the workload on the DB cluster. In some cases, the capacity might not scale fast enough to meet a sudden change in workload, such as a large number of new transactions. Call ModifyCurrentDBClusterCapacity to set the capacity explicitly. After this call sets the DB cluster capacity, Aurora Serverless can automatically scale the DB cluster based on the cooldown period for scaling up and the cooldown period for scaling down. For more information about Aurora Serverless, see Using Amazon Aurora Serverless in the Amazon Aurora User Guide.  If you call ModifyCurrentDBClusterCapacity with the default TimeoutAction, connections that prevent Aurora Serverless from finding a scaling point might be dropped. For more information about scaling points, see  Autoscaling for Aurora Serverless in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def modifyCurrentDBClusterCapacity(): Request[DBClusterCapacityInfo, AWSError] = js.native
  def modifyCurrentDBClusterCapacity(callback: js.Function2[/* err */ AWSError, /* data */ DBClusterCapacityInfo, Unit]): Request[DBClusterCapacityInfo, AWSError] = js.native
  /**
    * Set the capacity of an Aurora Serverless DB cluster to a specific value. Aurora Serverless scales seamlessly based on the workload on the DB cluster. In some cases, the capacity might not scale fast enough to meet a sudden change in workload, such as a large number of new transactions. Call ModifyCurrentDBClusterCapacity to set the capacity explicitly. After this call sets the DB cluster capacity, Aurora Serverless can automatically scale the DB cluster based on the cooldown period for scaling up and the cooldown period for scaling down. For more information about Aurora Serverless, see Using Amazon Aurora Serverless in the Amazon Aurora User Guide.  If you call ModifyCurrentDBClusterCapacity with the default TimeoutAction, connections that prevent Aurora Serverless from finding a scaling point might be dropped. For more information about scaling points, see  Autoscaling for Aurora Serverless in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def modifyCurrentDBClusterCapacity(params: ModifyCurrentDBClusterCapacityMessage): Request[DBClusterCapacityInfo, AWSError] = js.native
  def modifyCurrentDBClusterCapacity(
    params: ModifyCurrentDBClusterCapacityMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBClusterCapacityInfo, Unit]
  ): Request[DBClusterCapacityInfo, AWSError] = js.native
  
  /**
    * Modify a setting for an Amazon Aurora DB cluster. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def modifyDBCluster(): Request[ModifyDBClusterResult, AWSError] = js.native
  def modifyDBCluster(callback: js.Function2[/* err */ AWSError, /* data */ ModifyDBClusterResult, Unit]): Request[ModifyDBClusterResult, AWSError] = js.native
  /**
    * Modify a setting for an Amazon Aurora DB cluster. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def modifyDBCluster(params: ModifyDBClusterMessage): Request[ModifyDBClusterResult, AWSError] = js.native
  def modifyDBCluster(
    params: ModifyDBClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyDBClusterResult, Unit]
  ): Request[ModifyDBClusterResult, AWSError] = js.native
  
  /**
    * Modifies the properties of an endpoint in an Amazon Aurora DB cluster.  This action only applies to Aurora DB clusters. 
    */
  def modifyDBClusterEndpoint(): Request[DBClusterEndpoint, AWSError] = js.native
  def modifyDBClusterEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ DBClusterEndpoint, Unit]): Request[DBClusterEndpoint, AWSError] = js.native
  /**
    * Modifies the properties of an endpoint in an Amazon Aurora DB cluster.  This action only applies to Aurora DB clusters. 
    */
  def modifyDBClusterEndpoint(params: ModifyDBClusterEndpointMessage): Request[DBClusterEndpoint, AWSError] = js.native
  def modifyDBClusterEndpoint(
    params: ModifyDBClusterEndpointMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBClusterEndpoint, Unit]
  ): Request[DBClusterEndpoint, AWSError] = js.native
  
  /**
    *  Modifies the parameters of a DB cluster parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without failover to the DB cluster associated with the parameter group before the change can take effect.   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully complete the create action before the parameter group is used as the default for a new DB cluster. This is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBClusterParameters action to verify that your DB cluster parameter group has been created or modified. If the modified DB cluster parameter group is used by an Aurora Serverless cluster, Aurora applies the update immediately. The cluster restart might interrupt your workload. In that case, your application must reopen any connections and retry any transactions that were active when the parameter changes took effect.   This action only applies to Aurora DB clusters. 
    */
  def modifyDBClusterParameterGroup(): Request[DBClusterParameterGroupNameMessage, AWSError] = js.native
  def modifyDBClusterParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ DBClusterParameterGroupNameMessage, Unit]): Request[DBClusterParameterGroupNameMessage, AWSError] = js.native
  /**
    *  Modifies the parameters of a DB cluster parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without failover to the DB cluster associated with the parameter group before the change can take effect.   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully complete the create action before the parameter group is used as the default for a new DB cluster. This is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBClusterParameters action to verify that your DB cluster parameter group has been created or modified. If the modified DB cluster parameter group is used by an Aurora Serverless cluster, Aurora applies the update immediately. The cluster restart might interrupt your workload. In that case, your application must reopen any connections and retry any transactions that were active when the parameter changes took effect.   This action only applies to Aurora DB clusters. 
    */
  def modifyDBClusterParameterGroup(params: ModifyDBClusterParameterGroupMessage): Request[DBClusterParameterGroupNameMessage, AWSError] = js.native
  def modifyDBClusterParameterGroup(
    params: ModifyDBClusterParameterGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBClusterParameterGroupNameMessage, Unit]
  ): Request[DBClusterParameterGroupNameMessage, AWSError] = js.native
  
  /**
    * Adds an attribute and values to, or removes an attribute and values from, a manual DB cluster snapshot. To share a manual DB cluster snapshot with other AWS accounts, specify restore as the AttributeName and use the ValuesToAdd parameter to add a list of IDs of the AWS accounts that are authorized to restore the manual DB cluster snapshot. Use the value all to make the manual DB cluster snapshot public, which means that it can be copied or restored by all AWS accounts.  Don't add the all value for any manual DB cluster snapshots that contain private information that you don't want available to all AWS accounts.  If a manual DB cluster snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use all as a value for that parameter in this case. To view which AWS accounts have access to copy or restore a manual DB cluster snapshot, or whether a manual DB cluster snapshot is public or private, use the DescribeDBClusterSnapshotAttributes API action. The accounts are returned as values for the restore attribute.  This action only applies to Aurora DB clusters. 
    */
  def modifyDBClusterSnapshotAttribute(): Request[ModifyDBClusterSnapshotAttributeResult, AWSError] = js.native
  def modifyDBClusterSnapshotAttribute(
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyDBClusterSnapshotAttributeResult, Unit]
  ): Request[ModifyDBClusterSnapshotAttributeResult, AWSError] = js.native
  /**
    * Adds an attribute and values to, or removes an attribute and values from, a manual DB cluster snapshot. To share a manual DB cluster snapshot with other AWS accounts, specify restore as the AttributeName and use the ValuesToAdd parameter to add a list of IDs of the AWS accounts that are authorized to restore the manual DB cluster snapshot. Use the value all to make the manual DB cluster snapshot public, which means that it can be copied or restored by all AWS accounts.  Don't add the all value for any manual DB cluster snapshots that contain private information that you don't want available to all AWS accounts.  If a manual DB cluster snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use all as a value for that parameter in this case. To view which AWS accounts have access to copy or restore a manual DB cluster snapshot, or whether a manual DB cluster snapshot is public or private, use the DescribeDBClusterSnapshotAttributes API action. The accounts are returned as values for the restore attribute.  This action only applies to Aurora DB clusters. 
    */
  def modifyDBClusterSnapshotAttribute(params: ModifyDBClusterSnapshotAttributeMessage): Request[ModifyDBClusterSnapshotAttributeResult, AWSError] = js.native
  def modifyDBClusterSnapshotAttribute(
    params: ModifyDBClusterSnapshotAttributeMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyDBClusterSnapshotAttributeResult, Unit]
  ): Request[ModifyDBClusterSnapshotAttributeResult, AWSError] = js.native
  
  /**
    * Modifies settings for a DB instance. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. To learn what modifications you can make to your DB instance, call DescribeValidDBInstanceModifications before you call ModifyDBInstance. 
    */
  def modifyDBInstance(): Request[ModifyDBInstanceResult, AWSError] = js.native
  def modifyDBInstance(callback: js.Function2[/* err */ AWSError, /* data */ ModifyDBInstanceResult, Unit]): Request[ModifyDBInstanceResult, AWSError] = js.native
  /**
    * Modifies settings for a DB instance. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. To learn what modifications you can make to your DB instance, call DescribeValidDBInstanceModifications before you call ModifyDBInstance. 
    */
  def modifyDBInstance(params: ModifyDBInstanceMessage): Request[ModifyDBInstanceResult, AWSError] = js.native
  def modifyDBInstance(
    params: ModifyDBInstanceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyDBInstanceResult, Unit]
  ): Request[ModifyDBInstanceResult, AWSError] = js.native
  
  /**
    *  Modifies the parameters of a DB parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without failover to the DB instance associated with the parameter group before the change can take effect.   After you modify a DB parameter group, you should wait at least 5 minutes before creating your first DB instance that uses that DB parameter group as the default parameter group. This allows Amazon RDS to fully complete the modify action before the parameter group is used as the default for a new DB instance. This is especially important for parameters that are critical when creating the default database for a DB instance, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBParameters command to verify that your DB parameter group has been created or modified. 
    */
  def modifyDBParameterGroup(): Request[DBParameterGroupNameMessage, AWSError] = js.native
  def modifyDBParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ DBParameterGroupNameMessage, Unit]): Request[DBParameterGroupNameMessage, AWSError] = js.native
  /**
    *  Modifies the parameters of a DB parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without failover to the DB instance associated with the parameter group before the change can take effect.   After you modify a DB parameter group, you should wait at least 5 minutes before creating your first DB instance that uses that DB parameter group as the default parameter group. This allows Amazon RDS to fully complete the modify action before the parameter group is used as the default for a new DB instance. This is especially important for parameters that are critical when creating the default database for a DB instance, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBParameters command to verify that your DB parameter group has been created or modified. 
    */
  def modifyDBParameterGroup(params: ModifyDBParameterGroupMessage): Request[DBParameterGroupNameMessage, AWSError] = js.native
  def modifyDBParameterGroup(
    params: ModifyDBParameterGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBParameterGroupNameMessage, Unit]
  ): Request[DBParameterGroupNameMessage, AWSError] = js.native
  
  /**
    * Changes the settings for an existing DB proxy.
    */
  def modifyDBProxy(): Request[ModifyDBProxyResponse, AWSError] = js.native
  def modifyDBProxy(callback: js.Function2[/* err */ AWSError, /* data */ ModifyDBProxyResponse, Unit]): Request[ModifyDBProxyResponse, AWSError] = js.native
  /**
    * Changes the settings for an existing DB proxy.
    */
  def modifyDBProxy(params: ModifyDBProxyRequest): Request[ModifyDBProxyResponse, AWSError] = js.native
  def modifyDBProxy(
    params: ModifyDBProxyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyDBProxyResponse, Unit]
  ): Request[ModifyDBProxyResponse, AWSError] = js.native
  
  /**
    * Modifies the properties of a DBProxyTargetGroup.
    */
  def modifyDBProxyTargetGroup(): Request[ModifyDBProxyTargetGroupResponse, AWSError] = js.native
  def modifyDBProxyTargetGroup(callback: js.Function2[/* err */ AWSError, /* data */ ModifyDBProxyTargetGroupResponse, Unit]): Request[ModifyDBProxyTargetGroupResponse, AWSError] = js.native
  /**
    * Modifies the properties of a DBProxyTargetGroup.
    */
  def modifyDBProxyTargetGroup(params: ModifyDBProxyTargetGroupRequest): Request[ModifyDBProxyTargetGroupResponse, AWSError] = js.native
  def modifyDBProxyTargetGroup(
    params: ModifyDBProxyTargetGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyDBProxyTargetGroupResponse, Unit]
  ): Request[ModifyDBProxyTargetGroupResponse, AWSError] = js.native
  
  /**
    * Updates a manual DB snapshot with a new engine version. The snapshot can be encrypted or unencrypted, but not shared or public.  Amazon RDS supports upgrading DB snapshots for MySQL, Oracle, and PostgreSQL. 
    */
  def modifyDBSnapshot(): Request[ModifyDBSnapshotResult, AWSError] = js.native
  def modifyDBSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ ModifyDBSnapshotResult, Unit]): Request[ModifyDBSnapshotResult, AWSError] = js.native
  /**
    * Updates a manual DB snapshot with a new engine version. The snapshot can be encrypted or unencrypted, but not shared or public.  Amazon RDS supports upgrading DB snapshots for MySQL, Oracle, and PostgreSQL. 
    */
  def modifyDBSnapshot(params: ModifyDBSnapshotMessage): Request[ModifyDBSnapshotResult, AWSError] = js.native
  def modifyDBSnapshot(
    params: ModifyDBSnapshotMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyDBSnapshotResult, Unit]
  ): Request[ModifyDBSnapshotResult, AWSError] = js.native
  
  /**
    * Adds an attribute and values to, or removes an attribute and values from, a manual DB snapshot. To share a manual DB snapshot with other AWS accounts, specify restore as the AttributeName and use the ValuesToAdd parameter to add a list of IDs of the AWS accounts that are authorized to restore the manual DB snapshot. Uses the value all to make the manual DB snapshot public, which means it can be copied or restored by all AWS accounts.  Don't add the all value for any manual DB snapshots that contain private information that you don't want available to all AWS accounts.  If the manual DB snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use all as a value for that parameter in this case. To view which AWS accounts have access to copy or restore a manual DB snapshot, or whether a manual DB snapshot public or private, use the DescribeDBSnapshotAttributes API action. The accounts are returned as values for the restore attribute.
    */
  def modifyDBSnapshotAttribute(): Request[ModifyDBSnapshotAttributeResult, AWSError] = js.native
  def modifyDBSnapshotAttribute(callback: js.Function2[/* err */ AWSError, /* data */ ModifyDBSnapshotAttributeResult, Unit]): Request[ModifyDBSnapshotAttributeResult, AWSError] = js.native
  /**
    * Adds an attribute and values to, or removes an attribute and values from, a manual DB snapshot. To share a manual DB snapshot with other AWS accounts, specify restore as the AttributeName and use the ValuesToAdd parameter to add a list of IDs of the AWS accounts that are authorized to restore the manual DB snapshot. Uses the value all to make the manual DB snapshot public, which means it can be copied or restored by all AWS accounts.  Don't add the all value for any manual DB snapshots that contain private information that you don't want available to all AWS accounts.  If the manual DB snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use all as a value for that parameter in this case. To view which AWS accounts have access to copy or restore a manual DB snapshot, or whether a manual DB snapshot public or private, use the DescribeDBSnapshotAttributes API action. The accounts are returned as values for the restore attribute.
    */
  def modifyDBSnapshotAttribute(params: ModifyDBSnapshotAttributeMessage): Request[ModifyDBSnapshotAttributeResult, AWSError] = js.native
  def modifyDBSnapshotAttribute(
    params: ModifyDBSnapshotAttributeMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyDBSnapshotAttributeResult, Unit]
  ): Request[ModifyDBSnapshotAttributeResult, AWSError] = js.native
  
  /**
    * Modifies an existing DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS Region.
    */
  def modifyDBSubnetGroup(): Request[ModifyDBSubnetGroupResult, AWSError] = js.native
  def modifyDBSubnetGroup(callback: js.Function2[/* err */ AWSError, /* data */ ModifyDBSubnetGroupResult, Unit]): Request[ModifyDBSubnetGroupResult, AWSError] = js.native
  /**
    * Modifies an existing DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS Region.
    */
  def modifyDBSubnetGroup(params: ModifyDBSubnetGroupMessage): Request[ModifyDBSubnetGroupResult, AWSError] = js.native
  def modifyDBSubnetGroup(
    params: ModifyDBSubnetGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyDBSubnetGroupResult, Unit]
  ): Request[ModifyDBSubnetGroupResult, AWSError] = js.native
  
  /**
    * Modifies an existing RDS event notification subscription. You can't modify the source identifiers using this call. To change source identifiers for a subscription, use the AddSourceIdentifierToSubscription and RemoveSourceIdentifierFromSubscription calls. You can see a list of the event categories for a given source type (SourceType) in Events in the Amazon RDS User Guide or by using the DescribeEventCategories operation.
    */
  def modifyEventSubscription(): Request[ModifyEventSubscriptionResult, AWSError] = js.native
  def modifyEventSubscription(callback: js.Function2[/* err */ AWSError, /* data */ ModifyEventSubscriptionResult, Unit]): Request[ModifyEventSubscriptionResult, AWSError] = js.native
  /**
    * Modifies an existing RDS event notification subscription. You can't modify the source identifiers using this call. To change source identifiers for a subscription, use the AddSourceIdentifierToSubscription and RemoveSourceIdentifierFromSubscription calls. You can see a list of the event categories for a given source type (SourceType) in Events in the Amazon RDS User Guide or by using the DescribeEventCategories operation.
    */
  def modifyEventSubscription(params: ModifyEventSubscriptionMessage): Request[ModifyEventSubscriptionResult, AWSError] = js.native
  def modifyEventSubscription(
    params: ModifyEventSubscriptionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyEventSubscriptionResult, Unit]
  ): Request[ModifyEventSubscriptionResult, AWSError] = js.native
  
  /**
    *  Modify a setting for an Amazon Aurora global cluster. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def modifyGlobalCluster(): Request[ModifyGlobalClusterResult, AWSError] = js.native
  def modifyGlobalCluster(callback: js.Function2[/* err */ AWSError, /* data */ ModifyGlobalClusterResult, Unit]): Request[ModifyGlobalClusterResult, AWSError] = js.native
  /**
    *  Modify a setting for an Amazon Aurora global cluster. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def modifyGlobalCluster(params: ModifyGlobalClusterMessage): Request[ModifyGlobalClusterResult, AWSError] = js.native
  def modifyGlobalCluster(
    params: ModifyGlobalClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyGlobalClusterResult, Unit]
  ): Request[ModifyGlobalClusterResult, AWSError] = js.native
  
  /**
    * Modifies an existing option group.
    */
  def modifyOptionGroup(): Request[ModifyOptionGroupResult, AWSError] = js.native
  def modifyOptionGroup(callback: js.Function2[/* err */ AWSError, /* data */ ModifyOptionGroupResult, Unit]): Request[ModifyOptionGroupResult, AWSError] = js.native
  /**
    * Modifies an existing option group.
    */
  def modifyOptionGroup(params: ModifyOptionGroupMessage): Request[ModifyOptionGroupResult, AWSError] = js.native
  def modifyOptionGroup(
    params: ModifyOptionGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyOptionGroupResult, Unit]
  ): Request[ModifyOptionGroupResult, AWSError] = js.native
  
  /**
    * Promotes a read replica DB instance to a standalone DB instance.    Backup duration is a function of the amount of changes to the database since the previous backup. If you plan to promote a read replica to a standalone instance, we recommend that you enable backups and complete at least one backup prior to promotion. In addition, a read replica cannot be promoted to a standalone instance when it is in the backing-up status. If you have enabled backups on your read replica, configure the automated backup window so that daily backups do not interfere with read replica promotion.   This command doesn't apply to Aurora MySQL and Aurora PostgreSQL.   
    */
  def promoteReadReplica(): Request[PromoteReadReplicaResult, AWSError] = js.native
  def promoteReadReplica(callback: js.Function2[/* err */ AWSError, /* data */ PromoteReadReplicaResult, Unit]): Request[PromoteReadReplicaResult, AWSError] = js.native
  /**
    * Promotes a read replica DB instance to a standalone DB instance.    Backup duration is a function of the amount of changes to the database since the previous backup. If you plan to promote a read replica to a standalone instance, we recommend that you enable backups and complete at least one backup prior to promotion. In addition, a read replica cannot be promoted to a standalone instance when it is in the backing-up status. If you have enabled backups on your read replica, configure the automated backup window so that daily backups do not interfere with read replica promotion.   This command doesn't apply to Aurora MySQL and Aurora PostgreSQL.   
    */
  def promoteReadReplica(params: PromoteReadReplicaMessage): Request[PromoteReadReplicaResult, AWSError] = js.native
  def promoteReadReplica(
    params: PromoteReadReplicaMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ PromoteReadReplicaResult, Unit]
  ): Request[PromoteReadReplicaResult, AWSError] = js.native
  
  /**
    * Promotes a read replica DB cluster to a standalone DB cluster.  This action only applies to Aurora DB clusters. 
    */
  def promoteReadReplicaDBCluster(): Request[PromoteReadReplicaDBClusterResult, AWSError] = js.native
  def promoteReadReplicaDBCluster(callback: js.Function2[/* err */ AWSError, /* data */ PromoteReadReplicaDBClusterResult, Unit]): Request[PromoteReadReplicaDBClusterResult, AWSError] = js.native
  /**
    * Promotes a read replica DB cluster to a standalone DB cluster.  This action only applies to Aurora DB clusters. 
    */
  def promoteReadReplicaDBCluster(params: PromoteReadReplicaDBClusterMessage): Request[PromoteReadReplicaDBClusterResult, AWSError] = js.native
  def promoteReadReplicaDBCluster(
    params: PromoteReadReplicaDBClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ PromoteReadReplicaDBClusterResult, Unit]
  ): Request[PromoteReadReplicaDBClusterResult, AWSError] = js.native
  
  /**
    * Purchases a reserved DB instance offering.
    */
  def purchaseReservedDBInstancesOffering(): Request[PurchaseReservedDBInstancesOfferingResult, AWSError] = js.native
  def purchaseReservedDBInstancesOffering(
    callback: js.Function2[/* err */ AWSError, /* data */ PurchaseReservedDBInstancesOfferingResult, Unit]
  ): Request[PurchaseReservedDBInstancesOfferingResult, AWSError] = js.native
  /**
    * Purchases a reserved DB instance offering.
    */
  def purchaseReservedDBInstancesOffering(params: PurchaseReservedDBInstancesOfferingMessage): Request[PurchaseReservedDBInstancesOfferingResult, AWSError] = js.native
  def purchaseReservedDBInstancesOffering(
    params: PurchaseReservedDBInstancesOfferingMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ PurchaseReservedDBInstancesOfferingResult, Unit]
  ): Request[PurchaseReservedDBInstancesOfferingResult, AWSError] = js.native
  
  /**
    * You might need to reboot your DB instance, usually for maintenance reasons. For example, if you make certain modifications, or if you change the DB parameter group associated with the DB instance, you must reboot the instance for the changes to take effect.  Rebooting a DB instance restarts the database engine service. Rebooting a DB instance results in a momentary outage, during which the DB instance status is set to rebooting.  For more information about rebooting, see Rebooting a DB Instance in the Amazon RDS User Guide. 
    */
  def rebootDBInstance(): Request[RebootDBInstanceResult, AWSError] = js.native
  def rebootDBInstance(callback: js.Function2[/* err */ AWSError, /* data */ RebootDBInstanceResult, Unit]): Request[RebootDBInstanceResult, AWSError] = js.native
  /**
    * You might need to reboot your DB instance, usually for maintenance reasons. For example, if you make certain modifications, or if you change the DB parameter group associated with the DB instance, you must reboot the instance for the changes to take effect.  Rebooting a DB instance restarts the database engine service. Rebooting a DB instance results in a momentary outage, during which the DB instance status is set to rebooting.  For more information about rebooting, see Rebooting a DB Instance in the Amazon RDS User Guide. 
    */
  def rebootDBInstance(params: RebootDBInstanceMessage): Request[RebootDBInstanceResult, AWSError] = js.native
  def rebootDBInstance(
    params: RebootDBInstanceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ RebootDBInstanceResult, Unit]
  ): Request[RebootDBInstanceResult, AWSError] = js.native
  
  /**
    * Associate one or more DBProxyTarget data structures with a DBProxyTargetGroup.
    */
  def registerDBProxyTargets(): Request[RegisterDBProxyTargetsResponse, AWSError] = js.native
  def registerDBProxyTargets(callback: js.Function2[/* err */ AWSError, /* data */ RegisterDBProxyTargetsResponse, Unit]): Request[RegisterDBProxyTargetsResponse, AWSError] = js.native
  /**
    * Associate one or more DBProxyTarget data structures with a DBProxyTargetGroup.
    */
  def registerDBProxyTargets(params: RegisterDBProxyTargetsRequest): Request[RegisterDBProxyTargetsResponse, AWSError] = js.native
  def registerDBProxyTargets(
    params: RegisterDBProxyTargetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterDBProxyTargetsResponse, Unit]
  ): Request[RegisterDBProxyTargetsResponse, AWSError] = js.native
  
  /**
    *  Detaches an Aurora secondary cluster from an Aurora global database cluster. The cluster becomes a standalone cluster with read-write capability instead of being read-only and receiving data from a primary cluster in a different region.   This action only applies to Aurora DB clusters. 
    */
  def removeFromGlobalCluster(): Request[RemoveFromGlobalClusterResult, AWSError] = js.native
  def removeFromGlobalCluster(callback: js.Function2[/* err */ AWSError, /* data */ RemoveFromGlobalClusterResult, Unit]): Request[RemoveFromGlobalClusterResult, AWSError] = js.native
  /**
    *  Detaches an Aurora secondary cluster from an Aurora global database cluster. The cluster becomes a standalone cluster with read-write capability instead of being read-only and receiving data from a primary cluster in a different region.   This action only applies to Aurora DB clusters. 
    */
  def removeFromGlobalCluster(params: RemoveFromGlobalClusterMessage): Request[RemoveFromGlobalClusterResult, AWSError] = js.native
  def removeFromGlobalCluster(
    params: RemoveFromGlobalClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveFromGlobalClusterResult, Unit]
  ): Request[RemoveFromGlobalClusterResult, AWSError] = js.native
  
  /**
    * Disassociates an AWS Identity and Access Management (IAM) role from an Amazon Aurora DB cluster. For more information, see Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf  in the Amazon Aurora User Guide.  This action only applies to Aurora DB clusters. 
    */
  def removeRoleFromDBCluster(): Request[js.Object, AWSError] = js.native
  def removeRoleFromDBCluster(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Disassociates an AWS Identity and Access Management (IAM) role from an Amazon Aurora DB cluster. For more information, see Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf  in the Amazon Aurora User Guide.  This action only applies to Aurora DB clusters. 
    */
  def removeRoleFromDBCluster(params: RemoveRoleFromDBClusterMessage): Request[js.Object, AWSError] = js.native
  def removeRoleFromDBCluster(
    params: RemoveRoleFromDBClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Disassociates an AWS Identity and Access Management (IAM) role from a DB instance.
    */
  def removeRoleFromDBInstance(): Request[js.Object, AWSError] = js.native
  def removeRoleFromDBInstance(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Disassociates an AWS Identity and Access Management (IAM) role from a DB instance.
    */
  def removeRoleFromDBInstance(params: RemoveRoleFromDBInstanceMessage): Request[js.Object, AWSError] = js.native
  def removeRoleFromDBInstance(
    params: RemoveRoleFromDBInstanceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes a source identifier from an existing RDS event notification subscription.
    */
  def removeSourceIdentifierFromSubscription(): Request[RemoveSourceIdentifierFromSubscriptionResult, AWSError] = js.native
  def removeSourceIdentifierFromSubscription(
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveSourceIdentifierFromSubscriptionResult, Unit]
  ): Request[RemoveSourceIdentifierFromSubscriptionResult, AWSError] = js.native
  /**
    * Removes a source identifier from an existing RDS event notification subscription.
    */
  def removeSourceIdentifierFromSubscription(params: RemoveSourceIdentifierFromSubscriptionMessage): Request[RemoveSourceIdentifierFromSubscriptionResult, AWSError] = js.native
  def removeSourceIdentifierFromSubscription(
    params: RemoveSourceIdentifierFromSubscriptionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveSourceIdentifierFromSubscriptionResult, Unit]
  ): Request[RemoveSourceIdentifierFromSubscriptionResult, AWSError] = js.native
  
  /**
    * Removes metadata tags from an Amazon RDS resource. For an overview on tagging an Amazon RDS resource, see Tagging Amazon RDS Resources in the Amazon RDS User Guide. 
    */
  def removeTagsFromResource(): Request[js.Object, AWSError] = js.native
  def removeTagsFromResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes metadata tags from an Amazon RDS resource. For an overview on tagging an Amazon RDS resource, see Tagging Amazon RDS Resources in the Amazon RDS User Guide. 
    */
  def removeTagsFromResource(params: RemoveTagsFromResourceMessage): Request[js.Object, AWSError] = js.native
  def removeTagsFromResource(
    params: RemoveTagsFromResourceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    *  Modifies the parameters of a DB cluster parameter group to the default value. To reset specific parameters submit a list of the following: ParameterName and ApplyMethod. To reset the entire DB cluster parameter group, specify the DBClusterParameterGroupName and ResetAllParameters parameters.   When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance restart or RebootDBInstance request. You must call RebootDBInstance for every DB instance in your DB cluster that you want the updated static parameter to apply to. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def resetDBClusterParameterGroup(): Request[DBClusterParameterGroupNameMessage, AWSError] = js.native
  def resetDBClusterParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ DBClusterParameterGroupNameMessage, Unit]): Request[DBClusterParameterGroupNameMessage, AWSError] = js.native
  /**
    *  Modifies the parameters of a DB cluster parameter group to the default value. To reset specific parameters submit a list of the following: ParameterName and ApplyMethod. To reset the entire DB cluster parameter group, specify the DBClusterParameterGroupName and ResetAllParameters parameters.   When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance restart or RebootDBInstance request. You must call RebootDBInstance for every DB instance in your DB cluster that you want the updated static parameter to apply to. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def resetDBClusterParameterGroup(params: ResetDBClusterParameterGroupMessage): Request[DBClusterParameterGroupNameMessage, AWSError] = js.native
  def resetDBClusterParameterGroup(
    params: ResetDBClusterParameterGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBClusterParameterGroupNameMessage, Unit]
  ): Request[DBClusterParameterGroupNameMessage, AWSError] = js.native
  
  /**
    * Modifies the parameters of a DB parameter group to the engine/system default value. To reset specific parameters, provide a list of the following: ParameterName and ApplyMethod. To reset the entire DB parameter group, specify the DBParameterGroup name and ResetAllParameters parameters. When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance restart or RebootDBInstance request. 
    */
  def resetDBParameterGroup(): Request[DBParameterGroupNameMessage, AWSError] = js.native
  def resetDBParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ DBParameterGroupNameMessage, Unit]): Request[DBParameterGroupNameMessage, AWSError] = js.native
  /**
    * Modifies the parameters of a DB parameter group to the engine/system default value. To reset specific parameters, provide a list of the following: ParameterName and ApplyMethod. To reset the entire DB parameter group, specify the DBParameterGroup name and ResetAllParameters parameters. When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance restart or RebootDBInstance request. 
    */
  def resetDBParameterGroup(params: ResetDBParameterGroupMessage): Request[DBParameterGroupNameMessage, AWSError] = js.native
  def resetDBParameterGroup(
    params: ResetDBParameterGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBParameterGroupNameMessage, Unit]
  ): Request[DBParameterGroupNameMessage, AWSError] = js.native
  
  /**
    * Creates an Amazon Aurora DB cluster from MySQL data stored in an Amazon S3 bucket. Amazon RDS must be authorized to access the Amazon S3 bucket and the data must be created using the Percona XtraBackup utility as described in  Migrating Data from MySQL by Using an Amazon S3 Bucket in the Amazon Aurora User Guide.  This action only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the CreateDBInstance action to create DB instances for the restored DB cluster, specifying the identifier of the restored DB cluster in DBClusterIdentifier. You can create DB instances only after the RestoreDBClusterFromS3 action has completed and the DB cluster is available.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. The source DB engine must be MySQL. 
    */
  def restoreDBClusterFromS3(): Request[RestoreDBClusterFromS3Result, AWSError] = js.native
  def restoreDBClusterFromS3(callback: js.Function2[/* err */ AWSError, /* data */ RestoreDBClusterFromS3Result, Unit]): Request[RestoreDBClusterFromS3Result, AWSError] = js.native
  /**
    * Creates an Amazon Aurora DB cluster from MySQL data stored in an Amazon S3 bucket. Amazon RDS must be authorized to access the Amazon S3 bucket and the data must be created using the Percona XtraBackup utility as described in  Migrating Data from MySQL by Using an Amazon S3 Bucket in the Amazon Aurora User Guide.  This action only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the CreateDBInstance action to create DB instances for the restored DB cluster, specifying the identifier of the restored DB cluster in DBClusterIdentifier. You can create DB instances only after the RestoreDBClusterFromS3 action has completed and the DB cluster is available.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. The source DB engine must be MySQL. 
    */
  def restoreDBClusterFromS3(params: RestoreDBClusterFromS3Message): Request[RestoreDBClusterFromS3Result, AWSError] = js.native
  def restoreDBClusterFromS3(
    params: RestoreDBClusterFromS3Message,
    callback: js.Function2[/* err */ AWSError, /* data */ RestoreDBClusterFromS3Result, Unit]
  ): Request[RestoreDBClusterFromS3Result, AWSError] = js.native
  
  /**
    * Creates a new DB cluster from a DB snapshot or DB cluster snapshot. This action only applies to Aurora DB clusters. The target DB cluster is created from the source snapshot with a default configuration. If you don't specify a security group, the new DB cluster is associated with the default security group.  This action only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the CreateDBInstance action to create DB instances for the restored DB cluster, specifying the identifier of the restored DB cluster in DBClusterIdentifier. You can create DB instances only after the RestoreDBClusterFromSnapshot action has completed and the DB cluster is available.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def restoreDBClusterFromSnapshot(): Request[RestoreDBClusterFromSnapshotResult, AWSError] = js.native
  def restoreDBClusterFromSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ RestoreDBClusterFromSnapshotResult, Unit]): Request[RestoreDBClusterFromSnapshotResult, AWSError] = js.native
  /**
    * Creates a new DB cluster from a DB snapshot or DB cluster snapshot. This action only applies to Aurora DB clusters. The target DB cluster is created from the source snapshot with a default configuration. If you don't specify a security group, the new DB cluster is associated with the default security group.  This action only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the CreateDBInstance action to create DB instances for the restored DB cluster, specifying the identifier of the restored DB cluster in DBClusterIdentifier. You can create DB instances only after the RestoreDBClusterFromSnapshot action has completed and the DB cluster is available.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def restoreDBClusterFromSnapshot(params: RestoreDBClusterFromSnapshotMessage): Request[RestoreDBClusterFromSnapshotResult, AWSError] = js.native
  def restoreDBClusterFromSnapshot(
    params: RestoreDBClusterFromSnapshotMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ RestoreDBClusterFromSnapshotResult, Unit]
  ): Request[RestoreDBClusterFromSnapshotResult, AWSError] = js.native
  
  /**
    * Restores a DB cluster to an arbitrary point in time. Users can restore to any point in time before LatestRestorableTime for up to BackupRetentionPeriod days. The target DB cluster is created from the source DB cluster with the same configuration as the original DB cluster, except that the new DB cluster is created with the default DB security group.   This action only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the CreateDBInstance action to create DB instances for the restored DB cluster, specifying the identifier of the restored DB cluster in DBClusterIdentifier. You can create DB instances only after the RestoreDBClusterToPointInTime action has completed and the DB cluster is available.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def restoreDBClusterToPointInTime(): Request[RestoreDBClusterToPointInTimeResult, AWSError] = js.native
  def restoreDBClusterToPointInTime(callback: js.Function2[/* err */ AWSError, /* data */ RestoreDBClusterToPointInTimeResult, Unit]): Request[RestoreDBClusterToPointInTimeResult, AWSError] = js.native
  /**
    * Restores a DB cluster to an arbitrary point in time. Users can restore to any point in time before LatestRestorableTime for up to BackupRetentionPeriod days. The target DB cluster is created from the source DB cluster with the same configuration as the original DB cluster, except that the new DB cluster is created with the default DB security group.   This action only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the CreateDBInstance action to create DB instances for the restored DB cluster, specifying the identifier of the restored DB cluster in DBClusterIdentifier. You can create DB instances only after the RestoreDBClusterToPointInTime action has completed and the DB cluster is available.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def restoreDBClusterToPointInTime(params: RestoreDBClusterToPointInTimeMessage): Request[RestoreDBClusterToPointInTimeResult, AWSError] = js.native
  def restoreDBClusterToPointInTime(
    params: RestoreDBClusterToPointInTimeMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ RestoreDBClusterToPointInTimeResult, Unit]
  ): Request[RestoreDBClusterToPointInTimeResult, AWSError] = js.native
  
  /**
    * Creates a new DB instance from a DB snapshot. The target database is created from the source database restore point with the most of original configuration with the default security group and the default DB parameter group. By default, the new DB instance is created as a single-AZ deployment except when the instance is a SQL Server instance that has an option group that is associated with mirroring; in this case, the instance becomes a mirrored AZ deployment and not a single-AZ deployment. If your intent is to replace your original DB instance with the new, restored DB instance, then rename your original DB instance before you call the RestoreDBInstanceFromDBSnapshot action. RDS doesn't allow two DB instances with the same name. Once you have renamed your original DB instance with a different identifier, then you can pass the original name of the DB instance as the DBInstanceIdentifier in the call to the RestoreDBInstanceFromDBSnapshot action. The result is that you will replace the original DB instance with the DB instance created from the snapshot. If you are restoring from a shared manual DB snapshot, the DBSnapshotIdentifier must be the ARN of the shared DB snapshot.  This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use RestoreDBClusterFromSnapshot. 
    */
  def restoreDBInstanceFromDBSnapshot(): Request[RestoreDBInstanceFromDBSnapshotResult, AWSError] = js.native
  def restoreDBInstanceFromDBSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ RestoreDBInstanceFromDBSnapshotResult, Unit]): Request[RestoreDBInstanceFromDBSnapshotResult, AWSError] = js.native
  /**
    * Creates a new DB instance from a DB snapshot. The target database is created from the source database restore point with the most of original configuration with the default security group and the default DB parameter group. By default, the new DB instance is created as a single-AZ deployment except when the instance is a SQL Server instance that has an option group that is associated with mirroring; in this case, the instance becomes a mirrored AZ deployment and not a single-AZ deployment. If your intent is to replace your original DB instance with the new, restored DB instance, then rename your original DB instance before you call the RestoreDBInstanceFromDBSnapshot action. RDS doesn't allow two DB instances with the same name. Once you have renamed your original DB instance with a different identifier, then you can pass the original name of the DB instance as the DBInstanceIdentifier in the call to the RestoreDBInstanceFromDBSnapshot action. The result is that you will replace the original DB instance with the DB instance created from the snapshot. If you are restoring from a shared manual DB snapshot, the DBSnapshotIdentifier must be the ARN of the shared DB snapshot.  This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use RestoreDBClusterFromSnapshot. 
    */
  def restoreDBInstanceFromDBSnapshot(params: RestoreDBInstanceFromDBSnapshotMessage): Request[RestoreDBInstanceFromDBSnapshotResult, AWSError] = js.native
  def restoreDBInstanceFromDBSnapshot(
    params: RestoreDBInstanceFromDBSnapshotMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ RestoreDBInstanceFromDBSnapshotResult, Unit]
  ): Request[RestoreDBInstanceFromDBSnapshotResult, AWSError] = js.native
  
  /**
    * Amazon Relational Database Service (Amazon RDS) supports importing MySQL databases by using backup files. You can create a backup of your on-premises database, store it on Amazon Simple Storage Service (Amazon S3), and then restore the backup file onto a new Amazon RDS DB instance running MySQL. For more information, see Importing Data into an Amazon RDS MySQL DB Instance in the Amazon RDS User Guide. 
    */
  def restoreDBInstanceFromS3(): Request[RestoreDBInstanceFromS3Result, AWSError] = js.native
  def restoreDBInstanceFromS3(callback: js.Function2[/* err */ AWSError, /* data */ RestoreDBInstanceFromS3Result, Unit]): Request[RestoreDBInstanceFromS3Result, AWSError] = js.native
  /**
    * Amazon Relational Database Service (Amazon RDS) supports importing MySQL databases by using backup files. You can create a backup of your on-premises database, store it on Amazon Simple Storage Service (Amazon S3), and then restore the backup file onto a new Amazon RDS DB instance running MySQL. For more information, see Importing Data into an Amazon RDS MySQL DB Instance in the Amazon RDS User Guide. 
    */
  def restoreDBInstanceFromS3(params: RestoreDBInstanceFromS3Message): Request[RestoreDBInstanceFromS3Result, AWSError] = js.native
  def restoreDBInstanceFromS3(
    params: RestoreDBInstanceFromS3Message,
    callback: js.Function2[/* err */ AWSError, /* data */ RestoreDBInstanceFromS3Result, Unit]
  ): Request[RestoreDBInstanceFromS3Result, AWSError] = js.native
  
  /**
    * Restores a DB instance to an arbitrary point in time. You can restore to any point in time before the time identified by the LatestRestorableTime property. You can restore to a point up to the number of days specified by the BackupRetentionPeriod property. The target database is created with most of the original configuration, but in a system-selected Availability Zone, with the default security group, the default subnet group, and the default DB parameter group. By default, the new DB instance is created as a single-AZ deployment except when the instance is a SQL Server instance that has an option group that is associated with mirroring; in this case, the instance becomes a mirrored deployment and not a single-AZ deployment.  This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use RestoreDBClusterToPointInTime. 
    */
  def restoreDBInstanceToPointInTime(): Request[RestoreDBInstanceToPointInTimeResult, AWSError] = js.native
  def restoreDBInstanceToPointInTime(callback: js.Function2[/* err */ AWSError, /* data */ RestoreDBInstanceToPointInTimeResult, Unit]): Request[RestoreDBInstanceToPointInTimeResult, AWSError] = js.native
  /**
    * Restores a DB instance to an arbitrary point in time. You can restore to any point in time before the time identified by the LatestRestorableTime property. You can restore to a point up to the number of days specified by the BackupRetentionPeriod property. The target database is created with most of the original configuration, but in a system-selected Availability Zone, with the default security group, the default subnet group, and the default DB parameter group. By default, the new DB instance is created as a single-AZ deployment except when the instance is a SQL Server instance that has an option group that is associated with mirroring; in this case, the instance becomes a mirrored deployment and not a single-AZ deployment.  This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use RestoreDBClusterToPointInTime. 
    */
  def restoreDBInstanceToPointInTime(params: RestoreDBInstanceToPointInTimeMessage): Request[RestoreDBInstanceToPointInTimeResult, AWSError] = js.native
  def restoreDBInstanceToPointInTime(
    params: RestoreDBInstanceToPointInTimeMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ RestoreDBInstanceToPointInTimeResult, Unit]
  ): Request[RestoreDBInstanceToPointInTimeResult, AWSError] = js.native
  
  /**
    * Revokes ingress from a DBSecurityGroup for previously authorized IP ranges or EC2 or VPC Security Groups. Required parameters for this API are one of CIDRIP, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId).
    */
  def revokeDBSecurityGroupIngress(): Request[RevokeDBSecurityGroupIngressResult, AWSError] = js.native
  def revokeDBSecurityGroupIngress(callback: js.Function2[/* err */ AWSError, /* data */ RevokeDBSecurityGroupIngressResult, Unit]): Request[RevokeDBSecurityGroupIngressResult, AWSError] = js.native
  /**
    * Revokes ingress from a DBSecurityGroup for previously authorized IP ranges or EC2 or VPC Security Groups. Required parameters for this API are one of CIDRIP, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId).
    */
  def revokeDBSecurityGroupIngress(params: RevokeDBSecurityGroupIngressMessage): Request[RevokeDBSecurityGroupIngressResult, AWSError] = js.native
  def revokeDBSecurityGroupIngress(
    params: RevokeDBSecurityGroupIngressMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ RevokeDBSecurityGroupIngressResult, Unit]
  ): Request[RevokeDBSecurityGroupIngressResult, AWSError] = js.native
  
  /**
    * Starts a database activity stream to monitor activity on the database. For more information, see Database Activity Streams in the Amazon Aurora User Guide.
    */
  def startActivityStream(): Request[StartActivityStreamResponse, AWSError] = js.native
  def startActivityStream(callback: js.Function2[/* err */ AWSError, /* data */ StartActivityStreamResponse, Unit]): Request[StartActivityStreamResponse, AWSError] = js.native
  /**
    * Starts a database activity stream to monitor activity on the database. For more information, see Database Activity Streams in the Amazon Aurora User Guide.
    */
  def startActivityStream(params: StartActivityStreamRequest): Request[StartActivityStreamResponse, AWSError] = js.native
  def startActivityStream(
    params: StartActivityStreamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartActivityStreamResponse, Unit]
  ): Request[StartActivityStreamResponse, AWSError] = js.native
  
  /**
    * Starts an Amazon Aurora DB cluster that was stopped using the AWS console, the stop-db-cluster AWS CLI command, or the StopDBCluster action. For more information, see  Stopping and Starting an Aurora Cluster in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def startDBCluster(): Request[StartDBClusterResult, AWSError] = js.native
  def startDBCluster(callback: js.Function2[/* err */ AWSError, /* data */ StartDBClusterResult, Unit]): Request[StartDBClusterResult, AWSError] = js.native
  /**
    * Starts an Amazon Aurora DB cluster that was stopped using the AWS console, the stop-db-cluster AWS CLI command, or the StopDBCluster action. For more information, see  Stopping and Starting an Aurora Cluster in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def startDBCluster(params: StartDBClusterMessage): Request[StartDBClusterResult, AWSError] = js.native
  def startDBCluster(
    params: StartDBClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ StartDBClusterResult, Unit]
  ): Request[StartDBClusterResult, AWSError] = js.native
  
  /**
    *  Starts an Amazon RDS DB instance that was stopped using the AWS console, the stop-db-instance AWS CLI command, or the StopDBInstance action.  For more information, see  Starting an Amazon RDS DB instance That Was Previously Stopped in the Amazon RDS User Guide.    This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora DB clusters, use StartDBCluster instead.  
    */
  def startDBInstance(): Request[StartDBInstanceResult, AWSError] = js.native
  def startDBInstance(callback: js.Function2[/* err */ AWSError, /* data */ StartDBInstanceResult, Unit]): Request[StartDBInstanceResult, AWSError] = js.native
  /**
    *  Starts an Amazon RDS DB instance that was stopped using the AWS console, the stop-db-instance AWS CLI command, or the StopDBInstance action.  For more information, see  Starting an Amazon RDS DB instance That Was Previously Stopped in the Amazon RDS User Guide.    This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora DB clusters, use StartDBCluster instead.  
    */
  def startDBInstance(params: StartDBInstanceMessage): Request[StartDBInstanceResult, AWSError] = js.native
  def startDBInstance(
    params: StartDBInstanceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ StartDBInstanceResult, Unit]
  ): Request[StartDBInstanceResult, AWSError] = js.native
  
  /**
    * Starts an export of a snapshot to Amazon S3. The provided IAM role must have access to the S3 bucket. 
    */
  def startExportTask(): Request[ExportTask, AWSError] = js.native
  def startExportTask(callback: js.Function2[/* err */ AWSError, /* data */ ExportTask, Unit]): Request[ExportTask, AWSError] = js.native
  /**
    * Starts an export of a snapshot to Amazon S3. The provided IAM role must have access to the S3 bucket. 
    */
  def startExportTask(params: StartExportTaskMessage): Request[ExportTask, AWSError] = js.native
  def startExportTask(
    params: StartExportTaskMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ExportTask, Unit]
  ): Request[ExportTask, AWSError] = js.native
  
  /**
    * Stops a database activity stream that was started using the AWS console, the start-activity-stream AWS CLI command, or the StartActivityStream action. For more information, see Database Activity Streams in the Amazon Aurora User Guide.
    */
  def stopActivityStream(): Request[StopActivityStreamResponse, AWSError] = js.native
  def stopActivityStream(callback: js.Function2[/* err */ AWSError, /* data */ StopActivityStreamResponse, Unit]): Request[StopActivityStreamResponse, AWSError] = js.native
  /**
    * Stops a database activity stream that was started using the AWS console, the start-activity-stream AWS CLI command, or the StartActivityStream action. For more information, see Database Activity Streams in the Amazon Aurora User Guide.
    */
  def stopActivityStream(params: StopActivityStreamRequest): Request[StopActivityStreamResponse, AWSError] = js.native
  def stopActivityStream(
    params: StopActivityStreamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopActivityStreamResponse, Unit]
  ): Request[StopActivityStreamResponse, AWSError] = js.native
  
  /**
    *  Stops an Amazon Aurora DB cluster. When you stop a DB cluster, Aurora retains the DB cluster's metadata, including its endpoints and DB parameter groups. Aurora also retains the transaction logs so you can do a point-in-time restore if necessary.  For more information, see  Stopping and Starting an Aurora Cluster in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def stopDBCluster(): Request[StopDBClusterResult, AWSError] = js.native
  def stopDBCluster(callback: js.Function2[/* err */ AWSError, /* data */ StopDBClusterResult, Unit]): Request[StopDBClusterResult, AWSError] = js.native
  /**
    *  Stops an Amazon Aurora DB cluster. When you stop a DB cluster, Aurora retains the DB cluster's metadata, including its endpoints and DB parameter groups. Aurora also retains the transaction logs so you can do a point-in-time restore if necessary.  For more information, see  Stopping and Starting an Aurora Cluster in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def stopDBCluster(params: StopDBClusterMessage): Request[StopDBClusterResult, AWSError] = js.native
  def stopDBCluster(
    params: StopDBClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ StopDBClusterResult, Unit]
  ): Request[StopDBClusterResult, AWSError] = js.native
  
  /**
    *  Stops an Amazon RDS DB instance. When you stop a DB instance, Amazon RDS retains the DB instance's metadata, including its endpoint, DB parameter group, and option group membership. Amazon RDS also retains the transaction logs so you can do a point-in-time restore if necessary.  For more information, see  Stopping an Amazon RDS DB Instance Temporarily in the Amazon RDS User Guide.    This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora clusters, use StopDBCluster instead.  
    */
  def stopDBInstance(): Request[StopDBInstanceResult, AWSError] = js.native
  def stopDBInstance(callback: js.Function2[/* err */ AWSError, /* data */ StopDBInstanceResult, Unit]): Request[StopDBInstanceResult, AWSError] = js.native
  /**
    *  Stops an Amazon RDS DB instance. When you stop a DB instance, Amazon RDS retains the DB instance's metadata, including its endpoint, DB parameter group, and option group membership. Amazon RDS also retains the transaction logs so you can do a point-in-time restore if necessary.  For more information, see  Stopping an Amazon RDS DB Instance Temporarily in the Amazon RDS User Guide.    This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora clusters, use StopDBCluster instead.  
    */
  def stopDBInstance(params: StopDBInstanceMessage): Request[StopDBInstanceResult, AWSError] = js.native
  def stopDBInstance(
    params: StopDBInstanceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ StopDBInstanceResult, Unit]
  ): Request[StopDBInstanceResult, AWSError] = js.native
  
  /**
    * Waits for the dBClusterSnapshotAvailable state by periodically calling the underlying RDS.describeDBClusterSnapshotsoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBClusterSnapshotAvailable(state: dBClusterSnapshotAvailable): Request[DBClusterSnapshotMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_dBClusterSnapshotAvailable(
    state: dBClusterSnapshotAvailable,
    callback: js.Function2[/* err */ AWSError, /* data */ DBClusterSnapshotMessage, Unit]
  ): Request[DBClusterSnapshotMessage, AWSError] = js.native
  /**
    * Waits for the dBClusterSnapshotAvailable state by periodically calling the underlying RDS.describeDBClusterSnapshotsoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBClusterSnapshotAvailable(state: dBClusterSnapshotAvailable, params: DescribeDBClusterSnapshot): Request[DBClusterSnapshotMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_dBClusterSnapshotAvailable(
    state: dBClusterSnapshotAvailable,
    params: DescribeDBClusterSnapshot,
    callback: js.Function2[/* err */ AWSError, /* data */ DBClusterSnapshotMessage, Unit]
  ): Request[DBClusterSnapshotMessage, AWSError] = js.native
  /**
    * Waits for the dBClusterSnapshotDeleted state by periodically calling the underlying RDS.describeDBClusterSnapshotsoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBClusterSnapshotDeleted(state: dBClusterSnapshotDeleted): Request[DBClusterSnapshotMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_dBClusterSnapshotDeleted(
    state: dBClusterSnapshotDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DBClusterSnapshotMessage, Unit]
  ): Request[DBClusterSnapshotMessage, AWSError] = js.native
  /**
    * Waits for the dBClusterSnapshotDeleted state by periodically calling the underlying RDS.describeDBClusterSnapshotsoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBClusterSnapshotDeleted(state: dBClusterSnapshotDeleted, params: DescribeDBClusterSnapshot): Request[DBClusterSnapshotMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_dBClusterSnapshotDeleted(
    state: dBClusterSnapshotDeleted,
    params: DescribeDBClusterSnapshot,
    callback: js.Function2[/* err */ AWSError, /* data */ DBClusterSnapshotMessage, Unit]
  ): Request[DBClusterSnapshotMessage, AWSError] = js.native
  /**
    * Waits for the dBInstanceAvailable state by periodically calling the underlying RDS.describeDBInstancesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBInstanceAvailable(state: dBInstanceAvailable): Request[DBInstanceMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_dBInstanceAvailable(
    state: dBInstanceAvailable,
    callback: js.Function2[/* err */ AWSError, /* data */ DBInstanceMessage, Unit]
  ): Request[DBInstanceMessage, AWSError] = js.native
  /**
    * Waits for the dBInstanceAvailable state by periodically calling the underlying RDS.describeDBInstancesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBInstanceAvailable(state: dBInstanceAvailable, params: DescribeDBInstancesMessagFilters): Request[DBInstanceMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_dBInstanceAvailable(
    state: dBInstanceAvailable,
    params: DescribeDBInstancesMessagFilters,
    callback: js.Function2[/* err */ AWSError, /* data */ DBInstanceMessage, Unit]
  ): Request[DBInstanceMessage, AWSError] = js.native
  /**
    * Waits for the dBInstanceDeleted state by periodically calling the underlying RDS.describeDBInstancesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBInstanceDeleted(state: dBInstanceDeleted): Request[DBInstanceMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_dBInstanceDeleted(
    state: dBInstanceDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DBInstanceMessage, Unit]
  ): Request[DBInstanceMessage, AWSError] = js.native
  /**
    * Waits for the dBInstanceDeleted state by periodically calling the underlying RDS.describeDBInstancesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBInstanceDeleted(state: dBInstanceDeleted, params: DescribeDBInstancesMessagFilters): Request[DBInstanceMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_dBInstanceDeleted(
    state: dBInstanceDeleted,
    params: DescribeDBInstancesMessagFilters,
    callback: js.Function2[/* err */ AWSError, /* data */ DBInstanceMessage, Unit]
  ): Request[DBInstanceMessage, AWSError] = js.native
  /**
    * Waits for the dBSnapshotAvailable state by periodically calling the underlying RDS.describeDBSnapshotsoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBSnapshotAvailable(state: dBSnapshotAvailable): Request[DBSnapshotMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_dBSnapshotAvailable(
    state: dBSnapshotAvailable,
    callback: js.Function2[/* err */ AWSError, /* data */ DBSnapshotMessage, Unit]
  ): Request[DBSnapshotMessage, AWSError] = js.native
  /**
    * Waits for the dBSnapshotAvailable state by periodically calling the underlying RDS.describeDBSnapshotsoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBSnapshotAvailable(state: dBSnapshotAvailable, params: DescribeDBSnapshotsMessag): Request[DBSnapshotMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_dBSnapshotAvailable(
    state: dBSnapshotAvailable,
    params: DescribeDBSnapshotsMessag,
    callback: js.Function2[/* err */ AWSError, /* data */ DBSnapshotMessage, Unit]
  ): Request[DBSnapshotMessage, AWSError] = js.native
  /**
    * Waits for the dBSnapshotDeleted state by periodically calling the underlying RDS.describeDBSnapshotsoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBSnapshotDeleted(state: dBSnapshotDeleted): Request[DBSnapshotMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_dBSnapshotDeleted(
    state: dBSnapshotDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DBSnapshotMessage, Unit]
  ): Request[DBSnapshotMessage, AWSError] = js.native
  /**
    * Waits for the dBSnapshotDeleted state by periodically calling the underlying RDS.describeDBSnapshotsoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBSnapshotDeleted(state: dBSnapshotDeleted, params: DescribeDBSnapshotsMessag): Request[DBSnapshotMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_dBSnapshotDeleted(
    state: dBSnapshotDeleted,
    params: DescribeDBSnapshotsMessag,
    callback: js.Function2[/* err */ AWSError, /* data */ DBSnapshotMessage, Unit]
  ): Request[DBSnapshotMessage, AWSError] = js.native
}
