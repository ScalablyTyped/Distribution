package typings.awsSdkClientSqs

import typings.awsSdkClientSqs.distTypesModelsModels0Mod.ChangeMessageVisibilityRequest
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

object distTypesCommandsChangeMessageVisibilityCommandMod {
  
  @JSImport("@aws-sdk/client-sqs/dist-types/commands/ChangeMessageVisibilityCommand", "ChangeMessageVisibilityCommand")
  @js.native
  open class ChangeMessageVisibilityCommand protected () extends Command[
          ChangeMessageVisibilityCommandInput, 
          ChangeMessageVisibilityCommandOutput, 
          SQSClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: ChangeMessageVisibilityCommandInput) = this()
    
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
    ): Handler[ChangeMessageVisibilityCommandInput, ChangeMessageVisibilityCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: SQSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[ChangeMessageVisibilityCommandInput, ChangeMessageVisibilityCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object ChangeMessageVisibilityCommand {
    
    @JSImport("@aws-sdk/client-sqs/dist-types/commands/ChangeMessageVisibilityCommand", "ChangeMessageVisibilityCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type ChangeMessageVisibilityCommandInput = ChangeMessageVisibilityRequest
  
  type ChangeMessageVisibilityCommandOutput = MetadataBearer
}
