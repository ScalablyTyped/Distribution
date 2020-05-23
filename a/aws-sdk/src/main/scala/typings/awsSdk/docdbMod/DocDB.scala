package typings.awsSdk.docdbMod

import typings.awsSdk.anon.DescribeDBInstancesMessag
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
trait DocDB extends Service {
  @JSName("config")
  var config_DocDB: ConfigBase with ClientConfiguration = js.native
  /**
    * Adds metadata tags to an Amazon DocumentDB resource. You can use these tags with cost allocation reporting to track costs that are associated with Amazon DocumentDB resources. or in a Condition statement in an AWS Identity and Access Management (IAM) policy for Amazon DocumentDB.
    */
  def addTagsToResource(): Request[js.Object, AWSError] = js.native
  def addTagsToResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds metadata tags to an Amazon DocumentDB resource. You can use these tags with cost allocation reporting to track costs that are associated with Amazon DocumentDB resources. or in a Condition statement in an AWS Identity and Access Management (IAM) policy for Amazon DocumentDB.
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
    * Copies the specified cluster parameter group.
    */
  def copyDBClusterParameterGroup(): Request[CopyDBClusterParameterGroupResult, AWSError] = js.native
  def copyDBClusterParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ CopyDBClusterParameterGroupResult, Unit]): Request[CopyDBClusterParameterGroupResult, AWSError] = js.native
  /**
    * Copies the specified cluster parameter group.
    */
  def copyDBClusterParameterGroup(params: CopyDBClusterParameterGroupMessage): Request[CopyDBClusterParameterGroupResult, AWSError] = js.native
  def copyDBClusterParameterGroup(
    params: CopyDBClusterParameterGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CopyDBClusterParameterGroupResult, Unit]
  ): Request[CopyDBClusterParameterGroupResult, AWSError] = js.native
  /**
    * Copies a snapshot of a cluster. To copy a cluster snapshot from a shared manual cluster snapshot, SourceDBClusterSnapshotIdentifier must be the Amazon Resource Name (ARN) of the shared cluster snapshot. To cancel the copy operation after it is in progress, delete the target cluster snapshot identified by TargetDBClusterSnapshotIdentifier while that DB cluster snapshot is in the copying status.
    */
  def copyDBClusterSnapshot(): Request[CopyDBClusterSnapshotResult, AWSError] = js.native
  def copyDBClusterSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CopyDBClusterSnapshotResult, Unit]): Request[CopyDBClusterSnapshotResult, AWSError] = js.native
  /**
    * Copies a snapshot of a cluster. To copy a cluster snapshot from a shared manual cluster snapshot, SourceDBClusterSnapshotIdentifier must be the Amazon Resource Name (ARN) of the shared cluster snapshot. To cancel the copy operation after it is in progress, delete the target cluster snapshot identified by TargetDBClusterSnapshotIdentifier while that DB cluster snapshot is in the copying status.
    */
  def copyDBClusterSnapshot(params: CopyDBClusterSnapshotMessage): Request[CopyDBClusterSnapshotResult, AWSError] = js.native
  def copyDBClusterSnapshot(
    params: CopyDBClusterSnapshotMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CopyDBClusterSnapshotResult, Unit]
  ): Request[CopyDBClusterSnapshotResult, AWSError] = js.native
  /**
    * Creates a new Amazon DocumentDB cluster.
    */
  def createDBCluster(): Request[CreateDBClusterResult, AWSError] = js.native
  def createDBCluster(callback: js.Function2[/* err */ AWSError, /* data */ CreateDBClusterResult, Unit]): Request[CreateDBClusterResult, AWSError] = js.native
  /**
    * Creates a new Amazon DocumentDB cluster.
    */
  def createDBCluster(params: CreateDBClusterMessage): Request[CreateDBClusterResult, AWSError] = js.native
  def createDBCluster(
    params: CreateDBClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDBClusterResult, Unit]
  ): Request[CreateDBClusterResult, AWSError] = js.native
  /**
    * Creates a new cluster parameter group. Parameters in a cluster parameter group apply to all of the instances in a DB cluster. A cluster parameter group is initially created with the default parameters for the database engine used by instances in the cluster. To provide custom values for any of the parameters, you must modify the group after you create it. After you create a DB cluster parameter group, you must associate it with your cluster. For the new DB cluster parameter group and associated settings to take effect, you must then reboot the instances in the cluster without failover.  After you create a cluster parameter group, you should wait at least 5 minutes before creating your first cluster that uses that cluster parameter group as the default parameter group. This allows Amazon DocumentDB to fully complete the create action before the cluster parameter group is used as the default for a new cluster. This step is especially important for parameters that are critical when creating the default database for a cluster, such as the character set for the default database defined by the character_set_database parameter. 
    */
  def createDBClusterParameterGroup(): Request[CreateDBClusterParameterGroupResult, AWSError] = js.native
  def createDBClusterParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateDBClusterParameterGroupResult, Unit]): Request[CreateDBClusterParameterGroupResult, AWSError] = js.native
  /**
    * Creates a new cluster parameter group. Parameters in a cluster parameter group apply to all of the instances in a DB cluster. A cluster parameter group is initially created with the default parameters for the database engine used by instances in the cluster. To provide custom values for any of the parameters, you must modify the group after you create it. After you create a DB cluster parameter group, you must associate it with your cluster. For the new DB cluster parameter group and associated settings to take effect, you must then reboot the instances in the cluster without failover.  After you create a cluster parameter group, you should wait at least 5 minutes before creating your first cluster that uses that cluster parameter group as the default parameter group. This allows Amazon DocumentDB to fully complete the create action before the cluster parameter group is used as the default for a new cluster. This step is especially important for parameters that are critical when creating the default database for a cluster, such as the character set for the default database defined by the character_set_database parameter. 
    */
  def createDBClusterParameterGroup(params: CreateDBClusterParameterGroupMessage): Request[CreateDBClusterParameterGroupResult, AWSError] = js.native
  def createDBClusterParameterGroup(
    params: CreateDBClusterParameterGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDBClusterParameterGroupResult, Unit]
  ): Request[CreateDBClusterParameterGroupResult, AWSError] = js.native
  /**
    * Creates a snapshot of a cluster. 
    */
  def createDBClusterSnapshot(): Request[CreateDBClusterSnapshotResult, AWSError] = js.native
  def createDBClusterSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CreateDBClusterSnapshotResult, Unit]): Request[CreateDBClusterSnapshotResult, AWSError] = js.native
  /**
    * Creates a snapshot of a cluster. 
    */
  def createDBClusterSnapshot(params: CreateDBClusterSnapshotMessage): Request[CreateDBClusterSnapshotResult, AWSError] = js.native
  def createDBClusterSnapshot(
    params: CreateDBClusterSnapshotMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDBClusterSnapshotResult, Unit]
  ): Request[CreateDBClusterSnapshotResult, AWSError] = js.native
  /**
    * Creates a new instance.
    */
  def createDBInstance(): Request[CreateDBInstanceResult, AWSError] = js.native
  def createDBInstance(callback: js.Function2[/* err */ AWSError, /* data */ CreateDBInstanceResult, Unit]): Request[CreateDBInstanceResult, AWSError] = js.native
  /**
    * Creates a new instance.
    */
  def createDBInstance(params: CreateDBInstanceMessage): Request[CreateDBInstanceResult, AWSError] = js.native
  def createDBInstance(
    params: CreateDBInstanceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDBInstanceResult, Unit]
  ): Request[CreateDBInstanceResult, AWSError] = js.native
  /**
    * Creates a new subnet group. subnet groups must contain at least one subnet in at least two Availability Zones in the AWS Region.
    */
  def createDBSubnetGroup(): Request[CreateDBSubnetGroupResult, AWSError] = js.native
  def createDBSubnetGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateDBSubnetGroupResult, Unit]): Request[CreateDBSubnetGroupResult, AWSError] = js.native
  /**
    * Creates a new subnet group. subnet groups must contain at least one subnet in at least two Availability Zones in the AWS Region.
    */
  def createDBSubnetGroup(params: CreateDBSubnetGroupMessage): Request[CreateDBSubnetGroupResult, AWSError] = js.native
  def createDBSubnetGroup(
    params: CreateDBSubnetGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDBSubnetGroupResult, Unit]
  ): Request[CreateDBSubnetGroupResult, AWSError] = js.native
  /**
    * Deletes a previously provisioned cluster. When you delete a cluster, all automated backups for that cluster are deleted and can't be recovered. Manual DB cluster snapshots of the specified cluster are not deleted. 
    */
  def deleteDBCluster(): Request[DeleteDBClusterResult, AWSError] = js.native
  def deleteDBCluster(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDBClusterResult, Unit]): Request[DeleteDBClusterResult, AWSError] = js.native
  /**
    * Deletes a previously provisioned cluster. When you delete a cluster, all automated backups for that cluster are deleted and can't be recovered. Manual DB cluster snapshots of the specified cluster are not deleted. 
    */
  def deleteDBCluster(params: DeleteDBClusterMessage): Request[DeleteDBClusterResult, AWSError] = js.native
  def deleteDBCluster(
    params: DeleteDBClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDBClusterResult, Unit]
  ): Request[DeleteDBClusterResult, AWSError] = js.native
  /**
    * Deletes a specified cluster parameter group. The cluster parameter group to be deleted can't be associated with any clusters.
    */
  def deleteDBClusterParameterGroup(): Request[js.Object, AWSError] = js.native
  def deleteDBClusterParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a specified cluster parameter group. The cluster parameter group to be deleted can't be associated with any clusters.
    */
  def deleteDBClusterParameterGroup(params: DeleteDBClusterParameterGroupMessage): Request[js.Object, AWSError] = js.native
  def deleteDBClusterParameterGroup(
    params: DeleteDBClusterParameterGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a cluster snapshot. If the snapshot is being copied, the copy operation is terminated.  The cluster snapshot must be in the available state to be deleted. 
    */
  def deleteDBClusterSnapshot(): Request[DeleteDBClusterSnapshotResult, AWSError] = js.native
  def deleteDBClusterSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDBClusterSnapshotResult, Unit]): Request[DeleteDBClusterSnapshotResult, AWSError] = js.native
  /**
    * Deletes a cluster snapshot. If the snapshot is being copied, the copy operation is terminated.  The cluster snapshot must be in the available state to be deleted. 
    */
  def deleteDBClusterSnapshot(params: DeleteDBClusterSnapshotMessage): Request[DeleteDBClusterSnapshotResult, AWSError] = js.native
  def deleteDBClusterSnapshot(
    params: DeleteDBClusterSnapshotMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDBClusterSnapshotResult, Unit]
  ): Request[DeleteDBClusterSnapshotResult, AWSError] = js.native
  /**
    * Deletes a previously provisioned instance. 
    */
  def deleteDBInstance(): Request[DeleteDBInstanceResult, AWSError] = js.native
  def deleteDBInstance(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDBInstanceResult, Unit]): Request[DeleteDBInstanceResult, AWSError] = js.native
  /**
    * Deletes a previously provisioned instance. 
    */
  def deleteDBInstance(params: DeleteDBInstanceMessage): Request[DeleteDBInstanceResult, AWSError] = js.native
  def deleteDBInstance(
    params: DeleteDBInstanceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDBInstanceResult, Unit]
  ): Request[DeleteDBInstanceResult, AWSError] = js.native
  /**
    * Deletes a subnet group.  The specified database subnet group must not be associated with any DB instances. 
    */
  def deleteDBSubnetGroup(): Request[js.Object, AWSError] = js.native
  def deleteDBSubnetGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a subnet group.  The specified database subnet group must not be associated with any DB instances. 
    */
  def deleteDBSubnetGroup(params: DeleteDBSubnetGroupMessage): Request[js.Object, AWSError] = js.native
  def deleteDBSubnetGroup(
    params: DeleteDBSubnetGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Returns a list of certificate authority (CA) certificates provided by Amazon DocumentDB for this AWS account.
    */
  def describeCertificates(): Request[CertificateMessage, AWSError] = js.native
  def describeCertificates(callback: js.Function2[/* err */ AWSError, /* data */ CertificateMessage, Unit]): Request[CertificateMessage, AWSError] = js.native
  /**
    * Returns a list of certificate authority (CA) certificates provided by Amazon DocumentDB for this AWS account.
    */
  def describeCertificates(params: DescribeCertificatesMessage): Request[CertificateMessage, AWSError] = js.native
  def describeCertificates(
    params: DescribeCertificatesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CertificateMessage, Unit]
  ): Request[CertificateMessage, AWSError] = js.native
  /**
    * Returns a list of DBClusterParameterGroup descriptions. If a DBClusterParameterGroupName parameter is specified, the list contains only the description of the specified cluster parameter group. 
    */
  def describeDBClusterParameterGroups(): Request[DBClusterParameterGroupsMessage, AWSError] = js.native
  def describeDBClusterParameterGroups(callback: js.Function2[/* err */ AWSError, /* data */ DBClusterParameterGroupsMessage, Unit]): Request[DBClusterParameterGroupsMessage, AWSError] = js.native
  /**
    * Returns a list of DBClusterParameterGroup descriptions. If a DBClusterParameterGroupName parameter is specified, the list contains only the description of the specified cluster parameter group. 
    */
  def describeDBClusterParameterGroups(params: DescribeDBClusterParameterGroupsMessage): Request[DBClusterParameterGroupsMessage, AWSError] = js.native
  def describeDBClusterParameterGroups(
    params: DescribeDBClusterParameterGroupsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBClusterParameterGroupsMessage, Unit]
  ): Request[DBClusterParameterGroupsMessage, AWSError] = js.native
  /**
    * Returns the detailed parameter list for a particular cluster parameter group.
    */
  def describeDBClusterParameters(): Request[DBClusterParameterGroupDetails, AWSError] = js.native
  def describeDBClusterParameters(callback: js.Function2[/* err */ AWSError, /* data */ DBClusterParameterGroupDetails, Unit]): Request[DBClusterParameterGroupDetails, AWSError] = js.native
  /**
    * Returns the detailed parameter list for a particular cluster parameter group.
    */
  def describeDBClusterParameters(params: DescribeDBClusterParametersMessage): Request[DBClusterParameterGroupDetails, AWSError] = js.native
  def describeDBClusterParameters(
    params: DescribeDBClusterParametersMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBClusterParameterGroupDetails, Unit]
  ): Request[DBClusterParameterGroupDetails, AWSError] = js.native
  /**
    * Returns a list of cluster snapshot attribute names and values for a manual DB cluster snapshot. When you share snapshots with other AWS accounts, DescribeDBClusterSnapshotAttributes returns the restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the manual cluster snapshot. If all is included in the list of values for the restore attribute, then the manual cluster snapshot is public and can be copied or restored by all AWS accounts.
    */
  def describeDBClusterSnapshotAttributes(): Request[DescribeDBClusterSnapshotAttributesResult, AWSError] = js.native
  def describeDBClusterSnapshotAttributes(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDBClusterSnapshotAttributesResult, Unit]
  ): Request[DescribeDBClusterSnapshotAttributesResult, AWSError] = js.native
  /**
    * Returns a list of cluster snapshot attribute names and values for a manual DB cluster snapshot. When you share snapshots with other AWS accounts, DescribeDBClusterSnapshotAttributes returns the restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the manual cluster snapshot. If all is included in the list of values for the restore attribute, then the manual cluster snapshot is public and can be copied or restored by all AWS accounts.
    */
  def describeDBClusterSnapshotAttributes(params: DescribeDBClusterSnapshotAttributesMessage): Request[DescribeDBClusterSnapshotAttributesResult, AWSError] = js.native
  def describeDBClusterSnapshotAttributes(
    params: DescribeDBClusterSnapshotAttributesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDBClusterSnapshotAttributesResult, Unit]
  ): Request[DescribeDBClusterSnapshotAttributesResult, AWSError] = js.native
  /**
    * Returns information about cluster snapshots. This API operation supports pagination.
    */
  def describeDBClusterSnapshots(): Request[DBClusterSnapshotMessage, AWSError] = js.native
  def describeDBClusterSnapshots(callback: js.Function2[/* err */ AWSError, /* data */ DBClusterSnapshotMessage, Unit]): Request[DBClusterSnapshotMessage, AWSError] = js.native
  /**
    * Returns information about cluster snapshots. This API operation supports pagination.
    */
  def describeDBClusterSnapshots(params: DescribeDBClusterSnapshotsMessage): Request[DBClusterSnapshotMessage, AWSError] = js.native
  def describeDBClusterSnapshots(
    params: DescribeDBClusterSnapshotsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBClusterSnapshotMessage, Unit]
  ): Request[DBClusterSnapshotMessage, AWSError] = js.native
  /**
    * Returns information about provisioned Amazon DocumentDB clusters. This API operation supports pagination. For certain management features such as cluster and instance lifecycle management, Amazon DocumentDB leverages operational technology that is shared with Amazon RDS and Amazon Neptune. Use the filterName=engine,Values=docdb filter parameter to return only Amazon DocumentDB clusters.
    */
  def describeDBClusters(): Request[DBClusterMessage, AWSError] = js.native
  def describeDBClusters(callback: js.Function2[/* err */ AWSError, /* data */ DBClusterMessage, Unit]): Request[DBClusterMessage, AWSError] = js.native
  /**
    * Returns information about provisioned Amazon DocumentDB clusters. This API operation supports pagination. For certain management features such as cluster and instance lifecycle management, Amazon DocumentDB leverages operational technology that is shared with Amazon RDS and Amazon Neptune. Use the filterName=engine,Values=docdb filter parameter to return only Amazon DocumentDB clusters.
    */
  def describeDBClusters(params: DescribeDBClustersMessage): Request[DBClusterMessage, AWSError] = js.native
  def describeDBClusters(
    params: DescribeDBClustersMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBClusterMessage, Unit]
  ): Request[DBClusterMessage, AWSError] = js.native
  /**
    * Returns a list of the available engines.
    */
  def describeDBEngineVersions(): Request[DBEngineVersionMessage, AWSError] = js.native
  def describeDBEngineVersions(callback: js.Function2[/* err */ AWSError, /* data */ DBEngineVersionMessage, Unit]): Request[DBEngineVersionMessage, AWSError] = js.native
  /**
    * Returns a list of the available engines.
    */
  def describeDBEngineVersions(params: DescribeDBEngineVersionsMessage): Request[DBEngineVersionMessage, AWSError] = js.native
  def describeDBEngineVersions(
    params: DescribeDBEngineVersionsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBEngineVersionMessage, Unit]
  ): Request[DBEngineVersionMessage, AWSError] = js.native
  /**
    * Returns information about provisioned Amazon DocumentDB instances. This API supports pagination.
    */
  def describeDBInstances(): Request[DBInstanceMessage, AWSError] = js.native
  def describeDBInstances(callback: js.Function2[/* err */ AWSError, /* data */ DBInstanceMessage, Unit]): Request[DBInstanceMessage, AWSError] = js.native
  /**
    * Returns information about provisioned Amazon DocumentDB instances. This API supports pagination.
    */
  def describeDBInstances(params: DescribeDBInstancesMessage): Request[DBInstanceMessage, AWSError] = js.native
  def describeDBInstances(
    params: DescribeDBInstancesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBInstanceMessage, Unit]
  ): Request[DBInstanceMessage, AWSError] = js.native
  /**
    * Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName is specified, the list will contain only the descriptions of the specified DBSubnetGroup.
    */
  def describeDBSubnetGroups(): Request[DBSubnetGroupMessage, AWSError] = js.native
  def describeDBSubnetGroups(callback: js.Function2[/* err */ AWSError, /* data */ DBSubnetGroupMessage, Unit]): Request[DBSubnetGroupMessage, AWSError] = js.native
  /**
    * Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName is specified, the list will contain only the descriptions of the specified DBSubnetGroup.
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
    * Returns events related to instances, security groups, snapshots, and DB parameter groups for the past 14 days. You can obtain events specific to a particular DB instance, security group, snapshot, or parameter group by providing the name as a parameter. By default, the events of the past hour are returned.
    */
  def describeEvents(): Request[EventsMessage, AWSError] = js.native
  def describeEvents(callback: js.Function2[/* err */ AWSError, /* data */ EventsMessage, Unit]): Request[EventsMessage, AWSError] = js.native
  /**
    * Returns events related to instances, security groups, snapshots, and DB parameter groups for the past 14 days. You can obtain events specific to a particular DB instance, security group, snapshot, or parameter group by providing the name as a parameter. By default, the events of the past hour are returned.
    */
  def describeEvents(params: DescribeEventsMessage): Request[EventsMessage, AWSError] = js.native
  def describeEvents(
    params: DescribeEventsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ EventsMessage, Unit]
  ): Request[EventsMessage, AWSError] = js.native
  /**
    * Returns a list of orderable instance options for the specified engine.
    */
  def describeOrderableDBInstanceOptions(): Request[OrderableDBInstanceOptionsMessage, AWSError] = js.native
  def describeOrderableDBInstanceOptions(callback: js.Function2[/* err */ AWSError, /* data */ OrderableDBInstanceOptionsMessage, Unit]): Request[OrderableDBInstanceOptionsMessage, AWSError] = js.native
  /**
    * Returns a list of orderable instance options for the specified engine.
    */
  def describeOrderableDBInstanceOptions(params: DescribeOrderableDBInstanceOptionsMessage): Request[OrderableDBInstanceOptionsMessage, AWSError] = js.native
  def describeOrderableDBInstanceOptions(
    params: DescribeOrderableDBInstanceOptionsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ OrderableDBInstanceOptionsMessage, Unit]
  ): Request[OrderableDBInstanceOptionsMessage, AWSError] = js.native
  /**
    * Returns a list of resources (for example, instances) that have at least one pending maintenance action.
    */
  def describePendingMaintenanceActions(): Request[PendingMaintenanceActionsMessage, AWSError] = js.native
  def describePendingMaintenanceActions(callback: js.Function2[/* err */ AWSError, /* data */ PendingMaintenanceActionsMessage, Unit]): Request[PendingMaintenanceActionsMessage, AWSError] = js.native
  /**
    * Returns a list of resources (for example, instances) that have at least one pending maintenance action.
    */
  def describePendingMaintenanceActions(params: DescribePendingMaintenanceActionsMessage): Request[PendingMaintenanceActionsMessage, AWSError] = js.native
  def describePendingMaintenanceActions(
    params: DescribePendingMaintenanceActionsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ PendingMaintenanceActionsMessage, Unit]
  ): Request[PendingMaintenanceActionsMessage, AWSError] = js.native
  /**
    * Forces a failover for a cluster. A failover for a cluster promotes one of the Amazon DocumentDB replicas (read-only instances) in the cluster to be the primary instance (the cluster writer). If the primary instance fails, Amazon DocumentDB automatically fails over to an Amazon DocumentDB replica, if one exists. You can force a failover when you want to simulate a failure of a primary instance for testing.
    */
  def failoverDBCluster(): Request[FailoverDBClusterResult, AWSError] = js.native
  def failoverDBCluster(callback: js.Function2[/* err */ AWSError, /* data */ FailoverDBClusterResult, Unit]): Request[FailoverDBClusterResult, AWSError] = js.native
  /**
    * Forces a failover for a cluster. A failover for a cluster promotes one of the Amazon DocumentDB replicas (read-only instances) in the cluster to be the primary instance (the cluster writer). If the primary instance fails, Amazon DocumentDB automatically fails over to an Amazon DocumentDB replica, if one exists. You can force a failover when you want to simulate a failure of a primary instance for testing.
    */
  def failoverDBCluster(params: FailoverDBClusterMessage): Request[FailoverDBClusterResult, AWSError] = js.native
  def failoverDBCluster(
    params: FailoverDBClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ FailoverDBClusterResult, Unit]
  ): Request[FailoverDBClusterResult, AWSError] = js.native
  /**
    * Lists all tags on an Amazon DocumentDB resource.
    */
  def listTagsForResource(): Request[TagListMessage, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ TagListMessage, Unit]): Request[TagListMessage, AWSError] = js.native
  /**
    * Lists all tags on an Amazon DocumentDB resource.
    */
  def listTagsForResource(params: ListTagsForResourceMessage): Request[TagListMessage, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ TagListMessage, Unit]
  ): Request[TagListMessage, AWSError] = js.native
  /**
    * Modifies a setting for an Amazon DocumentDB cluster. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. 
    */
  def modifyDBCluster(): Request[ModifyDBClusterResult, AWSError] = js.native
  def modifyDBCluster(callback: js.Function2[/* err */ AWSError, /* data */ ModifyDBClusterResult, Unit]): Request[ModifyDBClusterResult, AWSError] = js.native
  /**
    * Modifies a setting for an Amazon DocumentDB cluster. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. 
    */
  def modifyDBCluster(params: ModifyDBClusterMessage): Request[ModifyDBClusterResult, AWSError] = js.native
  def modifyDBCluster(
    params: ModifyDBClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyDBClusterResult, Unit]
  ): Request[ModifyDBClusterResult, AWSError] = js.native
  /**
    *  Modifies the parameters of a cluster parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot or maintenance window before the change can take effect.   After you create a cluster parameter group, you should wait at least 5 minutes before creating your first cluster that uses that cluster parameter group as the default parameter group. This allows Amazon DocumentDB to fully complete the create action before the parameter group is used as the default for a new cluster. This step is especially important for parameters that are critical when creating the default database for a cluster, such as the character set for the default database defined by the character_set_database parameter. 
    */
  def modifyDBClusterParameterGroup(): Request[DBClusterParameterGroupNameMessage, AWSError] = js.native
  def modifyDBClusterParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ DBClusterParameterGroupNameMessage, Unit]): Request[DBClusterParameterGroupNameMessage, AWSError] = js.native
  /**
    *  Modifies the parameters of a cluster parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot or maintenance window before the change can take effect.   After you create a cluster parameter group, you should wait at least 5 minutes before creating your first cluster that uses that cluster parameter group as the default parameter group. This allows Amazon DocumentDB to fully complete the create action before the parameter group is used as the default for a new cluster. This step is especially important for parameters that are critical when creating the default database for a cluster, such as the character set for the default database defined by the character_set_database parameter. 
    */
  def modifyDBClusterParameterGroup(params: ModifyDBClusterParameterGroupMessage): Request[DBClusterParameterGroupNameMessage, AWSError] = js.native
  def modifyDBClusterParameterGroup(
    params: ModifyDBClusterParameterGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBClusterParameterGroupNameMessage, Unit]
  ): Request[DBClusterParameterGroupNameMessage, AWSError] = js.native
  /**
    * Adds an attribute and values to, or removes an attribute and values from, a manual DB cluster snapshot. To share a manual cluster snapshot with other AWS accounts, specify restore as the AttributeName, and use the ValuesToAdd parameter to add a list of IDs of the AWS accounts that are authorized to restore the manual cluster snapshot. Use the value all to make the manual cluster snapshot public, which means that it can be copied or restored by all AWS accounts. Do not add the all value for any manual DB cluster snapshots that contain private information that you don't want available to all AWS accounts. If a manual cluster snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use all as a value for that parameter in this case.
    */
  def modifyDBClusterSnapshotAttribute(): Request[ModifyDBClusterSnapshotAttributeResult, AWSError] = js.native
  def modifyDBClusterSnapshotAttribute(
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyDBClusterSnapshotAttributeResult, Unit]
  ): Request[ModifyDBClusterSnapshotAttributeResult, AWSError] = js.native
  /**
    * Adds an attribute and values to, or removes an attribute and values from, a manual DB cluster snapshot. To share a manual cluster snapshot with other AWS accounts, specify restore as the AttributeName, and use the ValuesToAdd parameter to add a list of IDs of the AWS accounts that are authorized to restore the manual cluster snapshot. Use the value all to make the manual cluster snapshot public, which means that it can be copied or restored by all AWS accounts. Do not add the all value for any manual DB cluster snapshots that contain private information that you don't want available to all AWS accounts. If a manual cluster snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use all as a value for that parameter in this case.
    */
  def modifyDBClusterSnapshotAttribute(params: ModifyDBClusterSnapshotAttributeMessage): Request[ModifyDBClusterSnapshotAttributeResult, AWSError] = js.native
  def modifyDBClusterSnapshotAttribute(
    params: ModifyDBClusterSnapshotAttributeMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyDBClusterSnapshotAttributeResult, Unit]
  ): Request[ModifyDBClusterSnapshotAttributeResult, AWSError] = js.native
  /**
    * Modifies settings for an instance. You can change one or more database configuration parameters by specifying these parameters and the new values in the request.
    */
  def modifyDBInstance(): Request[ModifyDBInstanceResult, AWSError] = js.native
  def modifyDBInstance(callback: js.Function2[/* err */ AWSError, /* data */ ModifyDBInstanceResult, Unit]): Request[ModifyDBInstanceResult, AWSError] = js.native
  /**
    * Modifies settings for an instance. You can change one or more database configuration parameters by specifying these parameters and the new values in the request.
    */
  def modifyDBInstance(params: ModifyDBInstanceMessage): Request[ModifyDBInstanceResult, AWSError] = js.native
  def modifyDBInstance(
    params: ModifyDBInstanceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyDBInstanceResult, Unit]
  ): Request[ModifyDBInstanceResult, AWSError] = js.native
  /**
    * Modifies an existing subnet group. subnet groups must contain at least one subnet in at least two Availability Zones in the AWS Region.
    */
  def modifyDBSubnetGroup(): Request[ModifyDBSubnetGroupResult, AWSError] = js.native
  def modifyDBSubnetGroup(callback: js.Function2[/* err */ AWSError, /* data */ ModifyDBSubnetGroupResult, Unit]): Request[ModifyDBSubnetGroupResult, AWSError] = js.native
  /**
    * Modifies an existing subnet group. subnet groups must contain at least one subnet in at least two Availability Zones in the AWS Region.
    */
  def modifyDBSubnetGroup(params: ModifyDBSubnetGroupMessage): Request[ModifyDBSubnetGroupResult, AWSError] = js.native
  def modifyDBSubnetGroup(
    params: ModifyDBSubnetGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyDBSubnetGroupResult, Unit]
  ): Request[ModifyDBSubnetGroupResult, AWSError] = js.native
  /**
    * You might need to reboot your instance, usually for maintenance reasons. For example, if you make certain changes, or if you change the cluster parameter group that is associated with the instance, you must reboot the instance for the changes to take effect.  Rebooting an instance restarts the database engine service. Rebooting an instance results in a momentary outage, during which the instance status is set to rebooting. 
    */
  def rebootDBInstance(): Request[RebootDBInstanceResult, AWSError] = js.native
  def rebootDBInstance(callback: js.Function2[/* err */ AWSError, /* data */ RebootDBInstanceResult, Unit]): Request[RebootDBInstanceResult, AWSError] = js.native
  /**
    * You might need to reboot your instance, usually for maintenance reasons. For example, if you make certain changes, or if you change the cluster parameter group that is associated with the instance, you must reboot the instance for the changes to take effect.  Rebooting an instance restarts the database engine service. Rebooting an instance results in a momentary outage, during which the instance status is set to rebooting. 
    */
  def rebootDBInstance(params: RebootDBInstanceMessage): Request[RebootDBInstanceResult, AWSError] = js.native
  def rebootDBInstance(
    params: RebootDBInstanceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ RebootDBInstanceResult, Unit]
  ): Request[RebootDBInstanceResult, AWSError] = js.native
  /**
    * Removes metadata tags from an Amazon DocumentDB resource.
    */
  def removeTagsFromResource(): Request[js.Object, AWSError] = js.native
  def removeTagsFromResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes metadata tags from an Amazon DocumentDB resource.
    */
  def removeTagsFromResource(params: RemoveTagsFromResourceMessage): Request[js.Object, AWSError] = js.native
  def removeTagsFromResource(
    params: RemoveTagsFromResourceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    *  Modifies the parameters of a cluster parameter group to the default value. To reset specific parameters, submit a list of the following: ParameterName and ApplyMethod. To reset the entire cluster parameter group, specify the DBClusterParameterGroupName and ResetAllParameters parameters.   When you reset the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance reboot.
    */
  def resetDBClusterParameterGroup(): Request[DBClusterParameterGroupNameMessage, AWSError] = js.native
  def resetDBClusterParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ DBClusterParameterGroupNameMessage, Unit]): Request[DBClusterParameterGroupNameMessage, AWSError] = js.native
  /**
    *  Modifies the parameters of a cluster parameter group to the default value. To reset specific parameters, submit a list of the following: ParameterName and ApplyMethod. To reset the entire cluster parameter group, specify the DBClusterParameterGroupName and ResetAllParameters parameters.   When you reset the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance reboot.
    */
  def resetDBClusterParameterGroup(params: ResetDBClusterParameterGroupMessage): Request[DBClusterParameterGroupNameMessage, AWSError] = js.native
  def resetDBClusterParameterGroup(
    params: ResetDBClusterParameterGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DBClusterParameterGroupNameMessage, Unit]
  ): Request[DBClusterParameterGroupNameMessage, AWSError] = js.native
  /**
    * Creates a new cluster from a snapshot or cluster snapshot. If a snapshot is specified, the target cluster is created from the source DB snapshot with a default configuration and default security group. If a cluster snapshot is specified, the target cluster is created from the source cluster restore point with the same configuration as the original source DB cluster, except that the new cluster is created with the default security group.
    */
  def restoreDBClusterFromSnapshot(): Request[RestoreDBClusterFromSnapshotResult, AWSError] = js.native
  def restoreDBClusterFromSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ RestoreDBClusterFromSnapshotResult, Unit]): Request[RestoreDBClusterFromSnapshotResult, AWSError] = js.native
  /**
    * Creates a new cluster from a snapshot or cluster snapshot. If a snapshot is specified, the target cluster is created from the source DB snapshot with a default configuration and default security group. If a cluster snapshot is specified, the target cluster is created from the source cluster restore point with the same configuration as the original source DB cluster, except that the new cluster is created with the default security group.
    */
  def restoreDBClusterFromSnapshot(params: RestoreDBClusterFromSnapshotMessage): Request[RestoreDBClusterFromSnapshotResult, AWSError] = js.native
  def restoreDBClusterFromSnapshot(
    params: RestoreDBClusterFromSnapshotMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ RestoreDBClusterFromSnapshotResult, Unit]
  ): Request[RestoreDBClusterFromSnapshotResult, AWSError] = js.native
  /**
    * Restores a cluster to an arbitrary point in time. Users can restore to any point in time before LatestRestorableTime for up to BackupRetentionPeriod days. The target cluster is created from the source cluster with the same configuration as the original cluster, except that the new cluster is created with the default security group. 
    */
  def restoreDBClusterToPointInTime(): Request[RestoreDBClusterToPointInTimeResult, AWSError] = js.native
  def restoreDBClusterToPointInTime(callback: js.Function2[/* err */ AWSError, /* data */ RestoreDBClusterToPointInTimeResult, Unit]): Request[RestoreDBClusterToPointInTimeResult, AWSError] = js.native
  /**
    * Restores a cluster to an arbitrary point in time. Users can restore to any point in time before LatestRestorableTime for up to BackupRetentionPeriod days. The target cluster is created from the source cluster with the same configuration as the original cluster, except that the new cluster is created with the default security group. 
    */
  def restoreDBClusterToPointInTime(params: RestoreDBClusterToPointInTimeMessage): Request[RestoreDBClusterToPointInTimeResult, AWSError] = js.native
  def restoreDBClusterToPointInTime(
    params: RestoreDBClusterToPointInTimeMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ RestoreDBClusterToPointInTimeResult, Unit]
  ): Request[RestoreDBClusterToPointInTimeResult, AWSError] = js.native
  /**
    * Restarts the stopped cluster that is specified by DBClusterIdentifier. For more information, see Stopping and Starting an Amazon DocumentDB Cluster.
    */
  def startDBCluster(): Request[StartDBClusterResult, AWSError] = js.native
  def startDBCluster(callback: js.Function2[/* err */ AWSError, /* data */ StartDBClusterResult, Unit]): Request[StartDBClusterResult, AWSError] = js.native
  /**
    * Restarts the stopped cluster that is specified by DBClusterIdentifier. For more information, see Stopping and Starting an Amazon DocumentDB Cluster.
    */
  def startDBCluster(params: StartDBClusterMessage): Request[StartDBClusterResult, AWSError] = js.native
  def startDBCluster(
    params: StartDBClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ StartDBClusterResult, Unit]
  ): Request[StartDBClusterResult, AWSError] = js.native
  /**
    * Stops the running cluster that is specified by DBClusterIdentifier. The cluster must be in the available state. For more information, see Stopping and Starting an Amazon DocumentDB Cluster.
    */
  def stopDBCluster(): Request[StopDBClusterResult, AWSError] = js.native
  def stopDBCluster(callback: js.Function2[/* err */ AWSError, /* data */ StopDBClusterResult, Unit]): Request[StopDBClusterResult, AWSError] = js.native
  /**
    * Stops the running cluster that is specified by DBClusterIdentifier. The cluster must be in the available state. For more information, see Stopping and Starting an Amazon DocumentDB Cluster.
    */
  def stopDBCluster(params: StopDBClusterMessage): Request[StopDBClusterResult, AWSError] = js.native
  def stopDBCluster(
    params: StopDBClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ StopDBClusterResult, Unit]
  ): Request[StopDBClusterResult, AWSError] = js.native
  /**
    * Waits for the dBInstanceAvailable state by periodically calling the underlying DocDB.describeDBInstancesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBInstanceAvailable(state: dBInstanceAvailable): Request[DBInstanceMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_dBInstanceAvailable(
    state: dBInstanceAvailable,
    callback: js.Function2[/* err */ AWSError, /* data */ DBInstanceMessage, Unit]
  ): Request[DBInstanceMessage, AWSError] = js.native
  /**
    * Waits for the dBInstanceAvailable state by periodically calling the underlying DocDB.describeDBInstancesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBInstanceAvailable(state: dBInstanceAvailable, params: DescribeDBInstancesMessag): Request[DBInstanceMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_dBInstanceAvailable(
    state: dBInstanceAvailable,
    params: DescribeDBInstancesMessag,
    callback: js.Function2[/* err */ AWSError, /* data */ DBInstanceMessage, Unit]
  ): Request[DBInstanceMessage, AWSError] = js.native
  /**
    * Waits for the dBInstanceDeleted state by periodically calling the underlying DocDB.describeDBInstancesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBInstanceDeleted(state: dBInstanceDeleted): Request[DBInstanceMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_dBInstanceDeleted(
    state: dBInstanceDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DBInstanceMessage, Unit]
  ): Request[DBInstanceMessage, AWSError] = js.native
  /**
    * Waits for the dBInstanceDeleted state by periodically calling the underlying DocDB.describeDBInstancesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBInstanceDeleted(state: dBInstanceDeleted, params: DescribeDBInstancesMessag): Request[DBInstanceMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_dBInstanceDeleted(
    state: dBInstanceDeleted,
    params: DescribeDBInstancesMessag,
    callback: js.Function2[/* err */ AWSError, /* data */ DBInstanceMessage, Unit]
  ): Request[DBInstanceMessage, AWSError] = js.native
}

