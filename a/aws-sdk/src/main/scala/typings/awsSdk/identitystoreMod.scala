package typings.awsSdk

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import typings.awsSdk.serviceMod.ServiceConfigurationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identitystoreMod {
  
  @JSImport("aws-sdk/clients/identitystore", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ^ () extends IdentityStore {
    def this(options: ClientConfiguration) = this()
  }
  
  type AttributePath = String
  
  @js.native
  trait Blob extends StObject
  
  @js.native
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.identitystoreMod.apiVersion] = js.native
  }
  object ClientApiVersions {
    
    @scala.inline
    def apply(): ClientApiVersions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientApiVersions]
    }
    
    @scala.inline
    implicit class ClientApiVersionsMutableBuilder[Self <: ClientApiVersions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: apiVersion): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    }
  }
  
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  
  @js.native
  trait DescribeGroupRequest extends StObject {
    
    /**
      * The identifier for a group in the identity store.
      */
    var GroupId: ResourceId = js.native
    
    /**
      * The globally unique identifier for the identity store, such as d-1234567890. In this example, d- is a fixed prefix, and 1234567890 is a randomly generated string which contains number and lower case letters. This value is generated at the time that a new identity store is created.
      */
    var IdentityStoreId: typings.awsSdk.identitystoreMod.IdentityStoreId = js.native
  }
  object DescribeGroupRequest {
    
    @scala.inline
    def apply(GroupId: ResourceId, IdentityStoreId: IdentityStoreId): DescribeGroupRequest = {
      val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], IdentityStoreId = IdentityStoreId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeGroupRequest]
    }
    
    @scala.inline
    implicit class DescribeGroupRequestMutableBuilder[Self <: DescribeGroupRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroupId(value: ResourceId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityStoreId(value: IdentityStoreId): Self = StObject.set(x, "IdentityStoreId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DescribeGroupResponse extends StObject {
    
    /**
      * Contains the group’s display name value. The length limit is 1024 characters. This value can consist of letters, accented characters, symbols, numbers, punctuation, tab, new line, carriage return, space and non breaking space in this attribute. The characters “&lt;&gt;;:%” are excluded. This value is specified at the time the group is created and stored as an attribute of the group object in the identity store.
      */
    var DisplayName: GroupDisplayName = js.native
    
    /**
      * The identifier for a group in the identity store.
      */
    var GroupId: ResourceId = js.native
  }
  object DescribeGroupResponse {
    
    @scala.inline
    def apply(DisplayName: GroupDisplayName, GroupId: ResourceId): DescribeGroupResponse = {
      val __obj = js.Dynamic.literal(DisplayName = DisplayName.asInstanceOf[js.Any], GroupId = GroupId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeGroupResponse]
    }
    
    @scala.inline
    implicit class DescribeGroupResponseMutableBuilder[Self <: DescribeGroupResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: GroupDisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupId(value: ResourceId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DescribeUserRequest extends StObject {
    
    /**
      * The globally unique identifier for the identity store, such as d-1234567890. In this example, d- is a fixed prefix, and 1234567890 is a randomly generated string which contains number and lower case letters. This value is generated at the time that a new identity store is created.
      */
    var IdentityStoreId: typings.awsSdk.identitystoreMod.IdentityStoreId = js.native
    
    /**
      * The identifier for a user in the identity store.
      */
    var UserId: ResourceId = js.native
  }
  object DescribeUserRequest {
    
    @scala.inline
    def apply(IdentityStoreId: IdentityStoreId, UserId: ResourceId): DescribeUserRequest = {
      val __obj = js.Dynamic.literal(IdentityStoreId = IdentityStoreId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeUserRequest]
    }
    
    @scala.inline
    implicit class DescribeUserRequestMutableBuilder[Self <: DescribeUserRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentityStoreId(value: IdentityStoreId): Self = StObject.set(x, "IdentityStoreId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: ResourceId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DescribeUserResponse extends StObject {
    
    /**
      * The identifier for a user in the identity store.
      */
    var UserId: ResourceId = js.native
    
    /**
      * Contains the user’s username value. The length limit is 128 characters. This value can consist of letters, accented characters, symbols, numbers and punctuation. The characters “&lt;&gt;;:%” are excluded. This value is specified at the time the user is created and stored as an attribute of the user object in the identity store.
      */
    var UserName: typings.awsSdk.identitystoreMod.UserName = js.native
  }
  object DescribeUserResponse {
    
    @scala.inline
    def apply(UserId: ResourceId, UserName: UserName): DescribeUserResponse = {
      val __obj = js.Dynamic.literal(UserId = UserId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeUserResponse]
    }
    
    @scala.inline
    implicit class DescribeUserResponseMutableBuilder[Self <: DescribeUserResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUserId(value: ResourceId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Filter extends StObject {
    
    /**
      * The attribute path used to specify which attribute name to search. Length limit is 255 characters. For example, UserName is a valid attribute path for the ListUsers API, and DisplayName is a valid attribute path for the ListGroups API.
      */
    var AttributePath: typings.awsSdk.identitystoreMod.AttributePath = js.native
    
    /**
      * Represents the data for an attribute. Each attribute value is described as a name-value pair. 
      */
    var AttributeValue: SensitiveStringType = js.native
  }
  object Filter {
    
    @scala.inline
    def apply(AttributePath: AttributePath, AttributeValue: SensitiveStringType): Filter = {
      val __obj = js.Dynamic.literal(AttributePath = AttributePath.asInstanceOf[js.Any], AttributeValue = AttributeValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filter]
    }
    
    @scala.inline
    implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributePath(value: AttributePath): Self = StObject.set(x, "AttributePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeValue(value: SensitiveStringType): Self = StObject.set(x, "AttributeValue", value.asInstanceOf[js.Any])
    }
  }
  
  type Filters = js.Array[Filter]
  
  @js.native
  trait Group extends StObject {
    
    /**
      * Contains the group’s display name value. The length limit is 1024 characters. This value can consist of letters, accented characters, symbols, numbers, punctuation, tab, new line, carriage return, space and non breaking space in this attribute. The characters “&lt;&gt;;:%” are excluded. This value is specified at the time the group is created and stored as an attribute of the group object in the identity store.
      */
    var DisplayName: GroupDisplayName = js.native
    
    /**
      * The identifier for a group in the identity store.
      */
    var GroupId: ResourceId = js.native
  }
  object Group {
    
    @scala.inline
    def apply(DisplayName: GroupDisplayName, GroupId: ResourceId): Group = {
      val __obj = js.Dynamic.literal(DisplayName = DisplayName.asInstanceOf[js.Any], GroupId = GroupId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Group]
    }
    
    @scala.inline
    implicit class GroupMutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: GroupDisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupId(value: ResourceId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    }
  }
  
  type GroupDisplayName = String
  
  type Groups = js.Array[Group]
  
  @js.native
  trait IdentityStore extends Service {
    
    @JSName("config")
    var config_IdentityStore: ConfigBase with ClientConfiguration = js.native
    
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
  
  type IdentityStoreId = String
  
  @js.native
  trait ListGroupsRequest extends StObject {
    
    /**
      * A list of Filter objects, which is used in the ListUsers and ListGroups request. 
      */
    var Filters: js.UndefOr[typings.awsSdk.identitystoreMod.Filters] = js.native
    
    /**
      * The globally unique identifier for the identity store, such as d-1234567890. In this example, d- is a fixed prefix, and 1234567890 is a randomly generated string which contains number and lower case letters. This value is generated at the time that a new identity store is created.
      */
    var IdentityStoreId: typings.awsSdk.identitystoreMod.IdentityStoreId = js.native
    
    /**
      * The maximum number of results to be returned per request, which is used in the ListUsers and ListGroups request to specify how many results to return in one page. The length limit is 50 characters.
      */
    var MaxResults: js.UndefOr[typings.awsSdk.identitystoreMod.MaxResults] = js.native
    
    /**
      * The pagination token used for the ListUsers and ListGroups APIs. This value is generated by the identity store service and is returned in the API response if the total results are more than the size of one page, and when this token is used in the API request to search for the next page.
      */
    var NextToken: js.UndefOr[typings.awsSdk.identitystoreMod.NextToken] = js.native
  }
  object ListGroupsRequest {
    
    @scala.inline
    def apply(IdentityStoreId: IdentityStoreId): ListGroupsRequest = {
      val __obj = js.Dynamic.literal(IdentityStoreId = IdentityStoreId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListGroupsRequest]
    }
    
    @scala.inline
    implicit class ListGroupsRequestMutableBuilder[Self <: ListGroupsRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
      
      @scala.inline
      def setIdentityStoreId(value: IdentityStoreId): Self = StObject.set(x, "IdentityStoreId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
      
      @scala.inline
      def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  @js.native
  trait ListGroupsResponse extends StObject {
    
    /**
      * A list of Group objects in the identity store.
      */
    var Groups: typings.awsSdk.identitystoreMod.Groups = js.native
    
    /**
      * The pagination token used for the ListUsers and ListGroups APIs. This value is generated by the identity store service and is returned in the API response if the total results are more than the size of one page, and when this token is used in the API request to search for the next page.
      */
    var NextToken: js.UndefOr[typings.awsSdk.identitystoreMod.NextToken] = js.native
  }
  object ListGroupsResponse {
    
    @scala.inline
    def apply(Groups: Groups): ListGroupsResponse = {
      val __obj = js.Dynamic.literal(Groups = Groups.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListGroupsResponse]
    }
    
    @scala.inline
    implicit class ListGroupsResponseMutableBuilder[Self <: ListGroupsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroups(value: Groups): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsVarargs(value: Group*): Self = StObject.set(x, "Groups", js.Array(value :_*))
      
      @scala.inline
      def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  @js.native
  trait ListUsersRequest extends StObject {
    
    /**
      * A list of Filter objects, which is used in the ListUsers and ListGroups request. 
      */
    var Filters: js.UndefOr[typings.awsSdk.identitystoreMod.Filters] = js.native
    
    /**
      * The globally unique identifier for the identity store, such as d-1234567890. In this example, d- is a fixed prefix, and 1234567890 is a randomly generated string which contains number and lower case letters. This value is generated at the time that a new identity store is created.
      */
    var IdentityStoreId: typings.awsSdk.identitystoreMod.IdentityStoreId = js.native
    
    /**
      * The maximum number of results to be returned per request, which is used in the ListUsers and ListGroups request to specify how many results to return in one page. The length limit is 50 characters.
      */
    var MaxResults: js.UndefOr[typings.awsSdk.identitystoreMod.MaxResults] = js.native
    
    /**
      * The pagination token used for the ListUsers and ListGroups APIs. This value is generated by the identity store service and is returned in the API response if the total results are more than the size of one page, and when this token is used in the API request to search for the next page.
      */
    var NextToken: js.UndefOr[typings.awsSdk.identitystoreMod.NextToken] = js.native
  }
  object ListUsersRequest {
    
    @scala.inline
    def apply(IdentityStoreId: IdentityStoreId): ListUsersRequest = {
      val __obj = js.Dynamic.literal(IdentityStoreId = IdentityStoreId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListUsersRequest]
    }
    
    @scala.inline
    implicit class ListUsersRequestMutableBuilder[Self <: ListUsersRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
      
      @scala.inline
      def setIdentityStoreId(value: IdentityStoreId): Self = StObject.set(x, "IdentityStoreId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
      
      @scala.inline
      def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  @js.native
  trait ListUsersResponse extends StObject {
    
    /**
      * The pagination token used for the ListUsers and ListGroups APIs. This value is generated by the identity store service and is returned in the API response if the total results are more than the size of one page, and when this token is used in the API request to search for the next page.
      */
    var NextToken: js.UndefOr[typings.awsSdk.identitystoreMod.NextToken] = js.native
    
    /**
      * A list of User objects in the identity store.
      */
    var Users: typings.awsSdk.identitystoreMod.Users = js.native
  }
  object ListUsersResponse {
    
    @scala.inline
    def apply(Users: Users): ListUsersResponse = {
      val __obj = js.Dynamic.literal(Users = Users.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListUsersResponse]
    }
    
    @scala.inline
    implicit class ListUsersResponseMutableBuilder[Self <: ListUsersResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      @scala.inline
      def setUsers(value: Users): Self = StObject.set(x, "Users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersVarargs(value: User*): Self = StObject.set(x, "Users", js.Array(value :_*))
    }
  }
  
  type MaxResults = Double
  
  type NextToken = String
  
  type ResourceId = String
  
  type SensitiveStringType = String
  
  @js.native
  trait User extends StObject {
    
    /**
      * The identifier for a user in the identity store.
      */
    var UserId: ResourceId = js.native
    
    /**
      * Contains the user’s username value. The length limit is 128 characters. This value can consist of letters, accented characters, symbols, numbers and punctuation. The characters “&lt;&gt;;:%” are excluded. This value is specified at the time the user is created and stored as an attribute of the user object in the identity store.
      */
    var UserName: typings.awsSdk.identitystoreMod.UserName = js.native
  }
  object User {
    
    @scala.inline
    def apply(UserId: ResourceId, UserName: UserName): User = {
      val __obj = js.Dynamic.literal(UserId = UserId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
      __obj.asInstanceOf[User]
    }
    
    @scala.inline
    implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUserId(value: ResourceId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    }
  }
  
  type UserName = String
  
  type Users = js.Array[User]
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2020-06-15`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
