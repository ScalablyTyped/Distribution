package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod._ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.GetPrincipalTagAttributeMapInput
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.GetPrincipalTagAttributeMapResponse
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

object distTypesCommandsGetPrincipalTagAttributeMapCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/GetPrincipalTagAttributeMapCommand", "GetPrincipalTagAttributeMapCommand")
  @js.native
  open class GetPrincipalTagAttributeMapCommand protected () extends Command[
          GetPrincipalTagAttributeMapCommandInput, 
          GetPrincipalTagAttributeMapCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: GetPrincipalTagAttributeMapCommandInput) = this()
    
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
    ): Handler[GetPrincipalTagAttributeMapCommandInput, GetPrincipalTagAttributeMapCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[GetPrincipalTagAttributeMapCommandInput, GetPrincipalTagAttributeMapCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object GetPrincipalTagAttributeMapCommand {
    
    @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/GetPrincipalTagAttributeMapCommand", "GetPrincipalTagAttributeMapCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type GetPrincipalTagAttributeMapCommandInput = GetPrincipalTagAttributeMapInput
  
  trait GetPrincipalTagAttributeMapCommandOutput
    extends StObject
       with GetPrincipalTagAttributeMapResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object GetPrincipalTagAttributeMapCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): GetPrincipalTagAttributeMapCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPrincipalTagAttributeMapCommandOutput]
    }
  }
}
