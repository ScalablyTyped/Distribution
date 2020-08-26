package typings.awsSdk.resourcegroupsMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceGroups extends Service {
  @JSName("config")
  var config_ResourceGroups: ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a resource group with the specified name and description. You can optionally include a resource query, or a service configuration.
    */
  def createGroup(): Request[CreateGroupOutput, AWSError] = js.native
  def createGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupOutput, Unit]): Request[CreateGroupOutput, AWSError] = js.native
  /**
    * Creates a resource group with the specified name and description. You can optionally include a resource query, or a service configuration.
    */
  def createGroup(params: CreateGroupInput): Request[CreateGroupOutput, AWSError] = js.native
  def createGroup(
    params: CreateGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupOutput, Unit]
  ): Request[CreateGroupOutput, AWSError] = js.native
  /**
    * Deletes the specified resource group. Deleting a resource group does not delete any resources that are members of the group; it only deletes the group structure.
    */
  def deleteGroup(): Request[DeleteGroupOutput, AWSError] = js.native
  def deleteGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupOutput, Unit]): Request[DeleteGroupOutput, AWSError] = js.native
  /**
    * Deletes the specified resource group. Deleting a resource group does not delete any resources that are members of the group; it only deletes the group structure.
    */
  def deleteGroup(params: DeleteGroupInput): Request[DeleteGroupOutput, AWSError] = js.native
  def deleteGroup(
    params: DeleteGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupOutput, Unit]
  ): Request[DeleteGroupOutput, AWSError] = js.native
  /**
    * Returns information about a specified resource group.
    */
  def getGroup(): Request[GetGroupOutput, AWSError] = js.native
  def getGroup(callback: js.Function2[/* err */ AWSError, /* data */ GetGroupOutput, Unit]): Request[GetGroupOutput, AWSError] = js.native
  /**
    * Returns information about a specified resource group.
    */
  def getGroup(params: GetGroupInput): Request[GetGroupOutput, AWSError] = js.native
  def getGroup(params: GetGroupInput, callback: js.Function2[/* err */ AWSError, /* data */ GetGroupOutput, Unit]): Request[GetGroupOutput, AWSError] = js.native
  /**
    * Returns the service configuration associated with the specified resource group. AWS Resource Groups supports configurations for the following resource group types:    AWS::EC2::CapacityReservationPool - Amazon EC2 capacity reservation pools. For more information, see Working with capacity reservation groups in the EC2 Users Guide.  
    */
  def getGroupConfiguration(): Request[GetGroupConfigurationOutput, AWSError] = js.native
  def getGroupConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetGroupConfigurationOutput, Unit]): Request[GetGroupConfigurationOutput, AWSError] = js.native
  /**
    * Returns the service configuration associated with the specified resource group. AWS Resource Groups supports configurations for the following resource group types:    AWS::EC2::CapacityReservationPool - Amazon EC2 capacity reservation pools. For more information, see Working with capacity reservation groups in the EC2 Users Guide.  
    */
  def getGroupConfiguration(params: GetGroupConfigurationInput): Request[GetGroupConfigurationOutput, AWSError] = js.native
  def getGroupConfiguration(
    params: GetGroupConfigurationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetGroupConfigurationOutput, Unit]
  ): Request[GetGroupConfigurationOutput, AWSError] = js.native
  /**
    * Retrieves the resource query associated with the specified resource group.
    */
  def getGroupQuery(): Request[GetGroupQueryOutput, AWSError] = js.native
  def getGroupQuery(callback: js.Function2[/* err */ AWSError, /* data */ GetGroupQueryOutput, Unit]): Request[GetGroupQueryOutput, AWSError] = js.native
  /**
    * Retrieves the resource query associated with the specified resource group.
    */
  def getGroupQuery(params: GetGroupQueryInput): Request[GetGroupQueryOutput, AWSError] = js.native
  def getGroupQuery(
    params: GetGroupQueryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetGroupQueryOutput, Unit]
  ): Request[GetGroupQueryOutput, AWSError] = js.native
  /**
    * Returns a list of tags that are associated with a resource group, specified by an ARN.
    */
  def getTags(): Request[GetTagsOutput, AWSError] = js.native
  def getTags(callback: js.Function2[/* err */ AWSError, /* data */ GetTagsOutput, Unit]): Request[GetTagsOutput, AWSError] = js.native
  /**
    * Returns a list of tags that are associated with a resource group, specified by an ARN.
    */
  def getTags(params: GetTagsInput): Request[GetTagsOutput, AWSError] = js.native
  def getTags(params: GetTagsInput, callback: js.Function2[/* err */ AWSError, /* data */ GetTagsOutput, Unit]): Request[GetTagsOutput, AWSError] = js.native
  /**
    * Adds the specified resources to the specified group.
    */
  def groupResources(): Request[GroupResourcesOutput, AWSError] = js.native
  def groupResources(callback: js.Function2[/* err */ AWSError, /* data */ GroupResourcesOutput, Unit]): Request[GroupResourcesOutput, AWSError] = js.native
  /**
    * Adds the specified resources to the specified group.
    */
  def groupResources(params: GroupResourcesInput): Request[GroupResourcesOutput, AWSError] = js.native
  def groupResources(
    params: GroupResourcesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GroupResourcesOutput, Unit]
  ): Request[GroupResourcesOutput, AWSError] = js.native
  /**
    * Returns a list of ARNs of the resources that are members of a specified resource group.
    */
  def listGroupResources(): Request[ListGroupResourcesOutput, AWSError] = js.native
  def listGroupResources(callback: js.Function2[/* err */ AWSError, /* data */ ListGroupResourcesOutput, Unit]): Request[ListGroupResourcesOutput, AWSError] = js.native
  /**
    * Returns a list of ARNs of the resources that are members of a specified resource group.
    */
  def listGroupResources(params: ListGroupResourcesInput): Request[ListGroupResourcesOutput, AWSError] = js.native
  def listGroupResources(
    params: ListGroupResourcesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupResourcesOutput, Unit]
  ): Request[ListGroupResourcesOutput, AWSError] = js.native
  /**
    * Returns a list of existing resource groups in your account.
    */
  def listGroups(): Request[ListGroupsOutput, AWSError] = js.native
  def listGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsOutput, Unit]): Request[ListGroupsOutput, AWSError] = js.native
  /**
    * Returns a list of existing resource groups in your account.
    */
  def listGroups(params: ListGroupsInput): Request[ListGroupsOutput, AWSError] = js.native
  def listGroups(
    params: ListGroupsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsOutput, Unit]
  ): Request[ListGroupsOutput, AWSError] = js.native
  /**
    * Returns a list of AWS resource identifiers that matches tne specified query. The query uses the same format as a resource query in a CreateGroup or UpdateGroupQuery operation.
    */
  def searchResources(): Request[SearchResourcesOutput, AWSError] = js.native
  def searchResources(callback: js.Function2[/* err */ AWSError, /* data */ SearchResourcesOutput, Unit]): Request[SearchResourcesOutput, AWSError] = js.native
  /**
    * Returns a list of AWS resource identifiers that matches tne specified query. The query uses the same format as a resource query in a CreateGroup or UpdateGroupQuery operation.
    */
  def searchResources(params: SearchResourcesInput): Request[SearchResourcesOutput, AWSError] = js.native
  def searchResources(
    params: SearchResourcesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchResourcesOutput, Unit]
  ): Request[SearchResourcesOutput, AWSError] = js.native
  /**
    * Adds tags to a resource group with the specified ARN. Existing tags on a resource group are not changed if they are not specified in the request parameters.  Do not store personally identifiable information (PII) or other confidential or sensitive information in tags. We use tags to provide you with billing and administration services. Tags are not intended to be used for private or sensitive data. 
    */
  def tag(): Request[TagOutput, AWSError] = js.native
  def tag(callback: js.Function2[/* err */ AWSError, /* data */ TagOutput, Unit]): Request[TagOutput, AWSError] = js.native
  /**
    * Adds tags to a resource group with the specified ARN. Existing tags on a resource group are not changed if they are not specified in the request parameters.  Do not store personally identifiable information (PII) or other confidential or sensitive information in tags. We use tags to provide you with billing and administration services. Tags are not intended to be used for private or sensitive data. 
    */
  def tag(params: TagInput): Request[TagOutput, AWSError] = js.native
  def tag(params: TagInput, callback: js.Function2[/* err */ AWSError, /* data */ TagOutput, Unit]): Request[TagOutput, AWSError] = js.native
  /**
    * Removes the specified resources from the specified group.
    */
  def ungroupResources(): Request[UngroupResourcesOutput, AWSError] = js.native
  def ungroupResources(callback: js.Function2[/* err */ AWSError, /* data */ UngroupResourcesOutput, Unit]): Request[UngroupResourcesOutput, AWSError] = js.native
  /**
    * Removes the specified resources from the specified group.
    */
  def ungroupResources(params: UngroupResourcesInput): Request[UngroupResourcesOutput, AWSError] = js.native
  def ungroupResources(
    params: UngroupResourcesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UngroupResourcesOutput, Unit]
  ): Request[UngroupResourcesOutput, AWSError] = js.native
  /**
    * Deletes tags from a specified resource group.
    */
  def untag(): Request[UntagOutput, AWSError] = js.native
  def untag(callback: js.Function2[/* err */ AWSError, /* data */ UntagOutput, Unit]): Request[UntagOutput, AWSError] = js.native
  /**
    * Deletes tags from a specified resource group.
    */
  def untag(params: UntagInput): Request[UntagOutput, AWSError] = js.native
  def untag(params: UntagInput, callback: js.Function2[/* err */ AWSError, /* data */ UntagOutput, Unit]): Request[UntagOutput, AWSError] = js.native
  /**
    * Updates the description for an existing group. You cannot update the name of a resource group.
    */
  def updateGroup(): Request[UpdateGroupOutput, AWSError] = js.native
  def updateGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateGroupOutput, Unit]): Request[UpdateGroupOutput, AWSError] = js.native
  /**
    * Updates the description for an existing group. You cannot update the name of a resource group.
    */
  def updateGroup(params: UpdateGroupInput): Request[UpdateGroupOutput, AWSError] = js.native
  def updateGroup(
    params: UpdateGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGroupOutput, Unit]
  ): Request[UpdateGroupOutput, AWSError] = js.native
  /**
    * Updates the resource query of a group.
    */
  def updateGroupQuery(): Request[UpdateGroupQueryOutput, AWSError] = js.native
  def updateGroupQuery(callback: js.Function2[/* err */ AWSError, /* data */ UpdateGroupQueryOutput, Unit]): Request[UpdateGroupQueryOutput, AWSError] = js.native
  /**
    * Updates the resource query of a group.
    */
  def updateGroupQuery(params: UpdateGroupQueryInput): Request[UpdateGroupQueryOutput, AWSError] = js.native
  def updateGroupQuery(
    params: UpdateGroupQueryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGroupQueryOutput, Unit]
  ): Request[UpdateGroupQueryOutput, AWSError] = js.native
}

