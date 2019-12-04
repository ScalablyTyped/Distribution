package typings.atAwsDashSdkNodeDashHttpDashHandler

import typings.node.httpMod.ClientRequest
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/node-http-handler/build/set-socket-timeout", JSImport.Namespace)
@js.native
object buildSetDashSocketDashTimeoutMod extends js.Object {
  def setSocketTimeout(request: ClientRequest, reject: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def setSocketTimeout(request: ClientRequest, reject: js.Function1[/* err */ Error, Unit], timeoutInMs: Double): Unit = js.native
}

