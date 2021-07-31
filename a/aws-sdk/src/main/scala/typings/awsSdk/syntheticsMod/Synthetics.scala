package typings.awsSdk.syntheticsMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Synthetics extends Service {
  
  @JSName("config")
  var config_Synthetics: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a canary. Canaries are scripts that monitor your endpoints and APIs from the outside-in. Canaries help you check the availability and latency of your web services and troubleshoot anomalies by investigating load time data, screenshots of the UI, logs, and metrics. You can set up a canary to run continuously or just once.  Do not use CreateCanary to modify an existing canary. Use UpdateCanary instead. To create canaries, you must have the CloudWatchSyntheticsFullAccess policy. If you are creating a new IAM role for the canary, you also need the the iam:CreateRole, iam:CreatePolicy and iam:AttachRolePolicy permissions. For more information, see Necessary Roles and Permissions. Do not include secrets or proprietary information in your canary names. The canary name makes up part of the Amazon Resource Name (ARN) for the canary, and the ARN is included in outbound calls over the internet. For more information, see Security Considerations for Synthetics Canaries.
    */
  def createCanary(): Request[CreateCanaryResponse, AWSError] = js.native
  def createCanary(callback: js.Function2[/* err */ AWSError, /* data */ CreateCanaryResponse, Unit]): Request[CreateCanaryResponse, AWSError] = js.native
  /**
    * Creates a canary. Canaries are scripts that monitor your endpoints and APIs from the outside-in. Canaries help you check the availability and latency of your web services and troubleshoot anomalies by investigating load time data, screenshots of the UI, logs, and metrics. You can set up a canary to run continuously or just once.  Do not use CreateCanary to modify an existing canary. Use UpdateCanary instead. To create canaries, you must have the CloudWatchSyntheticsFullAccess policy. If you are creating a new IAM role for the canary, you also need the the iam:CreateRole, iam:CreatePolicy and iam:AttachRolePolicy permissions. For more information, see Necessary Roles and Permissions. Do not include secrets or proprietary information in your canary names. The canary name makes up part of the Amazon Resource Name (ARN) for the canary, and the ARN is included in outbound calls over the internet. For more information, see Security Considerations for Synthetics Canaries.
    */
  def createCanary(params: CreateCanaryRequest): Request[CreateCanaryResponse, AWSError] = js.native
  def createCanary(
    params: CreateCanaryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCanaryResponse, Unit]
  ): Request[CreateCanaryResponse, AWSError] = js.native
  
  /**
    * Permanently deletes the specified canary. When you delete a canary, resources used and created by the canary are not automatically deleted. After you delete a canary that you do not intend to use again, you should also delete the following:   The Lambda functions and layers used by this canary. These have the prefix cwsyn-MyCanaryName .   The CloudWatch alarms created for this canary. These alarms have a name of Synthetics-SharpDrop-Alarm-MyCanaryName .   Amazon S3 objects and buckets, such as the canary's artifact location.   IAM roles created for the canary. If they were created in the console, these roles have the name  role/service-role/CloudWatchSyntheticsRole-MyCanaryName .   CloudWatch Logs log groups created for the canary. These logs groups have the name /aws/lambda/cwsyn-MyCanaryName .    Before you delete a canary, you might want to use GetCanary to display the information about this canary. Make note of the information returned by this operation so that you can delete these resources after you delete the canary.
    */
  def deleteCanary(): Request[DeleteCanaryResponse, AWSError] = js.native
  def deleteCanary(callback: js.Function2[/* err */ AWSError, /* data */ DeleteCanaryResponse, Unit]): Request[DeleteCanaryResponse, AWSError] = js.native
  /**
    * Permanently deletes the specified canary. When you delete a canary, resources used and created by the canary are not automatically deleted. After you delete a canary that you do not intend to use again, you should also delete the following:   The Lambda functions and layers used by this canary. These have the prefix cwsyn-MyCanaryName .   The CloudWatch alarms created for this canary. These alarms have a name of Synthetics-SharpDrop-Alarm-MyCanaryName .   Amazon S3 objects and buckets, such as the canary's artifact location.   IAM roles created for the canary. If they were created in the console, these roles have the name  role/service-role/CloudWatchSyntheticsRole-MyCanaryName .   CloudWatch Logs log groups created for the canary. These logs groups have the name /aws/lambda/cwsyn-MyCanaryName .    Before you delete a canary, you might want to use GetCanary to display the information about this canary. Make note of the information returned by this operation so that you can delete these resources after you delete the canary.
    */
  def deleteCanary(params: DeleteCanaryRequest): Request[DeleteCanaryResponse, AWSError] = js.native
  def deleteCanary(
    params: DeleteCanaryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCanaryResponse, Unit]
  ): Request[DeleteCanaryResponse, AWSError] = js.native
  
  /**
    * This operation returns a list of the canaries in your account, along with full details about each canary. This operation does not have resource-level authorization, so if a user is able to use DescribeCanaries, the user can see all of the canaries in the account. A deny policy can only be used to restrict access to all canaries. It cannot be used on specific resources. 
    */
  def describeCanaries(): Request[DescribeCanariesResponse, AWSError] = js.native
  def describeCanaries(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCanariesResponse, Unit]): Request[DescribeCanariesResponse, AWSError] = js.native
  /**
    * This operation returns a list of the canaries in your account, along with full details about each canary. This operation does not have resource-level authorization, so if a user is able to use DescribeCanaries, the user can see all of the canaries in the account. A deny policy can only be used to restrict access to all canaries. It cannot be used on specific resources. 
    */
  def describeCanaries(params: DescribeCanariesRequest): Request[DescribeCanariesResponse, AWSError] = js.native
  def describeCanaries(
    params: DescribeCanariesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCanariesResponse, Unit]
  ): Request[DescribeCanariesResponse, AWSError] = js.native
  
  /**
    * Use this operation to see information from the most recent run of each canary that you have created.
    */
  def describeCanariesLastRun(): Request[DescribeCanariesLastRunResponse, AWSError] = js.native
  def describeCanariesLastRun(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCanariesLastRunResponse, Unit]): Request[DescribeCanariesLastRunResponse, AWSError] = js.native
  /**
    * Use this operation to see information from the most recent run of each canary that you have created.
    */
  def describeCanariesLastRun(params: DescribeCanariesLastRunRequest): Request[DescribeCanariesLastRunResponse, AWSError] = js.native
  def describeCanariesLastRun(
    params: DescribeCanariesLastRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCanariesLastRunResponse, Unit]
  ): Request[DescribeCanariesLastRunResponse, AWSError] = js.native
  
  /**
    * Returns a list of Synthetics canary runtime versions. For more information, see  Canary Runtime Versions.
    */
  def describeRuntimeVersions(): Request[DescribeRuntimeVersionsResponse, AWSError] = js.native
  def describeRuntimeVersions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRuntimeVersionsResponse, Unit]): Request[DescribeRuntimeVersionsResponse, AWSError] = js.native
  /**
    * Returns a list of Synthetics canary runtime versions. For more information, see  Canary Runtime Versions.
    */
  def describeRuntimeVersions(params: DescribeRuntimeVersionsRequest): Request[DescribeRuntimeVersionsResponse, AWSError] = js.native
  def describeRuntimeVersions(
    params: DescribeRuntimeVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRuntimeVersionsResponse, Unit]
  ): Request[DescribeRuntimeVersionsResponse, AWSError] = js.native
  
  /**
    * Retrieves complete information about one canary. You must specify the name of the canary that you want. To get a list of canaries and their names, use DescribeCanaries.
    */
  def getCanary(): Request[GetCanaryResponse, AWSError] = js.native
  def getCanary(callback: js.Function2[/* err */ AWSError, /* data */ GetCanaryResponse, Unit]): Request[GetCanaryResponse, AWSError] = js.native
  /**
    * Retrieves complete information about one canary. You must specify the name of the canary that you want. To get a list of canaries and their names, use DescribeCanaries.
    */
  def getCanary(params: GetCanaryRequest): Request[GetCanaryResponse, AWSError] = js.native
  def getCanary(
    params: GetCanaryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCanaryResponse, Unit]
  ): Request[GetCanaryResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of runs for a specified canary.
    */
  def getCanaryRuns(): Request[GetCanaryRunsResponse, AWSError] = js.native
  def getCanaryRuns(callback: js.Function2[/* err */ AWSError, /* data */ GetCanaryRunsResponse, Unit]): Request[GetCanaryRunsResponse, AWSError] = js.native
  /**
    * Retrieves a list of runs for a specified canary.
    */
  def getCanaryRuns(params: GetCanaryRunsRequest): Request[GetCanaryRunsResponse, AWSError] = js.native
  def getCanaryRuns(
    params: GetCanaryRunsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCanaryRunsResponse, Unit]
  ): Request[GetCanaryRunsResponse, AWSError] = js.native
  
  /**
    * Displays the tags associated with a canary.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Displays the tags associated with a canary.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Use this operation to run a canary that has already been created. The frequency of the canary runs is determined by the value of the canary's Schedule. To see a canary's schedule, use GetCanary.
    */
  def startCanary(): Request[StartCanaryResponse, AWSError] = js.native
  def startCanary(callback: js.Function2[/* err */ AWSError, /* data */ StartCanaryResponse, Unit]): Request[StartCanaryResponse, AWSError] = js.native
  /**
    * Use this operation to run a canary that has already been created. The frequency of the canary runs is determined by the value of the canary's Schedule. To see a canary's schedule, use GetCanary.
    */
  def startCanary(params: StartCanaryRequest): Request[StartCanaryResponse, AWSError] = js.native
  def startCanary(
    params: StartCanaryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartCanaryResponse, Unit]
  ): Request[StartCanaryResponse, AWSError] = js.native
  
  /**
    * Stops the canary to prevent all future runs. If the canary is currently running, Synthetics stops waiting for the current run of the specified canary to complete. The run that is in progress completes on its own, publishes metrics, and uploads artifacts, but it is not recorded in Synthetics as a completed run. You can use StartCanary to start it running again with the canary’s current schedule at any point in the future. 
    */
  def stopCanary(): Request[StopCanaryResponse, AWSError] = js.native
  def stopCanary(callback: js.Function2[/* err */ AWSError, /* data */ StopCanaryResponse, Unit]): Request[StopCanaryResponse, AWSError] = js.native
  /**
    * Stops the canary to prevent all future runs. If the canary is currently running, Synthetics stops waiting for the current run of the specified canary to complete. The run that is in progress completes on its own, publishes metrics, and uploads artifacts, but it is not recorded in Synthetics as a completed run. You can use StartCanary to start it running again with the canary’s current schedule at any point in the future. 
    */
  def stopCanary(params: StopCanaryRequest): Request[StopCanaryResponse, AWSError] = js.native
  def stopCanary(
    params: StopCanaryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopCanaryResponse, Unit]
  ): Request[StopCanaryResponse, AWSError] = js.native
  
  /**
    * Assigns one or more tags (key-value pairs) to the specified canary.  Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only resources with certain tag values. Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of characters. You can use the TagResource action with a canary that already has tags. If you specify a new tag key for the alarm, this tag is appended to the list of tags associated with the alarm. If you specify a tag key that is already associated with the alarm, the new tag value that you specify replaces the previous value for that tag. You can associate as many as 50 tags with a canary.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Assigns one or more tags (key-value pairs) to the specified canary.  Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only resources with certain tag values. Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of characters. You can use the TagResource action with a canary that already has tags. If you specify a new tag key for the alarm, this tag is appended to the list of tags associated with the alarm. If you specify a tag key that is already associated with the alarm, the new tag value that you specify replaces the previous value for that tag. You can associate as many as 50 tags with a canary.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes one or more tags from the specified canary.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes one or more tags from the specified canary.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Use this operation to change the settings of a canary that has already been created. You can't use this operation to update the tags of an existing canary. To change the tags of an existing canary, use TagResource.
    */
  def updateCanary(): Request[UpdateCanaryResponse, AWSError] = js.native
  def updateCanary(callback: js.Function2[/* err */ AWSError, /* data */ UpdateCanaryResponse, Unit]): Request[UpdateCanaryResponse, AWSError] = js.native
  /**
    * Use this operation to change the settings of a canary that has already been created. You can't use this operation to update the tags of an existing canary. To change the tags of an existing canary, use TagResource.
    */
  def updateCanary(params: UpdateCanaryRequest): Request[UpdateCanaryResponse, AWSError] = js.native
  def updateCanary(
    params: UpdateCanaryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCanaryResponse, Unit]
  ): Request[UpdateCanaryResponse, AWSError] = js.native
}
