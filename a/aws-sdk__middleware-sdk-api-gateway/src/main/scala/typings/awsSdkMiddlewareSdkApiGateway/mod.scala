package typings.awsSdkMiddlewareSdkApiGateway

import typings.awsSdkTypes.middlewareMod.BuildHandlerOptions
import typings.awsSdkTypes.middlewareMod.BuildMiddleware
import typings.awsSdkTypes.middlewareMod.Pluggable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/middleware-sdk-api-gateway", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def acceptHeaderMiddleware(): BuildMiddleware[_, _] = js.native
  
  val acceptHeaderMiddlewareOptions: BuildHandlerOptions = js.native
  
  def getAcceptHeaderPlugin(unused: js.Any): Pluggable[_, _] = js.native
}
