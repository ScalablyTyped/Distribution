package typings.awsSdkClientSso

import typings.awsSdkClientSso.distTypesModelsModels0Mod.ListAccountRolesRequest
import typings.awsSdkClientSso.distTypesModelsModels0Mod.ListAccountRolesResponse
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

object distTypesCommandsListAccountRolesCommandMod {
  
  @JSImport("@aws-sdk/client-sso/dist-types/commands/ListAccountRolesCommand", "ListAccountRolesCommand")
  @js.native
  open class ListAccountRolesCommand protected () extends Command[
          ListAccountRolesCommandInput, 
          ListAccountRolesCommandOutput, 
          SSOClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: ListAccountRolesCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: SSOClientResolvedConfig
    ): Handler[ListAccountRolesCommandInput, ListAccountRolesCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: SSOClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[ListAccountRolesCommandInput, ListAccountRolesCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object ListAccountRolesCommand {
    
    @JSImport("@aws-sdk/client-sso/dist-types/commands/ListAccountRolesCommand", "ListAccountRolesCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type ListAccountRolesCommandInput = ListAccountRolesRequest
  
  trait ListAccountRolesCommandOutput
    extends StObject
       with ListAccountRolesResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object ListAccountRolesCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): ListAccountRolesCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListAccountRolesCommandOutput]
    }
  }
}
