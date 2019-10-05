package typings.captureDashConsole.captureDashConsoleMod

import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("capture-console", "intercept")
@js.native
object intercept extends js.Object {
  def apply(stream: WritableStream, exec: js.Function0[Unit]): js.Array[String] = js.native
  def apply(stream: WritableStream, opts: CaptureOptions, exec: js.Function0[Unit]): js.Array[String] = js.native
}

