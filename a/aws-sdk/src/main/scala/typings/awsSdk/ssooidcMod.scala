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

object ssooidcMod {
  
  @JSImport("aws-sdk/clients/ssooidc", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ^ () extends SSOOIDC {
    def this(options: ClientConfiguration) = this()
  }
  
  type AccessToken = String
  
  type AuthCode = String
  
  @js.native
  trait Blob extends StObject
  
  @js.native
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.ssooidcMod.apiVersion] = js.native
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
  
  type ClientId = String
  
  type ClientName = String
  
  type ClientSecret = String
  
  type ClientType = String
  
  @js.native
  trait CreateTokenRequest extends StObject {
    
    /**
      * The unique identifier string for each client. This value should come from the persisted result of the RegisterClient API.
      */
    var clientId: ClientId = js.native
    
    /**
      * A secret string generated for the client. This value should come from the persisted result of the RegisterClient API.
      */
    var clientSecret: ClientSecret = js.native
    
    /**
      * The authorization code received from the authorization service. This parameter is required to perform an authorization grant request to get access to a token.
      */
    var code: js.UndefOr[AuthCode] = js.native
    
    /**
      * Used only when calling this API for the device code grant type. This short-term code is used to identify this authentication attempt. This should come from an in-memory reference to the result of the StartDeviceAuthorization API.
      */
    var deviceCode: DeviceCode = js.native
    
    /**
      * Supports grant types for authorization code, refresh token, and device code request.
      */
    var grantType: GrantType = js.native
    
    /**
      * The location of the application that will receive the authorization code. Users authorize the service to send the request to this location.
      */
    var redirectUri: js.UndefOr[URI] = js.native
    
    /**
      * The token used to obtain an access token in the event that the access token is invalid or expired. This token is not issued by the service.
      */
    var refreshToken: js.UndefOr[RefreshToken] = js.native
    
    /**
      * The list of scopes that is defined by the client. Upon authorization, this list is used to restrict permissions when granting an access token.
      */
    var scope: js.UndefOr[Scopes] = js.native
  }
  object CreateTokenRequest {
    
    @scala.inline
    def apply(clientId: ClientId, clientSecret: ClientSecret, deviceCode: DeviceCode, grantType: GrantType): CreateTokenRequest = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], deviceCode = deviceCode.asInstanceOf[js.Any], grantType = grantType.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateTokenRequest]
    }
    
    @scala.inline
    implicit class CreateTokenRequestMutableBuilder[Self <: CreateTokenRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientId(value: ClientId): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecret(value: ClientSecret): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode(value: AuthCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setDeviceCode(value: DeviceCode): Self = StObject.set(x, "deviceCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrantType(value: GrantType): Self = StObject.set(x, "grantType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUri(value: URI): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
      
      @scala.inline
      def setRefreshToken(value: RefreshToken): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
      
      @scala.inline
      def setScope(value: Scopes): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScopeVarargs(value: Scope*): Self = StObject.set(x, "scope", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CreateTokenResponse extends StObject {
    
    /**
      * An opaque token to access AWS SSO resources assigned to a user.
      */
    var accessToken: js.UndefOr[AccessToken] = js.native
    
    /**
      * Indicates the time in seconds when an access token will expire.
      */
    var expiresIn: js.UndefOr[ExpirationInSeconds] = js.native
    
    /**
      * The identifier of the user that associated with the access token, if present.
      */
    var idToken: js.UndefOr[IdToken] = js.native
    
    /**
      * A token that, if present, can be used to refresh a previously issued access token that might have expired.
      */
    var refreshToken: js.UndefOr[RefreshToken] = js.native
    
    /**
      * Used to notify the client that the returned token is an access token. The supported type is BearerToken.
      */
    var tokenType: js.UndefOr[TokenType] = js.native
  }
  object CreateTokenResponse {
    
    @scala.inline
    def apply(): CreateTokenResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateTokenResponse]
    }
    
    @scala.inline
    implicit class CreateTokenResponseMutableBuilder[Self <: CreateTokenResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: AccessToken): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      @scala.inline
      def setExpiresIn(value: ExpirationInSeconds): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
      
      @scala.inline
      def setIdToken(value: IdToken): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
      
      @scala.inline
      def setRefreshToken(value: RefreshToken): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
      
      @scala.inline
      def setTokenType(value: TokenType): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenTypeUndefined: Self = StObject.set(x, "tokenType", js.undefined)
    }
  }
  
  type DeviceCode = String
  
  type ExpirationInSeconds = Double
  
  type GrantType = String
  
  type IdToken = String
  
  type IntervalInSeconds = Double
  
  type LongTimeStampType = Double
  
  type RefreshToken = String
  
  @js.native
  trait RegisterClientRequest extends StObject {
    
    /**
      * The friendly name of the client.
      */
    var clientName: ClientName = js.native
    
    /**
      * The type of client. The service supports only public as a client type. Anything other than public will be rejected by the service.
      */
    var clientType: ClientType = js.native
    
    /**
      * The list of scopes that are defined by the client. Upon authorization, this list is used to restrict permissions when granting an access token.
      */
    var scopes: js.UndefOr[Scopes] = js.native
  }
  object RegisterClientRequest {
    
    @scala.inline
    def apply(clientName: ClientName, clientType: ClientType): RegisterClientRequest = {
      val __obj = js.Dynamic.literal(clientName = clientName.asInstanceOf[js.Any], clientType = clientType.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisterClientRequest]
    }
    
    @scala.inline
    implicit class RegisterClientRequestMutableBuilder[Self <: RegisterClientRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientName(value: ClientName): Self = StObject.set(x, "clientName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientType(value: ClientType): Self = StObject.set(x, "clientType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopes(value: Scopes): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      @scala.inline
      def setScopesVarargs(value: Scope*): Self = StObject.set(x, "scopes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RegisterClientResponse extends StObject {
    
    /**
      * The endpoint where the client can request authorization.
      */
    var authorizationEndpoint: js.UndefOr[URI] = js.native
    
    /**
      * The unique identifier string for each client. This client uses this identifier to get authenticated by the service in subsequent calls.
      */
    var clientId: js.UndefOr[ClientId] = js.native
    
    /**
      * Indicates the time at which the clientId and clientSecret were issued.
      */
    var clientIdIssuedAt: js.UndefOr[LongTimeStampType] = js.native
    
    /**
      * A secret string generated for the client. The client will use this string to get authenticated by the service in subsequent calls.
      */
    var clientSecret: js.UndefOr[ClientSecret] = js.native
    
    /**
      * Indicates the time at which the clientId and clientSecret will become invalid.
      */
    var clientSecretExpiresAt: js.UndefOr[LongTimeStampType] = js.native
    
    /**
      * The endpoint where the client can get an access token.
      */
    var tokenEndpoint: js.UndefOr[URI] = js.native
  }
  object RegisterClientResponse {
    
    @scala.inline
    def apply(): RegisterClientResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegisterClientResponse]
    }
    
    @scala.inline
    implicit class RegisterClientResponseMutableBuilder[Self <: RegisterClientResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorizationEndpoint(value: URI): Self = StObject.set(x, "authorizationEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizationEndpointUndefined: Self = StObject.set(x, "authorizationEndpoint", js.undefined)
      
      @scala.inline
      def setClientId(value: ClientId): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIdIssuedAt(value: LongTimeStampType): Self = StObject.set(x, "clientIdIssuedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIdIssuedAtUndefined: Self = StObject.set(x, "clientIdIssuedAt", js.undefined)
      
      @scala.inline
      def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      @scala.inline
      def setClientSecret(value: ClientSecret): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecretExpiresAt(value: LongTimeStampType): Self = StObject.set(x, "clientSecretExpiresAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecretExpiresAtUndefined: Self = StObject.set(x, "clientSecretExpiresAt", js.undefined)
      
      @scala.inline
      def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
      
      @scala.inline
      def setTokenEndpoint(value: URI): Self = StObject.set(x, "tokenEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenEndpointUndefined: Self = StObject.set(x, "tokenEndpoint", js.undefined)
    }
  }
  
  @js.native
  trait SSOOIDC extends Service {
    
    @JSName("config")
    var config_SSOOIDC: ConfigBase with ClientConfiguration = js.native
    
    /**
      * Creates and returns an access token for the authorized client. The access token issued will be used to fetch short-term credentials for the assigned roles in the AWS account.
      */
    def createToken(): Request[CreateTokenResponse, AWSError] = js.native
    def createToken(callback: js.Function2[/* err */ AWSError, /* data */ CreateTokenResponse, Unit]): Request[CreateTokenResponse, AWSError] = js.native
    /**
      * Creates and returns an access token for the authorized client. The access token issued will be used to fetch short-term credentials for the assigned roles in the AWS account.
      */
    def createToken(params: CreateTokenRequest): Request[CreateTokenResponse, AWSError] = js.native
    def createToken(
      params: CreateTokenRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ CreateTokenResponse, Unit]
    ): Request[CreateTokenResponse, AWSError] = js.native
    
    /**
      * Registers a client with AWS SSO. This allows clients to initiate device authorization. The output should be persisted for reuse through many authentication requests.
      */
    def registerClient(): Request[RegisterClientResponse, AWSError] = js.native
    def registerClient(callback: js.Function2[/* err */ AWSError, /* data */ RegisterClientResponse, Unit]): Request[RegisterClientResponse, AWSError] = js.native
    /**
      * Registers a client with AWS SSO. This allows clients to initiate device authorization. The output should be persisted for reuse through many authentication requests.
      */
    def registerClient(params: RegisterClientRequest): Request[RegisterClientResponse, AWSError] = js.native
    def registerClient(
      params: RegisterClientRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ RegisterClientResponse, Unit]
    ): Request[RegisterClientResponse, AWSError] = js.native
    
    /**
      * Initiates device authorization by requesting a pair of verification codes from the authorization service.
      */
    def startDeviceAuthorization(): Request[StartDeviceAuthorizationResponse, AWSError] = js.native
    def startDeviceAuthorization(callback: js.Function2[/* err */ AWSError, /* data */ StartDeviceAuthorizationResponse, Unit]): Request[StartDeviceAuthorizationResponse, AWSError] = js.native
    /**
      * Initiates device authorization by requesting a pair of verification codes from the authorization service.
      */
    def startDeviceAuthorization(params: StartDeviceAuthorizationRequest): Request[StartDeviceAuthorizationResponse, AWSError] = js.native
    def startDeviceAuthorization(
      params: StartDeviceAuthorizationRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ StartDeviceAuthorizationResponse, Unit]
    ): Request[StartDeviceAuthorizationResponse, AWSError] = js.native
  }
  
  type Scope = String
  
  type Scopes = js.Array[Scope]
  
  @js.native
  trait StartDeviceAuthorizationRequest extends StObject {
    
    /**
      * The unique identifier string for the client that is registered with AWS SSO. This value should come from the persisted result of the RegisterClient API operation.
      */
    var clientId: ClientId = js.native
    
    /**
      * A secret string that is generated for the client. This value should come from the persisted result of the RegisterClient API operation.
      */
    var clientSecret: ClientSecret = js.native
    
    /**
      * The URL for the AWS SSO user portal. For more information, see Using the User Portal in the AWS Single Sign-On User Guide.
      */
    var startUrl: URI = js.native
  }
  object StartDeviceAuthorizationRequest {
    
    @scala.inline
    def apply(clientId: ClientId, clientSecret: ClientSecret, startUrl: URI): StartDeviceAuthorizationRequest = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], startUrl = startUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartDeviceAuthorizationRequest]
    }
    
    @scala.inline
    implicit class StartDeviceAuthorizationRequestMutableBuilder[Self <: StartDeviceAuthorizationRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientId(value: ClientId): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecret(value: ClientSecret): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUrl(value: URI): Self = StObject.set(x, "startUrl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StartDeviceAuthorizationResponse extends StObject {
    
    /**
      * The short-lived code that is used by the device when polling for a session token.
      */
    var deviceCode: js.UndefOr[DeviceCode] = js.native
    
    /**
      * Indicates the number of seconds in which the verification code will become invalid.
      */
    var expiresIn: js.UndefOr[ExpirationInSeconds] = js.native
    
    /**
      * Indicates the number of seconds the client must wait between attempts when polling for a session.
      */
    var interval: js.UndefOr[IntervalInSeconds] = js.native
    
    /**
      * A one-time user verification code. This is needed to authorize an in-use device.
      */
    var userCode: js.UndefOr[UserCode] = js.native
    
    /**
      * The URI of the verification page that takes the userCode to authorize the device.
      */
    var verificationUri: js.UndefOr[URI] = js.native
    
    /**
      * An alternate URL that the client can use to automatically launch a browser. This process skips the manual step in which the user visits the verification page and enters their code.
      */
    var verificationUriComplete: js.UndefOr[URI] = js.native
  }
  object StartDeviceAuthorizationResponse {
    
    @scala.inline
    def apply(): StartDeviceAuthorizationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartDeviceAuthorizationResponse]
    }
    
    @scala.inline
    implicit class StartDeviceAuthorizationResponseMutableBuilder[Self <: StartDeviceAuthorizationResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeviceCode(value: DeviceCode): Self = StObject.set(x, "deviceCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceCodeUndefined: Self = StObject.set(x, "deviceCode", js.undefined)
      
      @scala.inline
      def setExpiresIn(value: ExpirationInSeconds): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
      
      @scala.inline
      def setInterval(value: IntervalInSeconds): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setUserCode(value: UserCode): Self = StObject.set(x, "userCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserCodeUndefined: Self = StObject.set(x, "userCode", js.undefined)
      
      @scala.inline
      def setVerificationUri(value: URI): Self = StObject.set(x, "verificationUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerificationUriComplete(value: URI): Self = StObject.set(x, "verificationUriComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerificationUriCompleteUndefined: Self = StObject.set(x, "verificationUriComplete", js.undefined)
      
      @scala.inline
      def setVerificationUriUndefined: Self = StObject.set(x, "verificationUri", js.undefined)
    }
  }
  
  type TokenType = String
  
  type URI = String
  
  type UserCode = String
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-06-10`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
