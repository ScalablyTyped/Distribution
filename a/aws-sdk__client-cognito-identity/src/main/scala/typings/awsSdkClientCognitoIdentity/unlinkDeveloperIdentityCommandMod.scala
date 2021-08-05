package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.models0Mod.UnlinkDeveloperIdentityInput
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unlinkDeveloperIdentityCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/types/commands/UnlinkDeveloperIdentityCommand", "UnlinkDeveloperIdentityCommand")
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
    
    /* private */ var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[UnlinkDeveloperIdentityCommandInput, UnlinkDeveloperIdentityCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[UnlinkDeveloperIdentityCommandInput, UnlinkDeveloperIdentityCommandOutput] = js.native
    
    /* private */ var serialize: js.Any = js.native
  }
  
  type UnlinkDeveloperIdentityCommandInput = UnlinkDeveloperIdentityInput
  
  type UnlinkDeveloperIdentityCommandOutput = MetadataBearer
}
