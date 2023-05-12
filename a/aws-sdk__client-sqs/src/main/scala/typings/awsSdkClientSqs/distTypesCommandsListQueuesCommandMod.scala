package typings.awsSdkClientSqs

import typings.awsSdkClientSqs.distTypesModelsModels0Mod.ListQueuesRequest
import typings.awsSdkClientSqs.distTypesModelsModels0Mod.ListQueuesResult
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

object distTypesCommandsListQueuesCommandMod {
  
  @JSImport("@aws-sdk/client-sqs/dist-types/commands/ListQueuesCommand", "ListQueuesCommand")
  @js.native
  open class ListQueuesCommand protected () extends Command[ListQueuesCommandInput, ListQueuesCommandOutput, SQSClientResolvedConfig, Any, Any] {
    /**
      * @public
      */
    def this(input: ListQueuesCommandInput) = this()
    
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
    ): Handler[ListQueuesCommandInput, ListQueuesCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: SQSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[ListQueuesCommandInput, ListQueuesCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object ListQueuesCommand {
    
    @JSImport("@aws-sdk/client-sqs/dist-types/commands/ListQueuesCommand", "ListQueuesCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type ListQueuesCommandInput = ListQueuesRequest
  
  trait ListQueuesCommandOutput
    extends StObject
       with ListQueuesResult
       with MetadataBearer
       with _ServiceOutputTypes
  object ListQueuesCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): ListQueuesCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListQueuesCommandOutput]
    }
  }
}
