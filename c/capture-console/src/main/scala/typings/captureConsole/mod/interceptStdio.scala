package typings.captureConsole.mod

import typings.captureConsole.AnonStderr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("capture-console", "interceptStdio")
@js.native
object interceptStdio extends js.Object {
  def apply(exec: js.Function0[Unit]): AnonStderr = js.native
  def apply(opts: CaptureOptions, exec: js.Function0[Unit]): AnonStderr = js.native
}

