package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesKmsclientMod.KMSClientResolvedConfig
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceInputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceOutputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod._ServiceOutputTypes
import typings.awsSdkClientKms.distTypesModelsModels0Mod.ImportKeyMaterialRequest
import typings.awsSdkClientKms.distTypesModelsModels0Mod.ImportKeyMaterialResponse
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

object distTypesCommandsImportKeyMaterialCommandMod {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands/ImportKeyMaterialCommand", "ImportKeyMaterialCommand")
  @js.native
  open class ImportKeyMaterialCommand protected () extends Command[
          ImportKeyMaterialCommandInput, 
          ImportKeyMaterialCommandOutput, 
          KMSClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: ImportKeyMaterialCommandInput) = this()
    
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
    ): Handler[ImportKeyMaterialCommandInput, ImportKeyMaterialCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: KMSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[ImportKeyMaterialCommandInput, ImportKeyMaterialCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object ImportKeyMaterialCommand {
    
    @JSImport("@aws-sdk/client-kms/dist-types/commands/ImportKeyMaterialCommand", "ImportKeyMaterialCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type ImportKeyMaterialCommandInput = ImportKeyMaterialRequest
  
  trait ImportKeyMaterialCommandOutput
    extends StObject
       with ImportKeyMaterialResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object ImportKeyMaterialCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): ImportKeyMaterialCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImportKeyMaterialCommandOutput]
    }
  }
}
