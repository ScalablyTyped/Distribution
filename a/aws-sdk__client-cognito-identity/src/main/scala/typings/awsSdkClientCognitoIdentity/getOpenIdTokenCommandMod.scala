package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.models0Mod.GetOpenIdTokenInput
import typings.awsSdkClientCognitoIdentity.models0Mod.GetOpenIdTokenResponse
import typings.awsSdkSmithyClient.commandMod.Command
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/types/commands/GetOpenIdTokenCommand", JSImport.Namespace)
@js.native
object getOpenIdTokenCommandMod extends js.Object {
  
  @js.native
  class GetOpenIdTokenCommand protected ()
    extends Command[
          GetOpenIdTokenCommandInput, 
          GetOpenIdTokenCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: GetOpenIdTokenCommandInput) = this()
    
    var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[GetOpenIdTokenCommandInput, GetOpenIdTokenCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[GetOpenIdTokenCommandInput, GetOpenIdTokenCommandOutput] = js.native
    
    var serialize: js.Any = js.native
  }
  
  type GetOpenIdTokenCommandInput = GetOpenIdTokenInput
  
  type GetOpenIdTokenCommandOutput = GetOpenIdTokenResponse with MetadataBearer
}
