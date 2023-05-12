package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesKmsclientMod.KMSClientResolvedConfig
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceInputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceOutputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod._ServiceOutputTypes
import typings.awsSdkClientKms.distTypesModelsModels0Mod.DeleteCustomKeyStoreRequest
import typings.awsSdkClientKms.distTypesModelsModels0Mod.DeleteCustomKeyStoreResponse
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

object distTypesCommandsDeleteCustomKeyStoreCommandMod {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands/DeleteCustomKeyStoreCommand", "DeleteCustomKeyStoreCommand")
  @js.native
  open class DeleteCustomKeyStoreCommand protected () extends Command[
          DeleteCustomKeyStoreCommandInput, 
          DeleteCustomKeyStoreCommandOutput, 
          KMSClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: DeleteCustomKeyStoreCommandInput) = this()
    
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
    ): Handler[DeleteCustomKeyStoreCommandInput, DeleteCustomKeyStoreCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: KMSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[DeleteCustomKeyStoreCommandInput, DeleteCustomKeyStoreCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object DeleteCustomKeyStoreCommand {
    
    @JSImport("@aws-sdk/client-kms/dist-types/commands/DeleteCustomKeyStoreCommand", "DeleteCustomKeyStoreCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type DeleteCustomKeyStoreCommandInput = DeleteCustomKeyStoreRequest
  
  trait DeleteCustomKeyStoreCommandOutput
    extends StObject
       with DeleteCustomKeyStoreResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object DeleteCustomKeyStoreCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): DeleteCustomKeyStoreCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteCustomKeyStoreCommandOutput]
    }
  }
}
