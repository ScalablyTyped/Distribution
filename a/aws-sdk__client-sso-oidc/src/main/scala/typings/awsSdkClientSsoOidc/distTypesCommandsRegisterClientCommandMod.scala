package typings.awsSdkClientSsoOidc

import typings.awsSdkClientSsoOidc.distTypesModelsModels0Mod.RegisterClientRequest
import typings.awsSdkClientSsoOidc.distTypesModelsModels0Mod.RegisterClientResponse
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

object distTypesCommandsRegisterClientCommandMod {
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/commands/RegisterClientCommand", "RegisterClientCommand")
  @js.native
  open class RegisterClientCommand protected () extends Command[
          RegisterClientCommandInput, 
          RegisterClientCommandOutput, 
          SSOOIDCClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: RegisterClientCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: SSOOIDCClientResolvedConfig
    ): Handler[RegisterClientCommandInput, RegisterClientCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: SSOOIDCClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[RegisterClientCommandInput, RegisterClientCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object RegisterClientCommand {
    
    @JSImport("@aws-sdk/client-sso-oidc/dist-types/commands/RegisterClientCommand", "RegisterClientCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type RegisterClientCommandInput = RegisterClientRequest
  
  trait RegisterClientCommandOutput
    extends StObject
       with RegisterClientResponse
       with MetadataBearer
       with ServiceOutputTypes
  object RegisterClientCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): RegisterClientCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisterClientCommandOutput]
    }
  }
}
