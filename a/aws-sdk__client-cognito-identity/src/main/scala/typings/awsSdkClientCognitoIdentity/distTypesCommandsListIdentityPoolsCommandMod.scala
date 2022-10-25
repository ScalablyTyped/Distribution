package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod._ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.ListIdentityPoolsInput
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.ListIdentityPoolsResponse
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

object distTypesCommandsListIdentityPoolsCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/ListIdentityPoolsCommand", "ListIdentityPoolsCommand")
  @js.native
  open class ListIdentityPoolsCommand protected () extends Command[
          ListIdentityPoolsCommandInput, 
          ListIdentityPoolsCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: ListIdentityPoolsCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[ListIdentityPoolsCommandInput, ListIdentityPoolsCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[ListIdentityPoolsCommandInput, ListIdentityPoolsCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object ListIdentityPoolsCommand {
    
    @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/ListIdentityPoolsCommand", "ListIdentityPoolsCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type ListIdentityPoolsCommandInput = ListIdentityPoolsInput
  
  trait ListIdentityPoolsCommandOutput
    extends StObject
       with ListIdentityPoolsResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object ListIdentityPoolsCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): ListIdentityPoolsCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListIdentityPoolsCommandOutput]
    }
  }
}
