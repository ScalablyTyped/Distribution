package typings.awsSdk.codeguruprofilerMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeGuruProfiler extends Service {
  @JSName("config")
  var config_CodeGuruProfiler: ConfigBase with ClientConfiguration = js.native
  /**
    * Add up to 2 anomaly notifications channels for a profiling group.
    */
  def addNotificationChannels(): Request[AddNotificationChannelsResponse, AWSError] = js.native
  def addNotificationChannels(callback: js.Function2[/* err */ AWSError, /* data */ AddNotificationChannelsResponse, Unit]): Request[AddNotificationChannelsResponse, AWSError] = js.native
  /**
    * Add up to 2 anomaly notifications channels for a profiling group.
    */
  def addNotificationChannels(params: AddNotificationChannelsRequest): Request[AddNotificationChannelsResponse, AWSError] = js.native
  def addNotificationChannels(
    params: AddNotificationChannelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddNotificationChannelsResponse, Unit]
  ): Request[AddNotificationChannelsResponse, AWSError] = js.native
  /**
    *  Returns the time series of values for a requested list of frame metrics from a time period.
    */
  def batchGetFrameMetricData(): Request[BatchGetFrameMetricDataResponse, AWSError] = js.native
  def batchGetFrameMetricData(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetFrameMetricDataResponse, Unit]): Request[BatchGetFrameMetricDataResponse, AWSError] = js.native
  /**
    *  Returns the time series of values for a requested list of frame metrics from a time period.
    */
  def batchGetFrameMetricData(params: BatchGetFrameMetricDataRequest): Request[BatchGetFrameMetricDataResponse, AWSError] = js.native
  def batchGetFrameMetricData(
    params: BatchGetFrameMetricDataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetFrameMetricDataResponse, Unit]
  ): Request[BatchGetFrameMetricDataResponse, AWSError] = js.native
  /**
    *  Used by profiler agents to report their current state and to receive remote configuration updates. For example, ConfigureAgent can be used to tell and agent whether to profile or not and for how long to return profiling data. 
    */
  def configureAgent(): Request[ConfigureAgentResponse, AWSError] = js.native
  def configureAgent(callback: js.Function2[/* err */ AWSError, /* data */ ConfigureAgentResponse, Unit]): Request[ConfigureAgentResponse, AWSError] = js.native
  /**
    *  Used by profiler agents to report their current state and to receive remote configuration updates. For example, ConfigureAgent can be used to tell and agent whether to profile or not and for how long to return profiling data. 
    */
  def configureAgent(params: ConfigureAgentRequest): Request[ConfigureAgentResponse, AWSError] = js.native
  def configureAgent(
    params: ConfigureAgentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ConfigureAgentResponse, Unit]
  ): Request[ConfigureAgentResponse, AWSError] = js.native
  /**
    * Creates a profiling group.
    */
  def createProfilingGroup(): Request[CreateProfilingGroupResponse, AWSError] = js.native
  def createProfilingGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateProfilingGroupResponse, Unit]): Request[CreateProfilingGroupResponse, AWSError] = js.native
  /**
    * Creates a profiling group.
    */
  def createProfilingGroup(params: CreateProfilingGroupRequest): Request[CreateProfilingGroupResponse, AWSError] = js.native
  def createProfilingGroup(
    params: CreateProfilingGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProfilingGroupResponse, Unit]
  ): Request[CreateProfilingGroupResponse, AWSError] = js.native
  /**
    * Deletes a profiling group.
    */
  def deleteProfilingGroup(): Request[DeleteProfilingGroupResponse, AWSError] = js.native
  def deleteProfilingGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProfilingGroupResponse, Unit]): Request[DeleteProfilingGroupResponse, AWSError] = js.native
  /**
    * Deletes a profiling group.
    */
  def deleteProfilingGroup(params: DeleteProfilingGroupRequest): Request[DeleteProfilingGroupResponse, AWSError] = js.native
  def deleteProfilingGroup(
    params: DeleteProfilingGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProfilingGroupResponse, Unit]
  ): Request[DeleteProfilingGroupResponse, AWSError] = js.native
  /**
    *  Returns a  ProfilingGroupDescription  object that contains information about the requested profiling group. 
    */
  def describeProfilingGroup(): Request[DescribeProfilingGroupResponse, AWSError] = js.native
  def describeProfilingGroup(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProfilingGroupResponse, Unit]): Request[DescribeProfilingGroupResponse, AWSError] = js.native
  /**
    *  Returns a  ProfilingGroupDescription  object that contains information about the requested profiling group. 
    */
  def describeProfilingGroup(params: DescribeProfilingGroupRequest): Request[DescribeProfilingGroupResponse, AWSError] = js.native
  def describeProfilingGroup(
    params: DescribeProfilingGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProfilingGroupResponse, Unit]
  ): Request[DescribeProfilingGroupResponse, AWSError] = js.native
  /**
    *  Returns a list of  FindingsReportSummary  objects that contain analysis results for all profiling groups in your AWS account. 
    */
  def getFindingsReportAccountSummary(): Request[GetFindingsReportAccountSummaryResponse, AWSError] = js.native
  def getFindingsReportAccountSummary(
    callback: js.Function2[/* err */ AWSError, /* data */ GetFindingsReportAccountSummaryResponse, Unit]
  ): Request[GetFindingsReportAccountSummaryResponse, AWSError] = js.native
  /**
    *  Returns a list of  FindingsReportSummary  objects that contain analysis results for all profiling groups in your AWS account. 
    */
  def getFindingsReportAccountSummary(params: GetFindingsReportAccountSummaryRequest): Request[GetFindingsReportAccountSummaryResponse, AWSError] = js.native
  def getFindingsReportAccountSummary(
    params: GetFindingsReportAccountSummaryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFindingsReportAccountSummaryResponse, Unit]
  ): Request[GetFindingsReportAccountSummaryResponse, AWSError] = js.native
  /**
    * Get the current configuration for anomaly notifications for a profiling group.
    */
  def getNotificationConfiguration(): Request[GetNotificationConfigurationResponse, AWSError] = js.native
  def getNotificationConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetNotificationConfigurationResponse, Unit]): Request[GetNotificationConfigurationResponse, AWSError] = js.native
  /**
    * Get the current configuration for anomaly notifications for a profiling group.
    */
  def getNotificationConfiguration(params: GetNotificationConfigurationRequest): Request[GetNotificationConfigurationResponse, AWSError] = js.native
  def getNotificationConfiguration(
    params: GetNotificationConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetNotificationConfigurationResponse, Unit]
  ): Request[GetNotificationConfigurationResponse, AWSError] = js.native
  /**
    *  Returns the JSON-formatted resource-based policy on a profiling group. 
    */
  def getPolicy(): Request[GetPolicyResponse, AWSError] = js.native
  def getPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetPolicyResponse, Unit]): Request[GetPolicyResponse, AWSError] = js.native
  /**
    *  Returns the JSON-formatted resource-based policy on a profiling group. 
    */
  def getPolicy(params: GetPolicyRequest): Request[GetPolicyResponse, AWSError] = js.native
  def getPolicy(
    params: GetPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPolicyResponse, Unit]
  ): Request[GetPolicyResponse, AWSError] = js.native
  /**
    *  Gets the aggregated profile of a profiling group for a specified time range. Amazon CodeGuru Profiler collects posted agent profiles for a profiling group into aggregated profiles.   &lt;note&gt; &lt;p&gt; Because aggregated profiles expire over time &lt;code&gt;GetProfile&lt;/code&gt; is not idempotent. &lt;/p&gt; &lt;/note&gt; &lt;p&gt; Specify the time range for the requested aggregated profile using 1 or 2 of the following parameters: &lt;code&gt;startTime&lt;/code&gt;, &lt;code&gt;endTime&lt;/code&gt;, &lt;code&gt;period&lt;/code&gt;. The maximum time range allowed is 7 days. If you specify all 3 parameters, an exception is thrown. If you specify only &lt;code&gt;period&lt;/code&gt;, the latest aggregated profile is returned. &lt;/p&gt; &lt;p&gt; Aggregated profiles are available with aggregation periods of 5 minutes, 1 hour, and 1 day, aligned to UTC. The aggregation period of an aggregated profile determines how long it is retained. For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_AggregatedProfileTime.html&quot;&gt; &lt;code&gt;AggregatedProfileTime&lt;/code&gt; &lt;/a&gt;. The aggregated profile's aggregation period determines how long it is retained by CodeGuru Profiler. &lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; If the aggregation period is 5 minutes, the aggregated profile is retained for 15 days. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; If the aggregation period is 1 hour, the aggregated profile is retained for 60 days. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; If the aggregation period is 1 day, the aggregated profile is retained for 3 years. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;There are two use cases for calling &lt;code&gt;GetProfile&lt;/code&gt;.&lt;/p&gt; &lt;ol&gt; &lt;li&gt; &lt;p&gt; If you want to return an aggregated profile that already exists, use &lt;a href=&quot;https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ListProfileTimes.html&quot;&gt; &lt;code&gt;ListProfileTimes&lt;/code&gt; &lt;/a&gt; to view the time ranges of existing aggregated profiles. Use them in a &lt;code&gt;GetProfile&lt;/code&gt; request to return a specific, existing aggregated profile. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; If you want to return an aggregated profile for a time range that doesn't align with an existing aggregated profile, then CodeGuru Profiler makes a best effort to combine existing aggregated profiles from the requested time range and return them as one aggregated profile. &lt;/p&gt; &lt;p&gt; If aggregated profiles do not exist for the full time range requested, then aggregated profiles for a smaller time range are returned. For example, if the requested time range is from 00:00 to 00:20, and the existing aggregated profiles are from 00:15 and 00:25, then the aggregated profiles from 00:15 to 00:20 are returned. &lt;/p&gt; &lt;/li&gt; &lt;/ol&gt; 
    */
  def getProfile(): Request[GetProfileResponse, AWSError] = js.native
  def getProfile(callback: js.Function2[/* err */ AWSError, /* data */ GetProfileResponse, Unit]): Request[GetProfileResponse, AWSError] = js.native
  /**
    *  Gets the aggregated profile of a profiling group for a specified time range. Amazon CodeGuru Profiler collects posted agent profiles for a profiling group into aggregated profiles.   &lt;note&gt; &lt;p&gt; Because aggregated profiles expire over time &lt;code&gt;GetProfile&lt;/code&gt; is not idempotent. &lt;/p&gt; &lt;/note&gt; &lt;p&gt; Specify the time range for the requested aggregated profile using 1 or 2 of the following parameters: &lt;code&gt;startTime&lt;/code&gt;, &lt;code&gt;endTime&lt;/code&gt;, &lt;code&gt;period&lt;/code&gt;. The maximum time range allowed is 7 days. If you specify all 3 parameters, an exception is thrown. If you specify only &lt;code&gt;period&lt;/code&gt;, the latest aggregated profile is returned. &lt;/p&gt; &lt;p&gt; Aggregated profiles are available with aggregation periods of 5 minutes, 1 hour, and 1 day, aligned to UTC. The aggregation period of an aggregated profile determines how long it is retained. For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_AggregatedProfileTime.html&quot;&gt; &lt;code&gt;AggregatedProfileTime&lt;/code&gt; &lt;/a&gt;. The aggregated profile's aggregation period determines how long it is retained by CodeGuru Profiler. &lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; If the aggregation period is 5 minutes, the aggregated profile is retained for 15 days. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; If the aggregation period is 1 hour, the aggregated profile is retained for 60 days. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; If the aggregation period is 1 day, the aggregated profile is retained for 3 years. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;There are two use cases for calling &lt;code&gt;GetProfile&lt;/code&gt;.&lt;/p&gt; &lt;ol&gt; &lt;li&gt; &lt;p&gt; If you want to return an aggregated profile that already exists, use &lt;a href=&quot;https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ListProfileTimes.html&quot;&gt; &lt;code&gt;ListProfileTimes&lt;/code&gt; &lt;/a&gt; to view the time ranges of existing aggregated profiles. Use them in a &lt;code&gt;GetProfile&lt;/code&gt; request to return a specific, existing aggregated profile. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; If you want to return an aggregated profile for a time range that doesn't align with an existing aggregated profile, then CodeGuru Profiler makes a best effort to combine existing aggregated profiles from the requested time range and return them as one aggregated profile. &lt;/p&gt; &lt;p&gt; If aggregated profiles do not exist for the full time range requested, then aggregated profiles for a smaller time range are returned. For example, if the requested time range is from 00:00 to 00:20, and the existing aggregated profiles are from 00:15 and 00:25, then the aggregated profiles from 00:15 to 00:20 are returned. &lt;/p&gt; &lt;/li&gt; &lt;/ol&gt; 
    */
  def getProfile(params: GetProfileRequest): Request[GetProfileResponse, AWSError] = js.native
  def getProfile(
    params: GetProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetProfileResponse, Unit]
  ): Request[GetProfileResponse, AWSError] = js.native
  /**
    *  Returns a list of  Recommendation  objects that contain recommendations for a profiling group for a given time period. A list of  Anomaly  objects that contains details about anomalies detected in the profiling group for the same time period is also returned. 
    */
  def getRecommendations(): Request[GetRecommendationsResponse, AWSError] = js.native
  def getRecommendations(callback: js.Function2[/* err */ AWSError, /* data */ GetRecommendationsResponse, Unit]): Request[GetRecommendationsResponse, AWSError] = js.native
  /**
    *  Returns a list of  Recommendation  objects that contain recommendations for a profiling group for a given time period. A list of  Anomaly  objects that contains details about anomalies detected in the profiling group for the same time period is also returned. 
    */
  def getRecommendations(params: GetRecommendationsRequest): Request[GetRecommendationsResponse, AWSError] = js.native
  def getRecommendations(
    params: GetRecommendationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRecommendationsResponse, Unit]
  ): Request[GetRecommendationsResponse, AWSError] = js.native
  /**
    * List the available reports for a given profiling group and time range.
    */
  def listFindingsReports(): Request[ListFindingsReportsResponse, AWSError] = js.native
  def listFindingsReports(callback: js.Function2[/* err */ AWSError, /* data */ ListFindingsReportsResponse, Unit]): Request[ListFindingsReportsResponse, AWSError] = js.native
  /**
    * List the available reports for a given profiling group and time range.
    */
  def listFindingsReports(params: ListFindingsReportsRequest): Request[ListFindingsReportsResponse, AWSError] = js.native
  def listFindingsReports(
    params: ListFindingsReportsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFindingsReportsResponse, Unit]
  ): Request[ListFindingsReportsResponse, AWSError] = js.native
  /**
    * Lists the start times of the available aggregated profiles of a profiling group for an aggregation period within the specified time range.
    */
  def listProfileTimes(): Request[ListProfileTimesResponse, AWSError] = js.native
  def listProfileTimes(callback: js.Function2[/* err */ AWSError, /* data */ ListProfileTimesResponse, Unit]): Request[ListProfileTimesResponse, AWSError] = js.native
  /**
    * Lists the start times of the available aggregated profiles of a profiling group for an aggregation period within the specified time range.
    */
  def listProfileTimes(params: ListProfileTimesRequest): Request[ListProfileTimesResponse, AWSError] = js.native
  def listProfileTimes(
    params: ListProfileTimesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProfileTimesResponse, Unit]
  ): Request[ListProfileTimesResponse, AWSError] = js.native
  /**
    *  Returns a list of profiling groups. The profiling groups are returned as  ProfilingGroupDescription  objects. 
    */
  def listProfilingGroups(): Request[ListProfilingGroupsResponse, AWSError] = js.native
  def listProfilingGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListProfilingGroupsResponse, Unit]): Request[ListProfilingGroupsResponse, AWSError] = js.native
  /**
    *  Returns a list of profiling groups. The profiling groups are returned as  ProfilingGroupDescription  objects. 
    */
  def listProfilingGroups(params: ListProfilingGroupsRequest): Request[ListProfilingGroupsResponse, AWSError] = js.native
  def listProfilingGroups(
    params: ListProfilingGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProfilingGroupsResponse, Unit]
  ): Request[ListProfilingGroupsResponse, AWSError] = js.native
  /**
    *  Submits profiling data to an aggregated profile of a profiling group. To get an aggregated profile that is created with this profiling data, use  GetProfile . 
    */
  def postAgentProfile(): Request[PostAgentProfileResponse, AWSError] = js.native
  def postAgentProfile(callback: js.Function2[/* err */ AWSError, /* data */ PostAgentProfileResponse, Unit]): Request[PostAgentProfileResponse, AWSError] = js.native
  /**
    *  Submits profiling data to an aggregated profile of a profiling group. To get an aggregated profile that is created with this profiling data, use  GetProfile . 
    */
  def postAgentProfile(params: PostAgentProfileRequest): Request[PostAgentProfileResponse, AWSError] = js.native
  def postAgentProfile(
    params: PostAgentProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PostAgentProfileResponse, Unit]
  ): Request[PostAgentProfileResponse, AWSError] = js.native
  /**
    *  Adds permissions to a profiling group's resource-based policy that are provided using an action group. If a profiling group doesn't have a resource-based policy, one is created for it using the permissions in the action group and the roles and users in the principals parameter.   &lt;p&gt; The one supported action group that can be added is &lt;code&gt;agentPermission&lt;/code&gt; which grants &lt;code&gt;ConfigureAgent&lt;/code&gt; and &lt;code&gt;PostAgent&lt;/code&gt; permissions. For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/codeguru/latest/profiler-ug/resource-based-policies.html&quot;&gt;Resource-based policies in CodeGuru Profiler&lt;/a&gt; in the &lt;i&gt;Amazon CodeGuru Profiler User Guide&lt;/i&gt;, &lt;a href=&quot;https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ConfigureAgent.html&quot;&gt; &lt;code&gt;ConfigureAgent&lt;/code&gt; &lt;/a&gt;, and &lt;a href=&quot;https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_PostAgentProfile.html&quot;&gt; &lt;code&gt;PostAgentProfile&lt;/code&gt; &lt;/a&gt;. &lt;/p&gt; &lt;p&gt; The first time you call &lt;code&gt;PutPermission&lt;/code&gt; on a profiling group, do not specify a &lt;code&gt;revisionId&lt;/code&gt; because it doesn't have a resource-based policy. Subsequent calls must provide a &lt;code&gt;revisionId&lt;/code&gt; to specify which revision of the resource-based policy to add the permissions to. &lt;/p&gt; &lt;p&gt; The response contains the profiling group's JSON-formatted resource policy. &lt;/p&gt; 
    */
  def putPermission(): Request[PutPermissionResponse, AWSError] = js.native
  def putPermission(callback: js.Function2[/* err */ AWSError, /* data */ PutPermissionResponse, Unit]): Request[PutPermissionResponse, AWSError] = js.native
  /**
    *  Adds permissions to a profiling group's resource-based policy that are provided using an action group. If a profiling group doesn't have a resource-based policy, one is created for it using the permissions in the action group and the roles and users in the principals parameter.   &lt;p&gt; The one supported action group that can be added is &lt;code&gt;agentPermission&lt;/code&gt; which grants &lt;code&gt;ConfigureAgent&lt;/code&gt; and &lt;code&gt;PostAgent&lt;/code&gt; permissions. For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/codeguru/latest/profiler-ug/resource-based-policies.html&quot;&gt;Resource-based policies in CodeGuru Profiler&lt;/a&gt; in the &lt;i&gt;Amazon CodeGuru Profiler User Guide&lt;/i&gt;, &lt;a href=&quot;https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ConfigureAgent.html&quot;&gt; &lt;code&gt;ConfigureAgent&lt;/code&gt; &lt;/a&gt;, and &lt;a href=&quot;https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_PostAgentProfile.html&quot;&gt; &lt;code&gt;PostAgentProfile&lt;/code&gt; &lt;/a&gt;. &lt;/p&gt; &lt;p&gt; The first time you call &lt;code&gt;PutPermission&lt;/code&gt; on a profiling group, do not specify a &lt;code&gt;revisionId&lt;/code&gt; because it doesn't have a resource-based policy. Subsequent calls must provide a &lt;code&gt;revisionId&lt;/code&gt; to specify which revision of the resource-based policy to add the permissions to. &lt;/p&gt; &lt;p&gt; The response contains the profiling group's JSON-formatted resource policy. &lt;/p&gt; 
    */
  def putPermission(params: PutPermissionRequest): Request[PutPermissionResponse, AWSError] = js.native
  def putPermission(
    params: PutPermissionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutPermissionResponse, Unit]
  ): Request[PutPermissionResponse, AWSError] = js.native
  /**
    * Remove one anomaly notifications channel for a profiling group.
    */
  def removeNotificationChannel(): Request[RemoveNotificationChannelResponse, AWSError] = js.native
  def removeNotificationChannel(callback: js.Function2[/* err */ AWSError, /* data */ RemoveNotificationChannelResponse, Unit]): Request[RemoveNotificationChannelResponse, AWSError] = js.native
  /**
    * Remove one anomaly notifications channel for a profiling group.
    */
  def removeNotificationChannel(params: RemoveNotificationChannelRequest): Request[RemoveNotificationChannelResponse, AWSError] = js.native
  def removeNotificationChannel(
    params: RemoveNotificationChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveNotificationChannelResponse, Unit]
  ): Request[RemoveNotificationChannelResponse, AWSError] = js.native
  /**
    *  Removes permissions from a profiling group's resource-based policy that are provided using an action group. The one supported action group that can be removed is agentPermission which grants ConfigureAgent and PostAgent permissions. For more information, see Resource-based policies in CodeGuru Profiler in the Amazon CodeGuru Profiler User Guide,  ConfigureAgent , and  PostAgentProfile . 
    */
  def removePermission(): Request[RemovePermissionResponse, AWSError] = js.native
  def removePermission(callback: js.Function2[/* err */ AWSError, /* data */ RemovePermissionResponse, Unit]): Request[RemovePermissionResponse, AWSError] = js.native
  /**
    *  Removes permissions from a profiling group's resource-based policy that are provided using an action group. The one supported action group that can be removed is agentPermission which grants ConfigureAgent and PostAgent permissions. For more information, see Resource-based policies in CodeGuru Profiler in the Amazon CodeGuru Profiler User Guide,  ConfigureAgent , and  PostAgentProfile . 
    */
  def removePermission(params: RemovePermissionRequest): Request[RemovePermissionResponse, AWSError] = js.native
  def removePermission(
    params: RemovePermissionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RemovePermissionResponse, Unit]
  ): Request[RemovePermissionResponse, AWSError] = js.native
  /**
    * Sends feedback to CodeGuru Profiler about whether the anomaly detected by the analysis is useful or not.
    */
  def submitFeedback(): Request[SubmitFeedbackResponse, AWSError] = js.native
  def submitFeedback(callback: js.Function2[/* err */ AWSError, /* data */ SubmitFeedbackResponse, Unit]): Request[SubmitFeedbackResponse, AWSError] = js.native
  /**
    * Sends feedback to CodeGuru Profiler about whether the anomaly detected by the analysis is useful or not.
    */
  def submitFeedback(params: SubmitFeedbackRequest): Request[SubmitFeedbackResponse, AWSError] = js.native
  def submitFeedback(
    params: SubmitFeedbackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SubmitFeedbackResponse, Unit]
  ): Request[SubmitFeedbackResponse, AWSError] = js.native
  /**
    * Updates a profiling group.
    */
  def updateProfilingGroup(): Request[UpdateProfilingGroupResponse, AWSError] = js.native
  def updateProfilingGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateProfilingGroupResponse, Unit]): Request[UpdateProfilingGroupResponse, AWSError] = js.native
  /**
    * Updates a profiling group.
    */
  def updateProfilingGroup(params: UpdateProfilingGroupRequest): Request[UpdateProfilingGroupResponse, AWSError] = js.native
  def updateProfilingGroup(
    params: UpdateProfilingGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateProfilingGroupResponse, Unit]
  ): Request[UpdateProfilingGroupResponse, AWSError] = js.native
}

