package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.models0Mod.GetCredentialsForIdentityInput
import typings.awsSdkClientCognitoIdentity.models0Mod.GetCredentialsForIdentityResponse
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCredentialsForIdentityCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/types/commands/GetCredentialsForIdentityCommand", "GetCredentialsForIdentityCommand")
  @js.native
  class GetCredentialsForIdentityCommand protected ()
    extends Command[
          GetCredentialsForIdentityCommandInput, 
          GetCredentialsForIdentityCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: GetCredentialsForIdentityCommandInput) = this()
    
    var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[GetCredentialsForIdentityCommandInput, GetCredentialsForIdentityCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[GetCredentialsForIdentityCommandInput, GetCredentialsForIdentityCommandOutput] = js.native
    
    var serialize: js.Any = js.native
  }
  
  type GetCredentialsForIdentityCommandInput = GetCredentialsForIdentityInput
  
  type GetCredentialsForIdentityCommandOutput = GetCredentialsForIdentityResponse with MetadataBearer
}
