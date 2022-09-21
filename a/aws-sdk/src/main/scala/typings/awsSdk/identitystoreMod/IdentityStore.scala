package typings.awsSdk.identitystoreMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityStore extends Service {
  
  @JSName("config")
  var config_IdentityStore: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a group within the specified identity store.
    */
  def createGroup(): Request[CreateGroupResponse, AWSError] = js.native
  def createGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupResponse, Unit]): Request[CreateGroupResponse, AWSError] = js.native
  /**
    * Creates a group within the specified identity store.
    */
  def createGroup(params: CreateGroupRequest): Request[CreateGroupResponse, AWSError] = js.native
  def createGroup(
    params: CreateGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupResponse, Unit]
  ): Request[CreateGroupResponse, AWSError] = js.native
  
  /**
    * Creates a relationship between a member and a group. The following identifiers must be specified: GroupId, IdentityStoreId, and MemberId.
    */
  def createGroupMembership(): Request[CreateGroupMembershipResponse, AWSError] = js.native
  def createGroupMembership(callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupMembershipResponse, Unit]): Request[CreateGroupMembershipResponse, AWSError] = js.native
  /**
    * Creates a relationship between a member and a group. The following identifiers must be specified: GroupId, IdentityStoreId, and MemberId.
    */
  def createGroupMembership(params: CreateGroupMembershipRequest): Request[CreateGroupMembershipResponse, AWSError] = js.native
  def createGroupMembership(
    params: CreateGroupMembershipRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupMembershipResponse, Unit]
  ): Request[CreateGroupMembershipResponse, AWSError] = js.native
  
  /**
    * Creates a new user within the specified identity store.
    */
  def createUser(): Request[CreateUserResponse, AWSError] = js.native
  def createUser(callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, Unit]): Request[CreateUserResponse, AWSError] = js.native
  /**
    * Creates a new user within the specified identity store.
    */
  def createUser(params: CreateUserRequest): Request[CreateUserResponse, AWSError] = js.native
  def createUser(
    params: CreateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, Unit]
  ): Request[CreateUserResponse, AWSError] = js.native
  
  /**
    * Delete a group within an identity store given GroupId.
    */
  def deleteGroup(): Request[DeleteGroupResponse, AWSError] = js.native
  def deleteGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupResponse, Unit]): Request[DeleteGroupResponse, AWSError] = js.native
  /**
    * Delete a group within an identity store given GroupId.
    */
  def deleteGroup(params: DeleteGroupRequest): Request[DeleteGroupResponse, AWSError] = js.native
  def deleteGroup(
    params: DeleteGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupResponse, Unit]
  ): Request[DeleteGroupResponse, AWSError] = js.native
  
  /**
    * Delete a membership within a group given MembershipId.
    */
  def deleteGroupMembership(): Request[DeleteGroupMembershipResponse, AWSError] = js.native
  def deleteGroupMembership(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupMembershipResponse, Unit]): Request[DeleteGroupMembershipResponse, AWSError] = js.native
  /**
    * Delete a membership within a group given MembershipId.
    */
  def deleteGroupMembership(params: DeleteGroupMembershipRequest): Request[DeleteGroupMembershipResponse, AWSError] = js.native
  def deleteGroupMembership(
    params: DeleteGroupMembershipRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupMembershipResponse, Unit]
  ): Request[DeleteGroupMembershipResponse, AWSError] = js.native
  
  /**
    * Deletes a user within an identity store given UserId.
    */
  def deleteUser(): Request[DeleteUserResponse, AWSError] = js.native
  def deleteUser(callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserResponse, Unit]): Request[DeleteUserResponse, AWSError] = js.native
  /**
    * Deletes a user within an identity store given UserId.
    */
  def deleteUser(params: DeleteUserRequest): Request[DeleteUserResponse, AWSError] = js.native
  def deleteUser(
    params: DeleteUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserResponse, Unit]
  ): Request[DeleteUserResponse, AWSError] = js.native
  
  /**
    * Retrieves the group metadata and attributes from GroupId in an identity store.
    */
  def describeGroup(): Request[DescribeGroupResponse, AWSError] = js.native
  def describeGroup(callback: js.Function2[/* err */ AWSError, /* data */ DescribeGroupResponse, Unit]): Request[DescribeGroupResponse, AWSError] = js.native
  /**
    * Retrieves the group metadata and attributes from GroupId in an identity store.
    */
  def describeGroup(params: DescribeGroupRequest): Request[DescribeGroupResponse, AWSError] = js.native
  def describeGroup(
    params: DescribeGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeGroupResponse, Unit]
  ): Request[DescribeGroupResponse, AWSError] = js.native
  
  /**
    * Retrieves membership metadata and attributes from MembershipId in an identity store.
    */
  def describeGroupMembership(): Request[DescribeGroupMembershipResponse, AWSError] = js.native
  def describeGroupMembership(callback: js.Function2[/* err */ AWSError, /* data */ DescribeGroupMembershipResponse, Unit]): Request[DescribeGroupMembershipResponse, AWSError] = js.native
  /**
    * Retrieves membership metadata and attributes from MembershipId in an identity store.
    */
  def describeGroupMembership(params: DescribeGroupMembershipRequest): Request[DescribeGroupMembershipResponse, AWSError] = js.native
  def describeGroupMembership(
    params: DescribeGroupMembershipRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeGroupMembershipResponse, Unit]
  ): Request[DescribeGroupMembershipResponse, AWSError] = js.native
  
  /**
    * Retrieves the user metadata and attributes from the UserId in an identity store.
    */
  def describeUser(): Request[DescribeUserResponse, AWSError] = js.native
  def describeUser(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserResponse, Unit]): Request[DescribeUserResponse, AWSError] = js.native
  /**
    * Retrieves the user metadata and attributes from the UserId in an identity store.
    */
  def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse, AWSError] = js.native
  def describeUser(
    params: DescribeUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserResponse, Unit]
  ): Request[DescribeUserResponse, AWSError] = js.native
  
  /**
    * Retrieves GroupId in an identity store.
    */
  def getGroupId(): Request[GetGroupIdResponse, AWSError] = js.native
  def getGroupId(callback: js.Function2[/* err */ AWSError, /* data */ GetGroupIdResponse, Unit]): Request[GetGroupIdResponse, AWSError] = js.native
  /**
    * Retrieves GroupId in an identity store.
    */
  def getGroupId(params: GetGroupIdRequest): Request[GetGroupIdResponse, AWSError] = js.native
  def getGroupId(
    params: GetGroupIdRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetGroupIdResponse, Unit]
  ): Request[GetGroupIdResponse, AWSError] = js.native
  
  /**
    * Retrieves the MembershipId in an identity store.
    */
  def getGroupMembershipId(): Request[GetGroupMembershipIdResponse, AWSError] = js.native
  def getGroupMembershipId(callback: js.Function2[/* err */ AWSError, /* data */ GetGroupMembershipIdResponse, Unit]): Request[GetGroupMembershipIdResponse, AWSError] = js.native
  /**
    * Retrieves the MembershipId in an identity store.
    */
  def getGroupMembershipId(params: GetGroupMembershipIdRequest): Request[GetGroupMembershipIdResponse, AWSError] = js.native
  def getGroupMembershipId(
    params: GetGroupMembershipIdRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetGroupMembershipIdResponse, Unit]
  ): Request[GetGroupMembershipIdResponse, AWSError] = js.native
  
  /**
    * Retrieves the UserId in an identity store.
    */
  def getUserId(): Request[GetUserIdResponse, AWSError] = js.native
  def getUserId(callback: js.Function2[/* err */ AWSError, /* data */ GetUserIdResponse, Unit]): Request[GetUserIdResponse, AWSError] = js.native
  /**
    * Retrieves the UserId in an identity store.
    */
  def getUserId(params: GetUserIdRequest): Request[GetUserIdResponse, AWSError] = js.native
  def getUserId(
    params: GetUserIdRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUserIdResponse, Unit]
  ): Request[GetUserIdResponse, AWSError] = js.native
  
  /**
    * Checks the user's membership in all requested groups and returns if the member exists in all queried groups.
    */
  def isMemberInGroups(): Request[IsMemberInGroupsResponse, AWSError] = js.native
  def isMemberInGroups(callback: js.Function2[/* err */ AWSError, /* data */ IsMemberInGroupsResponse, Unit]): Request[IsMemberInGroupsResponse, AWSError] = js.native
  /**
    * Checks the user's membership in all requested groups and returns if the member exists in all queried groups.
    */
  def isMemberInGroups(params: IsMemberInGroupsRequest): Request[IsMemberInGroupsResponse, AWSError] = js.native
  def isMemberInGroups(
    params: IsMemberInGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ IsMemberInGroupsResponse, Unit]
  ): Request[IsMemberInGroupsResponse, AWSError] = js.native
  
  /**
    * For the specified group in the specified identity store, returns the list of all GroupMembership objects and returns results in paginated form.
    */
  def listGroupMemberships(): Request[ListGroupMembershipsResponse, AWSError] = js.native
  def listGroupMemberships(callback: js.Function2[/* err */ AWSError, /* data */ ListGroupMembershipsResponse, Unit]): Request[ListGroupMembershipsResponse, AWSError] = js.native
  /**
    * For the specified group in the specified identity store, returns the list of all GroupMembership objects and returns results in paginated form.
    */
  def listGroupMemberships(params: ListGroupMembershipsRequest): Request[ListGroupMembershipsResponse, AWSError] = js.native
  def listGroupMemberships(
    params: ListGroupMembershipsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupMembershipsResponse, Unit]
  ): Request[ListGroupMembershipsResponse, AWSError] = js.native
  
  /**
    * For the specified member in the specified identity store, returns the list of all GroupMembership objects and returns results in paginated form.
    */
  def listGroupMembershipsForMember(): Request[ListGroupMembershipsForMemberResponse, AWSError] = js.native
  def listGroupMembershipsForMember(callback: js.Function2[/* err */ AWSError, /* data */ ListGroupMembershipsForMemberResponse, Unit]): Request[ListGroupMembershipsForMemberResponse, AWSError] = js.native
  /**
    * For the specified member in the specified identity store, returns the list of all GroupMembership objects and returns results in paginated form.
    */
  def listGroupMembershipsForMember(params: ListGroupMembershipsForMemberRequest): Request[ListGroupMembershipsForMemberResponse, AWSError] = js.native
  def listGroupMembershipsForMember(
    params: ListGroupMembershipsForMemberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupMembershipsForMemberResponse, Unit]
  ): Request[ListGroupMembershipsForMemberResponse, AWSError] = js.native
  
  /**
    * Lists the attribute name and value of the group that you specified in the search. We only support DisplayName as a valid filter attribute path currently, and filter is required. This API returns minimum attributes, including GroupId and group DisplayName in the response.
    */
  def listGroups(): Request[ListGroupsResponse, AWSError] = js.native
  def listGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsResponse, Unit]): Request[ListGroupsResponse, AWSError] = js.native
  /**
    * Lists the attribute name and value of the group that you specified in the search. We only support DisplayName as a valid filter attribute path currently, and filter is required. This API returns minimum attributes, including GroupId and group DisplayName in the response.
    */
  def listGroups(params: ListGroupsRequest): Request[ListGroupsResponse, AWSError] = js.native
  def listGroups(
    params: ListGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsResponse, Unit]
  ): Request[ListGroupsResponse, AWSError] = js.native
  
  /**
    * Lists the attribute name and value of the user that you specified in the search. We only support UserName as a valid filter attribute path currently, and filter is required. This API returns minimum attributes, including UserId and UserName in the response.
    */
  def listUsers(): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, Unit]): Request[ListUsersResponse, AWSError] = js.native
  /**
    * Lists the attribute name and value of the user that you specified in the search. We only support UserName as a valid filter attribute path currently, and filter is required. This API returns minimum attributes, including UserId and UserName in the response.
    */
  def listUsers(params: ListUsersRequest): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(
    params: ListUsersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, Unit]
  ): Request[ListUsersResponse, AWSError] = js.native
  
  /**
    * For the specified group in the specified identity store, updates the group metadata and attributes.
    */
  def updateGroup(): Request[UpdateGroupResponse, AWSError] = js.native
  def updateGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateGroupResponse, Unit]): Request[UpdateGroupResponse, AWSError] = js.native
  /**
    * For the specified group in the specified identity store, updates the group metadata and attributes.
    */
  def updateGroup(params: UpdateGroupRequest): Request[UpdateGroupResponse, AWSError] = js.native
  def updateGroup(
    params: UpdateGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGroupResponse, Unit]
  ): Request[UpdateGroupResponse, AWSError] = js.native
  
  /**
    * For the specified user in the specified identity store, updates the user metadata and attributes.
    */
  def updateUser(): Request[UpdateUserResponse, AWSError] = js.native
  def updateUser(callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserResponse, Unit]): Request[UpdateUserResponse, AWSError] = js.native
  /**
    * For the specified user in the specified identity store, updates the user metadata and attributes.
    */
  def updateUser(params: UpdateUserRequest): Request[UpdateUserResponse, AWSError] = js.native
  def updateUser(
    params: UpdateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserResponse, Unit]
  ): Request[UpdateUserResponse, AWSError] = js.native
}
