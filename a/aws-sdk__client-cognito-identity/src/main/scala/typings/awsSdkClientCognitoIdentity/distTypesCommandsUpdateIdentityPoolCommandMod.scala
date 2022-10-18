package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod._ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.IdentityPool
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommandsUpdateIdentityPoolCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/UpdateIdentityPoolCommand", "UpdateIdentityPoolCommand")
  @js.native
  open class UpdateIdentityPoolCommand protected () extends Command[
          UpdateIdentityPoolCommandInput, 
          UpdateIdentityPoolCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: UpdateIdentityPoolCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[UpdateIdentityPoolCommandInput, UpdateIdentityPoolCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[UpdateIdentityPoolCommandInput, UpdateIdentityPoolCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  
  type UpdateIdentityPoolCommandInput = IdentityPool
  
  trait UpdateIdentityPoolCommandOutput
    extends StObject
       with IdentityPool
       with MetadataBearer
       with _ServiceOutputTypes
  object UpdateIdentityPoolCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): UpdateIdentityPoolCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateIdentityPoolCommandOutput]
    }
  }
}
