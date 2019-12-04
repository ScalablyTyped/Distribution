package typings.atAwsDashSdkNodeDashHttpDashHandler

import typings.node.httpMod.ClientRequest
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/node-http-handler/build/set-connection-timeout", JSImport.Namespace)
@js.native
object buildSetDashConnectionDashTimeoutMod extends js.Object {
  def setConnectionTimeout(request: ClientRequest, reject: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def setConnectionTimeout(request: ClientRequest, reject: js.Function1[/* err */ Error, Unit], timeoutInMs: Double): Unit = js.native
}

