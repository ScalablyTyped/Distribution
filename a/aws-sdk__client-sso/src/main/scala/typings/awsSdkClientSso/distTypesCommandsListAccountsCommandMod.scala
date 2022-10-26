package typings.awsSdkClientSso

import typings.awsSdkClientSso.distTypesModelsModels0Mod.ListAccountsRequest
import typings.awsSdkClientSso.distTypesModelsModels0Mod.ListAccountsResponse
import typings.awsSdkClientSso.distTypesSsoclientMod.SSOClientResolvedConfig
import typings.awsSdkClientSso.distTypesSsoclientMod.ServiceInputTypes
import typings.awsSdkClientSso.distTypesSsoclientMod.ServiceOutputTypes
import typings.awsSdkClientSso.distTypesSsoclientMod._ServiceOutputTypes
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

object distTypesCommandsListAccountsCommandMod {
  
  @JSImport("@aws-sdk/client-sso/dist-types/commands/ListAccountsCommand", "ListAccountsCommand")
  @js.native
  open class ListAccountsCommand protected () extends Command[ListAccountsCommandInput, ListAccountsCommandOutput, SSOClientResolvedConfig, Any, Any] {
    def this(input: ListAccountsCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: SSOClientResolvedConfig
    ): Handler[ListAccountsCommandInput, ListAccountsCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: SSOClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[ListAccountsCommandInput, ListAccountsCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object ListAccountsCommand {
    
    @JSImport("@aws-sdk/client-sso/dist-types/commands/ListAccountsCommand", "ListAccountsCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type ListAccountsCommandInput = ListAccountsRequest
  
  trait ListAccountsCommandOutput
    extends StObject
       with ListAccountsResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object ListAccountsCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): ListAccountsCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListAccountsCommandOutput]
    }
  }
}
