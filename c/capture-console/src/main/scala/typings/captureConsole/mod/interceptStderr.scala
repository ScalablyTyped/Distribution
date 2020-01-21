package typings.captureConsole.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("capture-console", "interceptStderr")
@js.native
object interceptStderr extends js.Object {
  def apply(exec: js.Function0[Unit]): String = js.native
  def apply(opts: CaptureOptions, exec: js.Function0[Unit]): String = js.native
}

