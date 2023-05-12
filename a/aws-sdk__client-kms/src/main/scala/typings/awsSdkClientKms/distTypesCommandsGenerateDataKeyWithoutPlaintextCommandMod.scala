package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesKmsclientMod.KMSClientResolvedConfig
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceInputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceOutputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod._ServiceOutputTypes
import typings.awsSdkClientKms.distTypesModelsModels0Mod.GenerateDataKeyWithoutPlaintextRequest
import typings.awsSdkClientKms.distTypesModelsModels0Mod.GenerateDataKeyWithoutPlaintextResponse
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

object distTypesCommandsGenerateDataKeyWithoutPlaintextCommandMod {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands/GenerateDataKeyWithoutPlaintextCommand", "GenerateDataKeyWithoutPlaintextCommand")
  @js.native
  open class GenerateDataKeyWithoutPlaintextCommand protected () extends Command[
          GenerateDataKeyWithoutPlaintextCommandInput, 
          GenerateDataKeyWithoutPlaintextCommandOutput, 
          KMSClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: GenerateDataKeyWithoutPlaintextCommandInput) = this()
    
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
    ): Handler[
        GenerateDataKeyWithoutPlaintextCommandInput, 
        GenerateDataKeyWithoutPlaintextCommandOutput
      ] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: KMSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[
        GenerateDataKeyWithoutPlaintextCommandInput, 
        GenerateDataKeyWithoutPlaintextCommandOutput
      ] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object GenerateDataKeyWithoutPlaintextCommand {
    
    @JSImport("@aws-sdk/client-kms/dist-types/commands/GenerateDataKeyWithoutPlaintextCommand", "GenerateDataKeyWithoutPlaintextCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type GenerateDataKeyWithoutPlaintextCommandInput = GenerateDataKeyWithoutPlaintextRequest
  
  trait GenerateDataKeyWithoutPlaintextCommandOutput
    extends StObject
       with GenerateDataKeyWithoutPlaintextResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object GenerateDataKeyWithoutPlaintextCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): GenerateDataKeyWithoutPlaintextCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateDataKeyWithoutPlaintextCommandOutput]
    }
  }
}
