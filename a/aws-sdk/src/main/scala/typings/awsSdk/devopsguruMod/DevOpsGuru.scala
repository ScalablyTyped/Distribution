package typings.awsSdk.devopsguruMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevOpsGuru extends Service {
  
  /**
    *  Adds a notification channel to DevOps Guru. A notification channel is used to notify you about important DevOps Guru events, such as when an insight is generated.  If you use an Amazon SNS topic in another account, you must attach a policy to it that grants DevOps Guru permission to it notifications. DevOps Guru adds the required policy on your behalf to send notifications using Amazon SNS in your account. DevOps Guru only supports standard SNS topics. For more information, see Permissions for cross account Amazon SNS topics. If you use an Amazon SNS topic in another account, you must attach a policy to it that grants DevOps Guru permission to it notifications. DevOps Guru adds the required policy on your behalf to send notifications using Amazon SNS in your account. For more information, see Permissions for cross account Amazon SNS topics. If you use an Amazon SNS topic that is encrypted by an Amazon Web Services Key Management Service customer-managed key (CMK), then you must add permissions to the CMK. For more information, see Permissions for Amazon Web Services KMS–encrypted Amazon SNS topics.
    */
  def addNotificationChannel(): Request[AddNotificationChannelResponse, AWSError] = js.native
  def addNotificationChannel(callback: js.Function2[/* err */ AWSError, /* data */ AddNotificationChannelResponse, Unit]): Request[AddNotificationChannelResponse, AWSError] = js.native
  /**
    *  Adds a notification channel to DevOps Guru. A notification channel is used to notify you about important DevOps Guru events, such as when an insight is generated.  If you use an Amazon SNS topic in another account, you must attach a policy to it that grants DevOps Guru permission to it notifications. DevOps Guru adds the required policy on your behalf to send notifications using Amazon SNS in your account. DevOps Guru only supports standard SNS topics. For more information, see Permissions for cross account Amazon SNS topics. If you use an Amazon SNS topic in another account, you must attach a policy to it that grants DevOps Guru permission to it notifications. DevOps Guru adds the required policy on your behalf to send notifications using Amazon SNS in your account. For more information, see Permissions for cross account Amazon SNS topics. If you use an Amazon SNS topic that is encrypted by an Amazon Web Services Key Management Service customer-managed key (CMK), then you must add permissions to the CMK. For more information, see Permissions for Amazon Web Services KMS–encrypted Amazon SNS topics.
    */
  def addNotificationChannel(params: AddNotificationChannelRequest): Request[AddNotificationChannelResponse, AWSError] = js.native
  def addNotificationChannel(
    params: AddNotificationChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddNotificationChannelResponse, Unit]
  ): Request[AddNotificationChannelResponse, AWSError] = js.native
  
  @JSName("config")
  var config_DevOpsGuru: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Deletes the insight along with the associated anomalies, events and recommendations.
    */
  def deleteInsight(): Request[DeleteInsightResponse, AWSError] = js.native
  def deleteInsight(callback: js.Function2[/* err */ AWSError, /* data */ DeleteInsightResponse, Unit]): Request[DeleteInsightResponse, AWSError] = js.native
  /**
    * Deletes the insight along with the associated anomalies, events and recommendations.
    */
  def deleteInsight(params: DeleteInsightRequest): Request[DeleteInsightResponse, AWSError] = js.native
  def deleteInsight(
    params: DeleteInsightRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteInsightResponse, Unit]
  ): Request[DeleteInsightResponse, AWSError] = js.native
  
  /**
    *  Returns the number of open reactive insights, the number of open proactive insights, and the number of metrics analyzed in your Amazon Web Services account. Use these numbers to gauge the health of operations in your Amazon Web Services account. 
    */
  def describeAccountHealth(): Request[DescribeAccountHealthResponse, AWSError] = js.native
  def describeAccountHealth(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountHealthResponse, Unit]): Request[DescribeAccountHealthResponse, AWSError] = js.native
  /**
    *  Returns the number of open reactive insights, the number of open proactive insights, and the number of metrics analyzed in your Amazon Web Services account. Use these numbers to gauge the health of operations in your Amazon Web Services account. 
    */
  def describeAccountHealth(params: DescribeAccountHealthRequest): Request[DescribeAccountHealthResponse, AWSError] = js.native
  def describeAccountHealth(
    params: DescribeAccountHealthRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountHealthResponse, Unit]
  ): Request[DescribeAccountHealthResponse, AWSError] = js.native
  
  /**
    *  For the time range passed in, returns the number of open reactive insight that were created, the number of open proactive insights that were created, and the Mean Time to Recover (MTTR) for all closed reactive insights. 
    */
  def describeAccountOverview(): Request[DescribeAccountOverviewResponse, AWSError] = js.native
  def describeAccountOverview(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountOverviewResponse, Unit]): Request[DescribeAccountOverviewResponse, AWSError] = js.native
  /**
    *  For the time range passed in, returns the number of open reactive insight that were created, the number of open proactive insights that were created, and the Mean Time to Recover (MTTR) for all closed reactive insights. 
    */
  def describeAccountOverview(params: DescribeAccountOverviewRequest): Request[DescribeAccountOverviewResponse, AWSError] = js.native
  def describeAccountOverview(
    params: DescribeAccountOverviewRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountOverviewResponse, Unit]
  ): Request[DescribeAccountOverviewResponse, AWSError] = js.native
  
  /**
    *  Returns details about an anomaly that you specify using its ID. 
    */
  def describeAnomaly(): Request[DescribeAnomalyResponse, AWSError] = js.native
  def describeAnomaly(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAnomalyResponse, Unit]): Request[DescribeAnomalyResponse, AWSError] = js.native
  /**
    *  Returns details about an anomaly that you specify using its ID. 
    */
  def describeAnomaly(params: DescribeAnomalyRequest): Request[DescribeAnomalyResponse, AWSError] = js.native
  def describeAnomaly(
    params: DescribeAnomalyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAnomalyResponse, Unit]
  ): Request[DescribeAnomalyResponse, AWSError] = js.native
  
  /**
    * Returns the integration status of services that are integrated with DevOps Guru as Consumer via EventBridge. The one service that can be integrated with DevOps Guru is Amazon CodeGuru Profiler, which can produce proactive recommendations which can be stored and viewed in DevOps Guru.
    */
  def describeEventSourcesConfig(): Request[DescribeEventSourcesConfigResponse, AWSError] = js.native
  def describeEventSourcesConfig(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventSourcesConfigResponse, Unit]): Request[DescribeEventSourcesConfigResponse, AWSError] = js.native
  /**
    * Returns the integration status of services that are integrated with DevOps Guru as Consumer via EventBridge. The one service that can be integrated with DevOps Guru is Amazon CodeGuru Profiler, which can produce proactive recommendations which can be stored and viewed in DevOps Guru.
    */
  def describeEventSourcesConfig(params: DescribeEventSourcesConfigRequest): Request[DescribeEventSourcesConfigResponse, AWSError] = js.native
  def describeEventSourcesConfig(
    params: DescribeEventSourcesConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventSourcesConfigResponse, Unit]
  ): Request[DescribeEventSourcesConfigResponse, AWSError] = js.native
  
  /**
    *  Returns the most recent feedback submitted in the current Amazon Web Services account and Region. 
    */
  def describeFeedback(): Request[DescribeFeedbackResponse, AWSError] = js.native
  def describeFeedback(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFeedbackResponse, Unit]): Request[DescribeFeedbackResponse, AWSError] = js.native
  /**
    *  Returns the most recent feedback submitted in the current Amazon Web Services account and Region. 
    */
  def describeFeedback(params: DescribeFeedbackRequest): Request[DescribeFeedbackResponse, AWSError] = js.native
  def describeFeedback(
    params: DescribeFeedbackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFeedbackResponse, Unit]
  ): Request[DescribeFeedbackResponse, AWSError] = js.native
  
  /**
    *  Returns details about an insight that you specify using its ID. 
    */
  def describeInsight(): Request[DescribeInsightResponse, AWSError] = js.native
  def describeInsight(callback: js.Function2[/* err */ AWSError, /* data */ DescribeInsightResponse, Unit]): Request[DescribeInsightResponse, AWSError] = js.native
  /**
    *  Returns details about an insight that you specify using its ID. 
    */
  def describeInsight(params: DescribeInsightRequest): Request[DescribeInsightResponse, AWSError] = js.native
  def describeInsight(
    params: DescribeInsightRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInsightResponse, Unit]
  ): Request[DescribeInsightResponse, AWSError] = js.native
  
  /**
    * Returns active insights, predictive insights, and resource hours analyzed in last hour.
    */
  def describeOrganizationHealth(): Request[DescribeOrganizationHealthResponse, AWSError] = js.native
  def describeOrganizationHealth(callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrganizationHealthResponse, Unit]): Request[DescribeOrganizationHealthResponse, AWSError] = js.native
  /**
    * Returns active insights, predictive insights, and resource hours analyzed in last hour.
    */
  def describeOrganizationHealth(params: DescribeOrganizationHealthRequest): Request[DescribeOrganizationHealthResponse, AWSError] = js.native
  def describeOrganizationHealth(
    params: DescribeOrganizationHealthRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrganizationHealthResponse, Unit]
  ): Request[DescribeOrganizationHealthResponse, AWSError] = js.native
  
  /**
    * Returns an overview of your organization's history based on the specified time range. The overview includes the total reactive and proactive insights.
    */
  def describeOrganizationOverview(): Request[DescribeOrganizationOverviewResponse, AWSError] = js.native
  def describeOrganizationOverview(callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrganizationOverviewResponse, Unit]): Request[DescribeOrganizationOverviewResponse, AWSError] = js.native
  /**
    * Returns an overview of your organization's history based on the specified time range. The overview includes the total reactive and proactive insights.
    */
  def describeOrganizationOverview(params: DescribeOrganizationOverviewRequest): Request[DescribeOrganizationOverviewResponse, AWSError] = js.native
  def describeOrganizationOverview(
    params: DescribeOrganizationOverviewRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrganizationOverviewResponse, Unit]
  ): Request[DescribeOrganizationOverviewResponse, AWSError] = js.native
  
  /**
    * Provides an overview of your system's health. If additional member accounts are part of your organization, you can filter those accounts using the AccountIds field.
    */
  def describeOrganizationResourceCollectionHealth(): Request[DescribeOrganizationResourceCollectionHealthResponse, AWSError] = js.native
  def describeOrganizationResourceCollectionHealth(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeOrganizationResourceCollectionHealthResponse, 
      Unit
    ]
  ): Request[DescribeOrganizationResourceCollectionHealthResponse, AWSError] = js.native
  /**
    * Provides an overview of your system's health. If additional member accounts are part of your organization, you can filter those accounts using the AccountIds field.
    */
  def describeOrganizationResourceCollectionHealth(params: DescribeOrganizationResourceCollectionHealthRequest): Request[DescribeOrganizationResourceCollectionHealthResponse, AWSError] = js.native
  def describeOrganizationResourceCollectionHealth(
    params: DescribeOrganizationResourceCollectionHealthRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeOrganizationResourceCollectionHealthResponse, 
      Unit
    ]
  ): Request[DescribeOrganizationResourceCollectionHealthResponse, AWSError] = js.native
  
  /**
    *  Returns the number of open proactive insights, open reactive insights, and the Mean Time to Recover (MTTR) for all closed insights in resource collections in your account. You specify the type of Amazon Web Services resources collection. The two types of Amazon Web Services resource collections supported are Amazon Web Services CloudFormation stacks and Amazon Web Services resources that contain the same Amazon Web Services tag. DevOps Guru can be configured to analyze the Amazon Web Services resources that are defined in the stacks or that are tagged using the same tag key. You can specify up to 500 Amazon Web Services CloudFormation stacks. 
    */
  def describeResourceCollectionHealth(): Request[DescribeResourceCollectionHealthResponse, AWSError] = js.native
  def describeResourceCollectionHealth(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeResourceCollectionHealthResponse, Unit]
  ): Request[DescribeResourceCollectionHealthResponse, AWSError] = js.native
  /**
    *  Returns the number of open proactive insights, open reactive insights, and the Mean Time to Recover (MTTR) for all closed insights in resource collections in your account. You specify the type of Amazon Web Services resources collection. The two types of Amazon Web Services resource collections supported are Amazon Web Services CloudFormation stacks and Amazon Web Services resources that contain the same Amazon Web Services tag. DevOps Guru can be configured to analyze the Amazon Web Services resources that are defined in the stacks or that are tagged using the same tag key. You can specify up to 500 Amazon Web Services CloudFormation stacks. 
    */
  def describeResourceCollectionHealth(params: DescribeResourceCollectionHealthRequest): Request[DescribeResourceCollectionHealthResponse, AWSError] = js.native
  def describeResourceCollectionHealth(
    params: DescribeResourceCollectionHealthRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeResourceCollectionHealthResponse, Unit]
  ): Request[DescribeResourceCollectionHealthResponse, AWSError] = js.native
  
  /**
    *  Returns the integration status of services that are integrated with DevOps Guru. The one service that can be integrated with DevOps Guru is Amazon Web Services Systems Manager, which can be used to create an OpsItem for each generated insight. 
    */
  def describeServiceIntegration(): Request[DescribeServiceIntegrationResponse, AWSError] = js.native
  def describeServiceIntegration(callback: js.Function2[/* err */ AWSError, /* data */ DescribeServiceIntegrationResponse, Unit]): Request[DescribeServiceIntegrationResponse, AWSError] = js.native
  /**
    *  Returns the integration status of services that are integrated with DevOps Guru. The one service that can be integrated with DevOps Guru is Amazon Web Services Systems Manager, which can be used to create an OpsItem for each generated insight. 
    */
  def describeServiceIntegration(params: DescribeServiceIntegrationRequest): Request[DescribeServiceIntegrationResponse, AWSError] = js.native
  def describeServiceIntegration(
    params: DescribeServiceIntegrationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeServiceIntegrationResponse, Unit]
  ): Request[DescribeServiceIntegrationResponse, AWSError] = js.native
  
  /**
    * Returns an estimate of the monthly cost for DevOps Guru to analyze your Amazon Web Services resources. For more information, see Estimate your Amazon DevOps Guru costs and Amazon DevOps Guru pricing.
    */
  def getCostEstimation(): Request[GetCostEstimationResponse, AWSError] = js.native
  def getCostEstimation(callback: js.Function2[/* err */ AWSError, /* data */ GetCostEstimationResponse, Unit]): Request[GetCostEstimationResponse, AWSError] = js.native
  /**
    * Returns an estimate of the monthly cost for DevOps Guru to analyze your Amazon Web Services resources. For more information, see Estimate your Amazon DevOps Guru costs and Amazon DevOps Guru pricing.
    */
  def getCostEstimation(params: GetCostEstimationRequest): Request[GetCostEstimationResponse, AWSError] = js.native
  def getCostEstimation(
    params: GetCostEstimationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCostEstimationResponse, Unit]
  ): Request[GetCostEstimationResponse, AWSError] = js.native
  
  /**
    *  Returns lists Amazon Web Services resources that are of the specified resource collection type. The two types of Amazon Web Services resource collections supported are Amazon Web Services CloudFormation stacks and Amazon Web Services resources that contain the same Amazon Web Services tag. DevOps Guru can be configured to analyze the Amazon Web Services resources that are defined in the stacks or that are tagged using the same tag key. You can specify up to 500 Amazon Web Services CloudFormation stacks. 
    */
  def getResourceCollection(): Request[GetResourceCollectionResponse, AWSError] = js.native
  def getResourceCollection(callback: js.Function2[/* err */ AWSError, /* data */ GetResourceCollectionResponse, Unit]): Request[GetResourceCollectionResponse, AWSError] = js.native
  /**
    *  Returns lists Amazon Web Services resources that are of the specified resource collection type. The two types of Amazon Web Services resource collections supported are Amazon Web Services CloudFormation stacks and Amazon Web Services resources that contain the same Amazon Web Services tag. DevOps Guru can be configured to analyze the Amazon Web Services resources that are defined in the stacks or that are tagged using the same tag key. You can specify up to 500 Amazon Web Services CloudFormation stacks. 
    */
  def getResourceCollection(params: GetResourceCollectionRequest): Request[GetResourceCollectionResponse, AWSError] = js.native
  def getResourceCollection(
    params: GetResourceCollectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourceCollectionResponse, Unit]
  ): Request[GetResourceCollectionResponse, AWSError] = js.native
  
  /**
    *  Returns a list of the anomalies that belong to an insight that you specify using its ID. 
    */
  def listAnomaliesForInsight(): Request[ListAnomaliesForInsightResponse, AWSError] = js.native
  def listAnomaliesForInsight(callback: js.Function2[/* err */ AWSError, /* data */ ListAnomaliesForInsightResponse, Unit]): Request[ListAnomaliesForInsightResponse, AWSError] = js.native
  /**
    *  Returns a list of the anomalies that belong to an insight that you specify using its ID. 
    */
  def listAnomaliesForInsight(params: ListAnomaliesForInsightRequest): Request[ListAnomaliesForInsightResponse, AWSError] = js.native
  def listAnomaliesForInsight(
    params: ListAnomaliesForInsightRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAnomaliesForInsightResponse, Unit]
  ): Request[ListAnomaliesForInsightResponse, AWSError] = js.native
  
  /**
    *  Returns the list of log groups that contain log anomalies. 
    */
  def listAnomalousLogGroups(): Request[ListAnomalousLogGroupsResponse, AWSError] = js.native
  def listAnomalousLogGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListAnomalousLogGroupsResponse, Unit]): Request[ListAnomalousLogGroupsResponse, AWSError] = js.native
  /**
    *  Returns the list of log groups that contain log anomalies. 
    */
  def listAnomalousLogGroups(params: ListAnomalousLogGroupsRequest): Request[ListAnomalousLogGroupsResponse, AWSError] = js.native
  def listAnomalousLogGroups(
    params: ListAnomalousLogGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAnomalousLogGroupsResponse, Unit]
  ): Request[ListAnomalousLogGroupsResponse, AWSError] = js.native
  
  /**
    *  Returns a list of the events emitted by the resources that are evaluated by DevOps Guru. You can use filters to specify which events are returned. 
    */
  def listEvents(): Request[ListEventsResponse, AWSError] = js.native
  def listEvents(callback: js.Function2[/* err */ AWSError, /* data */ ListEventsResponse, Unit]): Request[ListEventsResponse, AWSError] = js.native
  /**
    *  Returns a list of the events emitted by the resources that are evaluated by DevOps Guru. You can use filters to specify which events are returned. 
    */
  def listEvents(params: ListEventsRequest): Request[ListEventsResponse, AWSError] = js.native
  def listEvents(
    params: ListEventsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEventsResponse, Unit]
  ): Request[ListEventsResponse, AWSError] = js.native
  
  /**
    *  Returns a list of insights in your Amazon Web Services account. You can specify which insights are returned by their start time and status (ONGOING, CLOSED, or ANY). 
    */
  def listInsights(): Request[ListInsightsResponse, AWSError] = js.native
  def listInsights(callback: js.Function2[/* err */ AWSError, /* data */ ListInsightsResponse, Unit]): Request[ListInsightsResponse, AWSError] = js.native
  /**
    *  Returns a list of insights in your Amazon Web Services account. You can specify which insights are returned by their start time and status (ONGOING, CLOSED, or ANY). 
    */
  def listInsights(params: ListInsightsRequest): Request[ListInsightsResponse, AWSError] = js.native
  def listInsights(
    params: ListInsightsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInsightsResponse, Unit]
  ): Request[ListInsightsResponse, AWSError] = js.native
  
  /**
    *  Returns the list of all log groups that are being monitored and tagged by DevOps Guru. 
    */
  def listMonitoredResources(): Request[ListMonitoredResourcesResponse, AWSError] = js.native
  def listMonitoredResources(callback: js.Function2[/* err */ AWSError, /* data */ ListMonitoredResourcesResponse, Unit]): Request[ListMonitoredResourcesResponse, AWSError] = js.native
  /**
    *  Returns the list of all log groups that are being monitored and tagged by DevOps Guru. 
    */
  def listMonitoredResources(params: ListMonitoredResourcesRequest): Request[ListMonitoredResourcesResponse, AWSError] = js.native
  def listMonitoredResources(
    params: ListMonitoredResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMonitoredResourcesResponse, Unit]
  ): Request[ListMonitoredResourcesResponse, AWSError] = js.native
  
  /**
    *  Returns a list of notification channels configured for DevOps Guru. Each notification channel is used to notify you when DevOps Guru generates an insight that contains information about how to improve your operations. The one supported notification channel is Amazon Simple Notification Service (Amazon SNS). 
    */
  def listNotificationChannels(): Request[ListNotificationChannelsResponse, AWSError] = js.native
  def listNotificationChannels(callback: js.Function2[/* err */ AWSError, /* data */ ListNotificationChannelsResponse, Unit]): Request[ListNotificationChannelsResponse, AWSError] = js.native
  /**
    *  Returns a list of notification channels configured for DevOps Guru. Each notification channel is used to notify you when DevOps Guru generates an insight that contains information about how to improve your operations. The one supported notification channel is Amazon Simple Notification Service (Amazon SNS). 
    */
  def listNotificationChannels(params: ListNotificationChannelsRequest): Request[ListNotificationChannelsResponse, AWSError] = js.native
  def listNotificationChannels(
    params: ListNotificationChannelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNotificationChannelsResponse, Unit]
  ): Request[ListNotificationChannelsResponse, AWSError] = js.native
  
  /**
    * Returns a list of insights associated with the account or OU Id.
    */
  def listOrganizationInsights(): Request[ListOrganizationInsightsResponse, AWSError] = js.native
  def listOrganizationInsights(callback: js.Function2[/* err */ AWSError, /* data */ ListOrganizationInsightsResponse, Unit]): Request[ListOrganizationInsightsResponse, AWSError] = js.native
  /**
    * Returns a list of insights associated with the account or OU Id.
    */
  def listOrganizationInsights(params: ListOrganizationInsightsRequest): Request[ListOrganizationInsightsResponse, AWSError] = js.native
  def listOrganizationInsights(
    params: ListOrganizationInsightsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListOrganizationInsightsResponse, Unit]
  ): Request[ListOrganizationInsightsResponse, AWSError] = js.native
  
  /**
    *  Returns a list of a specified insight's recommendations. Each recommendation includes a list of related metrics and a list of related events. 
    */
  def listRecommendations(): Request[ListRecommendationsResponse, AWSError] = js.native
  def listRecommendations(callback: js.Function2[/* err */ AWSError, /* data */ ListRecommendationsResponse, Unit]): Request[ListRecommendationsResponse, AWSError] = js.native
  /**
    *  Returns a list of a specified insight's recommendations. Each recommendation includes a list of related metrics and a list of related events. 
    */
  def listRecommendations(params: ListRecommendationsRequest): Request[ListRecommendationsResponse, AWSError] = js.native
  def listRecommendations(
    params: ListRecommendationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRecommendationsResponse, Unit]
  ): Request[ListRecommendationsResponse, AWSError] = js.native
  
  /**
    *  Collects customer feedback about the specified insight. 
    */
  def putFeedback(): Request[PutFeedbackResponse, AWSError] = js.native
  def putFeedback(callback: js.Function2[/* err */ AWSError, /* data */ PutFeedbackResponse, Unit]): Request[PutFeedbackResponse, AWSError] = js.native
  /**
    *  Collects customer feedback about the specified insight. 
    */
  def putFeedback(params: PutFeedbackRequest): Request[PutFeedbackResponse, AWSError] = js.native
  def putFeedback(
    params: PutFeedbackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutFeedbackResponse, Unit]
  ): Request[PutFeedbackResponse, AWSError] = js.native
  
  /**
    *  Removes a notification channel from DevOps Guru. A notification channel is used to notify you when DevOps Guru generates an insight that contains information about how to improve your operations. 
    */
  def removeNotificationChannel(): Request[RemoveNotificationChannelResponse, AWSError] = js.native
  def removeNotificationChannel(callback: js.Function2[/* err */ AWSError, /* data */ RemoveNotificationChannelResponse, Unit]): Request[RemoveNotificationChannelResponse, AWSError] = js.native
  /**
    *  Removes a notification channel from DevOps Guru. A notification channel is used to notify you when DevOps Guru generates an insight that contains information about how to improve your operations. 
    */
  def removeNotificationChannel(params: RemoveNotificationChannelRequest): Request[RemoveNotificationChannelResponse, AWSError] = js.native
  def removeNotificationChannel(
    params: RemoveNotificationChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveNotificationChannelResponse, Unit]
  ): Request[RemoveNotificationChannelResponse, AWSError] = js.native
  
  /**
    *  Returns a list of insights in your Amazon Web Services account. You can specify which insights are returned by their start time, one or more statuses (ONGOING, CLOSED, and CLOSED), one or more severities (LOW, MEDIUM, and HIGH), and type (REACTIVE or PROACTIVE).   Use the Filters parameter to specify status and severity search parameters. Use the Type parameter to specify REACTIVE or PROACTIVE in your search. 
    */
  def searchInsights(): Request[SearchInsightsResponse, AWSError] = js.native
  def searchInsights(callback: js.Function2[/* err */ AWSError, /* data */ SearchInsightsResponse, Unit]): Request[SearchInsightsResponse, AWSError] = js.native
  /**
    *  Returns a list of insights in your Amazon Web Services account. You can specify which insights are returned by their start time, one or more statuses (ONGOING, CLOSED, and CLOSED), one or more severities (LOW, MEDIUM, and HIGH), and type (REACTIVE or PROACTIVE).   Use the Filters parameter to specify status and severity search parameters. Use the Type parameter to specify REACTIVE or PROACTIVE in your search. 
    */
  def searchInsights(params: SearchInsightsRequest): Request[SearchInsightsResponse, AWSError] = js.native
  def searchInsights(
    params: SearchInsightsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchInsightsResponse, Unit]
  ): Request[SearchInsightsResponse, AWSError] = js.native
  
  /**
    *  Returns a list of insights in your organization. You can specify which insights are returned by their start time, one or more statuses (ONGOING, CLOSED, and CLOSED), one or more severities (LOW, MEDIUM, and HIGH), and type (REACTIVE or PROACTIVE).   Use the Filters parameter to specify status and severity search parameters. Use the Type parameter to specify REACTIVE or PROACTIVE in your search. 
    */
  def searchOrganizationInsights(): Request[SearchOrganizationInsightsResponse, AWSError] = js.native
  def searchOrganizationInsights(callback: js.Function2[/* err */ AWSError, /* data */ SearchOrganizationInsightsResponse, Unit]): Request[SearchOrganizationInsightsResponse, AWSError] = js.native
  /**
    *  Returns a list of insights in your organization. You can specify which insights are returned by their start time, one or more statuses (ONGOING, CLOSED, and CLOSED), one or more severities (LOW, MEDIUM, and HIGH), and type (REACTIVE or PROACTIVE).   Use the Filters parameter to specify status and severity search parameters. Use the Type parameter to specify REACTIVE or PROACTIVE in your search. 
    */
  def searchOrganizationInsights(params: SearchOrganizationInsightsRequest): Request[SearchOrganizationInsightsResponse, AWSError] = js.native
  def searchOrganizationInsights(
    params: SearchOrganizationInsightsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchOrganizationInsightsResponse, Unit]
  ): Request[SearchOrganizationInsightsResponse, AWSError] = js.native
  
  /**
    * Starts the creation of an estimate of the monthly cost to analyze your Amazon Web Services resources.
    */
  def startCostEstimation(): Request[StartCostEstimationResponse, AWSError] = js.native
  def startCostEstimation(callback: js.Function2[/* err */ AWSError, /* data */ StartCostEstimationResponse, Unit]): Request[StartCostEstimationResponse, AWSError] = js.native
  /**
    * Starts the creation of an estimate of the monthly cost to analyze your Amazon Web Services resources.
    */
  def startCostEstimation(params: StartCostEstimationRequest): Request[StartCostEstimationResponse, AWSError] = js.native
  def startCostEstimation(
    params: StartCostEstimationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartCostEstimationResponse, Unit]
  ): Request[StartCostEstimationResponse, AWSError] = js.native
  
  /**
    * Enables or disables integration with a service that can be integrated with DevOps Guru. The one service that can be integrated with DevOps Guru is Amazon CodeGuru Profiler, which can produce proactive recommendations which can be stored and viewed in DevOps Guru.
    */
  def updateEventSourcesConfig(): Request[UpdateEventSourcesConfigResponse, AWSError] = js.native
  def updateEventSourcesConfig(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEventSourcesConfigResponse, Unit]): Request[UpdateEventSourcesConfigResponse, AWSError] = js.native
  /**
    * Enables or disables integration with a service that can be integrated with DevOps Guru. The one service that can be integrated with DevOps Guru is Amazon CodeGuru Profiler, which can produce proactive recommendations which can be stored and viewed in DevOps Guru.
    */
  def updateEventSourcesConfig(params: UpdateEventSourcesConfigRequest): Request[UpdateEventSourcesConfigResponse, AWSError] = js.native
  def updateEventSourcesConfig(
    params: UpdateEventSourcesConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEventSourcesConfigResponse, Unit]
  ): Request[UpdateEventSourcesConfigResponse, AWSError] = js.native
  
  /**
    *  Updates the collection of resources that DevOps Guru analyzes. The two types of Amazon Web Services resource collections supported are Amazon Web Services CloudFormation stacks and Amazon Web Services resources that contain the same Amazon Web Services tag. DevOps Guru can be configured to analyze the Amazon Web Services resources that are defined in the stacks or that are tagged using the same tag key. You can specify up to 500 Amazon Web Services CloudFormation stacks. This method also creates the IAM role required for you to use DevOps Guru. 
    */
  def updateResourceCollection(): Request[UpdateResourceCollectionResponse, AWSError] = js.native
  def updateResourceCollection(callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourceCollectionResponse, Unit]): Request[UpdateResourceCollectionResponse, AWSError] = js.native
  /**
    *  Updates the collection of resources that DevOps Guru analyzes. The two types of Amazon Web Services resource collections supported are Amazon Web Services CloudFormation stacks and Amazon Web Services resources that contain the same Amazon Web Services tag. DevOps Guru can be configured to analyze the Amazon Web Services resources that are defined in the stacks or that are tagged using the same tag key. You can specify up to 500 Amazon Web Services CloudFormation stacks. This method also creates the IAM role required for you to use DevOps Guru. 
    */
  def updateResourceCollection(params: UpdateResourceCollectionRequest): Request[UpdateResourceCollectionResponse, AWSError] = js.native
  def updateResourceCollection(
    params: UpdateResourceCollectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourceCollectionResponse, Unit]
  ): Request[UpdateResourceCollectionResponse, AWSError] = js.native
  
  /**
    *  Enables or disables integration with a service that can be integrated with DevOps Guru. The one service that can be integrated with DevOps Guru is Amazon Web Services Systems Manager, which can be used to create an OpsItem for each generated insight. 
    */
  def updateServiceIntegration(): Request[UpdateServiceIntegrationResponse, AWSError] = js.native
  def updateServiceIntegration(callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceIntegrationResponse, Unit]): Request[UpdateServiceIntegrationResponse, AWSError] = js.native
  /**
    *  Enables or disables integration with a service that can be integrated with DevOps Guru. The one service that can be integrated with DevOps Guru is Amazon Web Services Systems Manager, which can be used to create an OpsItem for each generated insight. 
    */
  def updateServiceIntegration(params: UpdateServiceIntegrationRequest): Request[UpdateServiceIntegrationResponse, AWSError] = js.native
  def updateServiceIntegration(
    params: UpdateServiceIntegrationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceIntegrationResponse, Unit]
  ): Request[UpdateServiceIntegrationResponse, AWSError] = js.native
}
