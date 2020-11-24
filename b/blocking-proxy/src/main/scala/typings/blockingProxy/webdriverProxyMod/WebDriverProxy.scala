package typings.blockingProxy.webdriverProxyMod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("blocking-proxy/built/lib/webdriver_proxy", "WebDriverProxy")
@js.native
class WebDriverProxy protected () extends js.Object {
  def this(seleniumAddress: String) = this()
  
  def addBarrier(barrier: WebDriverBarrier): Unit = js.native
  
  var barriers: js.Array[WebDriverBarrier] = js.native
  
  def handleRequest(originalRequest: IncomingMessage, response: ServerResponse): js.Promise[Unit] = js.native
  
  var seleniumAddress: String = js.native
}
