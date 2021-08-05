package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod._ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.models0Mod.CreateIdentityPoolInput
import typings.awsSdkClientCognitoIdentity.models0Mod.IdentityPool
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createIdentityPoolCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/types/commands/CreateIdentityPoolCommand", "CreateIdentityPoolCommand")
  @js.native
  class CreateIdentityPoolCommand protected ()
    extends Command[
          CreateIdentityPoolCommandInput, 
          CreateIdentityPoolCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: CreateIdentityPoolCommandInput) = this()
    
    /* private */ var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[CreateIdentityPoolCommandInput, CreateIdentityPoolCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[CreateIdentityPoolCommandInput, CreateIdentityPoolCommandOutput] = js.native
    
    /* private */ var serialize: js.Any = js.native
  }
  
  type CreateIdentityPoolCommandInput = CreateIdentityPoolInput
  
  trait CreateIdentityPoolCommandOutput
    extends StObject
       with IdentityPool
       with MetadataBearer
       with _ServiceOutputTypes
  object CreateIdentityPoolCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): CreateIdentityPoolCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateIdentityPoolCommandOutput]
    }
  }
}
