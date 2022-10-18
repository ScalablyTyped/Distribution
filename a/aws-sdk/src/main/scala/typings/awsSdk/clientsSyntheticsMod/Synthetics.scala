package typings.awsSdk.clientsSyntheticsMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Synthetics extends Service {
  
  /**
    * Associates a canary with a group. Using groups can help you with managing and automating your canaries, and you can also view aggregated run results and statistics for all canaries in a group.  You must run this operation in the Region where the canary exists.
    */
  def associateResource(): Request[AssociateResourceResponse, AWSError] = js.native
  def associateResource(callback: js.Function2[/* err */ AWSError, /* data */ AssociateResourceResponse, Unit]): Request[AssociateResourceResponse, AWSError] = js.native
  /**
    * Associates a canary with a group. Using groups can help you with managing and automating your canaries, and you can also view aggregated run results and statistics for all canaries in a group.  You must run this operation in the Region where the canary exists.
    */
  def associateResource(params: AssociateResourceRequest): Request[AssociateResourceResponse, AWSError] = js.native
  def associateResource(
    params: AssociateResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateResourceResponse, Unit]
  ): Request[AssociateResourceResponse, AWSError] = js.native
  
  @JSName("config")
  var config_Synthetics: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a canary. Canaries are scripts that monitor your endpoints and APIs from the outside-in. Canaries help you check the availability and latency of your web services and troubleshoot anomalies by investigating load time data, screenshots of the UI, logs, and metrics. You can set up a canary to run continuously or just once.  Do not use CreateCanary to modify an existing canary. Use UpdateCanary instead. To create canaries, you must have the CloudWatchSyntheticsFullAccess policy. If you are creating a new IAM role for the canary, you also need the iam:CreateRole, iam:CreatePolicy and iam:AttachRolePolicy permissions. For more information, see Necessary Roles and Permissions. Do not include secrets or proprietary information in your canary names. The canary name makes up part of the Amazon Resource Name (ARN) for the canary, and the ARN is included in outbound calls over the internet. For more information, see Security Considerations for Synthetics Canaries.
    */
  def createCanary(): Request[CreateCanaryResponse, AWSError] = js.native
  def createCanary(callback: js.Function2[/* err */ AWSError, /* data */ CreateCanaryResponse, Unit]): Request[CreateCanaryResponse, AWSError] = js.native
  /**
    * Creates a canary. Canaries are scripts that monitor your endpoints and APIs from the outside-in. Canaries help you check the availability and latency of your web services and troubleshoot anomalies by investigating load time data, screenshots of the UI, logs, and metrics. You can set up a canary to run continuously or just once.  Do not use CreateCanary to modify an existing canary. Use UpdateCanary instead. To create canaries, you must have the CloudWatchSyntheticsFullAccess policy. If you are creating a new IAM role for the canary, you also need the iam:CreateRole, iam:CreatePolicy and iam:AttachRolePolicy permissions. For more information, see Necessary Roles and Permissions. Do not include secrets or proprietary information in your canary names. The canary name makes up part of the Amazon Resource Name (ARN) for the canary, and the ARN is included in outbound calls over the internet. For more information, see Security Considerations for Synthetics Canaries.
    */
  def createCanary(params: CreateCanaryRequest): Request[CreateCanaryResponse, AWSError] = js.native
  def createCanary(
    params: CreateCanaryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCanaryResponse, Unit]
  ): Request[CreateCanaryResponse, AWSError] = js.native
  
  /**
    * Creates a group which you can use to associate canaries with each other, including cross-Region canaries. Using groups can help you with managing and automating your canaries, and you can also view aggregated run results and statistics for all canaries in a group.  Groups are global resources. When you create a group, it is replicated across Amazon Web Services Regions, and you can view it and add canaries to it from any Region. Although the group ARN format reflects the Region name where it was created, a group is not constrained to any Region. This means that you can put canaries from multiple Regions into the same group, and then use that group to view and manage all of those canaries in a single view. Groups are supported in all Regions except the Regions that are disabled by default. For more information about these Regions, see Enabling a Region. Each group can contain as many as 10 canaries. You can have as many as 20 groups in your account. Any single canary can be a member of up to 10 groups.
    */
  def createGroup(): Request[CreateGroupResponse, AWSError] = js.native
  def createGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupResponse, Unit]): Request[CreateGroupResponse, AWSError] = js.native
  /**
    * Creates a group which you can use to associate canaries with each other, including cross-Region canaries. Using groups can help you with managing and automating your canaries, and you can also view aggregated run results and statistics for all canaries in a group.  Groups are global resources. When you create a group, it is replicated across Amazon Web Services Regions, and you can view it and add canaries to it from any Region. Although the group ARN format reflects the Region name where it was created, a group is not constrained to any Region. This means that you can put canaries from multiple Regions into the same group, and then use that group to view and manage all of those canaries in a single view. Groups are supported in all Regions except the Regions that are disabled by default. For more information about these Regions, see Enabling a Region. Each group can contain as many as 10 canaries. You can have as many as 20 groups in your account. Any single canary can be a member of up to 10 groups.
    */
  def createGroup(params: CreateGroupRequest): Request[CreateGroupResponse, AWSError] = js.native
  def createGroup(
    params: CreateGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupResponse, Unit]
  ): Request[CreateGroupResponse, AWSError] = js.native
  
  /**
    * Permanently deletes the specified canary. If you specify DeleteLambda to true, CloudWatch Synthetics also deletes the Lambda functions and layers that are used by the canary. Other resources used and created by the canary are not automatically deleted. After you delete a canary that you do not intend to use again, you should also delete the following:   The CloudWatch alarms created for this canary. These alarms have a name of Synthetics-SharpDrop-Alarm-MyCanaryName .   Amazon S3 objects and buckets, such as the canary's artifact location.   IAM roles created for the canary. If they were created in the console, these roles have the name  role/service-role/CloudWatchSyntheticsRole-MyCanaryName .   CloudWatch Logs log groups created for the canary. These logs groups have the name /aws/lambda/cwsyn-MyCanaryName .    Before you delete a canary, you might want to use GetCanary to display the information about this canary. Make note of the information returned by this operation so that you can delete these resources after you delete the canary.
    */
  def deleteCanary(): Request[DeleteCanaryResponse, AWSError] = js.native
  def deleteCanary(callback: js.Function2[/* err */ AWSError, /* data */ DeleteCanaryResponse, Unit]): Request[DeleteCanaryResponse, AWSError] = js.native
  /**
    * Permanently deletes the specified canary. If you specify DeleteLambda to true, CloudWatch Synthetics also deletes the Lambda functions and layers that are used by the canary. Other resources used and created by the canary are not automatically deleted. After you delete a canary that you do not intend to use again, you should also delete the following:   The CloudWatch alarms created for this canary. These alarms have a name of Synthetics-SharpDrop-Alarm-MyCanaryName .   Amazon S3 objects and buckets, such as the canary's artifact location.   IAM roles created for the canary. If they were created in the console, these roles have the name  role/service-role/CloudWatchSyntheticsRole-MyCanaryName .   CloudWatch Logs log groups created for the canary. These logs groups have the name /aws/lambda/cwsyn-MyCanaryName .    Before you delete a canary, you might want to use GetCanary to display the information about this canary. Make note of the information returned by this operation so that you can delete these resources after you delete the canary.
    */
  def deleteCanary(params: DeleteCanaryRequest): Request[DeleteCanaryResponse, AWSError] = js.native
  def deleteCanary(
    params: DeleteCanaryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCanaryResponse, Unit]
  ): Request[DeleteCanaryResponse, AWSError] = js.native
  
  /**
    * Deletes a group. The group doesn't need to be empty to be deleted. If there are canaries in the group, they are not deleted when you delete the group.  Groups are a global resource that appear in all Regions, but the request to delete a group must be made from its home Region. You can find the home Region of a group within its ARN.
    */
  def deleteGroup(): Request[DeleteGroupResponse, AWSError] = js.native
  def deleteGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupResponse, Unit]): Request[DeleteGroupResponse, AWSError] = js.native
  /**
    * Deletes a group. The group doesn't need to be empty to be deleted. If there are canaries in the group, they are not deleted when you delete the group.  Groups are a global resource that appear in all Regions, but the request to delete a group must be made from its home Region. You can find the home Region of a group within its ARN.
    */
  def deleteGroup(params: DeleteGroupRequest): Request[DeleteGroupResponse, AWSError] = js.native
  def deleteGroup(
    params: DeleteGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupResponse, Unit]
  ): Request[DeleteGroupResponse, AWSError] = js.native
  
  /**
    * This operation returns a list of the canaries in your account, along with full details about each canary. This operation supports resource-level authorization using an IAM policy and the Names parameter. If you specify the Names parameter, the operation is successful only if you have authorization to view all the canaries that you specify in your request. If you do not have permission to view any of the canaries, the request fails with a 403 response. You are required to use the Names parameter if you are logged on to a user or role that has an IAM policy that restricts which canaries that you are allowed to view. For more information, see  Limiting a user to viewing specific canaries.
    */
  def describeCanaries(): Request[DescribeCanariesResponse, AWSError] = js.native
  def describeCanaries(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCanariesResponse, Unit]): Request[DescribeCanariesResponse, AWSError] = js.native
  /**
    * This operation returns a list of the canaries in your account, along with full details about each canary. This operation supports resource-level authorization using an IAM policy and the Names parameter. If you specify the Names parameter, the operation is successful only if you have authorization to view all the canaries that you specify in your request. If you do not have permission to view any of the canaries, the request fails with a 403 response. You are required to use the Names parameter if you are logged on to a user or role that has an IAM policy that restricts which canaries that you are allowed to view. For more information, see  Limiting a user to viewing specific canaries.
    */
  def describeCanaries(params: DescribeCanariesRequest): Request[DescribeCanariesResponse, AWSError] = js.native
  def describeCanaries(
    params: DescribeCanariesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCanariesResponse, Unit]
  ): Request[DescribeCanariesResponse, AWSError] = js.native
  
  /**
    * Use this operation to see information from the most recent run of each canary that you have created. This operation supports resource-level authorization using an IAM policy and the Names parameter. If you specify the Names parameter, the operation is successful only if you have authorization to view all the canaries that you specify in your request. If you do not have permission to view any of the canaries, the request fails with a 403 response. You are required to use the Names parameter if you are logged on to a user or role that has an IAM policy that restricts which canaries that you are allowed to view. For more information, see  Limiting a user to viewing specific canaries.
    */
  def describeCanariesLastRun(): Request[DescribeCanariesLastRunResponse, AWSError] = js.native
  def describeCanariesLastRun(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCanariesLastRunResponse, Unit]): Request[DescribeCanariesLastRunResponse, AWSError] = js.native
  /**
    * Use this operation to see information from the most recent run of each canary that you have created. This operation supports resource-level authorization using an IAM policy and the Names parameter. If you specify the Names parameter, the operation is successful only if you have authorization to view all the canaries that you specify in your request. If you do not have permission to view any of the canaries, the request fails with a 403 response. You are required to use the Names parameter if you are logged on to a user or role that has an IAM policy that restricts which canaries that you are allowed to view. For more information, see  Limiting a user to viewing specific canaries.
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
    * Removes a canary from a group. You must run this operation in the Region where the canary exists.
    */
  def disassociateResource(): Request[DisassociateResourceResponse, AWSError] = js.native
  def disassociateResource(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateResourceResponse, Unit]): Request[DisassociateResourceResponse, AWSError] = js.native
  /**
    * Removes a canary from a group. You must run this operation in the Region where the canary exists.
    */
  def disassociateResource(params: DisassociateResourceRequest): Request[DisassociateResourceResponse, AWSError] = js.native
  def disassociateResource(
    params: DisassociateResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateResourceResponse, Unit]
  ): Request[DisassociateResourceResponse, AWSError] = js.native
  
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
    * Returns information about one group. Groups are a global resource, so you can use this operation from any Region.
    */
  def getGroup(): Request[GetGroupResponse, AWSError] = js.native
  def getGroup(callback: js.Function2[/* err */ AWSError, /* data */ GetGroupResponse, Unit]): Request[GetGroupResponse, AWSError] = js.native
  /**
    * Returns information about one group. Groups are a global resource, so you can use this operation from any Region.
    */
  def getGroup(params: GetGroupRequest): Request[GetGroupResponse, AWSError] = js.native
  def getGroup(
    params: GetGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetGroupResponse, Unit]
  ): Request[GetGroupResponse, AWSError] = js.native
  
  /**
    * Returns a list of the groups that the specified canary is associated with. The canary that you specify must be in the current Region.
    */
  def listAssociatedGroups(): Request[ListAssociatedGroupsResponse, AWSError] = js.native
  def listAssociatedGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListAssociatedGroupsResponse, Unit]): Request[ListAssociatedGroupsResponse, AWSError] = js.native
  /**
    * Returns a list of the groups that the specified canary is associated with. The canary that you specify must be in the current Region.
    */
  def listAssociatedGroups(params: ListAssociatedGroupsRequest): Request[ListAssociatedGroupsResponse, AWSError] = js.native
  def listAssociatedGroups(
    params: ListAssociatedGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAssociatedGroupsResponse, Unit]
  ): Request[ListAssociatedGroupsResponse, AWSError] = js.native
  
  /**
    * This operation returns a list of the ARNs of the canaries that are associated with the specified group.
    */
  def listGroupResources(): Request[ListGroupResourcesResponse, AWSError] = js.native
  def listGroupResources(callback: js.Function2[/* err */ AWSError, /* data */ ListGroupResourcesResponse, Unit]): Request[ListGroupResourcesResponse, AWSError] = js.native
  /**
    * This operation returns a list of the ARNs of the canaries that are associated with the specified group.
    */
  def listGroupResources(params: ListGroupResourcesRequest): Request[ListGroupResourcesResponse, AWSError] = js.native
  def listGroupResources(
    params: ListGroupResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupResourcesResponse, Unit]
  ): Request[ListGroupResourcesResponse, AWSError] = js.native
  
  /**
    * Returns a list of all groups in the account, displaying their names, unique IDs, and ARNs. The groups from all Regions are returned.
    */
  def listGroups(): Request[ListGroupsResponse, AWSError] = js.native
  def listGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsResponse, Unit]): Request[ListGroupsResponse, AWSError] = js.native
  /**
    * Returns a list of all groups in the account, displaying their names, unique IDs, and ARNs. The groups from all Regions are returned.
    */
  def listGroups(params: ListGroupsRequest): Request[ListGroupsResponse, AWSError] = js.native
  def listGroups(
    params: ListGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsResponse, Unit]
  ): Request[ListGroupsResponse, AWSError] = js.native
  
  /**
    * Displays the tags associated with a canary or group.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Displays the tags associated with a canary or group.
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
    * Stops the canary to prevent all future runs. If the canary is currently running,the run that is in progress completes on its own, publishes metrics, and uploads artifacts, but it is not recorded in Synthetics as a completed run. You can use StartCanary to start it running again with the canary’s current schedule at any point in the future. 
    */
  def stopCanary(): Request[StopCanaryResponse, AWSError] = js.native
  def stopCanary(callback: js.Function2[/* err */ AWSError, /* data */ StopCanaryResponse, Unit]): Request[StopCanaryResponse, AWSError] = js.native
  /**
    * Stops the canary to prevent all future runs. If the canary is currently running,the run that is in progress completes on its own, publishes metrics, and uploads artifacts, but it is not recorded in Synthetics as a completed run. You can use StartCanary to start it running again with the canary’s current schedule at any point in the future. 
    */
  def stopCanary(params: StopCanaryRequest): Request[StopCanaryResponse, AWSError] = js.native
  def stopCanary(
    params: StopCanaryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopCanaryResponse, Unit]
  ): Request[StopCanaryResponse, AWSError] = js.native
  
  /**
    * Assigns one or more tags (key-value pairs) to the specified canary or group.  Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only resources with certain tag values. Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of characters. You can use the TagResource action with a resource that already has tags. If you specify a new tag key for the resource, this tag is appended to the list of tags associated with the resource. If you specify a tag key that is already associated with the resource, the new tag value that you specify replaces the previous value for that tag. You can associate as many as 50 tags with a canary or group.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Assigns one or more tags (key-value pairs) to the specified canary or group.  Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only resources with certain tag values. Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of characters. You can use the TagResource action with a resource that already has tags. If you specify a new tag key for the resource, this tag is appended to the list of tags associated with the resource. If you specify a tag key that is already associated with the resource, the new tag value that you specify replaces the previous value for that tag. You can associate as many as 50 tags with a canary or group.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes one or more tags from the specified resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes one or more tags from the specified resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates the configuration of a canary that has already been created. You can't use this operation to update the tags of an existing canary. To change the tags of an existing canary, use TagResource.
    */
  def updateCanary(): Request[UpdateCanaryResponse, AWSError] = js.native
  def updateCanary(callback: js.Function2[/* err */ AWSError, /* data */ UpdateCanaryResponse, Unit]): Request[UpdateCanaryResponse, AWSError] = js.native
  /**
    * Updates the configuration of a canary that has already been created. You can't use this operation to update the tags of an existing canary. To change the tags of an existing canary, use TagResource.
    */
  def updateCanary(params: UpdateCanaryRequest): Request[UpdateCanaryResponse, AWSError] = js.native
  def updateCanary(
    params: UpdateCanaryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCanaryResponse, Unit]
  ): Request[UpdateCanaryResponse, AWSError] = js.native
}
