package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.models0Mod.ListTagsForResourceInput
import typings.awsSdkClientCognitoIdentity.models0Mod.ListTagsForResourceResponse
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listTagsForResourceCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/types/commands/ListTagsForResourceCommand", "ListTagsForResourceCommand")
  @js.native
  class ListTagsForResourceCommand protected ()
    extends Command[
          ListTagsForResourceCommandInput, 
          ListTagsForResourceCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: ListTagsForResourceCommandInput) = this()
    
    var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[ListTagsForResourceCommandInput, ListTagsForResourceCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[ListTagsForResourceCommandInput, ListTagsForResourceCommandOutput] = js.native
    
    var serialize: js.Any = js.native
  }
  
  type ListTagsForResourceCommandInput = ListTagsForResourceInput
  
  type ListTagsForResourceCommandOutput = ListTagsForResourceResponse with MetadataBearer
}
