package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserPoolClientRequest extends StObject {
  
  /**
    * The time limit, after which the access token is no longer valid and cannot be used.
    */
  var AccessTokenValidity: js.UndefOr[AccessTokenValidityType] = js.undefined
  
  /**
    * The allowed OAuth flows. Set to code to initiate a code grant flow, which provides an authorization code as the response. This code can be exchanged for access tokens with the token endpoint. Set to implicit to specify that the client should get the access token (and, optionally, ID token, based on scopes) directly. Set to client_credentials to specify that the client should get the access token (and, optionally, ID token, based on scopes) from the token endpoint using a combination of client and client_secret.
    */
  var AllowedOAuthFlows: js.UndefOr[OAuthFlowsType] = js.undefined
  
  /**
    * Set to true if the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
    */
  var AllowedOAuthFlowsUserPoolClient: js.UndefOr[BooleanType] = js.undefined
  
  /**
    * The allowed OAuth scopes. Possible values provided by OAuth are: phone, email, openid, and profile. Possible values provided by AWS are: aws.cognito.signin.user.admin. Custom scopes created in Resource Servers are also supported.
    */
  var AllowedOAuthScopes: js.UndefOr[ScopeListType] = js.undefined
  
  /**
    * The Amazon Pinpoint analytics configuration for collecting metrics for this user pool.  In regions where Pinpoint is not available, Cognito User Pools only supports sending events to Amazon Pinpoint projects in us-east-1. In regions where Pinpoint is available, Cognito User Pools will support sending events to Amazon Pinpoint projects within that same region.  
    */
  var AnalyticsConfiguration: js.UndefOr[AnalyticsConfigurationType] = js.undefined
  
  /**
    * A list of allowed redirect (callback) URLs for the identity providers. A redirect URI must:   Be an absolute URI.   Be registered with the authorization server.   Not include a fragment component.   See OAuth 2.0 - Redirection Endpoint. Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only. App callback URLs such as myapp://example are also supported.
    */
  var CallbackURLs: js.UndefOr[CallbackURLsListType] = js.undefined
  
  /**
    * The ID of the client associated with the user pool.
    */
  var ClientId: ClientIdType
  
  /**
    * The client name from the update user pool client request.
    */
  var ClientName: js.UndefOr[ClientNameType] = js.undefined
  
  /**
    * The default redirect URI. Must be in the CallbackURLs list. A redirect URI must:   Be an absolute URI.   Be registered with the authorization server.   Not include a fragment component.   See OAuth 2.0 - Redirection Endpoint. Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only. App callback URLs such as myapp://example are also supported.
    */
  var DefaultRedirectURI: js.UndefOr[RedirectUrlType] = js.undefined
  
  /**
    * The authentication flows that are supported by the user pool clients. Flow names without the ALLOW_ prefix are deprecated in favor of new names with the ALLOW_ prefix. Note that values with ALLOW_ prefix cannot be used along with values without ALLOW_ prefix. Valid values include:    ALLOW_ADMIN_USER_PASSWORD_AUTH: Enable admin based user password authentication flow ADMIN_USER_PASSWORD_AUTH. This setting replaces the ADMIN_NO_SRP_AUTH setting. With this authentication flow, Cognito receives the password in the request instead of using the SRP (Secure Remote Password protocol) protocol to verify passwords.    ALLOW_CUSTOM_AUTH: Enable Lambda trigger based authentication.    ALLOW_USER_PASSWORD_AUTH: Enable user password-based authentication. In this flow, Cognito receives the password in the request instead of using the SRP protocol to verify passwords.    ALLOW_USER_SRP_AUTH: Enable SRP based authentication.    ALLOW_REFRESH_TOKEN_AUTH: Enable authflow to refresh tokens.  
    */
  var ExplicitAuthFlows: js.UndefOr[ExplicitAuthFlowsListType] = js.undefined
  
  /**
    * The time limit, after which the ID token is no longer valid and cannot be used.
    */
  var IdTokenValidity: js.UndefOr[IdTokenValidityType] = js.undefined
  
  /**
    * A list of allowed logout URLs for the identity providers.
    */
  var LogoutURLs: js.UndefOr[LogoutURLsListType] = js.undefined
  
  /**
    * Use this setting to choose which errors and responses are returned by Cognito APIs during authentication, account confirmation, and password recovery when the user does not exist in the user pool. When set to ENABLED and the user does not exist, authentication returns an error indicating either the username or password was incorrect, and account confirmation and password recovery return a response indicating a code was sent to a simulated destination. When set to LEGACY, those APIs will return a UserNotFoundException exception if the user does not exist in the user pool. Valid values include:    ENABLED - This prevents user existence-related errors.    LEGACY - This represents the old behavior of Cognito where user existence related errors are not prevented.    After February 15th 2020, the value of PreventUserExistenceErrors will default to ENABLED for newly created user pool clients if no value is provided. 
    */
  var PreventUserExistenceErrors: js.UndefOr[PreventUserExistenceErrorTypes] = js.undefined
  
  /**
    * The read-only attributes of the user pool.
    */
  var ReadAttributes: js.UndefOr[ClientPermissionListType] = js.undefined
  
  /**
    * The time limit, in days, after which the refresh token is no longer valid and cannot be used.
    */
  var RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType] = js.undefined
  
  /**
    * A list of provider names for the identity providers that are supported on this client.
    */
  var SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType] = js.undefined
  
  /**
    * The units in which the validity times are represented in. Default for RefreshToken is days, and default for ID and access tokens are hours.
    */
  var TokenValidityUnits: js.UndefOr[TokenValidityUnitsType] = js.undefined
  
  /**
    * The user pool ID for the user pool where you want to update the user pool client.
    */
  var UserPoolId: UserPoolIdType
  
  /**
    * The writeable attributes of the user pool.
    */
  var WriteAttributes: js.UndefOr[ClientPermissionListType] = js.undefined
}
object UpdateUserPoolClientRequest {
  
  inline def apply(ClientId: ClientIdType, UserPoolId: UserPoolIdType): UpdateUserPoolClientRequest = {
    val __obj = js.Dynamic.literal(ClientId = ClientId.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserPoolClientRequest]
  }
  
  extension [Self <: UpdateUserPoolClientRequest](x: Self) {
    
    inline def setAccessTokenValidity(value: AccessTokenValidityType): Self = StObject.set(x, "AccessTokenValidity", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenValidityUndefined: Self = StObject.set(x, "AccessTokenValidity", js.undefined)
    
    inline def setAllowedOAuthFlows(value: OAuthFlowsType): Self = StObject.set(x, "AllowedOAuthFlows", value.asInstanceOf[js.Any])
    
    inline def setAllowedOAuthFlowsUndefined: Self = StObject.set(x, "AllowedOAuthFlows", js.undefined)
    
    inline def setAllowedOAuthFlowsUserPoolClient(value: BooleanType): Self = StObject.set(x, "AllowedOAuthFlowsUserPoolClient", value.asInstanceOf[js.Any])
    
    inline def setAllowedOAuthFlowsUserPoolClientUndefined: Self = StObject.set(x, "AllowedOAuthFlowsUserPoolClient", js.undefined)
    
    inline def setAllowedOAuthFlowsVarargs(value: OAuthFlowType*): Self = StObject.set(x, "AllowedOAuthFlows", js.Array(value :_*))
    
    inline def setAllowedOAuthScopes(value: ScopeListType): Self = StObject.set(x, "AllowedOAuthScopes", value.asInstanceOf[js.Any])
    
    inline def setAllowedOAuthScopesUndefined: Self = StObject.set(x, "AllowedOAuthScopes", js.undefined)
    
    inline def setAllowedOAuthScopesVarargs(value: ScopeType*): Self = StObject.set(x, "AllowedOAuthScopes", js.Array(value :_*))
    
    inline def setAnalyticsConfiguration(value: AnalyticsConfigurationType): Self = StObject.set(x, "AnalyticsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAnalyticsConfigurationUndefined: Self = StObject.set(x, "AnalyticsConfiguration", js.undefined)
    
    inline def setCallbackURLs(value: CallbackURLsListType): Self = StObject.set(x, "CallbackURLs", value.asInstanceOf[js.Any])
    
    inline def setCallbackURLsUndefined: Self = StObject.set(x, "CallbackURLs", js.undefined)
    
    inline def setCallbackURLsVarargs(value: RedirectUrlType*): Self = StObject.set(x, "CallbackURLs", js.Array(value :_*))
    
    inline def setClientId(value: ClientIdType): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    inline def setClientName(value: ClientNameType): Self = StObject.set(x, "ClientName", value.asInstanceOf[js.Any])
    
    inline def setClientNameUndefined: Self = StObject.set(x, "ClientName", js.undefined)
    
    inline def setDefaultRedirectURI(value: RedirectUrlType): Self = StObject.set(x, "DefaultRedirectURI", value.asInstanceOf[js.Any])
    
    inline def setDefaultRedirectURIUndefined: Self = StObject.set(x, "DefaultRedirectURI", js.undefined)
    
    inline def setExplicitAuthFlows(value: ExplicitAuthFlowsListType): Self = StObject.set(x, "ExplicitAuthFlows", value.asInstanceOf[js.Any])
    
    inline def setExplicitAuthFlowsUndefined: Self = StObject.set(x, "ExplicitAuthFlows", js.undefined)
    
    inline def setExplicitAuthFlowsVarargs(value: ExplicitAuthFlowsType*): Self = StObject.set(x, "ExplicitAuthFlows", js.Array(value :_*))
    
    inline def setIdTokenValidity(value: IdTokenValidityType): Self = StObject.set(x, "IdTokenValidity", value.asInstanceOf[js.Any])
    
    inline def setIdTokenValidityUndefined: Self = StObject.set(x, "IdTokenValidity", js.undefined)
    
    inline def setLogoutURLs(value: LogoutURLsListType): Self = StObject.set(x, "LogoutURLs", value.asInstanceOf[js.Any])
    
    inline def setLogoutURLsUndefined: Self = StObject.set(x, "LogoutURLs", js.undefined)
    
    inline def setLogoutURLsVarargs(value: RedirectUrlType*): Self = StObject.set(x, "LogoutURLs", js.Array(value :_*))
    
    inline def setPreventUserExistenceErrors(value: PreventUserExistenceErrorTypes): Self = StObject.set(x, "PreventUserExistenceErrors", value.asInstanceOf[js.Any])
    
    inline def setPreventUserExistenceErrorsUndefined: Self = StObject.set(x, "PreventUserExistenceErrors", js.undefined)
    
    inline def setReadAttributes(value: ClientPermissionListType): Self = StObject.set(x, "ReadAttributes", value.asInstanceOf[js.Any])
    
    inline def setReadAttributesUndefined: Self = StObject.set(x, "ReadAttributes", js.undefined)
    
    inline def setReadAttributesVarargs(value: ClientPermissionType*): Self = StObject.set(x, "ReadAttributes", js.Array(value :_*))
    
    inline def setRefreshTokenValidity(value: RefreshTokenValidityType): Self = StObject.set(x, "RefreshTokenValidity", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenValidityUndefined: Self = StObject.set(x, "RefreshTokenValidity", js.undefined)
    
    inline def setSupportedIdentityProviders(value: SupportedIdentityProvidersListType): Self = StObject.set(x, "SupportedIdentityProviders", value.asInstanceOf[js.Any])
    
    inline def setSupportedIdentityProvidersUndefined: Self = StObject.set(x, "SupportedIdentityProviders", js.undefined)
    
    inline def setSupportedIdentityProvidersVarargs(value: ProviderNameType*): Self = StObject.set(x, "SupportedIdentityProviders", js.Array(value :_*))
    
    inline def setTokenValidityUnits(value: TokenValidityUnitsType): Self = StObject.set(x, "TokenValidityUnits", value.asInstanceOf[js.Any])
    
    inline def setTokenValidityUnitsUndefined: Self = StObject.set(x, "TokenValidityUnits", js.undefined)
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    inline def setWriteAttributes(value: ClientPermissionListType): Self = StObject.set(x, "WriteAttributes", value.asInstanceOf[js.Any])
    
    inline def setWriteAttributesUndefined: Self = StObject.set(x, "WriteAttributes", js.undefined)
    
    inline def setWriteAttributesVarargs(value: ClientPermissionType*): Self = StObject.set(x, "WriteAttributes", js.Array(value :_*))
  }
}
