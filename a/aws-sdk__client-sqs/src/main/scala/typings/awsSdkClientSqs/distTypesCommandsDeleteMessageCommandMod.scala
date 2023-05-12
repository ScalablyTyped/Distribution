package typings.awsSdkClientSqs

import typings.awsSdkClientSqs.distTypesModelsModels0Mod.DeleteMessageRequest
import typings.awsSdkClientSqs.distTypesSqsclientMod.SQSClientResolvedConfig
import typings.awsSdkClientSqs.distTypesSqsclientMod.ServiceInputTypes
import typings.awsSdkClientSqs.distTypesSqsclientMod.ServiceOutputTypes
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommandsDeleteMessageCommandMod {
  
  @JSImport("@aws-sdk/client-sqs/dist-types/commands/DeleteMessageCommand", "DeleteMessageCommand")
  @js.native
  open class DeleteMessageCommand protected () extends Command[DeleteMessageCommandInput, DeleteMessageCommandOutput, SQSClientResolvedConfig, Any, Any] {
    /**
      * @public
      */
    def this(input: DeleteMessageCommandInput) = this()
    
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
    ): Handler[DeleteMessageCommandInput, DeleteMessageCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: SQSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[DeleteMessageCommandInput, DeleteMessageCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object DeleteMessageCommand {
    
    @JSImport("@aws-sdk/client-sqs/dist-types/commands/DeleteMessageCommand", "DeleteMessageCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type DeleteMessageCommandInput = DeleteMessageRequest
  
  type DeleteMessageCommandOutput = MetadataBearer
}
