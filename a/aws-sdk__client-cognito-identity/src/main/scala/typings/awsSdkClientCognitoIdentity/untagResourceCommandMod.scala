package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod._ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.models0Mod.UntagResourceInput
import typings.awsSdkClientCognitoIdentity.models0Mod.UntagResourceResponse
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object untagResourceCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/types/commands/UntagResourceCommand", "UntagResourceCommand")
  @js.native
  class UntagResourceCommand protected ()
    extends Command[
          UntagResourceCommandInput, 
          UntagResourceCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: UntagResourceCommandInput) = this()
    
    var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[UntagResourceCommandInput, UntagResourceCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[UntagResourceCommandInput, UntagResourceCommandOutput] = js.native
    
    var serialize: js.Any = js.native
  }
  
  type UntagResourceCommandInput = UntagResourceInput
  
  trait UntagResourceCommandOutput
    extends StObject
       with UntagResourceResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object UntagResourceCommandOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): UntagResourceCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[UntagResourceCommandOutput]
    }
  }
}
