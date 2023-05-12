package typings.awsSdkClientSqs

import typings.awsSdkClientSqs.distTypesModelsModels0Mod.SendMessageBatchRequest
import typings.awsSdkClientSqs.distTypesModelsModels0Mod.SendMessageBatchResult
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

object distTypesCommandsSendMessageBatchCommandMod {
  
  @JSImport("@aws-sdk/client-sqs/dist-types/commands/SendMessageBatchCommand", "SendMessageBatchCommand")
  @js.native
  open class SendMessageBatchCommand protected () extends Command[
          SendMessageBatchCommandInput, 
          SendMessageBatchCommandOutput, 
          SQSClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: SendMessageBatchCommandInput) = this()
    
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
    ): Handler[SendMessageBatchCommandInput, SendMessageBatchCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: SQSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[SendMessageBatchCommandInput, SendMessageBatchCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object SendMessageBatchCommand {
    
    @JSImport("@aws-sdk/client-sqs/dist-types/commands/SendMessageBatchCommand", "SendMessageBatchCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type SendMessageBatchCommandInput = SendMessageBatchRequest
  
  trait SendMessageBatchCommandOutput
    extends StObject
       with SendMessageBatchResult
       with MetadataBearer
       with _ServiceOutputTypes
  object SendMessageBatchCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): SendMessageBatchCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendMessageBatchCommandOutput]
    }
  }
}
