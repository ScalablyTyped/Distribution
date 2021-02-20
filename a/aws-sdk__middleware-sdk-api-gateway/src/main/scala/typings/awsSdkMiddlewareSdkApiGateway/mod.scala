package typings.awsSdkMiddlewareSdkApiGateway

import typings.awsSdkTypes.middlewareMod.BuildHandlerOptions
import typings.awsSdkTypes.middlewareMod.BuildMiddleware
import typings.awsSdkTypes.middlewareMod.Pluggable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-sdk-api-gateway", "acceptHeaderMiddleware")
  @js.native
  def acceptHeaderMiddleware(): BuildMiddleware[_, _] = js.native
  
  @JSImport("@aws-sdk/middleware-sdk-api-gateway", "acceptHeaderMiddlewareOptions")
  @js.native
  val acceptHeaderMiddlewareOptions: BuildHandlerOptions = js.native
  
  @JSImport("@aws-sdk/middleware-sdk-api-gateway", "getAcceptHeaderPlugin")
  @js.native
  def getAcceptHeaderPlugin(unused: js.Any): Pluggable[_, _] = js.native
}
