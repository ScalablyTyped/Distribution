package typings.awsSdk.healthMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Health extends Service {
  
  @JSName("config")
  var config_Health: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Returns a list of accounts in the organization from AWS Organizations that are affected by the provided event. For more information about the different types of AWS Health events, see Event.  Before you can call this operation, you must first enable AWS Health to work with AWS Organizations. To do this, call the EnableHealthServiceAccessForOrganization operation from your organization's master account.  This API operation uses pagination. Specify the nextToken parameter in the next request to return more results. 
    */
  def describeAffectedAccountsForOrganization(): Request[DescribeAffectedAccountsForOrganizationResponse, AWSError] = js.native
  def describeAffectedAccountsForOrganization(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAffectedAccountsForOrganizationResponse, Unit]
  ): Request[DescribeAffectedAccountsForOrganizationResponse, AWSError] = js.native
  /**
    * Returns a list of accounts in the organization from AWS Organizations that are affected by the provided event. For more information about the different types of AWS Health events, see Event.  Before you can call this operation, you must first enable AWS Health to work with AWS Organizations. To do this, call the EnableHealthServiceAccessForOrganization operation from your organization's master account.  This API operation uses pagination. Specify the nextToken parameter in the next request to return more results. 
    */
  def describeAffectedAccountsForOrganization(params: DescribeAffectedAccountsForOrganizationRequest): Request[DescribeAffectedAccountsForOrganizationResponse, AWSError] = js.native
  def describeAffectedAccountsForOrganization(
    params: DescribeAffectedAccountsForOrganizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAffectedAccountsForOrganizationResponse, Unit]
  ): Request[DescribeAffectedAccountsForOrganizationResponse, AWSError] = js.native
  
  /**
    * Returns a list of entities that have been affected by the specified events, based on the specified filter criteria. Entities can refer to individual customer resources, groups of customer resources, or any other construct, depending on the AWS service. Events that have impact beyond that of the affected entities, or where the extent of impact is unknown, include at least one entity indicating this. At least one event ARN is required. Results are sorted by the lastUpdatedTime of the entity, starting with the most recent.  This API operation uses pagination. Specify the nextToken parameter in the next request to return more results. 
    */
  def describeAffectedEntities(): Request[DescribeAffectedEntitiesResponse, AWSError] = js.native
  def describeAffectedEntities(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAffectedEntitiesResponse, Unit]): Request[DescribeAffectedEntitiesResponse, AWSError] = js.native
  /**
    * Returns a list of entities that have been affected by the specified events, based on the specified filter criteria. Entities can refer to individual customer resources, groups of customer resources, or any other construct, depending on the AWS service. Events that have impact beyond that of the affected entities, or where the extent of impact is unknown, include at least one entity indicating this. At least one event ARN is required. Results are sorted by the lastUpdatedTime of the entity, starting with the most recent.  This API operation uses pagination. Specify the nextToken parameter in the next request to return more results. 
    */
  def describeAffectedEntities(params: DescribeAffectedEntitiesRequest): Request[DescribeAffectedEntitiesResponse, AWSError] = js.native
  def describeAffectedEntities(
    params: DescribeAffectedEntitiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAffectedEntitiesResponse, Unit]
  ): Request[DescribeAffectedEntitiesResponse, AWSError] = js.native
  
  /**
    * Returns a list of entities that have been affected by one or more events for one or more accounts in your organization in AWS Organizations, based on the filter criteria. Entities can refer to individual customer resources, groups of customer resources, or any other construct, depending on the AWS service. At least one event Amazon Resource Name (ARN) and account ID are required. Results are sorted by the lastUpdatedTime of the entity, starting with the most recent. Before you can call this operation, you must first enable AWS Health to work with AWS Organizations. To do this, call the EnableHealthServiceAccessForOrganization operation from your organization's master account.   This API operation uses pagination. Specify the nextToken parameter in the next request to return more results. 
    */
  def describeAffectedEntitiesForOrganization(): Request[DescribeAffectedEntitiesForOrganizationResponse, AWSError] = js.native
  def describeAffectedEntitiesForOrganization(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAffectedEntitiesForOrganizationResponse, Unit]
  ): Request[DescribeAffectedEntitiesForOrganizationResponse, AWSError] = js.native
  /**
    * Returns a list of entities that have been affected by one or more events for one or more accounts in your organization in AWS Organizations, based on the filter criteria. Entities can refer to individual customer resources, groups of customer resources, or any other construct, depending on the AWS service. At least one event Amazon Resource Name (ARN) and account ID are required. Results are sorted by the lastUpdatedTime of the entity, starting with the most recent. Before you can call this operation, you must first enable AWS Health to work with AWS Organizations. To do this, call the EnableHealthServiceAccessForOrganization operation from your organization's master account.   This API operation uses pagination. Specify the nextToken parameter in the next request to return more results. 
    */
  def describeAffectedEntitiesForOrganization(params: DescribeAffectedEntitiesForOrganizationRequest): Request[DescribeAffectedEntitiesForOrganizationResponse, AWSError] = js.native
  def describeAffectedEntitiesForOrganization(
    params: DescribeAffectedEntitiesForOrganizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAffectedEntitiesForOrganizationResponse, Unit]
  ): Request[DescribeAffectedEntitiesForOrganizationResponse, AWSError] = js.native
  
  /**
    * Returns the number of entities that are affected by each of the specified events. If no events are specified, the counts of all affected entities are returned.
    */
  def describeEntityAggregates(): Request[DescribeEntityAggregatesResponse, AWSError] = js.native
  def describeEntityAggregates(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEntityAggregatesResponse, Unit]): Request[DescribeEntityAggregatesResponse, AWSError] = js.native
  /**
    * Returns the number of entities that are affected by each of the specified events. If no events are specified, the counts of all affected entities are returned.
    */
  def describeEntityAggregates(params: DescribeEntityAggregatesRequest): Request[DescribeEntityAggregatesResponse, AWSError] = js.native
  def describeEntityAggregates(
    params: DescribeEntityAggregatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEntityAggregatesResponse, Unit]
  ): Request[DescribeEntityAggregatesResponse, AWSError] = js.native
  
  /**
    * Returns the number of events of each event type (issue, scheduled change, and account notification). If no filter is specified, the counts of all events in each category are returned.  This API operation uses pagination. Specify the nextToken parameter in the next request to return more results. 
    */
  def describeEventAggregates(): Request[DescribeEventAggregatesResponse, AWSError] = js.native
  def describeEventAggregates(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventAggregatesResponse, Unit]): Request[DescribeEventAggregatesResponse, AWSError] = js.native
  /**
    * Returns the number of events of each event type (issue, scheduled change, and account notification). If no filter is specified, the counts of all events in each category are returned.  This API operation uses pagination. Specify the nextToken parameter in the next request to return more results. 
    */
  def describeEventAggregates(params: DescribeEventAggregatesRequest): Request[DescribeEventAggregatesResponse, AWSError] = js.native
  def describeEventAggregates(
    params: DescribeEventAggregatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventAggregatesResponse, Unit]
  ): Request[DescribeEventAggregatesResponse, AWSError] = js.native
  
  /**
    * Returns detailed information about one or more specified events. Information includes standard event data (Region, service, and so on, as returned by DescribeEvents), a detailed event description, and possible additional metadata that depends upon the nature of the event. Affected entities are not included. To retrieve those, use the DescribeAffectedEntities operation. If a specified event cannot be retrieved, an error message is returned for that event.
    */
  def describeEventDetails(): Request[DescribeEventDetailsResponse, AWSError] = js.native
  def describeEventDetails(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventDetailsResponse, Unit]): Request[DescribeEventDetailsResponse, AWSError] = js.native
  /**
    * Returns detailed information about one or more specified events. Information includes standard event data (Region, service, and so on, as returned by DescribeEvents), a detailed event description, and possible additional metadata that depends upon the nature of the event. Affected entities are not included. To retrieve those, use the DescribeAffectedEntities operation. If a specified event cannot be retrieved, an error message is returned for that event.
    */
  def describeEventDetails(params: DescribeEventDetailsRequest): Request[DescribeEventDetailsResponse, AWSError] = js.native
  def describeEventDetails(
    params: DescribeEventDetailsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventDetailsResponse, Unit]
  ): Request[DescribeEventDetailsResponse, AWSError] = js.native
  
  /**
    * Returns detailed information about one or more specified events for one or more accounts in your organization. Information includes standard event data (Region, service, and so on, as returned by DescribeEventsForOrganization), a detailed event description, and possible additional metadata that depends upon the nature of the event. Affected entities are not included; to retrieve those, use the DescribeAffectedEntitiesForOrganization operation. Before you can call this operation, you must first enable AWS Health to work with AWS Organizations. To do this, call the EnableHealthServiceAccessForOrganization operation from your organization's master account. When you call the DescribeEventDetailsForOrganization operation, you specify the organizationEventDetailFilters object in the request. Depending on the AWS Health event type, note the following differences:   If the event is public, the awsAccountId parameter must be empty. If you specify an account ID for a public event, then an error message is returned. That's because the event might apply to all AWS accounts and isn't specific to an account in your organization.   If the event is specific to an account, then you must specify the awsAccountId parameter in the request. If you don't specify an account ID, an error message returns because the event is specific to an AWS account in your organization.    For more information, see Event.
    */
  def describeEventDetailsForOrganization(): Request[DescribeEventDetailsForOrganizationResponse, AWSError] = js.native
  def describeEventDetailsForOrganization(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventDetailsForOrganizationResponse, Unit]
  ): Request[DescribeEventDetailsForOrganizationResponse, AWSError] = js.native
  /**
    * Returns detailed information about one or more specified events for one or more accounts in your organization. Information includes standard event data (Region, service, and so on, as returned by DescribeEventsForOrganization), a detailed event description, and possible additional metadata that depends upon the nature of the event. Affected entities are not included; to retrieve those, use the DescribeAffectedEntitiesForOrganization operation. Before you can call this operation, you must first enable AWS Health to work with AWS Organizations. To do this, call the EnableHealthServiceAccessForOrganization operation from your organization's master account. When you call the DescribeEventDetailsForOrganization operation, you specify the organizationEventDetailFilters object in the request. Depending on the AWS Health event type, note the following differences:   If the event is public, the awsAccountId parameter must be empty. If you specify an account ID for a public event, then an error message is returned. That's because the event might apply to all AWS accounts and isn't specific to an account in your organization.   If the event is specific to an account, then you must specify the awsAccountId parameter in the request. If you don't specify an account ID, an error message returns because the event is specific to an AWS account in your organization.    For more information, see Event.
    */
  def describeEventDetailsForOrganization(params: DescribeEventDetailsForOrganizationRequest): Request[DescribeEventDetailsForOrganizationResponse, AWSError] = js.native
  def describeEventDetailsForOrganization(
    params: DescribeEventDetailsForOrganizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventDetailsForOrganizationResponse, Unit]
  ): Request[DescribeEventDetailsForOrganizationResponse, AWSError] = js.native
  
  /**
    * Returns the event types that meet the specified filter criteria. If no filter criteria are specified, all event types are returned, in no particular order.  This API operation uses pagination. Specify the nextToken parameter in the next request to return more results. 
    */
  def describeEventTypes(): Request[DescribeEventTypesResponse, AWSError] = js.native
  def describeEventTypes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventTypesResponse, Unit]): Request[DescribeEventTypesResponse, AWSError] = js.native
  /**
    * Returns the event types that meet the specified filter criteria. If no filter criteria are specified, all event types are returned, in no particular order.  This API operation uses pagination. Specify the nextToken parameter in the next request to return more results. 
    */
  def describeEventTypes(params: DescribeEventTypesRequest): Request[DescribeEventTypesResponse, AWSError] = js.native
  def describeEventTypes(
    params: DescribeEventTypesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventTypesResponse, Unit]
  ): Request[DescribeEventTypesResponse, AWSError] = js.native
  
  /**
    *  Returns information about events that meet the specified filter criteria. Events are returned in a summary form and do not include the detailed description, any additional metadata that depends on the event type, or any affected resources. To retrieve that information, use the DescribeEventDetails and DescribeAffectedEntities operations. If no filter criteria are specified, all events are returned. Results are sorted by lastModifiedTime, starting with the most recent event.    When you call the DescribeEvents operation and specify an entity for the entityValues parameter, AWS Health might return public events that aren't specific to that resource. For example, if you call DescribeEvents and specify an ID for an Amazon Elastic Compute Cloud (Amazon EC2) instance, AWS Health might return events that aren't specific to that resource or service. To get events that are specific to a service, use the services parameter in the filter object. For more information, see Event.   This API operation uses pagination. Specify the nextToken parameter in the next request to return more results.   
    */
  def describeEvents(): Request[DescribeEventsResponse, AWSError] = js.native
  def describeEvents(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventsResponse, Unit]): Request[DescribeEventsResponse, AWSError] = js.native
  /**
    *  Returns information about events that meet the specified filter criteria. Events are returned in a summary form and do not include the detailed description, any additional metadata that depends on the event type, or any affected resources. To retrieve that information, use the DescribeEventDetails and DescribeAffectedEntities operations. If no filter criteria are specified, all events are returned. Results are sorted by lastModifiedTime, starting with the most recent event.    When you call the DescribeEvents operation and specify an entity for the entityValues parameter, AWS Health might return public events that aren't specific to that resource. For example, if you call DescribeEvents and specify an ID for an Amazon Elastic Compute Cloud (Amazon EC2) instance, AWS Health might return events that aren't specific to that resource or service. To get events that are specific to a service, use the services parameter in the filter object. For more information, see Event.   This API operation uses pagination. Specify the nextToken parameter in the next request to return more results.   
    */
  def describeEvents(params: DescribeEventsRequest): Request[DescribeEventsResponse, AWSError] = js.native
  def describeEvents(
    params: DescribeEventsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventsResponse, Unit]
  ): Request[DescribeEventsResponse, AWSError] = js.native
  
  /**
    * Returns information about events across your organization in AWS Organizations. You can use thefilters parameter to specify the events that you want to return. Events are returned in a summary form and don't include the affected accounts, detailed description, any additional metadata that depends on the event type, or any affected resources. To retrieve that information, use the following operations:    DescribeAffectedAccountsForOrganization     DescribeEventDetailsForOrganization     DescribeAffectedEntitiesForOrganization    If you don't specify a filter, the DescribeEventsForOrganizations returns all events across your organization. Results are sorted by lastModifiedTime, starting with the most recent event.  For more information about the different types of AWS Health events, see Event. Before you can call this operation, you must first enable AWS Health to work with AWS Organizations. To do this, call the EnableHealthServiceAccessForOrganization operation from your organization's master AWS account.  This API operation uses pagination. Specify the nextToken parameter in the next request to return more results. 
    */
  def describeEventsForOrganization(): Request[DescribeEventsForOrganizationResponse, AWSError] = js.native
  def describeEventsForOrganization(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventsForOrganizationResponse, Unit]): Request[DescribeEventsForOrganizationResponse, AWSError] = js.native
  /**
    * Returns information about events across your organization in AWS Organizations. You can use thefilters parameter to specify the events that you want to return. Events are returned in a summary form and don't include the affected accounts, detailed description, any additional metadata that depends on the event type, or any affected resources. To retrieve that information, use the following operations:    DescribeAffectedAccountsForOrganization     DescribeEventDetailsForOrganization     DescribeAffectedEntitiesForOrganization    If you don't specify a filter, the DescribeEventsForOrganizations returns all events across your organization. Results are sorted by lastModifiedTime, starting with the most recent event.  For more information about the different types of AWS Health events, see Event. Before you can call this operation, you must first enable AWS Health to work with AWS Organizations. To do this, call the EnableHealthServiceAccessForOrganization operation from your organization's master AWS account.  This API operation uses pagination. Specify the nextToken parameter in the next request to return more results. 
    */
  def describeEventsForOrganization(params: DescribeEventsForOrganizationRequest): Request[DescribeEventsForOrganizationResponse, AWSError] = js.native
  def describeEventsForOrganization(
    params: DescribeEventsForOrganizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventsForOrganizationResponse, Unit]
  ): Request[DescribeEventsForOrganizationResponse, AWSError] = js.native
  
  /**
    * This operation provides status information on enabling or disabling AWS Health to work with your organization. To call this operation, you must sign in as an IAM user, assume an IAM role, or sign in as the root user (not recommended) in the organization's master account.
    */
  def describeHealthServiceStatusForOrganization(): Request[DescribeHealthServiceStatusForOrganizationResponse, AWSError] = js.native
  def describeHealthServiceStatusForOrganization(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeHealthServiceStatusForOrganizationResponse, 
      Unit
    ]
  ): Request[DescribeHealthServiceStatusForOrganizationResponse, AWSError] = js.native
  
  /**
    * Disables AWS Health from working with AWS Organizations. To call this operation, you must sign in as an AWS Identity and Access Management (IAM) user, assume an IAM role, or sign in as the root user (not recommended) in the organization's master AWS account. For more information, see Aggregating AWS Health events in the AWS Health User Guide. This operation doesn't remove the service-linked role (SLR) from the AWS master account in your organization. You must use the IAM console, API, or AWS Command Line Interface (AWS CLI) to remove the SLR. For more information, see Deleting a Service-Linked Role in the IAM User Guide.  You can also disable the organizational feature by using the Organizations DisableAWSServiceAccess API operation. After you call this operation, AWS Health stops aggregating events for all other AWS accounts in your organization. If you call the AWS Health API operations for organizational view, AWS Health returns an error. AWS Health continues to aggregate health events for your AWS account. 
    */
  def disableHealthServiceAccessForOrganization(): Request[js.Object, AWSError] = js.native
  def disableHealthServiceAccessForOrganization(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Calling this operation enables AWS Health to work with AWS Organizations. This applies a service-linked role (SLR) to the master account in the organization. To call this operation, you must sign in as an IAM user, assume an IAM role, or sign in as the root user (not recommended) in the organization's master account. For more information, see Aggregating AWS Health events in the AWS Health User Guide.
    */
  def enableHealthServiceAccessForOrganization(): Request[js.Object, AWSError] = js.native
  def enableHealthServiceAccessForOrganization(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
}
