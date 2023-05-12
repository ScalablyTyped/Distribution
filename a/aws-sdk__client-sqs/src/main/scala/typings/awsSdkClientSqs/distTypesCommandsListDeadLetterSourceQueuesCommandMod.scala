package typings.awsSdkClientSqs

import typings.awsSdkClientSqs.distTypesModelsModels0Mod.ListDeadLetterSourceQueuesRequest
import typings.awsSdkClientSqs.distTypesModelsModels0Mod.ListDeadLetterSourceQueuesResult
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

object distTypesCommandsListDeadLetterSourceQueuesCommandMod {
  
  @JSImport("@aws-sdk/client-sqs/dist-types/commands/ListDeadLetterSourceQueuesCommand", "ListDeadLetterSourceQueuesCommand")
  @js.native
  open class ListDeadLetterSourceQueuesCommand protected () extends Command[
          ListDeadLetterSourceQueuesCommandInput, 
          ListDeadLetterSourceQueuesCommandOutput, 
          SQSClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: ListDeadLetterSourceQueuesCommandInput) = this()
    
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
    ): Handler[ListDeadLetterSourceQueuesCommandInput, ListDeadLetterSourceQueuesCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: SQSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[ListDeadLetterSourceQueuesCommandInput, ListDeadLetterSourceQueuesCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object ListDeadLetterSourceQueuesCommand {
    
    @JSImport("@aws-sdk/client-sqs/dist-types/commands/ListDeadLetterSourceQueuesCommand", "ListDeadLetterSourceQueuesCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type ListDeadLetterSourceQueuesCommandInput = ListDeadLetterSourceQueuesRequest
  
  trait ListDeadLetterSourceQueuesCommandOutput
    extends StObject
       with ListDeadLetterSourceQueuesResult
       with MetadataBearer
       with _ServiceOutputTypes
  object ListDeadLetterSourceQueuesCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): ListDeadLetterSourceQueuesCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListDeadLetterSourceQueuesCommandOutput]
    }
  }
}
