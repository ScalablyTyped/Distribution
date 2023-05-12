package typings.awsSdkClientSqs

import typings.awsSdkClientSqs.distTypesModelsModels0Mod.ChangeMessageVisibilityBatchRequest
import typings.awsSdkClientSqs.distTypesModelsModels0Mod.ChangeMessageVisibilityBatchResult
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

object distTypesCommandsChangeMessageVisibilityBatchCommandMod {
  
  @JSImport("@aws-sdk/client-sqs/dist-types/commands/ChangeMessageVisibilityBatchCommand", "ChangeMessageVisibilityBatchCommand")
  @js.native
  open class ChangeMessageVisibilityBatchCommand protected () extends Command[
          ChangeMessageVisibilityBatchCommandInput, 
          ChangeMessageVisibilityBatchCommandOutput, 
          SQSClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: ChangeMessageVisibilityBatchCommandInput) = this()
    
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
    ): Handler[
        ChangeMessageVisibilityBatchCommandInput, 
        ChangeMessageVisibilityBatchCommandOutput
      ] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: SQSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[
        ChangeMessageVisibilityBatchCommandInput, 
        ChangeMessageVisibilityBatchCommandOutput
      ] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object ChangeMessageVisibilityBatchCommand {
    
    @JSImport("@aws-sdk/client-sqs/dist-types/commands/ChangeMessageVisibilityBatchCommand", "ChangeMessageVisibilityBatchCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type ChangeMessageVisibilityBatchCommandInput = ChangeMessageVisibilityBatchRequest
  
  trait ChangeMessageVisibilityBatchCommandOutput
    extends StObject
       with ChangeMessageVisibilityBatchResult
       with MetadataBearer
       with _ServiceOutputTypes
  object ChangeMessageVisibilityBatchCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): ChangeMessageVisibilityBatchCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeMessageVisibilityBatchCommandOutput]
    }
  }
}
