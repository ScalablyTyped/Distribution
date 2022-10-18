package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod._ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.GetOpenIdTokenInput
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.GetOpenIdTokenResponse
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommandsGetOpenIdTokenCommandMod {
  
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
