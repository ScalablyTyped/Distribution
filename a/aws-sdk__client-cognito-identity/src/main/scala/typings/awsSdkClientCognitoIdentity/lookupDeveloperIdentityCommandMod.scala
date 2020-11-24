package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.models0Mod.LookupDeveloperIdentityInput
import typings.awsSdkClientCognitoIdentity.models0Mod.LookupDeveloperIdentityResponse
import typings.awsSdkSmithyClient.commandMod.Command
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/types/commands/LookupDeveloperIdentityCommand", JSImport.Namespace)
@js.native
object lookupDeveloperIdentityCommandMod extends js.Object {
  
  @js.native
  class LookupDeveloperIdentityCommand protected ()
    extends Command[
          LookupDeveloperIdentityCommandInput, 
          LookupDeveloperIdentityCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: LookupDeveloperIdentityCommandInput) = this()
    
    var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[LookupDeveloperIdentityCommandInput, LookupDeveloperIdentityCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[LookupDeveloperIdentityCommandInput, LookupDeveloperIdentityCommandOutput] = js.native
    
    var serialize: js.Any = js.native
  }
  
  type LookupDeveloperIdentityCommandInput = LookupDeveloperIdentityInput
  
  type LookupDeveloperIdentityCommandOutput = LookupDeveloperIdentityResponse with MetadataBearer
}
