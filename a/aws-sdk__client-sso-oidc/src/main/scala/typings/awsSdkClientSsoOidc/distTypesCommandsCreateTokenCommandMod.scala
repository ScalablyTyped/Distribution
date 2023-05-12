package typings.awsSdkClientSsoOidc

import typings.awsSdkClientSsoOidc.distTypesModelsModels0Mod.CreateTokenRequest
import typings.awsSdkClientSsoOidc.distTypesModelsModels0Mod.CreateTokenResponse
import typings.awsSdkClientSsoOidc.distTypesSsooidcclientMod.SSOOIDCClientResolvedConfig
import typings.awsSdkClientSsoOidc.distTypesSsooidcclientMod.ServiceInputTypes
import typings.awsSdkClientSsoOidc.distTypesSsooidcclientMod.ServiceOutputTypes
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommandsCreateTokenCommandMod {
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/commands/CreateTokenCommand", "CreateTokenCommand")
  @js.native
  open class CreateTokenCommand protected () extends Command[CreateTokenCommandInput, CreateTokenCommandOutput, SSOOIDCClientResolvedConfig, Any, Any] {
    /**
      * @public
      */
    def this(input: CreateTokenCommandInput) = this()
    
    /**
      * @internal
      */
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: SSOOIDCClientResolvedConfig
    ): Handler[CreateTokenCommandInput, CreateTokenCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: SSOOIDCClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[CreateTokenCommandInput, CreateTokenCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object CreateTokenCommand {
    
    @JSImport("@aws-sdk/client-sso-oidc/dist-types/commands/CreateTokenCommand", "CreateTokenCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type CreateTokenCommandInput = CreateTokenRequest
  
  trait CreateTokenCommandOutput
    extends StObject
       with CreateTokenResponse
       with MetadataBearer
       with ServiceOutputTypes
  object CreateTokenCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): CreateTokenCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateTokenCommandOutput]
    }
  }
}
