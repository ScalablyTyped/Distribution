package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.models0Mod.GetIdentityPoolRolesInput
import typings.awsSdkClientCognitoIdentity.models0Mod.GetIdentityPoolRolesResponse
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getIdentityPoolRolesCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/types/commands/GetIdentityPoolRolesCommand", "GetIdentityPoolRolesCommand")
  @js.native
  class GetIdentityPoolRolesCommand protected ()
    extends Command[
          GetIdentityPoolRolesCommandInput, 
          GetIdentityPoolRolesCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: GetIdentityPoolRolesCommandInput) = this()
    
    var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[GetIdentityPoolRolesCommandInput, GetIdentityPoolRolesCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[GetIdentityPoolRolesCommandInput, GetIdentityPoolRolesCommandOutput] = js.native
    
    var serialize: js.Any = js.native
  }
  
  type GetIdentityPoolRolesCommandInput = GetIdentityPoolRolesInput
  
  type GetIdentityPoolRolesCommandOutput = GetIdentityPoolRolesResponse with MetadataBearer
}
