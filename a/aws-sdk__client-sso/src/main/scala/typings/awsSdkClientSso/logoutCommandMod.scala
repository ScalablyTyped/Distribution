package typings.awsSdkClientSso

import typings.awsSdkClientSso.models0Mod.LogoutRequest
import typings.awsSdkClientSso.ssoclientMod.SSOClientResolvedConfig
import typings.awsSdkClientSso.ssoclientMod.ServiceInputTypes
import typings.awsSdkClientSso.ssoclientMod.ServiceOutputTypes
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logoutCommandMod {
  
  @JSImport("@aws-sdk/client-sso/dist-types/commands/LogoutCommand", "LogoutCommand")
  @js.native
  open class LogoutCommand protected () extends Command[LogoutCommandInput, LogoutCommandOutput, SSOClientResolvedConfig, Any, Any] {
    def this(input: LogoutCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: SSOClientResolvedConfig
    ): Handler[LogoutCommandInput, LogoutCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: SSOClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[LogoutCommandInput, LogoutCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  
  type LogoutCommandInput = LogoutRequest
  
  type LogoutCommandOutput = MetadataBearer
}
