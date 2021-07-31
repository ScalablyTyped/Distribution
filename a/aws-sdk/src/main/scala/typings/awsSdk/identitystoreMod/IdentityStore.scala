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
    * Retrieves the user metadata and attributes from UserId in an identity store.
    */
  def describeUser(): Request[DescribeUserResponse, AWSError] = js.native
  def describeUser(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserResponse, Unit]): Request[DescribeUserResponse, AWSError] = js.native
  /**
    * Retrieves the user metadata and attributes from UserId in an identity store.
    */
  def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse, AWSError] = js.native
  def describeUser(
    params: DescribeUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserResponse, Unit]
  ): Request[DescribeUserResponse, AWSError] = js.native
  
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
}
