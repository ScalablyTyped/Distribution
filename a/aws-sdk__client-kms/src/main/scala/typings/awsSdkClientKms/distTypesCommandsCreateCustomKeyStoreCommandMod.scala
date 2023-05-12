package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesKmsclientMod.KMSClientResolvedConfig
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceInputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceOutputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod._ServiceOutputTypes
import typings.awsSdkClientKms.distTypesModelsModels0Mod.CreateCustomKeyStoreRequest
import typings.awsSdkClientKms.distTypesModelsModels0Mod.CreateCustomKeyStoreResponse
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

object distTypesCommandsCreateCustomKeyStoreCommandMod {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands/CreateCustomKeyStoreCommand", "CreateCustomKeyStoreCommand")
  @js.native
  open class CreateCustomKeyStoreCommand protected () extends Command[
          CreateCustomKeyStoreCommandInput, 
          CreateCustomKeyStoreCommandOutput, 
          KMSClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: CreateCustomKeyStoreCommandInput) = this()
    
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
    ): Handler[CreateCustomKeyStoreCommandInput, CreateCustomKeyStoreCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: KMSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[CreateCustomKeyStoreCommandInput, CreateCustomKeyStoreCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object CreateCustomKeyStoreCommand {
    
    @JSImport("@aws-sdk/client-kms/dist-types/commands/CreateCustomKeyStoreCommand", "CreateCustomKeyStoreCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type CreateCustomKeyStoreCommandInput = CreateCustomKeyStoreRequest
  
  trait CreateCustomKeyStoreCommandOutput
    extends StObject
       with CreateCustomKeyStoreResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object CreateCustomKeyStoreCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): CreateCustomKeyStoreCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateCustomKeyStoreCommandOutput]
    }
  }
}
