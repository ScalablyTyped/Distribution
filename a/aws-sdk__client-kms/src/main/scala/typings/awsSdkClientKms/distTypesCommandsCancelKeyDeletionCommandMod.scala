package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesKmsclientMod.KMSClientResolvedConfig
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceInputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceOutputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod._ServiceOutputTypes
import typings.awsSdkClientKms.distTypesModelsModels0Mod.CancelKeyDeletionRequest
import typings.awsSdkClientKms.distTypesModelsModels0Mod.CancelKeyDeletionResponse
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

object distTypesCommandsCancelKeyDeletionCommandMod {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands/CancelKeyDeletionCommand", "CancelKeyDeletionCommand")
  @js.native
  open class CancelKeyDeletionCommand protected () extends Command[
          CancelKeyDeletionCommandInput, 
          CancelKeyDeletionCommandOutput, 
          KMSClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: CancelKeyDeletionCommandInput) = this()
    
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
    ): Handler[CancelKeyDeletionCommandInput, CancelKeyDeletionCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: KMSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[CancelKeyDeletionCommandInput, CancelKeyDeletionCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object CancelKeyDeletionCommand {
    
    @JSImport("@aws-sdk/client-kms/dist-types/commands/CancelKeyDeletionCommand", "CancelKeyDeletionCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type CancelKeyDeletionCommandInput = CancelKeyDeletionRequest
  
  trait CancelKeyDeletionCommandOutput
    extends StObject
       with CancelKeyDeletionResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object CancelKeyDeletionCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): CancelKeyDeletionCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[CancelKeyDeletionCommandOutput]
    }
  }
}
