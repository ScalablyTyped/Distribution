package typings.awsSdkClientSqs

import typings.awsSdkClientSqs.distTypesModelsModels0Mod.ReceiveMessageRequest
import typings.awsSdkClientSqs.distTypesModelsModels0Mod.ReceiveMessageResult
import typings.awsSdkClientSqs.distTypesSqsclientMod.SQSClientResolvedConfig
import typings.awsSdkClientSqs.distTypesSqsclientMod.ServiceInputTypes
import typings.awsSdkClientSqs.distTypesSqsclientMod.ServiceOutputTypes
import typings.awsSdkClientSqs.distTypesSqsclientMod._ServiceOutputTypes
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

object distTypesCommandsReceiveMessageCommandMod {
  
  @JSImport("@aws-sdk/client-sqs/dist-types/commands/ReceiveMessageCommand", "ReceiveMessageCommand")
  @js.native
  open class ReceiveMessageCommand protected () extends Command[
          ReceiveMessageCommandInput, 
          ReceiveMessageCommandOutput, 
          SQSClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: ReceiveMessageCommandInput) = this()
    
    /**
      * @internal
      */
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: SQSClientResolvedConfig
    ): Handler[ReceiveMessageCommandInput, ReceiveMessageCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: SQSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[ReceiveMessageCommandInput, ReceiveMessageCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object ReceiveMessageCommand {
    
    @JSImport("@aws-sdk/client-sqs/dist-types/commands/ReceiveMessageCommand", "ReceiveMessageCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type ReceiveMessageCommandInput = ReceiveMessageRequest
  
  trait ReceiveMessageCommandOutput
    extends StObject
       with ReceiveMessageResult
       with MetadataBearer
       with _ServiceOutputTypes
  object ReceiveMessageCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): ReceiveMessageCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiveMessageCommandOutput]
    }
  }
}
