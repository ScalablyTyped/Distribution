package typings.awsSdkClientSts

import typings.awsSdkClientSts.models0Mod.GetCallerIdentityRequest
import typings.awsSdkClientSts.models0Mod.GetCallerIdentityResponse
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

object getCallerIdentityCommandMod {
  
  @JSImport("@aws-sdk/client-sts/dist-types/commands/GetCallerIdentityCommand", "GetCallerIdentityCommand")
  @js.native
  open class GetCallerIdentityCommand protected () extends Command[
          GetCallerIdentityCommandInput, 
          GetCallerIdentityCommandOutput, 
          STSClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: GetCallerIdentityCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig
    ): Handler[GetCallerIdentityCommandInput, GetCallerIdentityCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[GetCallerIdentityCommandInput, GetCallerIdentityCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  
  type GetCallerIdentityCommandInput = GetCallerIdentityRequest
  
  trait GetCallerIdentityCommandOutput
    extends StObject
       with GetCallerIdentityResponse
       with MetadataBearer
       with ServiceOutputTypes
  object GetCallerIdentityCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): GetCallerIdentityCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCallerIdentityCommandOutput]
    }
  }
}
