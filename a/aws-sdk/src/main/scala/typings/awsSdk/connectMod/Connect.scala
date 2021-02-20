package typings.awsSdk.connectMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connect extends Service {
  
  /**
    * Associates an approved origin to an Amazon Connect instance.
    */
  def associateApprovedOrigin(): Request[js.Object, AWSError] = js.native
  def associateApprovedOrigin(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Associates an approved origin to an Amazon Connect instance.
    */
  def associateApprovedOrigin(params: AssociateApprovedOriginRequest): Request[js.Object, AWSError] = js.native
  def associateApprovedOrigin(
    params: AssociateApprovedOriginRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Associates a storage resource type for the first time. You can only associate one type of storage configuration in a single call. This means, for example, that you can't define an instance with multiple S3 buckets for storing chat transcripts. This API does not create a resource that doesn't exist. It only associates it to the instance. Ensure that the resource being specified in the storage configuration, like an Amazon S3 bucket, exists when being used for association.
    */
  def associateInstanceStorageConfig(): Request[AssociateInstanceStorageConfigResponse, AWSError] = js.native
  def associateInstanceStorageConfig(
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateInstanceStorageConfigResponse, scala.Unit]
  ): Request[AssociateInstanceStorageConfigResponse, AWSError] = js.native
  /**
    * Associates a storage resource type for the first time. You can only associate one type of storage configuration in a single call. This means, for example, that you can't define an instance with multiple S3 buckets for storing chat transcripts. This API does not create a resource that doesn't exist. It only associates it to the instance. Ensure that the resource being specified in the storage configuration, like an Amazon S3 bucket, exists when being used for association.
    */
  def associateInstanceStorageConfig(params: AssociateInstanceStorageConfigRequest): Request[AssociateInstanceStorageConfigResponse, AWSError] = js.native
  def associateInstanceStorageConfig(
    params: AssociateInstanceStorageConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateInstanceStorageConfigResponse, scala.Unit]
  ): Request[AssociateInstanceStorageConfigResponse, AWSError] = js.native
  
  /**
    * Allows the specified Amazon Connect instance to access the specified Lambda function.
    */
  def associateLambdaFunction(): Request[js.Object, AWSError] = js.native
  def associateLambdaFunction(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Allows the specified Amazon Connect instance to access the specified Lambda function.
    */
  def associateLambdaFunction(params: AssociateLambdaFunctionRequest): Request[js.Object, AWSError] = js.native
  def associateLambdaFunction(
    params: AssociateLambdaFunctionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Allows the specified Amazon Connect instance to access the specified Amazon Lex bot.
    */
  def associateLexBot(): Request[js.Object, AWSError] = js.native
  def associateLexBot(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Allows the specified Amazon Connect instance to access the specified Amazon Lex bot.
    */
  def associateLexBot(params: AssociateLexBotRequest): Request[js.Object, AWSError] = js.native
  def associateLexBot(
    params: AssociateLexBotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Associates a set of queues with a routing profile.
    */
  def associateRoutingProfileQueues(): Request[js.Object, AWSError] = js.native
  def associateRoutingProfileQueues(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Associates a set of queues with a routing profile.
    */
  def associateRoutingProfileQueues(params: AssociateRoutingProfileQueuesRequest): Request[js.Object, AWSError] = js.native
  def associateRoutingProfileQueues(
    params: AssociateRoutingProfileQueuesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Associates a security key to the instance.
    */
  def associateSecurityKey(): Request[AssociateSecurityKeyResponse, AWSError] = js.native
  def associateSecurityKey(callback: js.Function2[/* err */ AWSError, /* data */ AssociateSecurityKeyResponse, scala.Unit]): Request[AssociateSecurityKeyResponse, AWSError] = js.native
  /**
    * Associates a security key to the instance.
    */
  def associateSecurityKey(params: AssociateSecurityKeyRequest): Request[AssociateSecurityKeyResponse, AWSError] = js.native
  def associateSecurityKey(
    params: AssociateSecurityKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateSecurityKeyResponse, scala.Unit]
  ): Request[AssociateSecurityKeyResponse, AWSError] = js.native
  
  @JSName("config")
  var config_Connect: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Creates a contact flow for the specified Amazon Connect instance. You can also create and update contact flows using the Amazon Connect Flow language.
    */
  def createContactFlow(): Request[CreateContactFlowResponse, AWSError] = js.native
  def createContactFlow(callback: js.Function2[/* err */ AWSError, /* data */ CreateContactFlowResponse, scala.Unit]): Request[CreateContactFlowResponse, AWSError] = js.native
  /**
    * Creates a contact flow for the specified Amazon Connect instance. You can also create and update contact flows using the Amazon Connect Flow language.
    */
  def createContactFlow(params: CreateContactFlowRequest): Request[CreateContactFlowResponse, AWSError] = js.native
  def createContactFlow(
    params: CreateContactFlowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateContactFlowResponse, scala.Unit]
  ): Request[CreateContactFlowResponse, AWSError] = js.native
  
  /**
    * Initiates an Amazon Connect instance with all the supported channels enabled. It does not attach any storage (such as Amazon S3, or Kinesis) or allow for any configurations on features such as Contact Lens for Amazon Connect. 
    */
  def createInstance(): Request[CreateInstanceResponse, AWSError] = js.native
  def createInstance(callback: js.Function2[/* err */ AWSError, /* data */ CreateInstanceResponse, scala.Unit]): Request[CreateInstanceResponse, AWSError] = js.native
  /**
    * Initiates an Amazon Connect instance with all the supported channels enabled. It does not attach any storage (such as Amazon S3, or Kinesis) or allow for any configurations on features such as Contact Lens for Amazon Connect. 
    */
  def createInstance(params: CreateInstanceRequest): Request[CreateInstanceResponse, AWSError] = js.native
  def createInstance(
    params: CreateInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateInstanceResponse, scala.Unit]
  ): Request[CreateInstanceResponse, AWSError] = js.native
  
  /**
    * Creates a new routing profile.
    */
  def createRoutingProfile(): Request[CreateRoutingProfileResponse, AWSError] = js.native
  def createRoutingProfile(callback: js.Function2[/* err */ AWSError, /* data */ CreateRoutingProfileResponse, scala.Unit]): Request[CreateRoutingProfileResponse, AWSError] = js.native
  /**
    * Creates a new routing profile.
    */
  def createRoutingProfile(params: CreateRoutingProfileRequest): Request[CreateRoutingProfileResponse, AWSError] = js.native
  def createRoutingProfile(
    params: CreateRoutingProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRoutingProfileResponse, scala.Unit]
  ): Request[CreateRoutingProfileResponse, AWSError] = js.native
  
  /**
    * Creates a user account for the specified Amazon Connect instance. For information about how to create user accounts using the Amazon Connect console, see Add Users in the Amazon Connect Administrator Guide.
    */
  def createUser(): Request[CreateUserResponse, AWSError] = js.native
  def createUser(callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, scala.Unit]): Request[CreateUserResponse, AWSError] = js.native
  /**
    * Creates a user account for the specified Amazon Connect instance. For information about how to create user accounts using the Amazon Connect console, see Add Users in the Amazon Connect Administrator Guide.
    */
  def createUser(params: CreateUserRequest): Request[CreateUserResponse, AWSError] = js.native
  def createUser(
    params: CreateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, scala.Unit]
  ): Request[CreateUserResponse, AWSError] = js.native
  
  /**
    * Creates a new user hierarchy group.
    */
  def createUserHierarchyGroup(): Request[CreateUserHierarchyGroupResponse, AWSError] = js.native
  def createUserHierarchyGroup(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUserHierarchyGroupResponse, scala.Unit]
  ): Request[CreateUserHierarchyGroupResponse, AWSError] = js.native
  /**
    * Creates a new user hierarchy group.
    */
  def createUserHierarchyGroup(params: CreateUserHierarchyGroupRequest): Request[CreateUserHierarchyGroupResponse, AWSError] = js.native
  def createUserHierarchyGroup(
    params: CreateUserHierarchyGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUserHierarchyGroupResponse, scala.Unit]
  ): Request[CreateUserHierarchyGroupResponse, AWSError] = js.native
  
  /**
    * Deletes the Amazon Connect instance.
    */
  def deleteInstance(): Request[js.Object, AWSError] = js.native
  def deleteInstance(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the Amazon Connect instance.
    */
  def deleteInstance(params: DeleteInstanceRequest): Request[js.Object, AWSError] = js.native
  def deleteInstance(
    params: DeleteInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a user account from the specified Amazon Connect instance. For information about what happens to a user's data when their account is deleted, see Delete Users from Your Amazon Connect Instance in the Amazon Connect Administrator Guide.
    */
  def deleteUser(): Request[js.Object, AWSError] = js.native
  def deleteUser(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a user account from the specified Amazon Connect instance. For information about what happens to a user's data when their account is deleted, see Delete Users from Your Amazon Connect Instance in the Amazon Connect Administrator Guide.
    */
  def deleteUser(params: DeleteUserRequest): Request[js.Object, AWSError] = js.native
  def deleteUser(
    params: DeleteUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an existing user hierarchy group. It must not be associated with any agents or have any active child groups.
    */
  def deleteUserHierarchyGroup(): Request[js.Object, AWSError] = js.native
  def deleteUserHierarchyGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an existing user hierarchy group. It must not be associated with any agents or have any active child groups.
    */
  def deleteUserHierarchyGroup(params: DeleteUserHierarchyGroupRequest): Request[js.Object, AWSError] = js.native
  def deleteUserHierarchyGroup(
    params: DeleteUserHierarchyGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Describes the specified contact flow. You can also create and update contact flows using the Amazon Connect Flow language.
    */
  def describeContactFlow(): Request[DescribeContactFlowResponse, AWSError] = js.native
  def describeContactFlow(callback: js.Function2[/* err */ AWSError, /* data */ DescribeContactFlowResponse, scala.Unit]): Request[DescribeContactFlowResponse, AWSError] = js.native
  /**
    * Describes the specified contact flow. You can also create and update contact flows using the Amazon Connect Flow language.
    */
  def describeContactFlow(params: DescribeContactFlowRequest): Request[DescribeContactFlowResponse, AWSError] = js.native
  def describeContactFlow(
    params: DescribeContactFlowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeContactFlowResponse, scala.Unit]
  ): Request[DescribeContactFlowResponse, AWSError] = js.native
  
  /**
    * Returns the current state of the specified instance identifier. It tracks the instance while it is being created and returns an error status if applicable.  If an instance is not created successfully, the instance status reason field returns details relevant to the reason. The instance in a failed state is returned only for 24 hours after the CreateInstance API was invoked.
    */
  def describeInstance(): Request[DescribeInstanceResponse, AWSError] = js.native
  def describeInstance(callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceResponse, scala.Unit]): Request[DescribeInstanceResponse, AWSError] = js.native
  /**
    * Returns the current state of the specified instance identifier. It tracks the instance while it is being created and returns an error status if applicable.  If an instance is not created successfully, the instance status reason field returns details relevant to the reason. The instance in a failed state is returned only for 24 hours after the CreateInstance API was invoked.
    */
  def describeInstance(params: DescribeInstanceRequest): Request[DescribeInstanceResponse, AWSError] = js.native
  def describeInstance(
    params: DescribeInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceResponse, scala.Unit]
  ): Request[DescribeInstanceResponse, AWSError] = js.native
  
  /**
    * Describes the specified instance attribute.
    */
  def describeInstanceAttribute(): Request[DescribeInstanceAttributeResponse, AWSError] = js.native
  def describeInstanceAttribute(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceAttributeResponse, scala.Unit]
  ): Request[DescribeInstanceAttributeResponse, AWSError] = js.native
  /**
    * Describes the specified instance attribute.
    */
  def describeInstanceAttribute(params: DescribeInstanceAttributeRequest): Request[DescribeInstanceAttributeResponse, AWSError] = js.native
  def describeInstanceAttribute(
    params: DescribeInstanceAttributeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceAttributeResponse, scala.Unit]
  ): Request[DescribeInstanceAttributeResponse, AWSError] = js.native
  
  /**
    * Retrieves the current storage configurations for the specified resource type, association ID, and instance ID.
    */
  def describeInstanceStorageConfig(): Request[DescribeInstanceStorageConfigResponse, AWSError] = js.native
  def describeInstanceStorageConfig(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceStorageConfigResponse, scala.Unit]
  ): Request[DescribeInstanceStorageConfigResponse, AWSError] = js.native
  /**
    * Retrieves the current storage configurations for the specified resource type, association ID, and instance ID.
    */
  def describeInstanceStorageConfig(params: DescribeInstanceStorageConfigRequest): Request[DescribeInstanceStorageConfigResponse, AWSError] = js.native
  def describeInstanceStorageConfig(
    params: DescribeInstanceStorageConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceStorageConfigResponse, scala.Unit]
  ): Request[DescribeInstanceStorageConfigResponse, AWSError] = js.native
  
  /**
    * Describes the specified routing profile.
    */
  def describeRoutingProfile(): Request[DescribeRoutingProfileResponse, AWSError] = js.native
  def describeRoutingProfile(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRoutingProfileResponse, scala.Unit]): Request[DescribeRoutingProfileResponse, AWSError] = js.native
  /**
    * Describes the specified routing profile.
    */
  def describeRoutingProfile(params: DescribeRoutingProfileRequest): Request[DescribeRoutingProfileResponse, AWSError] = js.native
  def describeRoutingProfile(
    params: DescribeRoutingProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRoutingProfileResponse, scala.Unit]
  ): Request[DescribeRoutingProfileResponse, AWSError] = js.native
  
  /**
    * Describes the specified user account. You can find the instance ID in the console (it’s the final part of the ARN). The console does not display the user IDs. Instead, list the users and note the IDs provided in the output.
    */
  def describeUser(): Request[DescribeUserResponse, AWSError] = js.native
  def describeUser(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserResponse, scala.Unit]): Request[DescribeUserResponse, AWSError] = js.native
  /**
    * Describes the specified user account. You can find the instance ID in the console (it’s the final part of the ARN). The console does not display the user IDs. Instead, list the users and note the IDs provided in the output.
    */
  def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse, AWSError] = js.native
  def describeUser(
    params: DescribeUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserResponse, scala.Unit]
  ): Request[DescribeUserResponse, AWSError] = js.native
  
  /**
    * Describes the specified hierarchy group.
    */
  def describeUserHierarchyGroup(): Request[DescribeUserHierarchyGroupResponse, AWSError] = js.native
  def describeUserHierarchyGroup(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserHierarchyGroupResponse, scala.Unit]
  ): Request[DescribeUserHierarchyGroupResponse, AWSError] = js.native
  /**
    * Describes the specified hierarchy group.
    */
  def describeUserHierarchyGroup(params: DescribeUserHierarchyGroupRequest): Request[DescribeUserHierarchyGroupResponse, AWSError] = js.native
  def describeUserHierarchyGroup(
    params: DescribeUserHierarchyGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserHierarchyGroupResponse, scala.Unit]
  ): Request[DescribeUserHierarchyGroupResponse, AWSError] = js.native
  
  /**
    * Describes the hierarchy structure of the specified Amazon Connect instance.
    */
  def describeUserHierarchyStructure(): Request[DescribeUserHierarchyStructureResponse, AWSError] = js.native
  def describeUserHierarchyStructure(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserHierarchyStructureResponse, scala.Unit]
  ): Request[DescribeUserHierarchyStructureResponse, AWSError] = js.native
  /**
    * Describes the hierarchy structure of the specified Amazon Connect instance.
    */
  def describeUserHierarchyStructure(params: DescribeUserHierarchyStructureRequest): Request[DescribeUserHierarchyStructureResponse, AWSError] = js.native
  def describeUserHierarchyStructure(
    params: DescribeUserHierarchyStructureRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserHierarchyStructureResponse, scala.Unit]
  ): Request[DescribeUserHierarchyStructureResponse, AWSError] = js.native
  
  /**
    * Revokes access to integrated applications from Amazon Connect.
    */
  def disassociateApprovedOrigin(): Request[js.Object, AWSError] = js.native
  def disassociateApprovedOrigin(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Revokes access to integrated applications from Amazon Connect.
    */
  def disassociateApprovedOrigin(params: DisassociateApprovedOriginRequest): Request[js.Object, AWSError] = js.native
  def disassociateApprovedOrigin(
    params: DisassociateApprovedOriginRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes the storage type configurations for the specified resource type and association ID.
    */
  def disassociateInstanceStorageConfig(): Request[js.Object, AWSError] = js.native
  def disassociateInstanceStorageConfig(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the storage type configurations for the specified resource type and association ID.
    */
  def disassociateInstanceStorageConfig(params: DisassociateInstanceStorageConfigRequest): Request[js.Object, AWSError] = js.native
  def disassociateInstanceStorageConfig(
    params: DisassociateInstanceStorageConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Remove the Lambda function from the drop-down options available in the relevant contact flow blocks.
    */
  def disassociateLambdaFunction(): Request[js.Object, AWSError] = js.native
  def disassociateLambdaFunction(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Remove the Lambda function from the drop-down options available in the relevant contact flow blocks.
    */
  def disassociateLambdaFunction(params: DisassociateLambdaFunctionRequest): Request[js.Object, AWSError] = js.native
  def disassociateLambdaFunction(
    params: DisassociateLambdaFunctionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Revokes authorization from the specified instance to access the specified Amazon Lex bot.
    */
  def disassociateLexBot(): Request[js.Object, AWSError] = js.native
  def disassociateLexBot(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Revokes authorization from the specified instance to access the specified Amazon Lex bot.
    */
  def disassociateLexBot(params: DisassociateLexBotRequest): Request[js.Object, AWSError] = js.native
  def disassociateLexBot(
    params: DisassociateLexBotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Disassociates a set of queues from a routing profile.
    */
  def disassociateRoutingProfileQueues(): Request[js.Object, AWSError] = js.native
  def disassociateRoutingProfileQueues(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Disassociates a set of queues from a routing profile.
    */
  def disassociateRoutingProfileQueues(params: DisassociateRoutingProfileQueuesRequest): Request[js.Object, AWSError] = js.native
  def disassociateRoutingProfileQueues(
    params: DisassociateRoutingProfileQueuesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified security key.
    */
  def disassociateSecurityKey(): Request[js.Object, AWSError] = js.native
  def disassociateSecurityKey(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified security key.
    */
  def disassociateSecurityKey(params: DisassociateSecurityKeyRequest): Request[js.Object, AWSError] = js.native
  def disassociateSecurityKey(
    params: DisassociateSecurityKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Retrieves the contact attributes for the specified contact.
    */
  def getContactAttributes(): Request[GetContactAttributesResponse, AWSError] = js.native
  def getContactAttributes(callback: js.Function2[/* err */ AWSError, /* data */ GetContactAttributesResponse, scala.Unit]): Request[GetContactAttributesResponse, AWSError] = js.native
  /**
    * Retrieves the contact attributes for the specified contact.
    */
  def getContactAttributes(params: GetContactAttributesRequest): Request[GetContactAttributesResponse, AWSError] = js.native
  def getContactAttributes(
    params: GetContactAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetContactAttributesResponse, scala.Unit]
  ): Request[GetContactAttributesResponse, AWSError] = js.native
  
  /**
    * Gets the real-time metric data from the specified Amazon Connect instance. For a description of each metric, see Real-time Metrics Definitions in the Amazon Connect Administrator Guide.
    */
  def getCurrentMetricData(): Request[GetCurrentMetricDataResponse, AWSError] = js.native
  def getCurrentMetricData(callback: js.Function2[/* err */ AWSError, /* data */ GetCurrentMetricDataResponse, scala.Unit]): Request[GetCurrentMetricDataResponse, AWSError] = js.native
  /**
    * Gets the real-time metric data from the specified Amazon Connect instance. For a description of each metric, see Real-time Metrics Definitions in the Amazon Connect Administrator Guide.
    */
  def getCurrentMetricData(params: GetCurrentMetricDataRequest): Request[GetCurrentMetricDataResponse, AWSError] = js.native
  def getCurrentMetricData(
    params: GetCurrentMetricDataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCurrentMetricDataResponse, scala.Unit]
  ): Request[GetCurrentMetricDataResponse, AWSError] = js.native
  
  /**
    * Retrieves a token for federation.
    */
  def getFederationToken(): Request[GetFederationTokenResponse, AWSError] = js.native
  def getFederationToken(callback: js.Function2[/* err */ AWSError, /* data */ GetFederationTokenResponse, scala.Unit]): Request[GetFederationTokenResponse, AWSError] = js.native
  /**
    * Retrieves a token for federation.
    */
  def getFederationToken(params: GetFederationTokenRequest): Request[GetFederationTokenResponse, AWSError] = js.native
  def getFederationToken(
    params: GetFederationTokenRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFederationTokenResponse, scala.Unit]
  ): Request[GetFederationTokenResponse, AWSError] = js.native
  
  /**
    * Gets historical metric data from the specified Amazon Connect instance. For a description of each historical metric, see Historical Metrics Definitions in the Amazon Connect Administrator Guide.
    */
  def getMetricData(): Request[GetMetricDataResponse, AWSError] = js.native
  def getMetricData(callback: js.Function2[/* err */ AWSError, /* data */ GetMetricDataResponse, scala.Unit]): Request[GetMetricDataResponse, AWSError] = js.native
  /**
    * Gets historical metric data from the specified Amazon Connect instance. For a description of each historical metric, see Historical Metrics Definitions in the Amazon Connect Administrator Guide.
    */
  def getMetricData(params: GetMetricDataRequest): Request[GetMetricDataResponse, AWSError] = js.native
  def getMetricData(
    params: GetMetricDataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMetricDataResponse, scala.Unit]
  ): Request[GetMetricDataResponse, AWSError] = js.native
  
  /**
    * Returns a paginated list of all approved origins associated with the instance.
    */
  def listApprovedOrigins(): Request[ListApprovedOriginsResponse, AWSError] = js.native
  def listApprovedOrigins(callback: js.Function2[/* err */ AWSError, /* data */ ListApprovedOriginsResponse, scala.Unit]): Request[ListApprovedOriginsResponse, AWSError] = js.native
  /**
    * Returns a paginated list of all approved origins associated with the instance.
    */
  def listApprovedOrigins(params: ListApprovedOriginsRequest): Request[ListApprovedOriginsResponse, AWSError] = js.native
  def listApprovedOrigins(
    params: ListApprovedOriginsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListApprovedOriginsResponse, scala.Unit]
  ): Request[ListApprovedOriginsResponse, AWSError] = js.native
  
  /**
    * Provides information about the contact flows for the specified Amazon Connect instance. You can also create and update contact flows using the Amazon Connect Flow language. For more information about contact flows, see Contact Flows in the Amazon Connect Administrator Guide.
    */
  def listContactFlows(): Request[ListContactFlowsResponse, AWSError] = js.native
  def listContactFlows(callback: js.Function2[/* err */ AWSError, /* data */ ListContactFlowsResponse, scala.Unit]): Request[ListContactFlowsResponse, AWSError] = js.native
  /**
    * Provides information about the contact flows for the specified Amazon Connect instance. You can also create and update contact flows using the Amazon Connect Flow language. For more information about contact flows, see Contact Flows in the Amazon Connect Administrator Guide.
    */
  def listContactFlows(params: ListContactFlowsRequest): Request[ListContactFlowsResponse, AWSError] = js.native
  def listContactFlows(
    params: ListContactFlowsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListContactFlowsResponse, scala.Unit]
  ): Request[ListContactFlowsResponse, AWSError] = js.native
  
  /**
    * Provides information about the hours of operation for the specified Amazon Connect instance. For more information about hours of operation, see Set the Hours of Operation for a Queue in the Amazon Connect Administrator Guide.
    */
  def listHoursOfOperations(): Request[ListHoursOfOperationsResponse, AWSError] = js.native
  def listHoursOfOperations(callback: js.Function2[/* err */ AWSError, /* data */ ListHoursOfOperationsResponse, scala.Unit]): Request[ListHoursOfOperationsResponse, AWSError] = js.native
  /**
    * Provides information about the hours of operation for the specified Amazon Connect instance. For more information about hours of operation, see Set the Hours of Operation for a Queue in the Amazon Connect Administrator Guide.
    */
  def listHoursOfOperations(params: ListHoursOfOperationsRequest): Request[ListHoursOfOperationsResponse, AWSError] = js.native
  def listHoursOfOperations(
    params: ListHoursOfOperationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListHoursOfOperationsResponse, scala.Unit]
  ): Request[ListHoursOfOperationsResponse, AWSError] = js.native
  
  /**
    * Returns a paginated list of all attribute types for the given instance.
    */
  def listInstanceAttributes(): Request[ListInstanceAttributesResponse, AWSError] = js.native
  def listInstanceAttributes(callback: js.Function2[/* err */ AWSError, /* data */ ListInstanceAttributesResponse, scala.Unit]): Request[ListInstanceAttributesResponse, AWSError] = js.native
  /**
    * Returns a paginated list of all attribute types for the given instance.
    */
  def listInstanceAttributes(params: ListInstanceAttributesRequest): Request[ListInstanceAttributesResponse, AWSError] = js.native
  def listInstanceAttributes(
    params: ListInstanceAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInstanceAttributesResponse, scala.Unit]
  ): Request[ListInstanceAttributesResponse, AWSError] = js.native
  
  /**
    * Returns a paginated list of storage configs for the identified instance and resource type.
    */
  def listInstanceStorageConfigs(): Request[ListInstanceStorageConfigsResponse, AWSError] = js.native
  def listInstanceStorageConfigs(
    callback: js.Function2[/* err */ AWSError, /* data */ ListInstanceStorageConfigsResponse, scala.Unit]
  ): Request[ListInstanceStorageConfigsResponse, AWSError] = js.native
  /**
    * Returns a paginated list of storage configs for the identified instance and resource type.
    */
  def listInstanceStorageConfigs(params: ListInstanceStorageConfigsRequest): Request[ListInstanceStorageConfigsResponse, AWSError] = js.native
  def listInstanceStorageConfigs(
    params: ListInstanceStorageConfigsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInstanceStorageConfigsResponse, scala.Unit]
  ): Request[ListInstanceStorageConfigsResponse, AWSError] = js.native
  
  /**
    * Return a list of instances which are in active state, creation-in-progress state, and failed state. Instances that aren't successfully created (they are in a failed state) are returned only for 24 hours after the CreateInstance API was invoked.
    */
  def listInstances(): Request[ListInstancesResponse, AWSError] = js.native
  def listInstances(callback: js.Function2[/* err */ AWSError, /* data */ ListInstancesResponse, scala.Unit]): Request[ListInstancesResponse, AWSError] = js.native
  /**
    * Return a list of instances which are in active state, creation-in-progress state, and failed state. Instances that aren't successfully created (they are in a failed state) are returned only for 24 hours after the CreateInstance API was invoked.
    */
  def listInstances(params: ListInstancesRequest): Request[ListInstancesResponse, AWSError] = js.native
  def listInstances(
    params: ListInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInstancesResponse, scala.Unit]
  ): Request[ListInstancesResponse, AWSError] = js.native
  
  /**
    * Returns a paginated list of all the Lambda functions that show up in the drop-down options in the relevant contact flow blocks.
    */
  def listLambdaFunctions(): Request[ListLambdaFunctionsResponse, AWSError] = js.native
  def listLambdaFunctions(callback: js.Function2[/* err */ AWSError, /* data */ ListLambdaFunctionsResponse, scala.Unit]): Request[ListLambdaFunctionsResponse, AWSError] = js.native
  /**
    * Returns a paginated list of all the Lambda functions that show up in the drop-down options in the relevant contact flow blocks.
    */
  def listLambdaFunctions(params: ListLambdaFunctionsRequest): Request[ListLambdaFunctionsResponse, AWSError] = js.native
  def listLambdaFunctions(
    params: ListLambdaFunctionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLambdaFunctionsResponse, scala.Unit]
  ): Request[ListLambdaFunctionsResponse, AWSError] = js.native
  
  /**
    * Returns a paginated list of all the Amazon Lex bots currently associated with the instance.
    */
  def listLexBots(): Request[ListLexBotsResponse, AWSError] = js.native
  def listLexBots(callback: js.Function2[/* err */ AWSError, /* data */ ListLexBotsResponse, scala.Unit]): Request[ListLexBotsResponse, AWSError] = js.native
  /**
    * Returns a paginated list of all the Amazon Lex bots currently associated with the instance.
    */
  def listLexBots(params: ListLexBotsRequest): Request[ListLexBotsResponse, AWSError] = js.native
  def listLexBots(
    params: ListLexBotsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLexBotsResponse, scala.Unit]
  ): Request[ListLexBotsResponse, AWSError] = js.native
  
  /**
    * Provides information about the phone numbers for the specified Amazon Connect instance.  For more information about phone numbers, see Set Up Phone Numbers for Your Contact Center in the Amazon Connect Administrator Guide.
    */
  def listPhoneNumbers(): Request[ListPhoneNumbersResponse, AWSError] = js.native
  def listPhoneNumbers(callback: js.Function2[/* err */ AWSError, /* data */ ListPhoneNumbersResponse, scala.Unit]): Request[ListPhoneNumbersResponse, AWSError] = js.native
  /**
    * Provides information about the phone numbers for the specified Amazon Connect instance.  For more information about phone numbers, see Set Up Phone Numbers for Your Contact Center in the Amazon Connect Administrator Guide.
    */
  def listPhoneNumbers(params: ListPhoneNumbersRequest): Request[ListPhoneNumbersResponse, AWSError] = js.native
  def listPhoneNumbers(
    params: ListPhoneNumbersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPhoneNumbersResponse, scala.Unit]
  ): Request[ListPhoneNumbersResponse, AWSError] = js.native
  
  /**
    * Provides information about the prompts for the specified Amazon Connect instance.
    */
  def listPrompts(): Request[ListPromptsResponse, AWSError] = js.native
  def listPrompts(callback: js.Function2[/* err */ AWSError, /* data */ ListPromptsResponse, scala.Unit]): Request[ListPromptsResponse, AWSError] = js.native
  /**
    * Provides information about the prompts for the specified Amazon Connect instance.
    */
  def listPrompts(params: ListPromptsRequest): Request[ListPromptsResponse, AWSError] = js.native
  def listPrompts(
    params: ListPromptsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPromptsResponse, scala.Unit]
  ): Request[ListPromptsResponse, AWSError] = js.native
  
  /**
    * Provides information about the queues for the specified Amazon Connect instance. For more information about queues, see Queues: Standard and Agent in the Amazon Connect Administrator Guide.
    */
  def listQueues(): Request[ListQueuesResponse, AWSError] = js.native
  def listQueues(callback: js.Function2[/* err */ AWSError, /* data */ ListQueuesResponse, scala.Unit]): Request[ListQueuesResponse, AWSError] = js.native
  /**
    * Provides information about the queues for the specified Amazon Connect instance. For more information about queues, see Queues: Standard and Agent in the Amazon Connect Administrator Guide.
    */
  def listQueues(params: ListQueuesRequest): Request[ListQueuesResponse, AWSError] = js.native
  def listQueues(
    params: ListQueuesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListQueuesResponse, scala.Unit]
  ): Request[ListQueuesResponse, AWSError] = js.native
  
  /**
    * List the queues associated with a routing profile.
    */
  def listRoutingProfileQueues(): Request[ListRoutingProfileQueuesResponse, AWSError] = js.native
  def listRoutingProfileQueues(
    callback: js.Function2[/* err */ AWSError, /* data */ ListRoutingProfileQueuesResponse, scala.Unit]
  ): Request[ListRoutingProfileQueuesResponse, AWSError] = js.native
  /**
    * List the queues associated with a routing profile.
    */
  def listRoutingProfileQueues(params: ListRoutingProfileQueuesRequest): Request[ListRoutingProfileQueuesResponse, AWSError] = js.native
  def listRoutingProfileQueues(
    params: ListRoutingProfileQueuesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRoutingProfileQueuesResponse, scala.Unit]
  ): Request[ListRoutingProfileQueuesResponse, AWSError] = js.native
  
  /**
    * Provides summary information about the routing profiles for the specified Amazon Connect instance. For more information about routing profiles, see Routing Profiles and Create a Routing Profile in the Amazon Connect Administrator Guide.
    */
  def listRoutingProfiles(): Request[ListRoutingProfilesResponse, AWSError] = js.native
  def listRoutingProfiles(callback: js.Function2[/* err */ AWSError, /* data */ ListRoutingProfilesResponse, scala.Unit]): Request[ListRoutingProfilesResponse, AWSError] = js.native
  /**
    * Provides summary information about the routing profiles for the specified Amazon Connect instance. For more information about routing profiles, see Routing Profiles and Create a Routing Profile in the Amazon Connect Administrator Guide.
    */
  def listRoutingProfiles(params: ListRoutingProfilesRequest): Request[ListRoutingProfilesResponse, AWSError] = js.native
  def listRoutingProfiles(
    params: ListRoutingProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRoutingProfilesResponse, scala.Unit]
  ): Request[ListRoutingProfilesResponse, AWSError] = js.native
  
  /**
    * Returns a paginated list of all security keys associated with the instance.
    */
  def listSecurityKeys(): Request[ListSecurityKeysResponse, AWSError] = js.native
  def listSecurityKeys(callback: js.Function2[/* err */ AWSError, /* data */ ListSecurityKeysResponse, scala.Unit]): Request[ListSecurityKeysResponse, AWSError] = js.native
  /**
    * Returns a paginated list of all security keys associated with the instance.
    */
  def listSecurityKeys(params: ListSecurityKeysRequest): Request[ListSecurityKeysResponse, AWSError] = js.native
  def listSecurityKeys(
    params: ListSecurityKeysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSecurityKeysResponse, scala.Unit]
  ): Request[ListSecurityKeysResponse, AWSError] = js.native
  
  /**
    * Provides summary information about the security profiles for the specified Amazon Connect instance. For more information about security profiles, see Security Profiles in the Amazon Connect Administrator Guide.
    */
  def listSecurityProfiles(): Request[ListSecurityProfilesResponse, AWSError] = js.native
  def listSecurityProfiles(callback: js.Function2[/* err */ AWSError, /* data */ ListSecurityProfilesResponse, scala.Unit]): Request[ListSecurityProfilesResponse, AWSError] = js.native
  /**
    * Provides summary information about the security profiles for the specified Amazon Connect instance. For more information about security profiles, see Security Profiles in the Amazon Connect Administrator Guide.
    */
  def listSecurityProfiles(params: ListSecurityProfilesRequest): Request[ListSecurityProfilesResponse, AWSError] = js.native
  def listSecurityProfiles(
    params: ListSecurityProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSecurityProfilesResponse, scala.Unit]
  ): Request[ListSecurityProfilesResponse, AWSError] = js.native
  
  /**
    * Lists the tags for the specified resource. For sample policies that use tags, see Amazon Connect Identity-Based Policy Examples in the Amazon Connect Administrator Guide.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, scala.Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags for the specified resource. For sample policies that use tags, see Amazon Connect Identity-Based Policy Examples in the Amazon Connect Administrator Guide.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, scala.Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Provides summary information about the hierarchy groups for the specified Amazon Connect instance. For more information about agent hierarchies, see Set Up Agent Hierarchies in the Amazon Connect Administrator Guide.
    */
  def listUserHierarchyGroups(): Request[ListUserHierarchyGroupsResponse, AWSError] = js.native
  def listUserHierarchyGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListUserHierarchyGroupsResponse, scala.Unit]): Request[ListUserHierarchyGroupsResponse, AWSError] = js.native
  /**
    * Provides summary information about the hierarchy groups for the specified Amazon Connect instance. For more information about agent hierarchies, see Set Up Agent Hierarchies in the Amazon Connect Administrator Guide.
    */
  def listUserHierarchyGroups(params: ListUserHierarchyGroupsRequest): Request[ListUserHierarchyGroupsResponse, AWSError] = js.native
  def listUserHierarchyGroups(
    params: ListUserHierarchyGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUserHierarchyGroupsResponse, scala.Unit]
  ): Request[ListUserHierarchyGroupsResponse, AWSError] = js.native
  
  /**
    * Provides summary information about the users for the specified Amazon Connect instance.
    */
  def listUsers(): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, scala.Unit]): Request[ListUsersResponse, AWSError] = js.native
  /**
    * Provides summary information about the users for the specified Amazon Connect instance.
    */
  def listUsers(params: ListUsersRequest): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(
    params: ListUsersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, scala.Unit]
  ): Request[ListUsersResponse, AWSError] = js.native
  
  /**
    * When a contact is being recorded, and the recording has been suspended using SuspendContactRecording, this API resumes recording the call. Only voice recordings are supported at this time.
    */
  def resumeContactRecording(): Request[ResumeContactRecordingResponse, AWSError] = js.native
  def resumeContactRecording(callback: js.Function2[/* err */ AWSError, /* data */ ResumeContactRecordingResponse, scala.Unit]): Request[ResumeContactRecordingResponse, AWSError] = js.native
  /**
    * When a contact is being recorded, and the recording has been suspended using SuspendContactRecording, this API resumes recording the call. Only voice recordings are supported at this time.
    */
  def resumeContactRecording(params: ResumeContactRecordingRequest): Request[ResumeContactRecordingResponse, AWSError] = js.native
  def resumeContactRecording(
    params: ResumeContactRecordingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ResumeContactRecordingResponse, scala.Unit]
  ): Request[ResumeContactRecordingResponse, AWSError] = js.native
  
  /**
    * Initiates a contact flow to start a new chat for the customer. Response of this API provides a token required to obtain credentials from the CreateParticipantConnection API in the Amazon Connect Participant Service. When a new chat contact is successfully created, clients need to subscribe to the participant’s connection for the created chat within 5 minutes. This is achieved by invoking CreateParticipantConnection with WEBSOCKET and CONNECTION_CREDENTIALS.  A 429 error occurs in two situations:   API rate limit is exceeded. API TPS throttling returns a TooManyRequests exception from the API Gateway.   The quota for concurrent active chats is exceeded. Active chat throttling returns a LimitExceededException.   For more information about how chat works, see Chat in the Amazon Connect Administrator Guide.
    */
  def startChatContact(): Request[StartChatContactResponse, AWSError] = js.native
  def startChatContact(callback: js.Function2[/* err */ AWSError, /* data */ StartChatContactResponse, scala.Unit]): Request[StartChatContactResponse, AWSError] = js.native
  /**
    * Initiates a contact flow to start a new chat for the customer. Response of this API provides a token required to obtain credentials from the CreateParticipantConnection API in the Amazon Connect Participant Service. When a new chat contact is successfully created, clients need to subscribe to the participant’s connection for the created chat within 5 minutes. This is achieved by invoking CreateParticipantConnection with WEBSOCKET and CONNECTION_CREDENTIALS.  A 429 error occurs in two situations:   API rate limit is exceeded. API TPS throttling returns a TooManyRequests exception from the API Gateway.   The quota for concurrent active chats is exceeded. Active chat throttling returns a LimitExceededException.   For more information about how chat works, see Chat in the Amazon Connect Administrator Guide.
    */
  def startChatContact(params: StartChatContactRequest): Request[StartChatContactResponse, AWSError] = js.native
  def startChatContact(
    params: StartChatContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartChatContactResponse, scala.Unit]
  ): Request[StartChatContactResponse, AWSError] = js.native
  
  /**
    * This API starts recording the contact when the agent joins the call. StartContactRecording is a one-time action. For example, if you use StopContactRecording to stop recording an ongoing call, you can't use StartContactRecording to restart it. For scenarios where the recording has started and you want to suspend and resume it, such as when collecting sensitive information (for example, a credit card number), use SuspendContactRecording and ResumeContactRecording. You can use this API to override the recording behavior configured in the Set recording behavior block. Only voice recordings are supported at this time.
    */
  def startContactRecording(): Request[StartContactRecordingResponse, AWSError] = js.native
  def startContactRecording(callback: js.Function2[/* err */ AWSError, /* data */ StartContactRecordingResponse, scala.Unit]): Request[StartContactRecordingResponse, AWSError] = js.native
  /**
    * This API starts recording the contact when the agent joins the call. StartContactRecording is a one-time action. For example, if you use StopContactRecording to stop recording an ongoing call, you can't use StartContactRecording to restart it. For scenarios where the recording has started and you want to suspend and resume it, such as when collecting sensitive information (for example, a credit card number), use SuspendContactRecording and ResumeContactRecording. You can use this API to override the recording behavior configured in the Set recording behavior block. Only voice recordings are supported at this time.
    */
  def startContactRecording(params: StartContactRecordingRequest): Request[StartContactRecordingResponse, AWSError] = js.native
  def startContactRecording(
    params: StartContactRecordingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartContactRecordingResponse, scala.Unit]
  ): Request[StartContactRecordingResponse, AWSError] = js.native
  
  /**
    * This API places an outbound call to a contact, and then initiates the contact flow. It performs the actions in the contact flow that's specified (in ContactFlowId). Agents are not involved in initiating the outbound API (that is, dialing the contact). If the contact flow places an outbound call to a contact, and then puts the contact in queue, that's when the call is routed to the agent, like any other inbound case. There is a 60 second dialing timeout for this operation. If the call is not connected after 60 seconds, it fails.  UK numbers with a 447 prefix are not allowed by default. Before you can dial these UK mobile numbers, you must submit a service quota increase request. For more information, see Amazon Connect Service Quotas in the Amazon Connect Administrator Guide.  
    */
  def startOutboundVoiceContact(): Request[StartOutboundVoiceContactResponse, AWSError] = js.native
  def startOutboundVoiceContact(
    callback: js.Function2[/* err */ AWSError, /* data */ StartOutboundVoiceContactResponse, scala.Unit]
  ): Request[StartOutboundVoiceContactResponse, AWSError] = js.native
  /**
    * This API places an outbound call to a contact, and then initiates the contact flow. It performs the actions in the contact flow that's specified (in ContactFlowId). Agents are not involved in initiating the outbound API (that is, dialing the contact). If the contact flow places an outbound call to a contact, and then puts the contact in queue, that's when the call is routed to the agent, like any other inbound case. There is a 60 second dialing timeout for this operation. If the call is not connected after 60 seconds, it fails.  UK numbers with a 447 prefix are not allowed by default. Before you can dial these UK mobile numbers, you must submit a service quota increase request. For more information, see Amazon Connect Service Quotas in the Amazon Connect Administrator Guide.  
    */
  def startOutboundVoiceContact(params: StartOutboundVoiceContactRequest): Request[StartOutboundVoiceContactResponse, AWSError] = js.native
  def startOutboundVoiceContact(
    params: StartOutboundVoiceContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartOutboundVoiceContactResponse, scala.Unit]
  ): Request[StartOutboundVoiceContactResponse, AWSError] = js.native
  
  /**
    * Ends the specified contact.
    */
  def stopContact(): Request[StopContactResponse, AWSError] = js.native
  def stopContact(callback: js.Function2[/* err */ AWSError, /* data */ StopContactResponse, scala.Unit]): Request[StopContactResponse, AWSError] = js.native
  /**
    * Ends the specified contact.
    */
  def stopContact(params: StopContactRequest): Request[StopContactResponse, AWSError] = js.native
  def stopContact(
    params: StopContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopContactResponse, scala.Unit]
  ): Request[StopContactResponse, AWSError] = js.native
  
  /**
    * When a contact is being recorded, this API stops recording the call. StopContactRecording is a one-time action. If you use StopContactRecording to stop recording an ongoing call, you can't use StartContactRecording to restart it. For scenarios where the recording has started and you want to suspend it for sensitive information (for example, to collect a credit card number), and then restart it, use SuspendContactRecording and ResumeContactRecording. Only voice recordings are supported at this time.
    */
  def stopContactRecording(): Request[StopContactRecordingResponse, AWSError] = js.native
  def stopContactRecording(callback: js.Function2[/* err */ AWSError, /* data */ StopContactRecordingResponse, scala.Unit]): Request[StopContactRecordingResponse, AWSError] = js.native
  /**
    * When a contact is being recorded, this API stops recording the call. StopContactRecording is a one-time action. If you use StopContactRecording to stop recording an ongoing call, you can't use StartContactRecording to restart it. For scenarios where the recording has started and you want to suspend it for sensitive information (for example, to collect a credit card number), and then restart it, use SuspendContactRecording and ResumeContactRecording. Only voice recordings are supported at this time.
    */
  def stopContactRecording(params: StopContactRecordingRequest): Request[StopContactRecordingResponse, AWSError] = js.native
  def stopContactRecording(
    params: StopContactRecordingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopContactRecordingResponse, scala.Unit]
  ): Request[StopContactRecordingResponse, AWSError] = js.native
  
  /**
    * When a contact is being recorded, this API suspends recording the call. For example, you might suspend the call recording while collecting sensitive information, such as a credit card number. Then use ResumeContactRecording to restart recording.  The period of time that the recording is suspended is filled with silence in the final recording.  Only voice recordings are supported at this time.
    */
  def suspendContactRecording(): Request[SuspendContactRecordingResponse, AWSError] = js.native
  def suspendContactRecording(callback: js.Function2[/* err */ AWSError, /* data */ SuspendContactRecordingResponse, scala.Unit]): Request[SuspendContactRecordingResponse, AWSError] = js.native
  /**
    * When a contact is being recorded, this API suspends recording the call. For example, you might suspend the call recording while collecting sensitive information, such as a credit card number. Then use ResumeContactRecording to restart recording.  The period of time that the recording is suspended is filled with silence in the final recording.  Only voice recordings are supported at this time.
    */
  def suspendContactRecording(params: SuspendContactRecordingRequest): Request[SuspendContactRecordingResponse, AWSError] = js.native
  def suspendContactRecording(
    params: SuspendContactRecordingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SuspendContactRecordingResponse, scala.Unit]
  ): Request[SuspendContactRecordingResponse, AWSError] = js.native
  
  /**
    * Adds the specified tags to the specified resource. The supported resource types are users, routing profiles, and contact flows. For sample policies that use tags, see Amazon Connect Identity-Based Policy Examples in the Amazon Connect Administrator Guide.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds the specified tags to the specified resource. The supported resource types are users, routing profiles, and contact flows. For sample policies that use tags, see Amazon Connect Identity-Based Policy Examples in the Amazon Connect Administrator Guide.
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes the specified tags from the specified resource.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the specified tags from the specified resource.
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Creates or updates the contact attributes associated with the specified contact. You can add or update attributes for both ongoing and completed contacts. For example, you can update the customer's name or the reason the customer called while the call is active, or add notes about steps that the agent took during the call that are displayed to the next agent that takes the call. You can also update attributes for a contact using data from your CRM application and save the data with the contact in Amazon Connect. You could also flag calls for additional analysis, such as legal review or identifying abusive callers. Contact attributes are available in Amazon Connect for 24 months, and are then deleted.  Important: You cannot use the operation to update attributes for contacts that occurred prior to the release of the API, September 12, 2018. You can update attributes only for contacts that started after the release of the API. If you attempt to update attributes for a contact that occurred prior to the release of the API, a 400 error is returned. This applies also to queued callbacks that were initiated prior to the release of the API but are still active in your instance.
    */
  def updateContactAttributes(): Request[UpdateContactAttributesResponse, AWSError] = js.native
  def updateContactAttributes(callback: js.Function2[/* err */ AWSError, /* data */ UpdateContactAttributesResponse, scala.Unit]): Request[UpdateContactAttributesResponse, AWSError] = js.native
  /**
    * Creates or updates the contact attributes associated with the specified contact. You can add or update attributes for both ongoing and completed contacts. For example, you can update the customer's name or the reason the customer called while the call is active, or add notes about steps that the agent took during the call that are displayed to the next agent that takes the call. You can also update attributes for a contact using data from your CRM application and save the data with the contact in Amazon Connect. You could also flag calls for additional analysis, such as legal review or identifying abusive callers. Contact attributes are available in Amazon Connect for 24 months, and are then deleted.  Important: You cannot use the operation to update attributes for contacts that occurred prior to the release of the API, September 12, 2018. You can update attributes only for contacts that started after the release of the API. If you attempt to update attributes for a contact that occurred prior to the release of the API, a 400 error is returned. This applies also to queued callbacks that were initiated prior to the release of the API but are still active in your instance.
    */
  def updateContactAttributes(params: UpdateContactAttributesRequest): Request[UpdateContactAttributesResponse, AWSError] = js.native
  def updateContactAttributes(
    params: UpdateContactAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateContactAttributesResponse, scala.Unit]
  ): Request[UpdateContactAttributesResponse, AWSError] = js.native
  
  /**
    * Updates the specified contact flow. You can also create and update contact flows using the Amazon Connect Flow language.
    */
  def updateContactFlowContent(): Request[js.Object, AWSError] = js.native
  def updateContactFlowContent(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the specified contact flow. You can also create and update contact flows using the Amazon Connect Flow language.
    */
  def updateContactFlowContent(params: UpdateContactFlowContentRequest): Request[js.Object, AWSError] = js.native
  def updateContactFlowContent(
    params: UpdateContactFlowContentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * The name of the contact flow. You can also create and update contact flows using the Amazon Connect Flow language.
    */
  def updateContactFlowName(): Request[js.Object, AWSError] = js.native
  def updateContactFlowName(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * The name of the contact flow. You can also create and update contact flows using the Amazon Connect Flow language.
    */
  def updateContactFlowName(params: UpdateContactFlowNameRequest): Request[js.Object, AWSError] = js.native
  def updateContactFlowName(
    params: UpdateContactFlowNameRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the value for the specified attribute type.
    */
  def updateInstanceAttribute(): Request[js.Object, AWSError] = js.native
  def updateInstanceAttribute(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the value for the specified attribute type.
    */
  def updateInstanceAttribute(params: UpdateInstanceAttributeRequest): Request[js.Object, AWSError] = js.native
  def updateInstanceAttribute(
    params: UpdateInstanceAttributeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates an existing configuration for a resource type. This API is idempotent.
    */
  def updateInstanceStorageConfig(): Request[js.Object, AWSError] = js.native
  def updateInstanceStorageConfig(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates an existing configuration for a resource type. This API is idempotent.
    */
  def updateInstanceStorageConfig(params: UpdateInstanceStorageConfigRequest): Request[js.Object, AWSError] = js.native
  def updateInstanceStorageConfig(
    params: UpdateInstanceStorageConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the channels that agents can handle in the Contact Control Panel (CCP) for a routing profile.
    */
  def updateRoutingProfileConcurrency(): Request[js.Object, AWSError] = js.native
  def updateRoutingProfileConcurrency(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the channels that agents can handle in the Contact Control Panel (CCP) for a routing profile.
    */
  def updateRoutingProfileConcurrency(params: UpdateRoutingProfileConcurrencyRequest): Request[js.Object, AWSError] = js.native
  def updateRoutingProfileConcurrency(
    params: UpdateRoutingProfileConcurrencyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the default outbound queue of a routing profile.
    */
  def updateRoutingProfileDefaultOutboundQueue(): Request[js.Object, AWSError] = js.native
  def updateRoutingProfileDefaultOutboundQueue(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the default outbound queue of a routing profile.
    */
  def updateRoutingProfileDefaultOutboundQueue(params: UpdateRoutingProfileDefaultOutboundQueueRequest): Request[js.Object, AWSError] = js.native
  def updateRoutingProfileDefaultOutboundQueue(
    params: UpdateRoutingProfileDefaultOutboundQueueRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the name and description of a routing profile. The request accepts the following data in JSON format. At least Name or Description must be provided.
    */
  def updateRoutingProfileName(): Request[js.Object, AWSError] = js.native
  def updateRoutingProfileName(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the name and description of a routing profile. The request accepts the following data in JSON format. At least Name or Description must be provided.
    */
  def updateRoutingProfileName(params: UpdateRoutingProfileNameRequest): Request[js.Object, AWSError] = js.native
  def updateRoutingProfileName(
    params: UpdateRoutingProfileNameRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the properties associated with a set of queues for a routing profile.
    */
  def updateRoutingProfileQueues(): Request[js.Object, AWSError] = js.native
  def updateRoutingProfileQueues(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the properties associated with a set of queues for a routing profile.
    */
  def updateRoutingProfileQueues(params: UpdateRoutingProfileQueuesRequest): Request[js.Object, AWSError] = js.native
  def updateRoutingProfileQueues(
    params: UpdateRoutingProfileQueuesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Assigns the specified hierarchy group to the specified user.
    */
  def updateUserHierarchy(): Request[js.Object, AWSError] = js.native
  def updateUserHierarchy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Assigns the specified hierarchy group to the specified user.
    */
  def updateUserHierarchy(params: UpdateUserHierarchyRequest): Request[js.Object, AWSError] = js.native
  def updateUserHierarchy(
    params: UpdateUserHierarchyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the name of the user hierarchy group. 
    */
  def updateUserHierarchyGroupName(): Request[js.Object, AWSError] = js.native
  def updateUserHierarchyGroupName(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the name of the user hierarchy group. 
    */
  def updateUserHierarchyGroupName(params: UpdateUserHierarchyGroupNameRequest): Request[js.Object, AWSError] = js.native
  def updateUserHierarchyGroupName(
    params: UpdateUserHierarchyGroupNameRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the user hierarchy structure: add, remove, and rename user hierarchy levels.
    */
  def updateUserHierarchyStructure(): Request[js.Object, AWSError] = js.native
  def updateUserHierarchyStructure(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the user hierarchy structure: add, remove, and rename user hierarchy levels.
    */
  def updateUserHierarchyStructure(params: UpdateUserHierarchyStructureRequest): Request[js.Object, AWSError] = js.native
  def updateUserHierarchyStructure(
    params: UpdateUserHierarchyStructureRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the identity information for the specified user.  Someone with the ability to invoke UpdateUserIndentityInfo can change the login credentials of other users by changing their email address. This poses a security risk to your organization. They can change the email address of a user to the attacker's email address, and then reset the password through email. We strongly recommend limiting who has the ability to invoke UpdateUserIndentityInfo. For more information, see Best Practices for Security Profiles in the Amazon Connect Administrator Guide. 
    */
  def updateUserIdentityInfo(): Request[js.Object, AWSError] = js.native
  def updateUserIdentityInfo(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the identity information for the specified user.  Someone with the ability to invoke UpdateUserIndentityInfo can change the login credentials of other users by changing their email address. This poses a security risk to your organization. They can change the email address of a user to the attacker's email address, and then reset the password through email. We strongly recommend limiting who has the ability to invoke UpdateUserIndentityInfo. For more information, see Best Practices for Security Profiles in the Amazon Connect Administrator Guide. 
    */
  def updateUserIdentityInfo(params: UpdateUserIdentityInfoRequest): Request[js.Object, AWSError] = js.native
  def updateUserIdentityInfo(
    params: UpdateUserIdentityInfoRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the phone configuration settings for the specified user.
    */
  def updateUserPhoneConfig(): Request[js.Object, AWSError] = js.native
  def updateUserPhoneConfig(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the phone configuration settings for the specified user.
    */
  def updateUserPhoneConfig(params: UpdateUserPhoneConfigRequest): Request[js.Object, AWSError] = js.native
  def updateUserPhoneConfig(
    params: UpdateUserPhoneConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Assigns the specified routing profile to the specified user.
    */
  def updateUserRoutingProfile(): Request[js.Object, AWSError] = js.native
  def updateUserRoutingProfile(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Assigns the specified routing profile to the specified user.
    */
  def updateUserRoutingProfile(params: UpdateUserRoutingProfileRequest): Request[js.Object, AWSError] = js.native
  def updateUserRoutingProfile(
    params: UpdateUserRoutingProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Assigns the specified security profiles to the specified user.
    */
  def updateUserSecurityProfiles(): Request[js.Object, AWSError] = js.native
  def updateUserSecurityProfiles(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Assigns the specified security profiles to the specified user.
    */
  def updateUserSecurityProfiles(params: UpdateUserSecurityProfilesRequest): Request[js.Object, AWSError] = js.native
  def updateUserSecurityProfiles(
    params: UpdateUserSecurityProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
}
