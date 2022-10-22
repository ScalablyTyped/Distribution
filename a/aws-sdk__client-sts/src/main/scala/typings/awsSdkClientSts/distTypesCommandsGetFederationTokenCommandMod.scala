package typings.awsSdkClientSts

import typings.awsSdkClientSts.distTypesModelsModels0Mod.GetFederationTokenRequest
import typings.awsSdkClientSts.distTypesModelsModels0Mod.GetFederationTokenResponse
import typings.awsSdkClientSts.distTypesStsclientMod.STSClientResolvedConfig
import typings.awsSdkClientSts.distTypesStsclientMod.ServiceInputTypes
import typings.awsSdkClientSts.distTypesStsclientMod.ServiceOutputTypes
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

object distTypesCommandsGetFederationTokenCommandMod {
  
  @JSImport("@aws-sdk/client-sts/dist-types/commands/GetFederationTokenCommand", "GetFederationTokenCommand")
  @js.native
  open class GetFederationTokenCommand protected () extends Command[
          GetFederationTokenCommandInput, 
          GetFederationTokenCommandOutput, 
          STSClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: GetFederationTokenCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig
    ): Handler[GetFederationTokenCommandInput, GetFederationTokenCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[GetFederationTokenCommandInput, GetFederationTokenCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object GetFederationTokenCommand {
    
    @JSImport("@aws-sdk/client-sts/dist-types/commands/GetFederationTokenCommand", "GetFederationTokenCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type GetFederationTokenCommandInput = GetFederationTokenRequest
  
  trait GetFederationTokenCommandOutput
    extends StObject
       with GetFederationTokenResponse
       with MetadataBearer
       with ServiceOutputTypes
  object GetFederationTokenCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): GetFederationTokenCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetFederationTokenCommandOutput]
    }
  }
}
