package typings.awsSdkClientSso

import typings.awsSdkClientSso.anon.ExceptionOptionTypeInvali
import typings.awsSdkClientSso.anon.ExceptionOptionTypeResour
import typings.awsSdkClientSso.anon.ExceptionOptionTypeTooMan
import typings.awsSdkClientSso.anon.ExceptionOptionTypeUnauth
import typings.awsSdkClientSso.awsSdkClientSsoStrings.client
import typings.awsSdkClientSso.ssoserviceexceptionMod.SSOServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object models0Mod {
  
  @JSImport("@aws-sdk/client-sso/dist-types/models/models_0", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def AccountInfoFilterSensitiveLog(obj: AccountInfo): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("AccountInfoFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetRoleCredentialsRequestFilterSensitiveLog(obj: GetRoleCredentialsRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetRoleCredentialsRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetRoleCredentialsResponseFilterSensitiveLog(obj: GetRoleCredentialsResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetRoleCredentialsResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sso/dist-types/models/models_0", "InvalidRequestException")
  @js.native
  open class InvalidRequestException protected () extends SSOServiceException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
    
    @JSName("$fault")
    val $fault_InvalidRequestException: client = js.native
    
    @JSName("name")
    val name_InvalidRequestException: typings.awsSdkClientSso.awsSdkClientSsoStrings.InvalidRequestException = js.native
  }
  
  inline def ListAccountRolesRequestFilterSensitiveLog(obj: ListAccountRolesRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ListAccountRolesRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def ListAccountRolesResponseFilterSensitiveLog(obj: ListAccountRolesResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ListAccountRolesResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def ListAccountsRequestFilterSensitiveLog(obj: ListAccountsRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ListAccountsRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def ListAccountsResponseFilterSensitiveLog(obj: ListAccountsResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ListAccountsResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def LogoutRequestFilterSensitiveLog(obj: LogoutRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("LogoutRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sso/dist-types/models/models_0", "ResourceNotFoundException")
  @js.native
  open class ResourceNotFoundException protected () extends SSOServiceException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeResour) = this()
    
    @JSName("$fault")
    val $fault_ResourceNotFoundException: client = js.native
    
    @JSName("name")
    val name_ResourceNotFoundException: typings.awsSdkClientSso.awsSdkClientSsoStrings.ResourceNotFoundException = js.native
  }
  
  inline def RoleCredentialsFilterSensitiveLog(obj: RoleCredentials): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("RoleCredentialsFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def RoleInfoFilterSensitiveLog(obj: RoleInfo): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("RoleInfoFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sso/dist-types/models/models_0", "TooManyRequestsException")
  @js.native
  open class TooManyRequestsException protected () extends SSOServiceException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeTooMan) = this()
    
    @JSName("$fault")
    val $fault_TooManyRequestsException: client = js.native
    
    @JSName("name")
    val name_TooManyRequestsException: typings.awsSdkClientSso.awsSdkClientSsoStrings.TooManyRequestsException = js.native
  }
  
  @JSImport("@aws-sdk/client-sso/dist-types/models/models_0", "UnauthorizedException")
  @js.native
  open class UnauthorizedException protected () extends SSOServiceException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeUnauth) = this()
    
    @JSName("$fault")
    val $fault_UnauthorizedException: client = js.native
    
    @JSName("name")
    val name_UnauthorizedException: typings.awsSdkClientSso.awsSdkClientSsoStrings.UnauthorizedException = js.native
  }
  
  trait AccountInfo extends StObject {
    
    /**
      * <p>The identifier of the AWS account that is assigned to the user.</p>
      */
    var accountId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The display name of the AWS account that is assigned to the user.</p>
      */
    var accountName: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The email address of the AWS account that is assigned to the user.</p>
      */
    var emailAddress: js.UndefOr[String] = js.undefined
  }
  object AccountInfo {
    
    inline def apply(): AccountInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccountInfo]
    }
    
    extension [Self <: AccountInfo](x: Self) {
      
      inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      inline def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
      
      inline def setAccountNameUndefined: Self = StObject.set(x, "accountName", js.undefined)
      
      inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
      
      inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    }
  }
  
  trait GetRoleCredentialsRequest extends StObject {
    
    /**
      * <p>The token issued by the <code>CreateToken</code> API call. For more information, see
      *         <a href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/API_CreateToken.html">CreateToken</a> in the <i>IAM Identity Center OIDC API Reference Guide</i>.</p>
      */
    var accessToken: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The identifier for the AWS account that is assigned to the user.</p>
      */
    var accountId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The friendly name of the role that is assigned to the user.</p>
      */
    var roleName: js.UndefOr[String] = js.undefined
  }
  object GetRoleCredentialsRequest {
    
    inline def apply(): GetRoleCredentialsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetRoleCredentialsRequest]
    }
    
    extension [Self <: GetRoleCredentialsRequest](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      inline def setRoleName(value: String): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
      
      inline def setRoleNameUndefined: Self = StObject.set(x, "roleName", js.undefined)
    }
  }
  
  trait GetRoleCredentialsResponse extends StObject {
    
    /**
      * <p>The credentials for the role that is assigned to the user.</p>
      */
    var roleCredentials: js.UndefOr[RoleCredentials] = js.undefined
  }
  object GetRoleCredentialsResponse {
    
    inline def apply(): GetRoleCredentialsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetRoleCredentialsResponse]
    }
    
    extension [Self <: GetRoleCredentialsResponse](x: Self) {
      
      inline def setRoleCredentials(value: RoleCredentials): Self = StObject.set(x, "roleCredentials", value.asInstanceOf[js.Any])
      
      inline def setRoleCredentialsUndefined: Self = StObject.set(x, "roleCredentials", js.undefined)
    }
  }
  
  trait ListAccountRolesRequest extends StObject {
    
    /**
      * <p>The token issued by the <code>CreateToken</code> API call. For more information, see
      *         <a href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/API_CreateToken.html">CreateToken</a> in the <i>IAM Identity Center OIDC API Reference Guide</i>.</p>
      */
    var accessToken: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The identifier for the AWS account that is assigned to the user.</p>
      */
    var accountId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The number of items that clients can request per page.</p>
      */
    var maxResults: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The page token from the previous response output when you request subsequent pages.</p>
      */
    var nextToken: js.UndefOr[String] = js.undefined
  }
  object ListAccountRolesRequest {
    
    inline def apply(): ListAccountRolesRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListAccountRolesRequest]
    }
    
    extension [Self <: ListAccountRolesRequest](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    }
  }
  
  trait ListAccountRolesResponse extends StObject {
    
    /**
      * <p>The page token client that is used to retrieve the list of accounts.</p>
      */
    var nextToken: js.UndefOr[String] = js.undefined
    
    /**
      * <p>A paginated response with the list of roles and the next token if more results are
      *       available.</p>
      */
    var roleList: js.UndefOr[js.Array[RoleInfo]] = js.undefined
  }
  object ListAccountRolesResponse {
    
    inline def apply(): ListAccountRolesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListAccountRolesResponse]
    }
    
    extension [Self <: ListAccountRolesResponse](x: Self) {
      
      inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
      
      inline def setRoleList(value: js.Array[RoleInfo]): Self = StObject.set(x, "roleList", value.asInstanceOf[js.Any])
      
      inline def setRoleListUndefined: Self = StObject.set(x, "roleList", js.undefined)
      
      inline def setRoleListVarargs(value: RoleInfo*): Self = StObject.set(x, "roleList", js.Array(value*))
    }
  }
  
  trait ListAccountsRequest extends StObject {
    
    /**
      * <p>The token issued by the <code>CreateToken</code> API call. For more information, see
      *         <a href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/API_CreateToken.html">CreateToken</a> in the <i>IAM Identity Center OIDC API Reference Guide</i>.</p>
      */
    var accessToken: js.UndefOr[String] = js.undefined
    
    /**
      * <p>This is the number of items clients can request per page.</p>
      */
    var maxResults: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>(Optional) When requesting subsequent pages, this is the page token from the previous
      *       response output.</p>
      */
    var nextToken: js.UndefOr[String] = js.undefined
  }
  object ListAccountsRequest {
    
    inline def apply(): ListAccountsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListAccountsRequest]
    }
    
    extension [Self <: ListAccountsRequest](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    }
  }
  
  trait ListAccountsResponse extends StObject {
    
    /**
      * <p>A paginated response with the list of account information and the next token if more
      *       results are available.</p>
      */
    var accountList: js.UndefOr[js.Array[AccountInfo]] = js.undefined
    
    /**
      * <p>The page token client that is used to retrieve the list of accounts.</p>
      */
    var nextToken: js.UndefOr[String] = js.undefined
  }
  object ListAccountsResponse {
    
    inline def apply(): ListAccountsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListAccountsResponse]
    }
    
    extension [Self <: ListAccountsResponse](x: Self) {
      
      inline def setAccountList(value: js.Array[AccountInfo]): Self = StObject.set(x, "accountList", value.asInstanceOf[js.Any])
      
      inline def setAccountListUndefined: Self = StObject.set(x, "accountList", js.undefined)
      
      inline def setAccountListVarargs(value: AccountInfo*): Self = StObject.set(x, "accountList", js.Array(value*))
      
      inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    }
  }
  
  trait LogoutRequest extends StObject {
    
    /**
      * <p>The token issued by the <code>CreateToken</code> API call. For more information, see
      *         <a href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/API_CreateToken.html">CreateToken</a> in the <i>IAM Identity Center OIDC API Reference Guide</i>.</p>
      */
    var accessToken: js.UndefOr[String] = js.undefined
  }
  object LogoutRequest {
    
    inline def apply(): LogoutRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogoutRequest]
    }
    
    extension [Self <: LogoutRequest](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    }
  }
  
  trait RoleCredentials extends StObject {
    
    /**
      * <p>The identifier used for the temporary security credentials. For more information, see
      *         <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_use-resources.html">Using Temporary Security Credentials to Request Access to AWS Resources</a> in the
      *         <i>AWS IAM User Guide</i>.</p>
      */
    var accessKeyId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The date on which temporary security credentials expire.</p>
      */
    var expiration: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The key that is used to sign the request. For more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_use-resources.html">Using Temporary Security Credentials to Request Access to AWS Resources</a> in the
      *         <i>AWS IAM User Guide</i>.</p>
      */
    var secretAccessKey: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The token used for temporary credentials. For more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_use-resources.html">Using Temporary Security Credentials to Request Access to AWS Resources</a> in the
      *         <i>AWS IAM User Guide</i>.</p>
      */
    var sessionToken: js.UndefOr[String] = js.undefined
  }
  object RoleCredentials {
    
    inline def apply(): RoleCredentials = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoleCredentials]
    }
    
    extension [Self <: RoleCredentials](x: Self) {
      
      inline def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
      
      inline def setExpiration(value: Double): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
      
      inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
      
      inline def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
      
      inline def setSecretAccessKeyUndefined: Self = StObject.set(x, "secretAccessKey", js.undefined)
      
      inline def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
      
      inline def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
    }
  }
  
  trait RoleInfo extends StObject {
    
    /**
      * <p>The identifier of the AWS account assigned to the user.</p>
      */
    var accountId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The friendly name of the role that is assigned to the user.</p>
      */
    var roleName: js.UndefOr[String] = js.undefined
  }
  object RoleInfo {
    
    inline def apply(): RoleInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoleInfo]
    }
    
    extension [Self <: RoleInfo](x: Self) {
      
      inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      inline def setRoleName(value: String): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
      
      inline def setRoleNameUndefined: Self = StObject.set(x, "roleName", js.undefined)
    }
  }
}
