package typings.awsSdkClientSts

import typings.awsSdkClientSts.models0Mod.GetSessionTokenRequest
import typings.awsSdkClientSts.models0Mod.GetSessionTokenResponse
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

object getSessionTokenCommandMod {
  
  @JSImport("@aws-sdk/client-sts/dist-types/commands/GetSessionTokenCommand", "GetSessionTokenCommand")
  @js.native
  open class GetSessionTokenCommand protected () extends Command[
          GetSessionTokenCommandInput, 
          GetSessionTokenCommandOutput, 
          STSClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: GetSessionTokenCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig
    ): Handler[GetSessionTokenCommandInput, GetSessionTokenCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[GetSessionTokenCommandInput, GetSessionTokenCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  
  type GetSessionTokenCommandInput = GetSessionTokenRequest
  
  trait GetSessionTokenCommandOutput
    extends StObject
       with GetSessionTokenResponse
       with MetadataBearer
       with ServiceOutputTypes
  object GetSessionTokenCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): GetSessionTokenCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSessionTokenCommandOutput]
    }
  }
}
