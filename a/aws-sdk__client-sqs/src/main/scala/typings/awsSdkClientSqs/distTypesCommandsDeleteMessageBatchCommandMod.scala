package typings.awsSdkClientSqs

import typings.awsSdkClientSqs.distTypesModelsModels0Mod.DeleteMessageBatchRequest
import typings.awsSdkClientSqs.distTypesModelsModels0Mod.DeleteMessageBatchResult
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

object distTypesCommandsDeleteMessageBatchCommandMod {
  
  @JSImport("@aws-sdk/client-sqs/dist-types/commands/DeleteMessageBatchCommand", "DeleteMessageBatchCommand")
  @js.native
  open class DeleteMessageBatchCommand protected () extends Command[
          DeleteMessageBatchCommandInput, 
          DeleteMessageBatchCommandOutput, 
          SQSClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: DeleteMessageBatchCommandInput) = this()
    
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
    ): Handler[DeleteMessageBatchCommandInput, DeleteMessageBatchCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: SQSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[DeleteMessageBatchCommandInput, DeleteMessageBatchCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object DeleteMessageBatchCommand {
    
    @JSImport("@aws-sdk/client-sqs/dist-types/commands/DeleteMessageBatchCommand", "DeleteMessageBatchCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type DeleteMessageBatchCommandInput = DeleteMessageBatchRequest
  
  trait DeleteMessageBatchCommandOutput
    extends StObject
       with DeleteMessageBatchResult
       with MetadataBearer
       with _ServiceOutputTypes
  object DeleteMessageBatchCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): DeleteMessageBatchCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteMessageBatchCommandOutput]
    }
  }
}
