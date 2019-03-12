package typings
package builderDashUtilDashRuntimeLib.outHttpExecutorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadCallOptions extends js.Object {
  var destination: java.lang.String | scala.Null = js.native
  var options: DownloadOptions = js.native
  var responseHandler: (js.Function2[
    /* response */ nodeLib.httpMod.IncomingMessage, 
    /* callback */ js.Function1[/* error */ stdLib.Error | scala.Null, scala.Unit], 
    scala.Unit
  ]) | scala.Null = js.native
  def callback(): scala.Unit = js.native
  def callback(error: stdLib.Error): scala.Unit = js.native
  def onCancel(callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

