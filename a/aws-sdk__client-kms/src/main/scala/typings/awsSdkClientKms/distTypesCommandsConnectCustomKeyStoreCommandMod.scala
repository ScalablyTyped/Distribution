package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesKmsclientMod.KMSClientResolvedConfig
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceInputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceOutputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod._ServiceOutputTypes
import typings.awsSdkClientKms.distTypesModelsModels0Mod.ConnectCustomKeyStoreRequest
import typings.awsSdkClientKms.distTypesModelsModels0Mod.ConnectCustomKeyStoreResponse
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

object distTypesCommandsConnectCustomKeyStoreCommandMod {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands/ConnectCustomKeyStoreCommand", "ConnectCustomKeyStoreCommand")
  @js.native
  open class ConnectCustomKeyStoreCommand protected () extends Command[
          ConnectCustomKeyStoreCommandInput, 
          ConnectCustomKeyStoreCommandOutput, 
          KMSClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: ConnectCustomKeyStoreCommandInput) = this()
    
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
    ): Handler[ConnectCustomKeyStoreCommandInput, ConnectCustomKeyStoreCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: KMSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[ConnectCustomKeyStoreCommandInput, ConnectCustomKeyStoreCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object ConnectCustomKeyStoreCommand {
    
    @JSImport("@aws-sdk/client-kms/dist-types/commands/ConnectCustomKeyStoreCommand", "ConnectCustomKeyStoreCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type ConnectCustomKeyStoreCommandInput = ConnectCustomKeyStoreRequest
  
  trait ConnectCustomKeyStoreCommandOutput
    extends StObject
       with ConnectCustomKeyStoreResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object ConnectCustomKeyStoreCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): ConnectCustomKeyStoreCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectCustomKeyStoreCommandOutput]
    }
  }
}
