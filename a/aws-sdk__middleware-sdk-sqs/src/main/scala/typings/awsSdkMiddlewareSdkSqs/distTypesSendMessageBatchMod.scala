package typings.awsSdkMiddlewareSdkSqs

import typings.awsSdkMiddlewareSdkSqs.distTypesConfigurationsMod.PreviouslyResolved
import typings.awsSdkTypes.distTypesMiddlewareMod.InitializeHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.InitializeMiddleware
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSendMessageBatchMod {
  
  @JSImport("@aws-sdk/middleware-sdk-sqs/dist-types/send-message-batch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSendMessageBatchPlugin(config: PreviouslyResolved): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSendMessageBatchPlugin")(config.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
  
  inline def sendMessageBatchMiddleware(options: PreviouslyResolved): InitializeMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendMessageBatchMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[InitializeMiddleware[Any, Any]]
  
  @JSImport("@aws-sdk/middleware-sdk-sqs/dist-types/send-message-batch", "sendMessageBatchMiddlewareOptions")
  @js.native
  val sendMessageBatchMiddlewareOptions: InitializeHandlerOptions = js.native
}
