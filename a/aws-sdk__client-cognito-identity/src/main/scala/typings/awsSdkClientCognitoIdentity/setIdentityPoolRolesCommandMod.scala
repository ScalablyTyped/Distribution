package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.models0Mod.SetIdentityPoolRolesInput
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setIdentityPoolRolesCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/SetIdentityPoolRolesCommand", "SetIdentityPoolRolesCommand")
  @js.native
  open class SetIdentityPoolRolesCommand protected () extends Command[
          SetIdentityPoolRolesCommandInput, 
          SetIdentityPoolRolesCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: SetIdentityPoolRolesCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[SetIdentityPoolRolesCommandInput, SetIdentityPoolRolesCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[SetIdentityPoolRolesCommandInput, SetIdentityPoolRolesCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  
  type SetIdentityPoolRolesCommandInput = SetIdentityPoolRolesInput
  
  type SetIdentityPoolRolesCommandOutput = MetadataBearer
}
