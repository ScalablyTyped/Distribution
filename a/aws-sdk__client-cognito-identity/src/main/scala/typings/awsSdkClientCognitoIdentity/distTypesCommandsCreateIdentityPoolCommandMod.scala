package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod._ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.CreateIdentityPoolInput
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.IdentityPool
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

object distTypesCommandsCreateIdentityPoolCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/CreateIdentityPoolCommand", "CreateIdentityPoolCommand")
  @js.native
  open class CreateIdentityPoolCommand protected () extends Command[
          CreateIdentityPoolCommandInput, 
          CreateIdentityPoolCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: CreateIdentityPoolCommandInput) = this()
    
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
    ): Handler[CreateIdentityPoolCommandInput, CreateIdentityPoolCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[CreateIdentityPoolCommandInput, CreateIdentityPoolCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object CreateIdentityPoolCommand {
    
    @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/CreateIdentityPoolCommand", "CreateIdentityPoolCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type CreateIdentityPoolCommandInput = CreateIdentityPoolInput
  
  trait CreateIdentityPoolCommandOutput
    extends StObject
       with IdentityPool
       with MetadataBearer
       with _ServiceOutputTypes
  object CreateIdentityPoolCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): CreateIdentityPoolCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateIdentityPoolCommandOutput]
    }
  }
}
