package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod._ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.models0Mod.DeleteIdentitiesInput
import typings.awsSdkClientCognitoIdentity.models0Mod.DeleteIdentitiesResponse
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteIdentitiesCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/types/commands/DeleteIdentitiesCommand", "DeleteIdentitiesCommand")
  @js.native
  class DeleteIdentitiesCommand protected ()
    extends Command[
          DeleteIdentitiesCommandInput, 
          DeleteIdentitiesCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: DeleteIdentitiesCommandInput) = this()
    
    var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[DeleteIdentitiesCommandInput, DeleteIdentitiesCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[DeleteIdentitiesCommandInput, DeleteIdentitiesCommandOutput] = js.native
    
    var serialize: js.Any = js.native
  }
  
  type DeleteIdentitiesCommandInput = DeleteIdentitiesInput
  
  trait DeleteIdentitiesCommandOutput
    extends StObject
       with DeleteIdentitiesResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object DeleteIdentitiesCommandOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): DeleteIdentitiesCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteIdentitiesCommandOutput]
    }
  }
}
