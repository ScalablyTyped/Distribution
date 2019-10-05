package typings.captureDashConsole.captureDashConsoleMod

import typings.captureDashConsole.Anon_Stderr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("capture-console", "interceptStdio")
@js.native
object interceptStdio extends js.Object {
  def apply(exec: js.Function0[Unit]): Anon_Stderr = js.native
  def apply(opts: CaptureOptions, exec: js.Function0[Unit]): Anon_Stderr = js.native
}

