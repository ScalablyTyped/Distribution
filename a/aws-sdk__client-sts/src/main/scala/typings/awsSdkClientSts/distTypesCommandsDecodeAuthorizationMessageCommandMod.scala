package typings.awsSdkClientSts

import typings.awsSdkClientSts.distTypesModelsModels0Mod.DecodeAuthorizationMessageRequest
import typings.awsSdkClientSts.distTypesModelsModels0Mod.DecodeAuthorizationMessageResponse
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

object distTypesCommandsDecodeAuthorizationMessageCommandMod {
  
  @JSImport("@aws-sdk/client-sts/dist-types/commands/DecodeAuthorizationMessageCommand", "DecodeAuthorizationMessageCommand")
  @js.native
  open class DecodeAuthorizationMessageCommand protected () extends Command[
          DecodeAuthorizationMessageCommandInput, 
          DecodeAuthorizationMessageCommandOutput, 
          STSClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: DecodeAuthorizationMessageCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig
    ): Handler[DecodeAuthorizationMessageCommandInput, DecodeAuthorizationMessageCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[DecodeAuthorizationMessageCommandInput, DecodeAuthorizationMessageCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object DecodeAuthorizationMessageCommand {
    
    @JSImport("@aws-sdk/client-sts/dist-types/commands/DecodeAuthorizationMessageCommand", "DecodeAuthorizationMessageCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type DecodeAuthorizationMessageCommandInput = DecodeAuthorizationMessageRequest
  
  trait DecodeAuthorizationMessageCommandOutput
    extends StObject
       with DecodeAuthorizationMessageResponse
       with MetadataBearer
       with ServiceOutputTypes
  object DecodeAuthorizationMessageCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): DecodeAuthorizationMessageCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodeAuthorizationMessageCommandOutput]
    }
  }
}
