package typings.builderUtilRuntime.httpExecutorMod

import typings.node.httpMod.IncomingMessage
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadCallOptions extends js.Object {
  var destination: String | Null = js.native
  var options: DownloadOptions = js.native
  var responseHandler: (js.Function2[
    /* response */ IncomingMessage, 
    /* callback */ js.Function1[/* error */ Error | Null, Unit], 
    Unit
  ]) | Null = js.native
  def callback(): Unit = js.native
  def callback(error: Error): Unit = js.native
  def onCancel(callback: js.Function0[Unit]): Unit = js.native
}

