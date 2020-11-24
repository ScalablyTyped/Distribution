package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.models0Mod.ListIdentityPoolsInput
import typings.awsSdkClientCognitoIdentity.models0Mod.ListIdentityPoolsResponse
import typings.awsSdkSmithyClient.commandMod.Command
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/types/commands/ListIdentityPoolsCommand", JSImport.Namespace)
@js.native
object listIdentityPoolsCommandMod extends js.Object {
  
  @js.native
  class ListIdentityPoolsCommand protected ()
    extends Command[
          ListIdentityPoolsCommandInput, 
          ListIdentityPoolsCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: ListIdentityPoolsCommandInput) = this()
    
    var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[ListIdentityPoolsCommandInput, ListIdentityPoolsCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[ListIdentityPoolsCommandInput, ListIdentityPoolsCommandOutput] = js.native
    
    var serialize: js.Any = js.native
  }
  
  type ListIdentityPoolsCommandInput = ListIdentityPoolsInput
  
  type ListIdentityPoolsCommandOutput = ListIdentityPoolsResponse with MetadataBearer
}
