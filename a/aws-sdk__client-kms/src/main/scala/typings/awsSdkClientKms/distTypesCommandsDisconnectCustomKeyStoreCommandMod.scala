package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesKmsclientMod.KMSClientResolvedConfig
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceInputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceOutputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod._ServiceOutputTypes
import typings.awsSdkClientKms.distTypesModelsModels0Mod.DisconnectCustomKeyStoreRequest
import typings.awsSdkClientKms.distTypesModelsModels0Mod.DisconnectCustomKeyStoreResponse
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

object distTypesCommandsDisconnectCustomKeyStoreCommandMod {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands/DisconnectCustomKeyStoreCommand", "DisconnectCustomKeyStoreCommand")
  @js.native
  open class DisconnectCustomKeyStoreCommand protected () extends Command[
          DisconnectCustomKeyStoreCommandInput, 
          DisconnectCustomKeyStoreCommandOutput, 
          KMSClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: DisconnectCustomKeyStoreCommandInput) = this()
    
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
    ): Handler[DisconnectCustomKeyStoreCommandInput, DisconnectCustomKeyStoreCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: KMSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[DisconnectCustomKeyStoreCommandInput, DisconnectCustomKeyStoreCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object DisconnectCustomKeyStoreCommand {
    
    @JSImport("@aws-sdk/client-kms/dist-types/commands/DisconnectCustomKeyStoreCommand", "DisconnectCustomKeyStoreCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type DisconnectCustomKeyStoreCommandInput = DisconnectCustomKeyStoreRequest
  
  trait DisconnectCustomKeyStoreCommandOutput
    extends StObject
       with DisconnectCustomKeyStoreResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object DisconnectCustomKeyStoreCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): DisconnectCustomKeyStoreCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisconnectCustomKeyStoreCommandOutput]
    }
  }
}
