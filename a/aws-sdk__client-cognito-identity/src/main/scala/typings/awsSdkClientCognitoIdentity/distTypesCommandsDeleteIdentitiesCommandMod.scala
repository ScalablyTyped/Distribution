package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod._ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.DeleteIdentitiesInput
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.DeleteIdentitiesResponse
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommandsDeleteIdentitiesCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/DeleteIdentitiesCommand", "DeleteIdentitiesCommand")
  @js.native
  open class DeleteIdentitiesCommand protected () extends Command[
          DeleteIdentitiesCommandInput, 
          DeleteIdentitiesCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: DeleteIdentitiesCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[DeleteIdentitiesCommandInput, DeleteIdentitiesCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[DeleteIdentitiesCommandInput, DeleteIdentitiesCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object DeleteIdentitiesCommand {
    
    @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/DeleteIdentitiesCommand", "DeleteIdentitiesCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type DeleteIdentitiesCommandInput = DeleteIdentitiesInput
  
  trait DeleteIdentitiesCommandOutput
    extends StObject
       with DeleteIdentitiesResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object DeleteIdentitiesCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): DeleteIdentitiesCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteIdentitiesCommandOutput]
    }
  }
}
