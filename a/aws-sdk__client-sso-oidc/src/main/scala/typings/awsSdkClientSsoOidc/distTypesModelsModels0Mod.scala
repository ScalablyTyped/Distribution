package typings.awsSdkClientSsoOidc

import typings.awsSdkClientSsoOidc.anon.ExceptionOptionTypeAccess
import typings.awsSdkClientSsoOidc.anon.ExceptionOptionTypeAuthor
import typings.awsSdkClientSsoOidc.anon.ExceptionOptionTypeExpire
import typings.awsSdkClientSsoOidc.anon.ExceptionOptionTypeIntern
import typings.awsSdkClientSsoOidc.anon.ExceptionOptionTypeInvali
import typings.awsSdkClientSsoOidc.anon.ExceptionOptionTypeSlowDo
import typings.awsSdkClientSsoOidc.anon.ExceptionOptionTypeUnauth
import typings.awsSdkClientSsoOidc.anon.ExceptionOptionTypeUnsupp
import typings.awsSdkClientSsoOidc.awsSdkClientSsoOidcStrings.client
import typings.awsSdkClientSsoOidc.awsSdkClientSsoOidcStrings.server
import typings.awsSdkClientSsoOidc.distTypesModelsSsooidcserviceexceptionMod.SSOOIDCServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesModelsModels0Mod {
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/models/models_0", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/models/models_0", "AccessDeniedException")
  @js.native
  open class AccessDeniedException protected () extends SSOOIDCServiceException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeAccess) = this()
    
    @JSName("$fault")
    val $fault_AccessDeniedException: client = js.native
    
    var error: js.UndefOr[String] = js.native
    
    var error_description: js.UndefOr[String] = js.native
    
    @JSName("name")
    val name_AccessDeniedException: typings.awsSdkClientSsoOidc.awsSdkClientSsoOidcStrings.AccessDeniedException = js.native
  }
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/models/models_0", "AuthorizationPendingException")
  @js.native
  open class AuthorizationPendingException protected () extends SSOOIDCServiceException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeAuthor) = this()
    
    @JSName("$fault")
    val $fault_AuthorizationPendingException: client = js.native
    
    var error: js.UndefOr[String] = js.native
    
    var error_description: js.UndefOr[String] = js.native
    
    @JSName("name")
    val name_AuthorizationPendingException: typings.awsSdkClientSsoOidc.awsSdkClientSsoOidcStrings.AuthorizationPendingException = js.native
  }
  
  inline def CreateTokenRequestFilterSensitiveLog(obj: CreateTokenRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTokenRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def CreateTokenResponseFilterSensitiveLog(obj: CreateTokenResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTokenResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/models/models_0", "ExpiredTokenException")
  @js.native
  open class ExpiredTokenException protected () extends SSOOIDCServiceException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeExpire) = this()
    
    @JSName("$fault")
    val $fault_ExpiredTokenException: client = js.native
    
    var error: js.UndefOr[String] = js.native
    
    var error_description: js.UndefOr[String] = js.native
    
    @JSName("name")
    val name_ExpiredTokenException: typings.awsSdkClientSsoOidc.awsSdkClientSsoOidcStrings.ExpiredTokenException = js.native
  }
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/models/models_0", "InternalServerException")
  @js.native
  open class InternalServerException protected () extends SSOOIDCServiceException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeIntern) = this()
    
    @JSName("$fault")
    val $fault_InternalServerException: server = js.native
    
    var error: js.UndefOr[String] = js.native
    
    var error_description: js.UndefOr[String] = js.native
    
    @JSName("name")
    val name_InternalServerException: typings.awsSdkClientSsoOidc.awsSdkClientSsoOidcStrings.InternalServerException = js.native
  }
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/models/models_0", "InvalidClientException")
  @js.native
  open class InvalidClientException protected () extends SSOOIDCServiceException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
    
    @JSName("$fault")
    val $fault_InvalidClientException: client = js.native
    
    var error: js.UndefOr[String] = js.native
    
    var error_description: js.UndefOr[String] = js.native
    
    @JSName("name")
    val name_InvalidClientException: typings.awsSdkClientSsoOidc.awsSdkClientSsoOidcStrings.InvalidClientException = js.native
  }
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/models/models_0", "InvalidClientMetadataException")
  @js.native
  open class InvalidClientMetadataException protected () extends SSOOIDCServiceException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
    
    @JSName("$fault")
    val $fault_InvalidClientMetadataException: client = js.native
    
    var error: js.UndefOr[String] = js.native
    
    var error_description: js.UndefOr[String] = js.native
    
    @JSName("name")
    val name_InvalidClientMetadataException: typings.awsSdkClientSsoOidc.awsSdkClientSsoOidcStrings.InvalidClientMetadataException = js.native
  }
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/models/models_0", "InvalidGrantException")
  @js.native
  open class InvalidGrantException protected () extends SSOOIDCServiceException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
    
    @JSName("$fault")
    val $fault_InvalidGrantException: client = js.native
    
    var error: js.UndefOr[String] = js.native
    
    var error_description: js.UndefOr[String] = js.native
    
    @JSName("name")
    val name_InvalidGrantException: typings.awsSdkClientSsoOidc.awsSdkClientSsoOidcStrings.InvalidGrantException = js.native
  }
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/models/models_0", "InvalidRequestException")
  @js.native
  open class InvalidRequestException protected () extends SSOOIDCServiceException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
    
    @JSName("$fault")
    val $fault_InvalidRequestException: client = js.native
    
    var error: js.UndefOr[String] = js.native
    
    var error_description: js.UndefOr[String] = js.native
    
    @JSName("name")
    val name_InvalidRequestException: typings.awsSdkClientSsoOidc.awsSdkClientSsoOidcStrings.InvalidRequestException = js.native
  }
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/models/models_0", "InvalidScopeException")
  @js.native
  open class InvalidScopeException protected () extends SSOOIDCServiceException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
    
    @JSName("$fault")
    val $fault_InvalidScopeException: client = js.native
    
    var error: js.UndefOr[String] = js.native
    
    var error_description: js.UndefOr[String] = js.native
    
    @JSName("name")
    val name_InvalidScopeException: typings.awsSdkClientSsoOidc.awsSdkClientSsoOidcStrings.InvalidScopeException = js.native
  }
  
  inline def RegisterClientRequestFilterSensitiveLog(obj: RegisterClientRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("RegisterClientRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def RegisterClientResponseFilterSensitiveLog(obj: RegisterClientResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("RegisterClientResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/models/models_0", "SlowDownException")
  @js.native
  open class SlowDownException protected () extends SSOOIDCServiceException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeSlowDo) = this()
    
    @JSName("$fault")
    val $fault_SlowDownException: client = js.native
    
    var error: js.UndefOr[String] = js.native
    
    var error_description: js.UndefOr[String] = js.native
    
    @JSName("name")
    val name_SlowDownException: typings.awsSdkClientSsoOidc.awsSdkClientSsoOidcStrings.SlowDownException = js.native
  }
  
  inline def StartDeviceAuthorizationRequestFilterSensitiveLog(obj: StartDeviceAuthorizationRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("StartDeviceAuthorizationRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def StartDeviceAuthorizationResponseFilterSensitiveLog(obj: StartDeviceAuthorizationResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("StartDeviceAuthorizationResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/models/models_0", "UnauthorizedClientException")
  @js.native
  open class UnauthorizedClientException protected () extends SSOOIDCServiceException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeUnauth) = this()
    
    @JSName("$fault")
    val $fault_UnauthorizedClientException: client = js.native
    
    var error: js.UndefOr[String] = js.native
    
    var error_description: js.UndefOr[String] = js.native
    
    @JSName("name")
    val name_UnauthorizedClientException: typings.awsSdkClientSsoOidc.awsSdkClientSsoOidcStrings.UnauthorizedClientException = js.native
  }
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/models/models_0", "UnsupportedGrantTypeException")
  @js.native
  open class UnsupportedGrantTypeException protected () extends SSOOIDCServiceException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeUnsupp) = this()
    
    @JSName("$fault")
    val $fault_UnsupportedGrantTypeException: client = js.native
    
    var error: js.UndefOr[String] = js.native
    
    var error_description: js.UndefOr[String] = js.native
    
    @JSName("name")
    val name_UnsupportedGrantTypeException: typings.awsSdkClientSsoOidc.awsSdkClientSsoOidcStrings.UnsupportedGrantTypeException = js.native
  }
  
  trait CreateTokenRequest extends StObject {
    
    /**
      * <p>The unique identifier string for each client. This value should come from the persisted
      *       result of the <a>RegisterClient</a> API.</p>
      */
    var clientId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>A secret string generated for the client. This value should come from the persisted result
      *       of the <a>RegisterClient</a> API.</p>
      */
    var clientSecret: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The authorization code received from the authorization service. This parameter is required
      *       to perform an authorization grant request to get access to a token.</p>
      */
    var code: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Used only when calling this API for the device code grant type. This short-term code is
      *       used to identify this authentication attempt. This should come from an in-memory reference to
      *       the result of the <a>StartDeviceAuthorization</a> API.</p>
      */
    var deviceCode: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Supports grant types for the authorization code, refresh token, and device code request.
      *       For device code requests, specify the following value:</p>
      *
      *          <p>
      *             <code>urn:ietf:params:oauth:grant-type:<i>device_code</i>
      *             </code>
      *          </p>
      *
      *          <p>For information about how to obtain the device code, see the <a>StartDeviceAuthorization</a> topic.</p>
      */
    var grantType: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The location of the application that will receive the authorization code. Users authorize
      *       the service to send the request to this location.</p>
      */
    var redirectUri: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Currently, <code>refreshToken</code> is not yet implemented and is not supported. For more
      *       information about the features and limitations of the current IAM Identity Center OIDC implementation,
      *       see <i>Considerations for Using this Guide</i> in the <a href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/Welcome.html">IAM Identity Center
      *         OIDC API Reference</a>.</p>
      *          <p>The token used to obtain an access token in the event that the access token is invalid or
      *       expired.</p>
      */
    var refreshToken: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The list of scopes that is defined by the client. Upon authorization, this list is used to
      *       restrict permissions when granting an access token.</p>
      */
    var scope: js.UndefOr[js.Array[String]] = js.undefined
  }
  object CreateTokenRequest {
    
    inline def apply(): CreateTokenRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateTokenRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateTokenRequest] (val x: Self) extends AnyVal {
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setDeviceCode(value: String): Self = StObject.set(x, "deviceCode", value.asInstanceOf[js.Any])
      
      inline def setDeviceCodeUndefined: Self = StObject.set(x, "deviceCode", js.undefined)
      
      inline def setGrantType(value: String): Self = StObject.set(x, "grantType", value.asInstanceOf[js.Any])
      
      inline def setGrantTypeUndefined: Self = StObject.set(x, "grantType", js.undefined)
      
      inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
      
      inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
      
      inline def setScope(value: js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
    }
  }
  
  trait CreateTokenResponse extends StObject {
    
    /**
      * <p>An opaque token to access IAM Identity Center resources assigned to a user.</p>
      */
    var accessToken: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Indicates the time in seconds when an access token will expire.</p>
      */
    var expiresIn: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>Currently, <code>idToken</code> is not yet implemented and is not supported. For more
      *       information about the features and limitations of the current IAM Identity Center OIDC implementation,
      *       see <i>Considerations for Using this Guide</i> in the <a href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/Welcome.html">IAM Identity Center
      *         OIDC API Reference</a>.</p>
      *          <p>The identifier of the user that associated with the access token, if present.</p>
      */
    var idToken: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Currently, <code>refreshToken</code> is not yet implemented and is not supported. For more
      *       information about the features and limitations of the current IAM Identity Center OIDC implementation,
      *       see <i>Considerations for Using this Guide</i> in the <a href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/Welcome.html">IAM Identity Center
      *         OIDC API Reference</a>.</p>
      *          <p>A token that, if present, can be used to refresh a previously issued access token that
      *       might have expired.</p>
      */
    var refreshToken: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Used to notify the client that the returned token is an access token. The supported type
      *       is <code>BearerToken</code>.</p>
      */
    var tokenType: js.UndefOr[String] = js.undefined
  }
  object CreateTokenResponse {
    
    inline def apply(): CreateTokenResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateTokenResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateTokenResponse] (val x: Self) extends AnyVal {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      inline def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
      
      inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
      
      inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
      
      inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
      
      inline def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      inline def setTokenTypeUndefined: Self = StObject.set(x, "tokenType", js.undefined)
    }
  }
  
  trait RegisterClientRequest extends StObject {
    
    /**
      * <p>The friendly name of the client.</p>
      */
    var clientName: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The type of client. The service supports only <code>public</code> as a client type.
      *       Anything other than public will be rejected by the service.</p>
      */
    var clientType: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The list of scopes that are defined by the client. Upon authorization, this list is used
      *       to restrict permissions when granting an access token.</p>
      */
    var scopes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object RegisterClientRequest {
    
    inline def apply(): RegisterClientRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegisterClientRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegisterClientRequest] (val x: Self) extends AnyVal {
      
      inline def setClientName(value: String): Self = StObject.set(x, "clientName", value.asInstanceOf[js.Any])
      
      inline def setClientNameUndefined: Self = StObject.set(x, "clientName", js.undefined)
      
      inline def setClientType(value: String): Self = StObject.set(x, "clientType", value.asInstanceOf[js.Any])
      
      inline def setClientTypeUndefined: Self = StObject.set(x, "clientType", js.undefined)
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
    }
  }
  
  trait RegisterClientResponse extends StObject {
    
    /**
      * <p>The endpoint where the client can request authorization.</p>
      */
    var authorizationEndpoint: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The unique identifier string for each client. This client uses this identifier to get
      *       authenticated by the service in subsequent calls.</p>
      */
    var clientId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Indicates the time at which the <code>clientId</code> and <code>clientSecret</code> were
      *       issued.</p>
      */
    var clientIdIssuedAt: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>A secret string generated for the client. The client will use this string to get
      *       authenticated by the service in subsequent calls.</p>
      */
    var clientSecret: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Indicates the time at which the <code>clientId</code> and <code>clientSecret</code> will
      *       become invalid.</p>
      */
    var clientSecretExpiresAt: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The endpoint where the client can get an access token.</p>
      */
    var tokenEndpoint: js.UndefOr[String] = js.undefined
  }
  object RegisterClientResponse {
    
    inline def apply(): RegisterClientResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegisterClientResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegisterClientResponse] (val x: Self) extends AnyVal {
      
      inline def setAuthorizationEndpoint(value: String): Self = StObject.set(x, "authorizationEndpoint", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationEndpointUndefined: Self = StObject.set(x, "authorizationEndpoint", js.undefined)
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdIssuedAt(value: Double): Self = StObject.set(x, "clientIdIssuedAt", value.asInstanceOf[js.Any])
      
      inline def setClientIdIssuedAtUndefined: Self = StObject.set(x, "clientIdIssuedAt", js.undefined)
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setClientSecretExpiresAt(value: Double): Self = StObject.set(x, "clientSecretExpiresAt", value.asInstanceOf[js.Any])
      
      inline def setClientSecretExpiresAtUndefined: Self = StObject.set(x, "clientSecretExpiresAt", js.undefined)
      
      inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
      
      inline def setTokenEndpoint(value: String): Self = StObject.set(x, "tokenEndpoint", value.asInstanceOf[js.Any])
      
      inline def setTokenEndpointUndefined: Self = StObject.set(x, "tokenEndpoint", js.undefined)
    }
  }
  
  trait StartDeviceAuthorizationRequest extends StObject {
    
    /**
      * <p>The unique identifier string for the client that is registered with IAM Identity Center. This value
      *       should come from the persisted result of the <a>RegisterClient</a> API
      *       operation.</p>
      */
    var clientId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>A secret string that is generated for the client. This value should come from the
      *       persisted result of the <a>RegisterClient</a> API operation.</p>
      */
    var clientSecret: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The URL for the AWS access portal. For more information, see <a href="https://docs.aws.amazon.com/singlesignon/latest/userguide/using-the-portal.html">Using
      *       the AWS access portal</a> in the <i>IAM Identity Center User Guide</i>.</p>
      */
    var startUrl: js.UndefOr[String] = js.undefined
  }
  object StartDeviceAuthorizationRequest {
    
    inline def apply(): StartDeviceAuthorizationRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartDeviceAuthorizationRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StartDeviceAuthorizationRequest] (val x: Self) extends AnyVal {
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
      
      inline def setStartUrl(value: String): Self = StObject.set(x, "startUrl", value.asInstanceOf[js.Any])
      
      inline def setStartUrlUndefined: Self = StObject.set(x, "startUrl", js.undefined)
    }
  }
  
  trait StartDeviceAuthorizationResponse extends StObject {
    
    /**
      * <p>The short-lived code that is used by the device when polling for a session token.</p>
      */
    var deviceCode: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Indicates the number of seconds in which the verification code will become invalid.</p>
      */
    var expiresIn: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>Indicates the number of seconds the client must wait between attempts when polling for a
      *       session.</p>
      */
    var interval: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>A one-time user verification code. This is needed to authorize an in-use device.</p>
      */
    var userCode: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The URI of the verification page that takes the <code>userCode</code> to authorize the
      *       device.</p>
      */
    var verificationUri: js.UndefOr[String] = js.undefined
    
    /**
      * <p>An alternate URL that the client can use to automatically launch a browser. This process
      *       skips the manual step in which the user visits the verification page and enters their
      *       code.</p>
      */
    var verificationUriComplete: js.UndefOr[String] = js.undefined
  }
  object StartDeviceAuthorizationResponse {
    
    inline def apply(): StartDeviceAuthorizationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartDeviceAuthorizationResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StartDeviceAuthorizationResponse] (val x: Self) extends AnyVal {
      
      inline def setDeviceCode(value: String): Self = StObject.set(x, "deviceCode", value.asInstanceOf[js.Any])
      
      inline def setDeviceCodeUndefined: Self = StObject.set(x, "deviceCode", js.undefined)
      
      inline def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setUserCode(value: String): Self = StObject.set(x, "userCode", value.asInstanceOf[js.Any])
      
      inline def setUserCodeUndefined: Self = StObject.set(x, "userCode", js.undefined)
      
      inline def setVerificationUri(value: String): Self = StObject.set(x, "verificationUri", value.asInstanceOf[js.Any])
      
      inline def setVerificationUriComplete(value: String): Self = StObject.set(x, "verificationUriComplete", value.asInstanceOf[js.Any])
      
      inline def setVerificationUriCompleteUndefined: Self = StObject.set(x, "verificationUriComplete", js.undefined)
      
      inline def setVerificationUriUndefined: Self = StObject.set(x, "verificationUri", js.undefined)
    }
  }
}
