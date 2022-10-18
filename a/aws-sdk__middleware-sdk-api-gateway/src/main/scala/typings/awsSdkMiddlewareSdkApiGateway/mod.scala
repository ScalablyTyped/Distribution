package typings.awsSdkMiddlewareSdkApiGateway

import typings.awsSdkTypes.distTypesMiddlewareMod.BuildHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.BuildMiddleware
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-sdk-api-gateway", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def acceptHeaderMiddleware(): BuildMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("acceptHeaderMiddleware")().asInstanceOf[BuildMiddleware[Any, Any]]
  
  @JSImport("@aws-sdk/middleware-sdk-api-gateway", "acceptHeaderMiddlewareOptions")
  @js.native
  val acceptHeaderMiddlewareOptions: BuildHandlerOptions = js.native
  
  inline def getAcceptHeaderPlugin(unused: Any): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAcceptHeaderPlugin")(unused.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
}
