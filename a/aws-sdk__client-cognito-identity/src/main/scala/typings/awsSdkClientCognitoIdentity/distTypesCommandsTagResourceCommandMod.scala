package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod._ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.TagResourceInput
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.TagResourceResponse
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommandsTagResourceCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/TagResourceCommand", "TagResourceCommand")
  @js.native
  open class TagResourceCommand protected () extends Command[
          TagResourceCommandInput, 
          TagResourceCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: TagResourceCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[TagResourceCommandInput, TagResourceCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[TagResourceCommandInput, TagResourceCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  
  type TagResourceCommandInput = TagResourceInput
  
  trait TagResourceCommandOutput
    extends StObject
       with TagResourceResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object TagResourceCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): TagResourceCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagResourceCommandOutput]
    }
  }
}
