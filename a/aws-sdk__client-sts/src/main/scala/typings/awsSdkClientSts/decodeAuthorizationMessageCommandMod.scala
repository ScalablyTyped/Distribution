package typings.awsSdkClientSts

import typings.awsSdkClientSts.models0Mod.DecodeAuthorizationMessageRequest
import typings.awsSdkClientSts.models0Mod.DecodeAuthorizationMessageResponse
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

object decodeAuthorizationMessageCommandMod {
  
  @JSImport("@aws-sdk/client-sts/dist-types/commands/DecodeAuthorizationMessageCommand", "DecodeAuthorizationMessageCommand")
  @js.native
  open class DecodeAuthorizationMessageCommand protected () extends Command[
          DecodeAuthorizationMessageCommandInput, 
          DecodeAuthorizationMessageCommandOutput, 
          STSClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: DecodeAuthorizationMessageCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig
    ): Handler[DecodeAuthorizationMessageCommandInput, DecodeAuthorizationMessageCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[DecodeAuthorizationMessageCommandInput, DecodeAuthorizationMessageCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  
  type DecodeAuthorizationMessageCommandInput = DecodeAuthorizationMessageRequest
  
  trait DecodeAuthorizationMessageCommandOutput
    extends StObject
       with DecodeAuthorizationMessageResponse
       with MetadataBearer
       with ServiceOutputTypes
  object DecodeAuthorizationMessageCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): DecodeAuthorizationMessageCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodeAuthorizationMessageCommandOutput]
    }
  }
}
