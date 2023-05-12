package typings.awsSdkClientSqs

import typings.awsSdkClientSqs.distTypesModelsModels0Mod.GetQueueAttributesRequest
import typings.awsSdkClientSqs.distTypesModelsModels0Mod.GetQueueAttributesResult
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

object distTypesCommandsGetQueueAttributesCommandMod {
  
  @JSImport("@aws-sdk/client-sqs/dist-types/commands/GetQueueAttributesCommand", "GetQueueAttributesCommand")
  @js.native
  open class GetQueueAttributesCommand protected () extends Command[
          GetQueueAttributesCommandInput, 
          GetQueueAttributesCommandOutput, 
          SQSClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: GetQueueAttributesCommandInput) = this()
    
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
    ): Handler[GetQueueAttributesCommandInput, GetQueueAttributesCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: SQSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[GetQueueAttributesCommandInput, GetQueueAttributesCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object GetQueueAttributesCommand {
    
    @JSImport("@aws-sdk/client-sqs/dist-types/commands/GetQueueAttributesCommand", "GetQueueAttributesCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type GetQueueAttributesCommandInput = GetQueueAttributesRequest
  
  trait GetQueueAttributesCommandOutput
    extends StObject
       with GetQueueAttributesResult
       with MetadataBearer
       with _ServiceOutputTypes
  object GetQueueAttributesCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): GetQueueAttributesCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetQueueAttributesCommandOutput]
    }
  }
}
