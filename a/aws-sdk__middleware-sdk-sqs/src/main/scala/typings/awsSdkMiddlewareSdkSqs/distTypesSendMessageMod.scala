package typings.awsSdkMiddlewareSdkSqs

import typings.awsSdkMiddlewareSdkSqs.distTypesConfigurationsMod.PreviouslyResolved
import typings.awsSdkTypes.distTypesMiddlewareMod.InitializeHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.InitializeMiddleware
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSendMessageMod {
  
  @JSImport("@aws-sdk/middleware-sdk-sqs/dist-types/send-message", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSendMessagePlugin(config: PreviouslyResolved): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSendMessagePlugin")(config.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
  
  inline def sendMessageMiddleware(options: PreviouslyResolved): InitializeMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendMessageMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[InitializeMiddleware[Any, Any]]
  
  @JSImport("@aws-sdk/middleware-sdk-sqs/dist-types/send-message", "sendMessageMiddlewareOptions")
  @js.native
  val sendMessageMiddlewareOptions: InitializeHandlerOptions = js.native
}
