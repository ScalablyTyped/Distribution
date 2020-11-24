package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.models0Mod.MergeDeveloperIdentitiesInput
import typings.awsSdkClientCognitoIdentity.models0Mod.MergeDeveloperIdentitiesResponse
import typings.awsSdkSmithyClient.commandMod.Command
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/types/commands/MergeDeveloperIdentitiesCommand", JSImport.Namespace)
@js.native
object mergeDeveloperIdentitiesCommandMod extends js.Object {
  
  @js.native
  class MergeDeveloperIdentitiesCommand protected ()
    extends Command[
          MergeDeveloperIdentitiesCommandInput, 
          MergeDeveloperIdentitiesCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: MergeDeveloperIdentitiesCommandInput) = this()
    
    var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[MergeDeveloperIdentitiesCommandInput, MergeDeveloperIdentitiesCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[MergeDeveloperIdentitiesCommandInput, MergeDeveloperIdentitiesCommandOutput] = js.native
    
    var serialize: js.Any = js.native
  }
  
  type MergeDeveloperIdentitiesCommandInput = MergeDeveloperIdentitiesInput
  
  type MergeDeveloperIdentitiesCommandOutput = MergeDeveloperIdentitiesResponse with MetadataBearer
}
