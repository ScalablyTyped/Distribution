package typings.awsSdkNodeHttpHandler

import typings.node.httpMod.ClientRequest
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/node-http-handler/dist/cjs/set-socket-timeout", JSImport.Namespace)
@js.native
object setSocketTimeoutMod extends js.Object {
  
  def setSocketTimeout(request: ClientRequest, reject: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def setSocketTimeout(request: ClientRequest, reject: js.Function1[/* err */ Error, Unit], timeoutInMs: Double): Unit = js.native
}
