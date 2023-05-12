package typings.awsSdkMiddlewareSdkSqs

import typings.awsSdkMiddlewareSdkSqs.distTypesConfigurationsMod.PreviouslyResolved
import typings.awsSdkTypes.distTypesMiddlewareMod.InitializeHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.InitializeMiddleware
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesReceiveMessageMod {
  
  @JSImport("@aws-sdk/middleware-sdk-sqs/dist-types/receive-message", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getReceiveMessagePlugin(config: PreviouslyResolved): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getReceiveMessagePlugin")(config.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
  
  inline def receiveMessageMiddleware(options: PreviouslyResolved): InitializeMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("receiveMessageMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[InitializeMiddleware[Any, Any]]
  
  @JSImport("@aws-sdk/middleware-sdk-sqs/dist-types/receive-message", "receiveMessageMiddlewareOptions")
  @js.native
  val receiveMessageMiddlewareOptions: InitializeHandlerOptions = js.native
}
