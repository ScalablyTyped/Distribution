package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesKmsclientMod.KMSClientResolvedConfig
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceInputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceOutputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod._ServiceOutputTypes
import typings.awsSdkClientKms.distTypesModelsModels0Mod.ScheduleKeyDeletionRequest
import typings.awsSdkClientKms.distTypesModelsModels0Mod.ScheduleKeyDeletionResponse
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

object distTypesCommandsScheduleKeyDeletionCommandMod {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands/ScheduleKeyDeletionCommand", "ScheduleKeyDeletionCommand")
  @js.native
  open class ScheduleKeyDeletionCommand protected () extends Command[
          ScheduleKeyDeletionCommandInput, 
          ScheduleKeyDeletionCommandOutput, 
          KMSClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: ScheduleKeyDeletionCommandInput) = this()
    
    /**
      * @internal
      */
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: KMSClientResolvedConfig
    ): Handler[ScheduleKeyDeletionCommandInput, ScheduleKeyDeletionCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: KMSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[ScheduleKeyDeletionCommandInput, ScheduleKeyDeletionCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object ScheduleKeyDeletionCommand {
    
    @JSImport("@aws-sdk/client-kms/dist-types/commands/ScheduleKeyDeletionCommand", "ScheduleKeyDeletionCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type ScheduleKeyDeletionCommandInput = ScheduleKeyDeletionRequest
  
  trait ScheduleKeyDeletionCommandOutput
    extends StObject
       with ScheduleKeyDeletionResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object ScheduleKeyDeletionCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): ScheduleKeyDeletionCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScheduleKeyDeletionCommandOutput]
    }
  }
}
