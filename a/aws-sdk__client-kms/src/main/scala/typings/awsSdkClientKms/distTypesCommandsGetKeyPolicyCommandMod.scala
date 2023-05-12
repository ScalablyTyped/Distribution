package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesKmsclientMod.KMSClientResolvedConfig
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceInputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod.ServiceOutputTypes
import typings.awsSdkClientKms.distTypesKmsclientMod._ServiceOutputTypes
import typings.awsSdkClientKms.distTypesModelsModels0Mod.GetKeyPolicyRequest
import typings.awsSdkClientKms.distTypesModelsModels0Mod.GetKeyPolicyResponse
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

object distTypesCommandsGetKeyPolicyCommandMod {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands/GetKeyPolicyCommand", "GetKeyPolicyCommand")
  @js.native
  open class GetKeyPolicyCommand protected () extends Command[GetKeyPolicyCommandInput, GetKeyPolicyCommandOutput, KMSClientResolvedConfig, Any, Any] {
    /**
      * @public
      */
    def this(input: GetKeyPolicyCommandInput) = this()
    
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
    ): Handler[GetKeyPolicyCommandInput, GetKeyPolicyCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: KMSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[GetKeyPolicyCommandInput, GetKeyPolicyCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object GetKeyPolicyCommand {
    
    @JSImport("@aws-sdk/client-kms/dist-types/commands/GetKeyPolicyCommand", "GetKeyPolicyCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type GetKeyPolicyCommandInput = GetKeyPolicyRequest
  
  trait GetKeyPolicyCommandOutput
    extends StObject
       with GetKeyPolicyResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object GetKeyPolicyCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): GetKeyPolicyCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetKeyPolicyCommandOutput]
    }
  }
}
