package typings.awsSdkClientSso

import typings.awsSdkClientSso.models0Mod.ListAccountRolesRequest
import typings.awsSdkClientSso.models0Mod.ListAccountRolesResponse
import typings.awsSdkClientSso.ssoclientMod.SSOClientResolvedConfig
import typings.awsSdkClientSso.ssoclientMod.ServiceInputTypes
import typings.awsSdkClientSso.ssoclientMod.ServiceOutputTypes
import typings.awsSdkClientSso.ssoclientMod._ServiceOutputTypes
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listAccountRolesCommandMod {
  
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
