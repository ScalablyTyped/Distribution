package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserPoolClientRequest extends js.Object {
  /**
    * The allowed OAuth flows. Set to code to initiate a code grant flow, which provides an authorization code as the response. This code can be exchanged for access tokens with the token endpoint. Set to implicit to specify that the client should get the access token (and, optionally, ID token, based on scopes) directly. Set to client_credentials to specify that the client should get the access token (and, optionally, ID token, based on scopes) from the token endpoint using a combination of client and client_secret.
    */
  var AllowedOAuthFlows: js.UndefOr[OAuthFlowsType] = js.native
  /**
    * Set to true if the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
    */
  var AllowedOAuthFlowsUserPoolClient: js.UndefOr[BooleanType] = js.native
  /**
    * The allowed OAuth scopes. Possible values provided by OAuth are: phone, email, openid, and profile. Possible values provided by AWS are: aws.cognito.signin.user.admin. Custom scopes created in Resource Servers are also supported.
    */
  var AllowedOAuthScopes: js.UndefOr[ScopeListType] = js.native
  /**
    * The Amazon Pinpoint analytics configuration for collecting metrics for this user pool.
    */
  var AnalyticsConfiguration: js.UndefOr[AnalyticsConfigurationType] = js.native
  /**
    * A list of allowed redirect (callback) URLs for the identity providers. A redirect URI must:   Be an absolute URI.   Be registered with the authorization server.   Not include a fragment component.   See OAuth 2.0 - Redirection Endpoint. Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only. App callback URLs such as myapp://example are also supported.
    */
  var CallbackURLs: js.UndefOr[CallbackURLsListType] = js.native
  /**
    * The ID of the client associated with the user pool.
    */
  var ClientId: ClientIdType = js.native
  /**
    * The client name from the update user pool client request.
    */
  var ClientName: js.UndefOr[ClientNameType] = js.native
  /**
    * The default redirect URI. Must be in the CallbackURLs list. A redirect URI must:   Be an absolute URI.   Be registered with the authorization server.   Not include a fragment component.   See OAuth 2.0 - Redirection Endpoint. Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only. App callback URLs such as myapp://example are also supported.
    */
  var DefaultRedirectURI: js.UndefOr[RedirectUrlType] = js.native
  /**
    * The authentication flows that are supported by the user pool clients. Flow names without the ALLOW_ prefix are deprecated in favor of new names with the ALLOW_ prefix. Note that values with ALLOW_ prefix cannot be used along with values without ALLOW_ prefix. Valid values include:    ALLOW_ADMIN_USER_PASSWORD_AUTH: Enable admin based user password authentication flow ADMIN_USER_PASSWORD_AUTH. This setting replaces the ADMIN_NO_SRP_AUTH setting. With this authentication flow, Cognito receives the password in the request instead of using the SRP (Secure Remote Password protocol) protocol to verify passwords.    ALLOW_CUSTOM_AUTH: Enable Lambda trigger based authentication.    ALLOW_USER_PASSWORD_AUTH: Enable user password-based authentication. In this flow, Cognito receives the password in the request instead of using the SRP protocol to verify passwords.    ALLOW_USER_SRP_AUTH: Enable SRP based authentication.    ALLOW_REFRESH_TOKEN_AUTH: Enable authflow to refresh tokens.  
    */
  var ExplicitAuthFlows: js.UndefOr[ExplicitAuthFlowsListType] = js.native
  /**
    * A list of allowed logout URLs for the identity providers.
    */
  var LogoutURLs: js.UndefOr[LogoutURLsListType] = js.native
  /**
    * Use this setting to choose which errors and responses are returned by Cognito APIs during authentication, account confirmation, and password recovery when the user does not exist in the user pool. When set to ENABLED and the user does not exist, authentication returns an error indicating either the username or password was incorrect, and account confirmation and password recovery return a response indicating a code was sent to a simulated destination. When set to LEGACY, those APIs will return a UserNotFoundException exception if the user does not exist in the user pool. Valid values include:    ENABLED - This prevents user existence-related errors.    LEGACY - This represents the old behavior of Cognito where user existence related errors are not prevented.   This setting affects the behavior of following APIs:    AdminInitiateAuth     AdminRespondToAuthChallenge     InitiateAuth     RespondToAuthChallenge     ForgotPassword     ConfirmForgotPassword     ConfirmSignUp     ResendConfirmationCode     After February 15th 2020, the value of PreventUserExistenceErrors will default to ENABLED for newly created user pool clients if no value is provided. 
    */
  var PreventUserExistenceErrors: js.UndefOr[PreventUserExistenceErrorTypes] = js.native
  /**
    * The read-only attributes of the user pool.
    */
  var ReadAttributes: js.UndefOr[ClientPermissionListType] = js.native
  /**
    * The time limit, in days, after which the refresh token is no longer valid and cannot be used.
    */
  var RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType] = js.native
  /**
    * A list of provider names for the identity providers that are supported on this client.
    */
  var SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType] = js.native
  /**
    * The user pool ID for the user pool where you want to update the user pool client.
    */
  var UserPoolId: UserPoolIdType = js.native
  /**
    * The writeable attributes of the user pool.
    */
  var WriteAttributes: js.UndefOr[ClientPermissionListType] = js.native
}

object UpdateUserPoolClientRequest {
  @scala.inline
  def apply(
    ClientId: ClientIdType,
    UserPoolId: UserPoolIdType,
    AllowedOAuthFlows: OAuthFlowsType = null,
    AllowedOAuthFlowsUserPoolClient: js.UndefOr[Boolean] = js.undefined,
    AllowedOAuthScopes: ScopeListType = null,
    AnalyticsConfiguration: AnalyticsConfigurationType = null,
    CallbackURLs: CallbackURLsListType = null,
    ClientName: ClientNameType = null,
    DefaultRedirectURI: RedirectUrlType = null,
    ExplicitAuthFlows: ExplicitAuthFlowsListType = null,
    LogoutURLs: LogoutURLsListType = null,
    PreventUserExistenceErrors: PreventUserExistenceErrorTypes = null,
    ReadAttributes: ClientPermissionListType = null,
    RefreshTokenValidity: Int | Double = null,
    SupportedIdentityProviders: SupportedIdentityProvidersListType = null,
    WriteAttributes: ClientPermissionListType = null
  ): UpdateUserPoolClientRequest = {
    val __obj = js.Dynamic.literal(ClientId = ClientId.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    if (AllowedOAuthFlows != null) __obj.updateDynamic("AllowedOAuthFlows")(AllowedOAuthFlows.asInstanceOf[js.Any])
    if (!js.isUndefined(AllowedOAuthFlowsUserPoolClient)) __obj.updateDynamic("AllowedOAuthFlowsUserPoolClient")(AllowedOAuthFlowsUserPoolClient.asInstanceOf[js.Any])
    if (AllowedOAuthScopes != null) __obj.updateDynamic("AllowedOAuthScopes")(AllowedOAuthScopes.asInstanceOf[js.Any])
    if (AnalyticsConfiguration != null) __obj.updateDynamic("AnalyticsConfiguration")(AnalyticsConfiguration.asInstanceOf[js.Any])
    if (CallbackURLs != null) __obj.updateDynamic("CallbackURLs")(CallbackURLs.asInstanceOf[js.Any])
    if (ClientName != null) __obj.updateDynamic("ClientName")(ClientName.asInstanceOf[js.Any])
    if (DefaultRedirectURI != null) __obj.updateDynamic("DefaultRedirectURI")(DefaultRedirectURI.asInstanceOf[js.Any])
    if (ExplicitAuthFlows != null) __obj.updateDynamic("ExplicitAuthFlows")(ExplicitAuthFlows.asInstanceOf[js.Any])
    if (LogoutURLs != null) __obj.updateDynamic("LogoutURLs")(LogoutURLs.asInstanceOf[js.Any])
    if (PreventUserExistenceErrors != null) __obj.updateDynamic("PreventUserExistenceErrors")(PreventUserExistenceErrors.asInstanceOf[js.Any])
    if (ReadAttributes != null) __obj.updateDynamic("ReadAttributes")(ReadAttributes.asInstanceOf[js.Any])
    if (RefreshTokenValidity != null) __obj.updateDynamic("RefreshTokenValidity")(RefreshTokenValidity.asInstanceOf[js.Any])
    if (SupportedIdentityProviders != null) __obj.updateDynamic("SupportedIdentityProviders")(SupportedIdentityProviders.asInstanceOf[js.Any])
    if (WriteAttributes != null) __obj.updateDynamic("WriteAttributes")(WriteAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserPoolClientRequest]
  }
}

