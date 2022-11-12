package typings.awsSdkClientSsoOidc

import typings.awsSdkClientSsoOidc.anon.ExceptionOptionTypeAccess
import typings.awsSdkClientSsoOidc.anon.ExceptionOptionTypeAuthor
import typings.awsSdkClientSsoOidc.anon.ExceptionOptionTypeExpire
import typings.awsSdkClientSsoOidc.anon.ExceptionOptionTypeIntern
import typings.awsSdkClientSsoOidc.anon.ExceptionOptionTypeInvali
import typings.awsSdkClientSsoOidc.anon.ExceptionOptionTypeSlowDo
import typings.awsSdkClientSsoOidc.anon.ExceptionOptionTypeUnauth
import typings.awsSdkClientSsoOidc.anon.ExceptionOptionTypeUnsupp
import typings.awsSdkClientSsoOidc.distTypesModelsModels0Mod.CreateTokenRequest
import typings.awsSdkClientSsoOidc.distTypesModelsModels0Mod.CreateTokenResponse
import typings.awsSdkClientSsoOidc.distTypesModelsModels0Mod.RegisterClientRequest
import typings.awsSdkClientSsoOidc.distTypesModelsModels0Mod.RegisterClientResponse
import typings.awsSdkClientSsoOidc.distTypesModelsModels0Mod.StartDeviceAuthorizationRequest
import typings.awsSdkClientSsoOidc.distTypesModelsModels0Mod.StartDeviceAuthorizationResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesModelsMod {
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/models", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/models", "AccessDeniedException")
  @js.native
  open class AccessDeniedException protected ()
    extends typings.awsSdkClientSsoOidc.distTypesModelsModels0Mod.AccessDeniedException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeAccess) = this()
  }
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/models", "AuthorizationPendingException")
  @js.native
  open class AuthorizationPendingException protected ()
    extends typings.awsSdkClientSsoOidc.distTypesModelsModels0Mod.AuthorizationPendingException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeAuthor) = this()
  }
  
  inline def CreateTokenRequestFilterSensitiveLog(obj: CreateTokenRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTokenRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def CreateTokenResponseFilterSensitiveLog(obj: CreateTokenResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTokenResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/models", "ExpiredTokenException")
  @js.native
  open class ExpiredTokenException protected ()
    extends typings.awsSdkClientSsoOidc.distTypesModelsModels0Mod.ExpiredTokenException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeExpire) = this()
  }
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/models", "InternalServerException")
  @js.native
  open class InternalServerException protected ()
    extends typings.awsSdkClientSsoOidc.distTypesModelsModels0Mod.InternalServerException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeIntern) = this()
  }
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/models", "InvalidClientException")
  @js.native
  open class InvalidClientException protected ()
    extends typings.awsSdkClientSsoOidc.distTypesModelsModels0Mod.InvalidClientException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/models", "InvalidClientMetadataException")
  @js.native
  open class InvalidClientMetadataException protected ()
    extends typings.awsSdkClientSsoOidc.distTypesModelsModels0Mod.InvalidClientMetadataException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/models", "InvalidGrantException")
  @js.native
  open class InvalidGrantException protected ()
    extends typings.awsSdkClientSsoOidc.distTypesModelsModels0Mod.InvalidGrantException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/models", "InvalidRequestException")
  @js.native
  open class InvalidRequestException protected ()
    extends typings.awsSdkClientSsoOidc.distTypesModelsModels0Mod.InvalidRequestException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/models", "InvalidScopeException")
  @js.native
  open class InvalidScopeException protected ()
    extends typings.awsSdkClientSsoOidc.distTypesModelsModels0Mod.InvalidScopeException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  inline def RegisterClientRequestFilterSensitiveLog(obj: RegisterClientRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("RegisterClientRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def RegisterClientResponseFilterSensitiveLog(obj: RegisterClientResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("RegisterClientResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/models", "SlowDownException")
  @js.native
  open class SlowDownException protected ()
    extends typings.awsSdkClientSsoOidc.distTypesModelsModels0Mod.SlowDownException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeSlowDo) = this()
  }
  
  inline def StartDeviceAuthorizationRequestFilterSensitiveLog(obj: StartDeviceAuthorizationRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("StartDeviceAuthorizationRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def StartDeviceAuthorizationResponseFilterSensitiveLog(obj: StartDeviceAuthorizationResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("StartDeviceAuthorizationResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/models", "UnauthorizedClientException")
  @js.native
  open class UnauthorizedClientException protected ()
    extends typings.awsSdkClientSsoOidc.distTypesModelsModels0Mod.UnauthorizedClientException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeUnauth) = this()
  }
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/models", "UnsupportedGrantTypeException")
  @js.native
  open class UnsupportedGrantTypeException protected ()
    extends typings.awsSdkClientSsoOidc.distTypesModelsModels0Mod.UnsupportedGrantTypeException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeUnsupp) = this()
  }
}
