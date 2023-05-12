package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesKmsclientMod.KMSClientResolvedConfig
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceInputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceOutputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod._ServiceOutputTypes
import typings.awsSdkClientKms.distTypesModelsModels0Mod.GenerateDataKeyRequest
import typings.awsSdkClientKms.distTypesModelsModels0Mod.GenerateDataKeyResponse
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

object distTypesCommandsGenerateDataKeyCommandMod {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands/GenerateDataKeyCommand", "GenerateDataKeyCommand")
  @js.native
  open class GenerateDataKeyCommand protected () extends Command[
          GenerateDataKeyCommandInput, 
          GenerateDataKeyCommandOutput, 
          KMSClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: GenerateDataKeyCommandInput) = this()
    
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
    ): Handler[GenerateDataKeyCommandInput, GenerateDataKeyCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: KMSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[GenerateDataKeyCommandInput, GenerateDataKeyCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object GenerateDataKeyCommand {
    
    @JSImport("@aws-sdk/client-kms/dist-types/commands/GenerateDataKeyCommand", "GenerateDataKeyCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type GenerateDataKeyCommandInput = GenerateDataKeyRequest
  
  trait GenerateDataKeyCommandOutput
    extends StObject
       with GenerateDataKeyResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object GenerateDataKeyCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): GenerateDataKeyCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateDataKeyCommandOutput]
    }
  }
}
