package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod._ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.models0Mod.GetPrincipalTagAttributeMapInput
import typings.awsSdkClientCognitoIdentity.models0Mod.GetPrincipalTagAttributeMapResponse
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPrincipalTagAttributeMapCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/GetPrincipalTagAttributeMapCommand", "GetPrincipalTagAttributeMapCommand")
  @js.native
  open class GetPrincipalTagAttributeMapCommand protected () extends Command[
          GetPrincipalTagAttributeMapCommandInput, 
          GetPrincipalTagAttributeMapCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: GetPrincipalTagAttributeMapCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[GetPrincipalTagAttributeMapCommandInput, GetPrincipalTagAttributeMapCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[GetPrincipalTagAttributeMapCommandInput, GetPrincipalTagAttributeMapCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  
  type GetPrincipalTagAttributeMapCommandInput = GetPrincipalTagAttributeMapInput
  
  trait GetPrincipalTagAttributeMapCommandOutput
    extends StObject
       with GetPrincipalTagAttributeMapResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object GetPrincipalTagAttributeMapCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): GetPrincipalTagAttributeMapCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPrincipalTagAttributeMapCommandOutput]
    }
  }
}
