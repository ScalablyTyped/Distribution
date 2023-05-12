package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesKmsclientMod.KMSClientResolvedConfig
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceInputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceOutputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod._ServiceOutputTypes
import typings.awsSdkClientKms.distTypesModelsModels0Mod.UpdateCustomKeyStoreRequest
import typings.awsSdkClientKms.distTypesModelsModels0Mod.UpdateCustomKeyStoreResponse
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

object distTypesCommandsUpdateCustomKeyStoreCommandMod {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands/UpdateCustomKeyStoreCommand", "UpdateCustomKeyStoreCommand")
  @js.native
  open class UpdateCustomKeyStoreCommand protected () extends Command[
          UpdateCustomKeyStoreCommandInput, 
          UpdateCustomKeyStoreCommandOutput, 
          KMSClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: UpdateCustomKeyStoreCommandInput) = this()
    
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
    ): Handler[UpdateCustomKeyStoreCommandInput, UpdateCustomKeyStoreCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: KMSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[UpdateCustomKeyStoreCommandInput, UpdateCustomKeyStoreCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object UpdateCustomKeyStoreCommand {
    
    @JSImport("@aws-sdk/client-kms/dist-types/commands/UpdateCustomKeyStoreCommand", "UpdateCustomKeyStoreCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type UpdateCustomKeyStoreCommandInput = UpdateCustomKeyStoreRequest
  
  trait UpdateCustomKeyStoreCommandOutput
    extends StObject
       with UpdateCustomKeyStoreResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object UpdateCustomKeyStoreCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): UpdateCustomKeyStoreCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateCustomKeyStoreCommandOutput]
    }
  }
}
