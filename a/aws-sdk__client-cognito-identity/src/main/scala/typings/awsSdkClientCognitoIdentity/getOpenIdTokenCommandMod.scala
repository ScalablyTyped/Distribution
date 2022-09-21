package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod._ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.models0Mod.GetOpenIdTokenInput
import typings.awsSdkClientCognitoIdentity.models0Mod.GetOpenIdTokenResponse
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOpenIdTokenCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/GetOpenIdTokenCommand", "GetOpenIdTokenCommand")
  @js.native
  open class GetOpenIdTokenCommand protected () extends Command[
          GetOpenIdTokenCommandInput, 
          GetOpenIdTokenCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: GetOpenIdTokenCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[GetOpenIdTokenCommandInput, GetOpenIdTokenCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[GetOpenIdTokenCommandInput, GetOpenIdTokenCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  
  type GetOpenIdTokenCommandInput = GetOpenIdTokenInput
  
  trait GetOpenIdTokenCommandOutput
    extends StObject
       with GetOpenIdTokenResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object GetOpenIdTokenCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): GetOpenIdTokenCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOpenIdTokenCommandOutput]
    }
  }
}
