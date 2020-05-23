package typings.awsSdk.dmsMod

import typings.awsSdk.anon.DescribeConnectionsMessag
import typings.awsSdk.anon.DescribeEndpointsMessagew
import typings.awsSdk.anon.DescribeReplicationInstan
import typings.awsSdk.anon.DescribeReplicationTasksM
import typings.awsSdk.awsSdkStrings.endpointDeleted
import typings.awsSdk.awsSdkStrings.replicationInstanceAvailable
import typings.awsSdk.awsSdkStrings.replicationInstanceDeleted
import typings.awsSdk.awsSdkStrings.replicationTaskDeleted
import typings.awsSdk.awsSdkStrings.replicationTaskReady
import typings.awsSdk.awsSdkStrings.replicationTaskRunning
import typings.awsSdk.awsSdkStrings.replicationTaskStopped
import typings.awsSdk.awsSdkStrings.testConnectionSucceeds
import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DMS extends Service {
  @JSName("config")
  var config_DMS: ConfigBase with ClientConfiguration = js.native
  /**
    * Adds metadata tags to an AWS DMS resource, including replication instance, endpoint, security group, and migration task. These tags can also be used with cost allocation reporting to track cost associated with DMS resources, or used in a Condition statement in an IAM policy for DMS.
    */
  def addTagsToResource(): Request[AddTagsToResourceResponse, AWSError] = js.native
  def addTagsToResource(callback: js.Function2[/* err */ AWSError, /* data */ AddTagsToResourceResponse, Unit]): Request[AddTagsToResourceResponse, AWSError] = js.native
  /**
    * Adds metadata tags to an AWS DMS resource, including replication instance, endpoint, security group, and migration task. These tags can also be used with cost allocation reporting to track cost associated with DMS resources, or used in a Condition statement in an IAM policy for DMS.
    */
  def addTagsToResource(params: AddTagsToResourceMessage): Request[AddTagsToResourceResponse, AWSError] = js.native
  def addTagsToResource(
    params: AddTagsToResourceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ AddTagsToResourceResponse, Unit]
  ): Request[AddTagsToResourceResponse, AWSError] = js.native
  /**
    * Applies a pending maintenance action to a resource (for example, to a replication instance).
    */
  def applyPendingMaintenanceAction(): Request[ApplyPendingMaintenanceActionResponse, AWSError] = js.native
  def applyPendingMaintenanceAction(callback: js.Function2[/* err */ AWSError, /* data */ ApplyPendingMaintenanceActionResponse, Unit]): Request[ApplyPendingMaintenanceActionResponse, AWSError] = js.native
  /**
    * Applies a pending maintenance action to a resource (for example, to a replication instance).
    */
  def applyPendingMaintenanceAction(params: ApplyPendingMaintenanceActionMessage): Request[ApplyPendingMaintenanceActionResponse, AWSError] = js.native
  def applyPendingMaintenanceAction(
    params: ApplyPendingMaintenanceActionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ApplyPendingMaintenanceActionResponse, Unit]
  ): Request[ApplyPendingMaintenanceActionResponse, AWSError] = js.native
  /**
    * Creates an endpoint using the provided settings.
    */
  def createEndpoint(): Request[CreateEndpointResponse, AWSError] = js.native
  def createEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointResponse, Unit]): Request[CreateEndpointResponse, AWSError] = js.native
  /**
    * Creates an endpoint using the provided settings.
    */
  def createEndpoint(params: CreateEndpointMessage): Request[CreateEndpointResponse, AWSError] = js.native
  def createEndpoint(
    params: CreateEndpointMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointResponse, Unit]
  ): Request[CreateEndpointResponse, AWSError] = js.native
  /**
    *  Creates an AWS DMS event notification subscription.  You can specify the type of source (SourceType) you want to be notified of, provide a list of AWS DMS source IDs (SourceIds) that triggers the events, and provide a list of event categories (EventCategories) for events you want to be notified of. If you specify both the SourceType and SourceIds, such as SourceType = replication-instance and SourceIdentifier = my-replinstance, you will be notified of all the replication instance events for the specified source. If you specify a SourceType but don't specify a SourceIdentifier, you receive notice of the events for that source type for all your AWS DMS sources. If you don't specify either SourceType nor SourceIdentifier, you will be notified of events generated from all AWS DMS sources belonging to your customer account. For more information about AWS DMS events, see Working with Events and Notifications in the AWS Database Migration Service User Guide. 
    */
  def createEventSubscription(): Request[CreateEventSubscriptionResponse, AWSError] = js.native
  def createEventSubscription(callback: js.Function2[/* err */ AWSError, /* data */ CreateEventSubscriptionResponse, Unit]): Request[CreateEventSubscriptionResponse, AWSError] = js.native
  /**
    *  Creates an AWS DMS event notification subscription.  You can specify the type of source (SourceType) you want to be notified of, provide a list of AWS DMS source IDs (SourceIds) that triggers the events, and provide a list of event categories (EventCategories) for events you want to be notified of. If you specify both the SourceType and SourceIds, such as SourceType = replication-instance and SourceIdentifier = my-replinstance, you will be notified of all the replication instance events for the specified source. If you specify a SourceType but don't specify a SourceIdentifier, you receive notice of the events for that source type for all your AWS DMS sources. If you don't specify either SourceType nor SourceIdentifier, you will be notified of events generated from all AWS DMS sources belonging to your customer account. For more information about AWS DMS events, see Working with Events and Notifications in the AWS Database Migration Service User Guide. 
    */
  def createEventSubscription(params: CreateEventSubscriptionMessage): Request[CreateEventSubscriptionResponse, AWSError] = js.native
  def createEventSubscription(
    params: CreateEventSubscriptionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEventSubscriptionResponse, Unit]
  ): Request[CreateEventSubscriptionResponse, AWSError] = js.native
  /**
    * Creates the replication instance using the specified parameters. AWS DMS requires that your account have certain roles with appropriate permissions before you can create a replication instance. For information on the required roles, see Creating the IAM Roles to Use With the AWS CLI and AWS DMS API. For information on the required permissions, see IAM Permissions Needed to Use AWS DMS.
    */
  def createReplicationInstance(): Request[CreateReplicationInstanceResponse, AWSError] = js.native
  def createReplicationInstance(callback: js.Function2[/* err */ AWSError, /* data */ CreateReplicationInstanceResponse, Unit]): Request[CreateReplicationInstanceResponse, AWSError] = js.native
  /**
    * Creates the replication instance using the specified parameters. AWS DMS requires that your account have certain roles with appropriate permissions before you can create a replication instance. For information on the required roles, see Creating the IAM Roles to Use With the AWS CLI and AWS DMS API. For information on the required permissions, see IAM Permissions Needed to Use AWS DMS.
    */
  def createReplicationInstance(params: CreateReplicationInstanceMessage): Request[CreateReplicationInstanceResponse, AWSError] = js.native
  def createReplicationInstance(
    params: CreateReplicationInstanceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateReplicationInstanceResponse, Unit]
  ): Request[CreateReplicationInstanceResponse, AWSError] = js.native
  /**
    * Creates a replication subnet group given a list of the subnet IDs in a VPC.
    */
  def createReplicationSubnetGroup(): Request[CreateReplicationSubnetGroupResponse, AWSError] = js.native
  def createReplicationSubnetGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateReplicationSubnetGroupResponse, Unit]): Request[CreateReplicationSubnetGroupResponse, AWSError] = js.native
  /**
    * Creates a replication subnet group given a list of the subnet IDs in a VPC.
    */
  def createReplicationSubnetGroup(params: CreateReplicationSubnetGroupMessage): Request[CreateReplicationSubnetGroupResponse, AWSError] = js.native
  def createReplicationSubnetGroup(
    params: CreateReplicationSubnetGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateReplicationSubnetGroupResponse, Unit]
  ): Request[CreateReplicationSubnetGroupResponse, AWSError] = js.native
  /**
    * Creates a replication task using the specified parameters.
    */
  def createReplicationTask(): Request[CreateReplicationTaskResponse, AWSError] = js.native
  def createReplicationTask(callback: js.Function2[/* err */ AWSError, /* data */ CreateReplicationTaskResponse, Unit]): Request[CreateReplicationTaskResponse, AWSError] = js.native
  /**
    * Creates a replication task using the specified parameters.
    */
  def createReplicationTask(params: CreateReplicationTaskMessage): Request[CreateReplicationTaskResponse, AWSError] = js.native
  def createReplicationTask(
    params: CreateReplicationTaskMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateReplicationTaskResponse, Unit]
  ): Request[CreateReplicationTaskResponse, AWSError] = js.native
  /**
    * Deletes the specified certificate. 
    */
  def deleteCertificate(): Request[DeleteCertificateResponse, AWSError] = js.native
  def deleteCertificate(callback: js.Function2[/* err */ AWSError, /* data */ DeleteCertificateResponse, Unit]): Request[DeleteCertificateResponse, AWSError] = js.native
  /**
    * Deletes the specified certificate. 
    */
  def deleteCertificate(params: DeleteCertificateMessage): Request[DeleteCertificateResponse, AWSError] = js.native
  def deleteCertificate(
    params: DeleteCertificateMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCertificateResponse, Unit]
  ): Request[DeleteCertificateResponse, AWSError] = js.native
  /**
    * Deletes the connection between a replication instance and an endpoint.
    */
  def deleteConnection(): Request[DeleteConnectionResponse, AWSError] = js.native
  def deleteConnection(callback: js.Function2[/* err */ AWSError, /* data */ DeleteConnectionResponse, Unit]): Request[DeleteConnectionResponse, AWSError] = js.native
  /**
    * Deletes the connection between a replication instance and an endpoint.
    */
  def deleteConnection(params: DeleteConnectionMessage): Request[DeleteConnectionResponse, AWSError] = js.native
  def deleteConnection(
    params: DeleteConnectionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConnectionResponse, Unit]
  ): Request[DeleteConnectionResponse, AWSError] = js.native
  /**
    * Deletes the specified endpoint.  All tasks associated with the endpoint must be deleted before you can delete the endpoint.  
    */
  def deleteEndpoint(): Request[DeleteEndpointResponse, AWSError] = js.native
  def deleteEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEndpointResponse, Unit]): Request[DeleteEndpointResponse, AWSError] = js.native
  /**
    * Deletes the specified endpoint.  All tasks associated with the endpoint must be deleted before you can delete the endpoint.  
    */
  def deleteEndpoint(params: DeleteEndpointMessage): Request[DeleteEndpointResponse, AWSError] = js.native
  def deleteEndpoint(
    params: DeleteEndpointMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEndpointResponse, Unit]
  ): Request[DeleteEndpointResponse, AWSError] = js.native
  /**
    *  Deletes an AWS DMS event subscription. 
    */
  def deleteEventSubscription(): Request[DeleteEventSubscriptionResponse, AWSError] = js.native
  def deleteEventSubscription(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEventSubscriptionResponse, Unit]): Request[DeleteEventSubscriptionResponse, AWSError] = js.native
  /**
    *  Deletes an AWS DMS event subscription. 
    */
  def deleteEventSubscription(params: DeleteEventSubscriptionMessage): Request[DeleteEventSubscriptionResponse, AWSError] = js.native
  def deleteEventSubscription(
    params: DeleteEventSubscriptionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEventSubscriptionResponse, Unit]
  ): Request[DeleteEventSubscriptionResponse, AWSError] = js.native
  /**
    * Deletes the specified replication instance.  You must delete any migration tasks that are associated with the replication instance before you can delete it.  
    */
  def deleteReplicationInstance(): Request[DeleteReplicationInstanceResponse, AWSError] = js.native
  def deleteReplicationInstance(callback: js.Function2[/* err */ AWSError, /* data */ DeleteReplicationInstanceResponse, Unit]): Request[DeleteReplicationInstanceResponse, AWSError] = js.native
  /**
    * Deletes the specified replication instance.  You must delete any migration tasks that are associated with the replication instance before you can delete it.  
    */
  def deleteReplicationInstance(params: DeleteReplicationInstanceMessage): Request[DeleteReplicationInstanceResponse, AWSError] = js.native
  def deleteReplicationInstance(
    params: DeleteReplicationInstanceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteReplicationInstanceResponse, Unit]
  ): Request[DeleteReplicationInstanceResponse, AWSError] = js.native
  /**
    * Deletes a subnet group.
    */
  def deleteReplicationSubnetGroup(): Request[DeleteReplicationSubnetGroupResponse, AWSError] = js.native
  def deleteReplicationSubnetGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteReplicationSubnetGroupResponse, Unit]): Request[DeleteReplicationSubnetGroupResponse, AWSError] = js.native
  /**
    * Deletes a subnet group.
    */
  def deleteReplicationSubnetGroup(params: DeleteReplicationSubnetGroupMessage): Request[DeleteReplicationSubnetGroupResponse, AWSError] = js.native
  def deleteReplicationSubnetGroup(
    params: DeleteReplicationSubnetGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteReplicationSubnetGroupResponse, Unit]
  ): Request[DeleteReplicationSubnetGroupResponse, AWSError] = js.native
  /**
    * Deletes the specified replication task.
    */
  def deleteReplicationTask(): Request[DeleteReplicationTaskResponse, AWSError] = js.native
  def deleteReplicationTask(callback: js.Function2[/* err */ AWSError, /* data */ DeleteReplicationTaskResponse, Unit]): Request[DeleteReplicationTaskResponse, AWSError] = js.native
  /**
    * Deletes the specified replication task.
    */
  def deleteReplicationTask(params: DeleteReplicationTaskMessage): Request[DeleteReplicationTaskResponse, AWSError] = js.native
  def deleteReplicationTask(
    params: DeleteReplicationTaskMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteReplicationTaskResponse, Unit]
  ): Request[DeleteReplicationTaskResponse, AWSError] = js.native
  /**
    * Lists all of the AWS DMS attributes for a customer account. These attributes include AWS DMS quotas for the account and a unique account identifier in a particular DMS region. DMS quotas include a list of resource quotas supported by the account, such as the number of replication instances allowed. The description for each resource quota, includes the quota name, current usage toward that quota, and the quota's maximum value. DMS uses the unique account identifier to name each artifact used by DMS in the given region. This command does not take any parameters.
    */
  def describeAccountAttributes(): Request[DescribeAccountAttributesResponse, AWSError] = js.native
  def describeAccountAttributes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountAttributesResponse, Unit]): Request[DescribeAccountAttributesResponse, AWSError] = js.native
  /**
    * Lists all of the AWS DMS attributes for a customer account. These attributes include AWS DMS quotas for the account and a unique account identifier in a particular DMS region. DMS quotas include a list of resource quotas supported by the account, such as the number of replication instances allowed. The description for each resource quota, includes the quota name, current usage toward that quota, and the quota's maximum value. DMS uses the unique account identifier to name each artifact used by DMS in the given region. This command does not take any parameters.
    */
  def describeAccountAttributes(params: DescribeAccountAttributesMessage): Request[DescribeAccountAttributesResponse, AWSError] = js.native
  def describeAccountAttributes(
    params: DescribeAccountAttributesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountAttributesResponse, Unit]
  ): Request[DescribeAccountAttributesResponse, AWSError] = js.native
  /**
    * Provides a description of the certificate.
    */
  def describeCertificates(): Request[DescribeCertificatesResponse, AWSError] = js.native
  def describeCertificates(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCertificatesResponse, Unit]): Request[DescribeCertificatesResponse, AWSError] = js.native
  /**
    * Provides a description of the certificate.
    */
  def describeCertificates(params: DescribeCertificatesMessage): Request[DescribeCertificatesResponse, AWSError] = js.native
  def describeCertificates(
    params: DescribeCertificatesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCertificatesResponse, Unit]
  ): Request[DescribeCertificatesResponse, AWSError] = js.native
  /**
    * Describes the status of the connections that have been made between the replication instance and an endpoint. Connections are created when you test an endpoint.
    */
  def describeConnections(): Request[DescribeConnectionsResponse, AWSError] = js.native
  def describeConnections(callback: js.Function2[/* err */ AWSError, /* data */ DescribeConnectionsResponse, Unit]): Request[DescribeConnectionsResponse, AWSError] = js.native
  /**
    * Describes the status of the connections that have been made between the replication instance and an endpoint. Connections are created when you test an endpoint.
    */
  def describeConnections(params: DescribeConnectionsMessage): Request[DescribeConnectionsResponse, AWSError] = js.native
  def describeConnections(
    params: DescribeConnectionsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConnectionsResponse, Unit]
  ): Request[DescribeConnectionsResponse, AWSError] = js.native
  /**
    * Returns information about the type of endpoints available.
    */
  def describeEndpointTypes(): Request[DescribeEndpointTypesResponse, AWSError] = js.native
  def describeEndpointTypes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointTypesResponse, Unit]): Request[DescribeEndpointTypesResponse, AWSError] = js.native
  /**
    * Returns information about the type of endpoints available.
    */
  def describeEndpointTypes(params: DescribeEndpointTypesMessage): Request[DescribeEndpointTypesResponse, AWSError] = js.native
  def describeEndpointTypes(
    params: DescribeEndpointTypesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointTypesResponse, Unit]
  ): Request[DescribeEndpointTypesResponse, AWSError] = js.native
  /**
    * Returns information about the endpoints for your account in the current region.
    */
  def describeEndpoints(): Request[DescribeEndpointsResponse, AWSError] = js.native
  def describeEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointsResponse, Unit]): Request[DescribeEndpointsResponse, AWSError] = js.native
  /**
    * Returns information about the endpoints for your account in the current region.
    */
  def describeEndpoints(params: DescribeEndpointsMessage): Request[DescribeEndpointsResponse, AWSError] = js.native
  def describeEndpoints(
    params: DescribeEndpointsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointsResponse, Unit]
  ): Request[DescribeEndpointsResponse, AWSError] = js.native
  /**
    * Lists categories for all event source types, or, if specified, for a specified source type. You can see a list of the event categories and source types in Working with Events and Notifications in the AWS Database Migration Service User Guide. 
    */
  def describeEventCategories(): Request[DescribeEventCategoriesResponse, AWSError] = js.native
  def describeEventCategories(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventCategoriesResponse, Unit]): Request[DescribeEventCategoriesResponse, AWSError] = js.native
  /**
    * Lists categories for all event source types, or, if specified, for a specified source type. You can see a list of the event categories and source types in Working with Events and Notifications in the AWS Database Migration Service User Guide. 
    */
  def describeEventCategories(params: DescribeEventCategoriesMessage): Request[DescribeEventCategoriesResponse, AWSError] = js.native
  def describeEventCategories(
    params: DescribeEventCategoriesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventCategoriesResponse, Unit]
  ): Request[DescribeEventCategoriesResponse, AWSError] = js.native
  /**
    * Lists all the event subscriptions for a customer account. The description of a subscription includes SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status.  If you specify SubscriptionName, this action lists the description for that subscription.
    */
  def describeEventSubscriptions(): Request[DescribeEventSubscriptionsResponse, AWSError] = js.native
  def describeEventSubscriptions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventSubscriptionsResponse, Unit]): Request[DescribeEventSubscriptionsResponse, AWSError] = js.native
  /**
    * Lists all the event subscriptions for a customer account. The description of a subscription includes SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status.  If you specify SubscriptionName, this action lists the description for that subscription.
    */
  def describeEventSubscriptions(params: DescribeEventSubscriptionsMessage): Request[DescribeEventSubscriptionsResponse, AWSError] = js.native
  def describeEventSubscriptions(
    params: DescribeEventSubscriptionsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventSubscriptionsResponse, Unit]
  ): Request[DescribeEventSubscriptionsResponse, AWSError] = js.native
  /**
    *  Lists events for a given source identifier and source type. You can also specify a start and end time. For more information on AWS DMS events, see Working with Events and Notifications in the AWS Database Migration User Guide. 
    */
  def describeEvents(): Request[DescribeEventsResponse, AWSError] = js.native
  def describeEvents(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventsResponse, Unit]): Request[DescribeEventsResponse, AWSError] = js.native
  /**
    *  Lists events for a given source identifier and source type. You can also specify a start and end time. For more information on AWS DMS events, see Working with Events and Notifications in the AWS Database Migration User Guide. 
    */
  def describeEvents(params: DescribeEventsMessage): Request[DescribeEventsResponse, AWSError] = js.native
  def describeEvents(
    params: DescribeEventsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventsResponse, Unit]
  ): Request[DescribeEventsResponse, AWSError] = js.native
  /**
    * Returns information about the replication instance types that can be created in the specified region.
    */
  def describeOrderableReplicationInstances(): Request[DescribeOrderableReplicationInstancesResponse, AWSError] = js.native
  def describeOrderableReplicationInstances(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrderableReplicationInstancesResponse, Unit]
  ): Request[DescribeOrderableReplicationInstancesResponse, AWSError] = js.native
  /**
    * Returns information about the replication instance types that can be created in the specified region.
    */
  def describeOrderableReplicationInstances(params: DescribeOrderableReplicationInstancesMessage): Request[DescribeOrderableReplicationInstancesResponse, AWSError] = js.native
  def describeOrderableReplicationInstances(
    params: DescribeOrderableReplicationInstancesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrderableReplicationInstancesResponse, Unit]
  ): Request[DescribeOrderableReplicationInstancesResponse, AWSError] = js.native
  /**
    * For internal use only
    */
  def describePendingMaintenanceActions(): Request[DescribePendingMaintenanceActionsResponse, AWSError] = js.native
  def describePendingMaintenanceActions(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePendingMaintenanceActionsResponse, Unit]
  ): Request[DescribePendingMaintenanceActionsResponse, AWSError] = js.native
  /**
    * For internal use only
    */
  def describePendingMaintenanceActions(params: DescribePendingMaintenanceActionsMessage): Request[DescribePendingMaintenanceActionsResponse, AWSError] = js.native
  def describePendingMaintenanceActions(
    params: DescribePendingMaintenanceActionsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePendingMaintenanceActionsResponse, Unit]
  ): Request[DescribePendingMaintenanceActionsResponse, AWSError] = js.native
  /**
    * Returns the status of the RefreshSchemas operation.
    */
  def describeRefreshSchemasStatus(): Request[DescribeRefreshSchemasStatusResponse, AWSError] = js.native
  def describeRefreshSchemasStatus(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRefreshSchemasStatusResponse, Unit]): Request[DescribeRefreshSchemasStatusResponse, AWSError] = js.native
  /**
    * Returns the status of the RefreshSchemas operation.
    */
  def describeRefreshSchemasStatus(params: DescribeRefreshSchemasStatusMessage): Request[DescribeRefreshSchemasStatusResponse, AWSError] = js.native
  def describeRefreshSchemasStatus(
    params: DescribeRefreshSchemasStatusMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRefreshSchemasStatusResponse, Unit]
  ): Request[DescribeRefreshSchemasStatusResponse, AWSError] = js.native
  /**
    * Returns information about the task logs for the specified task.
    */
  def describeReplicationInstanceTaskLogs(): Request[DescribeReplicationInstanceTaskLogsResponse, AWSError] = js.native
  def describeReplicationInstanceTaskLogs(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationInstanceTaskLogsResponse, Unit]
  ): Request[DescribeReplicationInstanceTaskLogsResponse, AWSError] = js.native
  /**
    * Returns information about the task logs for the specified task.
    */
  def describeReplicationInstanceTaskLogs(params: DescribeReplicationInstanceTaskLogsMessage): Request[DescribeReplicationInstanceTaskLogsResponse, AWSError] = js.native
  def describeReplicationInstanceTaskLogs(
    params: DescribeReplicationInstanceTaskLogsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationInstanceTaskLogsResponse, Unit]
  ): Request[DescribeReplicationInstanceTaskLogsResponse, AWSError] = js.native
  /**
    * Returns information about replication instances for your account in the current region.
    */
  def describeReplicationInstances(): Request[DescribeReplicationInstancesResponse, AWSError] = js.native
  def describeReplicationInstances(callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationInstancesResponse, Unit]): Request[DescribeReplicationInstancesResponse, AWSError] = js.native
  /**
    * Returns information about replication instances for your account in the current region.
    */
  def describeReplicationInstances(params: DescribeReplicationInstancesMessage): Request[DescribeReplicationInstancesResponse, AWSError] = js.native
  def describeReplicationInstances(
    params: DescribeReplicationInstancesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationInstancesResponse, Unit]
  ): Request[DescribeReplicationInstancesResponse, AWSError] = js.native
  /**
    * Returns information about the replication subnet groups.
    */
  def describeReplicationSubnetGroups(): Request[DescribeReplicationSubnetGroupsResponse, AWSError] = js.native
  def describeReplicationSubnetGroups(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationSubnetGroupsResponse, Unit]
  ): Request[DescribeReplicationSubnetGroupsResponse, AWSError] = js.native
  /**
    * Returns information about the replication subnet groups.
    */
  def describeReplicationSubnetGroups(params: DescribeReplicationSubnetGroupsMessage): Request[DescribeReplicationSubnetGroupsResponse, AWSError] = js.native
  def describeReplicationSubnetGroups(
    params: DescribeReplicationSubnetGroupsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationSubnetGroupsResponse, Unit]
  ): Request[DescribeReplicationSubnetGroupsResponse, AWSError] = js.native
  /**
    * Returns the task assessment results from Amazon S3. This action always returns the latest results.
    */
  def describeReplicationTaskAssessmentResults(): Request[DescribeReplicationTaskAssessmentResultsResponse, AWSError] = js.native
  def describeReplicationTaskAssessmentResults(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeReplicationTaskAssessmentResultsResponse, 
      Unit
    ]
  ): Request[DescribeReplicationTaskAssessmentResultsResponse, AWSError] = js.native
  /**
    * Returns the task assessment results from Amazon S3. This action always returns the latest results.
    */
  def describeReplicationTaskAssessmentResults(params: DescribeReplicationTaskAssessmentResultsMessage): Request[DescribeReplicationTaskAssessmentResultsResponse, AWSError] = js.native
  def describeReplicationTaskAssessmentResults(
    params: DescribeReplicationTaskAssessmentResultsMessage,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeReplicationTaskAssessmentResultsResponse, 
      Unit
    ]
  ): Request[DescribeReplicationTaskAssessmentResultsResponse, AWSError] = js.native
  /**
    * Returns information about replication tasks for your account in the current region.
    */
  def describeReplicationTasks(): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  def describeReplicationTasks(callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationTasksResponse, Unit]): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  /**
    * Returns information about replication tasks for your account in the current region.
    */
  def describeReplicationTasks(params: DescribeReplicationTasksMessage): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  def describeReplicationTasks(
    params: DescribeReplicationTasksMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationTasksResponse, Unit]
  ): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  /**
    * Returns information about the schema for the specified endpoint. 
    */
  def describeSchemas(): Request[DescribeSchemasResponse, AWSError] = js.native
  def describeSchemas(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSchemasResponse, Unit]): Request[DescribeSchemasResponse, AWSError] = js.native
  /**
    * Returns information about the schema for the specified endpoint. 
    */
  def describeSchemas(params: DescribeSchemasMessage): Request[DescribeSchemasResponse, AWSError] = js.native
  def describeSchemas(
    params: DescribeSchemasMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSchemasResponse, Unit]
  ): Request[DescribeSchemasResponse, AWSError] = js.native
  /**
    * Returns table statistics on the database migration task, including table name, rows inserted, rows updated, and rows deleted. Note that the "last updated" column the DMS console only indicates the time that AWS DMS last updated the table statistics record for a table. It does not indicate the time of the last update to the table.
    */
  def describeTableStatistics(): Request[DescribeTableStatisticsResponse, AWSError] = js.native
  def describeTableStatistics(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTableStatisticsResponse, Unit]): Request[DescribeTableStatisticsResponse, AWSError] = js.native
  /**
    * Returns table statistics on the database migration task, including table name, rows inserted, rows updated, and rows deleted. Note that the "last updated" column the DMS console only indicates the time that AWS DMS last updated the table statistics record for a table. It does not indicate the time of the last update to the table.
    */
  def describeTableStatistics(params: DescribeTableStatisticsMessage): Request[DescribeTableStatisticsResponse, AWSError] = js.native
  def describeTableStatistics(
    params: DescribeTableStatisticsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTableStatisticsResponse, Unit]
  ): Request[DescribeTableStatisticsResponse, AWSError] = js.native
  /**
    * Uploads the specified certificate.
    */
  def importCertificate(): Request[ImportCertificateResponse, AWSError] = js.native
  def importCertificate(callback: js.Function2[/* err */ AWSError, /* data */ ImportCertificateResponse, Unit]): Request[ImportCertificateResponse, AWSError] = js.native
  /**
    * Uploads the specified certificate.
    */
  def importCertificate(params: ImportCertificateMessage): Request[ImportCertificateResponse, AWSError] = js.native
  def importCertificate(
    params: ImportCertificateMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportCertificateResponse, Unit]
  ): Request[ImportCertificateResponse, AWSError] = js.native
  /**
    * Lists all tags for an AWS DMS resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists all tags for an AWS DMS resource.
    */
  def listTagsForResource(params: ListTagsForResourceMessage): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Modifies the specified endpoint.
    */
  def modifyEndpoint(): Request[ModifyEndpointResponse, AWSError] = js.native
  def modifyEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ ModifyEndpointResponse, Unit]): Request[ModifyEndpointResponse, AWSError] = js.native
  /**
    * Modifies the specified endpoint.
    */
  def modifyEndpoint(params: ModifyEndpointMessage): Request[ModifyEndpointResponse, AWSError] = js.native
  def modifyEndpoint(
    params: ModifyEndpointMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyEndpointResponse, Unit]
  ): Request[ModifyEndpointResponse, AWSError] = js.native
  /**
    * Modifies an existing AWS DMS event notification subscription. 
    */
  def modifyEventSubscription(): Request[ModifyEventSubscriptionResponse, AWSError] = js.native
  def modifyEventSubscription(callback: js.Function2[/* err */ AWSError, /* data */ ModifyEventSubscriptionResponse, Unit]): Request[ModifyEventSubscriptionResponse, AWSError] = js.native
  /**
    * Modifies an existing AWS DMS event notification subscription. 
    */
  def modifyEventSubscription(params: ModifyEventSubscriptionMessage): Request[ModifyEventSubscriptionResponse, AWSError] = js.native
  def modifyEventSubscription(
    params: ModifyEventSubscriptionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyEventSubscriptionResponse, Unit]
  ): Request[ModifyEventSubscriptionResponse, AWSError] = js.native
  /**
    * Modifies the replication instance to apply new settings. You can change one or more parameters by specifying these parameters and the new values in the request. Some settings are applied during the maintenance window. 
    */
  def modifyReplicationInstance(): Request[ModifyReplicationInstanceResponse, AWSError] = js.native
  def modifyReplicationInstance(callback: js.Function2[/* err */ AWSError, /* data */ ModifyReplicationInstanceResponse, Unit]): Request[ModifyReplicationInstanceResponse, AWSError] = js.native
  /**
    * Modifies the replication instance to apply new settings. You can change one or more parameters by specifying these parameters and the new values in the request. Some settings are applied during the maintenance window. 
    */
  def modifyReplicationInstance(params: ModifyReplicationInstanceMessage): Request[ModifyReplicationInstanceResponse, AWSError] = js.native
  def modifyReplicationInstance(
    params: ModifyReplicationInstanceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyReplicationInstanceResponse, Unit]
  ): Request[ModifyReplicationInstanceResponse, AWSError] = js.native
  /**
    * Modifies the settings for the specified replication subnet group.
    */
  def modifyReplicationSubnetGroup(): Request[ModifyReplicationSubnetGroupResponse, AWSError] = js.native
  def modifyReplicationSubnetGroup(callback: js.Function2[/* err */ AWSError, /* data */ ModifyReplicationSubnetGroupResponse, Unit]): Request[ModifyReplicationSubnetGroupResponse, AWSError] = js.native
  /**
    * Modifies the settings for the specified replication subnet group.
    */
  def modifyReplicationSubnetGroup(params: ModifyReplicationSubnetGroupMessage): Request[ModifyReplicationSubnetGroupResponse, AWSError] = js.native
  def modifyReplicationSubnetGroup(
    params: ModifyReplicationSubnetGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyReplicationSubnetGroupResponse, Unit]
  ): Request[ModifyReplicationSubnetGroupResponse, AWSError] = js.native
  /**
    * Modifies the specified replication task. You can't modify the task endpoints. The task must be stopped before you can modify it.  For more information about AWS DMS tasks, see Working with Migration Tasks in the AWS Database Migration Service User Guide.
    */
  def modifyReplicationTask(): Request[ModifyReplicationTaskResponse, AWSError] = js.native
  def modifyReplicationTask(callback: js.Function2[/* err */ AWSError, /* data */ ModifyReplicationTaskResponse, Unit]): Request[ModifyReplicationTaskResponse, AWSError] = js.native
  /**
    * Modifies the specified replication task. You can't modify the task endpoints. The task must be stopped before you can modify it.  For more information about AWS DMS tasks, see Working with Migration Tasks in the AWS Database Migration Service User Guide.
    */
  def modifyReplicationTask(params: ModifyReplicationTaskMessage): Request[ModifyReplicationTaskResponse, AWSError] = js.native
  def modifyReplicationTask(
    params: ModifyReplicationTaskMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyReplicationTaskResponse, Unit]
  ): Request[ModifyReplicationTaskResponse, AWSError] = js.native
  /**
    * Reboots a replication instance. Rebooting results in a momentary outage, until the replication instance becomes available again.
    */
  def rebootReplicationInstance(): Request[RebootReplicationInstanceResponse, AWSError] = js.native
  def rebootReplicationInstance(callback: js.Function2[/* err */ AWSError, /* data */ RebootReplicationInstanceResponse, Unit]): Request[RebootReplicationInstanceResponse, AWSError] = js.native
  /**
    * Reboots a replication instance. Rebooting results in a momentary outage, until the replication instance becomes available again.
    */
  def rebootReplicationInstance(params: RebootReplicationInstanceMessage): Request[RebootReplicationInstanceResponse, AWSError] = js.native
  def rebootReplicationInstance(
    params: RebootReplicationInstanceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ RebootReplicationInstanceResponse, Unit]
  ): Request[RebootReplicationInstanceResponse, AWSError] = js.native
  /**
    * Populates the schema for the specified endpoint. This is an asynchronous operation and can take several minutes. You can check the status of this operation by calling the DescribeRefreshSchemasStatus operation.
    */
  def refreshSchemas(): Request[RefreshSchemasResponse, AWSError] = js.native
  def refreshSchemas(callback: js.Function2[/* err */ AWSError, /* data */ RefreshSchemasResponse, Unit]): Request[RefreshSchemasResponse, AWSError] = js.native
  /**
    * Populates the schema for the specified endpoint. This is an asynchronous operation and can take several minutes. You can check the status of this operation by calling the DescribeRefreshSchemasStatus operation.
    */
  def refreshSchemas(params: RefreshSchemasMessage): Request[RefreshSchemasResponse, AWSError] = js.native
  def refreshSchemas(
    params: RefreshSchemasMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ RefreshSchemasResponse, Unit]
  ): Request[RefreshSchemasResponse, AWSError] = js.native
  /**
    * Reloads the target database table with the source data. 
    */
  def reloadTables(): Request[ReloadTablesResponse, AWSError] = js.native
  def reloadTables(callback: js.Function2[/* err */ AWSError, /* data */ ReloadTablesResponse, Unit]): Request[ReloadTablesResponse, AWSError] = js.native
  /**
    * Reloads the target database table with the source data. 
    */
  def reloadTables(params: ReloadTablesMessage): Request[ReloadTablesResponse, AWSError] = js.native
  def reloadTables(
    params: ReloadTablesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ReloadTablesResponse, Unit]
  ): Request[ReloadTablesResponse, AWSError] = js.native
  /**
    * Removes metadata tags from a DMS resource.
    */
  def removeTagsFromResource(): Request[RemoveTagsFromResourceResponse, AWSError] = js.native
  def removeTagsFromResource(callback: js.Function2[/* err */ AWSError, /* data */ RemoveTagsFromResourceResponse, Unit]): Request[RemoveTagsFromResourceResponse, AWSError] = js.native
  /**
    * Removes metadata tags from a DMS resource.
    */
  def removeTagsFromResource(params: RemoveTagsFromResourceMessage): Request[RemoveTagsFromResourceResponse, AWSError] = js.native
  def removeTagsFromResource(
    params: RemoveTagsFromResourceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveTagsFromResourceResponse, Unit]
  ): Request[RemoveTagsFromResourceResponse, AWSError] = js.native
  /**
    * Starts the replication task. For more information about AWS DMS tasks, see Working with Migration Tasks  in the AWS Database Migration Service User Guide. 
    */
  def startReplicationTask(): Request[StartReplicationTaskResponse, AWSError] = js.native
  def startReplicationTask(callback: js.Function2[/* err */ AWSError, /* data */ StartReplicationTaskResponse, Unit]): Request[StartReplicationTaskResponse, AWSError] = js.native
  /**
    * Starts the replication task. For more information about AWS DMS tasks, see Working with Migration Tasks  in the AWS Database Migration Service User Guide. 
    */
  def startReplicationTask(params: StartReplicationTaskMessage): Request[StartReplicationTaskResponse, AWSError] = js.native
  def startReplicationTask(
    params: StartReplicationTaskMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ StartReplicationTaskResponse, Unit]
  ): Request[StartReplicationTaskResponse, AWSError] = js.native
  /**
    *  Starts the replication task assessment for unsupported data types in the source database. 
    */
  def startReplicationTaskAssessment(): Request[StartReplicationTaskAssessmentResponse, AWSError] = js.native
  def startReplicationTaskAssessment(
    callback: js.Function2[/* err */ AWSError, /* data */ StartReplicationTaskAssessmentResponse, Unit]
  ): Request[StartReplicationTaskAssessmentResponse, AWSError] = js.native
  /**
    *  Starts the replication task assessment for unsupported data types in the source database. 
    */
  def startReplicationTaskAssessment(params: StartReplicationTaskAssessmentMessage): Request[StartReplicationTaskAssessmentResponse, AWSError] = js.native
  def startReplicationTaskAssessment(
    params: StartReplicationTaskAssessmentMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ StartReplicationTaskAssessmentResponse, Unit]
  ): Request[StartReplicationTaskAssessmentResponse, AWSError] = js.native
  /**
    * Stops the replication task. 
    */
  def stopReplicationTask(): Request[StopReplicationTaskResponse, AWSError] = js.native
  def stopReplicationTask(callback: js.Function2[/* err */ AWSError, /* data */ StopReplicationTaskResponse, Unit]): Request[StopReplicationTaskResponse, AWSError] = js.native
  /**
    * Stops the replication task. 
    */
  def stopReplicationTask(params: StopReplicationTaskMessage): Request[StopReplicationTaskResponse, AWSError] = js.native
  def stopReplicationTask(
    params: StopReplicationTaskMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ StopReplicationTaskResponse, Unit]
  ): Request[StopReplicationTaskResponse, AWSError] = js.native
  /**
    * Tests the connection between the replication instance and the endpoint.
    */
  def testConnection(): Request[TestConnectionResponse, AWSError] = js.native
  def testConnection(callback: js.Function2[/* err */ AWSError, /* data */ TestConnectionResponse, Unit]): Request[TestConnectionResponse, AWSError] = js.native
  /**
    * Tests the connection between the replication instance and the endpoint.
    */
  def testConnection(params: TestConnectionMessage): Request[TestConnectionResponse, AWSError] = js.native
  def testConnection(
    params: TestConnectionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ TestConnectionResponse, Unit]
  ): Request[TestConnectionResponse, AWSError] = js.native
  /**
    * Waits for the endpointDeleted state by periodically calling the underlying DMS.describeEndpointsoperation every 5 seconds (at most 60 times). Wait until testing endpoint is deleted.
    */
  @JSName("waitFor")
  def waitFor_endpointDeleted(state: endpointDeleted): Request[DescribeEndpointsResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_endpointDeleted(
    state: endpointDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointsResponse, Unit]
  ): Request[DescribeEndpointsResponse, AWSError] = js.native
  /**
    * Waits for the endpointDeleted state by periodically calling the underlying DMS.describeEndpointsoperation every 5 seconds (at most 60 times). Wait until testing endpoint is deleted.
    */
  @JSName("waitFor")
  def waitFor_endpointDeleted(state: endpointDeleted, params: DescribeEndpointsMessagew): Request[DescribeEndpointsResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_endpointDeleted(
    state: endpointDeleted,
    params: DescribeEndpointsMessagew,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointsResponse, Unit]
  ): Request[DescribeEndpointsResponse, AWSError] = js.native
  /**
    * Waits for the replicationInstanceAvailable state by periodically calling the underlying DMS.describeReplicationInstancesoperation every 60 seconds (at most 60 times). Wait until DMS replication instance is available.
    */
  @JSName("waitFor")
  def waitFor_replicationInstanceAvailable(state: replicationInstanceAvailable): Request[DescribeReplicationInstancesResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationInstanceAvailable(
    state: replicationInstanceAvailable,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationInstancesResponse, Unit]
  ): Request[DescribeReplicationInstancesResponse, AWSError] = js.native
  /**
    * Waits for the replicationInstanceAvailable state by periodically calling the underlying DMS.describeReplicationInstancesoperation every 60 seconds (at most 60 times). Wait until DMS replication instance is available.
    */
  @JSName("waitFor")
  def waitFor_replicationInstanceAvailable(state: replicationInstanceAvailable, params: DescribeReplicationInstan): Request[DescribeReplicationInstancesResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationInstanceAvailable(
    state: replicationInstanceAvailable,
    params: DescribeReplicationInstan,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationInstancesResponse, Unit]
  ): Request[DescribeReplicationInstancesResponse, AWSError] = js.native
  /**
    * Waits for the replicationInstanceDeleted state by periodically calling the underlying DMS.describeReplicationInstancesoperation every 15 seconds (at most 60 times). Wait until DMS replication instance is deleted.
    */
  @JSName("waitFor")
  def waitFor_replicationInstanceDeleted(state: replicationInstanceDeleted): Request[DescribeReplicationInstancesResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationInstanceDeleted(
    state: replicationInstanceDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationInstancesResponse, Unit]
  ): Request[DescribeReplicationInstancesResponse, AWSError] = js.native
  /**
    * Waits for the replicationInstanceDeleted state by periodically calling the underlying DMS.describeReplicationInstancesoperation every 15 seconds (at most 60 times). Wait until DMS replication instance is deleted.
    */
  @JSName("waitFor")
  def waitFor_replicationInstanceDeleted(state: replicationInstanceDeleted, params: DescribeReplicationInstan): Request[DescribeReplicationInstancesResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationInstanceDeleted(
    state: replicationInstanceDeleted,
    params: DescribeReplicationInstan,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationInstancesResponse, Unit]
  ): Request[DescribeReplicationInstancesResponse, AWSError] = js.native
  /**
    * Waits for the replicationTaskDeleted state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is deleted.
    */
  @JSName("waitFor")
  def waitFor_replicationTaskDeleted(state: replicationTaskDeleted): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationTaskDeleted(
    state: replicationTaskDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationTasksResponse, Unit]
  ): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  /**
    * Waits for the replicationTaskDeleted state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is deleted.
    */
  @JSName("waitFor")
  def waitFor_replicationTaskDeleted(state: replicationTaskDeleted, params: DescribeReplicationTasksM): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationTaskDeleted(
    state: replicationTaskDeleted,
    params: DescribeReplicationTasksM,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationTasksResponse, Unit]
  ): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  /**
    * Waits for the replicationTaskReady state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is ready.
    */
  @JSName("waitFor")
  def waitFor_replicationTaskReady(state: replicationTaskReady): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationTaskReady(
    state: replicationTaskReady,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationTasksResponse, Unit]
  ): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  /**
    * Waits for the replicationTaskReady state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is ready.
    */
  @JSName("waitFor")
  def waitFor_replicationTaskReady(state: replicationTaskReady, params: DescribeReplicationTasksM): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationTaskReady(
    state: replicationTaskReady,
    params: DescribeReplicationTasksM,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationTasksResponse, Unit]
  ): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  /**
    * Waits for the replicationTaskRunning state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is running.
    */
  @JSName("waitFor")
  def waitFor_replicationTaskRunning(state: replicationTaskRunning): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationTaskRunning(
    state: replicationTaskRunning,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationTasksResponse, Unit]
  ): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  /**
    * Waits for the replicationTaskRunning state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is running.
    */
  @JSName("waitFor")
  def waitFor_replicationTaskRunning(state: replicationTaskRunning, params: DescribeReplicationTasksM): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationTaskRunning(
    state: replicationTaskRunning,
    params: DescribeReplicationTasksM,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationTasksResponse, Unit]
  ): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  /**
    * Waits for the replicationTaskStopped state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is stopped.
    */
  @JSName("waitFor")
  def waitFor_replicationTaskStopped(state: replicationTaskStopped): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationTaskStopped(
    state: replicationTaskStopped,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationTasksResponse, Unit]
  ): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  /**
    * Waits for the replicationTaskStopped state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is stopped.
    */
  @JSName("waitFor")
  def waitFor_replicationTaskStopped(state: replicationTaskStopped, params: DescribeReplicationTasksM): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationTaskStopped(
    state: replicationTaskStopped,
    params: DescribeReplicationTasksM,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplicationTasksResponse, Unit]
  ): Request[DescribeReplicationTasksResponse, AWSError] = js.native
  /**
    * Waits for the testConnectionSucceeds state by periodically calling the underlying DMS.describeConnectionsoperation every 5 seconds (at most 60 times). Wait until testing connection succeeds.
    */
  @JSName("waitFor")
  def waitFor_testConnectionSucceeds(state: testConnectionSucceeds): Request[DescribeConnectionsResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_testConnectionSucceeds(
    state: testConnectionSucceeds,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConnectionsResponse, Unit]
  ): Request[DescribeConnectionsResponse, AWSError] = js.native
  /**
    * Waits for the testConnectionSucceeds state by periodically calling the underlying DMS.describeConnectionsoperation every 5 seconds (at most 60 times). Wait until testing connection succeeds.
    */
  @JSName("waitFor")
  def waitFor_testConnectionSucceeds(state: testConnectionSucceeds, params: DescribeConnectionsMessag): Request[DescribeConnectionsResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_testConnectionSucceeds(
    state: testConnectionSucceeds,
    params: DescribeConnectionsMessag,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConnectionsResponse, Unit]
  ): Request[DescribeConnectionsResponse, AWSError] = js.native
}

