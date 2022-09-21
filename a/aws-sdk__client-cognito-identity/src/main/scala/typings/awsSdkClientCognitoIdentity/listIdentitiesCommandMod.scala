package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod._ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.models0Mod.ListIdentitiesInput
import typings.awsSdkClientCognitoIdentity.models0Mod.ListIdentitiesResponse
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listIdentitiesCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/ListIdentitiesCommand", "ListIdentitiesCommand")
  @js.native
  open class ListIdentitiesCommand protected () extends Command[
          ListIdentitiesCommandInput, 
          ListIdentitiesCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: ListIdentitiesCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[ListIdentitiesCommandInput, ListIdentitiesCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[ListIdentitiesCommandInput, ListIdentitiesCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  
  type ListIdentitiesCommandInput = ListIdentitiesInput
  
  trait ListIdentitiesCommandOutput
    extends StObject
       with ListIdentitiesResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object ListIdentitiesCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): ListIdentitiesCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListIdentitiesCommandOutput]
    }
  }
}
