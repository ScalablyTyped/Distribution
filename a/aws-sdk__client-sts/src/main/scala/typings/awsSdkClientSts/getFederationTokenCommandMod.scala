package typings.awsSdkClientSts

import typings.awsSdkClientSts.models0Mod.GetFederationTokenRequest
import typings.awsSdkClientSts.models0Mod.GetFederationTokenResponse
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

object getFederationTokenCommandMod {
  
  @JSImport("@aws-sdk/client-sts/dist-types/commands/GetFederationTokenCommand", "GetFederationTokenCommand")
  @js.native
  open class GetFederationTokenCommand protected () extends Command[
          GetFederationTokenCommandInput, 
          GetFederationTokenCommandOutput, 
          STSClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: GetFederationTokenCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig
    ): Handler[GetFederationTokenCommandInput, GetFederationTokenCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[GetFederationTokenCommandInput, GetFederationTokenCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  
  type GetFederationTokenCommandInput = GetFederationTokenRequest
  
  trait GetFederationTokenCommandOutput
    extends StObject
       with GetFederationTokenResponse
       with MetadataBearer
       with ServiceOutputTypes
  object GetFederationTokenCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): GetFederationTokenCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetFederationTokenCommandOutput]
    }
  }
}
