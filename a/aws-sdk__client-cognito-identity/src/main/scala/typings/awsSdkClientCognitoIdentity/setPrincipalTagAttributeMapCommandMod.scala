package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod._ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.models0Mod.SetPrincipalTagAttributeMapInput
import typings.awsSdkClientCognitoIdentity.models0Mod.SetPrincipalTagAttributeMapResponse
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setPrincipalTagAttributeMapCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/SetPrincipalTagAttributeMapCommand", "SetPrincipalTagAttributeMapCommand")
  @js.native
  open class SetPrincipalTagAttributeMapCommand protected () extends Command[
          SetPrincipalTagAttributeMapCommandInput, 
          SetPrincipalTagAttributeMapCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: SetPrincipalTagAttributeMapCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[SetPrincipalTagAttributeMapCommandInput, SetPrincipalTagAttributeMapCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[SetPrincipalTagAttributeMapCommandInput, SetPrincipalTagAttributeMapCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  
  type SetPrincipalTagAttributeMapCommandInput = SetPrincipalTagAttributeMapInput
  
  trait SetPrincipalTagAttributeMapCommandOutput
    extends StObject
       with SetPrincipalTagAttributeMapResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object SetPrincipalTagAttributeMapCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): SetPrincipalTagAttributeMapCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetPrincipalTagAttributeMapCommandOutput]
    }
  }
}
