package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesKmsclientMod.KMSClientResolvedConfig
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceInputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceOutputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod._ServiceOutputTypes
import typings.awsSdkClientKms.distTypesModelsModels0Mod.DecryptRequest
import typings.awsSdkClientKms.distTypesModelsModels0Mod.DecryptResponse
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

object distTypesCommandsDecryptCommandMod {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands/DecryptCommand", "DecryptCommand")
  @js.native
  open class DecryptCommand protected () extends Command[DecryptCommandInput, DecryptCommandOutput, KMSClientResolvedConfig, Any, Any] {
    /**
      * @public
      */
    def this(input: DecryptCommandInput) = this()
    
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
    ): Handler[DecryptCommandInput, DecryptCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: KMSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[DecryptCommandInput, DecryptCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object DecryptCommand {
    
    @JSImport("@aws-sdk/client-kms/dist-types/commands/DecryptCommand", "DecryptCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type DecryptCommandInput = DecryptRequest
  
  trait DecryptCommandOutput
    extends StObject
       with DecryptResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object DecryptCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): DecryptCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecryptCommandOutput]
    }
  }
}
