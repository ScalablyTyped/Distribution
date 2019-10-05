package typings.chrome.chrome.tabCapture

import typings.std.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabCapture.capture")
@js.native
object capture extends js.Object {
  def apply(options: CaptureOptions, callback: js.Function1[/* stream */ MediaStream | Null, Unit]): Unit = js.native
}

