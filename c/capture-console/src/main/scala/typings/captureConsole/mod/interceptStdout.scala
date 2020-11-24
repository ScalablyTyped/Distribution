package typings.captureConsole.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("capture-console", "interceptStdout")
@js.native
object interceptStdout extends js.Object {
  
  def apply(exec: js.Function0[Unit]): String = js.native
  def apply(opts: CaptureOptions, exec: js.Function0[Unit]): String = js.native
}
