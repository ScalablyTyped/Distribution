package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.models0Mod.UnlinkDeveloperIdentityInput
import typings.awsSdkSmithyClient.commandMod.Command
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/types/commands/UnlinkDeveloperIdentityCommand", JSImport.Namespace)
@js.native
object unlinkDeveloperIdentityCommandMod extends js.Object {
  
  @js.native
  class UnlinkDeveloperIdentityCommand protected ()
    extends Command[
          UnlinkDeveloperIdentityCommandInput, 
          UnlinkDeveloperIdentityCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: UnlinkDeveloperIdentityCommandInput) = this()
    
    var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[UnlinkDeveloperIdentityCommandInput, UnlinkDeveloperIdentityCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[UnlinkDeveloperIdentityCommandInput, UnlinkDeveloperIdentityCommandOutput] = js.native
    
    var serialize: js.Any = js.native
  }
  
  type UnlinkDeveloperIdentityCommandInput = UnlinkDeveloperIdentityInput
  
  type UnlinkDeveloperIdentityCommandOutput = MetadataBearer
}
