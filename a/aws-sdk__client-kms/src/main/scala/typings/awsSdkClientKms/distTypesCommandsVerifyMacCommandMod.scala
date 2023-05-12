package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesKmsclientMod.KMSClientResolvedConfig
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceInputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceOutputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod._ServiceOutputTypes
import typings.awsSdkClientKms.distTypesModelsModels0Mod.VerifyMacRequest
import typings.awsSdkClientKms.distTypesModelsModels0Mod.VerifyMacResponse
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

object distTypesCommandsVerifyMacCommandMod {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands/VerifyMacCommand", "VerifyMacCommand")
  @js.native
  open class VerifyMacCommand protected () extends Command[VerifyMacCommandInput, VerifyMacCommandOutput, KMSClientResolvedConfig, Any, Any] {
    /**
      * @public
      */
    def this(input: VerifyMacCommandInput) = this()
    
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
    ): Handler[VerifyMacCommandInput, VerifyMacCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: KMSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[VerifyMacCommandInput, VerifyMacCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object VerifyMacCommand {
    
    @JSImport("@aws-sdk/client-kms/dist-types/commands/VerifyMacCommand", "VerifyMacCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type VerifyMacCommandInput = VerifyMacRequest
  
  trait VerifyMacCommandOutput
    extends StObject
       with VerifyMacResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object VerifyMacCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): VerifyMacCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyMacCommandOutput]
    }
  }
}
