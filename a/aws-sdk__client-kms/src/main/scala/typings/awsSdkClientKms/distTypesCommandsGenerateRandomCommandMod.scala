package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesKmsclientMod.KMSClientResolvedConfig
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceInputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceOutputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod._ServiceOutputTypes
import typings.awsSdkClientKms.distTypesModelsModels0Mod.GenerateRandomRequest
import typings.awsSdkClientKms.distTypesModelsModels0Mod.GenerateRandomResponse
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

object distTypesCommandsGenerateRandomCommandMod {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands/GenerateRandomCommand", "GenerateRandomCommand")
  @js.native
  open class GenerateRandomCommand protected () extends Command[
          GenerateRandomCommandInput, 
          GenerateRandomCommandOutput, 
          KMSClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: GenerateRandomCommandInput) = this()
    
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
    ): Handler[GenerateRandomCommandInput, GenerateRandomCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: KMSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[GenerateRandomCommandInput, GenerateRandomCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object GenerateRandomCommand {
    
    @JSImport("@aws-sdk/client-kms/dist-types/commands/GenerateRandomCommand", "GenerateRandomCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type GenerateRandomCommandInput = GenerateRandomRequest
  
  trait GenerateRandomCommandOutput
    extends StObject
       with GenerateRandomResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object GenerateRandomCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): GenerateRandomCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateRandomCommandOutput]
    }
  }
}
