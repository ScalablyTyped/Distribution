package typings.awsSdkClientSts

import typings.awsSdkClientSts.distTypesModelsModels0Mod.GetAccessKeyInfoRequest
import typings.awsSdkClientSts.distTypesModelsModels0Mod.GetAccessKeyInfoResponse
import typings.awsSdkClientSts.distTypesStsclientMod.STSClientResolvedConfig
import typings.awsSdkClientSts.distTypesStsclientMod.ServiceInputTypes
import typings.awsSdkClientSts.distTypesStsclientMod.ServiceOutputTypes
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

object distTypesCommandsGetAccessKeyInfoCommandMod {
  
  @JSImport("@aws-sdk/client-sts/dist-types/commands/GetAccessKeyInfoCommand", "GetAccessKeyInfoCommand")
  @js.native
  open class GetAccessKeyInfoCommand protected () extends Command[
          GetAccessKeyInfoCommandInput, 
          GetAccessKeyInfoCommandOutput, 
          STSClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: GetAccessKeyInfoCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig
    ): Handler[GetAccessKeyInfoCommandInput, GetAccessKeyInfoCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[GetAccessKeyInfoCommandInput, GetAccessKeyInfoCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object GetAccessKeyInfoCommand {
    
    @JSImport("@aws-sdk/client-sts/dist-types/commands/GetAccessKeyInfoCommand", "GetAccessKeyInfoCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type GetAccessKeyInfoCommandInput = GetAccessKeyInfoRequest
  
  trait GetAccessKeyInfoCommandOutput
    extends StObject
       with GetAccessKeyInfoResponse
       with MetadataBearer
       with ServiceOutputTypes
  object GetAccessKeyInfoCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): GetAccessKeyInfoCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAccessKeyInfoCommandOutput]
    }
  }
}
