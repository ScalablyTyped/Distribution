package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod._ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.models0Mod.GetCredentialsForIdentityInput
import typings.awsSdkClientCognitoIdentity.models0Mod.GetCredentialsForIdentityResponse
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCredentialsForIdentityCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/GetCredentialsForIdentityCommand", "GetCredentialsForIdentityCommand")
  @js.native
  open class GetCredentialsForIdentityCommand protected () extends Command[
          GetCredentialsForIdentityCommandInput, 
          GetCredentialsForIdentityCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: GetCredentialsForIdentityCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[GetCredentialsForIdentityCommandInput, GetCredentialsForIdentityCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[GetCredentialsForIdentityCommandInput, GetCredentialsForIdentityCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  
  type GetCredentialsForIdentityCommandInput = GetCredentialsForIdentityInput
  
  trait GetCredentialsForIdentityCommandOutput
    extends StObject
       with GetCredentialsForIdentityResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object GetCredentialsForIdentityCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): GetCredentialsForIdentityCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCredentialsForIdentityCommandOutput]
    }
  }
}
