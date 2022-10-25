package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod._ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.LookupDeveloperIdentityInput
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.LookupDeveloperIdentityResponse
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

object distTypesCommandsLookupDeveloperIdentityCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/LookupDeveloperIdentityCommand", "LookupDeveloperIdentityCommand")
  @js.native
  open class LookupDeveloperIdentityCommand protected () extends Command[
          LookupDeveloperIdentityCommandInput, 
          LookupDeveloperIdentityCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: LookupDeveloperIdentityCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[LookupDeveloperIdentityCommandInput, LookupDeveloperIdentityCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[LookupDeveloperIdentityCommandInput, LookupDeveloperIdentityCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object LookupDeveloperIdentityCommand {
    
    @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/LookupDeveloperIdentityCommand", "LookupDeveloperIdentityCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type LookupDeveloperIdentityCommandInput = LookupDeveloperIdentityInput
  
  trait LookupDeveloperIdentityCommandOutput
    extends StObject
       with LookupDeveloperIdentityResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object LookupDeveloperIdentityCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): LookupDeveloperIdentityCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[LookupDeveloperIdentityCommandOutput]
    }
  }
}
