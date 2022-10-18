package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.SetIdentityPoolRolesInput
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommandsSetIdentityPoolRolesCommandMod {
  
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
