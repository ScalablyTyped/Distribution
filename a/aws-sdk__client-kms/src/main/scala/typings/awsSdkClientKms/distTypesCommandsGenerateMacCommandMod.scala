package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesKmsclientMod.KMSClientResolvedConfig
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceInputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceOutputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod._ServiceOutputTypes
import typings.awsSdkClientKms.distTypesModelsModels0Mod.GenerateMacRequest
import typings.awsSdkClientKms.distTypesModelsModels0Mod.GenerateMacResponse
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

object distTypesCommandsGenerateMacCommandMod {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands/GenerateMacCommand", "GenerateMacCommand")
  @js.native
  open class GenerateMacCommand protected () extends Command[GenerateMacCommandInput, GenerateMacCommandOutput, KMSClientResolvedConfig, Any, Any] {
    /**
      * @public
      */
    def this(input: GenerateMacCommandInput) = this()
    
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
    ): Handler[GenerateMacCommandInput, GenerateMacCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: KMSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[GenerateMacCommandInput, GenerateMacCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object GenerateMacCommand {
    
    @JSImport("@aws-sdk/client-kms/dist-types/commands/GenerateMacCommand", "GenerateMacCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type GenerateMacCommandInput = GenerateMacRequest
  
  trait GenerateMacCommandOutput
    extends StObject
       with GenerateMacResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object GenerateMacCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): GenerateMacCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateMacCommandOutput]
    }
  }
}
