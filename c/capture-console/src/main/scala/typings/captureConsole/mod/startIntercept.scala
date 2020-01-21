package typings.captureConsole.mod

import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("capture-console", "startIntercept")
@js.native
object startIntercept extends js.Object {
  def apply(stream: WritableStream, exec: js.Function0[Unit]): Boolean = js.native
  def apply(stream: WritableStream, opts: CaptureOptions, exec: js.Function0[Unit]): Boolean = js.native
}

