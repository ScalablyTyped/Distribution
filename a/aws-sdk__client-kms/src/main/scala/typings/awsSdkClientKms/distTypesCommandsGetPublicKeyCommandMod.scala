package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesKmsclientMod.KMSClientResolvedConfig
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceInputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceOutputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod._ServiceOutputTypes
import typings.awsSdkClientKms.distTypesModelsModels0Mod.GetPublicKeyRequest
import typings.awsSdkClientKms.distTypesModelsModels0Mod.GetPublicKeyResponse
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

object distTypesCommandsGetPublicKeyCommandMod {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands/GetPublicKeyCommand", "GetPublicKeyCommand")
  @js.native
  open class GetPublicKeyCommand protected () extends Command[GetPublicKeyCommandInput, GetPublicKeyCommandOutput, KMSClientResolvedConfig, Any, Any] {
    /**
      * @public
      */
    def this(input: GetPublicKeyCommandInput) = this()
    
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
    ): Handler[GetPublicKeyCommandInput, GetPublicKeyCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: KMSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[GetPublicKeyCommandInput, GetPublicKeyCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object GetPublicKeyCommand {
    
    @JSImport("@aws-sdk/client-kms/dist-types/commands/GetPublicKeyCommand", "GetPublicKeyCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type GetPublicKeyCommandInput = GetPublicKeyRequest
  
  trait GetPublicKeyCommandOutput
    extends StObject
       with GetPublicKeyResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object GetPublicKeyCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): GetPublicKeyCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPublicKeyCommandOutput]
    }
  }
}
