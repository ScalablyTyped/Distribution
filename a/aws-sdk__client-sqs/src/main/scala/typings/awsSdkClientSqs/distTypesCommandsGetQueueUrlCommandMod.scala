package typings.awsSdkClientSqs

import typings.awsSdkClientSqs.distTypesModelsModels0Mod.GetQueueUrlRequest
import typings.awsSdkClientSqs.distTypesModelsModels0Mod.GetQueueUrlResult
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

object distTypesCommandsGetQueueUrlCommandMod {
  
  @JSImport("@aws-sdk/client-sqs/dist-types/commands/GetQueueUrlCommand", "GetQueueUrlCommand")
  @js.native
  open class GetQueueUrlCommand protected () extends Command[GetQueueUrlCommandInput, GetQueueUrlCommandOutput, SQSClientResolvedConfig, Any, Any] {
    /**
      * @public
      */
    def this(input: GetQueueUrlCommandInput) = this()
    
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
    ): Handler[GetQueueUrlCommandInput, GetQueueUrlCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: SQSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[GetQueueUrlCommandInput, GetQueueUrlCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object GetQueueUrlCommand {
    
    @JSImport("@aws-sdk/client-sqs/dist-types/commands/GetQueueUrlCommand", "GetQueueUrlCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type GetQueueUrlCommandInput = GetQueueUrlRequest
  
  trait GetQueueUrlCommandOutput
    extends StObject
       with GetQueueUrlResult
       with MetadataBearer
       with _ServiceOutputTypes
  object GetQueueUrlCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): GetQueueUrlCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetQueueUrlCommandOutput]
    }
  }
}
