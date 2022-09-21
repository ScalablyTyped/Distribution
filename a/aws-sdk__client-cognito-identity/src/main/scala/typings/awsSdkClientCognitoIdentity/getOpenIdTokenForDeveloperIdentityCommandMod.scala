package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod._ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.models0Mod.GetOpenIdTokenForDeveloperIdentityInput
import typings.awsSdkClientCognitoIdentity.models0Mod.GetOpenIdTokenForDeveloperIdentityResponse
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOpenIdTokenForDeveloperIdentityCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/GetOpenIdTokenForDeveloperIdentityCommand", "GetOpenIdTokenForDeveloperIdentityCommand")
  @js.native
  open class GetOpenIdTokenForDeveloperIdentityCommand protected () extends Command[
          GetOpenIdTokenForDeveloperIdentityCommandInput, 
          GetOpenIdTokenForDeveloperIdentityCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: GetOpenIdTokenForDeveloperIdentityCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
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
    
    /* private */ var serialize: Any = js.native
  }
  
  type GetOpenIdTokenForDeveloperIdentityCommandInput = GetOpenIdTokenForDeveloperIdentityInput
  
  trait GetOpenIdTokenForDeveloperIdentityCommandOutput
    extends StObject
       with GetOpenIdTokenForDeveloperIdentityResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object GetOpenIdTokenForDeveloperIdentityCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): GetOpenIdTokenForDeveloperIdentityCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOpenIdTokenForDeveloperIdentityCommandOutput]
    }
  }
}
