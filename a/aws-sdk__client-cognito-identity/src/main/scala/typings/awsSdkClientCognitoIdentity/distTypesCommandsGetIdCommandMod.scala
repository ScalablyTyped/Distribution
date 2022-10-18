package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod._ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.GetIdInput
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.GetIdResponse
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommandsGetIdCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/GetIdCommand", "GetIdCommand")
  @js.native
  open class GetIdCommand protected () extends Command[GetIdCommandInput, GetIdCommandOutput, CognitoIdentityClientResolvedConfig, Any, Any] {
    def this(input: GetIdCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[GetIdCommandInput, GetIdCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[GetIdCommandInput, GetIdCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  
  type GetIdCommandInput = GetIdInput
  
  trait GetIdCommandOutput
    extends StObject
       with GetIdResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object GetIdCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): GetIdCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetIdCommandOutput]
    }
  }
}
