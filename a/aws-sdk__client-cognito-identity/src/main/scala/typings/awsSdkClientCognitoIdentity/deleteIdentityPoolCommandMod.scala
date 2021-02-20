package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.models0Mod.DeleteIdentityPoolInput
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteIdentityPoolCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/types/commands/DeleteIdentityPoolCommand", "DeleteIdentityPoolCommand")
  @js.native
  class DeleteIdentityPoolCommand protected ()
    extends Command[
          DeleteIdentityPoolCommandInput, 
          DeleteIdentityPoolCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: DeleteIdentityPoolCommandInput) = this()
    
    var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[DeleteIdentityPoolCommandInput, DeleteIdentityPoolCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[DeleteIdentityPoolCommandInput, DeleteIdentityPoolCommandOutput] = js.native
    
    var serialize: js.Any = js.native
  }
  
  type DeleteIdentityPoolCommandInput = DeleteIdentityPoolInput
  
  type DeleteIdentityPoolCommandOutput = MetadataBearer
}
