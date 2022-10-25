package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod._ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.SetPrincipalTagAttributeMapInput
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.SetPrincipalTagAttributeMapResponse
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

object distTypesCommandsSetPrincipalTagAttributeMapCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/SetPrincipalTagAttributeMapCommand", "SetPrincipalTagAttributeMapCommand")
  @js.native
  open class SetPrincipalTagAttributeMapCommand protected () extends Command[
          SetPrincipalTagAttributeMapCommandInput, 
          SetPrincipalTagAttributeMapCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: SetPrincipalTagAttributeMapCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[SetPrincipalTagAttributeMapCommandInput, SetPrincipalTagAttributeMapCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[SetPrincipalTagAttributeMapCommandInput, SetPrincipalTagAttributeMapCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object SetPrincipalTagAttributeMapCommand {
    
    @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/SetPrincipalTagAttributeMapCommand", "SetPrincipalTagAttributeMapCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type SetPrincipalTagAttributeMapCommandInput = SetPrincipalTagAttributeMapInput
  
  trait SetPrincipalTagAttributeMapCommandOutput
    extends StObject
       with SetPrincipalTagAttributeMapResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object SetPrincipalTagAttributeMapCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): SetPrincipalTagAttributeMapCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetPrincipalTagAttributeMapCommandOutput]
    }
  }
}
