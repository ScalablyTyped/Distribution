package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod._ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.GetCredentialsForIdentityInput
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.GetCredentialsForIdentityResponse
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

object distTypesCommandsGetCredentialsForIdentityCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/GetCredentialsForIdentityCommand", "GetCredentialsForIdentityCommand")
  @js.native
  open class GetCredentialsForIdentityCommand protected () extends Command[
          GetCredentialsForIdentityCommandInput, 
          GetCredentialsForIdentityCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: GetCredentialsForIdentityCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[GetCredentialsForIdentityCommandInput, GetCredentialsForIdentityCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[GetCredentialsForIdentityCommandInput, GetCredentialsForIdentityCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object GetCredentialsForIdentityCommand {
    
    @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/GetCredentialsForIdentityCommand", "GetCredentialsForIdentityCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type GetCredentialsForIdentityCommandInput = GetCredentialsForIdentityInput
  
  trait GetCredentialsForIdentityCommandOutput
    extends StObject
       with GetCredentialsForIdentityResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object GetCredentialsForIdentityCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): GetCredentialsForIdentityCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCredentialsForIdentityCommandOutput]
    }
  }
}
