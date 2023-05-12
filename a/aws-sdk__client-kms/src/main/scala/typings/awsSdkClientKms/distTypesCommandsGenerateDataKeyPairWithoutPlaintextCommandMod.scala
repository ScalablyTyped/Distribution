package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesKmsclientMod.KMSClientResolvedConfig
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceInputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceOutputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod._ServiceOutputTypes
import typings.awsSdkClientKms.distTypesModelsModels0Mod.GenerateDataKeyPairWithoutPlaintextRequest
import typings.awsSdkClientKms.distTypesModelsModels0Mod.GenerateDataKeyPairWithoutPlaintextResponse
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

object distTypesCommandsGenerateDataKeyPairWithoutPlaintextCommandMod {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands/GenerateDataKeyPairWithoutPlaintextCommand", "GenerateDataKeyPairWithoutPlaintextCommand")
  @js.native
  open class GenerateDataKeyPairWithoutPlaintextCommand protected () extends Command[
          GenerateDataKeyPairWithoutPlaintextCommandInput, 
          GenerateDataKeyPairWithoutPlaintextCommandOutput, 
          KMSClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: GenerateDataKeyPairWithoutPlaintextCommandInput) = this()
    
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
        GenerateDataKeyPairWithoutPlaintextCommandInput, 
        GenerateDataKeyPairWithoutPlaintextCommandOutput
      ] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: KMSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[
        GenerateDataKeyPairWithoutPlaintextCommandInput, 
        GenerateDataKeyPairWithoutPlaintextCommandOutput
      ] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object GenerateDataKeyPairWithoutPlaintextCommand {
    
    @JSImport("@aws-sdk/client-kms/dist-types/commands/GenerateDataKeyPairWithoutPlaintextCommand", "GenerateDataKeyPairWithoutPlaintextCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type GenerateDataKeyPairWithoutPlaintextCommandInput = GenerateDataKeyPairWithoutPlaintextRequest
  
  trait GenerateDataKeyPairWithoutPlaintextCommandOutput
    extends StObject
       with GenerateDataKeyPairWithoutPlaintextResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object GenerateDataKeyPairWithoutPlaintextCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): GenerateDataKeyPairWithoutPlaintextCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateDataKeyPairWithoutPlaintextCommandOutput]
    }
  }
}
