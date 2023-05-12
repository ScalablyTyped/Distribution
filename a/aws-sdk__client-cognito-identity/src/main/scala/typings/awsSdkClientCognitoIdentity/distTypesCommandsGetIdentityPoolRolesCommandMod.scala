package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod._ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.GetIdentityPoolRolesInput
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.GetIdentityPoolRolesResponse
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

object distTypesCommandsGetIdentityPoolRolesCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/GetIdentityPoolRolesCommand", "GetIdentityPoolRolesCommand")
  @js.native
  open class GetIdentityPoolRolesCommand protected () extends Command[
          GetIdentityPoolRolesCommandInput, 
          GetIdentityPoolRolesCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: GetIdentityPoolRolesCommandInput) = this()
    
    /**
      * @internal
      */
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[GetIdentityPoolRolesCommandInput, GetIdentityPoolRolesCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[GetIdentityPoolRolesCommandInput, GetIdentityPoolRolesCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object GetIdentityPoolRolesCommand {
    
    @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/GetIdentityPoolRolesCommand", "GetIdentityPoolRolesCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type GetIdentityPoolRolesCommandInput = GetIdentityPoolRolesInput
  
  trait GetIdentityPoolRolesCommandOutput
    extends StObject
       with GetIdentityPoolRolesResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object GetIdentityPoolRolesCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): GetIdentityPoolRolesCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetIdentityPoolRolesCommandOutput]
    }
  }
}
