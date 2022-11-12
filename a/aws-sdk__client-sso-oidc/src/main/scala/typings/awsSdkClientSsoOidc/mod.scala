package typings.awsSdkClientSsoOidc

import typings.awsSdkClientSsoOidc.anon.ExceptionOptionTypeAccess
import typings.awsSdkClientSsoOidc.anon.ExceptionOptionTypeAuthor
import typings.awsSdkClientSsoOidc.anon.ExceptionOptionTypeExpire
import typings.awsSdkClientSsoOidc.anon.ExceptionOptionTypeIntern
import typings.awsSdkClientSsoOidc.anon.ExceptionOptionTypeInvali
import typings.awsSdkClientSsoOidc.anon.ExceptionOptionTypeSlowDo
import typings.awsSdkClientSsoOidc.anon.ExceptionOptionTypeUnauth
import typings.awsSdkClientSsoOidc.anon.ExceptionOptionTypeUnsupp
import typings.awsSdkClientSsoOidc.distTypesCommandsCreateTokenCommandMod.CreateTokenCommandInput
import typings.awsSdkClientSsoOidc.distTypesCommandsRegisterClientCommandMod.RegisterClientCommandInput
import typings.awsSdkClientSsoOidc.distTypesCommandsStartDeviceAuthorizationCommandMod.StartDeviceAuthorizationCommandInput
import typings.awsSdkClientSsoOidc.distTypesModelsModels0Mod.CreateTokenRequest
import typings.awsSdkClientSsoOidc.distTypesModelsModels0Mod.CreateTokenResponse
import typings.awsSdkClientSsoOidc.distTypesModelsModels0Mod.RegisterClientRequest
import typings.awsSdkClientSsoOidc.distTypesModelsModels0Mod.RegisterClientResponse
import typings.awsSdkClientSsoOidc.distTypesModelsModels0Mod.StartDeviceAuthorizationRequest
import typings.awsSdkClientSsoOidc.distTypesModelsModels0Mod.StartDeviceAuthorizationResponse
import typings.awsSdkClientSsoOidc.distTypesSsooidcclientMod.SSOOIDCClientConfig
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import typings.awsSdkSmithyClient.distTypesExceptionsMod.ServiceExceptionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/client-sso-oidc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/client-sso-oidc", "AccessDeniedException")
  @js.native
  open class AccessDeniedException protected ()
    extends typings.awsSdkClientSsoOidc.distTypesModelsMod.AccessDeniedException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeAccess) = this()
  }
  
  @JSImport("@aws-sdk/client-sso-oidc", "AuthorizationPendingException")
  @js.native
  open class AuthorizationPendingException protected ()
    extends typings.awsSdkClientSsoOidc.distTypesModelsMod.AuthorizationPendingException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeAuthor) = this()
  }
  
  @JSImport("@aws-sdk/client-sso-oidc", "CreateTokenCommand")
  @js.native
  open class CreateTokenCommand protected ()
    extends typings.awsSdkClientSsoOidc.distTypesCommandsMod.CreateTokenCommand {
    def this(input: CreateTokenCommandInput) = this()
  }
  /* static members */
  object CreateTokenCommand {
    
    @JSImport("@aws-sdk/client-sso-oidc", "CreateTokenCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  inline def CreateTokenRequestFilterSensitiveLog(obj: CreateTokenRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTokenRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def CreateTokenResponseFilterSensitiveLog(obj: CreateTokenResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTokenResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sso-oidc", "ExpiredTokenException")
  @js.native
  open class ExpiredTokenException protected ()
    extends typings.awsSdkClientSsoOidc.distTypesModelsMod.ExpiredTokenException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeExpire) = this()
  }
  
  @JSImport("@aws-sdk/client-sso-oidc", "InternalServerException")
  @js.native
  open class InternalServerException protected ()
    extends typings.awsSdkClientSsoOidc.distTypesModelsMod.InternalServerException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeIntern) = this()
  }
  
  @JSImport("@aws-sdk/client-sso-oidc", "InvalidClientException")
  @js.native
  open class InvalidClientException protected ()
    extends typings.awsSdkClientSsoOidc.distTypesModelsMod.InvalidClientException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  @JSImport("@aws-sdk/client-sso-oidc", "InvalidClientMetadataException")
  @js.native
  open class InvalidClientMetadataException protected ()
    extends typings.awsSdkClientSsoOidc.distTypesModelsMod.InvalidClientMetadataException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  @JSImport("@aws-sdk/client-sso-oidc", "InvalidGrantException")
  @js.native
  open class InvalidGrantException protected ()
    extends typings.awsSdkClientSsoOidc.distTypesModelsMod.InvalidGrantException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  @JSImport("@aws-sdk/client-sso-oidc", "InvalidRequestException")
  @js.native
  open class InvalidRequestException protected ()
    extends typings.awsSdkClientSsoOidc.distTypesModelsMod.InvalidRequestException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  @JSImport("@aws-sdk/client-sso-oidc", "InvalidScopeException")
  @js.native
  open class InvalidScopeException protected ()
    extends typings.awsSdkClientSsoOidc.distTypesModelsMod.InvalidScopeException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  @JSImport("@aws-sdk/client-sso-oidc", "RegisterClientCommand")
  @js.native
  open class RegisterClientCommand protected ()
    extends typings.awsSdkClientSsoOidc.distTypesCommandsMod.RegisterClientCommand {
    def this(input: RegisterClientCommandInput) = this()
  }
  /* static members */
  object RegisterClientCommand {
    
    @JSImport("@aws-sdk/client-sso-oidc", "RegisterClientCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  inline def RegisterClientRequestFilterSensitiveLog(obj: RegisterClientRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("RegisterClientRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def RegisterClientResponseFilterSensitiveLog(obj: RegisterClientResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("RegisterClientResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sso-oidc", "SSOOIDC")
  @js.native
  open class SSOOIDC protected ()
    extends typings.awsSdkClientSsoOidc.distTypesSsooidcMod.SSOOIDC {
    def this(configuration: SSOOIDCClientConfig) = this()
  }
  
  @JSImport("@aws-sdk/client-sso-oidc", "SSOOIDCClient")
  @js.native
  open class SSOOIDCClient protected ()
    extends typings.awsSdkClientSsoOidc.distTypesSsooidcclientMod.SSOOIDCClient {
    def this(configuration: SSOOIDCClientConfig) = this()
  }
  
  @JSImport("@aws-sdk/client-sso-oidc", "SSOOIDCServiceException")
  @js.native
  open class SSOOIDCServiceException protected ()
    extends typings.awsSdkClientSsoOidc.distTypesModelsSsooidcserviceexceptionMod.SSOOIDCServiceException {
    /**
      * @internal
      */
    def this(options: ServiceExceptionOptions) = this()
  }
  
  @JSImport("@aws-sdk/client-sso-oidc", "SlowDownException")
  @js.native
  open class SlowDownException protected ()
    extends typings.awsSdkClientSsoOidc.distTypesModelsMod.SlowDownException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeSlowDo) = this()
  }
  
  @JSImport("@aws-sdk/client-sso-oidc", "StartDeviceAuthorizationCommand")
  @js.native
  open class StartDeviceAuthorizationCommand protected ()
    extends typings.awsSdkClientSsoOidc.distTypesCommandsMod.StartDeviceAuthorizationCommand {
    def this(input: StartDeviceAuthorizationCommandInput) = this()
  }
  /* static members */
  object StartDeviceAuthorizationCommand {
    
    @JSImport("@aws-sdk/client-sso-oidc", "StartDeviceAuthorizationCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  inline def StartDeviceAuthorizationRequestFilterSensitiveLog(obj: StartDeviceAuthorizationRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("StartDeviceAuthorizationRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def StartDeviceAuthorizationResponseFilterSensitiveLog(obj: StartDeviceAuthorizationResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("StartDeviceAuthorizationResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sso-oidc", "UnauthorizedClientException")
  @js.native
  open class UnauthorizedClientException protected ()
    extends typings.awsSdkClientSsoOidc.distTypesModelsMod.UnauthorizedClientException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeUnauth) = this()
  }
  
  @JSImport("@aws-sdk/client-sso-oidc", "UnsupportedGrantTypeException")
  @js.native
  open class UnsupportedGrantTypeException protected ()
    extends typings.awsSdkClientSsoOidc.distTypesModelsMod.UnsupportedGrantTypeException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeUnsupp) = this()
  }
}
