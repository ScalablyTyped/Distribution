package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod._ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.models0Mod.ListIdentityPoolsInput
import typings.awsSdkClientCognitoIdentity.models0Mod.ListIdentityPoolsResponse
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listIdentityPoolsCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/types/commands/ListIdentityPoolsCommand", "ListIdentityPoolsCommand")
  @js.native
  class ListIdentityPoolsCommand protected ()
    extends Command[
          ListIdentityPoolsCommandInput, 
          ListIdentityPoolsCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: ListIdentityPoolsCommandInput) = this()
    
    /* private */ var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[ListIdentityPoolsCommandInput, ListIdentityPoolsCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[ListIdentityPoolsCommandInput, ListIdentityPoolsCommandOutput] = js.native
    
    /* private */ var serialize: js.Any = js.native
  }
  
  type ListIdentityPoolsCommandInput = ListIdentityPoolsInput
  
  trait ListIdentityPoolsCommandOutput
    extends StObject
       with ListIdentityPoolsResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object ListIdentityPoolsCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): ListIdentityPoolsCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListIdentityPoolsCommandOutput]
    }
  }
}
