package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.models0Mod.GetOpenIdTokenForDeveloperIdentityInput
import typings.awsSdkClientCognitoIdentity.models0Mod.GetOpenIdTokenForDeveloperIdentityResponse
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOpenIdTokenForDeveloperIdentityCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/types/commands/GetOpenIdTokenForDeveloperIdentityCommand", "GetOpenIdTokenForDeveloperIdentityCommand")
  @js.native
  class GetOpenIdTokenForDeveloperIdentityCommand protected ()
    extends Command[
          GetOpenIdTokenForDeveloperIdentityCommandInput, 
          GetOpenIdTokenForDeveloperIdentityCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: GetOpenIdTokenForDeveloperIdentityCommandInput) = this()
    
    var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[
        GetOpenIdTokenForDeveloperIdentityCommandInput, 
        GetOpenIdTokenForDeveloperIdentityCommandOutput
      ] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[
        GetOpenIdTokenForDeveloperIdentityCommandInput, 
        GetOpenIdTokenForDeveloperIdentityCommandOutput
      ] = js.native
    
    var serialize: js.Any = js.native
  }
  
  type GetOpenIdTokenForDeveloperIdentityCommandInput = GetOpenIdTokenForDeveloperIdentityInput
  
  type GetOpenIdTokenForDeveloperIdentityCommandOutput = GetOpenIdTokenForDeveloperIdentityResponse with MetadataBearer
}
