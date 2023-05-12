package typings.awsSdkClientSsoOidc

import typings.awsSdkClientSsoOidc.distTypesModelsModels0Mod.StartDeviceAuthorizationRequest
import typings.awsSdkClientSsoOidc.distTypesModelsModels0Mod.StartDeviceAuthorizationResponse
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

object distTypesCommandsStartDeviceAuthorizationCommandMod {
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/commands/StartDeviceAuthorizationCommand", "StartDeviceAuthorizationCommand")
  @js.native
  open class StartDeviceAuthorizationCommand protected () extends Command[
          StartDeviceAuthorizationCommandInput, 
          StartDeviceAuthorizationCommandOutput, 
          SSOOIDCClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: StartDeviceAuthorizationCommandInput) = this()
    
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
    ): Handler[StartDeviceAuthorizationCommandInput, StartDeviceAuthorizationCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: SSOOIDCClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[StartDeviceAuthorizationCommandInput, StartDeviceAuthorizationCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object StartDeviceAuthorizationCommand {
    
    @JSImport("@aws-sdk/client-sso-oidc/dist-types/commands/StartDeviceAuthorizationCommand", "StartDeviceAuthorizationCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type StartDeviceAuthorizationCommandInput = StartDeviceAuthorizationRequest
  
  trait StartDeviceAuthorizationCommandOutput
    extends StObject
       with StartDeviceAuthorizationResponse
       with MetadataBearer
       with ServiceOutputTypes
  object StartDeviceAuthorizationCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): StartDeviceAuthorizationCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartDeviceAuthorizationCommandOutput]
    }
  }
}
