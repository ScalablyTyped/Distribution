package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.UnlinkDeveloperIdentityInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommandsUnlinkDeveloperIdentityCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/UnlinkDeveloperIdentityCommand", "UnlinkDeveloperIdentityCommand")
  @js.native
  open class UnlinkDeveloperIdentityCommand protected () extends Command[
          UnlinkDeveloperIdentityCommandInput, 
          UnlinkDeveloperIdentityCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: UnlinkDeveloperIdentityCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[UnlinkDeveloperIdentityCommandInput, UnlinkDeveloperIdentityCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[UnlinkDeveloperIdentityCommandInput, UnlinkDeveloperIdentityCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object UnlinkDeveloperIdentityCommand {
    
    @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/UnlinkDeveloperIdentityCommand", "UnlinkDeveloperIdentityCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type UnlinkDeveloperIdentityCommandInput = UnlinkDeveloperIdentityInput
  
  type UnlinkDeveloperIdentityCommandOutput = MetadataBearer
}
