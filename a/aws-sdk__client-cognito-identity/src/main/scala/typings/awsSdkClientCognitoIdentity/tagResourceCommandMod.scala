package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod._ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.models0Mod.TagResourceInput
import typings.awsSdkClientCognitoIdentity.models0Mod.TagResourceResponse
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagResourceCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/types/commands/TagResourceCommand", "TagResourceCommand")
  @js.native
  class TagResourceCommand protected ()
    extends Command[
          TagResourceCommandInput, 
          TagResourceCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: TagResourceCommandInput) = this()
    
    var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[TagResourceCommandInput, TagResourceCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[TagResourceCommandInput, TagResourceCommandOutput] = js.native
    
    var serialize: js.Any = js.native
  }
  
  type TagResourceCommandInput = TagResourceInput
  
  trait TagResourceCommandOutput
    extends StObject
       with TagResourceResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object TagResourceCommandOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): TagResourceCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagResourceCommandOutput]
    }
  }
}
