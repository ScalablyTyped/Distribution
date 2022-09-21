package typings.awsSdkClientSso

import typings.awsSdkClientSso.models0Mod.ListAccountsRequest
import typings.awsSdkClientSso.models0Mod.ListAccountsResponse
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

object listAccountsCommandMod {
  
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
