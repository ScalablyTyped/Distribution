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

object ssoMod {
  
  @JSImport("aws-sdk/clients/sso", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ^ () extends SSO {
    def this(options: ClientConfiguration) = this()
  }
  
  type AccessKeyType = String
  
  type AccessTokenType = String
  
  type AccountIdType = String
  
  @js.native
  trait AccountInfo extends StObject {
    
    /**
      * The identifier of the AWS account that is assigned to the user.
      */
    var accountId: js.UndefOr[AccountIdType] = js.native
    
    /**
      * The display name of the AWS account that is assigned to the user.
      */
    var accountName: js.UndefOr[AccountNameType] = js.native
    
    /**
      * The email address of the AWS account that is assigned to the user.
      */
    var emailAddress: js.UndefOr[EmailAddressType] = js.native
  }
  object AccountInfo {
    
    @scala.inline
    def apply(): AccountInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccountInfo]
    }
    
    @scala.inline
    implicit class AccountInfoMutableBuilder[Self <: AccountInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountId(value: AccountIdType): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      @scala.inline
      def setAccountName(value: AccountNameType): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountNameUndefined: Self = StObject.set(x, "accountName", js.undefined)
      
      @scala.inline
      def setEmailAddress(value: EmailAddressType): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    }
  }
  
  type AccountListType = js.Array[AccountInfo]
  
  type AccountNameType = String
  
  @js.native
  trait Blob extends StObject
  
  @js.native
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.ssoMod.apiVersion] = js.native
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
  
  type EmailAddressType = String
  
  type ExpirationTimestampType = Double
  
  @js.native
  trait GetRoleCredentialsRequest extends StObject {
    
    /**
      * The token issued by the CreateToken API call. For more information, see CreateToken in the AWS SSO OIDC API Reference Guide.
      */
    var accessToken: AccessTokenType = js.native
    
    /**
      * The identifier for the AWS account that is assigned to the user.
      */
    var accountId: AccountIdType = js.native
    
    /**
      * The friendly name of the role that is assigned to the user.
      */
    var roleName: RoleNameType = js.native
  }
  object GetRoleCredentialsRequest {
    
    @scala.inline
    def apply(accessToken: AccessTokenType, accountId: AccountIdType, roleName: RoleNameType): GetRoleCredentialsRequest = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], accountId = accountId.asInstanceOf[js.Any], roleName = roleName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRoleCredentialsRequest]
    }
    
    @scala.inline
    implicit class GetRoleCredentialsRequestMutableBuilder[Self <: GetRoleCredentialsRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: AccessTokenType): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountId(value: AccountIdType): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleName(value: RoleNameType): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetRoleCredentialsResponse extends StObject {
    
    /**
      * The credentials for the role that is assigned to the user.
      */
    var roleCredentials: js.UndefOr[RoleCredentials] = js.native
  }
  object GetRoleCredentialsResponse {
    
    @scala.inline
    def apply(): GetRoleCredentialsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetRoleCredentialsResponse]
    }
    
    @scala.inline
    implicit class GetRoleCredentialsResponseMutableBuilder[Self <: GetRoleCredentialsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoleCredentials(value: RoleCredentials): Self = StObject.set(x, "roleCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleCredentialsUndefined: Self = StObject.set(x, "roleCredentials", js.undefined)
    }
  }
  
  @js.native
  trait ListAccountRolesRequest extends StObject {
    
    /**
      * The token issued by the CreateToken API call. For more information, see CreateToken in the AWS SSO OIDC API Reference Guide.
      */
    var accessToken: AccessTokenType = js.native
    
    /**
      * The identifier for the AWS account that is assigned to the user.
      */
    var accountId: AccountIdType = js.native
    
    /**
      * The number of items that clients can request per page.
      */
    var maxResults: js.UndefOr[MaxResultType] = js.native
    
    /**
      * The page token from the previous response output when you request subsequent pages.
      */
    var nextToken: js.UndefOr[NextTokenType] = js.native
  }
  object ListAccountRolesRequest {
    
    @scala.inline
    def apply(accessToken: AccessTokenType, accountId: AccountIdType): ListAccountRolesRequest = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], accountId = accountId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListAccountRolesRequest]
    }
    
    @scala.inline
    implicit class ListAccountRolesRequestMutableBuilder[Self <: ListAccountRolesRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: AccessTokenType): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountId(value: AccountIdType): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResults(value: MaxResultType): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      @scala.inline
      def setNextToken(value: NextTokenType): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    }
  }
  
  @js.native
  trait ListAccountRolesResponse extends StObject {
    
    /**
      * The page token client that is used to retrieve the list of accounts.
      */
    var nextToken: js.UndefOr[NextTokenType] = js.native
    
    /**
      * A paginated response with the list of roles and the next token if more results are available.
      */
    var roleList: js.UndefOr[RoleListType] = js.native
  }
  object ListAccountRolesResponse {
    
    @scala.inline
    def apply(): ListAccountRolesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListAccountRolesResponse]
    }
    
    @scala.inline
    implicit class ListAccountRolesResponseMutableBuilder[Self <: ListAccountRolesResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNextToken(value: NextTokenType): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
      
      @scala.inline
      def setRoleList(value: RoleListType): Self = StObject.set(x, "roleList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleListUndefined: Self = StObject.set(x, "roleList", js.undefined)
      
      @scala.inline
      def setRoleListVarargs(value: RoleInfo*): Self = StObject.set(x, "roleList", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ListAccountsRequest extends StObject {
    
    /**
      * The token issued by the CreateToken API call. For more information, see CreateToken in the AWS SSO OIDC API Reference Guide.
      */
    var accessToken: AccessTokenType = js.native
    
    /**
      * This is the number of items clients can request per page.
      */
    var maxResults: js.UndefOr[MaxResultType] = js.native
    
    /**
      * (Optional) When requesting subsequent pages, this is the page token from the previous response output.
      */
    var nextToken: js.UndefOr[NextTokenType] = js.native
  }
  object ListAccountsRequest {
    
    @scala.inline
    def apply(accessToken: AccessTokenType): ListAccountsRequest = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListAccountsRequest]
    }
    
    @scala.inline
    implicit class ListAccountsRequestMutableBuilder[Self <: ListAccountsRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: AccessTokenType): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResults(value: MaxResultType): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      @scala.inline
      def setNextToken(value: NextTokenType): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    }
  }
  
  @js.native
  trait ListAccountsResponse extends StObject {
    
    /**
      * A paginated response with the list of account information and the next token if more results are available.
      */
    var accountList: js.UndefOr[AccountListType] = js.native
    
    /**
      * The page token client that is used to retrieve the list of accounts.
      */
    var nextToken: js.UndefOr[NextTokenType] = js.native
  }
  object ListAccountsResponse {
    
    @scala.inline
    def apply(): ListAccountsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListAccountsResponse]
    }
    
    @scala.inline
    implicit class ListAccountsResponseMutableBuilder[Self <: ListAccountsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountList(value: AccountListType): Self = StObject.set(x, "accountList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountListUndefined: Self = StObject.set(x, "accountList", js.undefined)
      
      @scala.inline
      def setAccountListVarargs(value: AccountInfo*): Self = StObject.set(x, "accountList", js.Array(value :_*))
      
      @scala.inline
      def setNextToken(value: NextTokenType): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    }
  }
  
  @js.native
  trait LogoutRequest extends StObject {
    
    /**
      * The token issued by the CreateToken API call. For more information, see CreateToken in the AWS SSO OIDC API Reference Guide.
      */
    var accessToken: AccessTokenType = js.native
  }
  object LogoutRequest {
    
    @scala.inline
    def apply(accessToken: AccessTokenType): LogoutRequest = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogoutRequest]
    }
    
    @scala.inline
    implicit class LogoutRequestMutableBuilder[Self <: LogoutRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: AccessTokenType): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    }
  }
  
  type MaxResultType = Double
  
  type NextTokenType = String
  
  @js.native
  trait RoleCredentials extends StObject {
    
    /**
      * The identifier used for the temporary security credentials. For more information, see Using Temporary Security Credentials to Request Access to AWS Resources in the AWS IAM User Guide.
      */
    var accessKeyId: js.UndefOr[AccessKeyType] = js.native
    
    /**
      * The date on which temporary security credentials expire.
      */
    var expiration: js.UndefOr[ExpirationTimestampType] = js.native
    
    /**
      * The key that is used to sign the request. For more information, see Using Temporary Security Credentials to Request Access to AWS Resources in the AWS IAM User Guide.
      */
    var secretAccessKey: js.UndefOr[SecretAccessKeyType] = js.native
    
    /**
      * The token used for temporary credentials. For more information, see Using Temporary Security Credentials to Request Access to AWS Resources in the AWS IAM User Guide.
      */
    var sessionToken: js.UndefOr[SessionTokenType] = js.native
  }
  object RoleCredentials {
    
    @scala.inline
    def apply(): RoleCredentials = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoleCredentials]
    }
    
    @scala.inline
    implicit class RoleCredentialsMutableBuilder[Self <: RoleCredentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessKeyId(value: AccessKeyType): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
      
      @scala.inline
      def setExpiration(value: ExpirationTimestampType): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
      
      @scala.inline
      def setSecretAccessKey(value: SecretAccessKeyType): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretAccessKeyUndefined: Self = StObject.set(x, "secretAccessKey", js.undefined)
      
      @scala.inline
      def setSessionToken(value: SessionTokenType): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
    }
  }
  
  @js.native
  trait RoleInfo extends StObject {
    
    /**
      * The identifier of the AWS account assigned to the user.
      */
    var accountId: js.UndefOr[AccountIdType] = js.native
    
    /**
      * The friendly name of the role that is assigned to the user.
      */
    var roleName: js.UndefOr[RoleNameType] = js.native
  }
  object RoleInfo {
    
    @scala.inline
    def apply(): RoleInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoleInfo]
    }
    
    @scala.inline
    implicit class RoleInfoMutableBuilder[Self <: RoleInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountId(value: AccountIdType): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      @scala.inline
      def setRoleName(value: RoleNameType): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleNameUndefined: Self = StObject.set(x, "roleName", js.undefined)
    }
  }
  
  type RoleListType = js.Array[RoleInfo]
  
  type RoleNameType = String
  
  @js.native
  trait SSO extends Service {
    
    @JSName("config")
    var config_SSO: ConfigBase with ClientConfiguration = js.native
    
    /**
      * Returns the STS short-term credentials for a given role name that is assigned to the user.
      */
    def getRoleCredentials(): Request[GetRoleCredentialsResponse, AWSError] = js.native
    def getRoleCredentials(callback: js.Function2[/* err */ AWSError, /* data */ GetRoleCredentialsResponse, Unit]): Request[GetRoleCredentialsResponse, AWSError] = js.native
    /**
      * Returns the STS short-term credentials for a given role name that is assigned to the user.
      */
    def getRoleCredentials(params: GetRoleCredentialsRequest): Request[GetRoleCredentialsResponse, AWSError] = js.native
    def getRoleCredentials(
      params: GetRoleCredentialsRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ GetRoleCredentialsResponse, Unit]
    ): Request[GetRoleCredentialsResponse, AWSError] = js.native
    
    /**
      * Lists all roles that are assigned to the user for a given AWS account.
      */
    def listAccountRoles(): Request[ListAccountRolesResponse, AWSError] = js.native
    def listAccountRoles(callback: js.Function2[/* err */ AWSError, /* data */ ListAccountRolesResponse, Unit]): Request[ListAccountRolesResponse, AWSError] = js.native
    /**
      * Lists all roles that are assigned to the user for a given AWS account.
      */
    def listAccountRoles(params: ListAccountRolesRequest): Request[ListAccountRolesResponse, AWSError] = js.native
    def listAccountRoles(
      params: ListAccountRolesRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ ListAccountRolesResponse, Unit]
    ): Request[ListAccountRolesResponse, AWSError] = js.native
    
    /**
      * Lists all AWS accounts assigned to the user. These AWS accounts are assigned by the administrator of the account. For more information, see Assign User Access in the AWS SSO User Guide. This operation returns a paginated response.
      */
    def listAccounts(): Request[ListAccountsResponse, AWSError] = js.native
    def listAccounts(callback: js.Function2[/* err */ AWSError, /* data */ ListAccountsResponse, Unit]): Request[ListAccountsResponse, AWSError] = js.native
    /**
      * Lists all AWS accounts assigned to the user. These AWS accounts are assigned by the administrator of the account. For more information, see Assign User Access in the AWS SSO User Guide. This operation returns a paginated response.
      */
    def listAccounts(params: ListAccountsRequest): Request[ListAccountsResponse, AWSError] = js.native
    def listAccounts(
      params: ListAccountsRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ ListAccountsResponse, Unit]
    ): Request[ListAccountsResponse, AWSError] = js.native
    
    /**
      * Removes the client- and server-side session that is associated with the user.
      */
    def logout(): Request[js.Object, AWSError] = js.native
    def logout(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
    /**
      * Removes the client- and server-side session that is associated with the user.
      */
    def logout(params: LogoutRequest): Request[js.Object, AWSError] = js.native
    def logout(params: LogoutRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  }
  
  type SecretAccessKeyType = String
  
  type SessionTokenType = String
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-06-10`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
