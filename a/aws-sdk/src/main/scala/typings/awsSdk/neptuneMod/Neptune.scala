package typings.awsSdk.neptuneMod

import typings.awsSdk.AnonWaiter
import typings.awsSdk.awsSdkStrings.dBInstanceAvailable
import typings.awsSdk.awsSdkStrings.dBInstanceDeleted
import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Neptune extends Service {
  @JSName("config")
  var config_Neptune: ConfigBase with ClientConfiguration = js.native
  /**
    * Associates an Identity and Access Management (IAM) role from an Neptune DB cluster.
    */
  def addRoleToDBCluster(): Request[js.Object, AWSError] = js.native
  def addRoleToDBCluster(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Associates an Identity and Access Management (IAM) role from an Neptune DB cluster.
    */
  def addRoleToDBCluster(params: AddRoleToDBClusterMessage): Request[js.Object, AWSError] = js.native
  def addRoleToDBCluster(
    params: AddRoleToDBClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Adds a source identifier to an existing event notification subscription.
    */
  def addSourceIdentifierToSubscription(): Request[AddSourceIdentifierToSubscriptionResult, AWSError] = js.native
  def addSourceIdentifierToSubscription(
    callback: js.Function2[/* err */ AWSError, /* data */ AddSourceIdentifierToSubscriptionResult, Unit]
  ): Request[AddSourceIdentifierToSubscriptionResult, AWSError] = js.native
  /**
    * Adds a source identifier to an existing event notification subscription.
    */
  def addSourceIdentifierToSubscription(params: AddSourceIdentifierToSubscriptionMessage): Request[AddSourceIdentifierToSubscriptionResult, AWSError] = js.native
  def addSourceIdentifierToSubscription(
    params: AddSourceIdentifierToSubscriptionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ AddSourceIdentifierToSubscriptionResult, Unit]
  ): Request[AddSourceIdentifierToSubscriptionResult, AWSError] = js.native
  /**
    * Adds metadata tags to an Amazon Neptune resource. These tags can also be used with cost allocation reporting to track cost associated with Amazon Neptune resources, or used in a Condition statement in an IAM policy for Amazon Neptune.
    */
  def addTagsToResource(): Request[js.Object, AWSError] = js.native
  def addTagsToResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds metadata tags to an Amazon Neptune resource. These tags can also be used with cost allocation reporting to track cost associated with Amazon Neptune resources, or used in a Condition statement in an IAM policy for Amazon Neptune.
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
    * Copies the specified DB cluster parameter group.
    */
  def copyDBClusterParameterGroup(): Request[CopyDBClusterParameterGroupResult, AWSError] = js.native
  def copyDBClusterParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ CopyDBClusterParameterGroupResult, Unit]): Request[CopyDBClusterParameterGroupResult, AWSError] = js.native
  /**
    * Copies the specified DB cluster parameter group.
    */
  def copyDBClusterParameterGroup(params: CopyDBClusterParameterGroupMessage): Request[CopyDBClusterParameterGroupResult, AWSError] = js.native
  def copyDBClusterParameterGroup(
    params: CopyDBClusterParameterGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CopyDBClusterParameterGroupResult, Unit]
  ): Request[CopyDBClusterParameterGroupResult, AWSError] = js.native
  /**
    * Copies a snapshot of a DB cluster. To copy a DB cluster snapshot from a shared manual DB cluster snapshot, SourceDBClusterSnapshotIdentifier must be the Amazon Resource Name (ARN) of the shared DB cluster snapshot.
    */
  def copyDBClusterSnapshot(): Request[CopyDBClusterSnapshotResult, AWSError] = js.native
  def copyDBClusterSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CopyDBClusterSnapshotResult, Unit]): Request[CopyDBClusterSnapshotResult, AWSError] = js.native
  /**
    * Copies a snapshot of a DB cluster. To copy a DB cluster snapshot from a shared manual DB cluster snapshot, SourceDBClusterSnapshotIdentifier must be the Amazon Resource Name (ARN) of the shared DB cluster snapshot.
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
    * Creates a new Amazon Neptune DB cluster. You can use the ReplicationSourceIdentifier parameter to create the DB cluster as a Read Replica of another DB cluster or Amazon Neptune DB instance. Note that when you create a new cluster using CreateDBCluster directly, deletion protection is disabled by default (when you create a new production cluster in the console, deletion protection is enabled by default). You can only delete a DB cluster if its DeletionProtection field is set to false.
    */
  def createDBCluster(): Request[CreateDBClusterResult, AWSError] = js.native
  def createDBCluster(callback: js.Function2[/* err */ AWSError, /* data */ CreateDBClusterResult, Unit]): Request[CreateDBClusterResult, AWSError] = js.native
  /**
    * Creates a new Amazon Neptune DB cluster. You can use the ReplicationSourceIdentifier parameter to create the DB cluster as a Read Replica of another DB cluster or Amazon Neptune DB instance. Note that when you create a new cluster using CreateDBCluster directly, deletion protection is disabled by default (when you create a new production cluster in the console, deletion protection is enabled by default). You can only delete a DB cluster if its DeletionProtection field is set to false.
    */
  def createDBCluster(params: CreateDBClusterMessage): Request[CreateDBClusterResult, AWSError] = js.native
  def createDBCluster(
    params: CreateDBClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDBClusterResult, Unit]
  ): Request[CreateDBClusterResult, AWSError] = js.native
  /**
    * Creates a new DB cluster parameter group. Parameters in a DB cluster parameter group apply to all of the instances in a DB cluster.  A DB cluster parameter group is initially created with the default parameters for the database engine used by instances in the DB cluster. To provide custom values for any of the parameters, you must modify the group after creating it using ModifyDBClusterParameterGroup. Once you've created a DB cluster parameter group, you need to associate it with your DB cluster using ModifyDBCluster. When you associate a new DB cluster parameter group with a running DB cluster, you need to reboot the DB instances in the DB cluster without failover for the new DB cluster parameter group and associated settings to take effect.  After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon Neptune to fully complete the create action before the DB cluster parameter group is used as the default for a new DB cluster. This is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon Neptune console or the DescribeDBClusterParameters command to verify that your DB cluster parameter group has been created or modified. 
    */
  def createDBClusterParameterGroup(): Request[CreateDBClusterParameterGroupResult, AWSError] = js.native
  def createDBClusterParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateDBClusterParameterGroupResult, Unit]): Request[CreateDBClusterParameterGroupResult, AWSError] = js.native
  /**
    * Creates a new DB cluster parameter group. Parameters in a DB cluster parameter group apply to all of the instances in a DB cluster.  A DB cluster parameter group is initially created with the default parameters for the database engine used by instances in the DB cluster. To provide custom values for any of the parameters, you must modify the group after creating it using ModifyDBClusterParameterGroup. Once you've created a DB cluster parameter group, you need to associate it with your DB cluster using ModifyDBCluster. When you associate a new DB cluster parameter group with a running DB cluster, you need to reboot the DB instances in the DB cluster without failover for the new DB cluster parameter group and associated settings to take effect.  After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon Neptune to fully complete the create action before the DB cluster parameter group is used as the default for a new DB cluster. This is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon Neptune console or the DescribeDBClusterParameters command to verify that your DB cluster parameter group has been created or modified. 
    */
  def createDBClusterParameterGroup(params: CreateDBClusterParameterGroupMessage): Request[CreateDBClusterParameterGroupResult, AWSError] = js.native
  def createDBClusterParameterGroup(
    params: CreateDBClusterParameterGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDBClusterParameterGroupResult, Unit]
  ): Request[CreateDBClusterParameterGroupResult, AWSError] = js.native
  /**
    * Creates a snapshot of a DB cluster.
    */
  def createDBClusterSnapshot(): Request[CreateDBClusterSnapshotResult, AWSError] = js.native
  def createDBClusterSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CreateDBClusterSnapshotResult, Unit]): Request[CreateDBClusterSnapshotResult, AWSError] = js.native
  /**
    * Creates a snapshot of a DB cluster.
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
    * Creates a new DB parameter group. A DB parameter group is initially created with the default parameters for the database engine used by the DB instance. To provide custom values for any of the parameters, you must modify the group after creating it using ModifyDBParameterGroup. Once you've created a DB parameter group, you need to associate it with your DB instance using ModifyDBInstance. When you associate a new DB parameter group with a running DB instance, you need to reboot the DB instance without failover for the new DB parameter group and associated settings to take effect.  After you create a DB parameter group, you should wait at least 5 minutes before creating your first DB instance that uses that DB parameter group as the default parameter group. This allows Amazon Neptune to fully complete the create action before the parameter group is used as the default for a new DB instance. This is especially important for parameters that are critical when creating the default database for a DB instance, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon Neptune console or the DescribeDBParameters command to verify that your DB parameter group has been created or modified. 
    */
  def createDBParameterGroup(): Request[CreateDBParameterGroupResult, AWSError] = js.native
  def createDBParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateDBParameterGroupResult, Unit]): Request[CreateDBParameterGroupResult, AWSError] = js.native
  /**
    * Creates a new DB parameter group. A DB parameter group is initially created with the default parameters for the database engine used by the DB instance. To provide custom values for any of the parameters, you must modify the group after creating it using ModifyDBParameterGroup. Once you've created a DB parameter group, you need to associate it with your DB instance using ModifyDBInstance. When you associate a new DB parameter group with a running DB instance, you need to reboot the DB instance without failover for the new DB parameter group and associated settings to take effect.  After you create a DB parameter group, you should wait at least 5 minutes before creating your first DB instance that uses that DB parameter group as the default parameter group. This allows Amazon Neptune to fully complete the create action before the parameter group is used as the default for a new DB instance. This is especially important for parameters that are critical when creating the default database for a DB instance, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon Neptune console or the DescribeDBParameters command to verify that your DB parameter group has been created or modified. 
    */
  def createDBParameterGroup(params: CreateDBParameterGroupMessage): Request[CreateDBParameterGroupResult, AWSError] = js.native
  def createDBParameterGroup(
    params: CreateDBParameterGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDBParameterGroupResult, Unit]
  ): Request[CreateDBParameterGroupResult, AWSError] = js.native
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
    * Creates an event notification subscription. This action requires a topic ARN (Amazon Resource Name) created by either the Neptune console, the SNS console, or the SNS API. To obtain an ARN with SNS, you must create a topic in Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS console. You can specify the type of source (SourceType) you want to be notified of, provide a list of Neptune sources (SourceIds) that triggers the events, and provide a list of event categories (EventCategories) for events you want to be notified of. For example, you can specify SourceType = db-instance, SourceIds = mydbinstance1, mydbinstance2 and EventCategories = Availability, Backup. If you specify both the SourceType and SourceIds, such as SourceType = db-instance and SourceIdentifier = myDBInstance1, you are notified of all the db-instance events for the specified source. If you specify a SourceType but do not specify a SourceIdentifier, you receive notice of the events for that source type for all your Neptune sources. If you do not specify either the SourceType nor the SourceIdentifier, you are notified of events generated from all Neptune sources belonging to your customer account.
    */
  def createEventSubscription(): Request[CreateEventSubscriptionResult, AWSError] = js.native
  def createEventSubscription(callback: js.Function2[/* err */ AWSError, /* data */ CreateEventSubscriptionResult, Unit]): Request[CreateEventSubscriptionResult, AWSError] = js.native
  /**
    * Creates an event notification subscription. This action requires a topic ARN (Amazon Resource Name) created by either the Neptune console, the SNS console, or the SNS API. To obtain an ARN with SNS, you must create a topic in Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS console. You can specify the type of source (SourceType) you want to be notified of, provide a list of Neptune sources (SourceIds) that triggers the events, and provide a list of event categories (EventCategories) for events you want to be notified of. For example, you can specify SourceType = db-instance, SourceIds = mydbinstance1, mydbinstance2 and EventCategories = Availability, Backup. If you specify both the SourceType and SourceIds, such as SourceType = db-instance and SourceIdentifier = myDBInstance1, you are notified of all the db-instance events for the specified source. If you specify a SourceType but do not specify a SourceIdentifier, you receive notice of the events for that source type for all your Neptune sources. If you do not specify either the SourceType nor the SourceIdentifier, you are notified of events generated from all Neptune sources belonging to your customer account.
    */
  def createEventSubscription(params: CreateEventSubscriptionMessage): Request[CreateEventSubscriptionResult, AWSError] = js.native
  def createEventSubscription(
    params: CreateEventSubscriptionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEventSubscriptionResult, Unit]
  ): Request[CreateEventSubscriptionResult, AWSError] = js.native
  /**
    * The DeleteDBCluster action deletes a previously provisioned DB cluster. When you delete a DB cluster, all automated backups for that DB cluster are deleted and can't be recovered. Manual DB cluster snapshots of the specified DB cluster are not deleted. Note that the DB Cluster cannot be deleted if deletion protection is enabled. To delete it, you must first set its DeletionProtection field to False.
    */
  def deleteDBCluster(): Request[DeleteDBClusterResult, AWSError] = js.native
  def deleteDBCluster(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDBClusterResult, Unit]): Request[DeleteDBClusterResult, AWSError] = js.native
  /**
    * The DeleteDBCluster action deletes a previously provisioned DB cluster. When you delete a DB cluster, all automated backups for that DB cluster are deleted and can't be recovered. Manual DB cluster snapshots of the specified DB cluster are not deleted. Note that the DB Cluster cannot be deleted if deletion protection is enabled. To delete it, you must first set its DeletionProtection field to False.
    */
  def deleteDBCluster(params: DeleteDBClusterMessage): Request[DeleteDBClusterResult, AWSError] = js.native
  def deleteDBCluster(
    params: DeleteDBClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDBClusterResult, Unit]
  ): Request[DeleteDBClusterResult, AWSError] = js.native
  /**
    * Deletes a specified DB cluster parameter group. The DB cluster parameter group to be deleted can't be associated with any DB clusters.
    */
  def deleteDBClusterParameterGroup(): Request[js.Object, AWSError] = js.native
  def deleteDBClusterParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a specified DB cluster parameter group. The DB cluster parameter group to be deleted can't be associated with any DB clusters.
    */
  def deleteDBClusterParameterGroup(params: DeleteDBClusterParameterGroupMessage): Request[js.Object, AWSError] = js.native
  def deleteDBClusterParameterGroup(
    params: DeleteDBClusterParameterGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a DB cluster snapshot. If the snapshot is being copied, the copy operation is terminated.  The DB cluster snapshot must be in the available state to be deleted. 
    */
  def deleteDBClusterSnapshot(): Request[DeleteDBClusterSnapshotResult, AWSError] = js.native
  def deleteDBClusterSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDBClusterSnapshotResult, Unit]): Request[DeleteDBClusterSnapshotResult, AWSError] = js.native
  /**
    * Deletes a DB cluster snapshot. If the snapshot is being copied, the copy operation is terminated.  The DB cluster snapshot must be in the available state to be deleted. 
    */
  def deleteDBClusterSnapshot(params: DeleteDBClusterSnapshotMessage): Request[DeleteDBClusterSnapshotResult, AWSError] = js.native
  def deleteDBClusterSnapshot(
    params: DeleteDBClusterSnapshotMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDBClusterSnapshotResult, Unit]
  ): Request[DeleteDBClusterSnapshotResult, AWSError] = js.native
  /**
    * The DeleteDBInstance action deletes a previously provisioned DB instance. When you delete a DB instance, all automated backups for that instance are deleted and can't be recovered. Manual DB snapshots of the DB instance to be deleted by DeleteDBInstance are not deleted.  If you request a final DB snapshot the status of the Amazon Neptune DB instance is deleting until the DB snapshot is created. The API action DescribeDBInstance is used to monitor the status of this operation. The action can't be canceled or reverted once submitted. Note that when a DB instance is in a failure state and has a status of failed, incompatible-restore, or incompatible-network, you can only delete it when the SkipFinalSnapshot parameter is set to true. You can't delete a DB instance if it is the only instance in the DB cluster, or if it has deletion protection enabled.
    */
  def deleteDBInstance(): Request[DeleteDBInstanceResult, AWSError] = js.native
  def deleteDBInstance(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDBInstanceResult, Unit]): Request[DeleteDBInstanceResult, AWSError] = js.native
  /**
    * The DeleteDBInstance action deletes a previously provisioned DB instance. When you delete a DB instance, all automated backups for that instance are deleted and can't be recovered. Manual DB snapshots of the DB instance to be deleted by DeleteDBInstance are not deleted.  If you request a final DB snapshot the status of the Amazon Neptune DB instance is deleting until the DB snapshot is created. The API action DescribeDBInstance is used to monitor the status of this operation. The action can't be canceled or reverted once submitted. Note that when a DB instance is in a failure state and has a status of failed, incompatible-restore, or incompatible-network, you can only delete it when the SkipFinalSnapshot parameter is set to true. You can't delete a DB instance if it is the only instance in the DB cluster, or if it has deletion protection enabled.
    */
  def deleteDBInstance(params: DeleteDBInstanceMessage): Request[DeleteDBInstanceResult, AWSError] = js.native
  def deleteDBInstance(
    params: DeleteDBInstanceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDBInstanceResult, Unit]
  ): Request[DeleteDBInstanceResult, AWSError] = js.native
  /**
    * Deletes a specified DBParameterGroup. The DBParameterGroup to be deleted can't be associated with any DB instances.
    */
  def deleteDBParameterGroup(): Request[js.Object, AWSError] = js.native
  def deleteDBParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a specified DBParameterGroup. The DBParameterGroup to be deleted can't be associated with any DB instances.
    */
  def deleteDBParameterGroup(params: DeleteDBParameterGroupMessage): Request[js.Object, AWSError] = js.native
  def deleteDBParameterGroup(
    params: DeleteDBParameterGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
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
    * Deletes an event notification subscription.
    */
  def deleteEventSubscription(): Request[DeleteEventSubscriptionResult, AWSError] = js.native
  def deleteEventSubscription(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEventSubscriptionResult, Unit]): Request[DeleteEventSubscriptionResult, AWSError] = js.native
  /**
    * Deletes an event notification subscription.
    */
  def deleteEventSubscription(params: DeleteEventSubscriptionMessage): Request[DeleteEventSubscriptionResult, AWSError] = js.native
  def deleteEventSubscription(
    params: DeleteEventSubscriptionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEventSubscriptionResult, Unit]
  ): Request[DeleteEventSubscriptionResult, AWSError] = js.native
  /**
    *  Returns a list of DBClusterParameterGroup descriptions. If a DBClusterParameterGroupName parameter is specified, the list will contain only the description of the specified DB cluster parameter group.
    */
  def describeDBClusterParameterGroups(): Request[DBClusterParameterGroupsMessage, AWSError] = js.native
  def describeDBClusterParameterGroups(callback: js.Function2[/* err */ AWSError, /* data */ DBClusterParameterGroupsMessage, Unit]): Request[DBClusterParameterGroupsMessage, AWSError] = js.native
  /**
    *  Returns a list of DBClusterParameterGroup descriptions. If a DBClusterParameterGroupName parameter is specified, the list will contain only the description of the specified DB cluster parameter group.
    */
  def describeDBClusterParameterGroups(params: DescribeDBClusterParameterGroupsMessage): Request[DBClusterParameterGroupsMessage, AWSError] = js.native
  def describeDBClusterParameterGroups(
    params: DescribeDBClusterParameterGroupsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBClusterParameterGroupsMessage, Unit]
  ): Request[DBClusterParameterGroupsMessage, AWSError] = js.native
  /**
    * Returns the detailed parameter list for a particular DB cluster parameter group.
    */
  def describeDBClusterParameters(): Request[DBClusterParameterGroupDetails, AWSError] = js.native
  def describeDBClusterParameters(callback: js.Function2[/* err */ AWSError, /* data */ DBClusterParameterGroupDetails, Unit]): Request[DBClusterParameterGroupDetails, AWSError] = js.native
  /**
    * Returns the detailed parameter list for a particular DB cluster parameter group.
    */
  def describeDBClusterParameters(params: DescribeDBClusterParametersMessage): Request[DBClusterParameterGroupDetails, AWSError] = js.native
  def describeDBClusterParameters(
    params: DescribeDBClusterParametersMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBClusterParameterGroupDetails, Unit]
  ): Request[DBClusterParameterGroupDetails, AWSError] = js.native
  /**
    * Returns a list of DB cluster snapshot attribute names and values for a manual DB cluster snapshot. When sharing snapshots with other AWS accounts, DescribeDBClusterSnapshotAttributes returns the restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the manual DB cluster snapshot. If all is included in the list of values for the restore attribute, then the manual DB cluster snapshot is public and can be copied or restored by all AWS accounts. To add or remove access for an AWS account to copy or restore a manual DB cluster snapshot, or to make the manual DB cluster snapshot public or private, use the ModifyDBClusterSnapshotAttribute API action.
    */
  def describeDBClusterSnapshotAttributes(): Request[DescribeDBClusterSnapshotAttributesResult, AWSError] = js.native
  def describeDBClusterSnapshotAttributes(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDBClusterSnapshotAttributesResult, Unit]
  ): Request[DescribeDBClusterSnapshotAttributesResult, AWSError] = js.native
  /**
    * Returns a list of DB cluster snapshot attribute names and values for a manual DB cluster snapshot. When sharing snapshots with other AWS accounts, DescribeDBClusterSnapshotAttributes returns the restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the manual DB cluster snapshot. If all is included in the list of values for the restore attribute, then the manual DB cluster snapshot is public and can be copied or restored by all AWS accounts. To add or remove access for an AWS account to copy or restore a manual DB cluster snapshot, or to make the manual DB cluster snapshot public or private, use the ModifyDBClusterSnapshotAttribute API action.
    */
  def describeDBClusterSnapshotAttributes(params: DescribeDBClusterSnapshotAttributesMessage): Request[DescribeDBClusterSnapshotAttributesResult, AWSError] = js.native
  def describeDBClusterSnapshotAttributes(
    params: DescribeDBClusterSnapshotAttributesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDBClusterSnapshotAttributesResult, Unit]
  ): Request[DescribeDBClusterSnapshotAttributesResult, AWSError] = js.native
  /**
    * Returns information about DB cluster snapshots. This API action supports pagination.
    */
  def describeDBClusterSnapshots(): Request[DBClusterSnapshotMessage, AWSError] = js.native
  def describeDBClusterSnapshots(callback: js.Function2[/* err */ AWSError, /* data */ DBClusterSnapshotMessage, Unit]): Request[DBClusterSnapshotMessage, AWSError] = js.native
  /**
    * Returns information about DB cluster snapshots. This API action supports pagination.
    */
  def describeDBClusterSnapshots(params: DescribeDBClusterSnapshotsMessage): Request[DBClusterSnapshotMessage, AWSError] = js.native
  def describeDBClusterSnapshots(
    params: DescribeDBClusterSnapshotsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBClusterSnapshotMessage, Unit]
  ): Request[DBClusterSnapshotMessage, AWSError] = js.native
  /**
    * Returns information about provisioned DB clusters, and supports pagination.  This operation can also return information for Amazon RDS clusters and Amazon DocDB clusters. 
    */
  def describeDBClusters(): Request[DBClusterMessage, AWSError] = js.native
  def describeDBClusters(callback: js.Function2[/* err */ AWSError, /* data */ DBClusterMessage, Unit]): Request[DBClusterMessage, AWSError] = js.native
  /**
    * Returns information about provisioned DB clusters, and supports pagination.  This operation can also return information for Amazon RDS clusters and Amazon DocDB clusters. 
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
    * Returns information about provisioned instances, and supports pagination.  This operation can also return information for Amazon RDS instances and Amazon DocDB instances. 
    */
  def describeDBInstances(): Request[DBInstanceMessage, AWSError] = js.native
  def describeDBInstances(callback: js.Function2[/* err */ AWSError, /* data */ DBInstanceMessage, Unit]): Request[DBInstanceMessage, AWSError] = js.native
  /**
    * Returns information about provisioned instances, and supports pagination.  This operation can also return information for Amazon RDS instances and Amazon DocDB instances. 
    */
  def describeDBInstances(params: DescribeDBInstancesMessage): Request[DBInstanceMessage, AWSError] = js.native
  def describeDBInstances(
    params: DescribeDBInstancesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBInstanceMessage, Unit]
  ): Request[DBInstanceMessage, AWSError] = js.native
  /**
    * Returns a list of DBParameterGroup descriptions. If a DBParameterGroupName is specified, the list will contain only the description of the specified DB parameter group.
    */
  def describeDBParameterGroups(): Request[DBParameterGroupsMessage, AWSError] = js.native
  def describeDBParameterGroups(callback: js.Function2[/* err */ AWSError, /* data */ DBParameterGroupsMessage, Unit]): Request[DBParameterGroupsMessage, AWSError] = js.native
  /**
    * Returns a list of DBParameterGroup descriptions. If a DBParameterGroupName is specified, the list will contain only the description of the specified DB parameter group.
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
    * Returns the default engine and system parameter information for the cluster database engine.
    */
  def describeEngineDefaultClusterParameters(): Request[DescribeEngineDefaultClusterParametersResult, AWSError] = js.native
  def describeEngineDefaultClusterParameters(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEngineDefaultClusterParametersResult, Unit]
  ): Request[DescribeEngineDefaultClusterParametersResult, AWSError] = js.native
  /**
    * Returns the default engine and system parameter information for the cluster database engine.
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
    * Displays a list of categories for all event source types, or, if specified, for a specified source type.
    */
  def describeEventCategories(): Request[EventCategoriesMessage, AWSError] = js.native
  def describeEventCategories(callback: js.Function2[/* err */ AWSError, /* data */ EventCategoriesMessage, Unit]): Request[EventCategoriesMessage, AWSError] = js.native
  /**
    * Displays a list of categories for all event source types, or, if specified, for a specified source type.
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
    * Returns events related to DB instances, DB security groups, DB snapshots, and DB parameter groups for the past 14 days. Events specific to a particular DB instance, DB security group, database snapshot, or DB parameter group can be obtained by providing the name as a parameter. By default, the past hour of events are returned.
    */
  def describeEvents(): Request[EventsMessage, AWSError] = js.native
  def describeEvents(callback: js.Function2[/* err */ AWSError, /* data */ EventsMessage, Unit]): Request[EventsMessage, AWSError] = js.native
  /**
    * Returns events related to DB instances, DB security groups, DB snapshots, and DB parameter groups for the past 14 days. Events specific to a particular DB instance, DB security group, database snapshot, or DB parameter group can be obtained by providing the name as a parameter. By default, the past hour of events are returned.
    */
  def describeEvents(params: DescribeEventsMessage): Request[EventsMessage, AWSError] = js.native
  def describeEvents(
    params: DescribeEventsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ EventsMessage, Unit]
  ): Request[EventsMessage, AWSError] = js.native
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
    * Forces a failover for a DB cluster. A failover for a DB cluster promotes one of the Read Replicas (read-only instances) in the DB cluster to be the primary instance (the cluster writer). Amazon Neptune will automatically fail over to a Read Replica, if one exists, when the primary instance fails. You can force a failover when you want to simulate a failure of a primary instance for testing. Because each instance in a DB cluster has its own endpoint address, you will need to clean up and re-establish any existing connections that use those endpoint addresses when the failover is complete.
    */
  def failoverDBCluster(): Request[FailoverDBClusterResult, AWSError] = js.native
  def failoverDBCluster(callback: js.Function2[/* err */ AWSError, /* data */ FailoverDBClusterResult, Unit]): Request[FailoverDBClusterResult, AWSError] = js.native
  /**
    * Forces a failover for a DB cluster. A failover for a DB cluster promotes one of the Read Replicas (read-only instances) in the DB cluster to be the primary instance (the cluster writer). Amazon Neptune will automatically fail over to a Read Replica, if one exists, when the primary instance fails. You can force a failover when you want to simulate a failure of a primary instance for testing. Because each instance in a DB cluster has its own endpoint address, you will need to clean up and re-establish any existing connections that use those endpoint addresses when the failover is complete.
    */
  def failoverDBCluster(params: FailoverDBClusterMessage): Request[FailoverDBClusterResult, AWSError] = js.native
  def failoverDBCluster(
    params: FailoverDBClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ FailoverDBClusterResult, Unit]
  ): Request[FailoverDBClusterResult, AWSError] = js.native
  /**
    * Lists all tags on an Amazon Neptune resource.
    */
  def listTagsForResource(): Request[TagListMessage, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ TagListMessage, Unit]): Request[TagListMessage, AWSError] = js.native
  /**
    * Lists all tags on an Amazon Neptune resource.
    */
  def listTagsForResource(params: ListTagsForResourceMessage): Request[TagListMessage, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ TagListMessage, Unit]
  ): Request[TagListMessage, AWSError] = js.native
  /**
    * Modify a setting for a DB cluster. You can change one or more database configuration parameters by specifying these parameters and the new values in the request.
    */
  def modifyDBCluster(): Request[ModifyDBClusterResult, AWSError] = js.native
  def modifyDBCluster(callback: js.Function2[/* err */ AWSError, /* data */ ModifyDBClusterResult, Unit]): Request[ModifyDBClusterResult, AWSError] = js.native
  /**
    * Modify a setting for a DB cluster. You can change one or more database configuration parameters by specifying these parameters and the new values in the request.
    */
  def modifyDBCluster(params: ModifyDBClusterMessage): Request[ModifyDBClusterResult, AWSError] = js.native
  def modifyDBCluster(
    params: ModifyDBClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyDBClusterResult, Unit]
  ): Request[ModifyDBClusterResult, AWSError] = js.native
  /**
    *  Modifies the parameters of a DB cluster parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.  Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without failover to the DB cluster associated with the parameter group before the change can take effect.   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon Neptune to fully complete the create action before the parameter group is used as the default for a new DB cluster. This is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon Neptune console or the DescribeDBClusterParameters command to verify that your DB cluster parameter group has been created or modified. 
    */
  def modifyDBClusterParameterGroup(): Request[DBClusterParameterGroupNameMessage, AWSError] = js.native
  def modifyDBClusterParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ DBClusterParameterGroupNameMessage, Unit]): Request[DBClusterParameterGroupNameMessage, AWSError] = js.native
  /**
    *  Modifies the parameters of a DB cluster parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.  Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without failover to the DB cluster associated with the parameter group before the change can take effect.   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon Neptune to fully complete the create action before the parameter group is used as the default for a new DB cluster. This is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon Neptune console or the DescribeDBClusterParameters command to verify that your DB cluster parameter group has been created or modified. 
    */
  def modifyDBClusterParameterGroup(params: ModifyDBClusterParameterGroupMessage): Request[DBClusterParameterGroupNameMessage, AWSError] = js.native
  def modifyDBClusterParameterGroup(
    params: ModifyDBClusterParameterGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBClusterParameterGroupNameMessage, Unit]
  ): Request[DBClusterParameterGroupNameMessage, AWSError] = js.native
  /**
    * Adds an attribute and values to, or removes an attribute and values from, a manual DB cluster snapshot. To share a manual DB cluster snapshot with other AWS accounts, specify restore as the AttributeName and use the ValuesToAdd parameter to add a list of IDs of the AWS accounts that are authorized to restore the manual DB cluster snapshot. Use the value all to make the manual DB cluster snapshot public, which means that it can be copied or restored by all AWS accounts. Do not add the all value for any manual DB cluster snapshots that contain private information that you don't want available to all AWS accounts. If a manual DB cluster snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use all as a value for that parameter in this case. To view which AWS accounts have access to copy or restore a manual DB cluster snapshot, or whether a manual DB cluster snapshot public or private, use the DescribeDBClusterSnapshotAttributes API action.
    */
  def modifyDBClusterSnapshotAttribute(): Request[ModifyDBClusterSnapshotAttributeResult, AWSError] = js.native
  def modifyDBClusterSnapshotAttribute(
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyDBClusterSnapshotAttributeResult, Unit]
  ): Request[ModifyDBClusterSnapshotAttributeResult, AWSError] = js.native
  /**
    * Adds an attribute and values to, or removes an attribute and values from, a manual DB cluster snapshot. To share a manual DB cluster snapshot with other AWS accounts, specify restore as the AttributeName and use the ValuesToAdd parameter to add a list of IDs of the AWS accounts that are authorized to restore the manual DB cluster snapshot. Use the value all to make the manual DB cluster snapshot public, which means that it can be copied or restored by all AWS accounts. Do not add the all value for any manual DB cluster snapshots that contain private information that you don't want available to all AWS accounts. If a manual DB cluster snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use all as a value for that parameter in this case. To view which AWS accounts have access to copy or restore a manual DB cluster snapshot, or whether a manual DB cluster snapshot public or private, use the DescribeDBClusterSnapshotAttributes API action.
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
    * Modifies the parameters of a DB parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.  Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without failover to the DB instance associated with the parameter group before the change can take effect.   After you modify a DB parameter group, you should wait at least 5 minutes before creating your first DB instance that uses that DB parameter group as the default parameter group. This allows Amazon Neptune to fully complete the modify action before the parameter group is used as the default for a new DB instance. This is especially important for parameters that are critical when creating the default database for a DB instance, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon Neptune console or the DescribeDBParameters command to verify that your DB parameter group has been created or modified. 
    */
  def modifyDBParameterGroup(): Request[DBParameterGroupNameMessage, AWSError] = js.native
  def modifyDBParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ DBParameterGroupNameMessage, Unit]): Request[DBParameterGroupNameMessage, AWSError] = js.native
  /**
    * Modifies the parameters of a DB parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.  Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without failover to the DB instance associated with the parameter group before the change can take effect.   After you modify a DB parameter group, you should wait at least 5 minutes before creating your first DB instance that uses that DB parameter group as the default parameter group. This allows Amazon Neptune to fully complete the modify action before the parameter group is used as the default for a new DB instance. This is especially important for parameters that are critical when creating the default database for a DB instance, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon Neptune console or the DescribeDBParameters command to verify that your DB parameter group has been created or modified. 
    */
  def modifyDBParameterGroup(params: ModifyDBParameterGroupMessage): Request[DBParameterGroupNameMessage, AWSError] = js.native
  def modifyDBParameterGroup(
    params: ModifyDBParameterGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBParameterGroupNameMessage, Unit]
  ): Request[DBParameterGroupNameMessage, AWSError] = js.native
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
    * Modifies an existing event notification subscription. Note that you can't modify the source identifiers using this call; to change source identifiers for a subscription, use the AddSourceIdentifierToSubscription and RemoveSourceIdentifierFromSubscription calls. You can see a list of the event categories for a given SourceType by using the DescribeEventCategories action.
    */
  def modifyEventSubscription(): Request[ModifyEventSubscriptionResult, AWSError] = js.native
  def modifyEventSubscription(callback: js.Function2[/* err */ AWSError, /* data */ ModifyEventSubscriptionResult, Unit]): Request[ModifyEventSubscriptionResult, AWSError] = js.native
  /**
    * Modifies an existing event notification subscription. Note that you can't modify the source identifiers using this call; to change source identifiers for a subscription, use the AddSourceIdentifierToSubscription and RemoveSourceIdentifierFromSubscription calls. You can see a list of the event categories for a given SourceType by using the DescribeEventCategories action.
    */
  def modifyEventSubscription(params: ModifyEventSubscriptionMessage): Request[ModifyEventSubscriptionResult, AWSError] = js.native
  def modifyEventSubscription(
    params: ModifyEventSubscriptionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyEventSubscriptionResult, Unit]
  ): Request[ModifyEventSubscriptionResult, AWSError] = js.native
  /**
    * Not supported.
    */
  def promoteReadReplicaDBCluster(): Request[PromoteReadReplicaDBClusterResult, AWSError] = js.native
  def promoteReadReplicaDBCluster(callback: js.Function2[/* err */ AWSError, /* data */ PromoteReadReplicaDBClusterResult, Unit]): Request[PromoteReadReplicaDBClusterResult, AWSError] = js.native
  /**
    * Not supported.
    */
  def promoteReadReplicaDBCluster(params: PromoteReadReplicaDBClusterMessage): Request[PromoteReadReplicaDBClusterResult, AWSError] = js.native
  def promoteReadReplicaDBCluster(
    params: PromoteReadReplicaDBClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ PromoteReadReplicaDBClusterResult, Unit]
  ): Request[PromoteReadReplicaDBClusterResult, AWSError] = js.native
  /**
    * You might need to reboot your DB instance, usually for maintenance reasons. For example, if you make certain modifications, or if you change the DB parameter group associated with the DB instance, you must reboot the instance for the changes to take effect. Rebooting a DB instance restarts the database engine service. Rebooting a DB instance results in a momentary outage, during which the DB instance status is set to rebooting.
    */
  def rebootDBInstance(): Request[RebootDBInstanceResult, AWSError] = js.native
  def rebootDBInstance(callback: js.Function2[/* err */ AWSError, /* data */ RebootDBInstanceResult, Unit]): Request[RebootDBInstanceResult, AWSError] = js.native
  /**
    * You might need to reboot your DB instance, usually for maintenance reasons. For example, if you make certain modifications, or if you change the DB parameter group associated with the DB instance, you must reboot the instance for the changes to take effect. Rebooting a DB instance restarts the database engine service. Rebooting a DB instance results in a momentary outage, during which the DB instance status is set to rebooting.
    */
  def rebootDBInstance(params: RebootDBInstanceMessage): Request[RebootDBInstanceResult, AWSError] = js.native
  def rebootDBInstance(
    params: RebootDBInstanceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ RebootDBInstanceResult, Unit]
  ): Request[RebootDBInstanceResult, AWSError] = js.native
  /**
    * Disassociates an Identity and Access Management (IAM) role from a DB cluster.
    */
  def removeRoleFromDBCluster(): Request[js.Object, AWSError] = js.native
  def removeRoleFromDBCluster(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Disassociates an Identity and Access Management (IAM) role from a DB cluster.
    */
  def removeRoleFromDBCluster(params: RemoveRoleFromDBClusterMessage): Request[js.Object, AWSError] = js.native
  def removeRoleFromDBCluster(
    params: RemoveRoleFromDBClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Removes a source identifier from an existing event notification subscription.
    */
  def removeSourceIdentifierFromSubscription(): Request[RemoveSourceIdentifierFromSubscriptionResult, AWSError] = js.native
  def removeSourceIdentifierFromSubscription(
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveSourceIdentifierFromSubscriptionResult, Unit]
  ): Request[RemoveSourceIdentifierFromSubscriptionResult, AWSError] = js.native
  /**
    * Removes a source identifier from an existing event notification subscription.
    */
  def removeSourceIdentifierFromSubscription(params: RemoveSourceIdentifierFromSubscriptionMessage): Request[RemoveSourceIdentifierFromSubscriptionResult, AWSError] = js.native
  def removeSourceIdentifierFromSubscription(
    params: RemoveSourceIdentifierFromSubscriptionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveSourceIdentifierFromSubscriptionResult, Unit]
  ): Request[RemoveSourceIdentifierFromSubscriptionResult, AWSError] = js.native
  /**
    * Removes metadata tags from an Amazon Neptune resource.
    */
  def removeTagsFromResource(): Request[js.Object, AWSError] = js.native
  def removeTagsFromResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes metadata tags from an Amazon Neptune resource.
    */
  def removeTagsFromResource(params: RemoveTagsFromResourceMessage): Request[js.Object, AWSError] = js.native
  def removeTagsFromResource(
    params: RemoveTagsFromResourceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    *  Modifies the parameters of a DB cluster parameter group to the default value. To reset specific parameters submit a list of the following: ParameterName and ApplyMethod. To reset the entire DB cluster parameter group, specify the DBClusterParameterGroupName and ResetAllParameters parameters.  When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance restart or RebootDBInstance request. You must call RebootDBInstance for every DB instance in your DB cluster that you want the updated static parameter to apply to.
    */
  def resetDBClusterParameterGroup(): Request[DBClusterParameterGroupNameMessage, AWSError] = js.native
  def resetDBClusterParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ DBClusterParameterGroupNameMessage, Unit]): Request[DBClusterParameterGroupNameMessage, AWSError] = js.native
  /**
    *  Modifies the parameters of a DB cluster parameter group to the default value. To reset specific parameters submit a list of the following: ParameterName and ApplyMethod. To reset the entire DB cluster parameter group, specify the DBClusterParameterGroupName and ResetAllParameters parameters.  When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance restart or RebootDBInstance request. You must call RebootDBInstance for every DB instance in your DB cluster that you want the updated static parameter to apply to.
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
    * Creates a new DB cluster from a DB snapshot or DB cluster snapshot. If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot with a default configuration and default security group. If a DB cluster snapshot is specified, the target DB cluster is created from the source DB cluster restore point with the same configuration as the original source DB cluster, except that the new DB cluster is created with the default security group.
    */
  def restoreDBClusterFromSnapshot(): Request[RestoreDBClusterFromSnapshotResult, AWSError] = js.native
  def restoreDBClusterFromSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ RestoreDBClusterFromSnapshotResult, Unit]): Request[RestoreDBClusterFromSnapshotResult, AWSError] = js.native
  /**
    * Creates a new DB cluster from a DB snapshot or DB cluster snapshot. If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot with a default configuration and default security group. If a DB cluster snapshot is specified, the target DB cluster is created from the source DB cluster restore point with the same configuration as the original source DB cluster, except that the new DB cluster is created with the default security group.
    */
  def restoreDBClusterFromSnapshot(params: RestoreDBClusterFromSnapshotMessage): Request[RestoreDBClusterFromSnapshotResult, AWSError] = js.native
  def restoreDBClusterFromSnapshot(
    params: RestoreDBClusterFromSnapshotMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ RestoreDBClusterFromSnapshotResult, Unit]
  ): Request[RestoreDBClusterFromSnapshotResult, AWSError] = js.native
  /**
    * Restores a DB cluster to an arbitrary point in time. Users can restore to any point in time before LatestRestorableTime for up to BackupRetentionPeriod days. The target DB cluster is created from the source DB cluster with the same configuration as the original DB cluster, except that the new DB cluster is created with the default DB security group.  This action only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the CreateDBInstance action to create DB instances for the restored DB cluster, specifying the identifier of the restored DB cluster in DBClusterIdentifier. You can create DB instances only after the RestoreDBClusterToPointInTime action has completed and the DB cluster is available. 
    */
  def restoreDBClusterToPointInTime(): Request[RestoreDBClusterToPointInTimeResult, AWSError] = js.native
  def restoreDBClusterToPointInTime(callback: js.Function2[/* err */ AWSError, /* data */ RestoreDBClusterToPointInTimeResult, Unit]): Request[RestoreDBClusterToPointInTimeResult, AWSError] = js.native
  /**
    * Restores a DB cluster to an arbitrary point in time. Users can restore to any point in time before LatestRestorableTime for up to BackupRetentionPeriod days. The target DB cluster is created from the source DB cluster with the same configuration as the original DB cluster, except that the new DB cluster is created with the default DB security group.  This action only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the CreateDBInstance action to create DB instances for the restored DB cluster, specifying the identifier of the restored DB cluster in DBClusterIdentifier. You can create DB instances only after the RestoreDBClusterToPointInTime action has completed and the DB cluster is available. 
    */
  def restoreDBClusterToPointInTime(params: RestoreDBClusterToPointInTimeMessage): Request[RestoreDBClusterToPointInTimeResult, AWSError] = js.native
  def restoreDBClusterToPointInTime(
    params: RestoreDBClusterToPointInTimeMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ RestoreDBClusterToPointInTimeResult, Unit]
  ): Request[RestoreDBClusterToPointInTimeResult, AWSError] = js.native
  /**
    * Starts an Amazon Neptune DB cluster that was stopped using the AWS console, the AWS CLI stop-db-cluster command, or the StopDBCluster API.
    */
  def startDBCluster(): Request[StartDBClusterResult, AWSError] = js.native
  def startDBCluster(callback: js.Function2[/* err */ AWSError, /* data */ StartDBClusterResult, Unit]): Request[StartDBClusterResult, AWSError] = js.native
  /**
    * Starts an Amazon Neptune DB cluster that was stopped using the AWS console, the AWS CLI stop-db-cluster command, or the StopDBCluster API.
    */
  def startDBCluster(params: StartDBClusterMessage): Request[StartDBClusterResult, AWSError] = js.native
  def startDBCluster(
    params: StartDBClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ StartDBClusterResult, Unit]
  ): Request[StartDBClusterResult, AWSError] = js.native
  /**
    * Stops an Amazon Neptune DB cluster. When you stop a DB cluster, Neptune retains the DB cluster's metadata, including its endpoints and DB parameter groups. Neptune also retains the transaction logs so you can do a point-in-time restore if necessary.
    */
  def stopDBCluster(): Request[StopDBClusterResult, AWSError] = js.native
  def stopDBCluster(callback: js.Function2[/* err */ AWSError, /* data */ StopDBClusterResult, Unit]): Request[StopDBClusterResult, AWSError] = js.native
  /**
    * Stops an Amazon Neptune DB cluster. When you stop a DB cluster, Neptune retains the DB cluster's metadata, including its endpoints and DB parameter groups. Neptune also retains the transaction logs so you can do a point-in-time restore if necessary.
    */
  def stopDBCluster(params: StopDBClusterMessage): Request[StopDBClusterResult, AWSError] = js.native
  def stopDBCluster(
    params: StopDBClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ StopDBClusterResult, Unit]
  ): Request[StopDBClusterResult, AWSError] = js.native
  /**
    * Waits for the dBInstanceAvailable state by periodically calling the underlying Neptune.describeDBInstancesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBInstanceAvailable(state: dBInstanceAvailable): Request[DBInstanceMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_dBInstanceAvailable(
    state: dBInstanceAvailable,
    callback: js.Function2[/* err */ AWSError, /* data */ DBInstanceMessage, Unit]
  ): Request[DBInstanceMessage, AWSError] = js.native
  /**
    * Waits for the dBInstanceAvailable state by periodically calling the underlying Neptune.describeDBInstancesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBInstanceAvailable(state: dBInstanceAvailable, params: DescribeDBInstancesMessage with AnonWaiter): Request[DBInstanceMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_dBInstanceAvailable(
    state: dBInstanceAvailable,
    params: DescribeDBInstancesMessage with AnonWaiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DBInstanceMessage, Unit]
  ): Request[DBInstanceMessage, AWSError] = js.native
  /**
    * Waits for the dBInstanceDeleted state by periodically calling the underlying Neptune.describeDBInstancesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBInstanceDeleted(state: dBInstanceDeleted): Request[DBInstanceMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_dBInstanceDeleted(
    state: dBInstanceDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DBInstanceMessage, Unit]
  ): Request[DBInstanceMessage, AWSError] = js.native
  /**
    * Waits for the dBInstanceDeleted state by periodically calling the underlying Neptune.describeDBInstancesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBInstanceDeleted(state: dBInstanceDeleted, params: DescribeDBInstancesMessage with AnonWaiter): Request[DBInstanceMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_dBInstanceDeleted(
    state: dBInstanceDeleted,
    params: DescribeDBInstancesMessage with AnonWaiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DBInstanceMessage, Unit]
  ): Request[DBInstanceMessage, AWSError] = js.native
}

