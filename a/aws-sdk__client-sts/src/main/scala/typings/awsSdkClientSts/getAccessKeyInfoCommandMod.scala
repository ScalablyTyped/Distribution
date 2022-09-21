package typings.awsSdkClientSts

import typings.awsSdkClientSts.models0Mod.GetAccessKeyInfoRequest
import typings.awsSdkClientSts.models0Mod.GetAccessKeyInfoResponse
import typings.awsSdkClientSts.stsclientMod.STSClientResolvedConfig
import typings.awsSdkClientSts.stsclientMod.ServiceInputTypes
import typings.awsSdkClientSts.stsclientMod.ServiceOutputTypes
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAccessKeyInfoCommandMod {
  
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
