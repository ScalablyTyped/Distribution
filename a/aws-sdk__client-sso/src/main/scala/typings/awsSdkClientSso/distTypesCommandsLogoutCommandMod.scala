package typings.awsSdkClientSso

import typings.awsSdkClientSso.distTypesModelsModels0Mod.LogoutRequest
import typings.awsSdkClientSso.distTypesSsoclientMod.SSOClientResolvedConfig
import typings.awsSdkClientSso.distTypesSsoclientMod.ServiceInputTypes
import typings.awsSdkClientSso.distTypesSsoclientMod.ServiceOutputTypes
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommandsLogoutCommandMod {
  
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
